package org.edutecno.jdbc.model;

import java.time.LocalDate;

public class TareaEliminada {
    private int idTareaEliminada;
    private int tareaEliminadaId;
    private String nombreTareaEliminada;
    private String descripcionTareaEliminada;
    private LocalDate fechaTareaEliminada;
    private String usuarioKiller;
    private String motivoEliminacion;

    public String getUsuarioKiller() {
        return usuarioKiller;
    }

    public void setUsuarioKiller(String usuarioKiller) {
        this.usuarioKiller = usuarioKiller;
    }

    public String getMotivoEliminacion() {
        return motivoEliminacion;
    }

    public void setMotivoEliminacion(String motivoEliminacion) {
        this.motivoEliminacion = motivoEliminacion;
    }

    public TareaEliminada() {
    }

    public int getIdTareaEliminada() {
        return idTareaEliminada;
    }

    public void setIdTareaEliminada(int idTareaEliminada) {
        this.idTareaEliminada = idTareaEliminada;
    }

    public int getTareaEliminadaId() {
        return tareaEliminadaId;
    }

    public void setTareaEliminadaId(int tareaEliminadaId) {
        this.tareaEliminadaId = tareaEliminadaId;
    }

    public String getNombreTareaEliminada() {
        return nombreTareaEliminada;
    }

    public void setNombreTareaEliminada(String nombreTareaEliminada) {
        this.nombreTareaEliminada = nombreTareaEliminada;
    }

    public String getDescripcionTareaEliminada() {
        return descripcionTareaEliminada;
    }

    public void setDescripcionTareaEliminada(String descripcionTareaEliminada) {
        this.descripcionTareaEliminada = descripcionTareaEliminada;
    }

    public LocalDate getFechaTareaEliminada() {
        return fechaTareaEliminada;
    }

    public void setFechaTareaEliminada(LocalDate fechaTareaEliminada) {
        this.fechaTareaEliminada = fechaTareaEliminada;
    }

    @Override
    public String toString() {
        return "TareaEliminada{" +
                "idTareaEliminada=" + idTareaEliminada +
                ", tareaEliminadaId=" + tareaEliminadaId +
                ", nombreTareaEliminada='" + nombreTareaEliminada + '\'' +
                ", descripcionTareaEliminada='" + descripcionTareaEliminada + '\'' +
                ", fechaTareaEliminada=" + fechaTareaEliminada +
                ", usuarioKiller='" + usuarioKiller + '\'' +
                ", motivoEliminacion='" + motivoEliminacion + '\'' +
                '}';
    }
}
