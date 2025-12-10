package p000;

import android.graphics.Point;
import android.graphics.PointF;
import java.util.HashSet;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: GH1 */
/* loaded from: classes5.dex */
public class GH1 {

    /* renamed from: a */
    public final PointF[] f1931a;

    /* renamed from: b */
    public final float[][] f1932b;

    /* renamed from: c */
    public final double f1933c;

    /* renamed from: d */
    public final int f1934d;

    /* renamed from: e */
    public final C19445cj0 f1935e;

    /* renamed from: f */
    public final double f1936f;

    /* renamed from: g */
    public final double f1937g;

    /* renamed from: h */
    public final double f1938h;

    public GH1(PointF[] pointFArr, float[][] fArr) {
        PointF[] pointFArr2 = (PointF[]) pointFArr.clone();
        this.f1931a = pointFArr2;
        float[][] fArr2 = (float[][]) fArr.clone();
        this.f1932b = fArr2;
        this.f1933c = m68293c(pointFArr[0], pointFArr[1], pointFArr[2]);
        int m68295a = m68295a(pointFArr);
        this.f1934d = m68295a;
        if (m68295a == 2) {
            if (m68292d(pointFArr2[1], pointFArr2[2]) && !m68292d(pointFArr2[0], pointFArr2[2])) {
                this.f1935e = new C19445cj0(new Point(Math.round(pointFArr2[0].x), Math.round(pointFArr2[0].y)), new Point(Math.round(pointFArr2[2].x), Math.round(pointFArr2[2].y)), fArr2[0], fArr2[2]);
            } else {
                this.f1935e = new C19445cj0(new Point(Math.round(pointFArr2[1].x), Math.round(pointFArr2[1].y)), new Point(Math.round(pointFArr2[2].x), Math.round(pointFArr2[2].y)), fArr2[1], fArr2[2]);
            }
        } else {
            this.f1935e = null;
        }
        this.f1936f = m68294b(pointFArr[0], pointFArr[1], pointFArr[2]);
        this.f1937g = m68294b(pointFArr[1], pointFArr[2], pointFArr[0]);
        this.f1938h = m68294b(pointFArr[2], pointFArr[0], pointFArr[1]);
    }

    /* renamed from: a */
    public final int m68295a(PointF[] pointFArr) {
        HashSet hashSet = new HashSet();
        for (PointF pointF : pointFArr) {
            hashSet.add(new Point(Math.round(pointF.x * 1000.0f), Math.round(pointF.y * 1000.0f)));
        }
        return hashSet.size();
    }

    /* renamed from: b */
    public final double m68294b(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = pointF3.y;
        float f2 = pointF2.y;
        float f3 = pointF.x;
        float f4 = pointF2.x;
        return ((f - f2) * (f3 - f4)) - ((pointF3.x - f4) * (pointF.y - f2));
    }

    /* renamed from: c */
    public final double m68293c(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = pointF3.x;
        float f2 = pointF3.y;
        return Math.abs(((f - pointF2.x) * (f2 - pointF.y)) - ((f - pointF.x) * (f2 - pointF2.y))) / 2.0d;
    }

    /* renamed from: d */
    public final boolean m68292d(PointF pointF, PointF pointF2) {
        if (Math.abs(pointF.x - pointF2.x) < 0.001d && Math.abs(pointF.y - pointF2.y) < 0.001d) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f1931a[0] + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f1931a[1] + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f1931a[2];
    }
}