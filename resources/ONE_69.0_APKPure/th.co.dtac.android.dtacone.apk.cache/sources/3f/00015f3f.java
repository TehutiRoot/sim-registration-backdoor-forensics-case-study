package p000;

import android.media.CamcorderProfile;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vS */
/* loaded from: classes.dex */
public abstract class AbstractC16909vS {
    /* renamed from: a */
    public static EncoderProfilesProxy m908a(CamcorderProfile camcorderProfile) {
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(camcorderProfile.duration, camcorderProfile.fileFormat, m907b(camcorderProfile), m906c(camcorderProfile));
    }

    /* renamed from: b */
    public static List m907b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i = camcorderProfile.audioCodec;
        arrayList.add(EncoderProfilesProxy.AudioProfileProxy.create(i, AbstractC13916sS.m22815a(i), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, AbstractC13916sS.m22814b(camcorderProfile.audioCodec)));
        return arrayList;
    }

    /* renamed from: c */
    public static List m906c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i = camcorderProfile.videoCodec;
        arrayList.add(EncoderProfilesProxy.VideoProfileProxy.create(i, AbstractC13916sS.m22813c(i), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}