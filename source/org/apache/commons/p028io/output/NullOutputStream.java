package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: org.apache.commons.io.output.NullOutputStream */
/* loaded from: classes6.dex */
public class NullOutputStream extends OutputStream {
    public static final NullOutputStream INSTANCE;
    @Deprecated
    public static final NullOutputStream NULL_OUTPUT_STREAM;

    static {
        NullOutputStream nullOutputStream = new NullOutputStream();
        INSTANCE = nullOutputStream;
        NULL_OUTPUT_STREAM = nullOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
    }
}
