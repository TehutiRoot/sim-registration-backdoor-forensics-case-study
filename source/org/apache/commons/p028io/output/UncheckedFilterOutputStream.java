package org.apache.commons.p028io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOTriConsumer;
import org.apache.commons.p028io.function.Uncheck;
import org.apache.commons.p028io.output.UncheckedFilterOutputStream;

/* renamed from: org.apache.commons.io.output.UncheckedFilterOutputStream */
/* loaded from: classes6.dex */
public final class UncheckedFilterOutputStream extends FilterOutputStream {

    /* renamed from: org.apache.commons.io.output.UncheckedFilterOutputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<UncheckedFilterOutputStream, Builder> {
        @Override // org.apache.commons.p028io.function.IOSupplier
        public UncheckedFilterOutputStream get() throws IOException {
            return new UncheckedFilterOutputStream(getOutputStream());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m24912b(UncheckedFilterOutputStream uncheckedFilterOutputStream) {
        uncheckedFilterOutputStream.m24907k();
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ void m24911d(UncheckedFilterOutputStream uncheckedFilterOutputStream, byte[] bArr) {
        uncheckedFilterOutputStream.m24905m(bArr);
    }

    /* renamed from: g */
    public static /* synthetic */ void m24910g(UncheckedFilterOutputStream uncheckedFilterOutputStream, byte[] bArr, int i, int i2) {
        uncheckedFilterOutputStream.m24904n(bArr, i, i2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m24909i(UncheckedFilterOutputStream uncheckedFilterOutputStream, int i) {
        uncheckedFilterOutputStream.m24903o(i);
    }

    /* renamed from: j */
    public static /* synthetic */ void m24908j(UncheckedFilterOutputStream uncheckedFilterOutputStream) {
        uncheckedFilterOutputStream.m24906l();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: BX1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterOutputStream.m24912b(UncheckedFilterOutputStream.this);
            }
        });
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: AX1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterOutputStream.m24908j(UncheckedFilterOutputStream.this);
            }
        });
    }

    /* renamed from: k */
    public final /* synthetic */ void m24907k() {
        super.close();
    }

    /* renamed from: l */
    public final /* synthetic */ void m24906l() {
        super.flush();
    }

    /* renamed from: m */
    public final /* synthetic */ void m24905m(byte[] bArr) {
        super.write(bArr);
    }

    /* renamed from: n */
    public final /* synthetic */ void m24904n(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
    }

    /* renamed from: o */
    public final /* synthetic */ void m24903o(int i) {
        super.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: yX1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                UncheckedFilterOutputStream.m24911d(UncheckedFilterOutputStream.this, (byte[]) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        }, bArr);
    }

    public UncheckedFilterOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws UncheckedIOException {
        Uncheck.accept(new IOTriConsumer() { // from class: zX1
            {
                UncheckedFilterOutputStream.this = this;
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) {
                UncheckedFilterOutputStream.m24910g(UncheckedFilterOutputStream.this, (byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public /* synthetic */ IOTriConsumer andThen(IOTriConsumer iOTriConsumer) {
                return AbstractC17840Jb0.m67741a(this, iOTriConsumer);
            }
        }, bArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws UncheckedIOException {
        Uncheck.accept(new IOIntConsumer() { // from class: xX1
            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public final void accept(int i2) {
                UncheckedFilterOutputStream.m24909i(UncheckedFilterOutputStream.this, i2);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IOIntConsumer andThen(IOIntConsumer iOIntConsumer) {
                return AbstractC20057ga0.m31095a(this, iOIntConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ Consumer asConsumer() {
                return AbstractC20057ga0.m31094b(this);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IntConsumer asIntConsumer() {
                return AbstractC20057ga0.m31093c(this);
            }
        }, i);
    }
}
