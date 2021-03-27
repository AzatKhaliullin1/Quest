package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public void start(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int score = 0;

        System.out.println("Выберите уровень персонажа" + "(1) - Отличник, (2) - Ударник, (3) - Двоечник");
        number = scanner.nextInt();
        ArrayList<String> questions;
        ArrayList<Integer> answers;
        switch (number){
            case 1:
                int answ;
                Player player = new Botan(1, 10, "Ivan", 16 );
                questions = Logic.questions(player);
                answers = Logic.answer(player);
                int mistake;
                for(int i = 0; i < 3; i++){
                    System.out.println(questions.get(i));
                    for (mistake = 0;mistake < 2; mistake++){
                System.out.println("Ваш ответ -");
                answ = scanner.nextInt();
                if(answ == answers.get(i)){
                    System.out.println("Правильный ответ\n"+"+1 балл\n");
                    score++;
                    break;
                }
                else{
                    System.out.println("Неправильный ответ\n");
                }
                    }
                }
                System.out.println("Кол-во баллов: "+score);
                break;

            case 2:
                int answ1;
                score = 0;
                Player player1 = new NormalPlayer(2, 7, "Ivan", 16 );
                questions = Logic.questions(player1);
                answers = Logic.answer(player1);
                for(int i = 0; i < 3; i++){
                    System.out.println(questions.get(i));
                    for (mistake = 0;mistake < 3; mistake++) {
                        System.out.println("Ваш ответ -");
                        answ1 = scanner.nextInt();
                        if (answ1 == answers.get(i)) {
                            System.out.println("Правильный ответ\n" + "+1 балл\n");
                            score++;
                            break;
                        }
                        else {
                            System.out.println("Неправильный ответ\n");
                        }
                    }}
                System.out.println("Кол-во баллов: "+score);
                break;

            case 3:
                int answ2;
                Player player2 = new BadPlayer(3, 4, "Ivan", 16 );
                questions = Logic.questions(player2);
                answers = Logic.answer(player2);
                for(int i = 0; i < 3; i++){
                    System.out.println(questions.get(i));
                    for (mistake = 0;mistake < 4; mistake++) {
                System.out.println("Ваш ответ -");
                answ2 = scanner.nextInt();
                if(answ2 == answers.get(i)){
                    System.out.println("Правильный ответ\n"+"+1 балл\n");
                    score++;
                    break;
                }
                else{
                    System.out.println("Неправильный ответ\n");
                }
                    }
                }
                System.out.println("Кол-во баллов: "+score);
                break;


        }
    }
}
