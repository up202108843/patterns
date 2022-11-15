import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> a;
    public StringTransformerGroup(List<StringTransformer> transformers) {
        a = transformers;
    }
    public List<StringTransformer> getTransformersGroup() {
        return this.a;
    }

    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer t : getTransformersGroup()){
            t.execute(drink);
        }
    }
}
