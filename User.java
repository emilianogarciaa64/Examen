public class User{
    
     private String name;
     private String telephone;
     private String destiny;
     private String ubication;
     
     public User(String name, String telephone,String destiny,String ubication){
        this.name = name;
        this.telephone = telephone;
        this.destiny = destiny;
        this.ubication = ubication;
     }
     


     @Override
     public String toString()
     {
         return "\nHola: " + this.name + " Tu ubicacion es " + this.ubication + " Tu destino es: " + this.destiny;
     }
 }
 
    

