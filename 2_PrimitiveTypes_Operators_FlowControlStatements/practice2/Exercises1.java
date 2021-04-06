public class Exercises1 {
    byte x = 2, y = 3, z = 5;
    
    z = x+y;
    //  Error:
    //  incompatible types: possible lossy conversion from int to byte
    //  z = x+y
    //      ^-^

    z = (byte)(x+y);
    //  z ==> 5

    float a = (float)x/y;
    //  a ==> 0.6666667
    float a = x/(float)y;
    //  a ==> 0.6666667

    float a = (float)(x/y);
    //  a ==> 0.0

    double b = (double)x/y;
    //  b ==> 0.6666666666666666

    b = a;
    //  b ==> 0.6666666865348816  -> Now, what the b is, see, there's a very strange kind of rounding thing happening here because what's going on is that you've taken 32-bit number and you're just shoveling it into the 64-bit capacity storage. So anything that goes beyond the 32-bit correct precision after the end of the valley 32-bit number becomes anybody's guess because you're kind of expanding the type to fit 64 bits. So you are getting really strange rounding effect.

    float c = Math.round(b*1000)/1000F;
    //  c ==> 0.667

    char a1 = 'a', a2 = '\141', a3 = '\u0061';
    //  a1 ==> 'a'
    //  a3 ==> 'a' -> ASCII
    //  a2 ==> 'a' -> unicode

    int i = a1;
    //  i ==> 97

    Integer.toOctalString(i);
    //  $13 ==> "141"

    Integer.toHexString(i);
    //  $14 ==> "61"

    int i1 = 0141, i2 = 0x61;
    //  i1 ==> 97
    //  i2 ==> 97

    char a4 = (char)i1;
    //  a4 ==> 'a'

    char someChar = 'k';
    boolean isEven = (someChar%2 == 0);
    //  isEven ==> false

    someChar = 'k';
    char nextChar = (char) (someChar+1);
    //  nextChar ==> 'l'

    (char)(z+1);
    //  $22 ==> '\006'
    char some = (char)(z+1);
    //  some ==> '\006'

    char upperA = 'A', lowerA = 'a';
    //  upperA ==> 'A'
    //  lowerA ==> 'a'

    int distance = lowerA-upperA;
    //  distance ==> 32
    
    someChar = 'h';
    //  someChar ==> 'h'
    char upperSomeChar = (char)(someChar-32);
    //  upperSomeChar ==> 'H'
}