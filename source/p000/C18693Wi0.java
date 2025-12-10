package p000;

import android.graphics.Point;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Wi0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18693Wi0 {

    /* renamed from: a */
    public final Point f7273a;

    /* renamed from: b */
    public final Point f7274b;

    /* renamed from: c */
    public final float[] f7275c;

    /* renamed from: d */
    public final float[] f7276d;

    /* renamed from: e */
    public final Set f7277e;

    public C18693Wi0(Point point, Point point2, float[] fArr, float[] fArr2) {
        this.f7273a = point;
        this.f7274b = point2;
        this.f7275c = (float[]) fArr.clone();
        this.f7276d = (float[]) fArr2.clone();
        this.f7277e = m65579a(point.x, point.y, point2.x, point2.y);
    }

    /* renamed from: a */
    public final Set m65579a(int i, int i2, int i3, int i4) {
        int i5;
        HashSet hashSet = new HashSet(3);
        int abs = Math.abs(i3 - i);
        int abs2 = Math.abs(i4 - i2);
        int i6 = -1;
        if (i < i3) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        if (i2 < i4) {
            i6 = 1;
        }
        int i7 = abs - abs2;
        while (true) {
            hashSet.add(new Point(i, i2));
            if (i == i3 && i2 == i4) {
                return hashSet;
            }
            int i8 = i7 * 2;
            if (i8 > (-abs2)) {
                i7 -= abs2;
                i += i5;
            }
            if (i8 < abs) {
                i7 += abs;
                i2 += i6;
            }
        }
    }
}
