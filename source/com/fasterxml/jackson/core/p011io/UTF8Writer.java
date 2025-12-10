package com.fasterxml.jackson.core.p011io;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.feitian.readerdk.Tool.C6150DK;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;

/* renamed from: com.fasterxml.jackson.core.io.UTF8Writer */
/* loaded from: classes3.dex */
public final class UTF8Writer extends Writer {

    /* renamed from: a */
    public final IOContext f43135a;

    /* renamed from: b */
    public OutputStream f43136b;

    /* renamed from: c */
    public byte[] f43137c;

    /* renamed from: d */
    public final int f43138d;

    /* renamed from: e */
    public int f43139e;

    /* renamed from: f */
    public int f43140f;

    public UTF8Writer(IOContext iOContext, OutputStream outputStream) {
        this.f43135a = iOContext;
        this.f43136b = outputStream;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this.f43137c = allocWriteEncodingBuffer;
        this.f43138d = allocWriteEncodingBuffer.length - 4;
        this.f43139e = 0;
    }

    public static void illegalSurrogate(int i) throws IOException {
        throw new IOException(illegalSurrogateDesc(i));
    }

    public static String illegalSurrogateDesc(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i >= 55296) {
            if (i <= 56319) {
                return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
            }
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        } else {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f43136b;
        if (outputStream != null) {
            int i = this.f43139e;
            if (i > 0) {
                outputStream.write(this.f43137c, 0, i);
                this.f43139e = 0;
            }
            OutputStream outputStream2 = this.f43136b;
            this.f43136b = null;
            byte[] bArr = this.f43137c;
            if (bArr != null) {
                this.f43137c = null;
                this.f43135a.releaseWriteEncodingBuffer(bArr);
            }
            outputStream2.close();
            int i2 = this.f43140f;
            this.f43140f = 0;
            if (i2 > 0) {
                illegalSurrogate(i2);
            }
        }
    }

    public int convertSurrogate(int i) throws IOException {
        int i2 = this.f43140f;
        this.f43140f = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - GeneratorBase.SURR1_FIRST) << 10) + 65536 + (i - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.f43136b;
        if (outputStream != null) {
            int i = this.f43139e;
            if (i > 0) {
                outputStream.write(this.f43137c, 0, i);
                this.f43139e = 0;
            }
            this.f43136b.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0025, code lost:
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(char[] r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p011io.UTF8Writer.write(char[], int, int):void");
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        int i2;
        if (this.f43140f > 0) {
            i = convertSurrogate(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                illegalSurrogate(i);
            }
            this.f43140f = i;
            return;
        }
        int i3 = this.f43139e;
        if (i3 >= this.f43138d) {
            this.f43136b.write(this.f43137c, 0, i3);
            this.f43139e = 0;
        }
        if (i < 128) {
            byte[] bArr = this.f43137c;
            int i4 = this.f43139e;
            this.f43139e = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.f43139e;
        if (i < 2048) {
            byte[] bArr2 = this.f43137c;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | CertificateHolderAuthorization.CVCA);
            i2 = i5 + 2;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.f43137c;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            int i7 = i5 + 2;
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i7] = (byte) ((i & 63) | 128);
        } else {
            if (i > 1114111) {
                illegalSurrogate(i);
            }
            byte[] bArr4 = this.f43137c;
            bArr4[i5] = (byte) ((i >> 18) | C6150DK.ERROR_RECEIVE_LRC);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            int i8 = i5 + 3;
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i8] = (byte) ((i & 63) | 128);
        }
        this.f43139e = i2;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0029, code lost:
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(java.lang.String r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p011io.UTF8Writer.write(java.lang.String, int, int):void");
    }
}
