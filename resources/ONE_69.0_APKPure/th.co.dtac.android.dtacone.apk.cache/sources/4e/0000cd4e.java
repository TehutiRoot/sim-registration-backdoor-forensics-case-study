package io.opencensus.trace;

import io.opencensus.internal.Utils;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public final class TraceOptions {
    public static final TraceOptions DEFAULT = fromByte((byte) 0);
    public static final int SIZE = 1;

    /* renamed from: a */
    public final byte f63752a;

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public byte f63753a;

        public TraceOptions build() {
            return TraceOptions.fromByte(this.f63753a);
        }

        @Deprecated
        public Builder setIsSampled() {
            return setIsSampled(true);
        }

        public Builder(byte b) {
            this.f63753a = b;
        }

        public Builder setIsSampled(boolean z) {
            if (z) {
                this.f63753a = (byte) (this.f63753a | 1);
            } else {
                this.f63753a = (byte) (this.f63753a & (-2));
            }
            return this;
        }
    }

    public TraceOptions(byte b) {
        this.f63752a = b;
    }

    public static Builder builder() {
        return new Builder((byte) 0);
    }

    public static TraceOptions fromByte(byte b) {
        return new TraceOptions(b);
    }

    @Deprecated
    public static TraceOptions fromBytes(byte[] bArr) {
        Utils.checkNotNull(bArr, "buffer");
        Utils.checkArgument(bArr.length == 1, "Invalid size: expected %s, got %s", 1, Integer.valueOf(bArr.length));
        return fromByte(bArr[0]);
    }

    public static TraceOptions fromLowerBase16(CharSequence charSequence, int i) {
        return new TraceOptions(AbstractC10232fb.m31510c(charSequence, i));
    }

    /* renamed from: a */
    public final boolean m30492a(int i) {
        if ((i & this.f63752a) != 0) {
            return true;
        }
        return false;
    }

    public void copyBytesTo(byte[] bArr, int i) {
        Utils.checkIndex(i, bArr.length);
        bArr[i] = this.f63752a;
    }

    public void copyLowerBase16To(char[] cArr, int i) {
        AbstractC10232fb.m31508e(this.f63752a, cArr, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof TraceOptions) && this.f63752a == ((TraceOptions) obj).f63752a) {
            return true;
        }
        return false;
    }

    public byte getByte() {
        return this.f63752a;
    }

    @Deprecated
    public byte[] getBytes() {
        return new byte[]{this.f63752a};
    }

    public int hashCode() {
        return Arrays.hashCode(new byte[]{this.f63752a});
    }

    public boolean isSampled() {
        return m30492a(1);
    }

    public String toLowerBase16() {
        char[] cArr = new char[2];
        copyLowerBase16To(cArr, 0);
        return new String(cArr);
    }

    public String toString() {
        return "TraceOptions{sampled=" + isSampled() + "}";
    }

    public static Builder builder(TraceOptions traceOptions) {
        return new Builder(traceOptions.f63752a);
    }

    @Deprecated
    public static TraceOptions fromBytes(byte[] bArr, int i) {
        Utils.checkIndex(i, bArr.length);
        return fromByte(bArr[i]);
    }
}