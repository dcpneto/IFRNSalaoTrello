package Java;

public class Agendamento {
private static final long serialVersionUID = 1L;
    
    private String cliente;
    private int mes;
    private int dia;
    private int hora;
    private int valor;
    private String servicos;
    private int valorServico;

    public Agendamento() {
        
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getServicos() {
        return servicos;
    }

    public void setServicos(String servicos) {
        this.servicos = servicos;
    }

    public int getValorServico() {
        return valorServico;
    }

    public void setValorServico(int valorServico) {
        this.valorServico = valorServico;
    }
    
    
    
}
