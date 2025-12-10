package th.p047co.dtac.android.dtacone.manager.cardreader;

import com.feitian.readerdk.Tool.C6151Tool;
import java.util.Arrays;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.mnp.SimCardInformationCollection;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

@PerActivity
/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.SimCardCommand */
/* loaded from: classes7.dex */
public class SimCardCommand {

    /* renamed from: b */
    public static String f84861b = "9f";

    /* renamed from: c */
    public static String f84862c = "a0a40000023f00";

    /* renamed from: d */
    public static String f84863d = "a0a40000022fe2";

    /* renamed from: e */
    public static String f84864e = "a0b000000a";

    /* renamed from: f */
    public static String f84865f = "a0a40000027f20";

    /* renamed from: g */
    public static String f84866g = "a0a40000026f07";

    /* renamed from: h */
    public static String f84867h = "a0b0000009";

    /* renamed from: i */
    public static String f84868i = "a020000b";

    /* renamed from: j */
    public static String f84869j = "f02a0001";

    /* renamed from: k */
    public static String f84870k = "0020000b";

    /* renamed from: l */
    public static String f84871l = "a0a40000023f00";

    /* renamed from: m */
    public static String f84872m = "a0a40000027f20";

    /* renamed from: n */
    public static String f84873n = "a0a40000026f07";

    /* renamed from: o */
    public static String f84874o = "a0d60000";

    /* renamed from: p */
    public static String f84875p = "809";

    /* renamed from: q */
    public static String f84876q = "90";

    /* renamed from: a */
    public final int f84877a = 1024;

    /* renamed from: a */
    public final String m19356a(String str, int i) {
        String str2;
        if (i != 1) {
            if (i != 2) {
                str2 = f84868i;
            } else {
                str2 = f84870k;
            }
        } else {
            str2 = f84869j;
        }
        return str2 + String.format("%02X", Integer.valueOf(str.length())) + C6151Tool.byte2HexStr2(str.getBytes(), str.length());
    }

    /* renamed from: b */
    public final String m19355b(String str) {
        byte[] hexStringToBytes;
        if (str.startsWith(f84875p)) {
            hexStringToBytes = C6151Tool.hexStringToBytes(str);
        } else {
            hexStringToBytes = C6151Tool.hexStringToBytes(f84875p + str);
        }
        byte[] m19349h = m19349h(hexStringToBytes);
        return f84874o + String.format("%02X", Integer.valueOf(m19349h.length)) + C6151Tool.byte2HexStr2(m19349h, m19349h.length);
    }

    /* renamed from: c */
    public final byte[] m19354c(CardReader cardReader, String str) {
        return m19353d(cardReader, C6151Tool.hexStringToBytes(str));
    }

    /* renamed from: d */
    public final byte[] m19353d(CardReader cardReader, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("\tRead command: ");
        sb.append(C6151Tool.byte2HexStr(bArr, bArr.length));
        byte[] bArr2 = new byte[1024];
        int[] iArr = new int[2];
        int transApdu = cardReader.transApdu(bArr.length, bArr, iArr, bArr2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\tRead response: ");
        sb2.append(C6151Tool.byte2HexStr(bArr2, iArr[0]));
        sb2.append(", return code : ");
        sb2.append(transApdu);
        int i = iArr[0];
        if (m19347j(Arrays.copyOfRange(bArr2, i - 2, i), f84876q)) {
            return Arrays.copyOfRange(bArr2, 0, iArr[0] - 2);
        }
        throw new ValidatedRuleException(R.string.card_is_wrong_sim_card);
    }

    /* renamed from: e */
    public final byte[] m19352e(CardReader cardReader, String str) {
        return m19351f(cardReader, C6151Tool.hexStringToBytes(str));
    }

    /* renamed from: f */
    public final byte[] m19351f(CardReader cardReader, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("\tSend command: ");
        sb.append(C6151Tool.byte2HexStr(bArr, bArr.length));
        byte[] bArr2 = new byte[1024];
        int[] iArr = new int[2];
        int transApdu = cardReader.transApdu(bArr.length, bArr, iArr, bArr2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\tSend response: ");
        sb2.append(C6151Tool.byte2HexStr(bArr2, iArr[0]));
        sb2.append(", return code : ");
        sb2.append(transApdu);
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 0, iArr[0]);
        if (m19345l(copyOfRange, f84861b)) {
            return copyOfRange;
        }
        throw new ValidatedRuleException(R.string.card_is_wrong_sim_card);
    }

    /* renamed from: g */
    public final byte m19350g(byte b) {
        return (byte) (((b & 255) >> 4) | (b << 4));
    }

    public SimCardInformationCollection getSimCardData(CardReader cardReader) throws CardReaderReadException {
        m19352e(cardReader, f84862c);
        m19352e(cardReader, f84863d);
        byte[] m19354c = m19354c(cardReader, f84864e);
        String byte2HexStr2 = C6151Tool.byte2HexStr2(m19349h(m19354c), m19354c.length);
        String substring = byte2HexStr2.substring(0, byte2HexStr2.length() - 1);
        m19352e(cardReader, f84865f);
        m19352e(cardReader, f84866g);
        byte[] m19354c2 = m19354c(cardReader, f84867h);
        String byte2HexStr22 = C6151Tool.byte2HexStr2(m19349h(m19354c2), m19354c2.length);
        if (byte2HexStr22.startsWith(f84875p)) {
            return new SimCardInformationCollection(substring, byte2HexStr22.replace(f84875p, ""));
        }
        throw new ValidatedRuleException(R.string.card_is_wrong_sim_card);
    }

    /* renamed from: h */
    public final byte[] m19349h(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = m19350g(bArr[i]);
        }
        return bArr;
    }

    /* renamed from: i */
    public final boolean m19348i(CardReader cardReader, String str) {
        for (int i = 0; i < 3; i++) {
            try {
                m19354c(cardReader, m19356a(str, i));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m19347j(byte[] bArr, String str) {
        if (C6151Tool.byte2HexStr2(bArr, bArr.length).startsWith(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m19346k(String str) {
        if (!StringUtil.hasText(str)) {
            return false;
        }
        if (str.startsWith(f84875p)) {
            if (str.length() != 18) {
                return false;
            }
            return true;
        } else if (str.length() != 15) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: l */
    public final boolean m19345l(byte[] bArr, String str) {
        if (C6151Tool.byte2HexStr2(bArr, bArr.length).startsWith(str)) {
            return true;
        }
        return false;
    }

    public String writeIMSI(CardReader cardReader, String str, String str2) throws CardReaderReadException {
        if (m19348i(cardReader, str) && m19346k(str2)) {
            m19352e(cardReader, f84871l);
            m19352e(cardReader, f84872m);
            m19352e(cardReader, f84873n);
            m19354c(cardReader, m19355b(str2));
            return str2;
        }
        throw new ValidatedRuleException(R.string.card_is_wrong_sim_card);
    }
}
