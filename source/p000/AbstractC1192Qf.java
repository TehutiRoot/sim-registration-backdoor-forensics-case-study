package p000;

import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: Qf */
/* loaded from: classes2.dex */
public abstract class AbstractC1192Qf {

    /* renamed from: a */
    public static final ThreadLocal f5115a = new ThreadLocal();

    /* renamed from: b */
    public static final Class f5116b;

    /* renamed from: c */
    public static final long f5117c;

    static {
        Class m66547e = m66547e("java.io.FileOutputStream");
        f5116b = m66547e;
        f5117c = m66550b(m66547e);
    }

    /* renamed from: a */
    public static byte[] m66551a() {
        SoftReference softReference = (SoftReference) f5115a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: b */
    public static long m66550b(Class cls) {
        if (cls != null) {
            try {
                if (AbstractC22978xY1.m491H()) {
                    return AbstractC22978xY1.m489J(cls.getDeclaredField("channel"));
                }
                return -1L;
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return -1L;
    }

    /* renamed from: c */
    public static byte[] m66549c(int i) {
        int max = Math.max(i, 1024);
        byte[] m66551a = m66551a();
        if (m66551a == null || m66548d(max, m66551a.length)) {
            m66551a = new byte[max];
            if (max <= 16384) {
                m66546f(m66551a);
            }
        }
        return m66551a;
    }

    /* renamed from: d */
    public static boolean m66548d(int i, int i2) {
        if (i2 < i && i2 < i * 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Class m66547e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m66546f(byte[] bArr) {
        f5115a.set(new SoftReference(bArr));
    }

    /* renamed from: g */
    public static void m66545g(ByteBuffer byteBuffer, OutputStream outputStream) {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m66544h(byteBuffer, outputStream)) {
                byte[] m66549c = m66549c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), m66549c.length);
                    byteBuffer.get(m66549c, 0, min);
                    outputStream.write(m66549c, 0, min);
                }
            }
            byteBuffer.position(position);
        } catch (Throwable th2) {
            byteBuffer.position(position);
            throw th2;
        }
    }

    /* renamed from: h */
    public static boolean m66544h(ByteBuffer byteBuffer, OutputStream outputStream) {
        WritableByteChannel writableByteChannel;
        long j = f5117c;
        if (j >= 0 && f5116b.isInstance(outputStream)) {
            try {
                writableByteChannel = (WritableByteChannel) AbstractC22978xY1.m493F(outputStream, j);
            } catch (ClassCastException unused) {
                writableByteChannel = null;
            }
            if (writableByteChannel != null) {
                writableByteChannel.write(byteBuffer);
                return true;
            }
            return false;
        }
        return false;
    }
}
