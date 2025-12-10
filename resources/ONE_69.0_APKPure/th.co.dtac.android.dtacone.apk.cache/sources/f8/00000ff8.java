package p000;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: Qo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC18366Qo1 {
    /* renamed from: a */
    Camera mo66589a(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup);

    /* renamed from: b */
    void mo66588b(UseCase... useCaseArr);

    /* renamed from: c */
    void mo66587c();

    boolean hasCamera(CameraSelector cameraSelector);
}