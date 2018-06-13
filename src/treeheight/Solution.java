package treeheight;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.lang.Math;

class Solution {
    public int solution(Tree T) {
        // write your code in Java SE 8
        if (T == null) return -1;
        if (T.l == null && T.r == null) return 0;

        return Math.max(height(T.l), height(T.r));
    }

    public static int height(Tree tree) {
        if (tree == null) {
            return 0;
        } else {
            return 1 + Math.max(height(tree.l), height(tree.r));
        }
    }

    class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }
}