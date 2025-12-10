package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;

/* loaded from: classes.dex */
public class ZslControlNoOpImpl implements O62 {
    @Override // p000.O62
    public void addZslConfig(@NonNull SessionConfig.Builder builder) {
    }

    @Override // p000.O62
    @Nullable
    public ImageProxy dequeueImageFromBuffer() {
        return null;
    }

    @Override // p000.O62
    public boolean enqueueImageToImageWriter(@NonNull ImageProxy imageProxy) {
        return false;
    }

    @Override // p000.O62
    public boolean isZslDisabledByFlashMode() {
        return false;
    }

    @Override // p000.O62
    public boolean isZslDisabledByUserCaseConfig() {
        return false;
    }

    @Override // p000.O62
    public void setZslDisabledByFlashMode(boolean z) {
    }

    @Override // p000.O62
    public void setZslDisabledByUserCaseConfig(boolean z) {
    }
}
