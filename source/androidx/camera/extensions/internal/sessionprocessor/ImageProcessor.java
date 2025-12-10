package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface ImageProcessor {
    void onNextImageAvailable(int i, long j, @NonNull ImageReference imageReference, @Nullable String str);
}
