package p000;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: gg */
/* loaded from: classes4.dex */
public class C10318gg {

    /* renamed from: b */
    public static final String f62218b = CommonUtils.sha1(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c */
    public static final AtomicLong f62219c = new AtomicLong(0);

    /* renamed from: a */
    public final String f62220a;

    public C10318gg() {
        byte[] bArr = new byte[10];
        m31068f(bArr);
        m31069e(bArr);
        m31070d(bArr);
        String hexify = CommonUtils.hexify(bArr);
        Locale locale = Locale.US;
        this.f62220a = String.format(locale, "%s%s%s%s", hexify.substring(0, 12), hexify.substring(12, 16), hexify.subSequence(16, 20), f62218b.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m31073a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    public static byte[] m31072b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    public String m31071c() {
        return this.f62220a;
    }

    /* renamed from: d */
    public final void m31070d(byte[] bArr) {
        byte[] m31072b = m31072b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m31072b[0];
        bArr[9] = m31072b[1];
    }

    /* renamed from: e */
    public final void m31069e(byte[] bArr) {
        byte[] m31072b = m31072b(f62219c.incrementAndGet());
        bArr[6] = m31072b[0];
        bArr[7] = m31072b[1];
    }

    /* renamed from: f */
    public final void m31068f(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m31073a = m31073a(time / 1000);
        bArr[0] = m31073a[0];
        bArr[1] = m31073a[1];
        bArr[2] = m31073a[2];
        bArr[3] = m31073a[3];
        byte[] m31072b = m31072b(time % 1000);
        bArr[4] = m31072b[0];
        bArr[5] = m31072b[1];
    }

    public String toString() {
        return this.f62220a;
    }
}
