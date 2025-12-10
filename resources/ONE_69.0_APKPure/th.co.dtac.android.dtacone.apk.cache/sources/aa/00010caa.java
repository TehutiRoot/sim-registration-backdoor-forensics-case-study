package p046rx.schedulers;

/* renamed from: rx.schedulers.Timestamped */
/* loaded from: classes7.dex */
public final class Timestamped<T> {

    /* renamed from: a */
    public final long f79653a;

    /* renamed from: b */
    public final Object f79654b;

    public Timestamped(long j, T t) {
        this.f79654b = t;
        this.f79653a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Timestamped)) {
            return false;
        }
        Timestamped timestamped = (Timestamped) obj;
        if (this.f79653a == timestamped.f79653a) {
            Object obj2 = this.f79654b;
            Object obj3 = timestamped.f79654b;
            if (obj2 == obj3) {
                return true;
            }
            if (obj2 != null && obj2.equals(obj3)) {
                return true;
            }
        }
        return false;
    }

    public long getTimestampMillis() {
        return this.f79653a;
    }

    public T getValue() {
        return (T) this.f79654b;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f79653a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        Object obj = this.f79654b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return i + hashCode;
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.f79653a), this.f79654b.toString());
    }
}