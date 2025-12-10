package androidx.camera.video.internal.config;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.core.util.Supplier;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class AudioSettingsAudioProfileResolver implements Supplier<AudioSettings> {

    /* renamed from: a */
    public final AudioSpec f11965a;

    /* renamed from: b */
    public final EncoderProfilesProxy.AudioProfileProxy f11966b;

    public AudioSettingsAudioProfileResolver(@NonNull AudioSpec audioSpec, @NonNull EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f11965a = audioSpec;
        this.f11966b = audioProfileProxy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NonNull
    public AudioSettings get() {
        int m62070c = AudioConfigUtil.m62070c(this.f11965a);
        int m62069d = AudioConfigUtil.m62069d(this.f11965a);
        int channelCount = this.f11965a.getChannelCount();
        Range<Integer> sampleRate = this.f11965a.getSampleRate();
        int channels = this.f11966b.getChannels();
        if (channelCount == -1) {
            Logger.m63230d("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + channels);
            channelCount = channels;
        } else {
            Logger.m63230d("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + channels + ", Resolved Channel Count: " + channelCount + "]");
        }
        int sampleRate2 = this.f11966b.getSampleRate();
        int m62067f = AudioConfigUtil.m62067f(sampleRate, channelCount, m62069d, sampleRate2);
        Logger.m63230d("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: " + m62067f + "Hz. [AudioProfile sample rate: " + sampleRate2 + "Hz]");
        return AudioSettings.builder().setAudioSource(m62070c).setAudioFormat(m62069d).setChannelCount(channelCount).setSampleRate(m62067f).build();
    }
}
