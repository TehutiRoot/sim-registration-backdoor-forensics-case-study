package androidx.camera.video.internal.workaround;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.core.util.Preconditions;
import java.util.HashSet;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class VideoEncoderInfoWrapper implements VideoEncoderInfo {

    /* renamed from: a */
    public final VideoEncoderInfo f12102a;

    /* renamed from: b */
    public final Range f12103b;

    /* renamed from: c */
    public final Range f12104c;

    /* renamed from: d */
    public final Set f12105d;

    public VideoEncoderInfoWrapper(VideoEncoderInfo videoEncoderInfo, Size size) {
        HashSet hashSet = new HashSet();
        this.f12105d = hashSet;
        this.f12102a = videoEncoderInfo;
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        this.f12103b = Range.create(Integer.valueOf(widthAlignment), Integer.valueOf(((int) Math.ceil(4096.0d / widthAlignment)) * widthAlignment));
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        this.f12104c = Range.create(Integer.valueOf(heightAlignment), Integer.valueOf(((int) Math.ceil(2160.0d / heightAlignment)) * heightAlignment));
        if (size != null) {
            hashSet.add(size);
        }
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.getExtraSupportedSizes());
    }

    @NonNull
    public static VideoEncoderInfo from(@NonNull VideoEncoderInfo videoEncoderInfo, @Nullable Size size) {
        if (!(videoEncoderInfo instanceof VideoEncoderInfoWrapper)) {
            if (DeviceQuirks.get(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !videoEncoderInfo.isSizeSupported(size.getWidth(), size.getHeight())) {
                    Logger.m63223w("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, videoEncoderInfo.getSupportedWidths(), videoEncoderInfo.getSupportedHeights()));
                } else {
                    return videoEncoderInfo;
                }
            }
            return new VideoEncoderInfoWrapper(videoEncoderInfo, size);
        }
        return videoEncoderInfo;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.f12102a.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    @NonNull
    public String getName() {
        return this.f12102a.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedBitrateRange() {
        return this.f12102a.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedHeights() {
        return this.f12104c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedHeightsFor(int i) {
        boolean z;
        if (this.f12103b.contains((Range) Integer.valueOf(i)) && i % this.f12102a.getWidthAlignment() == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Not supported width: " + i + " which is not in " + this.f12103b + " or can not be divided by alignment " + this.f12102a.getWidthAlignment());
        return this.f12104c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedWidths() {
        return this.f12103b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedWidthsFor(int i) {
        boolean z;
        if (this.f12104c.contains((Range) Integer.valueOf(i)) && i % this.f12102a.getHeightAlignment() == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Not supported height: " + i + " which is not in " + this.f12104c + " or can not be divided by alignment " + this.f12102a.getHeightAlignment());
        return this.f12103b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.f12102a.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int i, int i2) {
        if (!this.f12105d.isEmpty() && this.f12105d.contains(new Size(i, i2))) {
            return true;
        }
        if (this.f12103b.contains((Range) Integer.valueOf(i)) && this.f12104c.contains((Range) Integer.valueOf(i2)) && i % this.f12102a.getWidthAlignment() == 0 && i2 % this.f12102a.getHeightAlignment() == 0) {
            return true;
        }
        return false;
    }
}
