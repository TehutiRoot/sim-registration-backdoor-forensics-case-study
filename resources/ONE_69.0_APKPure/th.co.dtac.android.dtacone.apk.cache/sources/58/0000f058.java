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

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: yY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterOutputStream.this.m25097k();
            }
        });
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: xY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterOutputStream.this.m25096l();
            }
        });
    }

    /* renamed from: k */
    public final /* synthetic */ void m25097k() {
        super.close();
    }

    /* renamed from: l */
    public final /* synthetic */ void m25096l() {
        super.flush();
    }

    /* renamed from: m */
    public final /* synthetic */ void m25095m(byte[] bArr) {
        super.write(bArr);
    }

    /* renamed from: n */
    public final /* synthetic */ void m25094n(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
    }

    /* renamed from: o */
    public final /* synthetic */ void m25093o(int i) {
        super.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: vY1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                UncheckedFilterOutputStream.this.m25095m((byte[]) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return W90.m65808a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return W90.m65807b(this);
            }
        }, bArr);
    }

    public UncheckedFilterOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws UncheckedIOException {
        Uncheck.accept(new IOTriConsumer() { // from class: wY1
            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) {
                UncheckedFilterOutputStream.this.m25094n((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public /* synthetic */ IOTriConsumer andThen(IOTriConsumer iOTriConsumer) {
                return AbstractC18262Pb0.m66954a(this, iOTriConsumer);
            }
        }, bArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws UncheckedIOException {
        Uncheck.accept(new IOIntConsumer() { // from class: uY1
            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public final void accept(int i2) {
                UncheckedFilterOutputStream.this.m25093o(i2);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IOIntConsumer andThen(IOIntConsumer iOIntConsumer) {
                return AbstractC21148ma0.m26625a(this, iOIntConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ Consumer asConsumer() {
                return AbstractC21148ma0.m26624b(this);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IntConsumer asIntConsumer() {
                return AbstractC21148ma0.m26623c(this);
            }
        }, i);
    }
}