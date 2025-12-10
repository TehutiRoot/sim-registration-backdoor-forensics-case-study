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

/* renamed from: Jh1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17891Jh1 implements Sink {

    /* renamed from: a */
    public final OutputStream f3075a;

    /* renamed from: b */
    public final Timeout f3076b;

    public C17891Jh1(OutputStream out, Timeout timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f3075a = out;
        this.f3076b = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3075a.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f3075a.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.f3076b;
    }

    public String toString() {
        return "sink(" + this.f3075a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.Sink
    public void write(Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        _UtilKt.checkOffsetAndCount(source.size(), 0L, j);
        while (j > 0) {
            this.f3076b.throwIfReached();
            Segment segment = source.head;
            Intrinsics.checkNotNull(segment);
            int min = (int) Math.min(j, segment.limit - segment.pos);
            this.f3075a.write(segment.data, segment.pos, min);
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