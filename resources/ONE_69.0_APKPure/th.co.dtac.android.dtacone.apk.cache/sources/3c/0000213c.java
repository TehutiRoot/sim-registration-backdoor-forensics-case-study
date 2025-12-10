package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.core.util.Supplier;
import java.util.Objects;

@RequiresApi(21)
/* loaded from: classes.dex */
public class VideoEncoderConfigVideoProfileResolver implements Supplier<VideoEncoderConfig> {

    /* renamed from: a */
    public final String f12065a;

    /* renamed from: b */
    public final Timebase f12066b;

    /* renamed from: c */
    public final VideoSpec f12067c;

    /* renamed from: d */
    public final Size f12068d;

    /* renamed from: e */
    public final EncoderProfilesProxy.VideoProfileProxy f12069e;

    /* renamed from: f */
    public final DynamicRange f12070f;

    /* renamed from: g */
    public final Range f12071g;

    public VideoEncoderConfigVideoProfileResolver(@NonNull String str, @NonNull Timebase timebase, @NonNull VideoSpec videoSpec, @NonNull Size size, @NonNull EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range) {
        this.f12065a = str;
        this.f12066b = timebase;
        this.f12067c = videoSpec;
        this.f12068d = size;
        this.f12069e = videoProfileProxy;
        this.f12070f = dynamicRange;
        this.f12071g = range;
    }

    /* renamed from: a */
    private int m62011a() {
        int i;
        Object obj;
        int frameRate = this.f12069e.getFrameRate();
        Range range = this.f12071g;
        Range<Integer> range2 = SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED;
        if (!Objects.equals(range, range2)) {
            i = ((Integer) this.f12071g.clamp(Integer.valueOf(frameRate))).intValue();
        } else {
            i = frameRate;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(frameRate);
        if (Objects.equals(this.f12071g, range2)) {
            obj = this.f12071g;
        } else {
            obj = "<UNSPECIFIED>";
        }
        Logger.m63178d("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", valueOf, valueOf2, obj));
        return i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NonNull
    public VideoEncoderConfig get() {
        int m62011a = m62011a();
        Logger.m63178d("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + m62011a + "fps");
        Range<Integer> bitrate = this.f12067c.getBitrate();
        Logger.m63178d("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int m62013b = VideoConfigUtil.m62013b(this.f12069e.getBitrate(), this.f12070f.getBitDepth(), this.f12069e.getBitDepth(), m62011a, this.f12069e.getFrameRate(), this.f12068d.getWidth(), this.f12069e.getWidth(), this.f12068d.getHeight(), this.f12069e.getHeight(), bitrate);
        int profile = this.f12069e.getProfile();
        return VideoEncoderConfig.builder().setMimeType(this.f12065a).setInputTimebase(this.f12066b).setResolution(this.f12068d).setBitrate(m62013b).setFrameRate(m62011a).setProfile(profile).setDataSpace(VideoConfigUtil.mimeAndProfileToEncoderDataSpace(this.f12065a, profile)).build();
    }
}