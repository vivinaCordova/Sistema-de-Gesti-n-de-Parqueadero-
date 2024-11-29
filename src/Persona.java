abstract public class Persona {
        private String nombre;
        private String apellido;
        private String ide;
        public void setNombre(String nombre){
            System.out.println("Nombre ");
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            System.out.println("Apellido");
            this.apellido = apellido;
        }

        public void setIde(String ide){
            System.out.println("Identificación ");
            this.ide = ide;
        }
}
