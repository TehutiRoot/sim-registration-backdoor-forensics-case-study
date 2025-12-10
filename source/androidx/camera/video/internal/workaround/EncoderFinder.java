package androidx.camera.video.internal.workaround;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.core.util.Preconditions;
import java.io.IOException;

@RequiresApi(21)
/* loaded from: classes.dex */
public class EncoderFinder {

    /* renamed from: a */
    public final boolean f12097a;

    public EncoderFinder() {
        boolean z;
        if (((MediaFormatMustNotUseFrameRateToFindEncoderQuirk) DeviceQuirks.get(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class)) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f12097a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m61939a(android.media.MediaFormat r7, android.media.MediaCodecList r8) {
        /*
            r6 = this;
            java.lang.String r0 = "aac-profile"
            java.lang.String r1 = "frame-rate"
            r2 = 0
            boolean r3 = r6.f12097a     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L23
            boolean r3 = r7.containsKey(r1)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L23
            int r3 = r7.getInteger(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L20
            r7.setString(r1, r2)     // Catch: java.lang.Throwable -> L1c
            goto L24
        L1c:
            r8 = move-exception
            r4 = r2
        L1e:
            r2 = r3
            goto L60
        L20:
            r8 = move-exception
            r4 = r2
            goto L60
        L23:
            r3 = r2
        L24:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1c
            r5 = 23
            if (r4 > r5) goto L3f
            boolean r4 = r7.containsKey(r0)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L3f
            int r4 = r7.getInteger(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1c
            r7.setString(r0, r2)     // Catch: java.lang.Throwable -> L3d
            r2 = r4
            goto L3f
        L3d:
            r8 = move-exception
            goto L1e
        L3f:
            java.lang.String r4 = r8.findEncoderForFormat(r7)     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L4d
            android.media.MediaCodecInfo[] r8 = r8.getCodecInfos()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r6.m61938b(r7, r8)     // Catch: java.lang.Throwable -> L1c
        L4d:
            if (r3 == 0) goto L56
            int r8 = r3.intValue()
            r7.setInteger(r1, r8)
        L56:
            if (r2 == 0) goto L5f
            int r8 = r2.intValue()
            r7.setInteger(r0, r8)
        L5f:
            return r4
        L60:
            if (r2 == 0) goto L69
            int r2 = r2.intValue()
            r7.setInteger(r1, r2)
        L69:
            if (r4 == 0) goto L72
            int r1 = r4.intValue()
            r7.setInteger(r0, r1)
        L72:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.workaround.EncoderFinder.m61939a(android.media.MediaFormat, android.media.MediaCodecList):java.lang.String");
    }

    /* renamed from: b */
    public final String m61938b(MediaFormat mediaFormat, MediaCodecInfo[] mediaCodecInfoArr) {
        Integer num;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean z;
        int i;
        boolean z2;
        String string = mediaFormat.getString("mime");
        Integer num2 = null;
        if (string == null) {
            Logger.m63223w("EncoderFinder", "MediaFormat does not contain mime info.");
            return null;
        }
        int length = mediaCodecInfoArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i2];
            if (mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkArgument(z, "MIME type is not supported");
                    if (mediaFormat.containsKey("bitrate")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        if (videoCapabilities != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Preconditions.checkArgument(z2, "Not video codec");
                        num = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                        try {
                            i = videoCapabilities.getBitrateRange().clamp(num).intValue();
                            mediaFormat.setInteger("bitrate", i);
                        } catch (IllegalArgumentException unused) {
                            if (num == null) {
                            }
                            mediaFormat.setInteger("bitrate", num.intValue());
                        } catch (Throwable th2) {
                            th = th2;
                            num2 = num;
                            if (num2 != null) {
                                mediaFormat.setInteger("bitrate", num2.intValue());
                            }
                            throw th;
                        }
                    } else {
                        i = -1;
                        num = null;
                    }
                } catch (IllegalArgumentException unused2) {
                    num = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                    Logger.m63223w("EncoderFinder", String.format("No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]", num, Integer.valueOf(i)));
                    String name = mediaCodecInfo.getName();
                    if (num != null) {
                        mediaFormat.setInteger("bitrate", num.intValue());
                    }
                    return name;
                }
                if (num == null) {
                }
                mediaFormat.setInteger("bitrate", num.intValue());
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m61937c(MediaFormat mediaFormat) {
        MediaCodecInfoReportIncorrectInfoQuirk mediaCodecInfoReportIncorrectInfoQuirk = (MediaCodecInfoReportIncorrectInfoQuirk) DeviceQuirks.get(MediaCodecInfoReportIncorrectInfoQuirk.class);
        if (mediaCodecInfoReportIncorrectInfoQuirk == null) {
            return false;
        }
        return mediaCodecInfoReportIncorrectInfoQuirk.isUnSupportMediaCodecInfo(mediaFormat);
    }

    @NonNull
    public MediaCodec findEncoder(@NonNull MediaFormat mediaFormat) throws InvalidConfigException {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        String m61939a = m61939a(mediaFormat, mediaCodecList);
        try {
            if (TextUtils.isEmpty(m61939a)) {
                String string = mediaFormat.getString("mime");
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(string);
                Logger.m63223w("EncoderFinder", String.format("No encoder found that supports requested MediaFormat %s. Create encoder by MIME type. Dump codec info:\n%s", mediaFormat, DebugUtils.dumpCodecCapabilities(string, createEncoderByType, mediaFormat)));
                return createEncoderByType;
            }
            return MediaCodec.createByCodecName(m61939a);
        } catch (IOException e) {
            e = e;
            boolean m61937c = m61937c(mediaFormat);
            String dumpMediaCodecListForFormat = DebugUtils.dumpMediaCodecListForFormat(mediaCodecList, mediaFormat);
            throw new InvalidConfigException("Encoder cannot created: " + m61939a + ", isMediaFormatInQuirk: " + m61937c + "\n" + dumpMediaCodecListForFormat, e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            boolean m61937c2 = m61937c(mediaFormat);
            String dumpMediaCodecListForFormat2 = DebugUtils.dumpMediaCodecListForFormat(mediaCodecList, mediaFormat);
            throw new InvalidConfigException("Encoder cannot created: " + m61939a + ", isMediaFormatInQuirk: " + m61937c2 + "\n" + dumpMediaCodecListForFormat2, e);
        } catch (NullPointerException e3) {
            e = e3;
            boolean m61937c22 = m61937c(mediaFormat);
            String dumpMediaCodecListForFormat22 = DebugUtils.dumpMediaCodecListForFormat(mediaCodecList, mediaFormat);
            throw new InvalidConfigException("Encoder cannot created: " + m61939a + ", isMediaFormatInQuirk: " + m61937c22 + "\n" + dumpMediaCodecListForFormat22, e);
        }
    }
}
