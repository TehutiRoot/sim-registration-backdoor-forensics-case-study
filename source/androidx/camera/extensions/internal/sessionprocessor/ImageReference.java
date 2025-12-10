package androidx.camera.extensions.internal.sessionprocessor;

import android.media.Image;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface ImageReference {
    boolean decrement();

    @Nullable
    Image get();

    boolean increment();
}
