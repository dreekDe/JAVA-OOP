package HotelReservation;

import java.util.Scanner;

public class PriceCalculator {
    private double price;
    private int countDays;
    private Season season;
    private Discount discountType;

    private PriceCalculator(double price, int countDays, Season season, Discount discountType) {
        this();
        this.price = price;
        this.countDays = countDays;
        this.season = season;
        this.discountType = discountType;
    }

    public PriceCalculator() {
    }

    public void run(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\s+");
        double currentPrice = Double.parseDouble(split[0]);
        int currentDays = Integer.parseInt(split[1]);
        String currentSeason = split[2];
        String currentDiscount = split[3];

        PriceCalculator priceCalculator = new PriceCalculator(currentPrice, currentDays,
                Season.valueOf(currentSeason), Discount.valueOf(currentDiscount));

        System.out.println(priceCalculator.toString());
    }

    public double totalAmount() {
        return this.price * this.countDays * this.season.getMultiplayer() * (1 - this.discountType.getPercentage() / 100.00);
    }

    @Override
    public String toString() {
        return String.format("%.2f",totalAmount());
    }
}

