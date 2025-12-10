package androidx.camera.core.impl.quirk;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface ProfileResolutionQuirk extends Quirk {
    @NonNull
    List<Size> getSupportedResolutions();
}