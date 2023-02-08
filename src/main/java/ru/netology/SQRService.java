package ru.netology;

public class SQRService {
    public int calcSqr(int lowLim, int highLim) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= lowLim & sqr <= highLim) {
                result = result + 1;
            } else if (sqr > highLim) {
                break;
            }
        }
        return result;
    }
}
