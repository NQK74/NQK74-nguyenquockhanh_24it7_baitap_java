package Chuong1.Bai7;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date(1,2,2024);
        System.out.println(d);

        d.setDay(9);
        d.setMonth(12);
        d.setYear(2029);
        System.out.println(d);
        System.out.println("Day : " + d.getDay());
        System.out.println("Month : " + d.getMonth());
        System.out.println("Year : " + d.getYear());

        d.setDate(3,4,2016);
        System.out.println(d);

    }
}
