package androidx.camera.core;

import android.media.ImageReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.ImageReaderProxy;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ImageReaderProxys {
    @NonNull
    public static ImageReaderProxy createIsolatedReader(int i, int i2, int i3, int i4) {
        return new C10195f4(ImageReader.newInstance(i, i2, i3, i4));
    }
}