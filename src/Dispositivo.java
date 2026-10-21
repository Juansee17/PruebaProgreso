public class Dispositivo {
    private int identificador;
    private String nombre;
    private boolean activo;
    private static int contadorDispositivos = 0;
    public Dispositivo(int identificador, String nombre){
     boolean esValido = true;
     if(identificador > 0) {
         this.identificador = identificador;
     } else{
         this.identificador = 1;
         esValido = false;
        }
     if (nombre != null && !nombre.trim().isEmpty()){
         this.nombre = nombre;
     } else {
         this.nombre = "Predeterminado";
       esValido = false;
     }
     this.activo = true;
     if(esValido) {
         contadorDispositivos++;
        }
    }
    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public boolean isActivo(){
        return activo;
    }
    public static int getContadorDispositivos() {
        return contadorDispositivos;
    }

    public boolean desactivar() {
        if (this.activo) {
            this.activo = false;
            return false;
        }
        String obtenerResumen() {
            return this.identificador + " | " + this.nombre + "|" + (this.activo ? "Activo" : "Inactivo");
        }
    }
}

