import java.util.Scanner;


public class Money {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу заработную плату: ");
        int salary = scanner.nextInt();
        System.out.println("Введите планируемую затрату на транспорт: ");
        int transport = scanner.nextInt();
        if (salary < transport){
            System.out.println("Затраты на транспорт боьлше чем зарплата :(");
            System.exit(0);
        }
        System.out.println("Введите плнаиркемые затраты на еду: ");
        int eat = scanner.nextInt();
        if (salary < transport + eat){
            System.out.println("Затраты на транспорт и еду боьлше чем зарплата :(");
            System.exit(0);
        }
        System.out.println("Введите ссколько вы хотите отлошить денег: ");
        int saving = scanner.nextInt();
        if (salary < transport +eat +saving){
            System.out.println("Затраты на транспорт, еду и сбережения боьлше чем зарплата :(");
            System.exit(0);
        }
        int expensess = transport + eat + saving;
        rescuer(salary, transport, eat, expensess);
    }



    public static void rescuer(int salary, int transport, int eat, int expensess){
        int remainder = salary - expensess;
        if (salary < expensess){
            System.out.println("Уменьшите количество затрат");
        }
        else if (salary/2 < transport){
            System.out.println("Слишком много затрат на транспорт");
        }
        else if (salary/2 < eat){
            System.out.println("Слишкли много трат на еду");
        }
        else if (salary > expensess){
            System.out.println("Остаток средств: " + remainder);
            System.out.println("Mожно отложить");
        }
    }
}



