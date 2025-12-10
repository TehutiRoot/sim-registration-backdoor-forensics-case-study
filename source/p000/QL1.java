package p000;

import com.google.zxing.aztec.encoder.HighLevelEncoder;
import com.google.zxing.common.BitArray;
import java.util.LinkedList;

/* renamed from: QL1 */
/* loaded from: classes5.dex */
public final class QL1 {

    /* renamed from: e */
    public static final QL1 f5037e = new QL1(AbstractC22624vT1.f107697b, 0, 0, 0);

    /* renamed from: a */
    public final int f5038a;

    /* renamed from: b */
    public final AbstractC22624vT1 f5039b;

    /* renamed from: c */
    public final int f5040c;

    /* renamed from: d */
    public final int f5041d;

    public QL1(AbstractC22624vT1 abstractC22624vT1, int i, int i2, int i3) {
        this.f5039b = abstractC22624vT1;
        this.f5038a = i;
        this.f5040c = i2;
        this.f5041d = i3;
    }

    /* renamed from: a */
    public QL1 m66617a(int i) {
        int i2;
        AbstractC22624vT1 abstractC22624vT1 = this.f5039b;
        int i3 = this.f5038a;
        int i4 = this.f5041d;
        if (i3 == 4 || i3 == 2) {
            int i5 = HighLevelEncoder.f57628c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            abstractC22624vT1 = abstractC22624vT1.m1029a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f5040c;
        if (i8 != 0 && i8 != 31) {
            if (i8 == 62) {
                i2 = 9;
            } else {
                i2 = 8;
            }
        } else {
            i2 = 18;
        }
        QL1 ql1 = new QL1(abstractC22624vT1, i3, i8 + 1, i4 + i2);
        if (ql1.f5040c == 2078) {
            return ql1.m66616b(i + 1);
        }
        return ql1;
    }

    /* renamed from: b */
    public QL1 m66616b(int i) {
        int i2 = this.f5040c;
        if (i2 == 0) {
            return this;
        }
        return new QL1(this.f5039b.m1028b(i - i2, i2), this.f5038a, 0, this.f5041d);
    }

    /* renamed from: c */
    public int m66615c() {
        return this.f5040c;
    }

    /* renamed from: d */
    public int m66614d() {
        return this.f5041d;
    }

    /* renamed from: e */
    public int m66613e() {
        return this.f5038a;
    }

    /* renamed from: f */
    public boolean m66612f(QL1 ql1) {
        int i;
        int i2 = this.f5041d + (HighLevelEncoder.f57628c[this.f5038a][ql1.f5038a] >> 16);
        int i3 = ql1.f5040c;
        if (i3 > 0 && ((i = this.f5040c) == 0 || i > i3)) {
            i2 += 10;
        }
        if (i2 <= ql1.f5041d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public QL1 m66611g(int i, int i2) {
        int i3;
        int i4 = this.f5041d;
        AbstractC22624vT1 abstractC22624vT1 = this.f5039b;
        int i5 = this.f5038a;
        if (i != i5) {
            int i6 = HighLevelEncoder.f57628c[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            abstractC22624vT1 = abstractC22624vT1.m1029a(i7, i8);
            i4 += i8;
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new QL1(abstractC22624vT1.m1029a(i2, i3), i, 0, i4 + i3);
    }

    /* renamed from: h */
    public QL1 m66610h(int i, int i2) {
        int i3;
        AbstractC22624vT1 abstractC22624vT1 = this.f5039b;
        int i4 = this.f5038a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new QL1(abstractC22624vT1.m1029a(HighLevelEncoder.f57630e[i4][i], i3).m1029a(i2, 5), this.f5038a, 0, this.f5041d + i3 + 5);
    }

    /* renamed from: i */
    public BitArray m66609i(byte[] bArr) {
        LinkedList<AbstractC22624vT1> linkedList = new LinkedList();
        for (AbstractC22624vT1 abstractC22624vT1 = m66616b(bArr.length).f5039b; abstractC22624vT1 != null; abstractC22624vT1 = abstractC22624vT1.m1026d()) {
            linkedList.addFirst(abstractC22624vT1);
        }
        BitArray bitArray = new BitArray();
        for (AbstractC22624vT1 abstractC22624vT12 : linkedList) {
            abstractC22624vT12.mo1027c(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.f57627b[this.f5038a], Integer.valueOf(this.f5041d), Integer.valueOf(this.f5040c));
    }
}
