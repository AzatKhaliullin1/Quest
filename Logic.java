package com.company;

import java.util.ArrayList;

public class Logic {
        public static ArrayList<String> questions(Player player){
            ArrayList<String>quest = new ArrayList<>();
            if(player instanceof Botan){
               quest.add("Решите уравнение(найти макс. корень, если корней нет, то = 0) - x * x − 8x + 12 = 0");
               quest.add("Решите уравнение(найти макс. корень, если корней нет, то = 0) - x * x − 6x + 9 = 0;");
               quest.add("Решите уравнение(найти макс. корень, если корней нет, то = 0) - 19x * x + 15x - 34 = 0");
            }
            else if(player instanceof NormalPlayer){
               quest.add("Решите уравнение - 2x - 8 = 0");
               quest.add("Решите уравнение - 4x + 16 = 2x - 4");
               quest.add("Решите уравнение - 20 + 4 = 6x");
        }

            else{
                quest.add("Решите пример - 8 * (9 + 7) = ?");
                quest.add("Решите пример - 2*(10 * 5) - 37 = ?");
                quest.add("Решите пример - 3 + (15*3) - 4 * 4 = ?");
            }
            return quest;
        }


        public static ArrayList<Integer> answer(Player player){
            ArrayList<Integer>answ = new ArrayList<>();
            if(player instanceof Botan){
                answ.add(6);
                answ.add(3);
                answ.add(1);
            }
            else if(player instanceof NormalPlayer){
                answ.add(4);
                answ.add(-10);
                answ.add(4);
            }

            else{
                answ.add(128);
                answ.add(63);
                answ.add(32);
            }
            return answ;
        }
}
