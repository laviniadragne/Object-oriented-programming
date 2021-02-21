package first;

public class CounterOutTask implements Task {
    public static int cnt = 0;

    public CounterOutTask(){
    }

    @Override
    public void execute() {
        cnt++;
        System.out.println(cnt);
    }
}
