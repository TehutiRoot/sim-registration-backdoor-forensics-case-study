package p000;

import com.github.gcacace.signaturepad.utils.TimedPoint;

/* renamed from: MQ1 */
/* loaded from: classes3.dex */
public class MQ1 {

    /* renamed from: a */
    public final Integer f3891a;

    /* renamed from: b */
    public final Integer f3892b;

    public MQ1(TimedPoint timedPoint) {
        this.f3891a = Integer.valueOf(Math.round(timedPoint.f43768x));
        this.f3892b = Integer.valueOf(Math.round(timedPoint.f43769y));
    }

    /* renamed from: a */
    public String m67369a() {
        return this.f3891a + "," + this.f3892b;
    }

    /* renamed from: b */
    public String m67368b(MQ1 mq1) {
        return new MQ1(this.f3891a.intValue() - mq1.f3891a.intValue(), this.f3892b.intValue() - mq1.f3892b.intValue()).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MQ1 mq1 = (MQ1) obj;
        if (!this.f3891a.equals(mq1.f3891a)) {
            return false;
        }
        return this.f3892b.equals(mq1.f3892b);
    }

    public int hashCode() {
        return (this.f3891a.hashCode() * 31) + this.f3892b.hashCode();
    }

    public String toString() {
        return m67369a();
    }

    public MQ1(int i, int i2) {
        this.f3891a = Integer.valueOf(i);
        this.f3892b = Integer.valueOf(i2);
    }
}