public class polimorfisme {
    public static void main(String[] args) throws Exception {
        // int output = 'a';
        // output : 97 (ASCII dari 'a')


        // double x = 15.5;
        // int output = x;
        // output error (type double tidak bisa jadi int)

        // int y = 25;
        // double output = y;
        // output : 25.0 (bisa, double mencakup int)

        // int z = 78;
        // char output = (char)z;
        // output : N (ASCII 78 = 'N')

        char a = 'a';
        double output = a;
        // output : 97.0 (ASCII 'a' dalam double)

        System.out.println(output);
    }
}
