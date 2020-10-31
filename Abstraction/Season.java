package HotelReservation;

public enum Season {

    Spring(2),
    Summer(4),
    Autumn(1),
    Winter(3);

    private int multiplayer;

    Season(int i) {
        this.multiplayer = i;
    }

    public int getMultiplayer() {
        return this.multiplayer;
    }
}
