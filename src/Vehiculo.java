public class Vehiculo {

    private String placa;
    private String modelo;

    public void setobtnerNumeroDeMatricula(String placa){
        System.out.println("numero de placa: ");
        this.placa = placa;
    }

    public void setModelo(String modelo){
        System.out.println("modelo: ");
        this.modelo = modelo;
    }
}
