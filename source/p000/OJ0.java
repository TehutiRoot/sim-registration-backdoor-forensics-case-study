package p000;

import com.google.common.collect.C7979j;
import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: OJ0 */
/* loaded from: classes4.dex */
public class OJ0 extends C7979j {

    /* renamed from: i */
    public transient long[] f4367i;

    /* renamed from: j */
    public transient int f4368j;

    /* renamed from: k */
    public transient int f4369k;

    public OJ0(int i) {
        this(i, 1.0f);
    }

    /* renamed from: E */
    public final int m67099E(int i) {
        return (int) (this.f4367i[i] >>> 32);
    }

    /* renamed from: F */
    public final int m67098F(int i) {
        return (int) this.f4367i[i];
    }

    /* renamed from: G */
    public final void m67097G(int i, int i2) {
        long[] jArr = this.f4367i;
        jArr[i] = (jArr[i] & BodyPartID.bodyIdMax) | (i2 << 32);
    }

    /* renamed from: H */
    public final void m67096H(int i, int i2) {
        if (i == -2) {
            this.f4368j = i2;
        } else {
            m67095I(i, i2);
        }
        if (i2 == -2) {
            this.f4369k = i;
        } else {
            m67097G(i2, i);
        }
    }

    /* renamed from: I */
    public final void m67095I(int i, int i2) {
        long[] jArr = this.f4367i;
        jArr[i] = (jArr[i] & (-4294967296L)) | (i2 & BodyPartID.bodyIdMax);
    }

    @Override // com.google.common.collect.C7979j
    /* renamed from: a */
    public void mo40258a() {
        super.mo40258a();
        this.f4368j = -2;
        this.f4369k = -2;
    }

    @Override // com.google.common.collect.C7979j
    /* renamed from: e */
    public int mo40254e() {
        int i = this.f4368j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.C7979j
    /* renamed from: n */
    public void mo40245n(int i, float f) {
        super.mo40245n(i, f);
        this.f4368j = -2;
        this.f4369k = -2;
        long[] jArr = new long[i];
        this.f4367i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.C7979j
    /* renamed from: o */
    public void mo40244o(int i, Object obj, int i2, int i3) {
        super.mo40244o(i, obj, i2, i3);
        m67096H(this.f4369k, i);
        m67096H(i, -2);
    }

    @Override // com.google.common.collect.C7979j
    /* renamed from: p */
    public void mo40243p(int i) {
        int m40260C = m40260C() - 1;
        m67096H(m67099E(i), m67098F(i));
        if (i < m40260C) {
            m67096H(m67099E(m40260C), i);
            m67096H(i, m67098F(m40260C));
        }
        super.mo40243p(i);
    }

    @Override // com.google.common.collect.C7979j
    /* renamed from: s */
    public int mo40240s(int i) {
        int m67098F = m67098F(i);
        if (m67098F == -2) {
            return -1;
        }
        return m67098F;
    }

    @Override // com.google.common.collect.C7979j
    /* renamed from: t */
    public int mo40239t(int i, int i2) {
        if (i == m40260C()) {
            return i2;
        }
        return i;
    }

    @Override // com.google.common.collect.C7979j
    /* renamed from: y */
    public void mo40234y(int i) {
        super.mo40234y(i);
        long[] jArr = this.f4367i;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.f4367i = copyOf;
        Arrays.fill(copyOf, length, i, -1L);
    }

    public OJ0(int i, float f) {
        super(i, f);
    }

    public OJ0(C7979j c7979j) {
        mo40245n(c7979j.m40260C(), 1.0f);
        int mo40254e = c7979j.mo40254e();
        while (mo40254e != -1) {
            m40238u(c7979j.m40250i(mo40254e), c7979j.m40248k(mo40254e));
            mo40254e = c7979j.mo40240s(mo40254e);
        }
    }
}
