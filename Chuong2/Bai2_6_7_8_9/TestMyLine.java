package Chuong2.Bai2_6_7_8_9;

public class TestMyLine {
    public static void main(String[] args) {

        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 4);
        MyLine line1 = new MyLine(begin, end);
        System.out.println(line1);


        MyLine line2 = new MyLine(2, 3, 4, 5);
        System.out.println(line2);


        System.out.println("Begin point: " + line1.getBegin());
        System.out.println("End point: " + line1.getEnd());

        line1.setBeginX(5);
        line1.setBeginY(6);
        line1.setEndX(7);
        line1.setEndY(8);
        System.out.println("After changing points: " + line1);


        System.out.println("Length of line1: " + line1.getLength());


        System.out.println("Gradient of line1: " + line1.getGradient());


        int[] beginCoords = line1.getBeginXY();
        int[] endCoords = line1.getEndXY();
        System.out.println("Begin coordinates: (" + beginCoords[0] + "," + beginCoords[1] + ")");
        System.out.println("End coordinates: (" + endCoords[0] + "," + endCoords[1] + ")");


        line1.setBeginXY(9, 10);
        line1.setEndXY(11, 12);
        System.out.println("After setting coordinates: " + line1);
    }
}
