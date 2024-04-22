package com.company;

public class Node {
    private Node left;
    private Node right;
    private int number;

    public Node(int num){
        left = null;
        right = null;
        number = num;
    }

    public Node (Node n, Node n2, int num){
        left = n;
        right = n2;
        number = num;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int n){
        number = n;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public void setLeft(Node n){left = n;}
    public void setRight(Node n){right = n;}
}