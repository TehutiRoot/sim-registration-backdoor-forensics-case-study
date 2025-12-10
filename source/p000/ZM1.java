package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: ZM1 */
/* loaded from: classes6.dex */
public abstract class ZM1 {
    /* renamed from: a */
    public static String m65239a(String str, Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (!it.hasNext()) {
                break;
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
