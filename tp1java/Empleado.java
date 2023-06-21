package tp1java;
public class Empleado {
	//atributos
    private int legajo;
    private int cantHoras;
    private Double valorHora;
    //constructores
    public Empleado(int legajo, int cantHoras, double valorHora){
        this.legajo = legajo;
        this.cantHoras = cantHoras;
        this.valorHora = valorHora;
    } 
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public double obtenerSueldo() {
        double sueldo=cantHoras*valorHora;
        return(sueldo);
    }

    public String mostrarDatos(){
        return "Numero de legajo: "+legajo+"\n" +  //
                    "sueldo: $"+obtenerSueldo()+"\n";
    }





        

    

}
