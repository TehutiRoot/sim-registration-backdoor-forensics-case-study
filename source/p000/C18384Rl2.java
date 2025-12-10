package p000;

import java.util.Map;

/* renamed from: Rl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18384Rl2 implements Comparable, Map.Entry {

    /* renamed from: a */
    public final Comparable f5417a;

    /* renamed from: b */
    public Object f5418b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC20264hl2 f5419c;

    public C18384Rl2(AbstractC20264hl2 abstractC20264hl2, Comparable comparable, Object obj) {
        this.f5419c = abstractC20264hl2;
        this.f5417a = comparable;
        this.f5418b = obj;
    }

    /* renamed from: a */
    public static boolean m66417a(Object obj, Object obj2) {
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
        return ((Comparable) getKey()).compareTo((Comparable) ((C18384Rl2) obj).getKey());
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
        if (m66417a(this.f5417a, entry.getKey()) && m66417a(this.f5418b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f5417a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5418b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f5417a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f5418b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5419c.m30752p();
        Object obj2 = this.f5418b;
        this.f5418b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5417a);
        String valueOf2 = String.valueOf(this.f5418b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public C18384Rl2(AbstractC20264hl2 abstractC20264hl2, Map.Entry entry) {
        this(abstractC20264hl2, (Comparable) entry.getKey(), entry.getValue());
    }
}
