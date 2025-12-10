package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.C2370f;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* renamed from: ak */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1895ak {
    /* renamed from: a */
    public static CameraManagerCompat.CameraManagerCompatImpl m65064a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return new C10093dk(context);
        }
        if (i >= 29) {
            return new C5495ck(context);
        }
        if (i >= 28) {
            return C5375bk.m51885b(context);
        }
        return C2370f.m63620a(context, handler);
    }
}