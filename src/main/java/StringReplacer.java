import org.testng.annotations.Test;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import static org.testng.AssertJUnit.assertEquals;
import java.lang.StringBuilder;
public class StringReplacer implements StringTransformer{
    char a;
    char b;
    public StringReplacer(char c, char d){
        this.a = c;
        this.b = d;
    }
    public char getA() {return this.a;}
    public char getB() {return this.b;}

    @Override
    public void execute(StringDrink drink) {
        StringBuilder s = new StringBuilder(drink.getText());
        for (int i = 0; i < drink.getText().length(); i++) {
            if (s.charAt(i) == getA()) s.setCharAt(i, getB());
        }
        drink.setText(s.toString());
    }
    @Test
    public void stringReplacer() {
        StringDrink drink = new StringDrink("ABCDABCD");
        StringReplacer sr = new StringReplacer('A', 'X');
        sr.execute(drink);
        assertEquals("XBCDXBCD", drink.getText());
    }
}
