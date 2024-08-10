import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("Введите ингридеенты:\n");

        System.out.println("Жабьи глаза: ");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Слезы вурдалака: ");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Кости ворона: ");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Пельмени: ");
        dumplingsCount = new Scanner(System.in).nextInt();
        System.out.println("");


//        System.out.println("1: 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости");
//        System.out.println("2: 2 кости ворона + 4 пельменя - Эликсир стойкости");
//        System.out.println("3: 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности");
//        System.out.println("4: 5 слез вурдалака + 10 пельменей + 4 жабьих глаза" +
//                " + 3 кости ворона - Запретный эликсир");
        //todo дописать логику программы сюда
        int result = 0;

        if(toadEyesCount >= 3 && ravenBonesCount >= 1){
            System.out.println("Вы можете приготовить Элексир зоркости");
            result = result + 1;
        }
        if(dumplingsCount >= 4 && ravenBonesCount >= 2){
            System.out.println("Вы можете приготовить Элексир стойкости");
            result = result + 1;
        }
        if(ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2){
            System.out.println("Вы можете приготовить Элексир скрытности");
            result = result + 1;
        }
        if(ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3){
            System.out.println("Вы можете приготовить Запретный элексир");
            result = result + 1;
        }

        if(result < 0){
            System.out.println("У вас не хватает ингредиентов");
        }
    }
}
