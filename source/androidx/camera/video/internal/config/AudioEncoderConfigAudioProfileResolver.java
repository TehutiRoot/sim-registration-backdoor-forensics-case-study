package androidx.camera.video.internal.config;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class AudioEncoderConfigAudioProfileResolver implements Supplier<AudioEncoderConfig> {

    /* renamed from: a */
    public final String f11954a;

    /* renamed from: b */
    public final Timebase f11955b;

    /* renamed from: c */
    public final int f11956c;

    /* renamed from: d */
    public final AudioSpec f11957d;

    /* renamed from: e */
    public final AudioSettings f11958e;

    /* renamed from: f */
    public final EncoderProfilesProxy.AudioProfileProxy f11959f;

    public AudioEncoderConfigAudioProfileResolver(@NonNull String str, int i, @NonNull Timebase timebase, @NonNull AudioSpec audioSpec, @NonNull AudioSettings audioSettings, @NonNull EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f11954a = str;
        this.f11956c = i;
        this.f11955b = timebase;
        this.f11957d = audioSpec;
        this.f11958e = audioSettings;
        this.f11959f = audioProfileProxy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NonNull
    public AudioEncoderConfig get() {
        Logger.m63230d("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return AudioEncoderConfig.builder().setMimeType(this.f11954a).setProfile(this.f11956c).setInputTimebase(this.f11955b).setChannelCount(this.f11958e.getChannelCount()).setSampleRate(this.f11958e.getSampleRate()).setBitrate(AudioConfigUtil.m62068e(this.f11959f.getBitrate(), this.f11958e.getChannelCount(), this.f11959f.getChannels(), this.f11958e.getSampleRate(), this.f11959f.getSampleRate(), this.f11957d.getBitrate())).build();
    }
}
