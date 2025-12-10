package org.apache.commons.p028io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.function.Erase;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.input.ProxyInputStream;

/* renamed from: org.apache.commons.io.input.ProxyInputStream */
/* loaded from: classes6.dex */
public abstract class ProxyInputStream extends FilterInputStream {

    /* renamed from: a */
    public boolean f73400a;

    /* renamed from: b */
    public final IOConsumer f73401b;

    /* renamed from: c */
    public final IOIntConsumer f73402c;

    /* renamed from: org.apache.commons.io.input.ProxyInputStream$AbstractBuilder */
    /* loaded from: classes6.dex */
    public static abstract class AbstractBuilder<T, B extends AbstractStreamBuilder<T, B>> extends AbstractStreamBuilder<T, B> {

        /* renamed from: k */
        public IOIntConsumer f73403k;

        public IOIntConsumer getAfterRead() {
            return this.f73403k;
        }

        public B setAfterRead(IOIntConsumer iOIntConsumer) {
            this.f73403k = iOIntConsumer;
            return (B) asThis();
        }
    }

    public ProxyInputStream(AbstractBuilder<?, ?> abstractBuilder) throws IOException {
        this(abstractBuilder.getInputStream(), abstractBuilder);
    }

    public void afterRead(int i) throws IOException {
        this.f73402c.accept(i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (((FilterInputStream) this).in != null && !isClosed()) {
            try {
                return ((FilterInputStream) this).in.available();
            } catch (IOException e) {
                handleIOException(e);
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public void m25092b() {
        AbstractC17721He0.m68061a(!isClosed());
    }

    public void beforeRead(int i) throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOUtils.close(((FilterInputStream) this).in, new IOConsumer() { // from class: So1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ProxyInputStream.this.handleIOException((IOException) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
        this.f73400a = true;
    }

    public void handleIOException(IOException iOException) throws IOException {
        this.f73401b.accept(iOException);
    }

    public boolean isClosed() {
        return this.f73400a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported()) {
            return true;
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = 1;
        try {
            beforeRead(1);
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                i = -1;
            }
            afterRead(i);
            return read;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            handleIOException(e);
            return 0L;
        }
    }

    public InputStream unwrap() {
        return ((FilterInputStream) this).in;
    }

    public ProxyInputStream(InputStream inputStream) {
        super(inputStream);
        this.f73401b = new IOConsumer() { // from class: Ro1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                Erase.rethrow((IOException) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        };
        this.f73402c = IOIntConsumer.NOOP;
    }

    public ProxyInputStream(InputStream inputStream, AbstractBuilder<?, ?> abstractBuilder) {
        super(inputStream);
        this.f73401b = new IOConsumer() { // from class: Ro1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                Erase.rethrow((IOException) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        };
        this.f73402c = abstractBuilder.getAfterRead() != null ? abstractBuilder.getAfterRead() : IOIntConsumer.NOOP;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            beforeRead(IOUtils.length(bArr));
            int read = ((FilterInputStream) this).in.read(bArr);
            afterRead(read);
            return read;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            beforeRead(i2);
            int read = ((FilterInputStream) this).in.read(bArr, i, i2);
            afterRead(read);
            return read;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }
}
