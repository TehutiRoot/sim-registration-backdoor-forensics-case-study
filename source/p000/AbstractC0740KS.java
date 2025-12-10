package p000;

import java.util.Map;

/* renamed from: KS */
/* loaded from: classes5.dex */
public abstract class AbstractC0740KS {
    /* renamed from: a */
    public abstract boolean mo31082a(Object obj, Object obj2);

    /* renamed from: b */
    public boolean m67615b(Map.Entry entry, Map.Entry entry2) {
        if (entry.getKey().equals(entry2.getKey())) {
            return mo31082a(entry.getValue(), entry2.getValue());
        }
        return false;
    }
}
