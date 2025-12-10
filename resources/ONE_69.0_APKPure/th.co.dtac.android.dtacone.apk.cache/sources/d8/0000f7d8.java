package org.bouncycastle.crypto.prng;

import com.facebook.stetho.dumpapp.Framer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import kotlin.p023io.encoding.Base64;
import okio.Utf8;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public class VMPCRandomGenerator implements RandomGenerator {

    /* renamed from: n */
    private byte f75317n = 0;

    /* renamed from: P */
    private byte[] f75316P = {ByteSourceJsonBootstrapper.UTF8_BOM_2, 44, 98, Byte.MAX_VALUE, -75, -86, -44, 13, -127, -2, -78, -126, -53, -96, -95, 8, Ascii.CAN, 113, 86, -24, 73, 2, 16, -60, -34, 53, -91, -20, Byte.MIN_VALUE, 18, -72, 105, -38, 47, 117, -52, -94, 9, 54, 3, 97, Framer.STDIN_FRAME_PREFIX, -3, -32, -35, 5, 67, -112, -83, -56, -31, -81, 87, -101, 76, -40, 81, -82, 80, -123, 60, 10, -28, -13, -100, 38, 35, 83, -55, -125, -105, 70, -79, -103, 100, Framer.STDOUT_FRAME_PREFIX, 119, -43, Ascii.f52699GS, -42, Framer.EXIT_FRAME_PREFIX, -67, 94, -80, -118, 34, 56, -8, 104, 43, 42, -59, -45, -9, PSSSigner.TRAILER_IMPLICIT, 111, -33, 4, -27, -107, 62, 37, -122, -90, 11, -113, -15, 36, 14, -41, SignedBytes.MAX_POWER_OF_TWO, -77, -49, 126, 6, Ascii.NAK, -102, 77, Ascii.f52698FS, -93, -37, Framer.STDERR_FRAME_PREFIX, -110, 88, 17, 39, -12, 89, -48, 78, 106, Ascii.ETB, 91, -84, -1, 7, -64, 101, 121, -4, -57, -51, 118, 66, 93, -25, 58, 52, 122, 48, 40, 15, 115, 1, -7, -47, -46, Ascii.f52696EM, -23, -111, -71, 90, -19, 65, 109, -76, -61, -98, ByteSourceJsonBootstrapper.UTF8_BOM_3, 99, -6, Ascii.f52707US, 51, 96, 71, -119, -16, -106, Ascii.SUB, Framer.STDIN_REQUEST_FRAME_PREFIX, -109, Base64.padSymbol, 55, 75, -39, -88, -63, Ascii.ESC, -10, 57, -117, -73, 12, 32, -50, -120, 110, -74, 116, -114, -115, Ascii.SYN, 41, -14, -121, -11, -21, 112, -29, -5, 85, -97, -58, 68, 74, 69, 125, -30, 107, 92, 108, 102, -87, -116, -18, -124, 19, -89, Ascii.f52703RS, -99, -36, 103, 72, -70, 46, -26, -92, -85, 124, -108, 0, Framer.ENTER_FRAME_PREFIX, ByteSourceJsonBootstrapper.UTF8_BOM_1, -22, -66, -54, 114, 79, 82, -104, Utf8.REPLACEMENT_BYTE, -62, Ascii.DC4, 123, 59, 84};

    /* renamed from: s */
    private byte f75318s = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        addSeedMaterial(Pack.longToBigEndian(j));
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b : bArr) {
            byte[] bArr2 = this.f75316P;
            byte b2 = this.f75318s;
            byte b3 = this.f75317n;
            byte b4 = bArr2[(b2 + bArr2[b3 & 255] + b) & 255];
            this.f75318s = b4;
            byte b5 = bArr2[b3 & 255];
            bArr2[b3 & 255] = bArr2[b4 & 255];
            bArr2[b4 & 255] = b5;
            this.f75317n = (byte) ((b3 + 1) & 255);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this.f75316P) {
            int i3 = i2 + i;
            while (i != i3) {
                try {
                    byte[] bArr2 = this.f75316P;
                    byte b = this.f75318s;
                    byte b2 = this.f75317n;
                    byte b3 = bArr2[(b + bArr2[b2 & 255]) & 255];
                    this.f75318s = b3;
                    bArr[i] = bArr2[(bArr2[bArr2[b3 & 255] & 255] + 1) & 255];
                    byte b4 = bArr2[b2 & 255];
                    bArr2[b2 & 255] = bArr2[b3 & 255];
                    bArr2[b3 & 255] = b4;
                    this.f75317n = (byte) ((b2 + 1) & 255);
                    i++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}