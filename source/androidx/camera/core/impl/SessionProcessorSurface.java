package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class SessionProcessorSurface extends DeferrableSurface {

    /* renamed from: n */
    public final Surface f11192n;

    /* renamed from: o */
    public final int f11193o;

    public SessionProcessorSurface(@NonNull Surface surface, int i) {
        this.f11192n = surface;
        this.f11193o = i;
    }

    public int getOutputConfigId() {
        return this.f11193o;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public ListenableFuture<Surface> provideSurface() {
        return Futures.immediateFuture(this.f11192n);
    }
}
