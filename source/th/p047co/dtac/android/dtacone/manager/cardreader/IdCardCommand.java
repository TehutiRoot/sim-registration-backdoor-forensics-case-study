package th.p047co.dtac.android.dtacone.manager.cardreader;

import android.util.Log;
import com.feitian.readerdk.Tool.C6151Tool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;

@PerActivity
/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.IdCardCommand */
/* loaded from: classes7.dex */
public class IdCardCommand {

    /* renamed from: c */
    public static String f84840c = "3b";

    /* renamed from: d */
    public static int f84841d = 103;

    /* renamed from: e */
    public static String f84842e = "00a4040008a000000054480001";

    /* renamed from: f */
    public static String f84843f = "00a4040008a000000084060002";

    /* renamed from: g */
    public static String f84844g = "00a40400";

    /* renamed from: h */
    public static String f84845h = "00a40412";

    /* renamed from: i */
    public static String f84846i = "80000000";

    /* renamed from: j */
    public static String f84847j = "00c00000";

    /* renamed from: k */
    public static String f84848k = "80B000e2020014";

    /* renamed from: l */
    public static String f84849l = "80CA9F7F";

    /* renamed from: m */
    public static String f84850m = "80b0000402000d";

    /* renamed from: n */
    public static String f84851n = "80b00011020064";

    /* renamed from: o */
    public static String f84852o = "80b00075020064";

    /* renamed from: p */
    public static String f84853p = "80b000e1020001";

    /* renamed from: q */
    public static String f84854q = "80b000d9020008";

    /* renamed from: r */
    public static String f84855r = "80b01579020064";

    /* renamed from: s */
    public static String f84856s = "80b00167020012";

    /* renamed from: t */
    public static String f84857t = "80b0161902000e";

    /* renamed from: a */
    public ByteArrayOutputStream f84858a = null;

    /* renamed from: b */
    public final int f84859b = 2048;

    /* renamed from: a */
    public final byte[] m19367a(CardReader cardReader) {
        this.f84858a = new ByteArrayOutputStream();
        try {
            for (byte[][] bArr : m19363e()) {
                byte[] bArr2 = new byte[2048];
                StringBuilder sb = new StringBuilder();
                sb.append("Fetch picture command: ");
                byte[] bArr3 = bArr[0];
                sb.append(C6151Tool.byte2HexStr(bArr3, bArr3.length));
                byte[] bArr4 = bArr[0];
                cardReader.transApdu(bArr4.length, bArr4, new int[2], bArr2);
                byte[] bArr5 = new byte[256];
                cardReader.transApdu(5, new byte[]{0, -64, 0, 0, bArr2[1]}, new int[2], bArr5);
                this.f84858a.write(bArr5, 0, 254);
                this.f84858a.flush();
            }
        } catch (IOException e) {
            Log.getStackTraceString(e);
        }
        return this.f84858a.toByteArray();
    }

    /* renamed from: b */
    public final String m19366b(CardReader cardReader, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fetch command: ");
        sb.append(str);
        byte[] m19361g = m19361g(cardReader, str, m19360h(cardReader, str));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Byte data: ");
        sb2.append(Arrays.toString(m19361g));
        return new String(m19361g, Charset.forName("tis620"));
    }

    /* renamed from: c */
    public final String m19365c(CardReader cardReader, String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("Fetch command: ");
        sb.append(str);
        byte[] m19360h = m19360h(cardReader, str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Byte cmdRes1 before sub: ");
        sb2.append(C6151Tool.byte2HexStr(m19360h, m19360h.length));
        byte[] m19361g = m19361g(cardReader, str, m19360h);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Byte data before sub: ");
        sb3.append(C6151Tool.byte2HexStr(m19361g, m19361g.length));
        if (21 > m19361g.length) {
            i = m19361g.length - 13;
        } else {
            i = 8;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(m19361g, 13, bArr, 0, i);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Byte data after sub: ");
        sb4.append(C6151Tool.byte2HexStr(bArr, i).replace(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, ""));
        return C6151Tool.byte2HexStr(bArr, i).replace(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "");
    }

    public void closeByeStream() {
        ByteArrayOutputStream byteArrayOutputStream = this.f84858a;
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                Log.getStackTraceString(e);
            }
        }
    }

    /* renamed from: d */
    public final String m19364d(CardReader cardReader, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fetch command: ");
        sb.append(str);
        byte[] m19361g = m19361g(cardReader, str, m19360h(cardReader, str));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Byte data: ");
        sb2.append(Arrays.toString(m19361g));
        return new String(Arrays.copyOfRange(m19361g, 7, 23), Charset.forName("tis620")).substring(0, 12);
    }

    /* renamed from: e */
    public final List m19363e() {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 <= 20; i2++) {
            int i3 = (i2 * 254) + 379;
            if (i2 == 20) {
                i = 38;
            } else {
                i = 254;
            }
            byte b = (byte) (i & 255);
            arrayList.add(new byte[][]{new byte[]{Byte.MIN_VALUE, -80, (byte) (i3 >> 8), (byte) (i3 & 255), 2, 0, b}, new byte[]{0, -64, 0, 0, b}});
        }
        return arrayList;
    }

    /* renamed from: f */
    public final byte[] m19362f(CardReader cardReader, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("\tRead command: ");
        sb.append(C6151Tool.byte2HexStr(bArr, bArr.length));
        byte[] bArr2 = new byte[2048];
        int[] iArr = new int[2];
        int transApdu = cardReader.transApdu(bArr.length, bArr, iArr, bArr2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\tRead response: ");
        sb2.append(C6151Tool.byte2HexStr(bArr2, iArr[0]));
        sb2.append(", return code : ");
        sb2.append(transApdu);
        return Arrays.copyOfRange(bArr2, 0, iArr[0] - 2);
    }

    /* renamed from: g */
    public final byte[] m19361g(CardReader cardReader, String str, byte[] bArr) {
        byte[] bArr2 = new byte[5];
        byte b = bArr[0];
        if (b == 97) {
            bArr2 = C6151Tool.hexStringToBytes(f84847j + str.substring(str.length() - 2));
        } else if (b == 108) {
            System.arraycopy(C6151Tool.hexStringToBytes(str), 0, bArr2, 0, 4);
            bArr2[4] = bArr[1];
        }
        return m19362f(cardReader, bArr2);
    }

    public IdCardInformationCollection getIdCardData(CardReader cardReader) throws CardReaderReadException {
        String str;
        String str2;
        String str3 = "";
        byte[] atr = cardReader.getAtr();
        if (C6151Tool.byte2HexStr2(atr, atr.length).startsWith(f84840c) && atr[1] > f84841d) {
            try {
                m19358j(cardReader, f84844g, f84845h);
                str = m19365c(cardReader, f84849l);
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CARD_NO: ");
                    sb.append(str);
                    m19360h(cardReader, f84843f);
                    str2 = m19364d(cardReader, f84846i);
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("LASER CODE: ");
                        sb2.append(str2);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    str2 = "";
                }
            } catch (Exception unused3) {
                str = "";
                str2 = str;
            }
            String str4 = str;
            String str5 = str2;
            m19360h(cardReader, f84842e);
            try {
                str3 = m19366b(cardReader, f84848k);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("BP1_NUMBER: ");
                sb3.append(str3);
            } catch (Exception unused4) {
            }
            String str6 = str3;
            String m19366b = m19366b(cardReader, f84850m);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ID_CMD: ");
            sb4.append(m19366b);
            String m19366b2 = m19366b(cardReader, f84851n);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("NAME_THAI_CMD: ");
            sb5.append(m19366b2);
            String m19366b3 = m19366b(cardReader, f84852o);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("NAME_ENG_CMD: ");
            sb6.append(m19366b3);
            String m19366b4 = m19366b(cardReader, f84853p);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("GENDER_CMD: ");
            sb7.append(m19366b4);
            String m19366b5 = m19366b(cardReader, f84854q);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("BIRTHDAY_CMD: ");
            sb8.append(m19366b5);
            String m19366b6 = m19366b(cardReader, f84855r);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("ADDRESS_CMD: ");
            sb9.append(m19366b6);
            String m19366b7 = m19366b(cardReader, f84856s);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("ISSUE_EXPIRE_CMD: ");
            sb10.append(m19366b7);
            String m19366b8 = m19366b(cardReader, f84857t);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("PICTURE_ID_CMD: ");
            sb11.append(m19366b8);
            byte[] m19367a = m19367a(cardReader);
            StringBuilder sb12 = new StringBuilder();
            sb12.append("PICTURE_CMD: ");
            sb12.append(C6151Tool.byte2HexStr(m19367a, m19367a.length));
            return new IdCardInformationCollection(m19366b, m19366b2, m19366b3, m19366b4, m19366b5, m19366b6, m19366b7, m19366b8, m19367a, str6, str4, str5);
        }
        throw new ValidatedRuleException(R.string.mnp_card_reader_read_error);
    }

    public IdCardInformationCollection getIdCardDataIDNumberOnly(CardReader cardReader) throws CardReaderReadException {
        byte[] atr = cardReader.getAtr();
        if (C6151Tool.byte2HexStr2(atr, atr.length).startsWith(f84840c) && atr[1] > f84841d) {
            m19360h(cardReader, f84842e);
            String m19366b = m19366b(cardReader, f84850m);
            StringBuilder sb = new StringBuilder();
            sb.append("ID_CMD: ");
            sb.append(m19366b);
            return new IdCardInformationCollection(m19366b, "", "", "", "", "", "", "", null, "", "", "");
        }
        throw new ValidatedRuleException(R.string.mnp_card_reader_read_error);
    }

    /* renamed from: h */
    public final byte[] m19360h(CardReader cardReader, String str) {
        return m19359i(cardReader, C6151Tool.hexStringToBytes(str));
    }

    /* renamed from: i */
    public final byte[] m19359i(CardReader cardReader, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("\tSend command: ");
        sb.append(C6151Tool.byte2HexStr(bArr, bArr.length));
        byte[] bArr2 = new byte[2048];
        int[] iArr = new int[2];
        int transApdu = cardReader.transApdu(bArr.length, bArr, iArr, bArr2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\tSend response: ");
        sb2.append(C6151Tool.byte2HexStr(bArr2, iArr[0]));
        sb2.append(", return code : ");
        sb2.append(transApdu);
        return Arrays.copyOfRange(bArr2, 0, iArr[0]);
    }

    /* renamed from: j */
    public final byte[] m19358j(CardReader cardReader, String str, String str2) {
        byte[] m19360h = m19360h(cardReader, str);
        if (m19360h[0] == 108) {
            return m19360h(cardReader, str2);
        }
        return m19360h;
    }
}
