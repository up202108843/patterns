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
}
