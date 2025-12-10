package p000;

import java.util.Iterator;

/* renamed from: ZQ1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ZQ1 {
    /* renamed from: a */
    public static /* synthetic */ String m65238a(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(charSequence);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
