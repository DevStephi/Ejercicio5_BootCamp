package Clases;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        CocheCRUDImpl bmw = new CocheCRUDImpl("BMW", "Serie 1");
        CocheCRUDImpl audi = new CocheCRUDImpl("Audi", "TT");

        cocheCRUD.save(bmw);
        cocheCRUD.save(audi);
        cocheCRUD.findAll();
//        cocheCRUD.save(new CocheCRUDImpl());
//        cocheCRUD.delete(new CocheCRUDImpl());
        cocheCRUD.delete(audi);

        System.out.println(bmw);
        System.out.println(audi);


    }
}
