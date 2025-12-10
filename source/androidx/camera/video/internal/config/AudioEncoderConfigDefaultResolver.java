package androidx.camera.video.internal.config;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class AudioEncoderConfigDefaultResolver implements Supplier<AudioEncoderConfig> {

    /* renamed from: a */
    public final String f11960a;

    /* renamed from: b */
    public final int f11961b;

    /* renamed from: c */
    public final AudioSpec f11962c;

    /* renamed from: d */
    public final AudioSettings f11963d;

    /* renamed from: e */
    public final Timebase f11964e;

    public AudioEncoderConfigDefaultResolver(@NonNull String str, int i, @NonNull Timebase timebase, @NonNull AudioSpec audioSpec, @NonNull AudioSettings audioSettings) {
        this.f11960a = str;
        this.f11961b = i;
        this.f11964e = timebase;
        this.f11962c = audioSpec;
        this.f11963d = audioSettings;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NonNull
    public AudioEncoderConfig get() {
        Range<Integer> bitrate = this.f11962c.getBitrate();
        Logger.m63230d("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return AudioEncoderConfig.builder().setMimeType(this.f11960a).setProfile(this.f11961b).setInputTimebase(this.f11964e).setChannelCount(this.f11963d.getChannelCount()).setSampleRate(this.f11963d.getSampleRate()).setBitrate(AudioConfigUtil.m62068e(156000, this.f11963d.getChannelCount(), 2, this.f11963d.getSampleRate(), 48000, bitrate)).build();
    }
}
