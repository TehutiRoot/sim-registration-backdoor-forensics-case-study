package com.tom_roush.harmony.javax.imageio.stream;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class MemoryCacheImageInputStream extends ImageInputStreamImpl {

    /* renamed from: e */
    public InputStream f59713e;

    /* renamed from: f */
    public RandomAccessMemoryCache f59714f = new RandomAccessMemoryCache();

    public MemoryCacheImageInputStream(InputStream inputStream) {
        if (inputStream != null) {
            this.f59713e = inputStream;
            return;
        }
        throw new IllegalArgumentException("stream == null!");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void close() throws IOException {
        super.close();
        this.f59714f.close();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void flushBefore(long j) throws IOException {
        super.flushBefore(j);
        this.f59714f.freeBefore(getFlushedPosition());
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
    public int read() throws IOException {
        this.bitOffset = 0;
        if (this.streamPos >= this.f59714f.length()) {
            int length = (int) ((this.streamPos - this.f59714f.length()) + 1);
            if (this.f59714f.appendData(this.f59713e, length) < length) {
                return -1;
            }
        }
        int data = this.f59714f.getData(this.streamPos);
        if (data >= 0) {
            this.streamPos++;
        }
        return data;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.bitOffset = 0;
        if (this.streamPos >= this.f59714f.length()) {
            this.f59714f.appendData(this.f59713e, (int) ((this.streamPos - this.f59714f.length()) + i2));
        }
        int data = this.f59714f.getData(bArr, i, i2, this.streamPos);
        if (data > 0) {
            this.streamPos += data;
        }
        return data;
    }
}