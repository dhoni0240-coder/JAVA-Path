public class continue_in {
    public static void main(String[]args){
        for(int i = 1; i <= 10; i++){
            
            if(i == 7){
                continue;
            }
            System.out.println(i);
        }
    }
}

//In #continue , compiler skips that particular iteration and continue with next one.
