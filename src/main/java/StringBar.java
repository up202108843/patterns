public class StringBar extends Bar{
    boolean a;
    @Override
    public boolean isHappyHour() {
        return a;
    }
    @Override
    public void startHappyHour(){
        a = true;
    }
    @Override
    public void endHappyHour() {
        a = false;
    }
}
