package p000;

import android.os.Build;
import androidx.core.p005os.BuildCompat;
import com.google.android.material.color.ColorResourcesOverride;

/* renamed from: Ns */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0974Ns {
    /* renamed from: a */
    public static ColorResourcesOverride m67166a() {
        int i = Build.VERSION.SDK_INT;
        if (30 <= i && i <= 33) {
            return C17832Ix1.m67840a();
        }
        if (BuildCompat.isAtLeastU()) {
            return C17832Ix1.m67840a();
        }
        return null;
    }
}
