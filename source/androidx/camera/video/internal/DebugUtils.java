package androidx.camera.video.internal;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.Api28Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class DebugUtils {
    /* renamed from: a */
    public static void m62217a(StringBuilder sb, MediaCodecInfo.AudioCapabilities audioCapabilities, MediaFormat mediaFormat) {
        m62212f(sb, "[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
        m62212f(sb, "[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
        if (Build.VERSION.SDK_INT >= 31) {
            m62212f(sb, "[AudioCaps] getMinInputChannelCount = " + Api31Impl.getMinInputChannelCount(audioCapabilities));
            m62212f(sb, "[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(Api31Impl.getInputChannelCountRanges(audioCapabilities)));
        }
        m62212f(sb, "[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        m62212f(sb, "[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            m62212f(sb, "[AudioCaps] isSampleRateSupported for " + integer + " = " + audioCapabilities.isSampleRateSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            m62212f(sb, "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    /* renamed from: b */
    public static void m62216b(StringBuilder sb, MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        try {
            m62212f(sb, "[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
        } catch (ClassCastException unused) {
            m62212f(sb, "[CodecCaps] isFormatSupported=false");
        }
        m62212f(sb, "[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb2 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(m62210h(codecProfileLevel));
            }
            sb2.append(TextUtils.join(", ", arrayList));
            sb2.append("]");
            m62212f(sb, "[CodecCaps] profileLevels = " + ((Object) sb2));
        }
        if (codecCapabilities.colorFormats != null) {
            m62212f(sb, "[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            m62214d(sb, videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            m62217a(sb, audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            m62215c(sb, encoderCapabilities, mediaFormat);
        }
    }

    /* renamed from: c */
    public static void m62215c(StringBuilder sb, MediaCodecInfo.EncoderCapabilities encoderCapabilities, MediaFormat mediaFormat) {
        m62212f(sb, "[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
        if (Build.VERSION.SDK_INT >= 28) {
            m62212f(sb, "[EncoderCaps] getQualityRange = " + Api28Impl.getQualityRange(encoderCapabilities));
        }
        try {
            int integer = mediaFormat.getInteger("bitrate-mode");
            m62212f(sb, "[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            m62212f(sb, "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    /* renamed from: d */
    public static void m62214d(StringBuilder sb, MediaCodecInfo.VideoCapabilities videoCapabilities, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        m62212f(sb, "[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
        m62212f(sb, "[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
        m62212f(sb, "[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
        int i3 = 0;
        boolean z3 = true;
        try {
            i = mediaFormat.getInteger("width");
            i2 = mediaFormat.getInteger("height");
            if (i > 0 && i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2);
            z = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            m62212f(sb, "[VideoCaps] mediaFormat does not contain valid width and height");
            i = 0;
            i2 = 0;
            z = false;
        }
        if (z) {
            try {
                m62212f(sb, "[VideoCaps] getSupportedHeightsFor " + i + " = " + videoCapabilities.getSupportedHeightsFor(i));
            } catch (IllegalArgumentException unused2) {
                m62212f(sb, "[VideoCaps] could not getSupportedHeightsFor " + i);
            }
            try {
                m62212f(sb, "[VideoCaps] getSupportedWidthsFor " + i2 + " = " + videoCapabilities.getSupportedWidthsFor(i2));
            } catch (IllegalArgumentException unused3) {
                m62212f(sb, "[VideoCaps] could not getSupportedWidthsFor " + i2);
            }
            m62212f(sb, "[VideoCaps] isSizeSupported for " + i + "x" + i2 + " = " + videoCapabilities.isSizeSupported(i, i2));
        }
        m62212f(sb, "[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
        try {
            int integer = mediaFormat.getInteger("frame-rate");
            if (integer <= 0) {
                z3 = false;
            }
            Preconditions.checkArgument(z3);
            i3 = integer;
        } catch (IllegalArgumentException | NullPointerException unused4) {
            m62212f(sb, "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z) {
            m62212f(sb, "[VideoCaps] getSupportedFrameRatesFor " + i + "x" + i2 + " = " + videoCapabilities.getSupportedFrameRatesFor(i, i2));
        }
        if (z && i3 > 0) {
            m62212f(sb, "[VideoCaps] areSizeAndRateSupported for " + i + "x" + i2 + ", " + i3 + " = " + videoCapabilities.areSizeAndRateSupported(i, i2, i3));
        }
    }

    @NonNull
    public static String dumpCodecCapabilities(@NonNull String str, @NonNull MediaCodec mediaCodec, @NonNull MediaFormat mediaFormat) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            if (capabilitiesForType != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            m62216b(sb, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            m62212f(sb, "[" + mediaCodec.getName() + "] does not support mime " + str);
        }
        return sb.toString();
    }

    @NonNull
    public static String dumpMediaCodecListForFormat(@NonNull MediaCodecList mediaCodecList, @NonNull MediaFormat mediaFormat) {
        MediaCodecInfo[] codecInfos;
        boolean z;
        StringBuilder sb = new StringBuilder();
        m62212f(sb, "[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
        String string = mediaFormat.getString("mime");
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z2 = true;
                if (string != null) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    Preconditions.checkArgument(z);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z2 = false;
                    }
                    Preconditions.checkArgument(z2);
                    m62212f(sb, "[Start] [" + mediaCodecInfo.getName() + "]");
                    m62216b(sb, capabilitiesForType, mediaFormat);
                    m62212f(sb, "[End] [" + mediaCodecInfo.getName() + "]");
                } catch (IllegalArgumentException unused) {
                    m62212f(sb, "[" + mediaCodecInfo.getName() + "] does not support mime " + string);
                }
            }
        }
        m62212f(sb, "[End] Dump MediaCodecList");
        String sb2 = sb.toString();
        m62211g(sb2);
        return sb2;
    }

    /* renamed from: e */
    public static String m62213e(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    /* renamed from: f */
    public static void m62212f(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("\n");
    }

    /* renamed from: g */
    public static void m62211g(String str) {
        if (Logger.isInfoEnabled("DebugUtils")) {
            Scanner scanner = new Scanner(str);
            while (scanner.hasNextLine()) {
                Logger.m63225i("DebugUtils", scanner.nextLine());
            }
        }
    }

    /* renamed from: h */
    public static String m62210h(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        if (codecProfileLevel == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile));
    }

    @NonNull
    public static String readableBufferInfo(@NonNull MediaCodec.BufferInfo bufferInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("Dump BufferInfo: " + bufferInfo.toString() + "\n");
        sb.append("\toffset: " + bufferInfo.offset + "\n");
        sb.append("\tsize: " + bufferInfo.size + "\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\tflag: ");
        sb2.append(bufferInfo.flags);
        sb.append(sb2.toString());
        ArrayList arrayList = new ArrayList();
        if ((bufferInfo.flags & 4) != 0) {
            arrayList.add("EOS");
        }
        if ((bufferInfo.flags & 2) != 0) {
            arrayList.add("CODEC_CONFIG");
        }
        if ((bufferInfo.flags & 1) != 0) {
            arrayList.add("KEY_FRAME");
        }
        if ((bufferInfo.flags & 8) != 0) {
            arrayList.add("PARTIAL_FRAME");
        }
        if (!arrayList.isEmpty()) {
            sb.append(" (");
            sb.append(TextUtils.join(" | ", arrayList));
            sb.append(")");
        }
        sb.append("\n");
        sb.append("\tpresentationTime: " + bufferInfo.presentationTimeUs + " (" + readableUs(bufferInfo.presentationTimeUs) + ")\n");
        return sb.toString();
    }

    @NonNull
    public static String readableMs(long j) {
        return m62213e(j);
    }

    @NonNull
    public static String readableUs(long j) {
        return readableMs(TimeUnit.MICROSECONDS.toMillis(j));
    }
}
