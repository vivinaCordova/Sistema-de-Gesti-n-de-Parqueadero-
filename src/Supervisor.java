public class Supervisor extends Empleado {

    private String inspeccion;

    public String realizarInspecion(String inspeccion){
        System.out.println("realizando inspeción");
        return toString();
    }
}
