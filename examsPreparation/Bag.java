package exam.christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;


    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Present present) {
        if (this.data.size() < getCapacity()) {
            this.data.add(present);
        }
    }

    public boolean remove(String name) {
        return this.data.removeIf(e -> e.getName().equals(name));
    }

    public Present heaviestPresent() {
        return this.data.stream().max(Comparator.comparingDouble(Present::getWeight)).orElseThrow();
    }


    public Present getPresent(String name) {
        for (Present present : this.data) {
            if (present.getName().equals(name)) {
                return present;
            }
        }
        return null;
    }

    public int count() {
        return this.data.size();
    }

    public String report() {
        StringBuilder output = new StringBuilder();
        output.append(getColor() + " bag contains:").append(System.lineSeparator());
        for (Present present : data) {
            output.append(present.toString()).append(System.lineSeparator());
        }
        return output.toString().trim();
    }
}
