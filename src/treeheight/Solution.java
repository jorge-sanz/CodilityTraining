package treeheight;

import java.lang.Math;

class Solution {
    public int solution(Tree T) {
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