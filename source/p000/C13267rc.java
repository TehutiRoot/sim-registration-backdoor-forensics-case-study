package p000;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* renamed from: rc */
/* loaded from: classes5.dex */
public final class C13267rc {

    /* renamed from: a */
    public BitMatrix f77323a;

    /* renamed from: b */
    public ResultPoint f77324b;

    /* renamed from: c */
    public ResultPoint f77325c;

    /* renamed from: d */
    public ResultPoint f77326d;

    /* renamed from: e */
    public ResultPoint f77327e;

    /* renamed from: f */
    public int f77328f;

    /* renamed from: g */
    public int f77329g;

    /* renamed from: h */
    public int f77330h;

    /* renamed from: i */
    public int f77331i;

    public C13267rc(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        if ((resultPoint == null && resultPoint3 == null) || ((resultPoint2 == null && resultPoint4 == null) || ((resultPoint != null && resultPoint2 == null) || (resultPoint3 != null && resultPoint4 == null)))) {
            throw NotFoundException.getNotFoundInstance();
        }
        m23308k(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
    }

    /* renamed from: l */
    public static C13267rc m23307l(C13267rc c13267rc, C13267rc c13267rc2) {
        if (c13267rc == null) {
            return c13267rc2;
        }
        if (c13267rc2 == null) {
            return c13267rc;
        }
        return new C13267rc(c13267rc.f77323a, c13267rc.f77324b, c13267rc.f77325c, c13267rc2.f77326d, c13267rc2.f77327e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.C13267rc m23318a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            com.google.zxing.ResultPoint r0 = r12.f77324b
            com.google.zxing.ResultPoint r1 = r12.f77325c
            com.google.zxing.ResultPoint r2 = r12.f77326d
            com.google.zxing.ResultPoint r3 = r12.f77327e
            if (r13 <= 0) goto L2a
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.getY()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            com.google.zxing.ResultPoint r13 = new com.google.zxing.ResultPoint
            float r4 = r4.getX()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L27
            r8 = r13
        L25:
            r10 = r2
            goto L2c
        L27:
            r10 = r13
            r8 = r0
            goto L2c
        L2a:
            r8 = r0
            goto L25
        L2c:
            if (r14 <= 0) goto L5d
            if (r15 == 0) goto L33
            com.google.zxing.ResultPoint r13 = r12.f77325c
            goto L35
        L33:
            com.google.zxing.ResultPoint r13 = r12.f77327e
        L35:
            float r0 = r13.getY()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.google.zxing.common.BitMatrix r14 = r12.f77323a
            int r14 = r14.getHeight()
            if (r0 < r14) goto L4b
            com.google.zxing.common.BitMatrix r14 = r12.f77323a
            int r14 = r14.getHeight()
            int r0 = r14 + (-1)
        L4b:
            com.google.zxing.ResultPoint r14 = new com.google.zxing.ResultPoint
            float r13 = r13.getX()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L5a
            r9 = r14
        L58:
            r11 = r3
            goto L5f
        L5a:
            r11 = r14
            r9 = r1
            goto L5f
        L5d:
            r9 = r1
            goto L58
        L5f:
            r12.m23317b()
            rc r13 = new rc
            com.google.zxing.common.BitMatrix r7 = r12.f77323a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C13267rc.m23318a(int, int, boolean):rc");
    }

    /* renamed from: b */
    public final void m23317b() {
        if (this.f77324b == null) {
            this.f77324b = new ResultPoint(0.0f, this.f77326d.getY());
            this.f77325c = new ResultPoint(0.0f, this.f77327e.getY());
        } else if (this.f77326d == null) {
            this.f77326d = new ResultPoint(this.f77323a.getWidth() - 1, this.f77324b.getY());
            this.f77327e = new ResultPoint(this.f77323a.getWidth() - 1, this.f77325c.getY());
        }
        this.f77328f = (int) Math.min(this.f77324b.getX(), this.f77325c.getX());
        this.f77329g = (int) Math.max(this.f77326d.getX(), this.f77327e.getX());
        this.f77330h = (int) Math.min(this.f77324b.getY(), this.f77326d.getY());
        this.f77331i = (int) Math.max(this.f77325c.getY(), this.f77327e.getY());
    }

    /* renamed from: c */
    public ResultPoint m23316c() {
        return this.f77325c;
    }

    /* renamed from: d */
    public ResultPoint m23315d() {
        return this.f77327e;
    }

    /* renamed from: e */
    public int m23314e() {
        return this.f77329g;
    }

    /* renamed from: f */
    public int m23313f() {
        return this.f77331i;
    }

    /* renamed from: g */
    public int m23312g() {
        return this.f77328f;
    }

    /* renamed from: h */
    public int m23311h() {
        return this.f77330h;
    }

    /* renamed from: i */
    public ResultPoint m23310i() {
        return this.f77324b;
    }

    /* renamed from: j */
    public ResultPoint m23309j() {
        return this.f77326d;
    }

    /* renamed from: k */
    public final void m23308k(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        this.f77323a = bitMatrix;
        this.f77324b = resultPoint;
        this.f77325c = resultPoint2;
        this.f77326d = resultPoint3;
        this.f77327e = resultPoint4;
        m23317b();
    }

    public C13267rc(C13267rc c13267rc) {
        m23308k(c13267rc.f77323a, c13267rc.f77324b, c13267rc.f77325c, c13267rc.f77326d, c13267rc.f77327e);
    }
}
