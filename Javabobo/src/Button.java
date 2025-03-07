public class Button {
    protected int clickCount;

    public Button() {
        this.clickCount = 0;
    }


    public void Click() {
        clickCount++;
        System.out.println("Количество нажатий: " + clickCount);
    }

    public int getClickCount() {
        return clickCount;
    }

}
