package p000;

import android.media.CamcorderProfile;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rS */
/* loaded from: classes.dex */
public abstract class AbstractC13256rS {
    /* renamed from: a */
    public static EncoderProfilesProxy m23328a(CamcorderProfile camcorderProfile) {
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(camcorderProfile.duration, camcorderProfile.fileFormat, m23327b(camcorderProfile), m23326c(camcorderProfile));
    }

    /* renamed from: b */
    public static List m23327b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i = camcorderProfile.audioCodec;
        arrayList.add(EncoderProfilesProxy.AudioProfileProxy.create(i, AbstractC12442oS.m25923a(i), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, AbstractC12442oS.m25922b(camcorderProfile.audioCodec)));
        return arrayList;
    }

    /* renamed from: c */
    public static List m23326c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i = camcorderProfile.videoCodec;
        arrayList.add(EncoderProfilesProxy.VideoProfileProxy.create(i, AbstractC12442oS.m25921c(i), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
