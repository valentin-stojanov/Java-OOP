package HotelReservation;

public enum DiscountType {
    VIP(0.8),// 20% discount
    SecondVisit(0.9), // 10% discount
    None(1); // 0% discount

    private double percentDiscount;

     DiscountType(double percentDiscount){
         this.percentDiscount = percentDiscount;
     }
     public double getPercentDiscount(){
         return this.percentDiscount;
     }
}
