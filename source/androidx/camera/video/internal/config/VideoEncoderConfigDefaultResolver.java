package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.core.util.Supplier;
import com.zxy.tiny.core.CompressKit;
import java.util.Objects;

@RequiresApi(21)
/* loaded from: classes.dex */
public class VideoEncoderConfigDefaultResolver implements Supplier<VideoEncoderConfig> {

    /* renamed from: g */
    public static final Size f11969g = new Size(CompressKit.DEFAULT_MAX_COMPRESS_SIZE, 720);

    /* renamed from: h */
    public static final Range f11970h = new Range(1, 60);

    /* renamed from: a */
    public final String f11971a;

    /* renamed from: b */
    public final Timebase f11972b;

    /* renamed from: c */
    public final VideoSpec f11973c;

    /* renamed from: d */
    public final Size f11974d;

    /* renamed from: e */
    public final DynamicRange f11975e;

    /* renamed from: f */
    public final Range f11976f;

    public VideoEncoderConfigDefaultResolver(@NonNull String str, @NonNull Timebase timebase, @NonNull VideoSpec videoSpec, @NonNull Size size, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range) {
        this.f11971a = str;
        this.f11972b = timebase;
        this.f11973c = videoSpec;
        this.f11974d = size;
        this.f11975e = dynamicRange;
        this.f11976f = range;
    }

    /* renamed from: a */
    public final int m62064a() {
        int i;
        Object obj;
        Range range = this.f11976f;
        Range<Integer> range2 = SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED;
        if (!Objects.equals(range, range2)) {
            i = ((Integer) f11970h.clamp((Integer) this.f11976f.getUpper())).intValue();
        } else {
            i = 30;
        }
        Integer valueOf = Integer.valueOf(i);
        if (Objects.equals(this.f11976f, range2)) {
            obj = this.f11976f;
        } else {
            obj = "<UNSPECIFIED>";
        }
        Logger.m63230d("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", valueOf, obj));
        return i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NonNull
    public VideoEncoderConfig get() {
        int m62064a = m62064a();
        Logger.m63230d("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + m62064a + "fps");
        Range<Integer> bitrate = this.f11973c.getBitrate();
        Logger.m63230d("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int bitDepth = this.f11975e.getBitDepth();
        int width = this.f11974d.getWidth();
        Size size = f11969g;
        int m62065b = VideoConfigUtil.m62065b(14000000, bitDepth, 8, m62064a, 30, width, size.getWidth(), this.f11974d.getHeight(), size.getHeight(), bitrate);
        int dynamicRangeToCodecProfileLevelForMime = DynamicRangeUtil.dynamicRangeToCodecProfileLevelForMime(this.f11971a, this.f11975e);
        return VideoEncoderConfig.builder().setMimeType(this.f11971a).setInputTimebase(this.f11972b).setResolution(this.f11974d).setBitrate(m62065b).setFrameRate(m62064a).setProfile(dynamicRangeToCodecProfileLevelForMime).setDataSpace(VideoConfigUtil.mimeAndProfileToEncoderDataSpace(this.f11971a, dynamicRangeToCodecProfileLevelForMime)).build();
    }
}
