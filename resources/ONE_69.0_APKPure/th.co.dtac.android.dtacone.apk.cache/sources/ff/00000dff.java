package p000;

import java.util.Map;

/* renamed from: Om2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18232Om2 implements Comparable, Map.Entry {

    /* renamed from: a */
    public final Comparable f4530a;

    /* renamed from: b */
    public Object f4531b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC19802em2 f4532c;

    public C18232Om2(AbstractC19802em2 abstractC19802em2, Comparable comparable, Object obj) {
        this.f4532c = abstractC19802em2;
        this.f4530a = comparable;
        this.f4531b = obj;
    }

    /* renamed from: a */
    public static boolean m67081a(Object obj, Object obj2) {
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
        return ((Comparable) getKey()).compareTo((Comparable) ((C18232Om2) obj).getKey());
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
        if (m67081a(this.f4530a, entry.getKey()) && m67081a(this.f4531b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f4530a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4531b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f4530a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f4531b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4532c.m31621p();
        Object obj2 = this.f4531b;
        this.f4531b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4530a);
        String valueOf2 = String.valueOf(this.f4531b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public C18232Om2(AbstractC19802em2 abstractC19802em2, Map.Entry entry) {
        this(abstractC19802em2, (Comparable) entry.getKey(), entry.getValue());
    }
}