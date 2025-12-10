package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Camera;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.utils.Threads;
import androidx.lifecycle.LifecycleOwner;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class LifecycleCameraController extends CameraController {

    /* renamed from: H */
    public LifecycleOwner f12245H;

    public LifecycleCameraController(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.camera.view.CameraController
    /* renamed from: C */
    public Camera mo61832C() {
        UseCaseGroup createUseCaseGroup;
        if (this.f12245H == null || this.f12230r == null || (createUseCaseGroup = createUseCaseGroup()) == null) {
            return null;
        }
        try {
            return this.f12230r.mo66589a(this.f12245H, this.f12213a, createUseCaseGroup);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
        }
    }

    @SuppressLint({"MissingPermission"})
    @MainThread
    public void bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner) {
        Threads.checkMainThread();
        this.f12245H = lifecycleOwner;
        m61877D();
    }

    @MainThread
    public void unbind() {
        Threads.checkMainThread();
        this.f12245H = null;
        this.f12229q = null;
        InterfaceC18366Qo1 interfaceC18366Qo1 = this.f12230r;
        if (interfaceC18366Qo1 != null) {
            interfaceC18366Qo1.mo66587c();
        }
    }
}