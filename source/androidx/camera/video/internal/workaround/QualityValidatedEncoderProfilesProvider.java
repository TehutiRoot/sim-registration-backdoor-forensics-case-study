package androidx.camera.video.internal.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public class QualityValidatedEncoderProfilesProvider implements EncoderProfilesProvider {

    /* renamed from: d */
    public static final Map f12098d;

    /* renamed from: a */
    public final EncoderProfilesProvider f12099a;

    /* renamed from: b */
    public final CameraInfoInternal f12100b;

    /* renamed from: c */
    public final Quirks f12101c;

    static {
        HashMap hashMap = new HashMap();
        f12098d = hashMap;
        hashMap.put(1, Quality.HIGHEST);
        hashMap.put(8, Quality.UHD);
        hashMap.put(6, Quality.FHD);
        hashMap.put(5, Quality.f11631HD);
        hashMap.put(4, Quality.f11632SD);
        hashMap.put(0, Quality.LOWEST);
    }

    public QualityValidatedEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull CameraInfoInternal cameraInfoInternal, @NonNull Quirks quirks) {
        this.f12099a = encoderProfilesProvider;
        this.f12100b = cameraInfoInternal;
        this.f12101c = quirks;
    }

    /* renamed from: a */
    public final boolean m61936a(int i) {
        Quality quality = (Quality) f12098d.get(Integer.valueOf(i));
        if (quality != null) {
            for (VideoQualityQuirk videoQualityQuirk : this.f12101c.getAll(VideoQualityQuirk.class)) {
                if (videoQualityQuirk != null && videoQualityQuirk.isProblematicVideoQuality(this.f12100b, quality) && !videoQualityQuirk.workaroundBySurfaceProcessing()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i) {
        if (!hasProfile(i)) {
            return null;
        }
        return this.f12099a.getAll(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        if (this.f12099a.hasProfile(i) && m61936a(i)) {
            return true;
        }
        return false;
    }
}
