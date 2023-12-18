
package com.mycompany.finalquiz;
import java.security.SecureRandom;

public class TreeTest2 {
    public static void main(String[] args) {
        TreeNode<Integer> tree = new TreeNode<Integer>();
        tree.insertNode(5);
        tree.insertNode(2);
        tree.insertNode(6);
        tree.insertNode(3);
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();
    }
}
class TreeNode<T extends Comparable<T>>
{
    private TreeNode<T> root;
    private T data;
    TreeNode<T> leftNode;
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
    public void insertNode(T insertVlaue)
    {
        if(root == null)
            root = new TreeNode<T>(insertVlaue);
        else
            root.insert(insertVlaue);
    }
    public TreeNode()
    {
        root = null;
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
}