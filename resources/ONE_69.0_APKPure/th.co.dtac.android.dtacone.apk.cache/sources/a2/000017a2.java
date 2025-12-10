package p000;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.text.DateFormatSymbols;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: Yo */
/* loaded from: classes.dex */
public class C1761Yo {

    /* renamed from: a */
    public DateFormatSymbols f7990a = DateFormatSymbols.getInstance();

    /* renamed from: a */
    public static int[] m65361a(String[] strArr) {
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
    public final String m65360b() {
        return m65354h(this.f7990a.getAmPmStrings());
    }

    /* renamed from: c */
    public final String m65359c() {
        return m65354h(this.f7990a.getWeekdays());
    }

    /* renamed from: d */
    public final String m65358d() {
        return m65354h(this.f7990a.getMonths());
    }

    /* renamed from: e */
    public final String m65357e() {
        return m65354h(this.f7990a.getShortWeekdays());
    }

    /* renamed from: f */
    public String m65356f() {
        return m65354h(this.f7990a.getShortMonths());
    }

    /* renamed from: g */
    public final String m65355g(int i) {
        return "\\d{" + i + "}";
    }

    /* renamed from: h */
    public final String m65354h(String[] strArr) {
        int[] m65361a = m65361a(strArr);
        return ".{" + m65361a[0] + "," + m65361a[1] + "}";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: i */
    public String m65353i(C1693Xo c1693Xo) {
        int i = c1693Xo.f7668b;
        char c = c1693Xo.f7667a;
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
                            return m65355g(i);
                        }
                        if (i == 3) {
                            return m65356f();
                        }
                        return m65358d();
                    case 'Z':
                        return "(\\+|-)\\d{4}";
                    case '\\':
                        throw new IllegalStateException("Forward slashes are not allowed");
                    case 'a':
                        return m65360b();
                    default:
                        switch (c) {
                            case EACTags.APPLICATION_IMAGE /* 68 */:
                            case 'F':
                            case 'H':
                                break;
                            case EACTags.DISPLAY_IMAGE /* 69 */:
                                if (i >= 4) {
                                    return m65359c();
                                }
                                return m65357e();
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
        return m65355g(i);
    }
}