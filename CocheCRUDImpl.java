package Clases;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    // Atributos
    String fabricante;
    String modelo;

    // Constructores
    public CocheCRUDImpl(){}

    public  CocheCRUDImpl(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // Métodos

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }


    @Override
    public void save(CocheCRUDImpl coche) {
        System.out.println("Método save");
    }

    @Override
    public List<CocheCRUDImpl> findAll() {
        return null;
    }

    @Override
    public void delete(CocheCRUDImpl coche) {
        System.out.println("Método delete");
    }
}
