package stringConcepts;

public class Sorting {

    //we can use compareTo() to compare string using uniqueCode
    public static void main(String[] args) {
        String name[] = {"Rajat", "Nitish", "Abhishek","Mahesh"};
        String temp;

        for(int i =0 ; i< name.length; i++){
            int flag =0;
            for (int j=0; j< name.length-1-i;j++){
                if(name[j].compareTo(name[j+1])>0){
                    temp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        for(int i =0;i< name.length;i++ ){
            System.out.print( name[i] + " ");
        }
    }
}
