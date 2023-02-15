public class Formatter {
    int format;
    void format(double formCost){

        format = (int) formCost;
        if (format > 100){
            format = format % 100;
        }
        if (format > 20) {
            format = format % 10;
        }
        switch (format){
            case 1:
                System.out.print("рубль.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print("рубля.");
                break;
            default:
                System.out.print("рублей.");
                break;
        }

    }
}
