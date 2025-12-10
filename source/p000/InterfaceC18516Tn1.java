package p000;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: Tn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC18516Tn1 {
    /* renamed from: a */
    Camera mo65974a(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup);

    /* renamed from: b */
    void mo65973b(UseCase... useCaseArr);

    /* renamed from: c */
    void mo65972c();

    boolean hasCamera(CameraSelector cameraSelector);
}
