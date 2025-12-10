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
    public final long f74561a;

    /* renamed from: b */
    public long f74562b = 0;

    /* renamed from: c */
    public boolean f74563c = false;

    /* renamed from: d */
    public SessionInputBuffer f74564d;

    public ContentLengthInputStream(SessionInputBuffer sessionInputBuffer, long j) {
        this.f74564d = null;
        this.f74564d = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.f74561a = Args.notNegative(j, "Content length");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        SessionInputBuffer sessionInputBuffer = this.f74564d;
        if (sessionInputBuffer instanceof BufferInfo) {
            return Math.min(((BufferInfo) sessionInputBuffer).length(), (int) (this.f74561a - this.f74562b));
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f74563c) {
            try {
                if (this.f74562b < this.f74561a) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.f74563c = true;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f74563c) {
            if (this.f74562b >= this.f74561a) {
                return -1;
            }
            int read = this.f74564d.read();
            if (read == -1) {
                if (this.f74562b < this.f74561a) {
                    throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f74561a), Long.valueOf(this.f74562b));
                }
            } else {
                this.f74562b++;
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
        long min = Math.min(j, this.f74561a - this.f74562b);
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
        if (!this.f74563c) {
            long j = this.f74562b;
            long j2 = this.f74561a;
            if (j >= j2) {
                return -1;
            }
            if (i2 + j > j2) {
                i2 = (int) (j2 - j);
            }
            int read = this.f74564d.read(bArr, i, i2);
            if (read != -1 || this.f74562b >= this.f74561a) {
                if (read > 0) {
                    this.f74562b += read;
                }
                return read;
            }
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f74561a), Long.valueOf(this.f74562b));
        }
        throw new IOException("Attempted read from closed stream.");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}