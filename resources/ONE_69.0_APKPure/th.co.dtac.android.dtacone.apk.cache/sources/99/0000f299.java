package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.TruncatedChunkException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.p030io.BufferInfo;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.ChunkedInputStream */
/* loaded from: classes6.dex */
public class ChunkedInputStream extends InputStream {

    /* renamed from: a */
    public final SessionInputBuffer f74547a;

    /* renamed from: b */
    public final CharArrayBuffer f74548b;

    /* renamed from: c */
    public final MessageConstraints f74549c;

    /* renamed from: d */
    public int f74550d;

    /* renamed from: e */
    public long f74551e;

    /* renamed from: f */
    public long f74552f;

    /* renamed from: g */
    public boolean f74553g;

    /* renamed from: h */
    public boolean f74554h;

    /* renamed from: i */
    public Header[] f74555i;

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this.f74553g = false;
        this.f74554h = false;
        this.f74555i = new Header[0];
        this.f74547a = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.f74552f = 0L;
        this.f74548b = new CharArrayBuffer(16);
        this.f74549c = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.f74550d = 1;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        SessionInputBuffer sessionInputBuffer = this.f74547a;
        if (sessionInputBuffer instanceof BufferInfo) {
            return (int) Math.min(((BufferInfo) sessionInputBuffer).length(), this.f74551e - this.f74552f);
        }
        return 0;
    }

    /* renamed from: b */
    public final long m24771b() {
        int i = this.f74550d;
        if (i != 1) {
            if (i == 3) {
                this.f74548b.clear();
                if (this.f74547a.readLine(this.f74548b) != -1) {
                    if (this.f74548b.isEmpty()) {
                        this.f74550d = 1;
                    } else {
                        throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
                    }
                } else {
                    throw new MalformedChunkCodingException("CRLF expected at end of chunk");
                }
            } else {
                throw new IllegalStateException("Inconsistent codec state");
            }
        }
        this.f74548b.clear();
        if (this.f74547a.readLine(this.f74548b) != -1) {
            int indexOf = this.f74548b.indexOf(59);
            if (indexOf < 0) {
                indexOf = this.f74548b.length();
            }
            String substringTrimmed = this.f74548b.substringTrimmed(0, indexOf);
            try {
                return Long.parseLong(substringTrimmed, 16);
            } catch (NumberFormatException unused) {
                throw new MalformedChunkCodingException("Bad chunk header: " + substringTrimmed);
            }
        }
        throw new ConnectionClosedException("Premature end of chunk coded message body: closing chunk expected");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f74554h) {
            try {
                if (!this.f74553g && this.f74550d != Integer.MAX_VALUE) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.f74553g = true;
                this.f74554h = true;
            }
        }
    }

    /* renamed from: d */
    public final void m24770d() {
        if (this.f74550d != Integer.MAX_VALUE) {
            try {
                long m24771b = m24771b();
                this.f74551e = m24771b;
                if (m24771b >= 0) {
                    this.f74550d = 2;
                    this.f74552f = 0L;
                    if (m24771b == 0) {
                        this.f74553g = true;
                        m24769g();
                        return;
                    }
                    return;
                }
                throw new MalformedChunkCodingException("Negative chunk size");
            } catch (MalformedChunkCodingException e) {
                this.f74550d = Integer.MAX_VALUE;
                throw e;
            }
        }
        throw new MalformedChunkCodingException("Corrupt data stream");
    }

    /* renamed from: g */
    public final void m24769g() {
        try {
            this.f74555i = AbstractMessageParser.parseHeaders(this.f74547a, this.f74549c.getMaxHeaderCount(), this.f74549c.getMaxLineLength(), null);
        } catch (HttpException e) {
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e.getMessage());
            malformedChunkCodingException.initCause(e);
            throw malformedChunkCodingException;
        }
    }

    public Header[] getFooters() {
        return (Header[]) this.f74555i.clone();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f74554h) {
            if (this.f74553g) {
                return -1;
            }
            if (this.f74550d != 2) {
                m24770d();
                if (this.f74553g) {
                    return -1;
                }
            }
            int read = this.f74547a.read();
            if (read != -1) {
                long j = this.f74552f + 1;
                this.f74552f = j;
                if (j >= this.f74551e) {
                    this.f74550d = 3;
                }
            }
            return read;
        }
        throw new IOException("Attempted read from closed stream.");
    }

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, null);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f74554h) {
            if (this.f74553g) {
                return -1;
            }
            if (this.f74550d != 2) {
                m24770d();
                if (this.f74553g) {
                    return -1;
                }
            }
            int read = this.f74547a.read(bArr, i, (int) Math.min(i2, this.f74551e - this.f74552f));
            if (read != -1) {
                long j = this.f74552f + read;
                this.f74552f = j;
                if (j >= this.f74551e) {
                    this.f74550d = 3;
                }
                return read;
            }
            this.f74553g = true;
            throw new TruncatedChunkException("Truncated chunk (expected size: %,d; actual size: %,d)", Long.valueOf(this.f74551e), Long.valueOf(this.f74552f));
        }
        throw new IOException("Attempted read from closed stream.");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}