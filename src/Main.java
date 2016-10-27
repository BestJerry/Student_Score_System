import com.sun.xml.internal.ws.encoding.fastinfoset.FastInfosetCodec;
import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;
import sun.util.locale.provider.FallbackLocaleProviderAdapter;

import java.util.Scanner;


/**
 * Created by jerry on 16-10-27.
 */
public class Main {

    public static void  main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("学生成绩管理系统\n");
        System.out.println("1.教师登陆\n");
        System.out.println("2.学生登陆\n");
        System.out.println("3.退出系统");

        boolean flag = true;
        while(flag){
            String choice = input.next();


            switch (choice.charAt(0)){
                case '1':

                    flag = false;
                    break;
                case '2':

                    flag = false;
                    break;
                case '3':
                    System.exit(0);
                default:
                    System.out.println("您的输入有误，请重新输入。");

            }
        }

    }


}
