package io.opencensus.trace.propagation;

import io.opencensus.internal.Utils;
import io.opencensus.trace.SpanContext;
import java.text.ParseException;

/* loaded from: classes5.dex */
public abstract class BinaryFormat {

    /* renamed from: a */
    public static final C10735b f63783a = new C10735b();

    /* renamed from: io.opencensus.trace.propagation.BinaryFormat$b */
    /* loaded from: classes5.dex */
    public static final class C10735b extends BinaryFormat {
        @Override // io.opencensus.trace.propagation.BinaryFormat
        public SpanContext fromByteArray(byte[] bArr) {
            Utils.checkNotNull(bArr, "bytes");
            return SpanContext.INVALID;
        }

        @Override // io.opencensus.trace.propagation.BinaryFormat
        public byte[] toByteArray(SpanContext spanContext) {
            Utils.checkNotNull(spanContext, "spanContext");
            return new byte[0];
        }

        public C10735b() {
        }
    }

    /* renamed from: a */
    public static BinaryFormat m30130a() {
        return f63783a;
    }

    @Deprecated
    public SpanContext fromBinaryValue(byte[] bArr) throws ParseException {
        try {
            return fromByteArray(bArr);
        } catch (SpanContextParseException e) {
            throw new ParseException(e.toString(), 0);
        }
    }

    public SpanContext fromByteArray(byte[] bArr) throws SpanContextParseException {
        try {
            return fromBinaryValue(bArr);
        } catch (ParseException e) {
            throw new SpanContextParseException("Error while parsing.", e);
        }
    }

    @Deprecated
    public byte[] toBinaryValue(SpanContext spanContext) {
        return toByteArray(spanContext);
    }

    public byte[] toByteArray(SpanContext spanContext) {
        return toBinaryValue(spanContext);
    }
}
