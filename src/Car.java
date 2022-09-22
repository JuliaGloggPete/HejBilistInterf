public class Car implements Vehicle{

    int minAge;
    boolean hasDriver;
    int milesToGo;
    Driver driver;

    public Car() {
        minAge = 18;
        hasDriver = false;
        milesToGo = 100;
    }

    public void setDriver(Driver driver) {
        if(driver.getAge() <= minAge)
        { System.out.println("Driver not changed, "+driver.getName()+" is " +driver.getAge() +
                " you must be "+minAge+" or older to Drive a car");;
            this.driver = driver;
        } else {
            System.out.println("Driver changed to "+driver.getName());
            this.hasDriver =true;

        }
    }
    public void drive(){
        if (hasDriver != true){ System.out.println("Tank didn't drive, it has no driver");

        } else {

            int milesToDeduct= 5;
            this.milesToGo=milesToGo-milesToDeduct;


            System.out.println("Car drove " + milesToDeduct+ " miles - "+milesToGo+ " miles to go");}
    }
}
