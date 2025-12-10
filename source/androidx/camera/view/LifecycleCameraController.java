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
    public LifecycleOwner f12157H;

    public LifecycleCameraController(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.camera.view.CameraController
    /* renamed from: C */
    public Camera mo61884C() {
        UseCaseGroup createUseCaseGroup;
        if (this.f12157H == null || this.f12142r == null || (createUseCaseGroup = createUseCaseGroup()) == null) {
            return null;
        }
        try {
            return this.f12142r.mo65974a(this.f12157H, this.f12125a, createUseCaseGroup);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
        }
    }

    @SuppressLint({"MissingPermission"})
    @MainThread
    public void bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner) {
        Threads.checkMainThread();
        this.f12157H = lifecycleOwner;
        m61929D();
    }

    @MainThread
    public void unbind() {
        Threads.checkMainThread();
        this.f12157H = null;
        this.f12141q = null;
        InterfaceC18516Tn1 interfaceC18516Tn1 = this.f12142r;
        if (interfaceC18516Tn1 != null) {
            interfaceC18516Tn1.mo65972c();
        }
    }
}
