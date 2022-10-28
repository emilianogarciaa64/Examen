public class Driver extends Vehicle {

    
    
     private String name;
     private String telephone;
     private String destiny;
     private String ubication;
     
     public Driver(String carName,String name, String telephone,String destiny,String ubication){
        super(carName);
        this.name = name;
        this.telephone = telephone;
        this.destiny = destiny;
        this.ubication = ubication;
     }

     public double calculateDistance(){


        // estos puntos son numeros magicos pero mas o menos es una escala de cu a catedral xd
        int x1=3;
        int x2=7;
        int y1=30;
        int y2=10;

        int x = x2-x1;
        int  y = y2-y1;
        double distanceResult =  Math.sqrt(x*x + y*y);

        return distanceResult;

     }

     public double calculatePrice(){
        double priceMultiplier;

        if (getCarName()=="Motocicleta"){
            priceMultiplier = 0.7;
        }else{
            priceMultiplier = 1.0;
        }

       
        double price = calculateDistance() * priceMultiplier;

        return price;
     }

     

     @Override
	public String toString()
	{
		return "\nTu conductor es: " + this.name + " Vehiculo:" + this.getCarName() + " Ubicacion:" + this.ubication;
	}
}


    



    

