import java.util.ArrayList;
import java.util.List;

public class Recipe {
    String name;
    List<Ingredient> ingredients = new ArrayList<>();
    String difficulty;
    String httpPictureLink;
    CategoryType categoryType;

    public Recipe(String name, List<Ingredient> ingredients, String difficulty, String httpPictureLink, CategoryType categoryType) {
        this.name = name;
        this.ingredients = ingredients;
        this.difficulty = difficulty;
        this.httpPictureLink = httpPictureLink;
        this.categoryType = categoryType;
    }

}
