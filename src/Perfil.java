import java.util.ArrayList;


//clase perfil y sus atributos
public class Perfil {

    private String name;
    private String story;
    private ArrayList<String> hobbies;
    private ArrayList<String> foods;
    private ArrayList<String> funFacts;

    //constructor perfil
    public Perfil(String name,String story,ArrayList<String> hobbies,ArrayList<String> foods,ArrayList<String> funFacts){
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    /* Estos metodos sirven para acceder a los atributos:
     nombre, story, hobbies, food, funFacts.
     en este caso no especifiqué parametros de entrada,
     todos devuelven un String, una cadena de texto.
     */
    public String getName(){
        return name;
    }

    public String getStory(){
        return story;
    }

    //aqui en los favoritos usamos listas
    public ArrayList<String>getHobbies(){
        return hobbies;
    }

    public ArrayList<String> getFoods(){
        return foods;
    }
    public ArrayList<String>getFunFacts(){
        return funFacts;
    }

    /*Este metodo, devuelve la historia introducida, de forma que este correctamente formateada.
    * no tiene especificado parametro de entrada.
    * y devuelve una cadena de texto Story.*/
    public String getFormattedStory() {
        return "Mi historia; " + story;
    }

    /*Este metodo, devuelve los datos almacenados en el array hobbies en formato de lista
     utilizando un contador.
     no tiene parametros de entrada especificados y devuelve un String*/
    public String getFormattedHobbies() {
        String result = "Mis hobbies son: \n";
        for (String hobby : hobbies){
            result += hobby;

        }
        return result;
    }
/*Este metodo al igual que el anterior, devuelve los datos del array Foods en formato de lista, por medio de un contador
* no especifique parametros de entrada al metodo. pero si la salida que es String*/
    public String getFormattedFoods(){
        String resultado= ("Mis comidas favoritas son: \n");
        for (String food : foods){
            resultado+= food;
        }
        return resultado;
    }
/*este metodo sortea y exibe aleatoriamente una de las curiosidades almacenadas en el array FunFacts.
* no tiene parametro de entrada especificado, y la salida es una cadena de texto, String*/
    public String getFormattedFunFacts(){
        int indice= (int)(Math.random()* funFacts.size());
        return "Un dato curioso: "+funFacts.get(indice);

    }

}
