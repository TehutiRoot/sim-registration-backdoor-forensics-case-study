package com.google.firebase.crashlytics.internal.metadata;

import android.support.p001v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class QueueFile implements Closeable {

    /* renamed from: g */
    public static final Logger f54913g = Logger.getLogger(QueueFile.class.getName());

    /* renamed from: a */
    public final RandomAccessFile f54914a;

    /* renamed from: b */
    public int f54915b;

    /* renamed from: c */
    public int f54916c;

    /* renamed from: d */
    public C8363b f54917d;

    /* renamed from: e */
    public C8363b f54918e;

    /* renamed from: f */
    public final byte[] f54919f = new byte[16];

    /* loaded from: classes4.dex */
    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.QueueFile$a */
    /* loaded from: classes4.dex */
    public class C8362a implements ElementReader {

        /* renamed from: a */
        public boolean f54920a = true;

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f54921b;

        public C8362a(StringBuilder sb) {
            this.f54921b = sb;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) {
            if (this.f54920a) {
                this.f54920a = false;
            } else {
                this.f54921b.append(", ");
            }
            this.f54921b.append(i);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.QueueFile$b */
    /* loaded from: classes4.dex */
    public static class C8363b {

        /* renamed from: c */
        public static final C8363b f54923c = new C8363b(0, 0);

        /* renamed from: a */
        public final int f54924a;

        /* renamed from: b */
        public final int f54925b;

        public C8363b(int i, int i2) {
            this.f54924a = i;
            this.f54925b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f54924a + ", length = " + this.f54925b + "]";
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.QueueFile$c */
    /* loaded from: classes4.dex */
    public final class C8364c extends InputStream {

        /* renamed from: a */
        public int f54926a;

        /* renamed from: b */
        public int f54927b;

        public /* synthetic */ C8364c(QueueFile queueFile, C8363b c8363b, C8362a c8362a) {
            this(c8363b);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            QueueFile.m38923p(bArr, "buffer");
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.f54927b;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    QueueFile.this.m38916w(this.f54926a, bArr, i, i2);
                    this.f54926a = QueueFile.this.m38937A(this.f54926a + i2);
                    this.f54927b -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        public C8364c(C8363b c8363b) {
            this.f54926a = QueueFile.this.m38937A(c8363b.f54924a + 4);
            this.f54927b = c8363b.f54925b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f54927b == 0) {
                return -1;
            }
            QueueFile.this.f54914a.seek(this.f54926a);
            int read = QueueFile.this.f54914a.read();
            this.f54926a = QueueFile.this.m38937A(this.f54926a + 1);
            this.f54927b--;
            return read;
        }
    }

    public QueueFile(File file) {
        if (!file.exists()) {
            m38925n(file);
        }
        this.f54914a = m38922q(file);
        m38920s();
    }

    /* renamed from: C */
    public static void m38935C(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: D */
    public static void m38934D(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            m38935C(bArr, i, i2);
            i += 4;
        }
    }

    /* renamed from: n */
    public static void m38925n(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m38922q = m38922q(file2);
        try {
            m38922q.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            m38922q.seek(0L);
            byte[] bArr = new byte[16];
            m38934D(bArr, 4096, 0, 0, 0);
            m38922q.write(bArr);
            m38922q.close();
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Rename failed!");
        } catch (Throwable th2) {
            m38922q.close();
            throw th2;
        }
    }

    /* renamed from: p */
    public static Object m38923p(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: q */
    public static RandomAccessFile m38922q(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: t */
    public static int m38919t(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: A */
    public final int m38937A(int i) {
        int i2 = this.f54915b;
        if (i >= i2) {
            return (i + 16) - i2;
        }
        return i;
    }

    /* renamed from: B */
    public final void m38936B(int i, int i2, int i3, int i4) {
        m38934D(this.f54919f, i, i2, i3, i4);
        this.f54914a.seek(0L);
        this.f54914a.write(this.f54919f);
    }

    public synchronized void clear() {
        try {
            m38936B(4096, 0, 0, 0);
            this.f54916c = 0;
            C8363b c8363b = C8363b.f54923c;
            this.f54917d = c8363b;
            this.f54918e = c8363b;
            if (this.f54915b > 4096) {
                m38914y(4096);
            }
            this.f54915b = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f54914a.close();
    }

    /* renamed from: j */
    public void m38929j(byte[] bArr) {
        m38928k(bArr, 0, bArr.length);
    }

    /* renamed from: k */
    public synchronized void m38928k(byte[] bArr, int i, int i2) {
        int m38937A;
        int i3;
        try {
            m38923p(bArr, "buffer");
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                m38927l(i2);
                boolean m38924o = m38924o();
                if (m38924o) {
                    m38937A = 16;
                } else {
                    C8363b c8363b = this.f54918e;
                    m38937A = m38937A(c8363b.f54924a + 4 + c8363b.f54925b);
                }
                C8363b c8363b2 = new C8363b(m38937A, i2);
                m38935C(this.f54919f, 0, i2);
                m38915x(c8363b2.f54924a, this.f54919f, 0, 4);
                m38915x(c8363b2.f54924a + 4, bArr, i, i2);
                if (m38924o) {
                    i3 = c8363b2.f54924a;
                } else {
                    i3 = this.f54917d.f54924a;
                }
                m38936B(this.f54915b, this.f54916c + 1, i3, c8363b2.f54924a);
                this.f54918e = c8363b2;
                this.f54916c++;
                if (m38924o) {
                    this.f54917d = c8363b2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: l */
    public final void m38927l(int i) {
        int i2 = i + 4;
        int m38918u = m38918u();
        if (m38918u >= i2) {
            return;
        }
        int i3 = this.f54915b;
        do {
            m38918u += i3;
            i3 <<= 1;
        } while (m38918u < i2);
        m38914y(i3);
        C8363b c8363b = this.f54918e;
        int m38937A = m38937A(c8363b.f54924a + 4 + c8363b.f54925b);
        if (m38937A < this.f54917d.f54924a) {
            FileChannel channel = this.f54914a.getChannel();
            channel.position(this.f54915b);
            long j = m38937A - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f54918e.f54924a;
        int i5 = this.f54917d.f54924a;
        if (i4 < i5) {
            int i6 = (this.f54915b + i4) - 16;
            m38936B(i3, this.f54916c, i5, i6);
            this.f54918e = new C8363b(i6, this.f54918e.f54925b);
        } else {
            m38936B(i3, this.f54916c, i5, i4);
        }
        this.f54915b = i3;
    }

    /* renamed from: m */
    public synchronized void m38926m(ElementReader elementReader) {
        int i = this.f54917d.f54924a;
        for (int i2 = 0; i2 < this.f54916c; i2++) {
            C8363b m38921r = m38921r(i);
            elementReader.read(new C8364c(this, m38921r, null), m38921r.f54925b);
            i = m38937A(m38921r.f54924a + 4 + m38921r.f54925b);
        }
    }

    /* renamed from: o */
    public synchronized boolean m38924o() {
        boolean z;
        if (this.f54916c == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: r */
    public final C8363b m38921r(int i) {
        if (i == 0) {
            return C8363b.f54923c;
        }
        this.f54914a.seek(i);
        return new C8363b(i, this.f54914a.readInt());
    }

    /* renamed from: s */
    public final void m38920s() {
        this.f54914a.seek(0L);
        this.f54914a.readFully(this.f54919f);
        int m38919t = m38919t(this.f54919f, 0);
        this.f54915b = m38919t;
        if (m38919t <= this.f54914a.length()) {
            this.f54916c = m38919t(this.f54919f, 4);
            int m38919t2 = m38919t(this.f54919f, 8);
            int m38919t3 = m38919t(this.f54919f, 12);
            this.f54917d = m38921r(m38919t2);
            this.f54918e = m38921r(m38919t3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f54915b + ", Actual length: " + this.f54914a.length());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("fileLength=");
        sb.append(this.f54915b);
        sb.append(", size=");
        sb.append(this.f54916c);
        sb.append(", first=");
        sb.append(this.f54917d);
        sb.append(", last=");
        sb.append(this.f54918e);
        sb.append(", element lengths=[");
        try {
            m38926m(new C8362a(sb));
        } catch (IOException e) {
            f54913g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: u */
    public final int m38918u() {
        return this.f54915b - m38913z();
    }

    /* renamed from: v */
    public synchronized void m38917v() {
        try {
            if (!m38924o()) {
                if (this.f54916c == 1) {
                    clear();
                } else {
                    C8363b c8363b = this.f54917d;
                    int m38937A = m38937A(c8363b.f54924a + 4 + c8363b.f54925b);
                    m38916w(m38937A, this.f54919f, 0, 4);
                    int m38919t = m38919t(this.f54919f, 0);
                    m38936B(this.f54915b, this.f54916c - 1, m38937A, this.f54918e.f54924a);
                    this.f54916c--;
                    this.f54917d = new C8363b(m38937A, m38919t);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: w */
    public final void m38916w(int i, byte[] bArr, int i2, int i3) {
        int m38937A = m38937A(i);
        int i4 = m38937A + i3;
        int i5 = this.f54915b;
        if (i4 <= i5) {
            this.f54914a.seek(m38937A);
            this.f54914a.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m38937A;
        this.f54914a.seek(m38937A);
        this.f54914a.readFully(bArr, i2, i6);
        this.f54914a.seek(16L);
        this.f54914a.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: x */
    public final void m38915x(int i, byte[] bArr, int i2, int i3) {
        int m38937A = m38937A(i);
        int i4 = m38937A + i3;
        int i5 = this.f54915b;
        if (i4 <= i5) {
            this.f54914a.seek(m38937A);
            this.f54914a.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m38937A;
        this.f54914a.seek(m38937A);
        this.f54914a.write(bArr, i2, i6);
        this.f54914a.seek(16L);
        this.f54914a.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: y */
    public final void m38914y(int i) {
        this.f54914a.setLength(i);
        this.f54914a.getChannel().force(true);
    }

    /* renamed from: z */
    public int m38913z() {
        if (this.f54916c == 0) {
            return 16;
        }
        C8363b c8363b = this.f54918e;
        int i = c8363b.f54924a;
        int i2 = this.f54917d.f54924a;
        if (i >= i2) {
            return (i - i2) + 4 + c8363b.f54925b + 16;
        }
        return (((i + 4) + c8363b.f54925b) + this.f54915b) - i2;
    }
}