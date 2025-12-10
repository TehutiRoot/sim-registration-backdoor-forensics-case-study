package com.netcetera.threeds.sdk.infrastructure;

import androidx.core.view.MotionEventCompat;
import com.google.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public class getSDKInfo extends FilterInputStream {
    private static final short ThreeDS2Service = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] ThreeDS2ServiceInstance;
    private int cleanup;
    private int createTransaction;
    private int get;
    private int getSDKInfo;
    private int getSDKVersion;
    private int getWarnings;
    private int initialize;
    private int onCompleted;
    private int onError;
    private byte[] valueOf;
    private byte[] values;

    public getSDKInfo(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws IOException {
        super(inputStream);
        this.getSDKVersion = Integer.MAX_VALUE;
        this.valueOf = new byte[8];
        this.values = new byte[8];
        this.ThreeDS2ServiceInstance = new byte[8];
        this.get = 8;
        this.getWarnings = 8;
        this.initialize = Math.min(Math.max(i2, 5), 16);
        this.getSDKInfo = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.values, 0, 8);
        }
        get((iArr[1] & BodyPartID.bodyIdMax) | ((iArr[0] & BodyPartID.bodyIdMax) << 32), i);
    }

    private void ThreeDS2Service() {
        if (this.getSDKInfo == 3) {
            byte[] bArr = this.valueOf;
            System.arraycopy(bArr, 0, this.ThreeDS2ServiceInstance, 0, bArr.length);
        }
        byte[] bArr2 = this.valueOf;
        int i = ((bArr2[0] << Ascii.CAN) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.initialize;
            if (i3 >= i4) {
                break;
            }
            int i5 = ThreeDS2Service * (i4 - i3);
            i2 -= ((i + i5) ^ ((i << 4) + this.onError)) ^ ((i >>> 5) + this.onCompleted);
            i -= (((i2 << 4) + this.cleanup) ^ (i5 + i2)) ^ ((i2 >>> 5) + this.createTransaction);
            i3++;
        }
        byte[] bArr3 = this.valueOf;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.getSDKInfo == 3) {
            ThreeDS2ServiceInstance();
            byte[] bArr4 = this.ThreeDS2ServiceInstance;
            System.arraycopy(bArr4, 0, this.values, 0, bArr4.length);
        }
    }

    private void ThreeDS2ServiceInstance() {
        for (int i = 0; i < 8; i++) {
            byte[] bArr = this.valueOf;
            bArr[i] = (byte) (bArr[i] ^ this.values[i]);
        }
    }

    private void get(long j, int i) {
        if (i == 0) {
            valueOf(j);
            return;
        }
        int i2 = (int) j;
        this.cleanup = i2;
        this.createTransaction = i2 * i;
        this.onError = i ^ i2;
        this.onCompleted = (int) (j >> 32);
    }

    private void valueOf(long j) {
        this.cleanup = (int) j;
        long j2 = j >> 3;
        long j3 = ThreeDS2Service;
        this.createTransaction = (int) ((j2 * j3) >> 32);
        this.onError = (int) (j >> 32);
        this.onCompleted = (int) (j2 + j3);
    }

    private int values() throws IOException {
        if (this.getSDKVersion == Integer.MAX_VALUE) {
            this.getSDKVersion = ((FilterInputStream) this).in.read();
        }
        int i = 8;
        if (this.get == 8) {
            byte[] bArr = this.valueOf;
            int i2 = this.getSDKVersion;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.valueOf, i3, 8 - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < 8);
                if (i3 >= 8) {
                    ThreeDS2Service();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.getSDKVersion = read2;
                    this.get = 0;
                    if (read2 < 0) {
                        i = 8 - (this.valueOf[7] & 255);
                    }
                    this.getWarnings = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.getWarnings;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        values();
        return this.getWarnings - this.get;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        values();
        int i = this.get;
        if (i >= this.getWarnings) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.get = i + 1;
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
            values();
            int i5 = this.get;
            if (i5 >= this.getWarnings) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.valueOf;
            this.get = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}