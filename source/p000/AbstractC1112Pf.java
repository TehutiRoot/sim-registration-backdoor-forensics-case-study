package p000;

import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: Pf */
/* loaded from: classes4.dex */
public abstract class AbstractC1112Pf {

    /* renamed from: a */
    public static final ThreadLocal f4793a = new ThreadLocal();

    /* renamed from: b */
    public static final Class f4794b;

    /* renamed from: c */
    public static final long f4795c;

    static {
        Class m66774e = m66774e("java.io.FileOutputStream");
        f4794b = m66774e;
        f4795c = m66777b(m66774e);
    }

    /* renamed from: a */
    public static byte[] m66778a() {
        SoftReference softReference = (SoftReference) f4793a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: b */
    public static long m66777b(Class cls) {
        if (cls != null) {
            try {
                if (AbstractC22806wY1.m818J()) {
                    return AbstractC22806wY1.m815M(cls.getDeclaredField("channel"));
                }
                return -1L;
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return -1L;
    }

    /* renamed from: c */
    public static byte[] m66776c(int i) {
        int max = Math.max(i, 1024);
        byte[] m66778a = m66778a();
        if (m66778a == null || m66775d(max, m66778a.length)) {
            m66778a = new byte[max];
            if (max <= 16384) {
                m66773f(m66778a);
            }
        }
        return m66778a;
    }

    /* renamed from: d */
    public static boolean m66775d(int i, int i2) {
        if (i2 < i && i2 < i * 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Class m66774e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m66773f(byte[] bArr) {
        f4793a.set(new SoftReference(bArr));
    }

    /* renamed from: g */
    public static void m66772g(ByteBuffer byteBuffer, OutputStream outputStream) {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m66771h(byteBuffer, outputStream)) {
                byte[] m66776c = m66776c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), m66776c.length);
                    byteBuffer.get(m66776c, 0, min);
                    outputStream.write(m66776c, 0, min);
                }
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position);
        } catch (Throwable th2) {
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position);
            throw th2;
        }
    }

    /* renamed from: h */
    public static boolean m66771h(ByteBuffer byteBuffer, OutputStream outputStream) {
        WritableByteChannel writableByteChannel;
        long j = f4795c;
        if (j >= 0 && f4794b.isInstance(outputStream)) {
            try {
                writableByteChannel = (WritableByteChannel) AbstractC22806wY1.m820H(outputStream, j);
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
