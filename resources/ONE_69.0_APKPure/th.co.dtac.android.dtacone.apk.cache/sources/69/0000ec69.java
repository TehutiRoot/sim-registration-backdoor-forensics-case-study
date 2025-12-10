package p000;

import java.util.Map;

/* renamed from: oH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21452oH2 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f72735a;

    /* renamed from: b */
    public Object f72736b;

    /* renamed from: c */
    public final /* synthetic */ JH2 f72737c;

    public C21452oH2(JH2 jh2, Comparable comparable, Object obj) {
        this.f72737c = jh2;
        this.f72735a = comparable;
        this.f72736b = obj;
    }

    /* renamed from: b */
    public static final boolean m26137b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m26138a() {
        return this.f72735a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f72735a.compareTo(((C21452oH2) obj).f72735a);
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
        if (m26137b(this.f72735a, entry.getKey()) && m26137b(this.f72736b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f72735a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f72736b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f72735a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f72736b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f72737c.m67900o();
        Object obj2 = this.f72736b;
        this.f72736b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f72735a);
        String valueOf2 = String.valueOf(this.f72736b);
        return valueOf + "=" + valueOf2;
    }
}