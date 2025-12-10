package p000;

import java.util.Map;

/* renamed from: UM2 */
/* loaded from: classes3.dex */
public final class UM2 implements Comparable, Map.Entry {

    /* renamed from: a */
    public final Comparable f6622a;

    /* renamed from: b */
    public Object f6623b;

    /* renamed from: c */
    public final /* synthetic */ PM2 f6624c;

    public UM2(PM2 pm2, Map.Entry entry) {
        this(pm2, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public static boolean m66204a(Object obj, Object obj2) {
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
        return ((Comparable) getKey()).compareTo((Comparable) ((UM2) obj).getKey());
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
        if (m66204a(this.f6622a, entry.getKey()) && m66204a(this.f6623b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f6622a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6623b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f6622a;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f6623b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6624c.m66972q();
        Object obj2 = this.f6623b;
        this.f6623b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6622a);
        String valueOf2 = String.valueOf(this.f6623b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public UM2(PM2 pm2, Comparable comparable, Object obj) {
        this.f6624c = pm2;
        this.f6622a = comparable;
        this.f6623b = obj;
    }
}