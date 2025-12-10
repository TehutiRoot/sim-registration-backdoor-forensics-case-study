package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ImmediateSurface extends DeferrableSurface {

    /* renamed from: n */
    public final Surface f11152n;

    public ImmediateSurface(@NonNull Surface surface, @NonNull Size size, int i) {
        super(size, i);
        this.f11152n = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public ListenableFuture<Surface> provideSurface() {
        return Futures.immediateFuture(this.f11152n);
    }

    public ImmediateSurface(@NonNull Surface surface) {
        this.f11152n = surface;
    }
}
