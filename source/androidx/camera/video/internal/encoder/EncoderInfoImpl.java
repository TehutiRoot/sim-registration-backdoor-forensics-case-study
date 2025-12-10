package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.workaround.EncoderFinder;
import java.util.Objects;

@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class EncoderInfoImpl implements EncoderInfo {

    /* renamed from: a */
    public final MediaCodecInfo f12064a;
    protected final MediaCodecInfo.CodecCapabilities mCodecCapabilities;

    public EncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) {
        this.f12064a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.mCodecCapabilities = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException("Unable to get CodecCapabilities for mime: " + str, e);
        }
    }

    /* renamed from: a */
    public static MediaCodecInfo m61943a(EncoderConfig encoderConfig) {
        MediaCodec findEncoder = new EncoderFinder().findEncoder(encoderConfig.toMediaFormat());
        MediaCodecInfo codecInfo = findEncoder.getCodecInfo();
        findEncoder.release();
        return codecInfo;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    @NonNull
    public String getName() {
        return this.f12064a.getName();
    }
}
