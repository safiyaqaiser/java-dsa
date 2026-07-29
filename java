 1/ 
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int n=4;
        int index=2;
        for(int i=n;i>index;i--){
            arr[i]=arr[i-1];
            arr[3]=33;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }


        } 

1. largest element

  public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }
        }
        System.out.println(largest);
    }
}

2. sum of elements

  public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
            System.out.println(sum);
        }
    }
3. linear search

  public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int target = 30;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("element found");
                System.out.println(arr[i]);
            }
        }
    }
}
4. string linear search with input 
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String a[]={"aa","bb","cc"};
        Scanner s=new Scanner(System.in);
        System.out.println("enter your string ");
         String target=s.nextLine();

        for(int i=0;i<a.length;i++){
            if(target.equals(a[i]) ){
                System.out.println(i);
                System.out.println("target");
            }

            }

        }

    }





