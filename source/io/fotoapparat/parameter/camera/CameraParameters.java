package io.fotoapparat.parameter.camera;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.parameter.AntiBandingMode;
import io.fotoapparat.parameter.Flash;
import io.fotoapparat.parameter.FocusMode;
import io.fotoapparat.parameter.FpsRange;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.util.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010$Jl\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010$R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010$¨\u0006F"}, m28850d2 = {"Lio/fotoapparat/parameter/camera/CameraParameters;", "", "Lio/fotoapparat/parameter/Flash;", "flashMode", "Lio/fotoapparat/parameter/FocusMode;", "focusMode", "", "jpegQuality", "exposureCompensation", "Lio/fotoapparat/parameter/FpsRange;", "previewFpsRange", "Lio/fotoapparat/parameter/AntiBandingMode;", "antiBandingMode", "sensorSensitivity", "Lio/fotoapparat/parameter/Resolution;", "pictureResolution", "previewResolution", "<init>", "(Lio/fotoapparat/parameter/Flash;Lio/fotoapparat/parameter/FocusMode;IILio/fotoapparat/parameter/FpsRange;Lio/fotoapparat/parameter/AntiBandingMode;Ljava/lang/Integer;Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/Resolution;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lio/fotoapparat/parameter/Flash;", "component2", "()Lio/fotoapparat/parameter/FocusMode;", "component3", "()I", "component4", "component5", "()Lio/fotoapparat/parameter/FpsRange;", "component6", "()Lio/fotoapparat/parameter/AntiBandingMode;", "component7", "()Ljava/lang/Integer;", "component8", "()Lio/fotoapparat/parameter/Resolution;", "component9", "copy", "(Lio/fotoapparat/parameter/Flash;Lio/fotoapparat/parameter/FocusMode;IILio/fotoapparat/parameter/FpsRange;Lio/fotoapparat/parameter/AntiBandingMode;Ljava/lang/Integer;Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/Resolution;)Lio/fotoapparat/parameter/camera/CameraParameters;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/parameter/Flash;", "getFlashMode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lio/fotoapparat/parameter/FocusMode;", "getFocusMode", OperatorName.CURVE_TO, "I", "getJpegQuality", "d", "getExposureCompensation", "e", "Lio/fotoapparat/parameter/FpsRange;", "getPreviewFpsRange", OperatorName.FILL_NON_ZERO, "Lio/fotoapparat/parameter/AntiBandingMode;", "getAntiBandingMode", OperatorName.NON_STROKING_GRAY, "Ljava/lang/Integer;", "getSensorSensitivity", OperatorName.CLOSE_PATH, "Lio/fotoapparat/parameter/Resolution;", "getPictureResolution", "i", "getPreviewResolution", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class CameraParameters {

    /* renamed from: a */
    public final Flash f63019a;

    /* renamed from: b */
    public final FocusMode f63020b;

    /* renamed from: c */
    public final int f63021c;

    /* renamed from: d */
    public final int f63022d;

    /* renamed from: e */
    public final FpsRange f63023e;

    /* renamed from: f */
    public final AntiBandingMode f63024f;

    /* renamed from: g */
    public final Integer f63025g;

    /* renamed from: h */
    public final Resolution f63026h;

    /* renamed from: i */
    public final Resolution f63027i;

    public CameraParameters(@NotNull Flash flashMode, @NotNull FocusMode focusMode, int i, int i2, @NotNull FpsRange previewFpsRange, @NotNull AntiBandingMode antiBandingMode, @Nullable Integer num, @NotNull Resolution pictureResolution, @NotNull Resolution previewResolution) {
        Intrinsics.checkNotNullParameter(flashMode, "flashMode");
        Intrinsics.checkNotNullParameter(focusMode, "focusMode");
        Intrinsics.checkNotNullParameter(previewFpsRange, "previewFpsRange");
        Intrinsics.checkNotNullParameter(antiBandingMode, "antiBandingMode");
        Intrinsics.checkNotNullParameter(pictureResolution, "pictureResolution");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        this.f63019a = flashMode;
        this.f63020b = focusMode;
        this.f63021c = i;
        this.f63022d = i2;
        this.f63023e = previewFpsRange;
        this.f63024f = antiBandingMode;
        this.f63025g = num;
        this.f63026h = pictureResolution;
        this.f63027i = previewResolution;
    }

    @NotNull
    public final Flash component1() {
        return this.f63019a;
    }

    @NotNull
    public final FocusMode component2() {
        return this.f63020b;
    }

    public final int component3() {
        return this.f63021c;
    }

    public final int component4() {
        return this.f63022d;
    }

    @NotNull
    public final FpsRange component5() {
        return this.f63023e;
    }

    @NotNull
    public final AntiBandingMode component6() {
        return this.f63024f;
    }

    @Nullable
    public final Integer component7() {
        return this.f63025g;
    }

    @NotNull
    public final Resolution component8() {
        return this.f63026h;
    }

    @NotNull
    public final Resolution component9() {
        return this.f63027i;
    }

    @NotNull
    public final CameraParameters copy(@NotNull Flash flashMode, @NotNull FocusMode focusMode, int i, int i2, @NotNull FpsRange previewFpsRange, @NotNull AntiBandingMode antiBandingMode, @Nullable Integer num, @NotNull Resolution pictureResolution, @NotNull Resolution previewResolution) {
        Intrinsics.checkNotNullParameter(flashMode, "flashMode");
        Intrinsics.checkNotNullParameter(focusMode, "focusMode");
        Intrinsics.checkNotNullParameter(previewFpsRange, "previewFpsRange");
        Intrinsics.checkNotNullParameter(antiBandingMode, "antiBandingMode");
        Intrinsics.checkNotNullParameter(pictureResolution, "pictureResolution");
        Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
        return new CameraParameters(flashMode, focusMode, i, i2, previewFpsRange, antiBandingMode, num, pictureResolution, previewResolution);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraParameters) {
            CameraParameters cameraParameters = (CameraParameters) obj;
            return Intrinsics.areEqual(this.f63019a, cameraParameters.f63019a) && Intrinsics.areEqual(this.f63020b, cameraParameters.f63020b) && this.f63021c == cameraParameters.f63021c && this.f63022d == cameraParameters.f63022d && Intrinsics.areEqual(this.f63023e, cameraParameters.f63023e) && Intrinsics.areEqual(this.f63024f, cameraParameters.f63024f) && Intrinsics.areEqual(this.f63025g, cameraParameters.f63025g) && Intrinsics.areEqual(this.f63026h, cameraParameters.f63026h) && Intrinsics.areEqual(this.f63027i, cameraParameters.f63027i);
        }
        return false;
    }

    @NotNull
    public final AntiBandingMode getAntiBandingMode() {
        return this.f63024f;
    }

    public final int getExposureCompensation() {
        return this.f63022d;
    }

    @NotNull
    public final Flash getFlashMode() {
        return this.f63019a;
    }

    @NotNull
    public final FocusMode getFocusMode() {
        return this.f63020b;
    }

    public final int getJpegQuality() {
        return this.f63021c;
    }

    @NotNull
    public final Resolution getPictureResolution() {
        return this.f63026h;
    }

    @NotNull
    public final FpsRange getPreviewFpsRange() {
        return this.f63023e;
    }

    @NotNull
    public final Resolution getPreviewResolution() {
        return this.f63027i;
    }

    @Nullable
    public final Integer getSensorSensitivity() {
        return this.f63025g;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f63019a.hashCode() * 31) + this.f63020b.hashCode()) * 31) + this.f63021c) * 31) + this.f63022d) * 31) + this.f63023e.hashCode()) * 31) + this.f63024f.hashCode()) * 31;
        Integer num = this.f63025g;
        return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f63026h.hashCode()) * 31) + this.f63027i.hashCode();
    }

    @NotNull
    public String toString() {
        String lineSeparator = StringExtensionsKt.getLineSeparator();
        String wrap = StringExtensionsKt.wrap(this.f63019a);
        String wrap2 = StringExtensionsKt.wrap(this.f63020b);
        String wrap3 = StringExtensionsKt.wrap(Integer.valueOf(this.f63021c));
        String wrap4 = StringExtensionsKt.wrap(Integer.valueOf(this.f63022d));
        String wrap5 = StringExtensionsKt.wrap(this.f63023e);
        String wrap6 = StringExtensionsKt.wrap(this.f63024f);
        String wrap7 = StringExtensionsKt.wrap(this.f63025g);
        String wrap8 = StringExtensionsKt.wrap(this.f63026h);
        String wrap9 = StringExtensionsKt.wrap(this.f63027i);
        return "CameraParameters" + lineSeparator + "flashMode:" + wrap + "focusMode:" + wrap2 + "jpegQuality:" + wrap3 + "exposureCompensation:" + wrap4 + "previewFpsRange:" + wrap5 + "antiBandingMode:" + wrap6 + "sensorSensitivity:" + wrap7 + "pictureResolution:" + wrap8 + "previewResolution:" + wrap9;
    }
}
