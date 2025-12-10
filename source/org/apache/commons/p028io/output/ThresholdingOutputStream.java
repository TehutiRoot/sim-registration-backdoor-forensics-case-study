package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.output.NullOutputStream;
import org.apache.commons.p028io.output.ThresholdingOutputStream;

/* renamed from: org.apache.commons.io.output.ThresholdingOutputStream */
/* loaded from: classes6.dex */
public class ThresholdingOutputStream extends OutputStream {

    /* renamed from: f */
    public static final IOFunction f73573f = new IOFunction() { // from class: VS1
        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOConsumer andThen(Consumer consumer) {
            return AbstractC19197ba0.m51989a(this, consumer);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public final Object apply(Object obj) {
            OutputStream outputStream;
            ThresholdingOutputStream thresholdingOutputStream = (ThresholdingOutputStream) obj;
            outputStream = NullOutputStream.INSTANCE;
            return outputStream;
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ Function asFunction() {
            return AbstractC19197ba0.m51985e(this);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOFunction compose(Function function) {
            return AbstractC19197ba0.m51984f(this, function);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
            return AbstractC19197ba0.m51988b(this, iOConsumer);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
            return AbstractC19197ba0.m51983g(this, iOFunction);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOFunction andThen(Function function) {
            return AbstractC19197ba0.m51987c(this, function);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOSupplier compose(Supplier supplier) {
            return AbstractC19197ba0.m51982h(this, supplier);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
            return AbstractC19197ba0.m51986d(this, iOFunction);
        }

        @Override // org.apache.commons.p028io.function.IOFunction
        public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
            return AbstractC19197ba0.m51981i(this, iOSupplier);
        }
    };

    /* renamed from: a */
    public final int f73574a;

    /* renamed from: b */
    public final IOConsumer f73575b;

    /* renamed from: c */
    public final IOFunction f73576c;

    /* renamed from: d */
    public long f73577d;

    /* renamed from: e */
    public boolean f73578e;

    public ThresholdingOutputStream(int i) {
        this(i, Q90.m66643l(), f73573f);
    }

    public void checkThreshold(int i) throws IOException {
        if (!this.f73578e && this.f73577d + i > this.f73574a) {
            this.f73578e = true;
            thresholdReached();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        getStream().close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        getStream().flush();
    }

    public long getByteCount() {
        return this.f73577d;
    }

    public OutputStream getOutputStream() throws IOException {
        return (OutputStream) this.f73576c.apply(this);
    }

    @Deprecated
    public OutputStream getStream() throws IOException {
        return getOutputStream();
    }

    public int getThreshold() {
        return this.f73574a;
    }

    public boolean isThresholdExceeded() {
        if (this.f73577d > this.f73574a) {
            return true;
        }
        return false;
    }

    public void resetByteCount() {
        this.f73578e = false;
        this.f73577d = 0L;
    }

    public void setByteCount(long j) {
        this.f73577d = j;
    }

    public void thresholdReached() throws IOException {
        this.f73575b.accept(this);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        checkThreshold(bArr.length);
        getStream().write(bArr);
        this.f73577d += bArr.length;
    }

    public ThresholdingOutputStream(int i, IOConsumer<ThresholdingOutputStream> iOConsumer, IOFunction<ThresholdingOutputStream, OutputStream> iOFunction) {
        this.f73574a = i < 0 ? 0 : i;
        this.f73575b = iOConsumer == null ? Q90.m66643l() : iOConsumer;
        this.f73576c = iOFunction == null ? f73573f : iOFunction;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        checkThreshold(i2);
        getStream().write(bArr, i, i2);
        this.f73577d += i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        checkThreshold(1);
        getStream().write(i);
        this.f73577d++;
    }
}
