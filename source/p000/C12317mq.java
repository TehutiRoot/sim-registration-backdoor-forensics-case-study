package p000;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedInts;
import com.google.common.primitives.UnsignedLongs;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.SpanId;
import io.opencensus.trace.TraceId;
import io.opencensus.trace.TraceOptions;
import io.opencensus.trace.Tracestate;
import io.opencensus.trace.propagation.SpanContextParseException;
import io.opencensus.trace.propagation.TextFormat;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: mq */
/* loaded from: classes5.dex */
public final class C12317mq extends TextFormat {

    /* renamed from: b */
    public static final List f72051b = Collections.singletonList("X-Cloud-Trace-Context");

    /* renamed from: c */
    public static final TraceOptions f72052c = TraceOptions.builder().setIsSampled(true).build();

    /* renamed from: d */
    public static final TraceOptions f72053d = TraceOptions.DEFAULT;

    /* renamed from: e */
    public static final int f72054e = 3;

    /* renamed from: f */
    public static final Tracestate f72055f = Tracestate.builder().build();

    /* renamed from: b */
    public static SpanId m26189b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        return SpanId.fromBytes(allocate.array());
    }

    /* renamed from: c */
    public static long m26188c(SpanId spanId) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(spanId.getBytes());
        return allocate.getLong(0);
    }

    @Override // io.opencensus.trace.propagation.TextFormat
    public SpanContext extract(Object obj, TextFormat.Getter getter) {
        boolean z;
        int i;
        Preconditions.checkNotNull(obj, "carrier");
        Preconditions.checkNotNull(getter, "getter");
        try {
            String str = getter.get(obj, "X-Cloud-Trace-Context");
            if (str != null && str.length() >= 34) {
                if (str.charAt(32) == '/') {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "Invalid TRACE_ID size");
                TraceId fromLowerBase16 = TraceId.fromLowerBase16(str.subSequence(0, 32));
                int indexOf = str.indexOf(";o=", 32);
                if (indexOf < 0) {
                    i = str.length();
                } else {
                    i = indexOf;
                }
                SpanId m26189b = m26189b(UnsignedLongs.parseUnsignedLong(str.subSequence(33, i).toString(), 10));
                TraceOptions traceOptions = f72053d;
                if (indexOf > 0 && (UnsignedInts.parseUnsignedInt(str.substring(indexOf + f72054e), 10) & 1) != 0) {
                    traceOptions = f72052c;
                }
                return SpanContext.create(fromLowerBase16, m26189b, traceOptions, f72055f);
            }
            throw new SpanContextParseException("Missing or too short header: X-Cloud-Trace-Context");
        } catch (IllegalArgumentException e) {
            throw new SpanContextParseException("Invalid input", e);
        }
    }

    @Override // io.opencensus.trace.propagation.TextFormat
    public List fields() {
        return f72051b;
    }

    @Override // io.opencensus.trace.propagation.TextFormat
    public void inject(SpanContext spanContext, Object obj, TextFormat.Setter setter) {
        String str;
        Preconditions.checkNotNull(spanContext, "spanContext");
        Preconditions.checkNotNull(setter, "setter");
        Preconditions.checkNotNull(obj, "carrier");
        StringBuilder sb = new StringBuilder();
        sb.append(spanContext.getTraceId().toLowerBase16());
        sb.append('/');
        sb.append(UnsignedLongs.toString(m26188c(spanContext.getSpanId())));
        sb.append(";o=");
        if (spanContext.getTraceOptions().isSampled()) {
            str = "1";
        } else {
            str = "0";
        }
        sb.append(str);
        setter.put(obj, "X-Cloud-Trace-Context", sb.toString());
    }
}
