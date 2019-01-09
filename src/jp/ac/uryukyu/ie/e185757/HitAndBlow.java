package jp.ac.uryukyu.ie.e185757;

import java.util.ArrayList;
import java.util.Collections;

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

        }
    }