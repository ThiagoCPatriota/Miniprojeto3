import java.util.Random;
public class Dados {
    Random random = new Random();
    public int d20(){
        return random.nextInt(20);
    }
}
