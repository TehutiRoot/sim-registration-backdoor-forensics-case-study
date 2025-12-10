package androidx.camera.video.internal.config;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.core.util.Supplier;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class AudioSettingsDefaultResolver implements Supplier<AudioSettings> {

    /* renamed from: a */
    public final AudioSpec f11967a;

    public AudioSettingsDefaultResolver(@NonNull AudioSpec audioSpec) {
        this.f11967a = audioSpec;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NonNull
    public AudioSettings get() {
        int m62067f;
        int m62070c = AudioConfigUtil.m62070c(this.f11967a);
        int m62069d = AudioConfigUtil.m62069d(this.f11967a);
        int channelCount = this.f11967a.getChannelCount();
        if (channelCount == -1) {
            Logger.m63230d("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            channelCount = 1;
        } else {
            Logger.m63230d("DefAudioResolver", "Using supplied AUDIO channel count: " + channelCount);
        }
        Range<Integer> sampleRate = this.f11967a.getSampleRate();
        if (AudioSpec.SAMPLE_RATE_RANGE_AUTO.equals(sampleRate)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Using fallback AUDIO sample rate: ");
            m62067f = 44100;
            sb.append(44100);
            sb.append("Hz");
            Logger.m63230d("DefAudioResolver", sb.toString());
        } else {
            m62067f = AudioConfigUtil.m62067f(sampleRate, channelCount, m62069d, sampleRate.getUpper().intValue());
            Logger.m63230d("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + m62067f + "Hz");
        }
        return AudioSettings.builder().setAudioSource(m62070c).setAudioFormat(m62069d).setChannelCount(channelCount).setSampleRate(m62067f).build();
    }
}
