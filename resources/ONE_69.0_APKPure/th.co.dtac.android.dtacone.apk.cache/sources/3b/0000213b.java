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
    public static final Size f12057g = new Size(CompressKit.DEFAULT_MAX_COMPRESS_SIZE, 720);

    /* renamed from: h */
    public static final Range f12058h = new Range(1, 60);

    /* renamed from: a */
    public final String f12059a;

    /* renamed from: b */
    public final Timebase f12060b;

    /* renamed from: c */
    public final VideoSpec f12061c;

    /* renamed from: d */
    public final Size f12062d;

    /* renamed from: e */
    public final DynamicRange f12063e;

    /* renamed from: f */
    public final Range f12064f;

    public VideoEncoderConfigDefaultResolver(@NonNull String str, @NonNull Timebase timebase, @NonNull VideoSpec videoSpec, @NonNull Size size, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range) {
        this.f12059a = str;
        this.f12060b = timebase;
        this.f12061c = videoSpec;
        this.f12062d = size;
        this.f12063e = dynamicRange;
        this.f12064f = range;
    }

    /* renamed from: a */
    public final int m62012a() {
        int i;
        Object obj;
        Range range = this.f12064f;
        Range<Integer> range2 = SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED;
        if (!Objects.equals(range, range2)) {
            i = ((Integer) f12058h.clamp((Integer) this.f12064f.getUpper())).intValue();
        } else {
            i = 30;
        }
        Integer valueOf = Integer.valueOf(i);
        if (Objects.equals(this.f12064f, range2)) {
            obj = this.f12064f;
        } else {
            obj = "<UNSPECIFIED>";
        }
        Logger.m63178d("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", valueOf, obj));
        return i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NonNull
    public VideoEncoderConfig get() {
        int m62012a = m62012a();
        Logger.m63178d("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + m62012a + "fps");
        Range<Integer> bitrate = this.f12061c.getBitrate();
        Logger.m63178d("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int bitDepth = this.f12063e.getBitDepth();
        int width = this.f12062d.getWidth();
        Size size = f12057g;
        int m62013b = VideoConfigUtil.m62013b(14000000, bitDepth, 8, m62012a, 30, width, size.getWidth(), this.f12062d.getHeight(), size.getHeight(), bitrate);
        int dynamicRangeToCodecProfileLevelForMime = DynamicRangeUtil.dynamicRangeToCodecProfileLevelForMime(this.f12059a, this.f12063e);
        return VideoEncoderConfig.builder().setMimeType(this.f12059a).setInputTimebase(this.f12060b).setResolution(this.f12062d).setBitrate(m62013b).setFrameRate(m62012a).setProfile(dynamicRangeToCodecProfileLevelForMime).setDataSpace(VideoConfigUtil.mimeAndProfileToEncoderDataSpace(this.f12059a, dynamicRangeToCodecProfileLevelForMime)).build();
    }
}