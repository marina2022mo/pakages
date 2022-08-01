package ru.netology.sqr;

public class CalcService {
    public int calcSqrNumber(int up, int dn) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= up && i * i <= dn) {
                count++;
            }
        }
        return count;
    }
}




