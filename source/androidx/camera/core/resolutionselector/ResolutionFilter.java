package androidx.camera.core.resolutionselector;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface ResolutionFilter {
    @NonNull
    List<Size> filter(@NonNull List<Size> list, int i);
}
