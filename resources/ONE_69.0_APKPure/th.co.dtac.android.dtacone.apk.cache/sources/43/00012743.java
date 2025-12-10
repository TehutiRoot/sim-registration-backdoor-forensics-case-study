package th.p047co.dtac.android.dtacone.util.idcard;

/* renamed from: th.co.dtac.android.dtacone.util.idcard.IdCardFormat */
/* loaded from: classes8.dex */
public class IdCardFormat {
    public static String replaceDistrict(String str) {
        if (str.startsWith("เขต")) {
            return str.replace("เขต", "");
        }
        return str.replace("อำเภอ", "");
    }

    public static String replaceProvince(String str) {
        return str.replace("จังหวัด", "");
    }

    public static String replaceSubDistrict(String str) {
        if (str.startsWith("แขวง")) {
            return str.replace("แขวง", "");
        }
        return str.replace("ตำบล", "");
    }
}