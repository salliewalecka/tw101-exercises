package com.thoughtworks.tw101.exercises.exercise9;

import java.util.LinkedList;
import java.util.List;

public class Node{

    private String name=null;
    private Node left=null;
    private Node right=null;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode){
        if(nameOfNewNode.compareTo(name)<=0){
            if(left==null){
                left=new Node(nameOfNewNode);
            }
            else{
                left.add(nameOfNewNode);
            }
        }
        else{
            if(right==null){
                right=new Node(nameOfNewNode);
            }
            else{
                right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names(){
        LinkedList<String> names = new LinkedList<>();
        if(name !=null) {
            if(left != null){names.addAll(left.names());}
            names.add(name);
            if(right != null){names.addAll(right.names());}
        }
        return names;
    }

}
