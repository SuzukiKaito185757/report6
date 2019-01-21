package jp.ac.uryukyu.ie.e185757;
import javafx.scene.text.HitInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * ４桁の重複しない答えの作成。
 *
 */
public class HitAndBlow {
    public static void scan() {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            a.add(i);
        }
        Collections.shuffle(a);
        for (int i = 0; i < 4; i++) {
            //System.out.print(a.get(i));
        }

        int count = 1;

        while (true) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            System.out.println(" ");
            /**
             * ４桁か、０から9の数字を使っているか、重複していないかをチェックする
             * それぞれの入力エラーに対するコメントを表示する
             */
            boolean error = false;
            int length = str.length();
            if (length != 4) {
                error = true;
            }
            for (int i = 0; i < length; i++) {
                char c = str.charAt(i);
                if (c < '0' || c > '9') {
                    error = true;
                }
            }
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        error = true;
                    }
                }
            }
            if (error == true) {
                System.out.println("入力エラーです");
                System.out.println("０から９までの数字を４桁、重複しないように入力してください");
                System.out.println("");
                continue;
            }

/**
 * hitとblowの判定をするコード
 *
 */
            int[] user = new int[4];
            for (int i = 0; i < length; i++) {
                user[i] = Integer.parseInt(str.substring(i, (i + 1)));
            }

            int hit = 0;
            for (int i = 0; i < 4; i++) {
                if (user[i] == a.get(i)) {
                    hit++;
                }
            }

            int blow = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (user[i] == a.get(j)) {
                        blow++;
                    }
                }
            }
            if (hit == 4) {
                System.out.println("正解！" + count + "回目で正解！");
                System.out.println(" ");
                break;

            } else {
                System.out.println(hit + "hit," + (blow - hit) + "blow");
                System.out.println(" ");
                count++;
            }
        }
    }
}
