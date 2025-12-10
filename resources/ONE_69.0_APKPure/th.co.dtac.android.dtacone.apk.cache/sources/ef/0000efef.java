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
    public static final ThreadLocal f73495o;

    /* renamed from: a */
    public final ReentrantLock f73496a;

    /* renamed from: b */
    public ByteBuffer f73497b;

    /* renamed from: c */
    public ByteBuffer f73498c;

    /* renamed from: d */
    public boolean f73499d;

    /* renamed from: e */
    public boolean f73500e;

    /* renamed from: f */
    public boolean f73501f;

    /* renamed from: g */
    public Throwable f73502g;

    /* renamed from: h */
    public boolean f73503h;

    /* renamed from: i */
    public boolean f73504i;

    /* renamed from: j */
    public boolean f73505j;

    /* renamed from: k */
    public final AtomicBoolean f73506k;

    /* renamed from: l */
    public final ExecutorService f73507l;

    /* renamed from: m */
    public final boolean f73508m;

    /* renamed from: n */
    public final Condition f73509n;

    /* renamed from: org.apache.commons.io.input.ReadAheadInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<ReadAheadInputStream, Builder> {

        /* renamed from: k */
        public ExecutorService f73510k;

        public Builder setExecutorService(ExecutorService executorService) {
            this.f73510k = executorService;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public ReadAheadInputStream get() throws IOException {
            InputStream inputStream = getInputStream();
            int bufferSize = getBufferSize();
            ExecutorService executorService = this.f73510k;
            if (executorService == null) {
                executorService = ReadAheadInputStream.m25271p();
            }
            return new ReadAheadInputStream(inputStream, bufferSize, executorService, this.f73510k == null);
        }
    }

    static {
        ThreadLocal withInitial;
        withInitial = ThreadLocal.withInitial(new Supplier() { // from class: Us1
            @Override // java.util.function.Supplier
            public final Object get() {
                return ReadAheadInputStream.m25279g();
            }
        });
        f73495o = withInitial;
    }

    /* renamed from: b */
    public static /* synthetic */ void m25281b(ReadAheadInputStream readAheadInputStream, byte[] bArr) {
        readAheadInputStream.m25274m(bArr);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ Thread m25280d(Runnable runnable) {
        return m25272o(runnable);
    }

    /* renamed from: g */
    public static /* synthetic */ byte[] m25279g() {
        return m25273n();
    }

    /* renamed from: n */
    public static /* synthetic */ byte[] m25273n() {
        return new byte[1];
    }

    /* renamed from: o */
    public static Thread m25272o(Runnable runnable) {
        Thread thread = new Thread(runnable, "commons-io-read-ahead");
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: p */
    public static ExecutorService m25271p() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: Ts1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ReadAheadInputStream.m25280d(runnable);
            }
        });
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        this.f73496a.lock();
        try {
            return (int) Math.min(2147483647L, this.f73497b.remaining() + this.f73498c.remaining());
        } finally {
            this.f73496a.unlock();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73496a.lock();
        try {
            if (this.f73503h) {
                return;
            }
            boolean z = true;
            this.f73503h = true;
            if (!this.f73505j) {
                this.f73504i = true;
            } else {
                z = false;
            }
            this.f73496a.unlock();
            if (this.f73508m) {
                try {
                    try {
                        this.f73507l.shutdownNow();
                        this.f73507l.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
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
            this.f73496a.unlock();
        }
    }

    /* renamed from: j */
    public final void m25277j() {
        if (this.f73501f) {
            Throwable th2 = this.f73502g;
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            throw new IOException(this.f73502g);
        }
    }

    /* renamed from: k */
    public final void m25276k() {
        this.f73496a.lock();
        boolean z = false;
        try {
            this.f73505j = false;
            if (this.f73503h) {
                if (!this.f73504i) {
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
            this.f73496a.unlock();
        }
    }

    /* renamed from: l */
    public final boolean m25275l() {
        if (!this.f73497b.hasRemaining() && !this.f73498c.hasRemaining() && this.f73499d) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final /* synthetic */ void m25274m(byte[] bArr) {
        this.f73496a.lock();
        try {
            if (this.f73503h) {
                this.f73500e = false;
                return;
            }
            this.f73505j = true;
            this.f73496a.unlock();
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
                            this.f73496a.lock();
                            try {
                                this.f73498c.limit(i);
                                if (i2 >= 0 && !(th2 instanceof EOFException)) {
                                    this.f73501f = true;
                                    this.f73502g = th2;
                                    this.f73500e = false;
                                    m25269r();
                                }
                                this.f73499d = true;
                                this.f73500e = false;
                                m25269r();
                            } finally {
                            }
                        } else {
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        this.f73496a.lock();
                        try {
                            this.f73498c.limit(i);
                            if (i2 >= 0 && !(th2 instanceof EOFException)) {
                                this.f73501f = true;
                                this.f73502g = th2;
                            } else {
                                this.f73499d = true;
                            }
                            this.f73500e = false;
                            m25269r();
                            this.f73496a.unlock();
                            m25276k();
                            throw th3;
                        } finally {
                        }
                    }
                }
            } while (!this.f73506k.get());
            this.f73496a.lock();
            try {
                this.f73498c.limit(i);
                if (i2 < 0) {
                    this.f73499d = true;
                }
                this.f73500e = false;
                m25269r();
                this.f73496a.unlock();
                m25276k();
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: q */
    public final void m25270q() {
        this.f73496a.lock();
        try {
            final byte[] array = this.f73498c.array();
            if (!this.f73499d && !this.f73500e) {
                m25277j();
                this.f73498c.position(0);
                this.f73498c.flip();
                this.f73500e = true;
                this.f73496a.unlock();
                this.f73507l.execute(new Runnable() { // from class: Ss1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReadAheadInputStream.m25281b(ReadAheadInputStream.this, array);
                    }
                });
            }
        } finally {
            this.f73496a.unlock();
        }
    }

    /* renamed from: r */
    public final void m25269r() {
        this.f73496a.lock();
        try {
            this.f73509n.signalAll();
        } finally {
            this.f73496a.unlock();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f73497b.hasRemaining()) {
            return this.f73497b.get() & 255;
        }
        byte[] bArr = (byte[]) f73495o.get();
        bArr[0] = 0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    /* renamed from: s */
    public final long m25268s(long j) {
        if (this.f73496a.isLocked()) {
            m25266u();
            if (m25275l()) {
                return 0L;
            }
            if (available() >= j) {
                int remaining = ((int) j) - this.f73497b.remaining();
                if (remaining > 0) {
                    this.f73497b.position(0);
                    this.f73497b.flip();
                    ByteBuffer byteBuffer = this.f73498c;
                    byteBuffer.position(remaining + byteBuffer.position());
                    m25267t();
                    m25270q();
                    return j;
                }
                throw new IllegalStateException("Expected toSkip > 0, actual: " + remaining);
            }
            long available = available();
            this.f73497b.position(0);
            this.f73497b.flip();
            this.f73498c.position(0);
            this.f73498c.flip();
            long skip = ((FilterInputStream) this).in.skip(j - available);
            m25270q();
            return available + skip;
        }
        throw new IllegalStateException("Expected stateChangeLock to be locked");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        if (j <= this.f73497b.remaining()) {
            ByteBuffer byteBuffer = this.f73497b;
            byteBuffer.position(((int) j) + byteBuffer.position());
            return j;
        }
        this.f73496a.lock();
        try {
            return m25268s(j);
        } finally {
            this.f73496a.unlock();
        }
    }

    /* renamed from: t */
    public final void m25267t() {
        ByteBuffer byteBuffer = this.f73497b;
        this.f73497b = this.f73498c;
        this.f73498c = byteBuffer;
    }

    /* renamed from: u */
    public final void m25266u() {
        this.f73496a.lock();
        try {
            try {
                this.f73506k.set(true);
                while (this.f73500e) {
                    this.f73509n.await();
                }
                try {
                    this.f73506k.set(false);
                    this.f73496a.unlock();
                    m25277j();
                } finally {
                }
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException(e.getMessage());
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        } catch (Throwable th2) {
            try {
                this.f73506k.set(false);
                throw th2;
            } finally {
            }
        }
    }

    @Deprecated
    public ReadAheadInputStream(InputStream inputStream, int i) {
        this(inputStream, i, m25271p(), true);
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
        this.f73496a = reentrantLock;
        this.f73506k = new AtomicBoolean();
        this.f73509n = reentrantLock.newCondition();
        if (i > 0) {
            Objects.requireNonNull(executorService, "executorService");
            this.f73507l = executorService;
            this.f73508m = z;
            this.f73497b = ByteBuffer.allocate(i);
            this.f73498c = ByteBuffer.allocate(i);
            this.f73497b.flip();
            this.f73498c.flip();
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
        if (!this.f73497b.hasRemaining()) {
            this.f73496a.lock();
            try {
                m25266u();
                if (!this.f73498c.hasRemaining()) {
                    m25270q();
                    m25266u();
                    if (m25275l()) {
                        this.f73496a.unlock();
                        return -1;
                    }
                }
                m25267t();
                m25270q();
            } finally {
                this.f73496a.unlock();
            }
        }
        int min = Math.min(i2, this.f73497b.remaining());
        this.f73497b.get(bArr, i, min);
        return min;
    }
}