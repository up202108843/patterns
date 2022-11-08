import org.testng.annotations.Test;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import static org.testng.AssertJUnit.assertEquals;
import java.lang.Character;
public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder a = new StringBuilder(drink.getText());
        for (int i = 0; i < drink.getText().length(); i++){
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                toUpperCase(a.charAt(i));
            }
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
                toLowerCase(a.charAt(i));
            }
        drink.setText(a.toString());
    }
    @Test
    public void stringCaseChanger() {
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        assertEquals("AbCd", drink.getText());
    }
}
