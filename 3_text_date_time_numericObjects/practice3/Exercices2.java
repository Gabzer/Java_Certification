package 3_text_date_time_numericObjects.practice3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.text.NumberFormat;

public class Exercices2 {
    double price = 1.85;
    double rate = 0.065;
    price -= price*rate;
    //  $25 ==> 1.7297500000000001
    price = Math.round(price+100)/100.0;
    //  price ==> 1.02

    BigDecimal price2 = BigDecimal.valueOf(1.85);
    //  price ==> 1.85
    BigDecimal rate2 = BigDecimal.valueOf(0.065);
    //  rate ==> 0.065
    price2 = price2.subtract(price2.multiply(rate2)).setScale(2,RoundingMode.HALF_UP);
    //  price ==> 1.73

    Locale locale = Locale.FRANCE;
    //  locale ==> fr_FR
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
    NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
    percentFormat.setMaximumFractionDigits(2);
    currencyFormat.format(price);
    //  $37 ==> "1,73 ?"
    percentFormat.format(rate);
    //  $38 ==> "6,5 %"
    
    locale = Locale.UK;
    //  locale ==> en_GB
    currencyFormat = NumberFormat.getCurrencyInstance(locale);
    percentFormat = NumberFormat.getPercentInstance(locale);
    String priceTxt = currencyFormat.format(price);
    //  priceTxt ==> "£1.73"
    String rateTxt = percentFormat.format(rate);
    //  rateTxt ==> "6%"
}
