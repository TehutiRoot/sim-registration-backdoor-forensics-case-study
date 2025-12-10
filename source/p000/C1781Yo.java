package p000;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.text.DateFormatSymbols;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: Yo */
/* loaded from: classes.dex */
public class C1781Yo {

    /* renamed from: a */
    public DateFormatSymbols f7864a = DateFormatSymbols.getInstance();

    /* renamed from: a */
    public static int[] m65310a(String[] strArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (String str : strArr) {
            int length = str.length();
            if (length != 0) {
                i = Math.min(i, length);
                i2 = Math.max(i2, length);
            }
        }
        return new int[]{i, i2};
    }

    /* renamed from: b */
    public final String m65309b() {
        return m65303h(this.f7864a.getAmPmStrings());
    }

    /* renamed from: c */
    public final String m65308c() {
        return m65303h(this.f7864a.getWeekdays());
    }

    /* renamed from: d */
    public final String m65307d() {
        return m65303h(this.f7864a.getMonths());
    }

    /* renamed from: e */
    public final String m65306e() {
        return m65303h(this.f7864a.getShortWeekdays());
    }

    /* renamed from: f */
    public String m65305f() {
        return m65303h(this.f7864a.getShortMonths());
    }

    /* renamed from: g */
    public final String m65304g(int i) {
        return "\\d{" + i + "}";
    }

    /* renamed from: h */
    public final String m65303h(String[] strArr) {
        int[] m65310a = m65310a(strArr);
        return ".{" + m65310a[0] + "," + m65310a[1] + "}";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: i */
    public String m65302i(C1704Xo c1704Xo) {
        int i = c1704Xo.f7584b;
        char c = c1704Xo.f7583a;
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case '\'':
                        if (i == 1) {
                            return "";
                        }
                        throw new IllegalStateException("Too many single quotes");
                    case '.':
                        return "\\.";
                    case 'K':
                    case ModuleDescriptor.MODULE_VERSION /* 83 */:
                    case 'W':
                    case 'd':
                    case 'h':
                    case 'k':
                    case 'm':
                    case 's':
                    case 'w':
                        break;
                    case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                        if (i <= 2) {
                            return m65304g(i);
                        }
                        if (i == 3) {
                            return m65305f();
                        }
                        return m65307d();
                    case 'Z':
                        return "(\\+|-)\\d{4}";
                    case '\\':
                        throw new IllegalStateException("Forward slashes are not allowed");
                    case 'a':
                        return m65309b();
                    default:
                        switch (c) {
                            case EACTags.APPLICATION_IMAGE /* 68 */:
                            case 'F':
                            case 'H':
                                break;
                            case EACTags.DISPLAY_IMAGE /* 69 */:
                                if (i >= 4) {
                                    return m65308c();
                                }
                                return m65306e();
                            case EACTags.MESSAGE_REFERENCE /* 71 */:
                                return ".*";
                            default:
                                if (i == 1) {
                                    return "" + c;
                                }
                                return c + "{" + i + "}";
                        }
                }
            } else {
                return ".*";
            }
        }
        return m65304g(i);
    }
}
