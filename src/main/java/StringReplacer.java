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
}
