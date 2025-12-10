package p000;

import ch.qos.logback.core.net.SyslogConstants;
import es.dmoral.toasty.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import okio.Utf8;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;

/* renamed from: lh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC20939lh1 {

    /* renamed from: a */
    public static final int[] f71685a = new int[256];

    /* renamed from: b */
    public static final Map f71686b = new HashMap(256);

    static {
        for (int i = 0; i < 256; i++) {
            if ((i <= 23 || i >= 32) && ((i <= 126 || i >= 161) && i != 173)) {
                m26425c(i, (char) i);
            }
        }
        m26425c(24, (char) 728);
        m26425c(25, (char) 711);
        m26425c(26, (char) 710);
        m26425c(27, (char) 729);
        m26425c(28, (char) 733);
        m26425c(29, (char) 731);
        m26425c(30, (char) 730);
        m26425c(31, (char) 732);
        m26425c(127, Utf8.REPLACEMENT_CHARACTER);
        m26425c(128, Typography.bullet);
        m26425c(129, Typography.f109515dagger);
        m26425c(BuildConfig.VERSION_CODE, Typography.doubleDagger);
        m26425c(131, Typography.ellipsis);
        m26425c(132, Typography.mdash);
        m26425c(133, Typography.ndash);
        m26425c(134, (char) 402);
        m26425c(135, (char) 8260);
        m26425c(136, (char) 8249);
        m26425c(137, (char) 8250);
        m26425c(138, (char) 8722);
        m26425c(139, (char) 8240);
        m26425c(DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight, Typography.lowDoubleQuote);
        m26425c(141, Typography.leftDoubleQuote);
        m26425c(142, Typography.rightDoubleQuote);
        m26425c(143, Typography.leftSingleQuote);
        m26425c(SyslogConstants.LOG_LOCAL2, Typography.rightSingleQuote);
        m26425c(145, Typography.lowSingleQuote);
        m26425c(146, Typography.f70550tm);
        m26425c(147, (char) 64257);
        m26425c(148, (char) 64258);
        m26425c(149, (char) 321);
        m26425c(150, (char) 338);
        m26425c(151, (char) 352);
        m26425c(SyslogConstants.LOG_LOCAL3, (char) 376);
        m26425c(153, (char) 381);
        m26425c(154, (char) 305);
        m26425c(155, (char) 322);
        m26425c(156, (char) 339);
        m26425c(157, (char) 353);
        m26425c(158, (char) 382);
        m26425c(159, Utf8.REPLACEMENT_CHARACTER);
        m26425c(SyslogConstants.LOG_LOCAL4, Typography.euro);
    }

    /* renamed from: a */
    public static boolean m26427a(char c) {
        return f71686b.containsKey(Character.valueOf(c));
    }

    /* renamed from: b */
    public static byte[] m26426b(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (char c : str.toCharArray()) {
            Integer num = (Integer) f71686b.get(Character.valueOf(c));
            if (num == null) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(num.intValue());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public static void m26425c(int i, char c) {
        f71685a[i] = c;
        f71686b.put(Character.valueOf(c), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static String m26424d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = b & 255;
            int[] iArr = f71685a;
            if (i >= iArr.length) {
                sb.append('?');
            } else {
                sb.append((char) iArr[i]);
            }
        }
        return sb.toString();
    }
}
