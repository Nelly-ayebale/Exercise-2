public class MassWeightCalculator {
    public static void main(String[] args) {
        float earthWeightAyebale;
        float marsWeightAyebale;
        double marsWeightInDoubleAyebale;
        int marsWeightInIntAyebale;
        char marsWeightInCharacterAyebale;
        int newIntVariable;

        earthWeightAyebale = 65;
        marsWeightAyebale = (earthWeightAyebale * 0.38F);
        System.out.println(earthWeightAyebale + "kgs on earth is" + marsWeightAyebale+ "on Mars");

        marsWeightInDoubleAyebale = marsWeightAyebale;
        System.out.println("This is weight on Mars after converting to double" + marsWeightInDoubleAyebale);

        marsWeightInIntAyebale = (int) marsWeightInDoubleAyebale;
        System.out.println("Kgs in Mars in integer" + marsWeightInIntAyebale);

        marsWeightInCharacterAyebale = (char) marsWeightInIntAyebale;
        System.out.println("Mars weight is equivalent to"+ marsWeightInCharacterAyebale+ "in the ASCII table");

        newIntVariable = marsWeightInCharacterAyebale%2;
        System.out.println("A math operation on a char type variable"+ newIntVariable);


    }
}

