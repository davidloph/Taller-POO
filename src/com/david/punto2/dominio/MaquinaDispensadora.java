package com.david.punto2.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaquinaDispensadora {
    public static final int CAPACIDAD = 12;
    private List<Snack> dispensadora;

    public MaquinaDispensadora() {this.dispensadora = new ArrayList<>();
    }

    public void agregarSnack(String nombre, long codigo, int precio){
        Snack snack = new Snack(nombre, codigo, precio, 0);

        if (this.dispensadora.size() < CAPACIDAD ){
            if (this.buscarSnack(nombre) == null){
                if (this.buscarSnack(codigo) == null) {
                    this.dispensadora.add(snack);
                }else{
                    System.out.println("El código " + codigo + " está asignado a otro producto.");
                }
            }else {
                System.out.println("La máquina dispensadora ya cuenta con: " + nombre);
            }
        }else {
            System.out.println("La máquina dispensadora ya está llena.");
        }
    }

    public void sacarSnackPorCodigo(long codigo){
        Snack snackBuscado = buscarSnack(codigo);
        if (snackBuscado.getUnidades() == 0){
            System.out.println("Las unidades de " + snackBuscado.getNombre() + " están agotadas.");
        }else if (snackBuscado == null) {
            System.out.println("El producto con código " + codigo + " no existe en la máquina dispensadora.");
        }else {
            snackBuscado.setUnidades(snackBuscado.getUnidades()-1);
        }
    }

    public void sacarSnackPorNombre(String nombre){
        Snack snackBuscado = buscarSnack(nombre);
        if (snackBuscado.getUnidades() == 0){
            System.out.println("Las unidades de " + snackBuscado.getNombre() + " están agotadas.");
        } else if (snackBuscado == null){
            System.out.println("El producto " + nombre + " no existe en la máquina dispensadora.");

        } else {
            snackBuscado.setUnidades(snackBuscado.getUnidades()-1);
        }
    }


    public void aumentarUnidades(String nombre){
        Snack snackBuscado = buscarSnack(nombre);
        if (snackBuscado.getUnidades() == 6){
            System.out.println("Las unidades de " + snackBuscado.getNombre() + " están completas.");
        } else if (snackBuscado == null){
            System.out.println("El producto " + nombre + " no existe en la máquina dispensadora.");

        } else {
            snackBuscado.setUnidades(snackBuscado.getUnidades()+1);
        }

    }

    public void aumentarUnidades(long codigo){
        Snack snackBuscado = buscarSnack(codigo);
        if (snackBuscado.getUnidades() == 6){
            System.out.println("Las unidades de " + snackBuscado.getNombre() + " están completas.");
        } else if (snackBuscado == null) {
            System.out.println("El producto con código " + codigo + " no existe en la máquina dispensadora.");
        } else {
            snackBuscado.setUnidades(snackBuscado.getUnidades()+1);
        }

    }

    public void quitarSnack(String nombre){
//        Snack snackBuscado = buscarSnack(nombre);
 //       this.dispensadora.remove(snackBuscado);
        this.dispensadora.removeIf( snack -> snack.getNombre() == nombre);

    }

    public int cantidadUnidadesSnack(String nombre){
        Snack snackBuscado = buscarSnack(nombre);
        if (snackBuscado == null){
            System.out.println("El producto " + nombre + " no existe en la máquina dispensadora.");
        }
        return snackBuscado.getUnidades();

    }

    public List<Snack> snacksAgotados(){
        List<Snack> snackAgotado = new ArrayList<>();
        for (Snack snack : this.dispensadora){
            if (snack.getUnidades() == 0){
                snackAgotado.add(snack);
            }
        }
        return snackAgotado;

    }

    public List<Snack> mostrarInventario(){
        for (Snack snack : dispensadora){
            System.out.println("+-------- Snack --------+");
            System.out.println("Nombre : " + snack.getNombre());
            System.out.println("Código: " + snack.getCodigo());
            System.out.println("Precio: " + snack.getPrecio());
            System.out.println("Unidades: " + snack.getUnidades());
            System.out.println("+-----------------------+");
        }
        return null;

    }

    public List<Snack> ordenarPorPrecio(){
        Collections.sort(dispensadora, Comparator.comparing(Snack::getPrecio).reversed());

        return dispensadora;
    }

    public List<Snack> ordenarPorCantidad(){
        Collections.sort(dispensadora, Comparator.comparing((Snack::getUnidades)));
        return dispensadora;
    }

    public Snack buscarSnack(String nombre) {
        Snack snackBuscado = null;
        for (Snack snack : this.dispensadora) {
            if (snack.getNombre().equalsIgnoreCase(nombre)) {
                snackBuscado = snack;
            }

        }
        return snackBuscado;
    }

    public Snack buscarSnack(long codigo) {
        Snack snackBuscado = null;
            for (Snack snack: this.dispensadora){
                if (snack.getCodigo() == codigo){
                    snackBuscado = snack;
                }
            }
            return snackBuscado;
        }

}
