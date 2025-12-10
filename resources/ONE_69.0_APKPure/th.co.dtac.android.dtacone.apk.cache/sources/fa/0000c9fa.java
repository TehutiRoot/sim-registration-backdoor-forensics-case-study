package p000;

import ch.qos.logback.core.net.SyslogConstants;
import es.dmoral.toasty.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import okio.Utf8;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;

/* renamed from: ii1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC20481ii1 {

    /* renamed from: a */
    public static final int[] f62933a = new int[256];

    /* renamed from: b */
    public static final Map f62934b = new HashMap(256);

    static {
        for (int i = 0; i < 256; i++) {
            if ((i <= 23 || i >= 32) && ((i <= 126 || i >= 161) && i != 173)) {
                m30917c(i, (char) i);
            }
        }
        m30917c(24, (char) 728);
        m30917c(25, (char) 711);
        m30917c(26, (char) 710);
        m30917c(27, (char) 729);
        m30917c(28, (char) 733);
        m30917c(29, (char) 731);
        m30917c(30, (char) 730);
        m30917c(31, (char) 732);
        m30917c(127, Utf8.REPLACEMENT_CHARACTER);
        m30917c(128, Typography.bullet);
        m30917c(129, Typography.f109819dagger);
        m30917c(BuildConfig.VERSION_CODE, Typography.doubleDagger);
        m30917c(131, Typography.ellipsis);
        m30917c(132, Typography.mdash);
        m30917c(133, Typography.ndash);
        m30917c(134, (char) 402);
        m30917c(135, (char) 8260);
        m30917c(136, (char) 8249);
        m30917c(137, (char) 8250);
        m30917c(138, (char) 8722);
        m30917c(139, (char) 8240);
        m30917c(DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight, Typography.lowDoubleQuote);
        m30917c(141, Typography.leftDoubleQuote);
        m30917c(142, Typography.rightDoubleQuote);
        m30917c(143, Typography.leftSingleQuote);
        m30917c(SyslogConstants.LOG_LOCAL2, Typography.rightSingleQuote);
        m30917c(145, Typography.lowSingleQuote);
        m30917c(146, Typography.f70584tm);
        m30917c(147, (char) 64257);
        m30917c(148, (char) 64258);
        m30917c(149, (char) 321);
        m30917c(150, (char) 338);
        m30917c(151, (char) 352);
        m30917c(SyslogConstants.LOG_LOCAL3, (char) 376);
        m30917c(153, (char) 381);
        m30917c(154, (char) 305);
        m30917c(155, (char) 322);
        m30917c(156, (char) 339);
        m30917c(157, (char) 353);
        m30917c(158, (char) 382);
        m30917c(159, Utf8.REPLACEMENT_CHARACTER);
        m30917c(SyslogConstants.LOG_LOCAL4, Typography.euro);
    }

    /* renamed from: a */
    public static boolean m30919a(char c) {
        return f62934b.containsKey(Character.valueOf(c));
    }

    /* renamed from: b */
    public static byte[] m30918b(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (char c : str.toCharArray()) {
            Integer num = (Integer) f62934b.get(Character.valueOf(c));
            if (num == null) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(num.intValue());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public static void m30917c(int i, char c) {
        f62933a[i] = c;
        f62934b.put(Character.valueOf(c), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static String m30916d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = b & 255;
            int[] iArr = f62933a;
            if (i >= iArr.length) {
                sb.append('?');
            } else {
                sb.append((char) iArr[i]);
            }
        }
        return sb.toString();
    }
}