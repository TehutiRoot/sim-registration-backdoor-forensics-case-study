package com.tom_roush.pdfbox.p019io;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.tom_roush.pdfbox.io.RandomAccessOutputStream */
/* loaded from: classes5.dex */
public class RandomAccessOutputStream extends OutputStream {

    /* renamed from: a */
    public final RandomAccessWrite f59919a;

    public RandomAccessOutputStream(RandomAccessWrite randomAccessWrite) {
        this.f59919a = randomAccessWrite;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f59919a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f59919a.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.f59919a.write(i);
    }
}
