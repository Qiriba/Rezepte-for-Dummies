import java.util.ArrayList;
import java.util.List;

public class RecipeBook {
    List<Recipe> recipeList = new ArrayList<>();
    String name;

    public RecipeBook(List<Recipe> recipeList, String name) {
        this.recipeList = recipeList;
        this.name = name;
    }
}
