package okio;

import android.support.p001v4.media.session.PlaybackStateCompat;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J+\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u0013\u0010\u001b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m28850d2 = {"Lokio/Throttler;", "", "", "allocatedUntil", "<init>", "(J)V", "()V", "bytesPerSecond", "waitByteCount", "maxByteCount", "", "(JJJ)V", "byteCount", "take$okio", "(J)J", "take", "now", "byteCountOrWaitNanos$okio", "(JJ)J", "byteCountOrWaitNanos", "Lokio/Source;", "source", "(Lokio/Source;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Sink;)Lokio/Sink;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CURVE_TO, "d", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", OperatorName.FILL_NON_ZERO, "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "condition", "okio"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Throttler {

    /* renamed from: a */
    public long f72874a;

    /* renamed from: b */
    public long f72875b;

    /* renamed from: c */
    public long f72876c;

    /* renamed from: d */
    public long f72877d;

    /* renamed from: e */
    public final ReentrantLock f72878e;

    /* renamed from: f */
    public final Condition f72879f;

    public Throttler(long j) {
        this.f72874a = j;
        this.f72876c = 8192L;
        this.f72877d = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f72878e = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "lock.newCondition()");
        this.f72879f = newCondition;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j, long j2, long j3, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = throttler.f72876c;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = throttler.f72877d;
        }
        throttler.bytesPerSecond(j, j4, j3);
    }

    /* renamed from: a */
    public final long m25826a(long j) {
        return (j * 1000000000) / this.f72875b;
    }

    /* renamed from: b */
    public final long m25825b(long j) {
        return (j * this.f72875b) / 1000000000;
    }

    public final long byteCountOrWaitNanos$okio(long j, long j2) {
        if (this.f72875b == 0) {
            return j2;
        }
        long max = Math.max(this.f72874a - j, 0L);
        long m25825b = this.f72877d - m25825b(max);
        if (m25825b >= j2) {
            this.f72874a = j + max + m25826a(j2);
            return j2;
        }
        long j3 = this.f72876c;
        if (m25825b >= j3) {
            this.f72874a = j + m25826a(this.f72877d);
            return m25825b;
        }
        long min = Math.min(j3, j2);
        long m25826a = max + m25826a(min - this.f72877d);
        if (m25826a == 0) {
            this.f72874a = j + m25826a(this.f72877d);
            return min;
        }
        return -m25826a;
    }

    @JvmOverloads
    public final void bytesPerSecond(long j) {
        bytesPerSecond$default(this, j, 0L, 0L, 6, null);
    }

    @NotNull
    public final Condition getCondition() {
        return this.f72879f;
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.f72878e;
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new ForwardingSink(sink) { // from class: okio.Throttler$sink$1
            @Override // okio.ForwardingSink, okio.Sink
            public void write(@NotNull Buffer source, long j) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                while (j > 0) {
                    try {
                        long take$okio = this.take$okio(j);
                        super.write(source, take$okio);
                        j -= take$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new ForwardingSource(source) { // from class: okio.Throttler$source$1
            @Override // okio.ForwardingSource, okio.Source
            public long read(@NotNull Buffer sink, long j) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    return super.read(sink, this.take$okio(j));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long j) {
        if (j > 0) {
            ReentrantLock reentrantLock = this.f72878e;
            reentrantLock.lock();
            while (true) {
                try {
                    long byteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), j);
                    if (byteCountOrWaitNanos$okio >= 0) {
                        return byteCountOrWaitNanos$okio;
                    }
                    this.f72879f.awaitNanos(-byteCountOrWaitNanos$okio);
                } finally {
                    reentrantLock.unlock();
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @JvmOverloads
    public final void bytesPerSecond(long j, long j2) {
        bytesPerSecond$default(this, j, j2, 0L, 4, null);
    }

    @JvmOverloads
    public final void bytesPerSecond(long j, long j2, long j3) {
        ReentrantLock reentrantLock = this.f72878e;
        reentrantLock.lock();
        try {
            if (j < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j2 <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j3 >= j2) {
                this.f72875b = j;
                this.f72876c = j2;
                this.f72877d = j3;
                this.f72879f.signalAll();
                Unit unit = Unit.INSTANCE;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public Throttler() {
        this(System.nanoTime());
    }
}
