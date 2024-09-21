package problems.LinkedList;


import java.util.List;


//first node position is 1
public class SelfLoop {

    public static boolean checkSelfLoop(List<Integer> nodes,int size,int pos){

        if(pos == 0){
            return false;
        }
        if(pos>size || pos<0){
            return false;
        }
        if(pos<size) return true;
        else{
            return false;
        }
    }
}
