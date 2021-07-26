package com.zongzhang.thinkalgorithm.example;

import com.zongzhang.thinkalgorithm.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @since 1.0
 */
public class Bfs {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResult = new ArrayList<>();
        if (root == null) {
            return allResult;
        }
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);
        ArrayList<Integer> re;
        while (!list.isEmpty()) {
            int size = list.size();
            re = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = list.poll();
                re.add(node.val);
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
            }
            allResult.add(re);
        }

        return allResult;
    }
}
