package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageCapture;

/* loaded from: classes.dex */
public interface ImageSaver$OnImageSavedCallback {
    void onError(@NonNull ImageSaver$SaveError imageSaver$SaveError, @NonNull String str, @Nullable Throwable th2);

    void onImageSaved(@NonNull ImageCapture.OutputFileResults outputFileResults);
}
