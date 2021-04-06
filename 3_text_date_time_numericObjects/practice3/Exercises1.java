package 3_text_date_time_numericObjects.practice3;

public class Exercises1 {
    String teaTxt = "Tea";
    String b = "Tea";
    teaTxt == b;
    //  $3 ==> true

    String c = new String("Tea");
    teaTxt == c;
    //  $5 ==> false

    c.intern();
    String d = c.intern();
    teaTxt == d;
    //  $8 ==> true -- The string c remains uninterned. When he called the method intern, you're just creating a replica of string c that is interned, an interned copy, which is basically same as the tea.txt and same as string b.

    c = teaTxt+' '+b;
    //  c ==> "Tea Tea"
    c.indexOf('T');
    //  $10 ==> 0
    c.indexOf('T', 1);
    //  $11 ==> 4
    c.lastIndexOf('T');
    //  $12 ==> 4
    c.charAt(c.length()-1);
    //  $13 ==> 'a'
    c.length();
    //  $14 ==> 7
    c.toUpperCase();
    //  $15 ==> "TEA TEA"
    c.substring(c.lastIndexOf('T'), c.lastIndexOf('T')+2);
    //  $16 ==> "Te"
    c = c.toUpperCase();
    //  c ==> "TEA TEA"

    StringBuilder txt = new StringBuilder(c);
    //  txt ==> TEA TEA
    txt.length();
    //  $19 ==> 7
    txt.capacity();
    //  $20 ==> 23
    txt.replace(0, 3, "What is the price of");
    // $21 ==> What is the price of TEA
    txt.capacity();
    //  $22 ==> 48
}
