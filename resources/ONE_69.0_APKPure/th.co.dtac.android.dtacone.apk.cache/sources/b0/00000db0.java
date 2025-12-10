package p000;

import java.util.Map;

/* renamed from: OS */
/* loaded from: classes5.dex */
public abstract class AbstractC1003OS {
    /* renamed from: a */
    public abstract boolean mo31374a(Object obj, Object obj2);

    /* renamed from: b */
    public boolean m67117b(Map.Entry entry, Map.Entry entry2) {
        if (entry.getKey().equals(entry2.getKey())) {
            return mo31374a(entry.getValue(), entry2.getValue());
        }
        return false;
    }
}