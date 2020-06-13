import java.util.*;

class Main{
    public static void main(String[] rgs){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        case1: for(int i = 0 ; i<26; i++) {

                    for(int j = 0; j<S.length(); j++){
                          if(S.charAt(j)==(char)('a'+i)){
                               System.out.print(j+" ");
                                 continue case1;
                         }
                    }
                System.out.print(-1+" ");
        }
    }
}