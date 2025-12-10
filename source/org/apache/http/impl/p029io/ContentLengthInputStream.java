package org.apache.http.impl.p029io;

import android.support.p001v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.p030io.BufferInfo;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.util.Args;

/* renamed from: org.apache.http.impl.io.ContentLengthInputStream */
/* loaded from: classes6.dex */
public class ContentLengthInputStream extends InputStream {

    /* renamed from: a */
    public final long f74477a;

    /* renamed from: b */
    public long f74478b = 0;

    /* renamed from: c */
    public boolean f74479c = false;

    /* renamed from: d */
    public SessionInputBuffer f74480d;

    public ContentLengthInputStream(SessionInputBuffer sessionInputBuffer, long j) {
        this.f74480d = null;
        this.f74480d = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.f74477a = Args.notNegative(j, "Content length");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        SessionInputBuffer sessionInputBuffer = this.f74480d;
        if (sessionInputBuffer instanceof BufferInfo) {
            return Math.min(((BufferInfo) sessionInputBuffer).length(), (int) (this.f74477a - this.f74478b));
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f74479c) {
            try {
                if (this.f74478b < this.f74477a) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.f74479c = true;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f74479c) {
            if (this.f74478b >= this.f74477a) {
                return -1;
            }
            int read = this.f74480d.read();
            if (read == -1) {
                if (this.f74478b < this.f74477a) {
                    throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f74477a), Long.valueOf(this.f74478b));
                }
            } else {
                this.f74478b++;
            }
            return read;
        }
        throw new IOException("Attempted read from closed stream.");
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        int read;
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.f74477a - this.f74478b);
        long j2 = 0;
        while (min > 0 && (read = read(bArr, 0, (int) Math.min((long) PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, min))) != -1) {
            long j3 = read;
            j2 += j3;
            min -= j3;
        }
        return j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f74479c) {
            long j = this.f74478b;
            long j2 = this.f74477a;
            if (j >= j2) {
                return -1;
            }
            if (i2 + j > j2) {
                i2 = (int) (j2 - j);
            }
            int read = this.f74480d.read(bArr, i, i2);
            if (read != -1 || this.f74478b >= this.f74477a) {
                if (read > 0) {
                    this.f74478b += read;
                }
                return read;
            }
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f74477a), Long.valueOf(this.f74478b));
        }
        throw new IOException("Attempted read from closed stream.");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
