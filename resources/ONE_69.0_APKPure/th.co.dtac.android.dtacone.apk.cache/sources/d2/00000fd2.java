package p000;

import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: Qf */
/* loaded from: classes2.dex */
public abstract class AbstractC1172Qf {

    /* renamed from: a */
    public static final ThreadLocal f5265a = new ThreadLocal();

    /* renamed from: b */
    public static final Class f5266b;

    /* renamed from: c */
    public static final long f5267c;

    static {
        Class m66745e = m66745e("java.io.FileOutputStream");
        f5266b = m66745e;
        f5267c = m66748b(m66745e);
    }

    /* renamed from: a */
    public static byte[] m66749a() {
        SoftReference softReference = (SoftReference) f5265a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: b */
    public static long m66748b(Class cls) {
        if (cls != null) {
            try {
                if (AbstractC22531uZ1.m1152H()) {
                    return AbstractC22531uZ1.m1150J(cls.getDeclaredField("channel"));
                }
                return -1L;
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return -1L;
    }

    /* renamed from: c */
    public static byte[] m66747c(int i) {
        int max = Math.max(i, 1024);
        byte[] m66749a = m66749a();
        if (m66749a == null || m66746d(max, m66749a.length)) {
            m66749a = new byte[max];
            if (max <= 16384) {
                m66744f(m66749a);
            }
        }
        return m66749a;
    }

    /* renamed from: d */
    public static boolean m66746d(int i, int i2) {
        if (i2 < i && i2 < i * 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Class m66745e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m66744f(byte[] bArr) {
        f5265a.set(new SoftReference(bArr));
    }

    /* renamed from: g */
    public static void m66743g(ByteBuffer byteBuffer, OutputStream outputStream) {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m66742h(byteBuffer, outputStream)) {
                byte[] m66747c = m66747c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), m66747c.length);
                    byteBuffer.get(m66747c, 0, min);
                    outputStream.write(m66747c, 0, min);
                }
            }
            byteBuffer.position(position);
        } catch (Throwable th2) {
            byteBuffer.position(position);
            throw th2;
        }
    }

    /* renamed from: h */
    public static boolean m66742h(ByteBuffer byteBuffer, OutputStream outputStream) {
        WritableByteChannel writableByteChannel;
        long j = f5267c;
        if (j >= 0 && f5266b.isInstance(outputStream)) {
            try {
                writableByteChannel = (WritableByteChannel) AbstractC22531uZ1.m1154F(outputStream, j);
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