package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class FlexBuffersBuilder {
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;

    /* renamed from: a */
    public final InterfaceC19080as1 f35250a;

    /* renamed from: b */
    public final ArrayList f35251b;

    /* renamed from: c */
    public final HashMap f35252c;

    /* renamed from: d */
    public final HashMap f35253d;

    /* renamed from: e */
    public final int f35254e;

    /* renamed from: f */
    public boolean f35255f;

    /* renamed from: g */
    public Comparator f35256g;

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$a */
    /* loaded from: classes2.dex */
    public class C4540a implements Comparator {
        public C4540a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C4541b c4541b, C4541b c4541b2) {
            byte b;
            byte b2;
            int i = c4541b.f35262e;
            int i2 = c4541b2.f35262e;
            do {
                b = FlexBuffersBuilder.this.f35250a.get(i);
                b2 = FlexBuffersBuilder.this.f35250a.get(i2);
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }

    public FlexBuffersBuilder(int i) {
        this(new ArrayReadWriteBuf(i), 1);
    }

    /* renamed from: h */
    public static int m54678h(long j) {
        if (j <= FlexBuffers.C4539c.m54688a((byte) -1)) {
            return 0;
        }
        if (j <= FlexBuffers.C4539c.m54686c((short) -1)) {
            return 1;
        }
        if (j <= FlexBuffers.C4539c.m54687b(-1)) {
            return 2;
        }
        return 3;
    }

    /* renamed from: b */
    public final int m54684b(int i) {
        int i2 = 1 << i;
        int m54654q = C4541b.m54654q(this.f35250a.writePosition(), i2);
        while (true) {
            int i3 = m54654q - 1;
            if (m54654q != 0) {
                this.f35250a.put((byte) 0);
                m54654q = i3;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: c */
    public final C4541b m54683c(int i, int i2) {
        long j = i2;
        int max = Math.max(0, m54678h(j));
        int i3 = i;
        while (i3 < this.f35251b.size()) {
            i3++;
            max = Math.max(max, C4541b.m54662i(4, 0, ((C4541b) this.f35251b.get(i3)).f35262e, this.f35250a.writePosition(), i3));
        }
        int m54684b = m54684b(max);
        m54674l(j, m54684b);
        int writePosition = this.f35250a.writePosition();
        while (i < this.f35251b.size()) {
            int i4 = ((C4541b) this.f35251b.get(i)).f35262e;
            m54673m(((C4541b) this.f35251b.get(i)).f35262e, m54684b);
            i++;
        }
        return new C4541b(-1, FlexBuffers.m54695o(4, 0), max, writePosition);
    }

    /* renamed from: d */
    public final C4541b m54682d(int i, int i2, int i3, boolean z, boolean z2, C4541b c4541b) {
        int i4;
        int i5;
        int i6 = i3;
        long j = i6;
        int max = Math.max(0, m54678h(j));
        if (c4541b != null) {
            max = Math.max(max, c4541b.m54663h(this.f35250a.writePosition(), 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i7 = 4;
        int i8 = max;
        for (int i9 = i2; i9 < this.f35251b.size(); i9++) {
            i8 = Math.max(i8, ((C4541b) this.f35251b.get(i9)).m54663h(this.f35250a.writePosition(), i9 + i4));
            if (z && i9 == i2) {
                i7 = ((C4541b) this.f35251b.get(i9)).f35258a;
                if (!FlexBuffers.m54700j(i7)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i10 = i2;
        int m54684b = m54684b(i8);
        if (c4541b != null) {
            m54673m(c4541b.f35261d, m54684b);
            m54674l(1 << c4541b.f35259b, m54684b);
        }
        if (!z2) {
            m54674l(j, m54684b);
        }
        int writePosition = this.f35250a.writePosition();
        for (int i11 = i10; i11 < this.f35251b.size(); i11++) {
            m54677i((C4541b) this.f35251b.get(i11), m54684b);
        }
        if (!z) {
            while (i10 < this.f35251b.size()) {
                this.f35250a.put(((C4541b) this.f35251b.get(i10)).m54652s(i8));
                i10++;
            }
        }
        if (c4541b != null) {
            i5 = 9;
        } else if (z) {
            if (!z2) {
                i6 = 0;
            }
            i5 = FlexBuffers.m54695o(i7, i6);
        } else {
            i5 = 10;
        }
        return new C4541b(i, i5, i8, writePosition);
    }

    /* renamed from: e */
    public final int m54681e(String str) {
        if (str == null) {
            return -1;
        }
        int writePosition = this.f35250a.writePosition();
        if ((this.f35254e & 1) != 0) {
            Integer num = (Integer) this.f35252c.get(str);
            if (num == null) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                this.f35250a.put(bytes, 0, bytes.length);
                this.f35250a.put((byte) 0);
                this.f35252c.put(str, Integer.valueOf(writePosition));
                return writePosition;
            }
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f35250a.put(bytes2, 0, bytes2.length);
        this.f35250a.put((byte) 0);
        this.f35252c.put(str, Integer.valueOf(writePosition));
        return writePosition;
    }

    public int endMap(String str, int i) {
        int m54681e = m54681e(str);
        ArrayList arrayList = this.f35251b;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.f35256g);
        C4541b m54682d = m54682d(m54681e, i, this.f35251b.size() - i, false, false, m54683c(i, this.f35251b.size() - i));
        while (this.f35251b.size() > i) {
            ArrayList arrayList2 = this.f35251b;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.f35251b.add(m54682d);
        return (int) m54682d.f35261d;
    }

    public int endVector(String str, int i, boolean z, boolean z2) {
        C4541b m54682d = m54682d(m54681e(str), i, this.f35251b.size() - i, z, z2, null);
        while (this.f35251b.size() > i) {
            ArrayList arrayList = this.f35251b;
            arrayList.remove(arrayList.size() - 1);
        }
        this.f35251b.add(m54682d);
        return (int) m54682d.f35261d;
    }

    /* renamed from: f */
    public final void m54680f(String str, long j) {
        C4541b m54648w;
        int m54681e = m54681e(str);
        int m54678h = m54678h(j);
        if (m54678h == 0) {
            m54648w = C4541b.m54647x(m54681e, (int) j);
        } else if (m54678h == 1) {
            m54648w = C4541b.m54650u(m54681e, (int) j);
        } else if (m54678h == 2) {
            m54648w = C4541b.m54649v(m54681e, (int) j);
        } else {
            m54648w = C4541b.m54648w(m54681e, j);
        }
        this.f35251b.add(m54648w);
    }

    public ByteBuffer finish() {
        int m54684b = m54684b(((C4541b) this.f35251b.get(0)).m54663h(this.f35250a.writePosition(), 0));
        m54677i((C4541b) this.f35251b.get(0), m54684b);
        this.f35250a.put(((C4541b) this.f35251b.get(0)).m54653r());
        this.f35250a.put((byte) m54684b);
        this.f35255f = true;
        return ByteBuffer.wrap(this.f35250a.data(), 0, this.f35250a.writePosition());
    }

    /* renamed from: g */
    public final void m54679g(String str, long j) {
        this.f35251b.add(C4541b.m54648w(m54681e(str), j));
    }

    public InterfaceC19080as1 getBuffer() {
        return this.f35250a;
    }

    /* renamed from: i */
    public final void m54677i(C4541b c4541b, int i) {
        int i2 = c4541b.f35258a;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 26) {
                    m54673m(c4541b.f35261d, i);
                    return;
                }
            } else {
                m54675k(c4541b.f35260c, i);
                return;
            }
        }
        m54674l(c4541b.f35261d, i);
    }

    /* renamed from: j */
    public final C4541b m54676j(int i, byte[] bArr, int i2, boolean z) {
        int m54678h = m54678h(bArr.length);
        m54674l(bArr.length, m54684b(m54678h));
        int writePosition = this.f35250a.writePosition();
        this.f35250a.put(bArr, 0, bArr.length);
        if (z) {
            this.f35250a.put((byte) 0);
        }
        return C4541b.m54665f(i, writePosition, i2, m54678h);
    }

    /* renamed from: k */
    public final void m54675k(double d, int i) {
        if (i == 4) {
            this.f35250a.putFloat((float) d);
        } else if (i == 8) {
            this.f35250a.putDouble(d);
        }
    }

    /* renamed from: l */
    public final void m54674l(long j, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.f35250a.putLong(j);
                        return;
                    }
                    return;
                }
                this.f35250a.putInt((int) j);
                return;
            }
            this.f35250a.putShort((short) j);
            return;
        }
        this.f35250a.put((byte) j);
    }

    /* renamed from: m */
    public final void m54673m(long j, int i) {
        m54674l((int) (this.f35250a.writePosition() - j), i);
    }

    /* renamed from: n */
    public final C4541b m54672n(int i, String str) {
        return m54676j(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z) {
        putBoolean(null, z);
    }

    public void putFloat(float f) {
        putFloat((String) null, f);
    }

    public void putInt(int i) {
        putInt((String) null, i);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i) {
        m54680f(null, i);
    }

    public void putUInt64(BigInteger bigInteger) {
        m54679g(null, bigInteger.longValue());
    }

    public int startMap() {
        return this.f35251b.size();
    }

    public int startVector() {
        return this.f35251b.size();
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    public int putBlob(String str, byte[] bArr) {
        C4541b m54676j = m54676j(m54681e(str), bArr, 25, false);
        this.f35251b.add(m54676j);
        return (int) m54676j.f35261d;
    }

    public void putBoolean(String str, boolean z) {
        this.f35251b.add(C4541b.m54664g(m54681e(str), z));
    }

    public void putFloat(String str, float f) {
        this.f35251b.add(C4541b.m54661j(m54681e(str), f));
    }

    public void putInt(String str, int i) {
        putInt(str, i);
    }

    public int putString(String str, String str2) {
        long j;
        int m54681e = m54681e(str);
        if ((this.f35254e & 2) != 0) {
            Integer num = (Integer) this.f35253d.get(str2);
            if (num == null) {
                C4541b m54672n = m54672n(m54681e, str2);
                this.f35253d.put(str2, Integer.valueOf((int) m54672n.f35261d));
                this.f35251b.add(m54672n);
                j = m54672n.f35261d;
            } else {
                this.f35251b.add(C4541b.m54665f(m54681e, num.intValue(), 5, m54678h(str2.length())));
                return num.intValue();
            }
        } else {
            C4541b m54672n2 = m54672n(m54681e, str2);
            this.f35251b.add(m54672n2);
            j = m54672n2.f35261d;
        }
        return (int) j;
    }

    public void putUInt(long j) {
        m54680f(null, j);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i);
    }

    public void putFloat(double d) {
        putFloat((String) null, d);
    }

    public void putInt(String str, long j) {
        int m54681e = m54681e(str);
        if (-128 <= j && j <= 127) {
            this.f35251b.add(C4541b.m54656o(m54681e, (int) j));
        } else if (-32768 <= j && j <= 32767) {
            this.f35251b.add(C4541b.m54659l(m54681e, (int) j));
        } else if (-2147483648L <= j && j <= 2147483647L) {
            this.f35251b.add(C4541b.m54658m(m54681e, (int) j));
        } else {
            this.f35251b.add(C4541b.m54657n(m54681e, j));
        }
    }

    public FlexBuffersBuilder(InterfaceC19080as1 interfaceC19080as1, int i) {
        this.f35251b = new ArrayList();
        this.f35252c = new HashMap();
        this.f35253d = new HashMap();
        this.f35255f = false;
        this.f35256g = new C4540a();
        this.f35250a = interfaceC19080as1;
        this.f35254e = i;
    }

    public void putFloat(String str, double d) {
        this.f35251b.add(C4541b.m54660k(m54681e(str), d));
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$b */
    /* loaded from: classes2.dex */
    public static class C4541b {

        /* renamed from: a */
        public final int f35258a;

        /* renamed from: b */
        public final int f35259b;

        /* renamed from: c */
        public final double f35260c;

        /* renamed from: d */
        public long f35261d;

        /* renamed from: e */
        public int f35262e;

        public C4541b(int i, int i2, int i3, long j) {
            this.f35262e = i;
            this.f35258a = i2;
            this.f35259b = i3;
            this.f35261d = j;
            this.f35260c = Double.MIN_VALUE;
        }

        /* renamed from: f */
        public static C4541b m54665f(int i, int i2, int i3, int i4) {
            return new C4541b(i, i3, i4, i2);
        }

        /* renamed from: g */
        public static C4541b m54664g(int i, boolean z) {
            long j;
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            return new C4541b(i, 26, 0, j);
        }

        /* renamed from: i */
        public static int m54662i(int i, int i2, long j, int i3, int i4) {
            if (FlexBuffers.m54702h(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int m54678h = FlexBuffersBuilder.m54678h((int) (((m54654q(i3, i5) + i3) + (i4 * i5)) - j));
                if ((1 << m54678h) == i5) {
                    return m54678h;
                }
            }
            return 3;
        }

        /* renamed from: j */
        public static C4541b m54661j(int i, float f) {
            return new C4541b(i, 3, 2, f);
        }

        /* renamed from: k */
        public static C4541b m54660k(int i, double d) {
            return new C4541b(i, 3, 3, d);
        }

        /* renamed from: l */
        public static C4541b m54659l(int i, int i2) {
            return new C4541b(i, 1, 1, i2);
        }

        /* renamed from: m */
        public static C4541b m54658m(int i, int i2) {
            return new C4541b(i, 1, 2, i2);
        }

        /* renamed from: n */
        public static C4541b m54657n(int i, long j) {
            return new C4541b(i, 1, 3, j);
        }

        /* renamed from: o */
        public static C4541b m54656o(int i, int i2) {
            return new C4541b(i, 1, 0, i2);
        }

        /* renamed from: p */
        public static byte m54655p(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        /* renamed from: q */
        public static int m54654q(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        /* renamed from: u */
        public static C4541b m54650u(int i, int i2) {
            return new C4541b(i, 2, 1, i2);
        }

        /* renamed from: v */
        public static C4541b m54649v(int i, int i2) {
            return new C4541b(i, 2, 2, i2);
        }

        /* renamed from: w */
        public static C4541b m54648w(int i, long j) {
            return new C4541b(i, 2, 3, j);
        }

        /* renamed from: x */
        public static C4541b m54647x(int i, int i2) {
            return new C4541b(i, 2, 0, i2);
        }

        /* renamed from: h */
        public final int m54663h(int i, int i2) {
            return m54662i(this.f35258a, this.f35259b, this.f35261d, i, i2);
        }

        /* renamed from: r */
        public final byte m54653r() {
            return m54652s(0);
        }

        /* renamed from: s */
        public final byte m54652s(int i) {
            return m54655p(m54651t(i), this.f35258a);
        }

        /* renamed from: t */
        public final int m54651t(int i) {
            if (FlexBuffers.m54702h(this.f35258a)) {
                return Math.max(this.f35259b, i);
            }
            return this.f35259b;
        }

        public C4541b(int i, int i2, int i3, double d) {
            this.f35262e = i;
            this.f35258a = i2;
            this.f35259b = i3;
            this.f35260c = d;
            this.f35261d = Long.MIN_VALUE;
        }
    }

    public void putInt(long j) {
        putInt((String) null, j);
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
