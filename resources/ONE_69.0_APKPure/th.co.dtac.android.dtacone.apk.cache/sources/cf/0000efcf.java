package org.apache.commons.p028io.input;

import java.io.FilterReader;
import java.io.Reader;

/* renamed from: org.apache.commons.io.input.CloseShieldReader */
/* loaded from: classes6.dex */
public class CloseShieldReader extends ProxyReader {
    @Deprecated
    public CloseShieldReader(Reader reader) {
        super(reader);
    }

    public static CloseShieldReader wrap(Reader reader) {
        return new CloseShieldReader(reader);
    }

    @Override // org.apache.commons.p028io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterReader) this).in = ClosedReader.INSTANCE;
    }
}