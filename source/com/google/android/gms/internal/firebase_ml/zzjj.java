package com.google.android.gms.internal.firebase_ml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public final class zzjj extends ByteArrayOutputStream {

    /* renamed from: a */
    public int f45923a;

    /* renamed from: b */
    public final int f45924b;

    /* renamed from: c */
    public boolean f45925c;

    /* renamed from: d */
    public final Level f45926d;

    /* renamed from: e */
    public final Logger f45927e;

    public zzjj(Logger logger, Level level, int i) {
        boolean z;
        this.f45927e = (Logger) zzml.checkNotNull(logger);
        this.f45926d = (Level) zzml.checkNotNull(level);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzml.checkArgument(z);
        this.f45924b = i;
    }

    /* renamed from: b */
    public static void m47888b(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format(i));
        sb.append(" bytes");
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (!this.f45925c) {
                if (this.f45923a != 0) {
                    StringBuilder sb = new StringBuilder("Total: ");
                    m47888b(sb, this.f45923a);
                    int i = ((ByteArrayOutputStream) this).count;
                    if (i != 0 && i < this.f45923a) {
                        sb.append(" (logging first ");
                        m47888b(sb, ((ByteArrayOutputStream) this).count);
                        sb.append(")");
                    }
                    this.f45927e.logp(Level.CONFIG, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", sb.toString());
                    if (((ByteArrayOutputStream) this).count != 0) {
                        this.f45927e.logp(this.f45926d, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR));
                    }
                }
                this.f45925c = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        zzml.checkArgument(!this.f45925c);
        this.f45923a++;
        if (((ByteArrayOutputStream) this).count < this.f45924b) {
            super.write(i);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zzml.checkArgument(!this.f45925c);
        this.f45923a += i2;
        int i3 = ((ByteArrayOutputStream) this).count;
        int i4 = this.f45924b;
        if (i3 < i4) {
            int i5 = i3 + i2;
            if (i5 > i4) {
                i2 += i4 - i5;
            }
            super.write(bArr, i, i2);
        }
    }
}
