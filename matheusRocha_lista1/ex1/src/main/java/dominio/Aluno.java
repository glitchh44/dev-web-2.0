package dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class cliente extends Pessoa {
		
	private int Codcliente;
	
	public cliente() {
		this("",0,0);
	}
	
	public cliente(String nome, int idade, int codCliente) {
		super(nome,idade);
		setcodCliente(CodCliente);
	}
	
	public int getCodCliente() {
		return this.matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	
	@Override
	public String toString() {
		return "Aluno [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + ", CodigoCliente= "
		+ getCodCliente() + "]";
	}
	
	public void imprimeDados() {
		System.out.println("Nome: "+ super.getNome());
		System.out.println("idade: "+ super.getCpf());
		System.out.println("CodCliente: "+ getCodCliente());
	}
}