package p000;

import java.util.Map;

/* renamed from: QE2 */
/* loaded from: classes3.dex */
public final class QE2 implements Comparable, Map.Entry {

    /* renamed from: a */
    public final Comparable f5009a;

    /* renamed from: b */
    public Object f5010b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC23275zE2 f5011c;

    public QE2(AbstractC23275zE2 abstractC23275zE2, Map.Entry entry) {
        this(abstractC23275zE2, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public static boolean m66634a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((QE2) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (m66634a(this.f5009a, entry.getKey()) && m66634a(this.f5010b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f5009a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5010b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f5009a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f5010b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5011c.m102q();
        Object obj2 = this.f5010b;
        this.f5010b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5009a);
        String valueOf2 = String.valueOf(this.f5010b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public QE2(AbstractC23275zE2 abstractC23275zE2, Comparable comparable, Object obj) {
        this.f5011c = abstractC23275zE2;
        this.f5009a = comparable;
        this.f5010b = obj;
    }
}
