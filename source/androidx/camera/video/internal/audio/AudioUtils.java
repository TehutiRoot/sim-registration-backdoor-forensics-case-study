package androidx.camera.video.internal.audio;

import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.concurrent.TimeUnit;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class AudioUtils {
    public static int channelCountToChannelConfig(int i) {
        return i == 1 ? 16 : 12;
    }

    public static int channelCountToChannelMask(int i) {
        return i == 1 ? 16 : 12;
    }

    public static long frameCountToDurationNs(long j, int i) {
        boolean z;
        long j2 = i;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j) / j2;
    }

    public static long frameCountToSize(long j, int i) {
        boolean z;
        long j2 = i;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "bytesPerFrame must be greater than 0.");
        return j * j2;
    }

    public static int getBytesPerFrame(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid channel count: " + i2);
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 21) {
                        if (i != 22) {
                            throw new IllegalArgumentException("Invalid audio encoding: " + i);
                        }
                    } else {
                        return i2 * 3;
                    }
                }
                return i2 * 4;
            }
            return i2;
        }
        return i2 * 2;
    }

    public static long sizeToFrameCount(long j, int i) {
        boolean z;
        long j2 = i;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "bytesPerFrame must be greater than 0.");
        return j / j2;
    }
}
