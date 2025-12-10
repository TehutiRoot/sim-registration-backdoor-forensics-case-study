package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface OutputConfig {
    @Nullable
    MediaFormat getMediaFormat();
}
