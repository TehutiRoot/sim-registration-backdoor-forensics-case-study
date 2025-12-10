package p000;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.vision.text.Text;

/* renamed from: tf2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22310tf2 {
    /* renamed from: a */
    public static Rect m22385a(Text text) {
        Point[] cornerPoints;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (Point point : text.getCornerPoints()) {
            i = Math.min(i, point.x);
            i3 = Math.max(i3, point.x);
            i2 = Math.min(i2, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static Point[] m22384b(zzab zzabVar) {
        double sin = Math.sin(Math.toRadians(zzabVar.zze));
        double cos = Math.cos(Math.toRadians(zzabVar.zze));
        int i = zzabVar.zzc;
        Point point = r0[1];
        int i2 = zzabVar.zzd;
        Point point2 = r0[0];
        int i3 = point2.x;
        Point point3 = r0[2];
        int i4 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(zzabVar.zza, zzabVar.zzb), new Point((int) (zzabVar.zza + (i * cos)), (int) (zzabVar.zzb + (i * sin))), new Point((int) (point.x - (i2 * sin)), (int) (point.y + (i2 * cos))), new Point(i3 + (i4 - point4.x), point2.y + (point3.y - point4.y))};
        return pointArr;
    }
}
