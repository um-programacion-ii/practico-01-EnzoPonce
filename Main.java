import entity.Ingrediente;
public class Main {
    public static void main(String[] args){
        Ingrediente carne = new Ingrediente("carme", 5);
        Ingrediente cebolla = new Ingrediente("cebolla", 8);

        System.out.println("Ingredientes: ");
        System.out.println(carne);
        System.out.println(cebolla);
    }


}