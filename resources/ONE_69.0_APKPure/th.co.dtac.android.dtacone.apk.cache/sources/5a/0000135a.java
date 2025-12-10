package p000;

import com.google.common.collect.C7968j;
import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: UJ0 */
/* loaded from: classes4.dex */
public class UJ0 extends C7968j {

    /* renamed from: i */
    public transient long[] f6604i;

    /* renamed from: j */
    public transient int f6605j;

    /* renamed from: k */
    public transient int f6606k;

    public UJ0(int i) {
        this(i, 1.0f);
    }

    /* renamed from: E */
    public final int m66217E(int i) {
        return (int) (this.f6604i[i] >>> 32);
    }

    /* renamed from: F */
    public final int m66216F(int i) {
        return (int) this.f6604i[i];
    }

    /* renamed from: G */
    public final void m66215G(int i, int i2) {
        long[] jArr = this.f6604i;
        jArr[i] = (jArr[i] & BodyPartID.bodyIdMax) | (i2 << 32);
    }

    /* renamed from: H */
    public final void m66214H(int i, int i2) {
        if (i == -2) {
            this.f6605j = i2;
        } else {
            m66213I(i, i2);
        }
        if (i2 == -2) {
            this.f6606k = i;
        } else {
            m66215G(i2, i);
        }
    }

    /* renamed from: I */
    public final void m66213I(int i, int i2) {
        long[] jArr = this.f6604i;
        jArr[i] = (jArr[i] & (-4294967296L)) | (i2 & BodyPartID.bodyIdMax);
    }

    @Override // com.google.common.collect.C7968j
    /* renamed from: a */
    public void mo40249a() {
        super.mo40249a();
        this.f6605j = -2;
        this.f6606k = -2;
    }

    @Override // com.google.common.collect.C7968j
    /* renamed from: e */
    public int mo40245e() {
        int i = this.f6605j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.C7968j
    /* renamed from: n */
    public void mo40236n(int i, float f) {
        super.mo40236n(i, f);
        this.f6605j = -2;
        this.f6606k = -2;
        long[] jArr = new long[i];
        this.f6604i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.C7968j
    /* renamed from: o */
    public void mo40235o(int i, Object obj, int i2, int i3) {
        super.mo40235o(i, obj, i2, i3);
        m66214H(this.f6606k, i);
        m66214H(i, -2);
    }

    @Override // com.google.common.collect.C7968j
    /* renamed from: p */
    public void mo40234p(int i) {
        int m40251C = m40251C() - 1;
        m66214H(m66217E(i), m66216F(i));
        if (i < m40251C) {
            m66214H(m66217E(m40251C), i);
            m66214H(i, m66216F(m40251C));
        }
        super.mo40234p(i);
    }

    @Override // com.google.common.collect.C7968j
    /* renamed from: s */
    public int mo40231s(int i) {
        int m66216F = m66216F(i);
        if (m66216F == -2) {
            return -1;
        }
        return m66216F;
    }

    @Override // com.google.common.collect.C7968j
    /* renamed from: t */
    public int mo40230t(int i, int i2) {
        if (i == m40251C()) {
            return i2;
        }
        return i;
    }

    @Override // com.google.common.collect.C7968j
    /* renamed from: y */
    public void mo40225y(int i) {
        super.mo40225y(i);
        long[] jArr = this.f6604i;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.f6604i = copyOf;
        Arrays.fill(copyOf, length, i, -1L);
    }

    public UJ0(int i, float f) {
        super(i, f);
    }

    public UJ0(C7968j c7968j) {
        mo40236n(c7968j.m40251C(), 1.0f);
        int mo40245e = c7968j.mo40245e();
        while (mo40245e != -1) {
            m40229u(c7968j.m40241i(mo40245e), c7968j.m40239k(mo40245e));
            mo40245e = c7968j.mo40231s(mo40245e);
        }
    }
}