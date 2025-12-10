package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: oh */
/* loaded from: classes2.dex */
public abstract class AbstractC12457oh {
    /* renamed from: a */
    public static Handler m25886a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
