package p000;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: Un1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C18580Un1 implements InterfaceC18516Tn1 {

    /* renamed from: a */
    public final ProcessCameraProvider f6451a;

    public C18580Un1(ProcessCameraProvider processCameraProvider) {
        this.f6451a = processCameraProvider;
    }

    @Override // p000.InterfaceC18516Tn1
    /* renamed from: a */
    public Camera mo65974a(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        return this.f6451a.bindToLifecycle(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    @Override // p000.InterfaceC18516Tn1
    /* renamed from: b */
    public void mo65973b(UseCase... useCaseArr) {
        this.f6451a.unbind(useCaseArr);
    }

    @Override // p000.InterfaceC18516Tn1
    /* renamed from: c */
    public void mo65972c() {
        this.f6451a.unbindAll();
    }

    @Override // p000.InterfaceC18516Tn1
    public boolean hasCamera(CameraSelector cameraSelector) {
        return this.f6451a.hasCamera(cameraSelector);
    }
}
