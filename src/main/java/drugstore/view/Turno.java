package drugstore.view;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Turno {

    private String empleado;
    private LocalDateTime apertura; 
    private LocalDateTime cierre;
    private BigDecimal sistema;

    public Turno(String empleado, LocalDateTime apertura) { //Constructor para la apertura del turno
        this.empleado = empleado;
        this.apertura = apertura;
    }

    public String getNombre() {
        return empleado;
    }

    public LocalDateTime getApertura() {
        return apertura;
    }

    public LocalDateTime getCierre() {
        return cierre;
    }

    public BigDecimal getSistema() {
        return sistema;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public void setApertura(LocalDateTime apertura) {
        this.apertura = apertura;
    }

    public void setCierre(LocalDateTime cierre) {
        this.cierre = cierre;
    }

    public void setSistema(BigDecimal sistema) {
        this.sistema = sistema;
    }

    

}
