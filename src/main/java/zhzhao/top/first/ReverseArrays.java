/**
 * https://www.zhzhao.top
 */
package zhzhao.top.first;

/**
 * 颠倒数组
 *@author zhzhao
 *@version $ Id: BinarySearch.java,V 0.1 2018/3/9 18:19 zhzhao Exp $
 */
public class ReverseArrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = revers(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    private static int[] revers(int[] arr) {
        int length = arr.length;
        for (int i = 0;i < length/2;i++){
            int temp  = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-i-1] = temp;
        }
        return arr;
    }

}
