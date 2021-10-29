import java.util.Stack;
import java.util.Hashtable;

class Symbol {


    public boolean correct(String s){
        String arr[] = s.split("");
        Stack<String> stack = new Stack();
        Hashtable<String, String> ht = new Hashtable();
        ht.put("]","[");
        ht.put("}","{");
        ht.put(")","(");

        for(int i=0;i<arr.length;i++){
            if (ht.get(arr[i]) == null){
                stack.add(arr[i]);
            }            
            else {
                stack.pop();
            }

        }
        for (String ss: stack){
            System.out.println(ss);
        }
        return stack.size() == 0? true: false;
    }


   public static void main (String args[]){
        Symbol s = new Symbol();
        System.out.println(s.correct("[[]]"));
        System.out.println("hello world");
   }
}







