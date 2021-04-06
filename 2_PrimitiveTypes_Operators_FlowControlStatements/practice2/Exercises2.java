public class Exercises2 {
    //  /open script1.txt

    //  /list
    char someChar = 'q';
    if (someChar >= 'a' && someChar <= 'z') {
        someChar -= 32;
    } else {
        someChar += 32;
    }

    //  someChar
    //  someChar ==> 'Q'

    // or Ternary
    someChar = (someChar >= 'a' && someChar <= 'z') ? (char)(someChar-32) : (char)(someChar+32);
    //  someChar ==> 'q'



    //  /open script2.txt

    //  /list
    int period = 1;
    float amount = 10;
    float rate = 0.05F;
    switch (period) {
        case 3:
            amount += amount * rate;
        case 2:
            amount += amount * rate;
        case 1:
            amount += amount * rate;
    }
    //  amount
    //  amount ==> 10.5

    //  /open script2.txt

    //  /list
    int period = 3;
    float amount = 10;
    float rate = 0.05F;
    switch (period) {
        case 3:
            amount += amount * rate;
        case 2:
            amount += amount * rate;
        case 1:
            amount += amount * rate;
    }
    //  amount
    //  amount ==> 11.57625
}
