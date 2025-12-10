package th.p047co.dtac.android.dtacone.presenter.stv;

import org.apache.commons.cli.HelpFormatter;

/* renamed from: th.co.dtac.android.dtacone.presenter.stv.PackageKey */
/* loaded from: classes8.dex */
public class PackageKey<K1, K2> {

    /* renamed from: a */
    public Object f86611a;

    /* renamed from: b */
    public Object f86612b;

    public PackageKey(Object obj, Object obj2) {
        this.f86611a = obj;
        this.f86612b = obj2;
    }

    public static <K1, K2> PackageKey<K1, K2> create(K1 k1, K2 k2) {
        return new PackageKey<>(k1, k2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageKey)) {
            return false;
        }
        PackageKey packageKey = (PackageKey) obj;
        Object obj2 = this.f86611a;
        if (obj2 == null ? packageKey.f86611a != null : !obj2.equals(packageKey.f86611a)) {
            return false;
        }
        Object obj3 = this.f86612b;
        Object obj4 = packageKey.f86612b;
        if (obj3 != null) {
            return obj3.equals(obj4);
        }
        if (obj4 == null) {
            return true;
        }
        return false;
    }

    public K2 getUnit() {
        return (K2) this.f86612b;
    }

    public K1 getValue() {
        return (K1) this.f86611a;
    }

    public int hashCode() {
        int i;
        Object obj = this.f86611a;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.f86612b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return this.f86611a + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f86612b;
    }
}