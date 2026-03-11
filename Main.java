public class Main {
    public static void main(String[] args) {
        Animals rabbit = new Animals("Кролик", 1);
        Animals turtle = new Animals("Черепаха", 5);

        rabbit.start();
        turtle.start();
    }
}
class Animals extends Thread {
    private String name;
    private int priority;
    private int distance;

    public Animals(String name, int priority){
        this.name = name;
        this.priority = priority;
    }
    public void run() {
        while (distance < 50){
            distance += 10;
            System.out.println(name + " пробежал " + distance + " метров ");
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " прибежал ");
    }
}