//this class is an abstract class, we cannot make an object out of it. Later it's going to be extended by another class, which we will make an object out of it.
public abstract class ElectronicDevice
{
    int batteryCapacity, maximumBatteryCapacity, screenPixels;
    float weight;

    //this method is inside an abstract class, but the method itself isn't abstract. The body can be implemented here.
    public void rechargeDevice()
    {
        for (int i = 0; i < maximumBatteryCapacity; i++)
            batteryCapacity++;    
    }

    //this method is abstract. It's going to be implemented by a another class that extends this one.
    public abstract void describeMe();

}

class Laptop extends ElectronicDevice
{
    private String manufacturer;
    private int keyboardKeys;

    public Laptop(String manufacturer)
    {
        this.maximumBatteryCapacity = 5500;     //mAh
        this.batteryCapacity        = 500;      //mAh
        this.weight                 = (float) 1.7;      //kg
        this.screenPixels           = 1920 * 1080;
        this.manufacturer           = manufacturer;
        this.keyboardKeys           = 82;
    }

    //this is where we "override" the method, so we actually implement it here.
    public void describeMe()
    {
        System.out.println("I'm a Laptop. My name is " + this.manufacturer + ". I can hold " + this.maximumBatteryCapacity + " mAhs of battery, I weigh " + this.weight + " kg and my screen has " + this.screenPixels + " pixels.");
    }
}
