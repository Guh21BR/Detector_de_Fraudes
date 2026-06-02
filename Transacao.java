
public class Transacao {
	private String id;
	private Double valor;
	private String status;
	private String CpfCliente;
	
	public Transacao(String id, Double valor, String status, String CpfCliente){
		this.id = id;
		this.valor = valor;
		this.status = "PROCESSANDO"; 
		this.CpfCliente = CpfCliente; 
	}
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public Double getValor() {return valor;}
	public void setValor(Double valor) {this.valor = valor;}
	public String getStatus() {return status;}
	public void setStatus(String status) {this.status = status;}
	public String getCpfCliente() {return CpfCliente;}
	public void setCpfCliente(String CpfCliente) {this.CpfCliente = CpfCliente;}
}
