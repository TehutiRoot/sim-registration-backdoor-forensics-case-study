package p046rx.schedulers;

/* renamed from: rx.schedulers.TimeInterval */
/* loaded from: classes7.dex */
public class TimeInterval<T> {

    /* renamed from: a */
    public final long f79445a;

    /* renamed from: b */
    public final Object f79446b;

    public TimeInterval(long j, T t) {
        this.f79446b = t;
        this.f79445a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeInterval timeInterval = (TimeInterval) obj;
        if (this.f79445a != timeInterval.f79445a) {
            return false;
        }
        Object obj2 = this.f79446b;
        if (obj2 == null) {
            if (timeInterval.f79446b != null) {
                return false;
            }
        } else if (!obj2.equals(timeInterval.f79446b)) {
            return false;
        }
        return true;
    }

    public long getIntervalInMilliseconds() {
        return this.f79445a;
    }

    public T getValue() {
        return (T) this.f79446b;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f79445a;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        Object obj = this.f79446b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return i + hashCode;
    }

    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.f79445a + ", value=" + this.f79446b + "]";
    }
}
