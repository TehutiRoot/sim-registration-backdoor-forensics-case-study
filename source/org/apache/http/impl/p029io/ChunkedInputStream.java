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
    public final SessionInputBuffer f74463a;

    /* renamed from: b */
    public final CharArrayBuffer f74464b;

    /* renamed from: c */
    public final MessageConstraints f74465c;

    /* renamed from: d */
    public int f74466d;

    /* renamed from: e */
    public long f74467e;

    /* renamed from: f */
    public long f74468f;

    /* renamed from: g */
    public boolean f74469g;

    /* renamed from: h */
    public boolean f74470h;

    /* renamed from: i */
    public Header[] f74471i;

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this.f74469g = false;
        this.f74470h = false;
        this.f74471i = new Header[0];
        this.f74463a = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.f74468f = 0L;
        this.f74464b = new CharArrayBuffer(16);
        this.f74465c = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.f74466d = 1;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        SessionInputBuffer sessionInputBuffer = this.f74463a;
        if (sessionInputBuffer instanceof BufferInfo) {
            return (int) Math.min(((BufferInfo) sessionInputBuffer).length(), this.f74467e - this.f74468f);
        }
        return 0;
    }

    /* renamed from: b */
    public final long m24581b() {
        int i = this.f74466d;
        if (i != 1) {
            if (i == 3) {
                this.f74464b.clear();
                if (this.f74463a.readLine(this.f74464b) != -1) {
                    if (this.f74464b.isEmpty()) {
                        this.f74466d = 1;
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
        this.f74464b.clear();
        if (this.f74463a.readLine(this.f74464b) != -1) {
            int indexOf = this.f74464b.indexOf(59);
            if (indexOf < 0) {
                indexOf = this.f74464b.length();
            }
            String substringTrimmed = this.f74464b.substringTrimmed(0, indexOf);
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
        if (!this.f74470h) {
            try {
                if (!this.f74469g && this.f74466d != Integer.MAX_VALUE) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.f74469g = true;
                this.f74470h = true;
            }
        }
    }

    /* renamed from: d */
    public final void m24580d() {
        if (this.f74466d != Integer.MAX_VALUE) {
            try {
                long m24581b = m24581b();
                this.f74467e = m24581b;
                if (m24581b >= 0) {
                    this.f74466d = 2;
                    this.f74468f = 0L;
                    if (m24581b == 0) {
                        this.f74469g = true;
                        m24579g();
                        return;
                    }
                    return;
                }
                throw new MalformedChunkCodingException("Negative chunk size");
            } catch (MalformedChunkCodingException e) {
                this.f74466d = Integer.MAX_VALUE;
                throw e;
            }
        }
        throw new MalformedChunkCodingException("Corrupt data stream");
    }

    /* renamed from: g */
    public final void m24579g() {
        try {
            this.f74471i = AbstractMessageParser.parseHeaders(this.f74463a, this.f74465c.getMaxHeaderCount(), this.f74465c.getMaxLineLength(), null);
        } catch (HttpException e) {
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e.getMessage());
            malformedChunkCodingException.initCause(e);
            throw malformedChunkCodingException;
        }
    }

    public Header[] getFooters() {
        return (Header[]) this.f74471i.clone();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f74470h) {
            if (this.f74469g) {
                return -1;
            }
            if (this.f74466d != 2) {
                m24580d();
                if (this.f74469g) {
                    return -1;
                }
            }
            int read = this.f74463a.read();
            if (read != -1) {
                long j = this.f74468f + 1;
                this.f74468f = j;
                if (j >= this.f74467e) {
                    this.f74466d = 3;
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
        if (!this.f74470h) {
            if (this.f74469g) {
                return -1;
            }
            if (this.f74466d != 2) {
                m24580d();
                if (this.f74469g) {
                    return -1;
                }
            }
            int read = this.f74463a.read(bArr, i, (int) Math.min(i2, this.f74467e - this.f74468f));
            if (read != -1) {
                long j = this.f74468f + read;
                this.f74468f = j;
                if (j >= this.f74467e) {
                    this.f74466d = 3;
                }
                return read;
            }
            this.f74469g = true;
            throw new TruncatedChunkException("Truncated chunk (expected size: %,d; actual size: %,d)", Long.valueOf(this.f74467e), Long.valueOf(this.f74468f));
        }
        throw new IOException("Attempted read from closed stream.");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
