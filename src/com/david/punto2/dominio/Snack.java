package com.david.punto2.dominio;

public class Snack {
    private String nombre;
    private long codigo;
    private int precio;
    private int unidades;

    public Snack(String nombre, long codigo, int precio, int unidades) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
