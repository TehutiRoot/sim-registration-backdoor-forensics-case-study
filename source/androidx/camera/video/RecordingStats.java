package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

@AutoValue
@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class RecordingStats {
    /* renamed from: a */
    public static RecordingStats m62363a(long j, long j2, AudioStats audioStats) {
        boolean z;
        boolean z2 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "duration must be positive value.");
        if (j2 >= 0) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "bytes must be positive value.");
        return new C1223R8(j, j2, audioStats);
    }

    @NonNull
    public abstract AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();
}
