package poo.relacionamentoUmParaMuitosEMuitosParaUm;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TelefonePessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "pessoa", nullable = false)
	@ForeignKey(name = "pessoa_fk")
	private Pessoa pessoa = new Pessoa();
	
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
}

/**
 * Explicação das anotações do atributo  Pessoa pessoa:
 * Essas anotações estão relacionadas ao mapeamento de relacionamentos entre entidades JPA (Java Persistence API). Vamos explicá-las em 
 * detalhes:
 * 
 * 1. `@ManyToOne`: Essa anotação é usada para mapear um relacionamento muitos-para-um entre duas entidades. Ela indica que a entidade 
 *    atual (a que possui a anotação) possui um relacionamento com outra entidade em que várias instâncias da entidade atual podem se 
 *    relacionar com uma única instância da outra entidade.
 *    
 * 2. `@JoinColumn(name = "pessoa", nullable = false)`: Essa anotação é usada para mapear a coluna que representa o relacionamento no 
 *     banco de dados.
 *     
 *     - `name`: Esse atributo especifica o nome da coluna no banco de dados que será usada para representar o relacionamento. No exemplo 
 *               dado, a coluna será chamada "pessoa".
 *               
 *     - `nullable`: Esse atributo especifica se a coluna pode ser nula no banco de dados. No exemplo, está definido como `false`, o que 
 *                   significa que o valor dessa coluna não pode ser nulo.
 * 
 * 3. `@ForeignKey(name = "pessoa_fk")`: Essa anotação é usada para definir o nome da restrição de chave estrangeira (foreign key) no banco 
 *     de dados.
 *     
 *     - `name`: Esse atributo especifica o nome da restrição de chave estrangeira. No exemplo dado, a restrição de chave estrangeira será chamada "pessoa_fk".
 *     
 * Essas anotações em conjunto definem o relacionamento muitos-para-um entre a entidade atual (a que possui a anotação `@ManyToOne`) e a 
 * outra entidade representada pela coluna "pessoa" no banco de dados. O relacionamento indica que várias instâncias da entidade atual 
 * podem estar associadas a uma única instância da outra entidade. A coluna "pessoa" no banco de dados representa essa associação e possui 
 * uma restrição de chave estrangeira chamada "pessoa_fk".
 * 
 * */
 