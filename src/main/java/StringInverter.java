import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import java.lang.StringBuilder;
public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder a = new StringBuilder(drink.getText());
        a.reverse();
        drink.setText(a.toString());
    }
    @Test
    public void stringInverter() {
        StringDrink drink = new StringDrink("ABCD");
        StringInverter si = new StringInverter();
        si.execute(drink);
        assertEquals("DCBA", drink.getText());
    }
}
