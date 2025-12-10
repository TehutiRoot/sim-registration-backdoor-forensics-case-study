package io.opencensus.trace;

import io.opencensus.internal.Utils;
import java.util.Random;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public final class SpanId implements Comparable<SpanId> {
    public static final SpanId INVALID = new SpanId(0);
    public static final int SIZE = 8;

    /* renamed from: a */
    public final long f63680a;

    public SpanId(long j) {
        this.f63680a = j;
    }

    public static SpanId fromBytes(byte[] bArr) {
        Utils.checkNotNull(bArr, "src");
        Utils.checkArgument(bArr.length == 8, "Invalid size: expected %s, got %s", 8, Integer.valueOf(bArr.length));
        return fromBytes(bArr, 0);
    }

    public static SpanId fromLowerBase16(CharSequence charSequence) {
        Utils.checkNotNull(charSequence, "src");
        Utils.checkArgument(charSequence.length() == 16, "Invalid size: expected %s, got %s", 16, Integer.valueOf(charSequence.length()));
        return fromLowerBase16(charSequence, 0);
    }

    public static SpanId generateRandomId(Random random) {
        long nextLong;
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        return new SpanId(nextLong);
    }

    public void copyBytesTo(byte[] bArr, int i) {
        AbstractC10235fb.m31287j(this.f63680a, bArr, i);
    }

    public void copyLowerBase16To(char[] cArr, int i) {
        AbstractC10235fb.m31288i(this.f63680a, cArr, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof SpanId) && this.f63680a == ((SpanId) obj).f63680a) {
            return true;
        }
        return false;
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[8];
        AbstractC10235fb.m31287j(this.f63680a, bArr, 0);
        return bArr;
    }

    public int hashCode() {
        long j = this.f63680a;
        return (int) (j ^ (j >>> 32));
    }

    public boolean isValid() {
        if (this.f63680a != 0) {
            return true;
        }
        return false;
    }

    public String toLowerBase16() {
        char[] cArr = new char[16];
        copyLowerBase16To(cArr, 0);
        return new String(cArr);
    }

    public String toString() {
        return "SpanId{spanId=" + toLowerBase16() + "}";
    }

    @Override // java.lang.Comparable
    public int compareTo(SpanId spanId) {
        long j = this.f63680a;
        long j2 = spanId.f63680a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static SpanId fromBytes(byte[] bArr, int i) {
        Utils.checkNotNull(bArr, "src");
        return new SpanId(AbstractC10235fb.m31289h(bArr, i));
    }

    public static SpanId fromLowerBase16(CharSequence charSequence, int i) {
        Utils.checkNotNull(charSequence, "src");
        return new SpanId(AbstractC10235fb.m31290g(charSequence, i));
    }
}
