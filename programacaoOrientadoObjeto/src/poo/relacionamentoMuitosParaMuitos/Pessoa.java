package poo.relacionamentoMuitosParaMuitos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	// Vale destacar que a Pessoa é o lado dominante.
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "pessoa_projeto", 
	joinColumns = {@JoinColumn(name="pessoa_id")},
	inverseJoinColumns = {@JoinColumn(name="projeto_id")})
	private List<Projeto> projetos = new ArrayList<Projeto>();
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
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
 * Explicação das anotações do atributo List<Projeto> projetos:
 * 
 *Essas anotações estão relacionadas ao mapeamento de um relacionamento muitos-para-muitos entre duas entidades JPA (Java Persistence API). 
 * Vamos explicar cada uma delas em detalhes:
 * 
 * 1. `@ManyToMany(cascade = CascadeType.ALL)`: Essa anotação é usada para mapear um relacionamento muitos-para-muitos entre duas entidades. 
 *     Ela indica que a entidade atual (a que possui a anotação) possui um relacionamento com outra entidade em que várias instâncias da 
 *     entidade atual podem se relacionar com várias instâncias da outra entidade.
 *     
 *     - `cascade = CascadeType.ALL`: Esse atributo especifica o tipo de cascata a ser aplicada nas operações de persistência (como 
 *        salvar, atualizar e excluir). No exemplo, foi definido como `CascadeType.ALL`, o que significa que as operações de persistência 
 *        realizadas na entidade "Pessoa" serão propagadas para a entidade "Projeto". Por exemplo, se uma nova "Pessoa" for salva, os 
 *        "Projetos" associados a ela também serão salvos.
 *        
 * 2. `@JoinTable(name = "pessoa_projeto", joinColumns = {@JoinColumn(name="pessoa_id")}, inverseJoinColumns = {@JoinColumn(name="projeto_id")})`: 
 *     Essa anotação é usada para mapear a tabela de junção que representa o relacionamento muitos-para-muitos entre as duas entidades.
 * 
 *    - `name`: Esse atributo especifica o nome da tabela de junção no banco de dados. No exemplo dado, a tabela será chamada "pessoa_projeto".
 * 
 *    - `joinColumns`: Esse atributo especifica as colunas da tabela de junção que referenciam a entidade atual ("Pessoa"). No exemplo, a 
 *       coluna que representa a "Pessoa" é chamada "pessoa_id".
 *    
 *    - `inverseJoinColumns`: Esse atributo especifica as colunas da tabela de junção que referenciam a outra entidade ("Projeto"). No 
 *       exemplo, a coluna que representa o "Projeto" é chamada "projeto_id".
 *       
 * Dessa forma, o relacionamento muitos-para-muitos entre a entidade "Pessoa" e "Projeto" é mapeado através da tabela de junção 
 * "pessoa_projeto", que contém as chaves estrangeiras para as duas entidades. A anotação `@ManyToMany` na lista de "projetos" na 
 * entidade "Pessoa" indica que uma pessoa pode estar associada a vários projetos, e um projeto também pode estar associado a várias 
 * pessoas. As operações de persistência realizadas em "Pessoa" serão propagadas para "Projeto" devido ao `CascadeType.ALL`, tornando o 
 * mapeamento bidirecional e sincronizado entre as duas entidades.
 * 
 * */
