import java.lang.StringBuilder;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder a = new StringBuilder(drink.getText());
        for (int i = 0; i < drink.getText().length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') a.setCharAt(i,toLowerCase(a.charAt(i)));
            else a.setCharAt(i,toUpperCase(a.charAt(i)));
        }
        drink.setText(a.toString());
    }
}

