public class Car {

    // Attributes 
    private String color; // "RED", "YELLOW","BLACK"...

    private double speed;

    private int capacity;

    private boolean isOverSpeed; //false, useless --> should use speed to dervie isOverSpeed()

   
    // Behavior or instance methods
    // Setter 提供工具去攞privite 的object
    public void setColor(String color) {
        this.color = color;
    }
    // Getter 提供工具去return privite 的object
    public String getColor() {
        return this.color;
    }


    public void setSpeed(double speed) {
        this.speed = speed;
        if (speed> 90)
        this.isOverSpeed = true;
    }
    public double getSpeed() {
        return this.speed;
    }


    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity() {
        return this.capacity;
    }  

    

    public boolean isOverSpeed() { //return existing name
        return this.isOverSpeed;
    }

    public String toString(){
        return "Car(" //
            + "color=" + this.color //
            + ", speed=" + this.speed //
            + ", capacity=" + this.capacity //
            + ")";
    }

    public static void main (String[] args) {
        Car c = new Car(); // c -> object reference
        c.setColor("RED");
        c.setSpeed(80.5d);
        c.setCapacity(4);
        System.out.println("Car 1 speed: " + c.getSpeed()); //80.5
        System.out.println("car 1 color: " + c.getColor()); //RED
        System.out.println("Car 1 Cap: " + c.getCapacity());// 5
        Car c2 = new Car(); //c2-> new object reference
        c2.setColor("YELLOW");
        c2.setSpeed(100.00d);
        c2.setCapacity(5);
        System.out.println(c.toString()); // Car(color=RED, speed=80.5, capacity=4)
        


    }

}
