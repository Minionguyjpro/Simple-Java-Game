public class Enum { 

    public enum Season{
        SPRING, SUMMER, FALL, WINTER              
    }

    public static Season season = Season.SPRING;  

    public static void main (String args[]){   

       System.out.println(season);

       // Sets the value of season to SUMMER
       season = Season.SUMMER;                   
       System.out.println(season);               

       // Sets the value of season to FALL
       season = Season.FALL;                     
       System.out.println(season);               

       // Sets the value of season to WINTER
       season = Season.WINTER;                   
       System.out.println(season);                           
    }
}
