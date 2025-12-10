package p000;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: ha2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC20231ha2 {
    /* renamed from: a */
    public static Rect m30853a(List list) {
        Iterator it = list.iterator();
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i3 = Math.min(i3, point.x);
            i = Math.max(i, point.x);
            i4 = Math.min(i4, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i3, i4, i, i2);
    }

    /* renamed from: b */
    public static List m30852b(zzf zzfVar) {
        double sin = Math.sin(Math.toRadians(zzfVar.zze));
        double cos = Math.cos(Math.toRadians(zzfVar.zze));
        double d = zzfVar.zzc;
        Point point = new Point((int) (zzfVar.zza + (d * cos)), (int) (zzfVar.zzb + (d * sin)));
        int i = zzfVar.zzd;
        double d2 = i * sin;
        Point point2 = r0[0];
        int i2 = point2.x;
        Point point3 = r0[2];
        int i3 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(zzfVar.zza, zzfVar.zzb), point, new Point((int) (point.x - d2), (int) (pointArr[1].y + (i * cos))), new Point(i2 + (i3 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
