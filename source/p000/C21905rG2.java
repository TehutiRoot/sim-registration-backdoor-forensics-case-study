package p000;

import java.util.Map;

/* renamed from: rG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21905rG2 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f77223a;

    /* renamed from: b */
    public Object f77224b;

    /* renamed from: c */
    public final /* synthetic */ MG2 f77225c;

    public C21905rG2(MG2 mg2, Comparable comparable, Object obj) {
        this.f77225c = mg2;
        this.f77223a = comparable;
        this.f77224b = obj;
    }

    /* renamed from: b */
    public static final boolean m23349b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m23350a() {
        return this.f77223a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f77223a.compareTo(((C21905rG2) obj).f77223a);
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
        if (m23349b(this.f77223a, entry.getKey()) && m23349b(this.f77224b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f77223a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f77224b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f77223a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f77224b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f77225c.m67406o();
        Object obj2 = this.f77224b;
        this.f77224b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f77223a);
        String valueOf2 = String.valueOf(this.f77224b);
        return valueOf + "=" + valueOf2;
    }
}
