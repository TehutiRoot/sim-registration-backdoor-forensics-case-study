package p000;

import com.tom_roush.fontbox.util.Charsets;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: tR1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC22342tR1 implements Closeable {
    /* renamed from: b */
    public abstract long mo22693b();

    /* renamed from: d */
    public abstract InputStream mo22692d();

    /* renamed from: g */
    public abstract long mo22691g();

    /* renamed from: i */
    public byte[] m22690i(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Unexpected end of TTF stream reached");
    }

    /* renamed from: j */
    public float m22689j() {
        return (float) (mo22686m() + (mo22679t() / 65536.0d));
    }

    /* renamed from: k */
    public Calendar m22688k() {
        long readLong = readLong();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(1904, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        calendar.setTimeInMillis(calendar.getTimeInMillis() + (readLong * 1000));
        return calendar;
    }

    /* renamed from: l */
    public int m22687l() {
        int read = read();
        if (read > 127) {
            return read - 256;
        }
        return read;
    }

    /* renamed from: m */
    public abstract short mo22686m();

    /* renamed from: n */
    public String m22685n(int i) {
        return m22684o(i, Charsets.ISO_8859_1);
    }

    /* renamed from: o */
    public String m22684o(int i, Charset charset) {
        return new String(m22690i(i), charset);
    }

    /* renamed from: p */
    public String m22683p() {
        return new String(m22690i(4), Charsets.US_ASCII);
    }

    /* renamed from: q */
    public int m22682q() {
        int read = read();
        if (read != -1) {
            return read;
        }
        throw new EOFException("premature EOF");
    }

    /* renamed from: r */
    public int[] m22681r(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = read();
        }
        return iArr;
    }

    public abstract int read();

    public abstract int read(byte[] bArr, int i, int i2);

    public abstract long readLong();

    /* renamed from: s */
    public long m22680s() {
        long read = read();
        long read2 = read();
        long read3 = read();
        long read4 = read();
        if (read4 >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    public abstract void seek(long j);

    /* renamed from: t */
    public abstract int mo22679t();

    /* renamed from: u */
    public int[] m22678u(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = mo22679t();
        }
        return iArr;
    }
}