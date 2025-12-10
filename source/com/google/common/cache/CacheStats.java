package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public final class CacheStats {

    /* renamed from: a */
    public final long f52865a;

    /* renamed from: b */
    public final long f52866b;

    /* renamed from: c */
    public final long f52867c;

    /* renamed from: d */
    public final long f52868d;

    /* renamed from: e */
    public final long f52869e;

    /* renamed from: f */
    public final long f52870f;

    public CacheStats(long j, long j2, long j3, long j4, long j5, long j6) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        if (j4 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkArgument(z4);
        if (j5 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Preconditions.checkArgument(z5);
        Preconditions.checkArgument(j6 >= 0);
        this.f52865a = j;
        this.f52866b = j2;
        this.f52867c = j3;
        this.f52868d = j4;
        this.f52869e = j5;
        this.f52870f = j6;
    }

    public double averageLoadPenalty() {
        long saturatedAdd = LongMath.saturatedAdd(this.f52867c, this.f52868d);
        if (saturatedAdd == 0) {
            return 0.0d;
        }
        return this.f52869e / saturatedAdd;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof CacheStats)) {
            return false;
        }
        CacheStats cacheStats = (CacheStats) obj;
        if (this.f52865a != cacheStats.f52865a || this.f52866b != cacheStats.f52866b || this.f52867c != cacheStats.f52867c || this.f52868d != cacheStats.f52868d || this.f52869e != cacheStats.f52869e || this.f52870f != cacheStats.f52870f) {
            return false;
        }
        return true;
    }

    public long evictionCount() {
        return this.f52870f;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f52865a), Long.valueOf(this.f52866b), Long.valueOf(this.f52867c), Long.valueOf(this.f52868d), Long.valueOf(this.f52869e), Long.valueOf(this.f52870f));
    }

    public long hitCount() {
        return this.f52865a;
    }

    public double hitRate() {
        long requestCount = requestCount();
        if (requestCount == 0) {
            return 1.0d;
        }
        return this.f52865a / requestCount;
    }

    public long loadCount() {
        return LongMath.saturatedAdd(this.f52867c, this.f52868d);
    }

    public long loadExceptionCount() {
        return this.f52868d;
    }

    public double loadExceptionRate() {
        long saturatedAdd = LongMath.saturatedAdd(this.f52867c, this.f52868d);
        if (saturatedAdd == 0) {
            return 0.0d;
        }
        return this.f52868d / saturatedAdd;
    }

    public long loadSuccessCount() {
        return this.f52867c;
    }

    public CacheStats minus(CacheStats cacheStats) {
        return new CacheStats(Math.max(0L, LongMath.saturatedSubtract(this.f52865a, cacheStats.f52865a)), Math.max(0L, LongMath.saturatedSubtract(this.f52866b, cacheStats.f52866b)), Math.max(0L, LongMath.saturatedSubtract(this.f52867c, cacheStats.f52867c)), Math.max(0L, LongMath.saturatedSubtract(this.f52868d, cacheStats.f52868d)), Math.max(0L, LongMath.saturatedSubtract(this.f52869e, cacheStats.f52869e)), Math.max(0L, LongMath.saturatedSubtract(this.f52870f, cacheStats.f52870f)));
    }

    public long missCount() {
        return this.f52866b;
    }

    public double missRate() {
        long requestCount = requestCount();
        if (requestCount == 0) {
            return 0.0d;
        }
        return this.f52866b / requestCount;
    }

    public CacheStats plus(CacheStats cacheStats) {
        return new CacheStats(LongMath.saturatedAdd(this.f52865a, cacheStats.f52865a), LongMath.saturatedAdd(this.f52866b, cacheStats.f52866b), LongMath.saturatedAdd(this.f52867c, cacheStats.f52867c), LongMath.saturatedAdd(this.f52868d, cacheStats.f52868d), LongMath.saturatedAdd(this.f52869e, cacheStats.f52869e), LongMath.saturatedAdd(this.f52870f, cacheStats.f52870f));
    }

    public long requestCount() {
        return LongMath.saturatedAdd(this.f52865a, this.f52866b);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("hitCount", this.f52865a).add("missCount", this.f52866b).add("loadSuccessCount", this.f52867c).add("loadExceptionCount", this.f52868d).add("totalLoadTime", this.f52869e).add("evictionCount", this.f52870f).toString();
    }

    public long totalLoadTime() {
        return this.f52869e;
    }
}
