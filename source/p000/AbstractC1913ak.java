package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.C2388f;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* renamed from: ak */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1913ak {
    /* renamed from: a */
    public static CameraManagerCompat.CameraManagerCompatImpl m65055a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return new C10101dk(context);
        }
        if (i >= 29) {
            return new C5506ck(context);
        }
        if (i >= 28) {
            return C5396bk.m51867b(context);
        }
        return C2388f.m63669a(context, handler);
    }
}
