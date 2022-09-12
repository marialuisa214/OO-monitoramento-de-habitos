package classesBase;

public abstract class Habito {
//ATRIBUTOS
    protected String nome;
    protected AreaDaVida areaRelacionada;
    public Turnos turno; 
    protected boolean status;
                
//METODOS
    public String getNome() {
        return nome;}
    public void setNome(String nome) {
        this.nome = nome;}
			
    public Turnos getTurno(){
        return turno;}
    public void setDefinindoTurno(Turnos turno) {
        this.turno = turno;}
		
    public boolean getStatus() {
        return status;}
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public AreaDaVida getAreaRelacionada() {
        return areaRelacionada;}
    public void setAreaRelacionada(AreaDaVida areaRelacionada) {
        this.areaRelacionada = areaRelacionada;}
}
