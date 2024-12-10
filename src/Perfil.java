import java.util.ArrayList;

public class Perfil {

    private String name;
    private String story;
    private ArrayList<String> hobbies;
    private ArrayList<String> foods;
    private ArrayList<String> funFacts;

    public Perfil(String name,String story,ArrayList<String> hobbies,ArrayList<String> foods,ArrayList<String> funFacts){
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    /* Estos metodos sirven para acceder a los atributos:
     nombre, story, hobbies, food, funFacts.
     todos devuelven un String.
     */
    public String getName(){
        return name;
    }

    public String getStory(){
        return story;
    }

    public ArrayList<String>getHobbies(){
        return hobbies;
    }

    public ArrayList<String> getFoods(){
        return foods;
    }
    public ArrayList<String>getFunFacts(){
        return funFacts;
    }

    public String getFormattedStory() {
        return "Mi historia; " + story;
    }
    public String getFormattedHobbies() {
        String result = "Mis hobbies son: \n";
        for (String hobby : hobbies){
            result += hobby;

        }
        return result;
    }

    public String getFormattedFoods(){
        String resultado= ("Mis comidas favoritas son: \n");
        for (String food : foods){
            resultado+= food;
        }
        return resultado;
    }

    public String getFormattedFunFacts(){
        int indice= (int)(Math.random()* funFacts.size());
        return "Un dato curioso: "+funFacts.get(indice);

    }

}
