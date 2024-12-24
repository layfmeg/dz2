public class Main {
    public static void main(String[] args) {
        double radius1 = 1.0;
        double radius2 = 0.5;
        double radius3 = 0.2;
        double density = 0.7;

        double volume1 = (4.0 / 3.0) * Math.PI * Math.pow(radius1, 3);
        double volume2 = (4.0 / 3.0) * Math.PI * Math.pow(radius2, 3);
        double volume3 = (4.0 / 3.0) * Math.PI * Math.pow(radius3, 3);

        double totalVolume = volume1 + volume2 + volume3;

        double weight = totalVolume * density;

        System.out.printf("Вес снеговика: %.2f кг%n", weight);
    }
}
