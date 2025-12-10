package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.Supplier;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;
import org.apache.commons.p028io.input.UnsynchronizedByteArrayInputStream;
import org.apache.commons.p028io.output.AbstractByteArrayOutputStream;
import org.apache.commons.p028io.output.UnsynchronizedByteArrayOutputStream;

/* renamed from: org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream */
/* loaded from: classes6.dex */
public final class UnsynchronizedByteArrayOutputStream extends AbstractByteArrayOutputStream {

    /* renamed from: org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<UnsynchronizedByteArrayOutputStream, Builder> {
        @Override // org.apache.commons.p028io.function.IOSupplier
        public UnsynchronizedByteArrayOutputStream get() {
            return new UnsynchronizedByteArrayOutputStream(getBufferSize());
        }
    }

    @Deprecated
    public UnsynchronizedByteArrayOutputStream() {
        this(1024);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: g */
    public static /* synthetic */ UnsynchronizedByteArrayInputStream m25070g(byte[] bArr, int i, int i2) {
        return UnsynchronizedByteArrayInputStream.builder().setByteArray(bArr).setOffset(i).setLength(i2).get();
    }

    /* renamed from: i */
    public static /* synthetic */ UnsynchronizedByteArrayInputStream m25069i(final byte[] bArr, final int i, final int i2) {
        return (UnsynchronizedByteArrayInputStream) Uncheck.get(new IOSupplier() { // from class: yZ1
            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC18132Nb0.m67225a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                UnsynchronizedByteArrayInputStream m25070g;
                m25070g = UnsynchronizedByteArrayOutputStream.m25070g(bArr, i, i2);
                return m25070g;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC18132Nb0.m67224b(this);
            }
        });
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) throws IOException {
        return toBufferedInputStream(inputStream, 1024);
    }

    @Override // org.apache.commons.p028io.output.AbstractByteArrayOutputStream
    public void reset() {
        resetImpl();
    }

    @Override // org.apache.commons.p028io.output.AbstractByteArrayOutputStream
    public int size() {
        return this.count;
    }

    @Override // org.apache.commons.p028io.output.AbstractByteArrayOutputStream
    public byte[] toByteArray() {
        return toByteArrayImpl();
    }

    @Override // org.apache.commons.p028io.output.AbstractByteArrayOutputStream
    public InputStream toInputStream() {
        return toInputStream(new AbstractByteArrayOutputStream.InputStreamConstructor() { // from class: xZ1
            @Override // org.apache.commons.p028io.output.AbstractByteArrayOutputStream.InputStreamConstructor
            public final InputStream construct(byte[] bArr, int i, int i2) {
                UnsynchronizedByteArrayInputStream m25069i;
                m25069i = UnsynchronizedByteArrayOutputStream.m25069i(bArr, i, i2);
                return m25069i;
            }
        });
    }

    @Override // org.apache.commons.p028io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i2 == 0) {
            return;
        }
        writeImpl(bArr, i, i2);
    }

    @Override // org.apache.commons.p028io.output.AbstractByteArrayOutputStream
    public void writeTo(OutputStream outputStream) throws IOException {
        writeToImpl(outputStream);
    }

    @Deprecated
    public UnsynchronizedByteArrayOutputStream(int i) {
        if (i >= 0) {
            needNewBuffer(i);
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i) throws IOException {
        UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream = builder().setBufferSize(i).get();
        try {
            unsynchronizedByteArrayOutputStream.write(inputStream);
            InputStream inputStream2 = unsynchronizedByteArrayOutputStream.toInputStream();
            unsynchronizedByteArrayOutputStream.close();
            return inputStream2;
        } catch (Throwable th2) {
            if (unsynchronizedByteArrayOutputStream != null) {
                try {
                    unsynchronizedByteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // org.apache.commons.p028io.output.AbstractByteArrayOutputStream
    public int write(InputStream inputStream) throws IOException {
        return writeImpl(inputStream);
    }

    @Override // org.apache.commons.p028io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(int i) {
        writeImpl(i);
    }
}