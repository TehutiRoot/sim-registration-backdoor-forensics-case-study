package p000;

import com.github.gcacace.signaturepad.utils.TimedPoint;

/* renamed from: PP1 */
/* loaded from: classes3.dex */
public class PP1 {

    /* renamed from: a */
    public final Integer f4737a;

    /* renamed from: b */
    public final Integer f4738b;

    public PP1(TimedPoint timedPoint) {
        this.f4737a = Integer.valueOf(Math.round(timedPoint.f43756x));
        this.f4738b = Integer.valueOf(Math.round(timedPoint.f43757y));
    }

    /* renamed from: a */
    public String m66799a() {
        return this.f4737a + "," + this.f4738b;
    }

    /* renamed from: b */
    public String m66798b(PP1 pp1) {
        return new PP1(this.f4737a.intValue() - pp1.f4737a.intValue(), this.f4738b.intValue() - pp1.f4738b.intValue()).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PP1 pp1 = (PP1) obj;
        if (!this.f4737a.equals(pp1.f4737a)) {
            return false;
        }
        return this.f4738b.equals(pp1.f4738b);
    }

    public int hashCode() {
        return (this.f4737a.hashCode() * 31) + this.f4738b.hashCode();
    }

    public String toString() {
        return m66799a();
    }

    public PP1(int i, int i2) {
        this.f4737a = Integer.valueOf(i);
        this.f4738b = Integer.valueOf(i2);
    }
}
