package p000;

import java.util.Map;

/* renamed from: Fs2 */
/* loaded from: classes3.dex */
public final class Fs2 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f1797a;

    /* renamed from: b */
    public Object f1798b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC21207mt2 f1799c;

    public Fs2(AbstractC21207mt2 abstractC21207mt2, Comparable comparable, Object obj) {
        this.f1799c = abstractC21207mt2;
        this.f1797a = comparable;
        this.f1798b = obj;
    }

    /* renamed from: b */
    public static final boolean m68377b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m68378a() {
        return this.f1797a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f1797a.compareTo(((Fs2) obj).f1797a);
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
        if (m68377b(this.f1797a, entry.getKey()) && m68377b(this.f1798b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f1797a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1798b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f1797a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f1798b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1799c.m26466o();
        Object obj2 = this.f1798b;
        this.f1798b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f1797a);
        String valueOf2 = String.valueOf(this.f1798b);
        return valueOf + "=" + valueOf2;
    }
}