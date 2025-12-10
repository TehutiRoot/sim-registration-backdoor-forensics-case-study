package androidx.camera.view.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AudioConfig {
    @NonNull
    public static final AudioConfig AUDIO_DISABLED = new AudioConfig(false);

    /* renamed from: a */
    public final boolean f12245a;

    public AudioConfig(boolean z) {
        this.f12245a = z;
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioConfig create(boolean z) {
        return new AudioConfig(z);
    }

    public boolean getAudioEnabled() {
        return this.f12245a;
    }
}
