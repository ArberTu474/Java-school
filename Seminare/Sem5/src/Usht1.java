// Ndërtoni metodat e mëposhtme dhe testojini ato:
// a. double average(double x, double y, double z) kthen mësararen e vlerave
// b. boolean allTheSame (double x, double y, double z) kthen true nëse te gjitha vlerat janë të
// njëjta
// c. boolean allDifferent(double x, double y, double z) kthen true nëse të gjitha vlerat janë të
// ndryshme
// d. boolean sorted (double x, double y, double z) kthen true nëse të gjitha vlerat janë të
// renditura duke filluar nga më e vogla.

public class Usht1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Mesatarja e 2, 3, 4 eshte: " + average(2, 3, 4));
        System.out.println("A jane numrat 3,4,5 te njejte: " + allTheSame(3, 4, 5));
        System.out.println("A jane numrat 3,4,5 te renditur: " + sorted(4, 4, 5));
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3.0;
    }

    public static boolean allTheSame(double x, double y, double z) {
        if (x == y && y == z) {
            return true;
        }
        return false;
    }

    public static boolean sorted(double x, double y, double z) {
        if (x < y && y < z) {
            return true;
        }
        return false;
    }
}
