package poo.relacionamentoUmParaMuitosEMuitosParaUm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	// Uma pessoa tem muitos telefones
	@OneToMany(mappedBy = "pessoa", orphanRemoval = true)
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	private List<TelefonePessoa> telefones = new ArrayList<TelefonePessoa>();
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setTelefones(List<TelefonePessoa> telefones) {
		this.telefones = telefones;
	}
	
	public List<TelefonePessoa> getTelefones() {
		return telefones;
	}
}

/**
 * Explicação das anotações do atributo Id:
 * @Id: Essa é uma anotação da especificação JPA que é usada para marcar o atributo de uma classe como sendo a chave primária (primary key) 
 * da entidade. Cada entidade JPA deve ter um atributo marcado com @Id para representar sua chave primária.
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO): Essa anotação é usada em conjunto com @Id para indicar como a chave primária deve ser 
 * gerada automaticamente pelo banco de dados.
 * 
 * strategy: Esse atributo especifica a estratégia de geração da chave primária. No exemplo dado, a estratégia é GenerationType.AUTO, o 
 * que significa que o provedor JPA (como o Hibernate) deve escolher a melhor estratégia de geração de chave primária com base no banco de dados subjacente. Isso permite que o provedor JPA selecione a estratégia apropriada com base no banco de dados que está sendo usado.
 * 
 * As estratégias comuns para GeneratedValue incluem:
 *  -> GenerationType.IDENTITY: Utiliza recursos de autoincremento fornecidos pelo banco de dados (por exemplo, colunas IDENTITY no MySQL 
 *     ou PostgreSQL) para gerar a chave primária.
 *  
 *  -> GenerationType.SEQUENCE: Utiliza sequências de banco de dados (por exemplo, sequências do Oracle) para gerar a chave primária.
 *  
 *  -> GenerationType.TABLE: Utiliza uma tabela especial de chave primária para gerar a chave primária.
 *  
 *  A combinação de @Id com @GeneratedValue permite que o banco de dados gerencie automaticamente a criação de valores exclusivos para a 
 *  chave primária ao persistir novas entidades. Dessa forma, você não precisa se preocupar em gerar manualmente valores para as chaves 
 *  primárias, pois o mecanismo de persistência (por exemplo, o Hibernate) cuidará disso para você.
 * 
 * 
 * Explicação das anotações do atributo List<TelefonePessoa>:
 * 
 * 1. `@OneToMany`: Essa é uma anotação da especificação JPA (Java Persistence API) que é usada para mapear o relacionamento "um-para-
 *    muitos" entre entidades. Nesse caso, ela indica que a classe onde essa anotação está presente possui uma coleção de outra classe 
 *    relacionada.
 *    
 * 2. `mappedBy = "pessoa"`: Essa é uma opção da anotação `@OneToMany` que indica o nome do atributo na classe relacionada que mantém o 
 *     relacionamento com a classe atual. No exemplo dado, o atributo "pessoa" na classe relacionada (provavelmente a classe `Telefone`) 
 *     é o responsável por manter a relação com a classe `Pessoa`. Isso significa que o mapeamento bidirecional entre `Pessoa` e 
 *     `Telefone` é realizado e a classe `Telefone` possui o atributo "pessoa" que referencia a instância da classe `Pessoa`.
 * 
 * 3. `orphanRemoval = true`: Essa é outra opção da anotação `@OneToMany` que indica que, quando uma entidade associada é removida da 
 *     coleção (por exemplo, ao remover um `Telefone` da lista de telefones de uma `Pessoa`), a entidade removida também deve ser excluída 
 *     do banco de dados. Essa opção é útil para garantir que entidades relacionadas sejam tratadas corretamente em operações de exclusão.
 *     
 * 4. `@Cascade(org.hibernate.annotations.CascadeType.ALL)`: Essa anotação é específica do Hibernate (biblioteca de persistência de dados) 
 *     e não faz parte da especificação JPA. Ela é usada para definir o comportamento de cascata de operações em entidades associadas. No 
 *     caso do exemplo dado, a opção `CascadeType.ALL` indica que todas as operações (persistência, remoção, atualização) feitas na 
 *     entidade principal (`Pessoa`) devem ser aplicadas automaticamente nas entidades associadas (`Telefone`). Isso significa que, se 
 *     uma `Pessoa` for excluída, todos os `Telefone` associados também serão excluídos automaticamente.
 *     
 * Em resumo, a anotação `@OneToMany(mappedBy = "pessoa", orphanRemoval = true)` com a opção `@Cascade(org.hibernate.annotations.CascadeType.ALL)` 
 * é usada para mapear um relacionamento "um-para-muitos" entre as classes `Pessoa` e `Telefone`, onde uma `Pessoa` pode ter vários telefones 
 * e, quando uma `Pessoa` é excluída, todos os telefones associados também são excluídos automaticamente.
 * */
