package io.reactivex.schedulers;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class Timed<T> {

    /* renamed from: a */
    public final Object f66387a;

    /* renamed from: b */
    public final long f66388b;

    /* renamed from: c */
    public final TimeUnit f66389c;

    public Timed(@NonNull T t, long j, @NonNull TimeUnit timeUnit) {
        this.f66387a = t;
        this.f66388b = j;
        this.f66389c = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Timed)) {
            return false;
        }
        Timed timed = (Timed) obj;
        if (!ObjectHelper.equals(this.f66387a, timed.f66387a) || this.f66388b != timed.f66388b || !ObjectHelper.equals(this.f66389c, timed.f66389c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        Object obj = this.f66387a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        long j = this.f66388b;
        return (((i * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.f66389c.hashCode();
    }

    public long time() {
        return this.f66388b;
    }

    public String toString() {
        return "Timed[time=" + this.f66388b + ", unit=" + this.f66389c + ", value=" + this.f66387a + "]";
    }

    @NonNull
    public TimeUnit unit() {
        return this.f66389c;
    }

    @NonNull
    public T value() {
        return (T) this.f66387a;
    }

    public long time(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.f66388b, this.f66389c);
    }
}
