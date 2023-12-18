package com.mycompany.finalquiz;

class TreeNode<T extends Comparable<T>>
{
    TreeNode<T> leftNode;
    T data;
    TreeNode<T> rightNode;
    public TreeNode(T nodeData)
    {
        data=nodeData;
        leftNode = rightNode = null;
    }
    public void insert(T insertVlaue)
    {
        if(insertVlaue.compareTo(data)<0)
        {
            if(leftNode == null)
                leftNode = new TreeNode<T>(insertVlaue);
            else
                leftNode.insert(insertVlaue);
        }
        else if(insertVlaue.compareTo(data)>0)
        {
            if(rightNode ==null)
                rightNode = new TreeNode<T>(insertVlaue);
            else
                rightNode.insert(insertVlaue);
        }
    }
}
public class Tree<T extends Comparable<T>> 
{
    private TreeNode<T> root;
    public Tree()
    {
        root = null;
    }
    public void insertNode(T insertVlaue)
    {
        if(root == null)
            root = new TreeNode<T>(insertVlaue);
        else
            root.insert(insertVlaue);
    }
    public void preorderTraversal()
    {
        preorderHelper(root);
    }
    public void preorderHelper(TreeNode<T> node)
    {
        if(node == null)
            return;
        
        System.out.printf("%s",node.data);
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }
    public void inorderTraversal()
    {
        inorderHelper(root);
    }
    public void inorderHelper(TreeNode<T> node)
    {
        if(node == null)
            return;
        
        inorderHelper(node.leftNode);
        System.out.printf("%s",node.data);
        inorderHelper(node.rightNode);
    }
    public void postorderTraversal()
    {
        postorderHelper(root);
    }
    public void postorderHelper(TreeNode<T> node)
    {
        if(node == null)
            return;
        
        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.printf("%s",node.data);
    }
}
