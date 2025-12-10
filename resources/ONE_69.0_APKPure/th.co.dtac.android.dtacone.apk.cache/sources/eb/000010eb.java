package p000;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: Ro1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C18431Ro1 implements InterfaceC18366Qo1 {

    /* renamed from: a */
    public final ProcessCameraProvider f5647a;

    public C18431Ro1(ProcessCameraProvider processCameraProvider) {
        this.f5647a = processCameraProvider;
    }

    @Override // p000.InterfaceC18366Qo1
    /* renamed from: a */
    public Camera mo66589a(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        return this.f5647a.bindToLifecycle(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    @Override // p000.InterfaceC18366Qo1
    /* renamed from: b */
    public void mo66588b(UseCase... useCaseArr) {
        this.f5647a.unbind(useCaseArr);
    }

    @Override // p000.InterfaceC18366Qo1
    /* renamed from: c */
    public void mo66587c() {
        this.f5647a.unbindAll();
    }

    @Override // p000.InterfaceC18366Qo1
    public boolean hasCamera(CameraSelector cameraSelector) {
        return this.f5647a.hasCamera(cameraSelector);
    }
}