package io.reactivex.schedulers;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class Timed<T> {

    /* renamed from: a */
    public final Object f66450a;

    /* renamed from: b */
    public final long f66451b;

    /* renamed from: c */
    public final TimeUnit f66452c;

    public Timed(@NonNull T t, long j, @NonNull TimeUnit timeUnit) {
        this.f66450a = t;
        this.f66451b = j;
        this.f66452c = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Timed)) {
            return false;
        }
        Timed timed = (Timed) obj;
        if (!ObjectHelper.equals(this.f66450a, timed.f66450a) || this.f66451b != timed.f66451b || !ObjectHelper.equals(this.f66452c, timed.f66452c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        Object obj = this.f66450a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        long j = this.f66451b;
        return (((i * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.f66452c.hashCode();
    }

    public long time() {
        return this.f66451b;
    }

    public String toString() {
        return "Timed[time=" + this.f66451b + ", unit=" + this.f66452c + ", value=" + this.f66450a + "]";
    }

    @NonNull
    public TimeUnit unit() {
        return this.f66452c;
    }

    @NonNull
    public T value() {
        return (T) this.f66450a;
    }

    public long time(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.f66451b, this.f66452c);
    }
}