package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.p005os.HandlerCompat;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class MainThreadAsyncHandler {

    /* renamed from: a */
    public static volatile Handler f11403a;

    @NonNull
    public static Handler getInstance() {
        if (f11403a != null) {
            return f11403a;
        }
        synchronized (MainThreadAsyncHandler.class) {
            try {
                if (f11403a == null) {
                    f11403a = HandlerCompat.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11403a;
    }
}