package Conceptos_Basicos.ejercicios.Tema6_E5;

public class CocheCRUDImpl implements CocheCRUD {


    @Override
    public void save() {
        System.out.println("El Nombre del Método es: Save");
    }

    @Override
    public void findAll() {
        System.out.println("El Nombre del Método es: FindAll");
    }

    @Override
    public void delete() {
        System.out.println("El Nombre del Método es: Delete");
    }

}
