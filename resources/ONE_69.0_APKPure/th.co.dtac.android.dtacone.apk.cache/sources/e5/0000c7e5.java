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
public class C10306gg {

    /* renamed from: b */
    public static final String f62237b = CommonUtils.sha1(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c */
    public static final AtomicLong f62238c = new AtomicLong(0);

    /* renamed from: a */
    public final String f62239a;

    public C10306gg() {
        byte[] bArr = new byte[10];
        m31359f(bArr);
        m31360e(bArr);
        m31361d(bArr);
        String hexify = CommonUtils.hexify(bArr);
        Locale locale = Locale.US;
        this.f62239a = String.format(locale, "%s%s%s%s", hexify.substring(0, 12), hexify.substring(12, 16), hexify.subSequence(16, 20), f62237b.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m31364a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    public static byte[] m31363b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    public String m31362c() {
        return this.f62239a;
    }

    /* renamed from: d */
    public final void m31361d(byte[] bArr) {
        byte[] m31363b = m31363b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m31363b[0];
        bArr[9] = m31363b[1];
    }

    /* renamed from: e */
    public final void m31360e(byte[] bArr) {
        byte[] m31363b = m31363b(f62238c.incrementAndGet());
        bArr[6] = m31363b[0];
        bArr[7] = m31363b[1];
    }

    /* renamed from: f */
    public final void m31359f(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m31364a = m31364a(time / 1000);
        bArr[0] = m31364a[0];
        bArr[1] = m31364a[1];
        bArr[2] = m31364a[2];
        bArr[3] = m31364a[3];
        byte[] m31363b = m31363b(time % 1000);
        bArr[4] = m31363b[0];
        bArr[5] = m31363b[1];
    }

    public String toString() {
        return this.f62239a;
    }
}