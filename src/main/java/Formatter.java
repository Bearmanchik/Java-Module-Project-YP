public class Formatter {
    int cost;
  /*  Formatter (double formCost){
        cost = formCost;
    }*/
    void format(double formCost){
        cost = (int) formCost;
        cost = cost%10;
        switch (cost){
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