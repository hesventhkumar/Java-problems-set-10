
//FIND  THE LARGEST NUMBER 

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num,pos1,pos2,pv1,pv2,dig1,dig2;
        num = input.nextInt();
        pos1 = input.nextInt();
        pos2 = input.nextInt();
        pv1 = (int)Math.pow(10,pos1-1);
        pv2 = (int)Math.pow(10,pos2-1);
        dig1 = (num/pv1)%10;
        dig2 = (num/pv2)%10;
        num = num-(dig1*pv1)-(dig2*pv2);
        num = num+(dig1*pv2)+(dig2*pv1);
        System.out.print(num);

    }
}
