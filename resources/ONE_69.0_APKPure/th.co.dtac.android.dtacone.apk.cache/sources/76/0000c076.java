package com.tom_roush.fontbox.pfb;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class PfbParser {

    /* renamed from: c */
    public static final int[] f59375c = {1, 2, 1};

    /* renamed from: a */
    public byte[] f59376a;

    /* renamed from: b */
    public int[] f59377b;

    public PfbParser(String str) throws IOException {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str), 65535);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            m32954a(m32953b(bufferedInputStream));
            bufferedInputStream.close();
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void m32954a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        this.f59376a = new byte[bArr.length - 18];
        this.f59377b = new int[f59375c.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = f59375c;
            if (i < iArr.length) {
                if (byteArrayInputStream.read() == 128) {
                    if (byteArrayInputStream.read() == iArr[i]) {
                        int read = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8) + (byteArrayInputStream.read() << 16) + (byteArrayInputStream.read() << 24);
                        if (read >= 0) {
                            this.f59377b[i] = read;
                            byte[] bArr2 = this.f59376a;
                            if (i2 < bArr2.length) {
                                if (read <= bArr2.length - i2) {
                                    int read2 = byteArrayInputStream.read(bArr2, i2, read);
                                    if (read2 >= 0) {
                                        i2 += read2;
                                        i++;
                                    } else {
                                        throw new EOFException();
                                    }
                                } else {
                                    throw new IOException("PFB record size (" + read + ") doesn't fit in buffer, position: " + i2 + ", total length: " + this.f59376a.length);
                                }
                            } else {
                                throw new EOFException("attempted to read past EOF");
                            }
                        } else {
                            throw new IOException("PFB record size is negative: " + read);
                        }
                    } else {
                        throw new IOException("Incorrect record type");
                    }
                } else {
                    throw new IOException("Start marker missing");
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final byte[] m32953b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[65535];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.f59376a);
    }

    public int[] getLengths() {
        return this.f59377b;
    }

    public byte[] getPfbdata() {
        return this.f59376a;
    }

    public byte[] getSegment1() {
        return Arrays.copyOfRange(this.f59376a, 0, this.f59377b[0]);
    }

    public byte[] getSegment2() {
        byte[] bArr = this.f59376a;
        int[] iArr = this.f59377b;
        int i = iArr[0];
        return Arrays.copyOfRange(bArr, i, iArr[1] + i);
    }

    public int size() {
        return this.f59376a.length;
    }

    public PfbParser(InputStream inputStream) throws IOException {
        m32954a(m32953b(inputStream));
    }

    public PfbParser(byte[] bArr) throws IOException {
        m32954a(bArr);
    }
}