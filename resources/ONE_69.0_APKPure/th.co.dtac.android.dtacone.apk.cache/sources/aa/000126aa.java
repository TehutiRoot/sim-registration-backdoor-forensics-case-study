package th.p047co.dtac.android.dtacone.util;

/* renamed from: th.co.dtac.android.dtacone.util.Pair */
/* loaded from: classes8.dex */
public class Pair<V1, V2> {

    /* renamed from: a */
    public Object f87068a;

    /* renamed from: b */
    public Object f87069b;

    public Pair(Object obj, Object obj2) {
        this.f87068a = obj;
        this.f87069b = obj2;
    }

    public static <V1, V2> Pair<V1, V2> create(V1 v1, V2 v2) {
        return new Pair<>(v1, v2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        Object obj2 = this.f87068a;
        if (obj2 == null ? pair.f87068a != null : !obj2.equals(pair.f87068a)) {
            return false;
        }
        Object obj3 = this.f87069b;
        Object obj4 = pair.f87069b;
        if (obj3 != null) {
            return obj3.equals(obj4);
        }
        if (obj4 == null) {
            return true;
        }
        return false;
    }

    public V1 getFirst() {
        return (V1) this.f87068a;
    }

    public V2 getSecond() {
        return (V2) this.f87069b;
    }

    public int hashCode() {
        int i;
        Object obj = this.f87068a;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.f87069b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}