package utils;

import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by mac on 2018/4/14.
 */
public class StringTools {

    /**
     * 作用:删除字符串中的一个字符
     *  string 的substring方法拼接成一个新的string,把要删除的那个字符去掉
     *  substring(begainIndex,endIndex)方法
     *  substring(begainIndex)方法
     * @param str
     * @param index
     * @return
     */
    public static String removeStringCharAt(String str, int index){
        return str.substring(0,index) + str.substring(index+1);
    }

    /**
     * 作用:将String字符串反转
     * 利用StringBuffer的reverse()
     * @param str
     * @return
     */
    public static String stringReverse(String str){
//        StringBuilder stringBuffer = new StringBuilder(str);
//        return stringBuffer.reverse().toString();
        return new StringBuffer(str).reverse().toString();
    }

    /**
     * 作用:查看字符串是否出现在另一个字符串中
     * 使用String的lastIndexOf()方法
     * @param subString
     * @param fatherString
     * Auth:mac
     */
    public static void findStringInAnotherString(String subString,String fatherString){
        int index = fatherString.lastIndexOf(subString);
        if (index == -1){
            System.out.println(subString + "未出现在" + fatherString + "中");
        }else {
            System.out.println(subString + "出现在" + fatherString + "的位置" + index);
        }
    }

    /**
     * 使用新的字符串替换string中的字符
     * 利用String的replace(oldchar,newchar)方法
     * @param str
     * @param oldstring
     * @param newstring
     * @return
     */
    public  static  String replaceString(String str, String oldstring,String newstring){
        System.out.println(str.replace(oldstring,newstring));
        return str.replace(oldstring,newstring);
    }

    public static void changeString(String str){
//        转换成大写
        String upperString = str.toUpperCase();
//        转换成小写
        String lowerString = str.toLowerCase();
    }

    public static void  getSum(double[] array){
        double sum=0;
        List<Double> list = new ArrayList<Double>();
        double bigSum =0;
        for (int i =0; i<array.length;i++){
            if (array[i]>100){
                System.out.println("大额消费" + array[i]);
                list.add(array[i]);
            }
            sum =sum + array[i];
        }

//        for (int i=0;i<list.size();i++){
//            bigSum+= list.get(i);
//        }
//        遍历方式二
//        for (double amount : list){
//            bigSum+= amount;
//        }
//        遍历方式三:迭代器
        Iterator it = list.iterator();
         while (it.hasNext()){
             bigSum+= Double.parseDouble(it.next().toString()) ;
            }

        System.out.println("大额消费总金额" + bigSum);
        System.out.println("所有消费总金额" + sum);
    }


    @Test
    public void testString() {
//        String str ="abcdefg";
//        String substr = "he";
//        String oldstring ="ab";
//        System.out.println("反转前的字符串为:" + str);
//        System.out.println("反转后的字符串为:" + stringReverse(str));
//        findStringInAnotherString(substr,str);
//        replaceString(str,oldstring,substr);
//        String[] strs = str.split(",");
//        System.out.println("转换后的string数组为:"+ Arrays.toString(strs));
//        String[] array = {"2","3","5","6","7","8"};
//        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
//        Collections.reverse(arrayList);

        double[] a = {221, 10.03, 45, 19, 75, 40.3, 25, 45, 49, 21, 27.5, 22.5, 90.52, 26.8, 76, 45, 17, 8, 34.5, 38.3, 526, 9, 61.7, 17.71, 46.7, 41, 28.5, 26.8, 6, 23, 99.98, 148, 2.5, 70, 80.1, 67, 8, 42.62, 180,
                300, 6.5, 30, 99.95, 26.8, 54.5, 18, 6, 260, 26.5, 27.5, 26.5, 78, 45, 105, 25.5, 17.8, 27.5, 160, 45, 190.82, 24.5, 29, 19, 105, 4, 78, 13, 228, 54.9, 24, 49, 31.5, 41, 191, 10, 27.5, 23, 6, 387, 233,
                63.5, 655.7, 77.8, 176, 6, 3, 70};
        getSum(a);

    }

}
