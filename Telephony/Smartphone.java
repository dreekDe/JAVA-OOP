package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{

  private List<String> numbers;
  private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String call() {
        StringBuilder output = new StringBuilder();
        for (String number : numbers) {
           output.append(Validator.checkNumbers(number)).append(System.lineSeparator());
        }

        return output.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder output = new StringBuilder();
        for (String url : urls) {
            output.append(Validator.checkUrls(url)).append(System.lineSeparator());

        }
        return output.toString().trim();
    }
}
