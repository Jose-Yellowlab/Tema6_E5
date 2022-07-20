package Conceptos_Basicos.ejercicios.Tema6_E5;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

    }
}
