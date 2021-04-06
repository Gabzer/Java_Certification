package 3_text_date_time_numericObjects.practice3;

import java.util.ResourceBundle;
import java.text.MessageFormat;

import java.util.Locale;

public class Exercices4 {
    Locale locale = Locale.UK;
    ResourceBundle msg = ResourceBundle.getBundle("messages", locale);
    String offerPattern = msg.getString("offer");
    //  offerPattern ==> "{0}, price: {1} (applied {2} discount), valid until {3}"
    MessageFormat.format(offerPattern, teaTxt, priceTxt, rateTxt, timeTxt);
    //  $34 ==> "Tea, price: £1.02 (applied 6% discount), valid until Tue, 6 of Apr 2021 at 22:15 NPT"

    locale = new Locale("ru", "RU");
    //  locale ==> ru_RU
    msg = ResourceBundle.getBundle("messages", locale);
    offerPattern = msg.getString("offer");
    //  offerPattern ==> "{0}, preco: {1} (aplicado {2} desconto), valido ate {3}"
    datePattern = msg.getString("dateFormat");
    //  datePattern ==> "EE', 'd' of 'MMM yyyy' at 'HH:mm z"
    currencyFormat = NumberFormat.getCurrencyInstance(locale);
    percentFormat = NumberFormat.getPercentInstance(locale);
    percentFormat.setMaximumFractionDigits(2);
    dateFormat = DateTimeFormatter.ofPattern(datePattern, locale);
    teaTxt = "Cha";
    priceTxt = currencyFormat.format(price);
    rateTxt = percentFormat.format(rate);
    timeTxt = dateFormat.format(katmanduTime);
    MessageFormat.format(offerPattern,teaTxt,priceTxt,rateTxt,timeTxt);
    //  $47 ==> "Cha, preco: 1,02 ? (aplicado 6,5 % desconto), valido ate ??, 6 of ???. 2021 at 22:15 NPT"
}
