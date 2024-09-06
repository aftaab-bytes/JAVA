class vehicle {
    String brand = null;
    void sound()
    {
        System.out.println("This is the sound in the vehicle class");
    }    
}
class car extends vehicle{
    String brand = "BMW";
    // int sound()// overriding error
    // {
    //     System.out.println("This is the sound of vehicle...");
    // }
}
class bike extends vehicle{
    String brand = "YAMAHA";
    void sound()
    {
        System.out.println("This is the sound of bike");
    }
}

