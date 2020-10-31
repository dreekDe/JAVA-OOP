package HotelReservation;

public enum Discount {

    VIP(20),
    SecondVisit(10),
    None(0);

    private int percentage;

    Discount(int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }

}
