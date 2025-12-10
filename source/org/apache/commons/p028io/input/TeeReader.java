package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/* renamed from: org.apache.commons.io.input.TeeReader */
/* loaded from: classes6.dex */
public class TeeReader extends ProxyReader {

    /* renamed from: a */
    public final Writer f73476a;

    /* renamed from: b */
    public final boolean f73477b;

    public TeeReader(Reader reader, Writer writer) {
        this(reader, writer, false);
    }

    @Override // org.apache.commons.p028io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            if (this.f73477b) {
                this.f73476a.close();
            }
        }
    }

    @Override // org.apache.commons.p028io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f73476a.write(read);
        }
        return read;
    }

    public TeeReader(Reader reader, Writer writer, boolean z) {
        super(reader);
        this.f73476a = writer;
        this.f73477b = z;
    }

    @Override // org.apache.commons.p028io.input.ProxyReader, java.io.Reader
    public int read(char[] cArr) throws IOException {
        int read = super.read(cArr);
        if (read != -1) {
            this.f73476a.write(cArr, 0, read);
        }
        return read;
    }

    @Override // org.apache.commons.p028io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int read = super.read(cArr, i, i2);
        if (read != -1) {
            this.f73476a.write(cArr, i, read);
        }
        return read;
    }

    @Override // org.apache.commons.p028io.input.ProxyReader, java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        int position = charBuffer.position();
        int read = super.read(charBuffer);
        if (read != -1) {
            int position2 = charBuffer.position();
            int limit = charBuffer.limit();
            try {
                charBuffer.position(position).limit(position2);
                this.f73476a.append((CharSequence) charBuffer);
            } finally {
                charBuffer.position(position2).limit(limit);
            }
        }
        return read;
    }
}
