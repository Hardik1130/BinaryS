import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the key to find:");
        int key = in.nextInt();
        int  l = 0;
        int h = arr.length-1;
        int mid = (l+h)/2;
        while (l<=h)
        {
            if (key==arr[mid]) {
                System.out.println("Element found at position:"+(mid+1));
                break;
            } else if (key<arr[mid]) {
                h = mid-1;
            }
            else
            {
                l = mid+1;
            }

            mid = (l+h)/2;
        }



    }
}
