public class Vehicle{
    public String name;
    public String model;
    public int noOfTyres;

    Vehicle() {
        this.model = "";
        this.name = "";
        this.noOfTyres = -1;
    }
    Vehicle(String name , String model , int noOfTyres) {
        this.model = model;
        this.name = name;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.printf("Engine is Started of %s : %s \n" , name , model);
    }
    void stopEngine(){
        System.out.printf("Engine is Stopped of %s : %s \n" , name , model);
    }
}

class Car extends  Vehicle{
    public int noOfDoors;
    public String transmissionType;

    public void startAC(){
        System.out.println("AC Started ");
    }

    Car(String name , String model , String transmissionType, int noOfTyres , int noOfDoors){
        super(name , model , noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType =  transmissionType;
        // super.startEngine();
        // super.stopEngine();
    }
}

class MotorCycle extends Vehicle{
     public String handleBarStyle;
     public String SuspenionType;

    MotorCycle(String name , String model , int noOfTyres , String handleBarStyle , String SuspensionType) {
        super(name , model , noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.SuspenionType =  SuspensionType;
    }
     
    void Wheelie(){
        System.out.printf("MotorCycle : %s doing Wheelie ", name);
    }
     

    public static void main(String[] args) {
        Car c = new Car("Maruti" , "800" , "SelfStart",4 , 4);
        c.startEngine();
        c.startAC();
        c.stopEngine();

        MotorCycle splendor = new MotorCycle("Splendor" , "Xline" , 2 , "U" , "Soft");
        splendor.startEngine();
        splendor.stopEngine();
        splendor.Wheelie();
    }

}

