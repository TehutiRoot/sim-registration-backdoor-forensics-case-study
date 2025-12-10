package androidx.camera.core.impl.utils;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Comparator;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CompareSizesByArea implements Comparator<Size> {

    /* renamed from: a */
    public boolean f11275a;

    public CompareSizesByArea() {
        this(false);
    }

    public CompareSizesByArea(boolean z) {
        this.f11275a = z;
    }

    @Override // java.util.Comparator
    public int compare(@NonNull Size size, @NonNull Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f11275a ? signum * (-1) : signum;
    }
}
