package ch.qos.logback.core;

import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.spi.DeferredProcessingAware;
import ch.qos.logback.core.status.ErrorStatus;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class OutputStreamAppender<E> extends UnsynchronizedAppenderBase<E> {
    protected Encoder<E> encoder;

    /* renamed from: g */
    public OutputStream f39728g;
    protected final ReentrantLock lock = new ReentrantLock(false);

    /* renamed from: h */
    public boolean f39729h = true;

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(E e) {
        if (isStarted()) {
            subAppend(e);
        }
    }

    /* renamed from: b */
    public void m51540b() {
        Encoder<E> encoder = this.encoder;
        if (encoder == null || this.f39728g == null) {
            return;
        }
        try {
            writeBytes(encoder.footerBytes());
        } catch (IOException e) {
            this.started = false;
            addStatus(new ErrorStatus("Failed to write footer for appender named [" + this.name + "].", this, e));
        }
    }

    public void closeOutputStream() {
        if (this.f39728g != null) {
            try {
                m51540b();
                this.f39728g.close();
                this.f39728g = null;
            } catch (IOException e) {
                addStatus(new ErrorStatus("Could not close output stream for OutputStreamAppender.", this, e));
            }
        }
    }

    /* renamed from: d */
    public void m51539d() {
        Encoder<E> encoder = this.encoder;
        if (encoder == null || this.f39728g == null) {
            return;
        }
        try {
            writeBytes(encoder.headerBytes());
        } catch (IOException e) {
            this.started = false;
            addStatus(new ErrorStatus("Failed to initialize encoder for appender named [" + this.name + "].", this, e));
        }
    }

    public Encoder<E> getEncoder() {
        return this.encoder;
    }

    public OutputStream getOutputStream() {
        return this.f39728g;
    }

    public boolean isImmediateFlush() {
        return this.f39729h;
    }

    public void setEncoder(Encoder<E> encoder) {
        this.encoder = encoder;
    }

    public void setImmediateFlush(boolean z) {
        this.f39729h = z;
    }

    public void setLayout(Layout<E> layout) {
        addWarn("This appender no longer admits a layout as a sub-component, set an encoder instead.");
        addWarn("To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.");
        addWarn("See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details");
        LayoutWrappingEncoder layoutWrappingEncoder = new LayoutWrappingEncoder();
        layoutWrappingEncoder.setLayout(layout);
        layoutWrappingEncoder.setContext(this.context);
        this.encoder = layoutWrappingEncoder;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.lock.lock();
        try {
            closeOutputStream();
            this.f39728g = outputStream;
            if (this.encoder == null) {
                addWarn("Encoder has not been set. Cannot invoke its init method.");
            } else {
                m51539d();
            }
        } finally {
            this.lock.unlock();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i;
        if (this.encoder == null) {
            addStatus(new ErrorStatus("No encoder set for the appender named \"" + this.name + "\".", this));
            i = 1;
        } else {
            i = 0;
        }
        if (this.f39728g == null) {
            addStatus(new ErrorStatus("No output stream set for the appender named \"" + this.name + "\".", this));
            i++;
        }
        if (i == 0) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.lock.lock();
        try {
            closeOutputStream();
            super.stop();
        } finally {
            this.lock.unlock();
        }
    }

    public void subAppend(E e) {
        if (isStarted()) {
            try {
                if (e instanceof DeferredProcessingAware) {
                    ((DeferredProcessingAware) e).prepareForDeferredProcessing();
                }
                writeBytes(this.encoder.encode(e));
            } catch (IOException e2) {
                this.started = false;
                addStatus(new ErrorStatus("IO failure in appender", this, e2));
            }
        }
    }

    public final void writeBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        this.lock.lock();
        try {
            this.f39728g.write(bArr);
            if (this.f39729h) {
                this.f39728g.flush();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void writeOut(E e) throws IOException {
        writeBytes(this.encoder.encode(e));
    }
}
