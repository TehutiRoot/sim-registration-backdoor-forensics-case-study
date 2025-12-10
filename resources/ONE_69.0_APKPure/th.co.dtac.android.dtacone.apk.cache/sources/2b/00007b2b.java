package p000;

import android.graphics.Point;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19445cj0 {

    /* renamed from: a */
    public final Point f40199a;

    /* renamed from: b */
    public final Point f40200b;

    /* renamed from: c */
    public final float[] f40201c;

    /* renamed from: d */
    public final float[] f40202d;

    /* renamed from: e */
    public final Set f40203e;

    public C19445cj0(Point point, Point point2, float[] fArr, float[] fArr2) {
        this.f40199a = point;
        this.f40200b = point2;
        this.f40201c = (float[]) fArr.clone();
        this.f40202d = (float[]) fArr2.clone();
        this.f40203e = m51305a(point.x, point.y, point2.x, point2.y);
    }

    /* renamed from: a */
    public final Set m51305a(int i, int i2, int i3, int i4) {
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