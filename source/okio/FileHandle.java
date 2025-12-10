package okio;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00023\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0011J\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u000e\u001a\u00020 2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010!J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010\n\u001a\u00020&2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010'J\r\u0010(\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020&¢\u0006\u0004\b\"\u0010*J\u001d\u0010$\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b$\u0010+J\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u001fJ/\u0010-\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0014H$¢\u0006\u0004\b-\u0010\u0017J/\u0010.\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0014H$¢\u0006\u0004\b.\u0010\u001dJ\u000f\u0010/\u001a\u00020\u000fH$¢\u0006\u0004\b/\u0010\u001fJ\u0017\u00100\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0007H$¢\u0006\u0004\b0\u0010\u001bJ\u000f\u00101\u001a\u00020\u0007H$¢\u0006\u0004\b1\u0010\u0019J\u000f\u00102\u001a\u00020\u000fH$¢\u0006\u0004\b2\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00104R\u0016\u0010:\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010@\u001a\u00060;j\u0002`<8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, m28850d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "Lokio/Buffer;", "sink", "byteCount", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(JLokio/Buffer;J)J", "source", "", "d", "(JLokio/Buffer;J)V", "", "array", "", "arrayOffset", "read", "(J[BII)I", "size", "()J", "resize", "(J)V", "write", "(J[BII)V", "flush", "()V", "Lokio/Source;", "(J)Lokio/Source;", "position", "(Lokio/Source;)J", "reposition", "(Lokio/Source;J)V", "Lokio/Sink;", "(J)Lokio/Sink;", "appendingSink", "()Lokio/Sink;", "(Lokio/Sink;)J", "(Lokio/Sink;J)V", "close", "protectedRead", "protectedWrite", "protectedFlush", "protectedResize", "protectedSize", "protectedClose", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getReadWrite", "()Z", "closed", OperatorName.CURVE_TO, "I", "openStreamCount", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "okio"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 -Util.kt\nokio/_UtilKt\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n61#4:454\n61#4:455\n61#4:456\n50#5:458\n84#6:460\n84#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
/* loaded from: classes6.dex */
public abstract class FileHandle implements Closeable {

    /* renamed from: a */
    public final boolean f72806a;

    /* renamed from: b */
    public boolean f72807b;

    /* renamed from: c */
    public int f72808c;

    /* renamed from: d */
    public final ReentrantLock f72809d = _JvmPlatformKt.newLock();

    /* renamed from: okio.FileHandle$a */
    /* loaded from: classes6.dex */
    public static final class C12468a implements Sink {

        /* renamed from: a */
        public final FileHandle f72810a;

        /* renamed from: b */
        public long f72811b;

        /* renamed from: c */
        public boolean f72812c;

        public C12468a(FileHandle fileHandle, long j) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f72810a = fileHandle;
            this.f72811b = j;
        }

        /* renamed from: b */
        public final boolean m25849b() {
            return this.f72812c;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f72812c) {
                return;
            }
            this.f72812c = true;
            ReentrantLock lock = this.f72810a.getLock();
            lock.lock();
            try {
                FileHandle fileHandle = this.f72810a;
                fileHandle.f72808c--;
                if (this.f72810a.f72808c == 0 && this.f72810a.f72807b) {
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    this.f72810a.protectedClose();
                }
            } finally {
                lock.unlock();
            }
        }

        /* renamed from: d */
        public final FileHandle m25848d() {
            return this.f72810a;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (!this.f72812c) {
                this.f72810a.protectedFlush();
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        /* renamed from: g */
        public final void m25847g(long j) {
            this.f72811b = j;
        }

        public final long getPosition() {
            return this.f72811b;
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return Timeout.NONE;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!this.f72812c) {
                this.f72810a.m25850d(this.f72811b, source, j);
                this.f72811b += j;
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: okio.FileHandle$b */
    /* loaded from: classes6.dex */
    public static final class C12469b implements Source {

        /* renamed from: a */
        public final FileHandle f72813a;

        /* renamed from: b */
        public long f72814b;

        /* renamed from: c */
        public boolean f72815c;

        public C12469b(FileHandle fileHandle, long j) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f72813a = fileHandle;
            this.f72814b = j;
        }

        /* renamed from: b */
        public final boolean m25846b() {
            return this.f72815c;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f72815c) {
                return;
            }
            this.f72815c = true;
            ReentrantLock lock = this.f72813a.getLock();
            lock.lock();
            try {
                FileHandle fileHandle = this.f72813a;
                fileHandle.f72808c--;
                if (this.f72813a.f72808c == 0 && this.f72813a.f72807b) {
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    this.f72813a.protectedClose();
                }
            } finally {
                lock.unlock();
            }
        }

        /* renamed from: d */
        public final FileHandle m25845d() {
            return this.f72813a;
        }

        /* renamed from: g */
        public final void m25844g(long j) {
            this.f72814b = j;
        }

        public final long getPosition() {
            return this.f72814b;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!this.f72815c) {
                long m25851b = this.f72813a.m25851b(this.f72814b, sink, j);
                if (m25851b != -1) {
                    this.f72814b += m25851b;
                }
                return m25851b;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // okio.Source
        public Timeout timeout() {
            return Timeout.NONE;
        }
    }

    public FileHandle(boolean z) {
        this.f72806a = z;
    }

    public static /* synthetic */ Sink sink$default(FileHandle fileHandle, long j, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 0;
            }
            return fileHandle.sink(j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    public static /* synthetic */ Source source$default(FileHandle fileHandle, long j, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 0;
            }
            return fileHandle.source(j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
    }

    @NotNull
    public final Sink appendingSink() throws IOException {
        return sink(size());
    }

    /* renamed from: b */
    public final long m25851b(long j, Buffer buffer, long j2) {
        int i;
        if (j2 >= 0) {
            long j3 = j2 + j;
            long j4 = j;
            while (true) {
                if (j4 >= j3) {
                    break;
                }
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
                int protectedRead = protectedRead(j4, writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j3 - j4, 8192 - i));
                if (protectedRead == -1) {
                    if (writableSegment$okio.pos == writableSegment$okio.limit) {
                        buffer.head = writableSegment$okio.pop();
                        SegmentPool.recycle(writableSegment$okio);
                    }
                    if (j == j4) {
                        return -1L;
                    }
                } else {
                    writableSegment$okio.limit += protectedRead;
                    long j5 = protectedRead;
                    j4 += j5;
                    buffer.setSize$okio(buffer.size() + j5);
                }
            }
            return j4 - j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f72809d;
        reentrantLock.lock();
        try {
            if (this.f72807b) {
                return;
            }
            this.f72807b = true;
            if (this.f72808c != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            protectedClose();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final void m25850d(long j, Buffer buffer, long j2) {
        _UtilKt.checkOffsetAndCount(buffer.size(), 0L, j2);
        long j3 = j2 + j;
        while (j < j3) {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            int min = (int) Math.min(j3 - j, segment.limit - segment.pos);
            protectedWrite(j, segment.data, segment.pos, min);
            segment.pos += min;
            long j4 = min;
            j += j4;
            buffer.setSize$okio(buffer.size() - j4);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final void flush() throws IOException {
        if (this.f72806a) {
            ReentrantLock reentrantLock = this.f72809d;
            reentrantLock.lock();
            try {
                if (!this.f72807b) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    protectedFlush();
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.f72809d;
    }

    public final boolean getReadWrite() {
        return this.f72806a;
    }

    public final long position(@NotNull Source source) throws IOException {
        long j;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof RealBufferedSource) {
            RealBufferedSource realBufferedSource = (RealBufferedSource) source;
            j = realBufferedSource.bufferField.size();
            source = realBufferedSource.source;
        } else {
            j = 0;
        }
        if ((source instanceof C12469b) && ((C12469b) source).m25845d() == this) {
            C12469b c12469b = (C12469b) source;
            if (!c12469b.m25846b()) {
                return c12469b.getPosition() - j;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("source was not created by this FileHandle".toString());
    }

    public abstract void protectedClose() throws IOException;

    public abstract void protectedFlush() throws IOException;

    public abstract int protectedRead(long j, @NotNull byte[] bArr, int i, int i2) throws IOException;

    public abstract void protectedResize(long j) throws IOException;

    public abstract long protectedSize() throws IOException;

    public abstract void protectedWrite(long j, @NotNull byte[] bArr, int i, int i2) throws IOException;

    public final int read(long j, @NotNull byte[] array, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        ReentrantLock reentrantLock = this.f72809d;
        reentrantLock.lock();
        try {
            if (!this.f72807b) {
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return protectedRead(j, array, i, i2);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void reposition(@NotNull Source source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof RealBufferedSource) {
            RealBufferedSource realBufferedSource = (RealBufferedSource) source;
            Source source2 = realBufferedSource.source;
            if ((source2 instanceof C12469b) && ((C12469b) source2).m25845d() == this) {
                C12469b c12469b = (C12469b) source2;
                if (!c12469b.m25846b()) {
                    long size = realBufferedSource.bufferField.size();
                    long position = j - (c12469b.getPosition() - size);
                    if (0 <= position && position < size) {
                        realBufferedSource.skip(position);
                        return;
                    }
                    realBufferedSource.bufferField.clear();
                    c12469b.m25844g(j);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        } else if ((source instanceof C12469b) && ((C12469b) source).m25845d() == this) {
            C12469b c12469b2 = (C12469b) source;
            if (!c12469b2.m25846b()) {
                c12469b2.m25844g(j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        } else {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
    }

    public final void resize(long j) throws IOException {
        if (this.f72806a) {
            ReentrantLock reentrantLock = this.f72809d;
            reentrantLock.lock();
            try {
                if (!this.f72807b) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    protectedResize(j);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    @NotNull
    public final Sink sink(long j) throws IOException {
        if (this.f72806a) {
            ReentrantLock reentrantLock = this.f72809d;
            reentrantLock.lock();
            try {
                if (!this.f72807b) {
                    this.f72808c++;
                    reentrantLock.unlock();
                    return new C12468a(this, j);
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.f72809d;
        reentrantLock.lock();
        try {
            if (!this.f72807b) {
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return protectedSize();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final Source source(long j) throws IOException {
        ReentrantLock reentrantLock = this.f72809d;
        reentrantLock.lock();
        try {
            if (!this.f72807b) {
                this.f72808c++;
                reentrantLock.unlock();
                return new C12469b(this, j);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void write(long j, @NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (this.f72806a) {
            ReentrantLock reentrantLock = this.f72809d;
            reentrantLock.lock();
            try {
                if (!this.f72807b) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    protectedWrite(j, array, i, i2);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final long read(long j, @NotNull Buffer sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReentrantLock reentrantLock = this.f72809d;
        reentrantLock.lock();
        try {
            if (!this.f72807b) {
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return m25851b(j, sink, j2);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long position(@NotNull Sink sink) throws IOException {
        long j;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink instanceof RealBufferedSink) {
            RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
            j = realBufferedSink.bufferField.size();
            sink = realBufferedSink.sink;
        } else {
            j = 0;
        }
        if ((sink instanceof C12468a) && ((C12468a) sink).m25848d() == this) {
            C12468a c12468a = (C12468a) sink;
            if (!c12468a.m25849b()) {
                return c12468a.getPosition() + j;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
    }

    public final void write(long j, @NotNull Buffer source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f72806a) {
            ReentrantLock reentrantLock = this.f72809d;
            reentrantLock.lock();
            try {
                if (!this.f72807b) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    m25850d(j, source, j2);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final void reposition(@NotNull Sink sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink instanceof RealBufferedSink) {
            RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
            Sink sink2 = realBufferedSink.sink;
            if ((sink2 instanceof C12468a) && ((C12468a) sink2).m25848d() == this) {
                C12468a c12468a = (C12468a) sink2;
                if (!c12468a.m25849b()) {
                    realBufferedSink.emit();
                    c12468a.m25847g(j);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        } else if ((sink instanceof C12468a) && ((C12468a) sink).m25848d() == this) {
            C12468a c12468a2 = (C12468a) sink;
            if (!c12468a2.m25849b()) {
                c12468a2.m25847g(j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        } else {
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
    }
}
