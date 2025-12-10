package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.ClosedInputStream */
/* loaded from: classes6.dex */
public class ClosedInputStream extends InputStream {
    @Deprecated
    public static final ClosedInputStream CLOSED_INPUT_STREAM;
    public static final ClosedInputStream INSTANCE;

    static {
        ClosedInputStream closedInputStream = new ClosedInputStream();
        INSTANCE = closedInputStream;
        CLOSED_INPUT_STREAM = closedInputStream;
    }

    /* renamed from: b */
    public static InputStream m25110b(InputStream inputStream) {
        if (inputStream == null) {
            return INSTANCE;
        }
        return inputStream;
    }

    @Override // java.io.InputStream
    public int read() {
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return -1;
    }
}
