package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.p019io.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class COSFilterInputStream extends FilterInputStream {

    /* renamed from: a */
    public int[][] f60635a;

    /* renamed from: b */
    public int f60636b;

    /* renamed from: c */
    public long f60637c;

    public COSFilterInputStream(InputStream inputStream, int[] iArr) {
        super(inputStream);
        this.f60637c = 0L;
        m32280b(iArr);
    }

    /* renamed from: b */
    public final void m32280b(int[] iArr) {
        this.f60635a = new int[iArr.length / 2];
        for (int i = 0; i < iArr.length / 2; i++) {
            int[][] iArr2 = this.f60635a;
            int i2 = i * 2;
            int i3 = iArr[i2];
            iArr2[i] = new int[]{i3, iArr[i2 + 1] + i3};
        }
        this.f60636b = -1;
    }

    /* renamed from: d */
    public final long m32279d() {
        return this.f60635a[this.f60636b][1] - this.f60637c;
    }

    /* renamed from: g */
    public final boolean m32278g() {
        int i = this.f60636b;
        if (i + 1 >= this.f60635a.length) {
            return false;
        }
        this.f60636b = i + 1;
        while (true) {
            long j = this.f60637c;
            int i2 = this.f60635a[this.f60636b][0];
            if (j >= i2) {
                return true;
            }
            this.f60637c += super.skip(i2 - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if ((this.f60636b == -1 || m32279d() <= 0) && !m32278g()) {
            return -1;
        }
        int read = super.read();
        this.f60637c++;
        return read;
    }

    public byte[] toByteArray() throws IOException {
        return IOUtils.toByteArray(this);
    }

    public COSFilterInputStream(byte[] bArr, int[] iArr) {
        this(new ByteArrayInputStream(bArr), iArr);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if ((this.f60636b == -1 || m32279d() <= 0) && !m32278g()) {
            return -1;
        }
        int read = super.read(bArr, i, (int) Math.min(i2, m32279d()));
        this.f60637c += read;
        return read;
    }
}