package com.company.task1;

public class Task1 {
    public static int getTreeHeight(Node node) {
        return getChildsMaxHeight(node, 0);
    }

    private static int getChildsMaxHeight(Node node, int parentHeight) {
        int maxChildHeight = 0;

        if (node.isLeaf()) {
            return parentHeight + 1;
        }

        for (Node child : node.getChilds()) {
            int childHeight = getChildsMaxHeight(child, parentHeight + 1);
            if (childHeight > maxChildHeight) {
                maxChildHeight = childHeight;
            }
        }

        return maxChildHeight;
    }
}
