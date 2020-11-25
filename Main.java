public class Main{
    public static void main(String[] args) {
        double balance = 100.2;
        int bonus = 0;
        double replenishment = 1299.55;
        
        if(replenishment>1000){
            bonus = (int)replenishment/100;
        }
        System.out.println(bonus);

    }
}
