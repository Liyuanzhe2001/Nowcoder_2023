package com.lyz.code.pat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_1015 {

    static final class Node {
        public String data;
        public String next;

        public Node(String data, String next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data + " " + next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startAdd = sc.next();
        int n = sc.nextInt();
        int rLen = sc.nextInt();
        Map<String, Node> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.next(), new Node(sc.next(), sc.next()));
        }

        String[] s = new String[rLen + 1];
        s[0] = startAdd;
        for (int i = 1; i < rLen + 1; i++) {
            Node node = map.get(startAdd);
            startAdd = node.next;
            s[i] = startAdd;
        }

        startAdd = s[rLen - 1];
        for (int i = rLen - 1; i > 0; i--) {
            map.get(s[i]).next = s[i - 1];
        }

        map.get(s[0]).next = s[rLen];

        for (int i = n; i > 0; i--) {
            Node node = map.get(startAdd);
            System.out.println(startAdd + " " + node.data + " " + node.next);
            if ("-1".equals(node.next)) {
                return;
            }
            startAdd = node.next;
        }


    }

}
