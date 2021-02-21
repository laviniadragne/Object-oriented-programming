package first;

import java.util.Random;

public class RandomOutTask implements Task{
    public int number;

    public RandomOutTask(){
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }
    @Override
    public void execute() {
        System.out.println(number);
    }
}
