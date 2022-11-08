import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
public class StringDrink {
    String text_;
    public StringDrink(){
        text_ = "";
    }
    public StringDrink(String text){
        text_ = text;
    }
    public String getText(){
        return text_;
    }
    public void setText(String text){
        text_ = text;
    }
    @Test
    public void stringDrink() {
        StringDrink drink = new StringDrink("ABCD");
        assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        assertEquals("DCBA", drink.getText());
    }
}
