package com.david.punto2.app;

import com.david.punto2.dominio.MaquinaDispensadora;

public class AppMaquinaDispensadora {
    public static void main(String[] args) {
        MaquinaDispensadora maquinaDispensadora = new MaquinaDispensadora();

        maquinaDispensadora.agregarSnack("Doritos", 1036, 5000);
        maquinaDispensadora.agregarSnack("De Todito", 4525, 5500);
        maquinaDispensadora.agregarSnack("BonYurt", 8232, 3000);
        maquinaDispensadora.agregarSnack("GOL", 6123, 2500);
        maquinaDispensadora.agregarSnack("Pringles", 4012, 12000);
        maquinaDispensadora.agregarSnack("Trocipollo", 1212, 2300);
        maquinaDispensadora.agregarSnack("Prueba", 7777, 40000);
        maquinaDispensadora.agregarSnack("Gansito",8994,2000);
        maquinaDispensadora.agregarSnack("Choclitos",2532, 2500);
        maquinaDispensadora.agregarSnack("Taquis", 8902, 3000);
        maquinaDispensadora.agregarSnack("Rosquillas", 1002, 1000);
        maquinaDispensadora.agregarSnack("Popetas", 1036, 3000);
        maquinaDispensadora.agregarSnack("Submarino", 7512, 1500);
        maquinaDispensadora.agregarSnack("CheeseTris", 1531, 2200);

        maquinaDispensadora.mostrarInventario();

        maquinaDispensadora.ordenarPorPrecio();
        maquinaDispensadora.mostrarInventario();

        maquinaDispensadora.quitarSnack("Rosquillas");
        maquinaDispensadora.agregarSnack("CheeseTris", 1531, 2200);
        maquinaDispensadora.mostrarInventario();
        maquinaDispensadora.aumentarUnidades(8232);
        maquinaDispensadora.aumentarUnidades(8232);
        maquinaDispensadora.aumentarUnidades(8232);
        maquinaDispensadora.aumentarUnidades(8232);
        maquinaDispensadora.aumentarUnidades(8232);
        maquinaDispensadora.aumentarUnidades(8232);
        maquinaDispensadora.aumentarUnidades(8232);
        System.out.println(maquinaDispensadora.cantidadUnidadesSnack("BonYurt"));

        maquinaDispensadora.snacksAgotados().forEach(snack -> {
            System.out.println(snack.getNombre());
        });

        maquinaDispensadora.sacarSnackPorNombre("Doritos");
        maquinaDispensadora.aumentarUnidades("Doritos");
        maquinaDispensadora.aumentarUnidades("Doritos");
        maquinaDispensadora.aumentarUnidades("Doritos");
        maquinaDispensadora.sacarSnackPorCodigo(1036);
        maquinaDispensadora.ordenarPorCantidad();
        maquinaDispensadora.mostrarInventario();
    }
}
