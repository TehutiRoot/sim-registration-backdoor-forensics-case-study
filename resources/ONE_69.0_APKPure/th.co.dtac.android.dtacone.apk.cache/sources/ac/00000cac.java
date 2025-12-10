package p000;

import com.google.zxing.aztec.encoder.HighLevelEncoder;
import com.google.zxing.common.BitArray;
import java.util.LinkedList;

/* renamed from: NM1 */
/* loaded from: classes5.dex */
public final class NM1 {

    /* renamed from: e */
    public static final NM1 f4149e = new NM1(AbstractC22175sU1.f79904b, 0, 0, 0);

    /* renamed from: a */
    public final int f4150a;

    /* renamed from: b */
    public final AbstractC22175sU1 f4151b;

    /* renamed from: c */
    public final int f4152c;

    /* renamed from: d */
    public final int f4153d;

    public NM1(AbstractC22175sU1 abstractC22175sU1, int i, int i2, int i3) {
        this.f4151b = abstractC22175sU1;
        this.f4150a = i;
        this.f4152c = i2;
        this.f4153d = i3;
    }

    /* renamed from: a */
    public NM1 m67257a(int i) {
        int i2;
        AbstractC22175sU1 abstractC22175sU1 = this.f4151b;
        int i3 = this.f4150a;
        int i4 = this.f4153d;
        if (i3 == 4 || i3 == 2) {
            int i5 = HighLevelEncoder.f57640c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            abstractC22175sU1 = abstractC22175sU1.m22811a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f4152c;
        if (i8 != 0 && i8 != 31) {
            if (i8 == 62) {
                i2 = 9;
            } else {
                i2 = 8;
            }
        } else {
            i2 = 18;
        }
        NM1 nm1 = new NM1(abstractC22175sU1, i3, i8 + 1, i4 + i2);
        if (nm1.f4152c == 2078) {
            return nm1.m67256b(i + 1);
        }
        return nm1;
    }

    /* renamed from: b */
    public NM1 m67256b(int i) {
        int i2 = this.f4152c;
        if (i2 == 0) {
            return this;
        }
        return new NM1(this.f4151b.m22810b(i - i2, i2), this.f4150a, 0, this.f4153d);
    }

    /* renamed from: c */
    public int m67255c() {
        return this.f4152c;
    }

    /* renamed from: d */
    public int m67254d() {
        return this.f4153d;
    }

    /* renamed from: e */
    public int m67253e() {
        return this.f4150a;
    }

    /* renamed from: f */
    public boolean m67252f(NM1 nm1) {
        int i;
        int i2 = this.f4153d + (HighLevelEncoder.f57640c[this.f4150a][nm1.f4150a] >> 16);
        int i3 = nm1.f4152c;
        if (i3 > 0 && ((i = this.f4152c) == 0 || i > i3)) {
            i2 += 10;
        }
        if (i2 <= nm1.f4153d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public NM1 m67251g(int i, int i2) {
        int i3;
        int i4 = this.f4153d;
        AbstractC22175sU1 abstractC22175sU1 = this.f4151b;
        int i5 = this.f4150a;
        if (i != i5) {
            int i6 = HighLevelEncoder.f57640c[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            abstractC22175sU1 = abstractC22175sU1.m22811a(i7, i8);
            i4 += i8;
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new NM1(abstractC22175sU1.m22811a(i2, i3), i, 0, i4 + i3);
    }

    /* renamed from: h */
    public NM1 m67250h(int i, int i2) {
        int i3;
        AbstractC22175sU1 abstractC22175sU1 = this.f4151b;
        int i4 = this.f4150a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new NM1(abstractC22175sU1.m22811a(HighLevelEncoder.f57642e[i4][i], i3).m22811a(i2, 5), this.f4150a, 0, this.f4153d + i3 + 5);
    }

    /* renamed from: i */
    public BitArray m67249i(byte[] bArr) {
        LinkedList<AbstractC22175sU1> linkedList = new LinkedList();
        for (AbstractC22175sU1 abstractC22175sU1 = m67256b(bArr.length).f4151b; abstractC22175sU1 != null; abstractC22175sU1 = abstractC22175sU1.m22809d()) {
            linkedList.addFirst(abstractC22175sU1);
        }
        BitArray bitArray = new BitArray();
        for (AbstractC22175sU1 abstractC22175sU12 : linkedList) {
            abstractC22175sU12.mo555c(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.f57639b[this.f4150a], Integer.valueOf(this.f4153d), Integer.valueOf(this.f4152c));
    }
}