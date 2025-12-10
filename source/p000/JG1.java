package p000;

import android.graphics.Point;
import android.graphics.PointF;
import java.util.HashSet;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: JG1 */
/* loaded from: classes5.dex */
public class JG1 {

    /* renamed from: a */
    public final PointF[] f2745a;

    /* renamed from: b */
    public final float[][] f2746b;

    /* renamed from: c */
    public final double f2747c;

    /* renamed from: d */
    public final int f2748d;

    /* renamed from: e */
    public final C18693Wi0 f2749e;

    /* renamed from: f */
    public final double f2750f;

    /* renamed from: g */
    public final double f2751g;

    /* renamed from: h */
    public final double f2752h;

    public JG1(PointF[] pointFArr, float[][] fArr) {
        PointF[] pointFArr2 = (PointF[]) pointFArr.clone();
        this.f2745a = pointFArr2;
        float[][] fArr2 = (float[][]) fArr.clone();
        this.f2746b = fArr2;
        this.f2747c = m67767c(pointFArr[0], pointFArr[1], pointFArr[2]);
        int m67769a = m67769a(pointFArr);
        this.f2748d = m67769a;
        if (m67769a == 2) {
            if (m67766d(pointFArr2[1], pointFArr2[2]) && !m67766d(pointFArr2[0], pointFArr2[2])) {
                this.f2749e = new C18693Wi0(new Point(Math.round(pointFArr2[0].x), Math.round(pointFArr2[0].y)), new Point(Math.round(pointFArr2[2].x), Math.round(pointFArr2[2].y)), fArr2[0], fArr2[2]);
            } else {
                this.f2749e = new C18693Wi0(new Point(Math.round(pointFArr2[1].x), Math.round(pointFArr2[1].y)), new Point(Math.round(pointFArr2[2].x), Math.round(pointFArr2[2].y)), fArr2[1], fArr2[2]);
            }
        } else {
            this.f2749e = null;
        }
        this.f2750f = m67768b(pointFArr[0], pointFArr[1], pointFArr[2]);
        this.f2751g = m67768b(pointFArr[1], pointFArr[2], pointFArr[0]);
        this.f2752h = m67768b(pointFArr[2], pointFArr[0], pointFArr[1]);
    }

    /* renamed from: a */
    public final int m67769a(PointF[] pointFArr) {
        HashSet hashSet = new HashSet();
        for (PointF pointF : pointFArr) {
            hashSet.add(new Point(Math.round(pointF.x * 1000.0f), Math.round(pointF.y * 1000.0f)));
        }
        return hashSet.size();
    }

    /* renamed from: b */
    public final double m67768b(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = pointF3.y;
        float f2 = pointF2.y;
        float f3 = pointF.x;
        float f4 = pointF2.x;
        return ((f - f2) * (f3 - f4)) - ((pointF3.x - f4) * (pointF.y - f2));
    }

    /* renamed from: c */
    public final double m67767c(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = pointF3.x;
        float f2 = pointF3.y;
        return Math.abs(((f - pointF2.x) * (f2 - pointF.y)) - ((f - pointF.x) * (f2 - pointF2.y))) / 2.0d;
    }

    /* renamed from: d */
    public final boolean m67766d(PointF pointF, PointF pointF2) {
        if (Math.abs(pointF.x - pointF2.x) < 0.001d && Math.abs(pointF.y - pointF2.y) < 0.001d) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f2745a[0] + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f2745a[1] + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f2745a[2];
    }
}
