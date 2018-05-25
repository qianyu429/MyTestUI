package utils;

import org.testng.annotations.Test;
import sun.rmi.server.InactiveGroupException;

import java.util.Scanner;

/**
 * Created by mac on 2018/4/12.
 */
public class NumberChange {

    private static String[] num ={"零","一","二","三","四","五","六","七","八","九"};
    private static String[] unit ={"","十","百","千","万","十","百","千","亿"};
    private static Integer input;

    /**
     * 一,最后一位为0的不显示
     * 二,万位之后的0显示"零"
     * 三,若万,十万,百万,千万位上均为0,则不显示"零"和"万"
     * 四,
     * @param number
     * @return
     */
    private static  String intChangeChiness(Integer number){

        String outPut ="";
//        整数型转换成String类型
        String str = String.valueOf(number);
//        定义一个result数组,长度为待转换整数的长度
        String[] result = new String[str.length()];
        System.out.println("转换成string后的整数为:" + str);

        for(int i=0;i<result.length;i++){
            result[i] = String.valueOf(str.charAt(i)); //str.charAt(i)是char类型,字符类型
        }

        for (int i=0;i<result.length;i++){
            int back;
            if (!result[i].equals("0")){
                back =result.length -i -1 ;
                outPut = outPut + num[Integer.parseInt(result[i])];
                outPut = outPut + unit[back];
            }else{ //处理为0的情况
//                最后一位为0的不用考虑
                if(i == result.length -1){
                    continue;

                }else{
                    //连着2位数都为0的话,则result[i]这个零不显示
                    if(result[i+1].equals("0")){
                        continue;
                    }
                    //0的下一位数result[i+1]不为零,则result[i]显示"零"
                    if (!result[i+1].equals("0")){
                        outPut = outPut + num[0];
                    }
                    //第五位数为0,则添加单位"万"
                    if (result.length>5 && i==4){
                        outPut = outPut + unit[4];
                    }
                }
            }
        }
        return outPut;
    }

    private static void inPutNumber(){
//        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nextLine()方式接收输入");
                String str = scanner.next();
                input = Integer.parseInt(str);
                System.out.println("输入的数据为:" + input);

//        }catch(Exception e){
//            System.out.println("对不起,只能输入数字");
//        }
    }

    @Test
    public void testNumberChangeChiness(){
        inPutNumber();
        String out = NumberChange.intChangeChiness(input);
        System.out.print("转换后的中文字符串为:" + out);
    }
}
