package exo6;

public class Main {
    public static void main(String[] args) {
        Calculatrice first = new Calculatrice();
        first.setFirstNumber(10);
        first.setSecondNumber(2);
        System.out.println(first.getAdditionResult());
        System.out.println(first.getDivisionResult());
        System.out.println(first.getSubtractionResult());
    }
}
