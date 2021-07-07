package HotelReservation;

public enum Seasons {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private int multiplierPerDay;
     private Seasons(int multiplierPerDay){
         this.multiplierPerDay = multiplierPerDay;
     }
     public int getMultiplierPerDay(){
         return this.multiplierPerDay;
     }
}
