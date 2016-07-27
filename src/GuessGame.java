import java.io.IOException;

/**
 * Created by Yevgeniy on 7/27/2016.
 */
public class GuessGame {
    Players p1;
    Players p2;
    Players p3;

    public void startGame() throws IOException {
        p1 = new Players();
        p2 = new Players();
        p3 = new Players();



        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        boolean game = true;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("Я загадываю число от 0 до 9");

        while (game){
            System.out.println("Число, которое нужно угадать: " +targetNumber);

            int guessp1 =   p1.guess();
            int guessp2 =   p2.guess();
            int guessp3 =   p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);





            if (guessp1 == targetNumber)
                p1isRight = true;

            if (guessp2 == targetNumber)
                p2isRight = true;

            if (guessp3 == targetNumber)
                p3isRight = true;

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);
                System.out.println("Второй игрок угадал? " + p2isRight);
                System.out.println("Третий игрок угадал? " + p3isRight);
                System.out.println("Конец игры.");
                game = false;
            } else {
                System.out.println("Игроки должны попробовать еще раз.");
            }
        }


    }
}
