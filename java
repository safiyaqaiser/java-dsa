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
5 ARRAY SECOND LARESGT [use two variable]
 public class Main {
    public static void main(String[] args) {
        int a[]={10,20,30,50};
        int l=a[0];
        int sl=a[0];
        for(int i=1;i<a.length;i++){
        if(l<a[i]){
            sl=l;
            l=a[i];


        }



        }

        System.out.println("second largest"+sl);

    }

    }
6.two pointer 
 public class Main {
    public static void main(String[] args) {
     int a[]={10,20,30,40,50};
     int l=0;
     int r=a.length-1;
     while(l<r) {
         int empty=a[l];
         a[l]=a[r];
         a[r]=empty;
         l++;
         r--;
     }
     for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
     }
     }
    }
7 reversing and finding middle element [if u want divide like find the middle then   int m=a[a.length/2];]
 public class Main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int empty = a[l];
            a[l] = a[r];
            a[r] = empty;
            l++;
            r--;
        }
        int m=a[a.length/2];

            for (int i = 0; i < a.length; i++) {

                System.out.println(a[i]);




        }
        System.out.println(m);
    }
}
8 sum of array 
 public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }}
9.sum and avg
 public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int sum=0;
        int avg=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
             avg=sum/2;
        }
        System.out.println(sum);
        System.out.println(avg);
    }}
10 count even and odd 
 public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4,5};
        int e=0;
        int odd=0;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                e++;
            }
            else{
                odd++;
            }
        }
        System.out.println(e);
        System.out.println(odd);
    }}


























