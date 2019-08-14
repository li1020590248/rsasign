import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static enum CallType{
        EOPS("EOPS"),
        OPEN_APP("OPEN_APP"),
        OTHER("OTHER");
        public final String callType;
        private CallType (String callType) {
            this.callType = callType;
        }

    }

    public static void test(CallType callType){
        if(callType.equals(CallType.OTHER)){
            System.out.println("dsafdafadsf");
        }else {
            System.out.println("dasfadsdddddddddddddddddddd");
        }
    }

    public static String  tes1(CallType callType){
        if(callType.equals(CallType.EOPS)){
            return "sdfsdfdsf";
        }else {
            System.out.println("dasfadsdddddddddddddddddddd");
        }
        return null;
    }

    public static void main(String[] args) {
         List<String> appOrgKeyLists = new ArrayList<>();
        appOrgKeyLists.add("a");
        appOrgKeyLists.add("b");
        appOrgKeyLists.add("c");
        appOrgKeyLists.add("d");
        boolean signSuccess = false;
        for (int i = 0; i < appOrgKeyLists.size(); i++) {

            if (!"c".equals(appOrgKeyLists.get(i))) {
                System.out.println("进来了");
                continue;
            }
            signSuccess = true;
            System.out.println("完成了");
            break;
        }
        System.out.println("signSuccess=" + signSuccess);
        tes1(CallType.EOPS);
         System.out.println(CallType.EOPS.name());
        System.out.println(CallType.EOPS);
//        String statusInfo = null;
//        String str1 = "errCode[FREQUENCY_LIMITED],errMsg[你的操作过于频繁]#1";
//        String str2 = "Internal error#1";
//
//        if (statusInfo.contains("errCode") && statusInfo.contains("errMsg")) {
//            Pattern p1 = Pattern.compile("\\[(.*?)\\]");
//            Matcher m = p1.matcher(str1);
//        while (m.find()) {
//           statusInfo = m.group();
//        }
//        if(statusInfo.length() >0){
//            statusInfo = statusInfo.substring(1,statusInfo.length()-1);
//        }
//        }else {
//            statusInfo = str2.split("#")[0];
//        }
//        System.out.println("statusInfo:" + statusInfo);
    }
}
