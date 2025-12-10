package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.input.ClosedInputStream;

/* renamed from: org.apache.commons.io.output.AbstractByteArrayOutputStream */
/* loaded from: classes6.dex */
public abstract class AbstractByteArrayOutputStream extends OutputStream {

    /* renamed from: b */
    public int f73539b;

    /* renamed from: c */
    public int f73540c;
    protected int count;

    /* renamed from: d */
    public byte[] f73541d;

    /* renamed from: a */
    public final List f73538a = new ArrayList();

    /* renamed from: e */
    public boolean f73542e = true;

    @FunctionalInterface
    /* renamed from: org.apache.commons.io.output.AbstractByteArrayOutputStream$InputStreamConstructor */
    /* loaded from: classes6.dex */
    public interface InputStreamConstructor<T extends InputStream> {
        T construct(byte[] bArr, int i, int i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void needNewBuffer(int i) {
        if (this.f73539b < this.f73538a.size() - 1) {
            this.f73540c += this.f73541d.length;
            int i2 = this.f73539b + 1;
            this.f73539b = i2;
            this.f73541d = (byte[]) this.f73538a.get(i2);
            return;
        }
        byte[] bArr = this.f73541d;
        if (bArr == null) {
            this.f73540c = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f73540c);
            this.f73540c += this.f73541d.length;
        }
        this.f73539b++;
        byte[] byteArray = IOUtils.byteArray(i);
        this.f73541d = byteArray;
        this.f73538a.add(byteArray);
    }

    public abstract void reset();

    public void resetImpl() {
        this.count = 0;
        this.f73540c = 0;
        this.f73539b = 0;
        if (this.f73542e) {
            this.f73541d = (byte[]) this.f73538a.get(0);
            return;
        }
        this.f73541d = null;
        int length = ((byte[]) this.f73538a.get(0)).length;
        this.f73538a.clear();
        needNewBuffer(length);
        this.f73542e = true;
    }

    public abstract int size();

    public abstract byte[] toByteArray();

    public byte[] toByteArrayImpl() {
        int i = this.count;
        if (i == 0) {
            return IOUtils.EMPTY_BYTE_ARRAY;
        }
        byte[] byteArray = IOUtils.byteArray(i);
        int i2 = 0;
        for (byte[] bArr : this.f73538a) {
            int min = Math.min(bArr.length, i);
            System.arraycopy(bArr, 0, byteArray, i2, min);
            i2 += min;
            i -= min;
            if (i == 0) {
                break;
            }
        }
        return byteArray;
    }

    public abstract InputStream toInputStream();

    public <T extends InputStream> InputStream toInputStream(InputStreamConstructor<T> inputStreamConstructor) {
        int i = this.count;
        if (i == 0) {
            return ClosedInputStream.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(this.f73538a.size());
        for (byte[] bArr : this.f73538a) {
            int min = Math.min(bArr.length, i);
            arrayList.add(inputStreamConstructor.construct(bArr, 0, min));
            i -= min;
            if (i == 0) {
                break;
            }
        }
        this.f73542e = false;
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Deprecated
    public String toString() {
        return new String(toByteArray(), Charset.defaultCharset());
    }

    public abstract int write(InputStream inputStream) throws IOException;

    @Override // java.io.OutputStream
    public abstract void write(int i);

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i, int i2);

    public void writeImpl(byte[] bArr, int i, int i2) {
        int i3 = this.count;
        int i4 = i3 + i2;
        int i5 = i3 - this.f73540c;
        int i6 = i2;
        while (i6 > 0) {
            int min = Math.min(i6, this.f73541d.length - i5);
            System.arraycopy(bArr, (i + i2) - i6, this.f73541d, i5, min);
            i6 -= min;
            if (i6 > 0) {
                needNewBuffer(i4);
                i5 = 0;
            }
        }
        this.count = i4;
    }

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public void writeToImpl(OutputStream outputStream) throws IOException {
        int i = this.count;
        for (byte[] bArr : this.f73538a) {
            int min = Math.min(bArr.length, i);
            outputStream.write(bArr, 0, min);
            i -= min;
            if (i == 0) {
                return;
            }
        }
    }

    public String toString(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(toByteArray(), str);
    }

    public int writeImpl(InputStream inputStream) throws IOException {
        int i = this.count - this.f73540c;
        byte[] bArr = this.f73541d;
        int read = inputStream.read(bArr, i, bArr.length - i);
        int i2 = 0;
        while (read != -1) {
            i2 += read;
            i += read;
            this.count += read;
            byte[] bArr2 = this.f73541d;
            if (i == bArr2.length) {
                needNewBuffer(bArr2.length);
                i = 0;
            }
            byte[] bArr3 = this.f73541d;
            read = inputStream.read(bArr3, i, bArr3.length - i);
        }
        return i2;
    }

    public void writeImpl(int i) {
        int i2 = this.count;
        int i3 = i2 - this.f73540c;
        if (i3 == this.f73541d.length) {
            needNewBuffer(i2 + 1);
            i3 = 0;
        }
        this.f73541d[i3] = (byte) i;
        this.count++;
    }
}
