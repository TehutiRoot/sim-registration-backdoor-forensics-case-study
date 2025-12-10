package p000;

import java.util.Map;

/* renamed from: Ir2 */
/* loaded from: classes3.dex */
public final class Ir2 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f2619a;

    /* renamed from: b */
    public Object f2620b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC21661ps2 f2621c;

    public Ir2(AbstractC21661ps2 abstractC21661ps2, Comparable comparable, Object obj) {
        this.f2621c = abstractC21661ps2;
        this.f2619a = comparable;
        this.f2620b = obj;
    }

    /* renamed from: b */
    public static final boolean m67863b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m67864a() {
        return this.f2619a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f2619a.compareTo(((Ir2) obj).f2619a);
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
        if (m67863b(this.f2619a, entry.getKey()) && m67863b(this.f2620b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f2619a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2620b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f2619a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f2620b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2621c.m23569o();
        Object obj2 = this.f2620b;
        this.f2620b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2619a);
        String valueOf2 = String.valueOf(this.f2620b);
        return valueOf + "=" + valueOf2;
    }
}
