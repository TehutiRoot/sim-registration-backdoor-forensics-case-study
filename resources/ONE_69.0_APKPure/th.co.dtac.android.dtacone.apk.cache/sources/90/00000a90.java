package p000;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: L72 */
/* loaded from: classes.dex */
public interface L72 {
    void addZslConfig(SessionConfig.Builder builder);

    ImageProxy dequeueImageFromBuffer();

    boolean enqueueImageToImageWriter(ImageProxy imageProxy);

    boolean isZslDisabledByFlashMode();

    boolean isZslDisabledByUserCaseConfig();

    void setZslDisabledByFlashMode(boolean z);

    void setZslDisabledByUserCaseConfig(boolean z);
}