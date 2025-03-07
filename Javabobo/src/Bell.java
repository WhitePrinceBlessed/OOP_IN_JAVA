public class Bell {
    protected int soundCount;

    public void sound(){
        this.soundCount++;
        if(soundCount % 2 == 0){
            System.out.println("dong");
        } else System.out.println("ding");
    }
}
