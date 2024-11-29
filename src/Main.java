public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de gestión de Parqueadero");

        Cliente cliente = new Cliente();
        cliente.setNombre("Crithina");
        cliente.setApellido("Martinez");

        Empleado empleado = new Empleado();
        empleado.setNombre("Fernado");
        empleado.setApellido("Ortega");

        System.out.println("Tipo de vehiculo: ");
        ClaseDeVehiculo claseDeVehiculo = ClaseDeVehiculo.AUTOMOVIL;

        System.out.println("Numero de placa");
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setobtnerNumeroDeMatricula("11LAD2");

        System.out.println("Estado: ");
        Espacio espacio = Espacio.RESERVADO;

        Parquedero parquedero = new Parquedero();
        parquedero.setNumeroDePlaza(3);

        Piso piso = new Piso();
        piso.setNumeroDePiso("A12");

        alquilerPorHora alquiler = new alquilerPorHora();
        alquiler.setHoraDeRetiro("10,45");
        alquiler.setTiempoTranscurrido("11.15");
        PagoTotal pagoTotal = new PagoTotal();
        pagoTotal.setMontoTotal("32.5");

        System.out.println("subcripcion ");
        Suscripcion suscripcion = new Suscripcion();
        suscripcion.verificarCuentaDeSuscripcion(true);

        System.out.println("pago con: ");
        MetodoDePago metodoPago = MetodoDePago.TARJETA;

        Factura factura = new Factura();
        factura.setcalcularNumeroDeFactura(203);
    }
}