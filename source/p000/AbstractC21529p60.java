package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C5122b;

/* renamed from: p60  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC21529p60 {
    /* renamed from: a */
    public static InterfaceC21185n60 m23732a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C21357o60.m25967b(view, viewGroup, matrix);
        }
        return C5122b.m52595b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    public static void m23731b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C21357o60.m25963f(view);
        } else {
            C5122b.m52591f(view);
        }
    }
}
