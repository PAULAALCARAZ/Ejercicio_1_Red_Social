
import java.util.ArrayList;
import java.util.Scanner;

public class BenitezPaulaMain {
    
    public static void main (String[] args){
        BenitezPaulaMain programa= new BenitezPaulaMain();
        programa.inicio();

    }

    public void inicio() {

        //listas de favoritos y datos curiosos
        ArrayList<String> hobbies= new ArrayList<>();
        hobbies.add("Fotografía 📸\n");
        hobbies.add("Ver Series 📺\n");
        hobbies.add("Viajar ✈️\n");

        ArrayList<String> food= new ArrayList<>();
        food.add("Pasta 🍝\n");
        food.add("Sushi 🍙\n");
        food.add("Hamburguesa 🍔\n");
        food.add("Pizza 🍕\n");

        ArrayList<String> funFacts= new ArrayList<>();
        funFacts.add("hablo 3 idiomas 💬");
        funFacts.add("Tengo 2 perritos, Mauri y Cistal 🐶");
        funFacts.add("Soy fan de Formula 1 🏎️");

        //Creamos el perfil
        BenitezPaulaPerfil perfil = new BenitezPaulaPerfil("Paula Benitez","\n Hola! soy Paula, me gusta aprender cosas nuevas y estoy siempre buscando nuevos desafios. \n Trabajo como Project Manager en una empresa de Tecnologia.\n" +
                "Me encanta viajar y conocer culturas, personas e historias. ", hobbies,food,funFacts);

        Scanner sc = new Scanner(System.in);
        int opciones;

        // Menú de opciones
        do {
            System.out.println("Menu, AboutMe "+ perfil.getName());
            System.out.println("bienvenido a mi perfil, escoge una opción");
            System.out.println("[1] Story");
            System.out.println("[2] Favorites");
            System.out.println("[3] Fun Facts");
            System.out.println("[4] Salir");

            opciones = sc.nextInt();
            sc.nextLine();

            //lector de opciones
            switch (opciones){

                case 1:
                    System.out.println(perfil.getFormattedStory());
                    break;
                case 2:
                    System.out.println(perfil.getFormattedHobbies());
                    System.out.println(perfil.getFormattedFoods());
                    break;
                case 3:
                    System.out.println(perfil.getFormattedFunFacts());
                    break;
                case 4:
                    System.out.println("Haz elegido salir, hasta pronto ;)");
                    break;
                default:
                    System.out.println("Opción invalida. elije una de estas opciones: ");

            }

        }while (opciones !=4);


    }
}