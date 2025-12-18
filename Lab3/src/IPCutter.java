import java.util.StringTokenizer;

public class IPCutter {
    public static void split(String str){
        String[] splitted = str.split("\\.");
        for (int i = 0; i <splitted.length ; i++) {
            System.out.println(splitted[i]);
        }
    }
    public static void strTokenizer(String str){
        StringTokenizer st = new StringTokenizer(str,".");
        int count = st.countTokens();
        for (int i = 0; i < count; i++) {
            System.out.println(st.nextToken());
        }
    }

    public static void subStrIndexOF(String str){
        int index = str.indexOf(".");
        while (index != -1){
            System.out.println(str.indexOf(0,index));
            str = str.substring(index);
            index = str.indexOf(".");
        }
    }
}
