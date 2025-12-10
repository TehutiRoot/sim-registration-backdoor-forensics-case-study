package com.google.api.client.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public class LoggingByteArrayOutputStream extends ByteArrayOutputStream {

    /* renamed from: a */
    public int f52330a;

    /* renamed from: b */
    public final int f52331b;

    /* renamed from: c */
    public boolean f52332c;

    /* renamed from: d */
    public final Level f52333d;

    /* renamed from: e */
    public final Logger f52334e;

    public LoggingByteArrayOutputStream(Logger logger, Level level, int i) {
        boolean z;
        this.f52334e = (Logger) Preconditions.checkNotNull(logger);
        this.f52333d = (Level) Preconditions.checkNotNull(level);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f52331b = i;
    }

    /* renamed from: b */
    public static void m41697b(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format(i));
        sb.append(" bytes");
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (!this.f52332c) {
                if (this.f52330a != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Total: ");
                    m41697b(sb, this.f52330a);
                    int i = ((ByteArrayOutputStream) this).count;
                    if (i != 0 && i < this.f52330a) {
                        sb.append(" (logging first ");
                        m41697b(sb, ((ByteArrayOutputStream) this).count);
                        sb.append(")");
                    }
                    this.f52334e.config(sb.toString());
                    if (((ByteArrayOutputStream) this).count != 0) {
                        this.f52334e.log(this.f52333d, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR));
                    }
                }
                this.f52332c = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized int getBytesWritten() {
        return this.f52330a;
    }

    public final int getMaximumBytesToLog() {
        return this.f52331b;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        Preconditions.checkArgument(!this.f52332c);
        this.f52330a++;
        if (((ByteArrayOutputStream) this).count < this.f52331b) {
            super.write(i);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        Preconditions.checkArgument(!this.f52332c);
        this.f52330a += i2;
        int i3 = ((ByteArrayOutputStream) this).count;
        int i4 = this.f52331b;
        if (i3 < i4) {
            int i5 = i3 + i2;
            if (i5 > i4) {
                i2 += i4 - i5;
            }
            super.write(bArr, i, i2);
        }
    }
}
