package okio;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010,\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R$\u00101\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\nR\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00068G¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\b\u0007\u0010\fR\u0017\u0010\u0010\u001a\u00020\r8G¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b\u0010\u0010\u000f¨\u0006A"}, m28850d2 = {"Lokio/Pipe;", "", "", "maxBufferSize", "<init>", "(J)V", "Lokio/Sink;", "sink", "", "fold", "(Lokio/Sink;)V", "-deprecated_sink", "()Lokio/Sink;", "Lokio/Source;", "-deprecated_source", "()Lokio/Source;", "source", "cancel", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getMaxBufferSize$okio", "()J", "Lokio/Buffer;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "buffer", "", OperatorName.CURVE_TO, "Z", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "canceled", "d", "getSinkClosed$okio", "setSinkClosed$okio", "sinkClosed", "e", "getSourceClosed$okio", "setSourceClosed$okio", "sourceClosed", OperatorName.FILL_NON_ZERO, "Lokio/Sink;", "getFoldedSink$okio", "setFoldedSink$okio", "foldedSink", "Ljava/util/concurrent/locks/ReentrantLock;", OperatorName.NON_STROKING_GRAY, "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", OperatorName.CLOSE_PATH, "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "condition", "i", OperatorName.SET_LINE_JOINSTYLE, "Lokio/Source;", "okio"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n268#3,26:259\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n217#1:259,26\n*E\n"})
/* loaded from: classes6.dex */
public final class Pipe {

    /* renamed from: a */
    public final long f72854a;

    /* renamed from: b */
    public final Buffer f72855b = new Buffer();

    /* renamed from: c */
    public boolean f72856c;

    /* renamed from: d */
    public boolean f72857d;

    /* renamed from: e */
    public boolean f72858e;

    /* renamed from: f */
    public Sink f72859f;

    /* renamed from: g */
    public final ReentrantLock f72860g;

    /* renamed from: h */
    public final Condition f72861h;

    /* renamed from: i */
    public final Sink f72862i;

    /* renamed from: j */
    public final Source f72863j;

    public Pipe(long j) {
        this.f72854a = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f72860g = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "lock.newCondition()");
        this.f72861h = newCondition;
        if (j >= 1) {
            this.f72862i = new Sink() { // from class: okio.Pipe$sink$1

                /* renamed from: a */
                public final Timeout f72864a = new Timeout();

                @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (pipe.getSinkClosed$okio()) {
                            lock.unlock();
                            return;
                        }
                        Sink foldedSink$okio = pipe.getFoldedSink$okio();
                        if (foldedSink$okio == null) {
                            if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                                throw new IOException("source is closed");
                            }
                            pipe.setSinkClosed$okio(true);
                            pipe.getCondition().signalAll();
                            foldedSink$okio = null;
                        }
                        Unit unit = Unit.INSTANCE;
                        lock.unlock();
                        if (foldedSink$okio != null) {
                            Pipe pipe2 = Pipe.this;
                            Timeout timeout = foldedSink$okio.timeout();
                            Timeout timeout2 = pipe2.sink().timeout();
                            long timeoutNanos = timeout.timeoutNanos();
                            long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            timeout.timeout(minTimeout, timeUnit);
                            if (timeout.hasDeadline()) {
                                long deadlineNanoTime = timeout.deadlineNanoTime();
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                                }
                                try {
                                    foldedSink$okio.close();
                                    timeout.timeout(timeoutNanos, timeUnit);
                                    if (timeout2.hasDeadline()) {
                                        timeout.deadlineNanoTime(deadlineNanoTime);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.hasDeadline()) {
                                        timeout.deadlineNanoTime(deadlineNanoTime);
                                    }
                                    throw th2;
                                }
                            }
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.close();
                                timeout.timeout(timeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                            } catch (Throwable th3) {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        lock.unlock();
                        throw th4;
                    }
                }

                @Override // okio.Sink, java.io.Flushable
                public void flush() {
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (!pipe.getSinkClosed$okio()) {
                            if (!pipe.getCanceled$okio()) {
                                Sink foldedSink$okio = pipe.getFoldedSink$okio();
                                if (foldedSink$okio == null) {
                                    if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                                        throw new IOException("source is closed");
                                    }
                                    foldedSink$okio = null;
                                }
                                Unit unit = Unit.INSTANCE;
                                lock.unlock();
                                if (foldedSink$okio != null) {
                                    Pipe pipe2 = Pipe.this;
                                    Timeout timeout = foldedSink$okio.timeout();
                                    Timeout timeout2 = pipe2.sink().timeout();
                                    long timeoutNanos = timeout.timeoutNanos();
                                    long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                    timeout.timeout(minTimeout, timeUnit);
                                    if (timeout.hasDeadline()) {
                                        long deadlineNanoTime = timeout.deadlineNanoTime();
                                        if (timeout2.hasDeadline()) {
                                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                                        }
                                        try {
                                            foldedSink$okio.flush();
                                            timeout.timeout(timeoutNanos, timeUnit);
                                            if (timeout2.hasDeadline()) {
                                                timeout.deadlineNanoTime(deadlineNanoTime);
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th2) {
                                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                            if (timeout2.hasDeadline()) {
                                                timeout.deadlineNanoTime(deadlineNanoTime);
                                            }
                                            throw th2;
                                        }
                                    }
                                    if (timeout2.hasDeadline()) {
                                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                                    }
                                    try {
                                        foldedSink$okio.flush();
                                        timeout.timeout(timeoutNanos, timeUnit);
                                        if (timeout2.hasDeadline()) {
                                            timeout.clearDeadline();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th3) {
                                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                        if (timeout2.hasDeadline()) {
                                            timeout.clearDeadline();
                                        }
                                        throw th3;
                                    }
                                }
                                return;
                            }
                            throw new IOException("canceled");
                        }
                        throw new IllegalStateException("closed".toString());
                    } catch (Throwable th4) {
                        lock.unlock();
                        throw th4;
                    }
                }

                @Override // okio.Sink
                @NotNull
                public Timeout timeout() {
                    return this.f72864a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
                    r1 = kotlin.Unit.INSTANCE;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
                    r0.unlock();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
                    if (r2 == null) goto L71;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
                    r0 = r12.f72865b;
                    r1 = r2.timeout();
                    r0 = r0.sink().timeout();
                    r3 = r1.timeoutNanos();
                    r5 = okio.Timeout.Companion.minTimeout(r0.timeoutNanos(), r1.timeoutNanos());
                    r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
                    r1.timeout(r5, r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
                    if (r1.hasDeadline() == false) goto L55;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
                    r5 = r1.deadlineNanoTime();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
                    if (r0.hasDeadline() == false) goto L42;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
                    r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
                    r2.write(r13, r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
                    r1.timeout(r3, r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
                    if (r0.hasDeadline() == false) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
                    r1.deadlineNanoTime(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x00d5, code lost:
                    r13 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
                    r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
                    if (r0.hasDeadline() != false) goto L53;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
                    r1.deadlineNanoTime(r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
                    throw r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
                    if (r0.hasDeadline() == false) goto L58;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
                    r1.deadlineNanoTime(r0.deadlineNanoTime());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
                    r2.write(r13, r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
                    r1.timeout(r3, r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
                    if (r0.hasDeadline() == false) goto L64;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
                    r1.clearDeadline();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
                    r13 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
                    r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
                    if (r0.hasDeadline() != false) goto L69;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x010e, code lost:
                    r1.clearDeadline();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
                    throw r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
                    return;
                 */
                @Override // okio.Sink
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void write(@org.jetbrains.annotations.NotNull okio.Buffer r13, long r14) {
                    /*
                        Method dump skipped, instructions count: 297
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: okio.Pipe$sink$1.write(okio.Buffer, long):void");
                }
            };
            this.f72863j = new Source() { // from class: okio.Pipe$source$1

                /* renamed from: a */
                public final Timeout f72866a = new Timeout();

                @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        pipe.setSourceClosed$okio(true);
                        pipe.getCondition().signalAll();
                        Unit unit = Unit.INSTANCE;
                    } finally {
                        lock.unlock();
                    }
                }

                @Override // okio.Source
                public long read(@NotNull Buffer sink, long j2) {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    ReentrantLock lock = Pipe.this.getLock();
                    Pipe pipe = Pipe.this;
                    lock.lock();
                    try {
                        if (!pipe.getSourceClosed$okio()) {
                            if (!pipe.getCanceled$okio()) {
                                while (pipe.getBuffer$okio().size() == 0) {
                                    if (pipe.getSinkClosed$okio()) {
                                        lock.unlock();
                                        return -1L;
                                    }
                                    this.f72866a.awaitSignal(pipe.getCondition());
                                    if (pipe.getCanceled$okio()) {
                                        throw new IOException("canceled");
                                    }
                                }
                                long read = pipe.getBuffer$okio().read(sink, j2);
                                pipe.getCondition().signalAll();
                                lock.unlock();
                                return read;
                            }
                            throw new IOException("canceled");
                        }
                        throw new IllegalStateException("closed".toString());
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                }

                @Override // okio.Source
                @NotNull
                public Timeout timeout() {
                    return this.f72866a;
                }
            };
            return;
        }
        throw new IllegalArgumentException(("maxBufferSize < 1: " + j).toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sink", imports = {}))
    @JvmName(name = "-deprecated_sink")
    @NotNull
    /* renamed from: -deprecated_sink  reason: not valid java name */
    public final Sink m74919deprecated_sink() {
        return this.f72862i;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "source", imports = {}))
    @JvmName(name = "-deprecated_source")
    @NotNull
    /* renamed from: -deprecated_source  reason: not valid java name */
    public final Source m74920deprecated_source() {
        return this.f72863j;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.f72860g;
        reentrantLock.lock();
        try {
            this.f72856c = true;
            this.f72855b.clear();
            this.f72861h.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void fold(@NotNull Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        while (true) {
            this.f72860g.lock();
            try {
                if (this.f72859f == null) {
                    if (!this.f72856c) {
                        if (this.f72855b.exhausted()) {
                            this.f72858e = true;
                            this.f72859f = sink;
                            return;
                        }
                        boolean z = this.f72857d;
                        Buffer buffer = new Buffer();
                        Buffer buffer2 = this.f72855b;
                        buffer.write(buffer2, buffer2.size());
                        this.f72861h.signalAll();
                        Unit unit = Unit.INSTANCE;
                        try {
                            sink.write(buffer, buffer.size());
                            if (z) {
                                sink.close();
                            } else {
                                sink.flush();
                            }
                        } catch (Throwable th2) {
                            this.f72860g.lock();
                            try {
                                this.f72858e = true;
                                this.f72861h.signalAll();
                                Unit unit2 = Unit.INSTANCE;
                                throw th2;
                            } finally {
                            }
                        }
                    } else {
                        this.f72859f = sink;
                        throw new IOException("canceled");
                    }
                } else {
                    throw new IllegalStateException("sink already folded".toString());
                }
            } finally {
            }
        }
    }

    @NotNull
    public final Buffer getBuffer$okio() {
        return this.f72855b;
    }

    public final boolean getCanceled$okio() {
        return this.f72856c;
    }

    @NotNull
    public final Condition getCondition() {
        return this.f72861h;
    }

    @Nullable
    public final Sink getFoldedSink$okio() {
        return this.f72859f;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.f72860g;
    }

    public final long getMaxBufferSize$okio() {
        return this.f72854a;
    }

    public final boolean getSinkClosed$okio() {
        return this.f72857d;
    }

    public final boolean getSourceClosed$okio() {
        return this.f72858e;
    }

    public final void setCanceled$okio(boolean z) {
        this.f72856c = z;
    }

    public final void setFoldedSink$okio(@Nullable Sink sink) {
        this.f72859f = sink;
    }

    public final void setSinkClosed$okio(boolean z) {
        this.f72857d = z;
    }

    public final void setSourceClosed$okio(boolean z) {
        this.f72858e = z;
    }

    @JvmName(name = "sink")
    @NotNull
    public final Sink sink() {
        return this.f72862i;
    }

    @JvmName(name = "source")
    @NotNull
    public final Source source() {
        return this.f72863j;
    }
}
