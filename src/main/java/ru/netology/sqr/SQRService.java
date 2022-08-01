package ru.netology.sqr;

public class SQRService {
    public int calcSqrNumber;

    public static void main(String[] args) {
        int dn = 200;
        int up = 300;
        CalcService service = new CalcService();
        int count = service.calcSqrNumber (up,dn);
        System.out.println (count) ;

    }
}
