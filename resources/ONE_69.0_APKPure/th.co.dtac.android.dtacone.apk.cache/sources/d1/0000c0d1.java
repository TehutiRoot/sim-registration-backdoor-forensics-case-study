package com.tom_roush.harmony.javax.imageio.stream;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class MemoryCacheImageOutputStream extends ImageOutputStreamImpl {

    /* renamed from: f */
    public OutputStream f59715f;

    /* renamed from: g */
    public RandomAccessMemoryCache f59716g = new RandomAccessMemoryCache();

    public MemoryCacheImageOutputStream(OutputStream outputStream) {
        if (outputStream != null) {
            this.f59715f = outputStream;
            return;
        }
        throw new IllegalArgumentException("stream == null!");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void close() throws IOException {
        long length = length();
        seek(length);
        flushBefore(length);
        super.close();
        this.f59716g.close();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void flushBefore(long j) throws IOException {
        long flushedPosition = getFlushedPosition();
        super.flushBefore(j);
        long flushedPosition2 = getFlushedPosition();
        this.f59716g.getData(this.f59715f, (int) (flushedPosition2 - flushedPosition), flushedPosition);
        this.f59716g.freeBefore(flushedPosition2);
        this.f59715f.flush();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public boolean isCached() {
        return true;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public boolean isCachedFile() {
        return false;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public boolean isCachedMemory() {
        return true;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public long length() {
        return this.f59716g.length();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public int read() throws IOException {
        this.bitOffset = 0;
        int data = this.f59716g.getData(this.streamPos);
        if (data >= 0) {
            this.streamPos++;
        }
        return data;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void write(int i) throws IOException {
        flushBits();
        this.f59716g.putData(i, this.streamPos);
        this.streamPos++;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.bitOffset = 0;
        int data = this.f59716g.getData(bArr, i, i2, this.streamPos);
        if (data > 0) {
            this.streamPos += data;
        }
        return data;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        flushBits();
        this.f59716g.putData(bArr, i, i2, this.streamPos);
        this.streamPos += i2;
    }
}