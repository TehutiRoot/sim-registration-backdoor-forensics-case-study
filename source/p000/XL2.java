package p000;

import java.util.Map;

/* renamed from: XL2 */
/* loaded from: classes3.dex */
public final class XL2 implements Comparable, Map.Entry {

    /* renamed from: a */
    public final Comparable f7462a;

    /* renamed from: b */
    public Object f7463b;

    /* renamed from: c */
    public final /* synthetic */ SL2 f7464c;

    public XL2(SL2 sl2, Map.Entry entry) {
        this(sl2, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public static boolean m65510a(Object obj, Object obj2) {
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
        return ((Comparable) getKey()).compareTo((Comparable) ((XL2) obj).getKey());
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
        if (m65510a(this.f7462a, entry.getKey()) && m65510a(this.f7463b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f7462a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7463b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f7462a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f7463b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f7464c.m66336q();
        Object obj2 = this.f7463b;
        this.f7463b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7462a);
        String valueOf2 = String.valueOf(this.f7463b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public XL2(SL2 sl2, Comparable comparable, Object obj) {
        this.f7464c = sl2;
        this.f7462a = comparable;
        this.f7463b = obj;
    }
}
