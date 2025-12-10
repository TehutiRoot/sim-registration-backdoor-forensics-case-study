package com.tom_roush.pdfbox.p019io;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.tom_roush.pdfbox.io.RandomAccessWrite */
/* loaded from: classes5.dex */
public interface RandomAccessWrite extends Closeable {
    void clear() throws IOException;

    void write(int i) throws IOException;

    void write(byte[] bArr) throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
