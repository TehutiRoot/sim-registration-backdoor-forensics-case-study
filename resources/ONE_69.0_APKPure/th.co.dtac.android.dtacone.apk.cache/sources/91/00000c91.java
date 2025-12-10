package p000;

import java.util.Map;

/* renamed from: NF2 */
/* loaded from: classes3.dex */
public final class NF2 implements Comparable, Map.Entry {

    /* renamed from: a */
    public final Comparable f4118a;

    /* renamed from: b */
    public Object f4119b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC22830wF2 f4120c;

    public NF2(AbstractC22830wF2 abstractC22830wF2, Map.Entry entry) {
        this(abstractC22830wF2, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public static boolean m67263a(Object obj, Object obj2) {
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
        return ((Comparable) getKey()).compareTo((Comparable) ((NF2) obj).getKey());
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
        if (m67263a(this.f4118a, entry.getKey()) && m67263a(this.f4119b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f4118a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4119b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f4118a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f4119b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4120c.m774q();
        Object obj2 = this.f4119b;
        this.f4119b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4118a);
        String valueOf2 = String.valueOf(this.f4119b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public NF2(AbstractC22830wF2 abstractC22830wF2, Comparable comparable, Object obj) {
        this.f4120c = abstractC22830wF2;
        this.f4118a = comparable;
        this.f4119b = obj;
    }
}