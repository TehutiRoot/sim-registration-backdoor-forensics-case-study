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
    public static final Logger f54901g = Logger.getLogger(QueueFile.class.getName());

    /* renamed from: a */
    public final RandomAccessFile f54902a;

    /* renamed from: b */
    public int f54903b;

    /* renamed from: c */
    public int f54904c;

    /* renamed from: d */
    public C8374b f54905d;

    /* renamed from: e */
    public C8374b f54906e;

    /* renamed from: f */
    public final byte[] f54907f = new byte[16];

    /* loaded from: classes4.dex */
    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.QueueFile$a */
    /* loaded from: classes4.dex */
    public class C8373a implements ElementReader {

        /* renamed from: a */
        public boolean f54908a = true;

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f54909b;

        public C8373a(StringBuilder sb) {
            this.f54909b = sb;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) {
            if (this.f54908a) {
                this.f54908a = false;
            } else {
                this.f54909b.append(", ");
            }
            this.f54909b.append(i);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.QueueFile$b */
    /* loaded from: classes4.dex */
    public static class C8374b {

        /* renamed from: c */
        public static final C8374b f54911c = new C8374b(0, 0);

        /* renamed from: a */
        public final int f54912a;

        /* renamed from: b */
        public final int f54913b;

        public C8374b(int i, int i2) {
            this.f54912a = i;
            this.f54913b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f54912a + ", length = " + this.f54913b + "]";
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.QueueFile$c */
    /* loaded from: classes4.dex */
    public final class C8375c extends InputStream {

        /* renamed from: a */
        public int f54914a;

        /* renamed from: b */
        public int f54915b;

        public /* synthetic */ C8375c(QueueFile queueFile, C8374b c8374b, C8373a c8373a) {
            this(c8374b);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            QueueFile.m38931p(bArr, "buffer");
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.f54915b;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    QueueFile.this.m38924w(this.f54914a, bArr, i, i2);
                    this.f54914a = QueueFile.this.m38945A(this.f54914a + i2);
                    this.f54915b -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        public C8375c(C8374b c8374b) {
            this.f54914a = QueueFile.this.m38945A(c8374b.f54912a + 4);
            this.f54915b = c8374b.f54913b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f54915b == 0) {
                return -1;
            }
            QueueFile.this.f54902a.seek(this.f54914a);
            int read = QueueFile.this.f54902a.read();
            this.f54914a = QueueFile.this.m38945A(this.f54914a + 1);
            this.f54915b--;
            return read;
        }
    }

    public QueueFile(File file) {
        if (!file.exists()) {
            m38933n(file);
        }
        this.f54902a = m38930q(file);
        m38928s();
    }

    /* renamed from: C */
    public static void m38943C(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: D */
    public static void m38942D(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            m38943C(bArr, i, i2);
            i += 4;
        }
    }

    /* renamed from: n */
    public static void m38933n(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m38930q = m38930q(file2);
        try {
            m38930q.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            m38930q.seek(0L);
            byte[] bArr = new byte[16];
            m38942D(bArr, 4096, 0, 0, 0);
            m38930q.write(bArr);
            m38930q.close();
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Rename failed!");
        } catch (Throwable th2) {
            m38930q.close();
            throw th2;
        }
    }

    /* renamed from: p */
    public static Object m38931p(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: q */
    public static RandomAccessFile m38930q(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: t */
    public static int m38927t(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: A */
    public final int m38945A(int i) {
        int i2 = this.f54903b;
        if (i >= i2) {
            return (i + 16) - i2;
        }
        return i;
    }

    /* renamed from: B */
    public final void m38944B(int i, int i2, int i3, int i4) {
        m38942D(this.f54907f, i, i2, i3, i4);
        this.f54902a.seek(0L);
        this.f54902a.write(this.f54907f);
    }

    public synchronized void clear() {
        try {
            m38944B(4096, 0, 0, 0);
            this.f54904c = 0;
            C8374b c8374b = C8374b.f54911c;
            this.f54905d = c8374b;
            this.f54906e = c8374b;
            if (this.f54903b > 4096) {
                m38922y(4096);
            }
            this.f54903b = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f54902a.close();
    }

    /* renamed from: j */
    public void m38937j(byte[] bArr) {
        m38936k(bArr, 0, bArr.length);
    }

    /* renamed from: k */
    public synchronized void m38936k(byte[] bArr, int i, int i2) {
        int m38945A;
        int i3;
        try {
            m38931p(bArr, "buffer");
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                m38935l(i2);
                boolean m38932o = m38932o();
                if (m38932o) {
                    m38945A = 16;
                } else {
                    C8374b c8374b = this.f54906e;
                    m38945A = m38945A(c8374b.f54912a + 4 + c8374b.f54913b);
                }
                C8374b c8374b2 = new C8374b(m38945A, i2);
                m38943C(this.f54907f, 0, i2);
                m38923x(c8374b2.f54912a, this.f54907f, 0, 4);
                m38923x(c8374b2.f54912a + 4, bArr, i, i2);
                if (m38932o) {
                    i3 = c8374b2.f54912a;
                } else {
                    i3 = this.f54905d.f54912a;
                }
                m38944B(this.f54903b, this.f54904c + 1, i3, c8374b2.f54912a);
                this.f54906e = c8374b2;
                this.f54904c++;
                if (m38932o) {
                    this.f54905d = c8374b2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: l */
    public final void m38935l(int i) {
        int i2 = i + 4;
        int m38926u = m38926u();
        if (m38926u >= i2) {
            return;
        }
        int i3 = this.f54903b;
        do {
            m38926u += i3;
            i3 <<= 1;
        } while (m38926u < i2);
        m38922y(i3);
        C8374b c8374b = this.f54906e;
        int m38945A = m38945A(c8374b.f54912a + 4 + c8374b.f54913b);
        if (m38945A < this.f54905d.f54912a) {
            FileChannel channel = this.f54902a.getChannel();
            channel.position(this.f54903b);
            long j = m38945A - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f54906e.f54912a;
        int i5 = this.f54905d.f54912a;
        if (i4 < i5) {
            int i6 = (this.f54903b + i4) - 16;
            m38944B(i3, this.f54904c, i5, i6);
            this.f54906e = new C8374b(i6, this.f54906e.f54913b);
        } else {
            m38944B(i3, this.f54904c, i5, i4);
        }
        this.f54903b = i3;
    }

    /* renamed from: m */
    public synchronized void m38934m(ElementReader elementReader) {
        int i = this.f54905d.f54912a;
        for (int i2 = 0; i2 < this.f54904c; i2++) {
            C8374b m38929r = m38929r(i);
            elementReader.read(new C8375c(this, m38929r, null), m38929r.f54913b);
            i = m38945A(m38929r.f54912a + 4 + m38929r.f54913b);
        }
    }

    /* renamed from: o */
    public synchronized boolean m38932o() {
        boolean z;
        if (this.f54904c == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: r */
    public final C8374b m38929r(int i) {
        if (i == 0) {
            return C8374b.f54911c;
        }
        this.f54902a.seek(i);
        return new C8374b(i, this.f54902a.readInt());
    }

    /* renamed from: s */
    public final void m38928s() {
        this.f54902a.seek(0L);
        this.f54902a.readFully(this.f54907f);
        int m38927t = m38927t(this.f54907f, 0);
        this.f54903b = m38927t;
        if (m38927t <= this.f54902a.length()) {
            this.f54904c = m38927t(this.f54907f, 4);
            int m38927t2 = m38927t(this.f54907f, 8);
            int m38927t3 = m38927t(this.f54907f, 12);
            this.f54905d = m38929r(m38927t2);
            this.f54906e = m38929r(m38927t3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f54903b + ", Actual length: " + this.f54902a.length());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("fileLength=");
        sb.append(this.f54903b);
        sb.append(", size=");
        sb.append(this.f54904c);
        sb.append(", first=");
        sb.append(this.f54905d);
        sb.append(", last=");
        sb.append(this.f54906e);
        sb.append(", element lengths=[");
        try {
            m38934m(new C8373a(sb));
        } catch (IOException e) {
            f54901g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: u */
    public final int m38926u() {
        return this.f54903b - m38921z();
    }

    /* renamed from: v */
    public synchronized void m38925v() {
        try {
            if (!m38932o()) {
                if (this.f54904c == 1) {
                    clear();
                } else {
                    C8374b c8374b = this.f54905d;
                    int m38945A = m38945A(c8374b.f54912a + 4 + c8374b.f54913b);
                    m38924w(m38945A, this.f54907f, 0, 4);
                    int m38927t = m38927t(this.f54907f, 0);
                    m38944B(this.f54903b, this.f54904c - 1, m38945A, this.f54906e.f54912a);
                    this.f54904c--;
                    this.f54905d = new C8374b(m38945A, m38927t);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: w */
    public final void m38924w(int i, byte[] bArr, int i2, int i3) {
        int m38945A = m38945A(i);
        int i4 = m38945A + i3;
        int i5 = this.f54903b;
        if (i4 <= i5) {
            this.f54902a.seek(m38945A);
            this.f54902a.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m38945A;
        this.f54902a.seek(m38945A);
        this.f54902a.readFully(bArr, i2, i6);
        this.f54902a.seek(16L);
        this.f54902a.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: x */
    public final void m38923x(int i, byte[] bArr, int i2, int i3) {
        int m38945A = m38945A(i);
        int i4 = m38945A + i3;
        int i5 = this.f54903b;
        if (i4 <= i5) {
            this.f54902a.seek(m38945A);
            this.f54902a.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m38945A;
        this.f54902a.seek(m38945A);
        this.f54902a.write(bArr, i2, i6);
        this.f54902a.seek(16L);
        this.f54902a.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: y */
    public final void m38922y(int i) {
        this.f54902a.setLength(i);
        this.f54902a.getChannel().force(true);
    }

    /* renamed from: z */
    public int m38921z() {
        if (this.f54904c == 0) {
            return 16;
        }
        C8374b c8374b = this.f54906e;
        int i = c8374b.f54912a;
        int i2 = this.f54905d.f54912a;
        if (i >= i2) {
            return (i - i2) + 4 + c8374b.f54913b + 16;
        }
        return (((i + 4) + c8374b.f54913b) + this.f54903b) - i2;
    }
}
