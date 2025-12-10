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
    public final long f63687a;

    /* renamed from: b */
    public final long f63688b;

    public TraceId(long j, long j2) {
        this.f63687a = j;
        this.f63688b = j2;
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
        AbstractC10235fb.m31287j(this.f63687a, bArr, i);
        AbstractC10235fb.m31287j(this.f63688b, bArr, i + 8);
    }

    public void copyLowerBase16To(char[] cArr, int i) {
        AbstractC10235fb.m31288i(this.f63687a, cArr, i);
        AbstractC10235fb.m31288i(this.f63688b, cArr, i + 16);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TraceId)) {
            return false;
        }
        TraceId traceId = (TraceId) obj;
        if (this.f63687a == traceId.f63687a && this.f63688b == traceId.f63688b) {
            return true;
        }
        return false;
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[16];
        AbstractC10235fb.m31287j(this.f63687a, bArr, 0);
        AbstractC10235fb.m31287j(this.f63688b, bArr, 8);
        return bArr;
    }

    public long getLowerLong() {
        long j = this.f63687a;
        if (j < 0) {
            return -j;
        }
        return j;
    }

    public int hashCode() {
        long j = this.f63687a;
        long j2 = this.f63688b;
        return ((((int) (j ^ (j >>> 32))) + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean isValid() {
        if (this.f63687a == 0 && this.f63688b == 0) {
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
        long j = this.f63687a;
        long j2 = traceId.f63687a;
        if (j != j2) {
            return j < j2 ? -1 : 1;
        }
        long j3 = this.f63688b;
        long j4 = traceId.f63688b;
        if (j3 == j4) {
            return 0;
        }
        return j3 < j4 ? -1 : 1;
    }

    public static TraceId fromBytes(byte[] bArr, int i) {
        Utils.checkNotNull(bArr, "src");
        return new TraceId(AbstractC10235fb.m31289h(bArr, i), AbstractC10235fb.m31289h(bArr, i + 8));
    }

    public static TraceId fromLowerBase16(CharSequence charSequence, int i) {
        Utils.checkNotNull(charSequence, "src");
        return new TraceId(AbstractC10235fb.m31290g(charSequence, i), AbstractC10235fb.m31290g(charSequence, i + 16));
    }
}
