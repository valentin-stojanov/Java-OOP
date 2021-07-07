package HotelReservation;

public enum Seasons {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplierPerDay;
     private Seasons(int multiplierPerDay){
         this.multiplierPerDay = multiplierPerDay;
     }
     public int getMultiplierPerDay(){
         return this.multiplierPerDay;
     }
}
