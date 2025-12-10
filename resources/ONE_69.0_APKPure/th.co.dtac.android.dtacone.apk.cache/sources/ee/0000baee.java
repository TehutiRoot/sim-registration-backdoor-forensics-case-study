package com.netcetera.threeds.sdk.infrastructure;

import androidx.core.view.MotionEventCompat;
import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class ThreeDS2ServiceInstance extends FilterInputStream {
    private values ThreeDS2Service;
    private final int ThreeDS2ServiceInstance;
    private int cleanup;
    private byte[] get;
    private int getSDKInfo;
    private int[] getSDKVersion;
    private int getWarnings;
    private int initialize;
    private byte[] valueOf;
    private byte[] values;

    public ThreeDS2ServiceInstance(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        this.getWarnings = Integer.MAX_VALUE;
        int min = Math.min(Math.max(i, 3), 16);
        this.ThreeDS2ServiceInstance = min;
        this.values = new byte[8];
        byte[] bArr2 = new byte[8];
        this.get = bArr2;
        this.valueOf = new byte[8];
        this.getSDKVersion = new int[2];
        this.initialize = 8;
        this.cleanup = 8;
        this.getSDKInfo = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.ThreeDS2Service = new values(iArr, min, true, z);
    }

    private int ThreeDS2Service() throws IOException {
        if (this.getWarnings == Integer.MAX_VALUE) {
            this.getWarnings = ((FilterInputStream) this).in.read();
        }
        int i = 8;
        if (this.initialize == 8) {
            byte[] bArr = this.values;
            int i2 = this.getWarnings;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.values, i3, 8 - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < 8);
                if (i3 >= 8) {
                    ThreeDS2ServiceInstance();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.getWarnings = read2;
                    this.initialize = 0;
                    if (read2 < 0) {
                        i = 8 - (this.values[7] & 255);
                    }
                    this.cleanup = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.cleanup;
    }

    private void ThreeDS2ServiceInstance() {
        if (this.getSDKInfo == 2) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.valueOf, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i = ((bArr2[0] << Ascii.CAN) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = this.ThreeDS2ServiceInstance;
        values valuesVar = this.ThreeDS2Service;
        valueOf.ThreeDS2ServiceInstance(i, i2, false, i3, valuesVar.ThreeDS2ServiceInstance, valuesVar.values, this.getSDKVersion);
        int[] iArr = this.getSDKVersion;
        int i4 = iArr[0];
        int i5 = iArr[1];
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i4 >> 24);
        bArr3[1] = (byte) (i4 >> 16);
        bArr3[2] = (byte) (i4 >> 8);
        bArr3[3] = (byte) i4;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.getSDKInfo == 2) {
            values();
            byte[] bArr4 = this.valueOf;
            System.arraycopy(bArr4, 0, this.get, 0, bArr4.length);
        }
    }

    private void values() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.values;
            bArr[i] = (byte) (bArr[i] ^ this.get[i]);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        ThreeDS2Service();
        return this.cleanup - this.initialize;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        ThreeDS2Service();
        int i = this.initialize;
        if (i >= this.cleanup) {
            return -1;
        }
        byte[] bArr = this.values;
        this.initialize = i + 1;
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
            ThreeDS2Service();
            int i5 = this.initialize;
            if (i5 >= this.cleanup) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.values;
            this.initialize = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}