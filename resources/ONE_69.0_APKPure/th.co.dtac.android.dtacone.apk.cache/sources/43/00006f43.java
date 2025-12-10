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
    public final InterfaceC18829Xs1 f35338a;

    /* renamed from: b */
    public final ArrayList f35339b;

    /* renamed from: c */
    public final HashMap f35340c;

    /* renamed from: d */
    public final HashMap f35341d;

    /* renamed from: e */
    public final int f35342e;

    /* renamed from: f */
    public boolean f35343f;

    /* renamed from: g */
    public Comparator f35344g;

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$a */
    /* loaded from: classes2.dex */
    public class C4522a implements Comparator {
        public C4522a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C4523b c4523b, C4523b c4523b2) {
            byte b;
            byte b2;
            int i = c4523b.f35350e;
            int i2 = c4523b2.f35350e;
            do {
                b = FlexBuffersBuilder.this.f35338a.get(i);
                b2 = FlexBuffersBuilder.this.f35338a.get(i2);
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
    public static int m54628h(long j) {
        if (j <= FlexBuffers.C4521c.m54638a((byte) -1)) {
            return 0;
        }
        if (j <= FlexBuffers.C4521c.m54636c((short) -1)) {
            return 1;
        }
        if (j <= FlexBuffers.C4521c.m54637b(-1)) {
            return 2;
        }
        return 3;
    }

    /* renamed from: b */
    public final int m54634b(int i) {
        int i2 = 1 << i;
        int m54604q = C4523b.m54604q(this.f35338a.writePosition(), i2);
        while (true) {
            int i3 = m54604q - 1;
            if (m54604q != 0) {
                this.f35338a.put((byte) 0);
                m54604q = i3;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: c */
    public final C4523b m54633c(int i, int i2) {
        long j = i2;
        int max = Math.max(0, m54628h(j));
        int i3 = i;
        while (i3 < this.f35339b.size()) {
            i3++;
            max = Math.max(max, C4523b.m54612i(4, 0, ((C4523b) this.f35339b.get(i3)).f35350e, this.f35338a.writePosition(), i3));
        }
        int m54634b = m54634b(max);
        m54624l(j, m54634b);
        int writePosition = this.f35338a.writePosition();
        while (i < this.f35339b.size()) {
            int i4 = ((C4523b) this.f35339b.get(i)).f35350e;
            m54623m(((C4523b) this.f35339b.get(i)).f35350e, m54634b);
            i++;
        }
        return new C4523b(-1, FlexBuffers.m54645o(4, 0), max, writePosition);
    }

    /* renamed from: d */
    public final C4523b m54632d(int i, int i2, int i3, boolean z, boolean z2, C4523b c4523b) {
        int i4;
        int i5;
        int i6 = i3;
        long j = i6;
        int max = Math.max(0, m54628h(j));
        if (c4523b != null) {
            max = Math.max(max, c4523b.m54613h(this.f35338a.writePosition(), 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i7 = 4;
        int i8 = max;
        for (int i9 = i2; i9 < this.f35339b.size(); i9++) {
            i8 = Math.max(i8, ((C4523b) this.f35339b.get(i9)).m54613h(this.f35338a.writePosition(), i9 + i4));
            if (z && i9 == i2) {
                i7 = ((C4523b) this.f35339b.get(i9)).f35346a;
                if (!FlexBuffers.m54650j(i7)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i10 = i2;
        int m54634b = m54634b(i8);
        if (c4523b != null) {
            m54623m(c4523b.f35349d, m54634b);
            m54624l(1 << c4523b.f35347b, m54634b);
        }
        if (!z2) {
            m54624l(j, m54634b);
        }
        int writePosition = this.f35338a.writePosition();
        for (int i11 = i10; i11 < this.f35339b.size(); i11++) {
            m54627i((C4523b) this.f35339b.get(i11), m54634b);
        }
        if (!z) {
            while (i10 < this.f35339b.size()) {
                this.f35338a.put(((C4523b) this.f35339b.get(i10)).m54602s(i8));
                i10++;
            }
        }
        if (c4523b != null) {
            i5 = 9;
        } else if (z) {
            if (!z2) {
                i6 = 0;
            }
            i5 = FlexBuffers.m54645o(i7, i6);
        } else {
            i5 = 10;
        }
        return new C4523b(i, i5, i8, writePosition);
    }

    /* renamed from: e */
    public final int m54631e(String str) {
        if (str == null) {
            return -1;
        }
        int writePosition = this.f35338a.writePosition();
        if ((this.f35342e & 1) != 0) {
            Integer num = (Integer) this.f35340c.get(str);
            if (num == null) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                this.f35338a.put(bytes, 0, bytes.length);
                this.f35338a.put((byte) 0);
                this.f35340c.put(str, Integer.valueOf(writePosition));
                return writePosition;
            }
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f35338a.put(bytes2, 0, bytes2.length);
        this.f35338a.put((byte) 0);
        this.f35340c.put(str, Integer.valueOf(writePosition));
        return writePosition;
    }

    public int endMap(String str, int i) {
        int m54631e = m54631e(str);
        ArrayList arrayList = this.f35339b;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.f35344g);
        C4523b m54632d = m54632d(m54631e, i, this.f35339b.size() - i, false, false, m54633c(i, this.f35339b.size() - i));
        while (this.f35339b.size() > i) {
            ArrayList arrayList2 = this.f35339b;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.f35339b.add(m54632d);
        return (int) m54632d.f35349d;
    }

    public int endVector(String str, int i, boolean z, boolean z2) {
        C4523b m54632d = m54632d(m54631e(str), i, this.f35339b.size() - i, z, z2, null);
        while (this.f35339b.size() > i) {
            ArrayList arrayList = this.f35339b;
            arrayList.remove(arrayList.size() - 1);
        }
        this.f35339b.add(m54632d);
        return (int) m54632d.f35349d;
    }

    /* renamed from: f */
    public final void m54630f(String str, long j) {
        C4523b m54598w;
        int m54631e = m54631e(str);
        int m54628h = m54628h(j);
        if (m54628h == 0) {
            m54598w = C4523b.m54597x(m54631e, (int) j);
        } else if (m54628h == 1) {
            m54598w = C4523b.m54600u(m54631e, (int) j);
        } else if (m54628h == 2) {
            m54598w = C4523b.m54599v(m54631e, (int) j);
        } else {
            m54598w = C4523b.m54598w(m54631e, j);
        }
        this.f35339b.add(m54598w);
    }

    public ByteBuffer finish() {
        int m54634b = m54634b(((C4523b) this.f35339b.get(0)).m54613h(this.f35338a.writePosition(), 0));
        m54627i((C4523b) this.f35339b.get(0), m54634b);
        this.f35338a.put(((C4523b) this.f35339b.get(0)).m54603r());
        this.f35338a.put((byte) m54634b);
        this.f35343f = true;
        return ByteBuffer.wrap(this.f35338a.data(), 0, this.f35338a.writePosition());
    }

    /* renamed from: g */
    public final void m54629g(String str, long j) {
        this.f35339b.add(C4523b.m54598w(m54631e(str), j));
    }

    public InterfaceC18829Xs1 getBuffer() {
        return this.f35338a;
    }

    /* renamed from: i */
    public final void m54627i(C4523b c4523b, int i) {
        int i2 = c4523b.f35346a;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 26) {
                    m54623m(c4523b.f35349d, i);
                    return;
                }
            } else {
                m54625k(c4523b.f35348c, i);
                return;
            }
        }
        m54624l(c4523b.f35349d, i);
    }

    /* renamed from: j */
    public final C4523b m54626j(int i, byte[] bArr, int i2, boolean z) {
        int m54628h = m54628h(bArr.length);
        m54624l(bArr.length, m54634b(m54628h));
        int writePosition = this.f35338a.writePosition();
        this.f35338a.put(bArr, 0, bArr.length);
        if (z) {
            this.f35338a.put((byte) 0);
        }
        return C4523b.m54615f(i, writePosition, i2, m54628h);
    }

    /* renamed from: k */
    public final void m54625k(double d, int i) {
        if (i == 4) {
            this.f35338a.putFloat((float) d);
        } else if (i == 8) {
            this.f35338a.putDouble(d);
        }
    }

    /* renamed from: l */
    public final void m54624l(long j, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.f35338a.putLong(j);
                        return;
                    }
                    return;
                }
                this.f35338a.putInt((int) j);
                return;
            }
            this.f35338a.putShort((short) j);
            return;
        }
        this.f35338a.put((byte) j);
    }

    /* renamed from: m */
    public final void m54623m(long j, int i) {
        m54624l((int) (this.f35338a.writePosition() - j), i);
    }

    /* renamed from: n */
    public final C4523b m54622n(int i, String str) {
        return m54626j(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
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
        m54630f(null, i);
    }

    public void putUInt64(BigInteger bigInteger) {
        m54629g(null, bigInteger.longValue());
    }

    public int startMap() {
        return this.f35339b.size();
    }

    public int startVector() {
        return this.f35339b.size();
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    public int putBlob(String str, byte[] bArr) {
        C4523b m54626j = m54626j(m54631e(str), bArr, 25, false);
        this.f35339b.add(m54626j);
        return (int) m54626j.f35349d;
    }

    public void putBoolean(String str, boolean z) {
        this.f35339b.add(C4523b.m54614g(m54631e(str), z));
    }

    public void putFloat(String str, float f) {
        this.f35339b.add(C4523b.m54611j(m54631e(str), f));
    }

    public void putInt(String str, int i) {
        putInt(str, i);
    }

    public int putString(String str, String str2) {
        long j;
        int m54631e = m54631e(str);
        if ((this.f35342e & 2) != 0) {
            Integer num = (Integer) this.f35341d.get(str2);
            if (num == null) {
                C4523b m54622n = m54622n(m54631e, str2);
                this.f35341d.put(str2, Integer.valueOf((int) m54622n.f35349d));
                this.f35339b.add(m54622n);
                j = m54622n.f35349d;
            } else {
                this.f35339b.add(C4523b.m54615f(m54631e, num.intValue(), 5, m54628h(str2.length())));
                return num.intValue();
            }
        } else {
            C4523b m54622n2 = m54622n(m54631e, str2);
            this.f35339b.add(m54622n2);
            j = m54622n2.f35349d;
        }
        return (int) j;
    }

    public void putUInt(long j) {
        m54630f(null, j);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i);
    }

    public void putFloat(double d) {
        putFloat((String) null, d);
    }

    public void putInt(String str, long j) {
        int m54631e = m54631e(str);
        if (-128 <= j && j <= 127) {
            this.f35339b.add(C4523b.m54606o(m54631e, (int) j));
        } else if (-32768 <= j && j <= 32767) {
            this.f35339b.add(C4523b.m54609l(m54631e, (int) j));
        } else if (-2147483648L <= j && j <= 2147483647L) {
            this.f35339b.add(C4523b.m54608m(m54631e, (int) j));
        } else {
            this.f35339b.add(C4523b.m54607n(m54631e, j));
        }
    }

    public FlexBuffersBuilder(InterfaceC18829Xs1 interfaceC18829Xs1, int i) {
        this.f35339b = new ArrayList();
        this.f35340c = new HashMap();
        this.f35341d = new HashMap();
        this.f35343f = false;
        this.f35344g = new C4522a();
        this.f35338a = interfaceC18829Xs1;
        this.f35342e = i;
    }

    public void putFloat(String str, double d) {
        this.f35339b.add(C4523b.m54610k(m54631e(str), d));
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$b */
    /* loaded from: classes2.dex */
    public static class C4523b {

        /* renamed from: a */
        public final int f35346a;

        /* renamed from: b */
        public final int f35347b;

        /* renamed from: c */
        public final double f35348c;

        /* renamed from: d */
        public long f35349d;

        /* renamed from: e */
        public int f35350e;

        public C4523b(int i, int i2, int i3, long j) {
            this.f35350e = i;
            this.f35346a = i2;
            this.f35347b = i3;
            this.f35349d = j;
            this.f35348c = Double.MIN_VALUE;
        }

        /* renamed from: f */
        public static C4523b m54615f(int i, int i2, int i3, int i4) {
            return new C4523b(i, i3, i4, i2);
        }

        /* renamed from: g */
        public static C4523b m54614g(int i, boolean z) {
            long j;
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            return new C4523b(i, 26, 0, j);
        }

        /* renamed from: i */
        public static int m54612i(int i, int i2, long j, int i3, int i4) {
            if (FlexBuffers.m54652h(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int m54628h = FlexBuffersBuilder.m54628h((int) (((m54604q(i3, i5) + i3) + (i4 * i5)) - j));
                if ((1 << m54628h) == i5) {
                    return m54628h;
                }
            }
            return 3;
        }

        /* renamed from: j */
        public static C4523b m54611j(int i, float f) {
            return new C4523b(i, 3, 2, f);
        }

        /* renamed from: k */
        public static C4523b m54610k(int i, double d) {
            return new C4523b(i, 3, 3, d);
        }

        /* renamed from: l */
        public static C4523b m54609l(int i, int i2) {
            return new C4523b(i, 1, 1, i2);
        }

        /* renamed from: m */
        public static C4523b m54608m(int i, int i2) {
            return new C4523b(i, 1, 2, i2);
        }

        /* renamed from: n */
        public static C4523b m54607n(int i, long j) {
            return new C4523b(i, 1, 3, j);
        }

        /* renamed from: o */
        public static C4523b m54606o(int i, int i2) {
            return new C4523b(i, 1, 0, i2);
        }

        /* renamed from: p */
        public static byte m54605p(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        /* renamed from: q */
        public static int m54604q(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        /* renamed from: u */
        public static C4523b m54600u(int i, int i2) {
            return new C4523b(i, 2, 1, i2);
        }

        /* renamed from: v */
        public static C4523b m54599v(int i, int i2) {
            return new C4523b(i, 2, 2, i2);
        }

        /* renamed from: w */
        public static C4523b m54598w(int i, long j) {
            return new C4523b(i, 2, 3, j);
        }

        /* renamed from: x */
        public static C4523b m54597x(int i, int i2) {
            return new C4523b(i, 2, 0, i2);
        }

        /* renamed from: h */
        public final int m54613h(int i, int i2) {
            return m54612i(this.f35346a, this.f35347b, this.f35349d, i, i2);
        }

        /* renamed from: r */
        public final byte m54603r() {
            return m54602s(0);
        }

        /* renamed from: s */
        public final byte m54602s(int i) {
            return m54605p(m54601t(i), this.f35346a);
        }

        /* renamed from: t */
        public final int m54601t(int i) {
            if (FlexBuffers.m54652h(this.f35346a)) {
                return Math.max(this.f35347b, i);
            }
            return this.f35347b;
        }

        public C4523b(int i, int i2, int i3, double d) {
            this.f35350e = i;
            this.f35346a = i2;
            this.f35347b = i3;
            this.f35348c = d;
            this.f35349d = Long.MIN_VALUE;
        }
    }

    public void putInt(long j) {
        putInt((String) null, j);
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}