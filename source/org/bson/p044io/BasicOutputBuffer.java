package org.bson.p044io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import org.bson.ByteBuf;
import org.bson.ByteBufNIO;

/* renamed from: org.bson.io.BasicOutputBuffer */
/* loaded from: classes.dex */
public class BasicOutputBuffer extends OutputBuffer {

    /* renamed from: a */
    public byte[] f75943a;

    /* renamed from: b */
    public int f75944b;

    public BasicOutputBuffer() {
        this(1024);
    }

    @Override // org.bson.p044io.OutputBuffer, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, org.bson.p044io.BsonOutput
    public void close() {
        this.f75943a = null;
    }

    /* renamed from: d */
    public final void m24186d(int i) {
        int i2 = this.f75944b;
        int i3 = i + i2;
        byte[] bArr = this.f75943a;
        if (i3 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length < i3) {
            length = i3 + 128;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f75943a = bArr2;
    }

    /* renamed from: g */
    public final void m24185g() {
        if (this.f75943a != null) {
            return;
        }
        throw new IllegalStateException("The output is closed");
    }

    @Override // org.bson.p044io.OutputBuffer
    public List<ByteBuf> getByteBuffers() {
        m24185g();
        return Arrays.asList(new ByteBufNIO(ByteBuffer.wrap(this.f75943a, 0, this.f75944b).duplicate().order(ByteOrder.LITTLE_ENDIAN)));
    }

    public byte[] getInternalBuffer() {
        return this.f75943a;
    }

    @Override // org.bson.p044io.BsonOutput
    public int getPosition() {
        m24185g();
        return this.f75944b;
    }

    @Override // org.bson.p044io.BsonOutput
    public int getSize() {
        m24185g();
        return this.f75944b;
    }

    @Override // org.bson.p044io.OutputBuffer
    public int pipe(OutputStream outputStream) throws IOException {
        m24185g();
        outputStream.write(this.f75943a, 0, this.f75944b);
        return this.f75944b;
    }

    @Override // org.bson.p044io.OutputBuffer, org.bson.p044io.BsonOutput
    public void truncateToPosition(int i) {
        m24185g();
        if (i <= this.f75944b && i >= 0) {
            this.f75944b = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // org.bson.p044io.OutputBuffer, java.io.OutputStream
    public void write(byte[] bArr) {
        m24185g();
        write(bArr, 0, bArr.length);
    }

    @Override // org.bson.p044io.BsonOutput
    public void writeByte(int i) {
        m24185g();
        m24186d(1);
        byte[] bArr = this.f75943a;
        int i2 = this.f75944b;
        this.f75944b = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    @Override // org.bson.p044io.BsonOutput
    public void writeBytes(byte[] bArr, int i, int i2) {
        m24185g();
        m24186d(i2);
        System.arraycopy(bArr, i, this.f75943a, this.f75944b, i2);
        this.f75944b += i2;
    }

    public BasicOutputBuffer(int i) {
        this.f75943a = new byte[1024];
        this.f75943a = new byte[i];
    }

    @Override // org.bson.p044io.OutputBuffer
    public void write(int i, int i2) {
        m24185g();
        if (i >= 0) {
            if (i <= this.f75944b - 1) {
                this.f75943a[i] = (byte) (i2 & 255);
                return;
            }
            throw new IllegalArgumentException(String.format("position must be <= %d but was %d", Integer.valueOf(this.f75944b - 1), Integer.valueOf(i)));
        }
        throw new IllegalArgumentException(String.format("position must be >= 0 but was %d", Integer.valueOf(i)));
    }
}
