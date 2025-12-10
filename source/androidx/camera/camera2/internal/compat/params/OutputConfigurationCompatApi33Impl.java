package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.List;

@RequiresApi(33)
/* loaded from: classes.dex */
public class OutputConfigurationCompatApi33Impl extends C17984Lg1 {
    public OutputConfigurationCompatApi33Impl(int i, Surface surface) {
        this(new OutputConfiguration(i, surface));
    }

    /* renamed from: g */
    public static OutputConfigurationCompatApi33Impl m63663g(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi33Impl(outputConfiguration);
    }

    @Override // p000.C17920Kg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public /* bridge */ /* synthetic */ void addSurface(@NonNull Surface surface) {
        super.addSurface(surface);
    }

    @Override // p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public /* bridge */ /* synthetic */ void enableSurfaceSharing() {
        super.enableSurfaceSharing();
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p000.C17984Lg1, p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public long getDynamicRangeProfile() {
        return ((OutputConfiguration) getOutputConfiguration()).getDynamicRangeProfile();
    }

    @Override // p000.C17984Lg1, p000.C17920Kg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public /* bridge */ /* synthetic */ int getMaxSharedSurfaceCount() {
        return super.getMaxSharedSurfaceCount();
    }

    @Override // p000.C17984Lg1, p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    @NonNull
    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.f10513a instanceof OutputConfiguration);
        return this.f10513a;
    }

    @Override // p000.C17984Lg1, p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    @Nullable
    public /* bridge */ /* synthetic */ String getPhysicalCameraId() {
        return super.getPhysicalCameraId();
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public long getStreamUseCase() {
        return ((OutputConfiguration) getOutputConfiguration()).getStreamUseCase();
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    @Nullable
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public /* bridge */ /* synthetic */ int getSurfaceGroupId() {
        return super.getSurfaceGroupId();
    }

    @Override // p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    @NonNull
    public /* bridge */ /* synthetic */ List getSurfaces() {
        return super.getSurfaces();
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.C17984Lg1, p000.C17920Kg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public /* bridge */ /* synthetic */ void removeSurface(@NonNull Surface surface) {
        super.removeSurface(surface);
    }

    @Override // p000.C17984Lg1, p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setDynamicRangeProfile(long j) {
        ((OutputConfiguration) getOutputConfiguration()).setDynamicRangeProfile(j);
    }

    @Override // p000.C17984Lg1, p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public /* bridge */ /* synthetic */ void setPhysicalCameraId(@Nullable String str) {
        super.setPhysicalCameraId(str);
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setStreamUseCase(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) getOutputConfiguration()).setStreamUseCase(j);
    }

    public OutputConfigurationCompatApi33Impl(Object obj) {
        super(obj);
    }
}
