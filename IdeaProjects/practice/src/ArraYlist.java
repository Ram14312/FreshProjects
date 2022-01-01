import java.util.ArrayList;

public class ArraYlist {
    public static void main(String[]args){
        ArrayList<Object> al=new ArrayList<Object>();
        al.add("ram");
        al.add("veerappan");
        al.add("ram");
        al.add("ravan");
        al.add("lakshman");
        for(int i=0;i<al.size();i++){
            if (al.lastIndexOf(al.get(i))!=i){
              System.out.println(al.get(i)+"which is duplicated");
            }
        }
    }
}
