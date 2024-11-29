public class alquilerPorHora {
    private String horaDeIngreso;
    private String horaDeRetiro;
    private String tiempoTranscurrido;

    public void setHoraDeIngreso(String horaDeIngreso){
        System.out.println("hora de ingreo");
        this.horaDeIngreso = horaDeIngreso;
    }

    public void setHoraDeRetiro(String horaDeRetiro){
        System.out.println("hora de retiro");
        this.horaDeRetiro = horaDeRetiro;
    }

    public void setTiempoTranscurrido(String tiempoTranscurrido){
        System.out.println("tiempo trancurrido");
        this.tiempoTranscurrido = tiempoTranscurrido;
    }
}
