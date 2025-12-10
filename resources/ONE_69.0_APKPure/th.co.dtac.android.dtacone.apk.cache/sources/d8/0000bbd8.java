package com.netcetera.threeds.sdk.infrastructure;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class get extends FilterInputStream {
    private short ThreeDS2Service;
    private long[] ThreeDS2ServiceInstance;
    private byte[] get;
    private int getSDKVersion;
    private int getWarnings;
    private int initialize;
    private final int valueOf;
    private long[] values;

    public get(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        this.getSDKVersion = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.valueOf = min;
        this.get = new byte[min];
        this.values = new long[4];
        this.ThreeDS2ServiceInstance = new long[4];
        this.getWarnings = min;
        this.initialize = min;
        this.values = ThreeDS2Service.ThreeDS2ServiceInstance(i ^ i4, min ^ i4);
        this.ThreeDS2ServiceInstance = ThreeDS2Service.ThreeDS2ServiceInstance(i2 ^ i4, i3 ^ i4);
    }

    private void ThreeDS2ServiceInstance() {
        ThreeDS2Service.values(this.values, this.ThreeDS2ServiceInstance, this.ThreeDS2Service);
        for (int i = 0; i < this.valueOf; i++) {
            byte[] bArr = this.get;
            bArr[i] = (byte) (bArr[i] ^ ((this.values[this.ThreeDS2Service] >> (i << 3)) & 255));
        }
        this.ThreeDS2Service = (short) ((this.ThreeDS2Service + 1) % 4);
    }

    private int valueOf() throws IOException {
        int i;
        if (this.getSDKVersion == Integer.MAX_VALUE) {
            this.getSDKVersion = ((FilterInputStream) this).in.read();
        }
        if (this.getWarnings == this.valueOf) {
            byte[] bArr = this.get;
            int i2 = this.getSDKVersion;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.get, i3, this.valueOf - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < this.valueOf);
                if (i3 >= this.valueOf) {
                    ThreeDS2ServiceInstance();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.getSDKVersion = read2;
                    this.getWarnings = 0;
                    if (read2 < 0) {
                        int i4 = this.valueOf;
                        i = i4 - (this.get[i4 - 1] & 255);
                    } else {
                        i = this.valueOf;
                    }
                    this.initialize = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.initialize;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        valueOf();
        return this.initialize - this.getWarnings;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        valueOf();
        int i = this.getWarnings;
        if (i >= this.initialize) {
            return -1;
        }
        byte[] bArr = this.get;
        this.getWarnings = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            valueOf();
            int i5 = this.getWarnings;
            if (i5 >= this.initialize) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.get;
            this.getWarnings = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}