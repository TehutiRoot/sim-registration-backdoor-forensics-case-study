package androidx.camera.video.internal;

import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public class BackupHdrProfileEncoderProfilesProvider implements EncoderProfilesProvider {
    public static final Function<EncoderProfilesProxy.VideoProfileProxy, EncoderProfilesProxy.VideoProfileProxy> DEFAULT_VALIDATOR = new Function() { // from class: X9
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            return BackupHdrProfileEncoderProfilesProvider.m62228a((EncoderProfilesProxy.VideoProfileProxy) obj);
        }
    };

    /* renamed from: d */
    public static final Timebase f11859d = Timebase.UPTIME;

    /* renamed from: a */
    public final EncoderProfilesProvider f11860a;

    /* renamed from: b */
    public final Function f11861b;

    /* renamed from: c */
    public final Map f11862c = new HashMap();

    public BackupHdrProfileEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull Function<EncoderProfilesProxy.VideoProfileProxy, EncoderProfilesProxy.VideoProfileProxy> function) {
        this.f11860a = encoderProfilesProvider;
        this.f11861b = function;
    }

    /* renamed from: a */
    public static /* synthetic */ EncoderProfilesProxy.VideoProfileProxy m62228a(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        return m62218k(videoProfileProxy);
    }

    /* renamed from: c */
    public static int m62226c(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException("Unexpected HDR format: " + i);
        }
        return 5;
    }

    /* renamed from: d */
    public static String m62225d(int i) {
        return AbstractC12442oS.m25921c(i);
    }

    /* renamed from: e */
    public static int m62224e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return -1;
                }
                throw new IllegalArgumentException("Unexpected HDR format: " + i);
            }
            return 8192;
        }
        return 4096;
    }

    /* renamed from: f */
    public static EncoderProfilesProxy.VideoProfileProxy m62223f(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i, int i2) {
        if (videoProfileProxy == null) {
            return null;
        }
        int codec = videoProfileProxy.getCodec();
        String mediaType = videoProfileProxy.getMediaType();
        int profile = videoProfileProxy.getProfile();
        if (i != videoProfileProxy.getHdrFormat()) {
            codec = m62226c(i);
            mediaType = m62225d(codec);
            profile = m62224e(i);
        }
        return EncoderProfilesProxy.VideoProfileProxy.create(codec, mediaType, m62220i(videoProfileProxy.getBitrate(), i2, videoProfileProxy.getBitDepth()), videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), profile, i2, videoProfileProxy.getChromaSubsampling(), i);
    }

    /* renamed from: g */
    private EncoderProfilesProxy m62222g(int i) {
        if (this.f11862c.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) this.f11862c.get(Integer.valueOf(i));
        }
        if (this.f11860a.hasProfile(i)) {
            EncoderProfilesProxy m62227b = m62227b(this.f11860a.getAll(i), 1, 10);
            this.f11862c.put(Integer.valueOf(i), m62227b);
            return m62227b;
        }
        return null;
    }

    /* renamed from: h */
    public static EncoderProfilesProxy.VideoProfileProxy m62221h(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i) {
        return EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), i, videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
    }

    /* renamed from: i */
    public static int m62220i(int i, int i2, int i3) {
        if (i2 == i3) {
            return i;
        }
        int doubleValue = (int) (i * new Rational(i2, i3).doubleValue());
        if (Logger.isDebugEnabled("BackupHdrProfileEncoderProfilesProvider")) {
            Logger.m63230d("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(doubleValue)));
        }
        return doubleValue;
    }

    /* renamed from: j */
    public static VideoEncoderConfig m62219j(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        return VideoEncoderConfig.builder().setMimeType(videoProfileProxy.getMediaType()).setProfile(videoProfileProxy.getProfile()).setResolution(new Size(videoProfileProxy.getWidth(), videoProfileProxy.getHeight())).setFrameRate(videoProfileProxy.getFrameRate()).setBitrate(videoProfileProxy.getBitrate()).setInputTimebase(f11859d).build();
    }

    /* renamed from: k */
    public static EncoderProfilesProxy.VideoProfileProxy m62218k(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        if (videoProfileProxy == null) {
            return null;
        }
        VideoEncoderConfig m62219j = m62219j(videoProfileProxy);
        try {
            VideoEncoderInfoImpl from = VideoEncoderInfoImpl.from(m62219j);
            int bitrate = m62219j.getBitrate();
            int intValue = from.getSupportedBitrateRange().clamp(Integer.valueOf(bitrate)).intValue();
            if (intValue != bitrate) {
                return m62221h(videoProfileProxy, intValue);
            }
            return videoProfileProxy;
        } catch (InvalidConfigException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final EncoderProfilesProxy m62227b(EncoderProfilesProxy encoderProfilesProxy, int i, int i2) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        if (encoderProfilesProxy == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(encoderProfilesProxy.getVideoProfiles());
        Iterator<EncoderProfilesProxy.VideoProfileProxy> it = encoderProfilesProxy.getVideoProfiles().iterator();
        while (true) {
            if (it.hasNext()) {
                videoProfileProxy = it.next();
                if (videoProfileProxy.getHdrFormat() == 0) {
                    break;
                }
            } else {
                videoProfileProxy = null;
                break;
            }
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy2 = (EncoderProfilesProxy.VideoProfileProxy) this.f11861b.apply(m62223f(videoProfileProxy, i, i2));
        if (videoProfileProxy2 != null) {
            arrayList.add(videoProfileProxy2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i) {
        return m62222g(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        if (!this.f11860a.hasProfile(i) || m62222g(i) == null) {
            return false;
        }
        return true;
    }
}
