import java.util.Date;

public class Persona {
    public String nombrePersona;
    public String apellidoPersona;
    public String cedulaPersona;
    public int fechaNacimientoPersona;
    public int fechaActual;
    public int edadPersona;
    public int añosDeEdadParaSerMayor = 18;

    public Persona(String nombre, String apellido,String cedula,int fechaActual,int fechaNacimientoPersona) {
        this.nombrePersona = nombre;
        this.apellidoPersona = apellido;
        this.cedulaPersona = cedula;
        this.fechaActual = fechaActual;
        this.fechaNacimientoPersona = fechaNacimientoPersona;
        this.edadPersona = edadPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public int getFechaNacimientoPersona() {
        return fechaNacimientoPersona;
    }

    public void setFechaNacimientoPersona(int fechaNacimientoPersona) {
        this.fechaNacimientoPersona = fechaNacimientoPersona;
    }

    public int getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(int fechaActual) {
        this.fechaActual = fechaActual;
    }

    public int getEdadPersona() {
       this.edadPersona = this.fechaActual - this.fechaNacimientoPersona ;
        return this.edadPersona;
    }

    public String esPersonaMayorDeEdad(){
        if (this.edadPersona >= añosDeEdadParaSerMayor) {
            return "es mayor de edad";
        }else if (this.edadPersona < añosDeEdadParaSerMayor) {
        }
        return "es menor de edad";
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    @Override
    public String toString() {
        return ("Nombre:    "+getNombrePersona()+ "\n" +
                "Apellido:  "+getApellidoPersona()+ "\n" +
                "Cedula:    "+getCedulaPersona()+ "\n" +
                "Edad:      "+getEdadPersona()+" años")+
                "\n"+getNombrePersona()+ " "+getApellidoPersona()+" "
                + esPersonaMayorDeEdad();
    }
}
