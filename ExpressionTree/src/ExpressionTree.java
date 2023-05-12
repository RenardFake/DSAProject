package ExpressionTree.src;

import java.util.Scanner;
import java.util.Stack;
class Node{
    char character;
    Node left=null;
    Node right=null;
    public Node(char character){
        this.character=character;
        left=right=null;
    }
   
}

public class ExpressionTree {
    
    String input;
    int decision=0;
    char data;
    String storeinput;
    Node temp,temp1,temp2;
   
    ExpressionTree(String input){
        //contructor need to refactorize this
        this.input=input;
    }

    boolean isOperator(char op){
        if(op=='^'||op=='*'||op=='/'||op=='+'||op=='-' ){
            return true;
        }else
        return false; 
      
    }

    int pemdas(char op){
        if(op=='-'|| op=='+'){
            return 1;
        }
        else if (op=='*'||op=='/'){
            return 2;
        }
        else if (op=='^'){
            return 3;
        }
        return 0;
    }
    void traversal(Node root){
        if(root==null){
            return;
        }
        traversal(root.left);
        System.out.print(root.character);
        traversal(root.right);
    }

   
    Node FixExpression(){
        Stack<Node> st = new Stack<Node>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                st.push(null);
            }
            if(!isOperator(data))
        }
        
       
    }
    void FindLeaf(Node root){
        Scanner newleaf = new Scanner(System.in);
        for(int i=0;i<input.length();i++){
            if(root==null){
                return;
            }
            if(root.left==null&&root.right==null){
                System.out.println("What are the values for "+root.character);
                int newNumber=newleaf.nextInt();
                root.character=(char) newNumber;
            }
        }
        
    }
    /*int changevalue(){
        return;
    }*/
    
    public  void Interface() {
        Scanner s = new Scanner(System.in);
            Node fix = FixExpression();
            System.out.println("Expression Tree has been created");
            traversal(fix);
            System.out.println();
            FindLeaf(fix);
    }
}
