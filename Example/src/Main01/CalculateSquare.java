package Main01;

public class CalculateSquare {
    public void square() {
        System.out.println("No parameter Method Called");
    }

    public int square(int width, int height) {
        int area = width * height;
        return area;
    }

    public double square(double width, double height) {
        double area = width * height;
        return area;
    }

    public double square(int width, double height) {
        double area = width * height;
        return area;
    }
}


