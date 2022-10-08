package poo.interfaceEheranca;

public interface BancoDeDados extends SqlDCL, SqlDDL, SqlDML{

	void abrirConexao();

	void fecharConexao();

}
