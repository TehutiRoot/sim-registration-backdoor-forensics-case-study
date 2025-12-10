package io.opencensus.trace;

import io.opencensus.internal.Utils;
import java.util.Random;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public final class TraceId implements Comparable<TraceId> {
    public static final TraceId INVALID = new TraceId(0, 0);
    public static final int SIZE = 16;

    /* renamed from: a */
    public final long f63750a;

    /* renamed from: b */
    public final long f63751b;

    public TraceId(long j, long j2) {
        this.f63750a = j;
        this.f63751b = j2;
    }

    public static TraceId fromBytes(byte[] bArr) {
        Utils.checkNotNull(bArr, "src");
        Utils.checkArgument(bArr.length == 16, "Invalid size: expected %s, got %s", 16, Integer.valueOf(bArr.length));
        return fromBytes(bArr, 0);
    }

    public static TraceId fromLowerBase16(CharSequence charSequence) {
        Utils.checkNotNull(charSequence, "src");
        Utils.checkArgument(charSequence.length() == 32, "Invalid size: expected %s, got %s", 32, Integer.valueOf(charSequence.length()));
        return fromLowerBase16(charSequence, 0);
    }

    public static TraceId generateRandomId(Random random) {
        long nextLong;
        long nextLong2;
        do {
            nextLong = random.nextLong();
            nextLong2 = random.nextLong();
            if (nextLong != 0) {
                break;
            }
        } while (nextLong2 == 0);
        return new TraceId(nextLong, nextLong2);
    }

    public void copyBytesTo(byte[] bArr, int i) {
        AbstractC10232fb.m31503j(this.f63750a, bArr, i);
        AbstractC10232fb.m31503j(this.f63751b, bArr, i + 8);
    }

    public void copyLowerBase16To(char[] cArr, int i) {
        AbstractC10232fb.m31504i(this.f63750a, cArr, i);
        AbstractC10232fb.m31504i(this.f63751b, cArr, i + 16);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TraceId)) {
            return false;
        }
        TraceId traceId = (TraceId) obj;
        if (this.f63750a == traceId.f63750a && this.f63751b == traceId.f63751b) {
            return true;
        }
        return false;
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[16];
        AbstractC10232fb.m31503j(this.f63750a, bArr, 0);
        AbstractC10232fb.m31503j(this.f63751b, bArr, 8);
        return bArr;
    }

    public long getLowerLong() {
        long j = this.f63750a;
        if (j < 0) {
            return -j;
        }
        return j;
    }

    public int hashCode() {
        long j = this.f63750a;
        long j2 = this.f63751b;
        return ((((int) (j ^ (j >>> 32))) + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean isValid() {
        if (this.f63750a == 0 && this.f63751b == 0) {
            return false;
        }
        return true;
    }

    public String toLowerBase16() {
        char[] cArr = new char[32];
        copyLowerBase16To(cArr, 0);
        return new String(cArr);
    }

    public String toString() {
        return "TraceId{traceId=" + toLowerBase16() + "}";
    }

    @Override // java.lang.Comparable
    public int compareTo(TraceId traceId) {
        long j = this.f63750a;
        long j2 = traceId.f63750a;
        if (j != j2) {
            return j < j2 ? -1 : 1;
        }
        long j3 = this.f63751b;
        long j4 = traceId.f63751b;
        if (j3 == j4) {
            return 0;
        }
        return j3 < j4 ? -1 : 1;
    }

    public static TraceId fromBytes(byte[] bArr, int i) {
        Utils.checkNotNull(bArr, "src");
        return new TraceId(AbstractC10232fb.m31505h(bArr, i), AbstractC10232fb.m31505h(bArr, i + 8));
    }

    public static TraceId fromLowerBase16(CharSequence charSequence, int i) {
        Utils.checkNotNull(charSequence, "src");
        return new TraceId(AbstractC10232fb.m31506g(charSequence, i), AbstractC10232fb.m31506g(charSequence, i + 16));
    }
}