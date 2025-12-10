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
    public final String f11977a;

    /* renamed from: b */
    public final Timebase f11978b;

    /* renamed from: c */
    public final VideoSpec f11979c;

    /* renamed from: d */
    public final Size f11980d;

    /* renamed from: e */
    public final EncoderProfilesProxy.VideoProfileProxy f11981e;

    /* renamed from: f */
    public final DynamicRange f11982f;

    /* renamed from: g */
    public final Range f11983g;

    public VideoEncoderConfigVideoProfileResolver(@NonNull String str, @NonNull Timebase timebase, @NonNull VideoSpec videoSpec, @NonNull Size size, @NonNull EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range) {
        this.f11977a = str;
        this.f11978b = timebase;
        this.f11979c = videoSpec;
        this.f11980d = size;
        this.f11981e = videoProfileProxy;
        this.f11982f = dynamicRange;
        this.f11983g = range;
    }

    /* renamed from: a */
    private int m62063a() {
        int i;
        Object obj;
        int frameRate = this.f11981e.getFrameRate();
        Range range = this.f11983g;
        Range<Integer> range2 = SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED;
        if (!Objects.equals(range, range2)) {
            i = ((Integer) this.f11983g.clamp(Integer.valueOf(frameRate))).intValue();
        } else {
            i = frameRate;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(frameRate);
        if (Objects.equals(this.f11983g, range2)) {
            obj = this.f11983g;
        } else {
            obj = "<UNSPECIFIED>";
        }
        Logger.m63230d("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", valueOf, valueOf2, obj));
        return i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NonNull
    public VideoEncoderConfig get() {
        int m62063a = m62063a();
        Logger.m63230d("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + m62063a + "fps");
        Range<Integer> bitrate = this.f11979c.getBitrate();
        Logger.m63230d("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int m62065b = VideoConfigUtil.m62065b(this.f11981e.getBitrate(), this.f11982f.getBitDepth(), this.f11981e.getBitDepth(), m62063a, this.f11981e.getFrameRate(), this.f11980d.getWidth(), this.f11981e.getWidth(), this.f11980d.getHeight(), this.f11981e.getHeight(), bitrate);
        int profile = this.f11981e.getProfile();
        return VideoEncoderConfig.builder().setMimeType(this.f11977a).setInputTimebase(this.f11978b).setResolution(this.f11980d).setBitrate(m62065b).setFrameRate(m62063a).setProfile(profile).setDataSpace(VideoConfigUtil.mimeAndProfileToEncoderDataSpace(this.f11977a, profile)).build();
    }
}
