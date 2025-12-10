package p000;

import ch.qos.logback.core.CoreConstants;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Segment;
import okio.SegmentPool;
import okio.Sink;
import okio.Timeout;
import okio._UtilKt;

/* renamed from: Mg1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18048Mg1 implements Sink {

    /* renamed from: a */
    public final OutputStream f3838a;

    /* renamed from: b */
    public final Timeout f3839b;

    public C18048Mg1(OutputStream out, Timeout timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f3838a = out;
        this.f3839b = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3838a.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f3838a.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f3839b;
    }

    public String toString() {
        return "sink(" + this.f3838a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.Sink
    public void write(Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        _UtilKt.checkOffsetAndCount(source.size(), 0L, j);
        while (j > 0) {
            this.f3839b.throwIfReached();
            Segment segment = source.head;
            Intrinsics.checkNotNull(segment);
            int min = (int) Math.min(j, segment.limit - segment.pos);
            this.f3838a.write(segment.data, segment.pos, min);
            segment.pos += min;
            long j2 = min;
            j -= j2;
            source.setSize$okio(source.size() - j2);
            if (segment.pos == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
