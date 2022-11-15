import java.util.List;

public class StringRecipe{
    List<StringTransformer> a;
    public StringRecipe(List<StringTransformer> transformers){
        a = transformers;
    }
    public List<StringTransformer> getTransformers(){
        return this.a;
    }
    public void mix(StringDrink drink){
        for (StringTransformer t : getTransformers()){
            t.execute(drink);
        }
    }
}
