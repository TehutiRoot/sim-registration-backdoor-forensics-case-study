package p000;

/* renamed from: N8 */
/* loaded from: classes5.dex */
public final class C0923N8 extends AbstractC18132Nn1 {

    /* renamed from: a */
    public final double f4017a;

    /* renamed from: b */
    public final long f4018b;

    public C0923N8(double d, long j) {
        this.f4017a = d;
        this.f4018b = j;
    }

    @Override // p000.AbstractC18132Nn1
    /* renamed from: b */
    public long mo67172b() {
        return this.f4018b;
    }

    @Override // p000.AbstractC18132Nn1
    /* renamed from: c */
    public double mo67171c() {
        return this.f4017a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC18132Nn1)) {
            return false;
        }
        AbstractC18132Nn1 abstractC18132Nn1 = (AbstractC18132Nn1) obj;
        if (Double.doubleToLongBits(this.f4017a) == Double.doubleToLongBits(abstractC18132Nn1.mo67171c()) && this.f4018b == abstractC18132Nn1.mo67172b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = ((int) (1000003 ^ ((Double.doubleToLongBits(this.f4017a) >>> 32) ^ Double.doubleToLongBits(this.f4017a)))) * 1000003;
        long j = this.f4018b;
        return (int) (doubleToLongBits ^ (j ^ (j >>> 32)));
    }

    public String toString() {
        return "ProbabilitySampler{probability=" + this.f4017a + ", idUpperBound=" + this.f4018b + "}";
    }
}
