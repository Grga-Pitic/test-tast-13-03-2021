package com.company.task1;

import java.util.LinkedList;
import java.util.List;

public class Node {

    private List<Node> childs;

    public Node() {
        childs = new LinkedList<Node>();
    }

    public Node addChild(Node childNode) {
        childs.add(childNode);
        return childNode;
    }

    public boolean isLeaf() {
        return childs.isEmpty();
    }

    public List<Node> getChilds() {
        return childs;
    }
}
