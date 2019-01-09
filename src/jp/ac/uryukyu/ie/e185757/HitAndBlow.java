package jp.ac.uryukyu.ie.e185757;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ４桁の重複しない答えの作成。
 *
 */
public class HitAndBlow {
    public static void main(String[] args) {

            ArrayList<Integer> a = new ArrayList<>();

            for (int i = 0; i <= 9; i++) {
                a.add(i);
            }

            Collections.shuffle(a);

            for (int i = 0; i < 4; i++) {
                System.out.print(a.get(i));
            }

            while(true) {
                System.out.println("　　４桁の数字を当ててください");
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();
                System.out.println(" ");

                /**
                 * ４桁か、０から9の数字を使っているか、重複していないかをチェックする
                 * それぞれの入力エラーに対するコメントを表示する
                 */
                boolean error = false;
                int length = str.length();
                if(length != 4) {
                    error = true;
                }

                for(int i = 0; i < length; i++) {
                    char c = str.charAt(i);
                    if(c < '0' || c > '9') {
                        error =true;
                    }
                }

                for(int i = 0; i < length; i++) {
                    for(int j = i+1; j < length; j++) {
                        if (str.charAt(i) == str.charAt(j)) {
                            error = true;
                        }
                    }
                }

                if(error == true) {
                    System.out.println("入力エラーです");
                    System.out.println("０から９までの数字を４桁、重複しないように入力してください");
                    System.out.println("");
                    continue;
                }


            }
        }

    }