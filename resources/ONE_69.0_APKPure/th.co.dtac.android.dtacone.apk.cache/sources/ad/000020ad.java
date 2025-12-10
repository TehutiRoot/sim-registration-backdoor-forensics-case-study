package androidx.camera.video;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

@AutoValue
@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class OutputResults {
    /* renamed from: a */
    public static OutputResults m62474a(Uri uri) {
        Preconditions.checkNotNull(uri, "OutputUri cannot be null.");
        return new C0568I8(uri);
    }

    @NonNull
    public abstract Uri getOutputUri();
}