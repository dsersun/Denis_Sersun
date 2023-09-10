package homework_nr_3;

public class HomeWork3 {
    public static void main (String[] args) {
        // 1 part
        int day = 9;
        switch (day){
            case 1:
                System.out.println ("Январь");
                break;
            case 2:
                System.out.println ("Февраль");
                break;
            case 3:
                System.out.println ("Март");
                break;
            case 4:
                System.out.println ("Апрель");
                break;
            case 5:
                System.out.println ("Май");
                break;
            case 6:
                System.out.println ("Июнь");
                break;
            case 7:
                System.out.println ("Июль");
                break;
            case 8:
                System.out.println ("Август");
                break;
            case 9:
                System.out.println ("Сентябрь");
                break;
            case 10:
                System.out.println ("Октябрь");
                break;
            case 11:
                System.out.println ("Ноябрь");
                break;
            case 12:
                System.out.println ("Декабрь");
                break;
            default:
                System.out.println ("Число не соответствует номеру месяца!");
        }

        // 2 part
        System.out.println ("Серия кратных 5-ти чисел, от 100 до 1000: ");
        for (int i=100;i<=1000;i++){
            if (i%5==0){
                System.out.print(i+" ");
            }
        }

        // part 3
        System.out.println();
        double result = 0;
        for(int i = 1; i <=97; i+=2){
            result += (double) i/(i+2);
        }
        System.out.println ("Рядом Арифметических Пропорций = " + result);

    }
}
