package org.apache.commons.p028io.input;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.input.ReadAheadInputStream;

/* renamed from: org.apache.commons.io.input.ReadAheadInputStream */
/* loaded from: classes6.dex */
public class ReadAheadInputStream extends FilterInputStream {

    /* renamed from: o */
    public static final ThreadLocal f73411o;

    /* renamed from: a */
    public final ReentrantLock f73412a;

    /* renamed from: b */
    public ByteBuffer f73413b;

    /* renamed from: c */
    public ByteBuffer f73414c;

    /* renamed from: d */
    public boolean f73415d;

    /* renamed from: e */
    public boolean f73416e;

    /* renamed from: f */
    public boolean f73417f;

    /* renamed from: g */
    public Throwable f73418g;

    /* renamed from: h */
    public boolean f73419h;

    /* renamed from: i */
    public boolean f73420i;

    /* renamed from: j */
    public boolean f73421j;

    /* renamed from: k */
    public final AtomicBoolean f73422k;

    /* renamed from: l */
    public final ExecutorService f73423l;

    /* renamed from: m */
    public final boolean f73424m;

    /* renamed from: n */
    public final Condition f73425n;

    /* renamed from: org.apache.commons.io.input.ReadAheadInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<ReadAheadInputStream, Builder> {

        /* renamed from: k */
        public ExecutorService f73426k;

        public Builder setExecutorService(ExecutorService executorService) {
            this.f73426k = executorService;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public ReadAheadInputStream get() throws IOException {
            InputStream inputStream = getInputStream();
            int bufferSize = getBufferSize();
            ExecutorService executorService = this.f73426k;
            if (executorService == null) {
                executorService = ReadAheadInputStream.m25081p();
            }
            return new ReadAheadInputStream(inputStream, bufferSize, executorService, this.f73426k == null);
        }
    }

    static {
        ThreadLocal withInitial;
        withInitial = ThreadLocal.withInitial(new Supplier() { // from class: Xr1
            @Override // java.util.function.Supplier
            public final Object get() {
                return ReadAheadInputStream.m25089g();
            }
        });
        f73411o = withInitial;
    }

    /* renamed from: b */
    public static /* synthetic */ void m25091b(ReadAheadInputStream readAheadInputStream, byte[] bArr) {
        readAheadInputStream.m25084m(bArr);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ Thread m25090d(Runnable runnable) {
        return m25082o(runnable);
    }

    /* renamed from: g */
    public static /* synthetic */ byte[] m25089g() {
        return m25083n();
    }

    /* renamed from: n */
    public static /* synthetic */ byte[] m25083n() {
        return new byte[1];
    }

    /* renamed from: o */
    public static Thread m25082o(Runnable runnable) {
        Thread thread = new Thread(runnable, "commons-io-read-ahead");
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: p */
    public static ExecutorService m25081p() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: Wr1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ReadAheadInputStream.m25090d(runnable);
            }
        });
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        this.f73412a.lock();
        try {
            return (int) Math.min(2147483647L, this.f73413b.remaining() + this.f73414c.remaining());
        } finally {
            this.f73412a.unlock();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73412a.lock();
        try {
            if (this.f73419h) {
                return;
            }
            boolean z = true;
            this.f73419h = true;
            if (!this.f73421j) {
                this.f73420i = true;
            } else {
                z = false;
            }
            this.f73412a.unlock();
            if (this.f73424m) {
                try {
                    try {
                        this.f73423l.shutdownNow();
                        this.f73423l.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
                    } finally {
                        if (z) {
                            super.close();
                        }
                    }
                } catch (InterruptedException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException(e.getMessage());
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                }
            }
        } finally {
            this.f73412a.unlock();
        }
    }

    /* renamed from: j */
    public final void m25087j() {
        if (this.f73417f) {
            Throwable th2 = this.f73418g;
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            throw new IOException(this.f73418g);
        }
    }

    /* renamed from: k */
    public final void m25086k() {
        this.f73412a.lock();
        boolean z = false;
        try {
            this.f73421j = false;
            if (this.f73419h) {
                if (!this.f73420i) {
                    z = true;
                }
            }
            if (z) {
                try {
                    super.close();
                } catch (IOException unused) {
                }
            }
        } finally {
            this.f73412a.unlock();
        }
    }

    /* renamed from: l */
    public final boolean m25085l() {
        if (!this.f73413b.hasRemaining() && !this.f73414c.hasRemaining() && this.f73415d) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final /* synthetic */ void m25084m(byte[] bArr) {
        this.f73412a.lock();
        try {
            if (this.f73419h) {
                this.f73416e = false;
                return;
            }
            this.f73421j = true;
            this.f73412a.unlock();
            int length = bArr.length;
            int i = 0;
            int i2 = 0;
            do {
                try {
                    i2 = ((FilterInputStream) this).in.read(bArr, i, length);
                    if (i2 > 0) {
                        i += i2;
                        length -= i2;
                        if (length <= 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    try {
                        if (!(th2 instanceof Error)) {
                            this.f73412a.lock();
                            try {
                                this.f73414c.limit(i);
                                if (i2 >= 0 && !(th2 instanceof EOFException)) {
                                    this.f73417f = true;
                                    this.f73418g = th2;
                                    this.f73416e = false;
                                    m25079r();
                                }
                                this.f73415d = true;
                                this.f73416e = false;
                                m25079r();
                            } finally {
                            }
                        } else {
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        this.f73412a.lock();
                        try {
                            this.f73414c.limit(i);
                            if (i2 >= 0 && !(th2 instanceof EOFException)) {
                                this.f73417f = true;
                                this.f73418g = th2;
                            } else {
                                this.f73415d = true;
                            }
                            this.f73416e = false;
                            m25079r();
                            this.f73412a.unlock();
                            m25086k();
                            throw th3;
                        } finally {
                        }
                    }
                }
            } while (!this.f73422k.get());
            this.f73412a.lock();
            try {
                this.f73414c.limit(i);
                if (i2 < 0) {
                    this.f73415d = true;
                }
                this.f73416e = false;
                m25079r();
                this.f73412a.unlock();
                m25086k();
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: q */
    public final void m25080q() {
        this.f73412a.lock();
        try {
            final byte[] array = this.f73414c.array();
            if (!this.f73415d && !this.f73416e) {
                m25087j();
                this.f73414c.position(0);
                this.f73414c.flip();
                this.f73416e = true;
                this.f73412a.unlock();
                this.f73423l.execute(new Runnable() { // from class: Vr1
                    {
                        ReadAheadInputStream.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ReadAheadInputStream.m25091b(ReadAheadInputStream.this, array);
                    }
                });
            }
        } finally {
            this.f73412a.unlock();
        }
    }

    /* renamed from: r */
    public final void m25079r() {
        this.f73412a.lock();
        try {
            this.f73425n.signalAll();
        } finally {
            this.f73412a.unlock();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f73413b.hasRemaining()) {
            return this.f73413b.get() & 255;
        }
        byte[] bArr = (byte[]) f73411o.get();
        bArr[0] = 0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    /* renamed from: s */
    public final long m25078s(long j) {
        if (this.f73412a.isLocked()) {
            m25076u();
            if (m25085l()) {
                return 0L;
            }
            if (available() >= j) {
                int remaining = ((int) j) - this.f73413b.remaining();
                if (remaining > 0) {
                    this.f73413b.position(0);
                    this.f73413b.flip();
                    ByteBuffer byteBuffer = this.f73414c;
                    byteBuffer.position(remaining + byteBuffer.position());
                    m25077t();
                    m25080q();
                    return j;
                }
                throw new IllegalStateException("Expected toSkip > 0, actual: " + remaining);
            }
            long available = available();
            this.f73413b.position(0);
            this.f73413b.flip();
            this.f73414c.position(0);
            this.f73414c.flip();
            long skip = ((FilterInputStream) this).in.skip(j - available);
            m25080q();
            return available + skip;
        }
        throw new IllegalStateException("Expected stateChangeLock to be locked");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        if (j <= this.f73413b.remaining()) {
            ByteBuffer byteBuffer = this.f73413b;
            byteBuffer.position(((int) j) + byteBuffer.position());
            return j;
        }
        this.f73412a.lock();
        try {
            return m25078s(j);
        } finally {
            this.f73412a.unlock();
        }
    }

    /* renamed from: t */
    public final void m25077t() {
        ByteBuffer byteBuffer = this.f73413b;
        this.f73413b = this.f73414c;
        this.f73414c = byteBuffer;
    }

    /* renamed from: u */
    public final void m25076u() {
        this.f73412a.lock();
        try {
            try {
                this.f73422k.set(true);
                while (this.f73416e) {
                    this.f73425n.await();
                }
                try {
                    this.f73422k.set(false);
                    this.f73412a.unlock();
                    m25087j();
                } finally {
                }
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException(e.getMessage());
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        } catch (Throwable th2) {
            try {
                this.f73422k.set(false);
                throw th2;
            } finally {
            }
        }
    }

    @Deprecated
    public ReadAheadInputStream(InputStream inputStream, int i) {
        this(inputStream, i, m25081p(), true);
    }

    @Deprecated
    public ReadAheadInputStream(InputStream inputStream, int i, ExecutorService executorService) {
        this(inputStream, i, executorService, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadAheadInputStream(InputStream inputStream, int i, ExecutorService executorService, boolean z) {
        super(inputStream);
        Objects.requireNonNull(inputStream, "inputStream");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f73412a = reentrantLock;
        this.f73422k = new AtomicBoolean();
        this.f73425n = reentrantLock.newCondition();
        if (i > 0) {
            Objects.requireNonNull(executorService, "executorService");
            this.f73423l = executorService;
            this.f73424m = z;
            this.f73413b = ByteBuffer.allocate(i);
            this.f73414c = ByteBuffer.allocate(i);
            this.f73413b.flip();
            this.f73414c.flip();
            return;
        }
        throw new IllegalArgumentException("bufferSizeInBytes should be greater than 0, but the value is " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (!this.f73413b.hasRemaining()) {
            this.f73412a.lock();
            try {
                m25076u();
                if (!this.f73414c.hasRemaining()) {
                    m25080q();
                    m25076u();
                    if (m25085l()) {
                        this.f73412a.unlock();
                        return -1;
                    }
                }
                m25077t();
                m25080q();
            } finally {
                this.f73412a.unlock();
            }
        }
        int min = Math.min(i2, this.f73413b.remaining());
        this.f73413b.get(bArr, i, min);
        return min;
    }
}
