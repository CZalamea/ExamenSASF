package modelos;

import java.time.LocalDate;

public class Prestamo {

    private String codigo;
    private String nombreLector;
    private String codigoLibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionEstimada;
    private LocalDate fechaDevolucionReal;
    private boolean activo;


    public Prestamo(String codigo, String nombreLector, String codigoLibro, LocalDate fechaPrestamo, LocalDate fechaDevolucionEstimada, LocalDate fechaDevolucionReal, boolean activo) {
        this.codigo = codigo;
        this.nombreLector = nombreLector;
        this.codigoLibro = codigoLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
        this.fechaDevolucionReal = fechaDevolucionReal;
        this.activo = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreLector() {
        return nombreLector;
    }

    public void setNombreLector(String nombreLector) {
        this.nombreLector = nombreLector;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public void setFechaDevolucionEstimada(LocalDate fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public LocalDate getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(LocalDate fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
        if(fechaDevolucionReal != null){
            this.activo = false;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void devolver(){
        this.fechaDevolucionReal =  LocalDate.now();
        this.activo = false;
    }



    @Override
    public String toString() {
        return "Prestamo{" +
                "codigo='" + codigo + '\'' +
                ", nombreLector='" + nombreLector + '\'' +
                ", codigoLibro='" + codigoLibro + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucionEstimada=" + fechaDevolucionEstimada +
                ", fechaDevolucionReal=" + fechaDevolucionReal +
                ", activo=" + activo +
                '}';
    }
}
