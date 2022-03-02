import java.util.*;

public class Test {
    char[] solution(String arg1) {
        String[] arr = arg1.split("");
        LinkedList<String> stringList = new LinkedList() {
        };
        int index = 0;
        for(int i=index ; i< arr.length ; i++){
            for(int j=index+1;j< arr.length;j++){
                if(arr[i].equals(arr[j]) && !stringList.contains(arr[i])){
                    stringList.add(arr[i]);
                    break;
                }
            }
        }
        char[] charArray = new char[stringList.size()];
        for(int i=0;i<charArray.length;i++){
            charArray[i]=stringList.get(i).charAt(0);
        }
        return charArray;
    }
}
