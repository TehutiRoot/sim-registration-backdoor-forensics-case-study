package p000;

import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: Pf */
/* loaded from: classes4.dex */
public abstract class AbstractC1104Pf {

    /* renamed from: a */
    public static final ThreadLocal f4851a = new ThreadLocal();

    /* renamed from: b */
    public static final Class f4852b;

    /* renamed from: c */
    public static final long f4853c;

    static {
        Class m66944e = m66944e("java.io.FileOutputStream");
        f4852b = m66944e;
        f4853c = m66947b(m66944e);
    }

    /* renamed from: a */
    public static byte[] m66948a() {
        SoftReference softReference = (SoftReference) f4851a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    /* renamed from: b */
    public static long m66947b(Class cls) {
        if (cls != null) {
            try {
                if (AbstractC22358tZ1.m22658J()) {
                    return AbstractC22358tZ1.m22655M(cls.getDeclaredField("channel"));
                }
                return -1L;
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return -1L;
    }

    /* renamed from: c */
    public static byte[] m66946c(int i) {
        int max = Math.max(i, 1024);
        byte[] m66948a = m66948a();
        if (m66948a == null || m66945d(max, m66948a.length)) {
            m66948a = new byte[max];
            if (max <= 16384) {
                m66943f(m66948a);
            }
        }
        return m66948a;
    }

    /* renamed from: d */
    public static boolean m66945d(int i, int i2) {
        if (i2 < i && i2 < i * 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static Class m66944e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m66943f(byte[] bArr) {
        f4851a.set(new SoftReference(bArr));
    }

    /* renamed from: g */
    public static void m66942g(ByteBuffer byteBuffer, OutputStream outputStream) {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m66941h(byteBuffer, outputStream)) {
                byte[] m66946c = m66946c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), m66946c.length);
                    byteBuffer.get(m66946c, 0, min);
                    outputStream.write(m66946c, 0, min);
                }
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position);
        } catch (Throwable th2) {
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position);
            throw th2;
        }
    }

    /* renamed from: h */
    public static boolean m66941h(ByteBuffer byteBuffer, OutputStream outputStream) {
        WritableByteChannel writableByteChannel;
        long j = f4853c;
        if (j >= 0 && f4852b.isInstance(outputStream)) {
            try {
                writableByteChannel = (WritableByteChannel) AbstractC22358tZ1.m22660H(outputStream, j);
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