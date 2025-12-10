package p000;

import java.util.Locale;

/* renamed from: kZ1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC20801kZ1 {
    /* renamed from: a */
    public static String m29188a(int i) {
        String upperCase = Integer.toString(i, 16).toUpperCase(Locale.US);
        int length = upperCase.length();
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    return "uni" + upperCase;
                }
                return "uni0" + upperCase;
            }
            return "uni00" + upperCase;
        }
        return "uni000" + upperCase;
    }
}