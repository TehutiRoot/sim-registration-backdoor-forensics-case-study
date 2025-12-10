package io.fotoapparat.parameter;

import android.hardware.Camera;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR%\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0013R\u00020\u00030\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000eR%\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0013R\u00020\u00030\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000eR!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000eR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u001b\u0010&\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010*R)\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\n0\n0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u000eR\u001b\u00104\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\f\u001a\u0004\b6\u00103R\u001b\u0010;\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\f\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b=\u0010:¨\u0006?"}, m28850d2 = {"Lio/fotoapparat/parameter/SupportedParameters;", "", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "cameraParameters", "<init>", "(Landroid/hardware/Camera$Parameters;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/hardware/Camera$Parameters;", "", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", "getFlashModes", "()Ljava/util/List;", "flashModes", OperatorName.CURVE_TO, "getFocusModes", "focusModes", "Landroid/hardware/Camera$Size;", "d", "getPreviewResolutions", "previewResolutions", "e", "getPictureResolutions", "pictureResolutions", "", OperatorName.FILL_NON_ZERO, "getSupportedPreviewFpsRanges", "supportedPreviewFpsRanges", "", OperatorName.NON_STROKING_GRAY, "getSensorSensitivities", "sensorSensitivities", "Lio/fotoapparat/parameter/Zoom;", OperatorName.CLOSE_PATH, "getSupportedZoom", "()Lio/fotoapparat/parameter/Zoom;", "supportedZoom", "", "i", "getSupportedSmoothZoom", "()Z", "supportedSmoothZoom", "kotlin.jvm.PlatformType", OperatorName.SET_LINE_JOINSTYLE, "getSupportedAutoBandingModes", "supportedAutoBandingModes", "Lkotlin/ranges/IntRange;", OperatorName.NON_STROKING_CMYK, "getJpegQualityRange", "()Lkotlin/ranges/IntRange;", "jpegQualityRange", OperatorName.LINE_TO, "getExposureCompensationRange", "exposureCompensationRange", OperatorName.MOVE_TO, "getMaxNumFocusAreas", "()I", "maxNumFocusAreas", OperatorName.ENDPATH, "getMaxNumMeteringAreas", "maxNumMeteringAreas", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SupportedParameters {

    /* renamed from: a */
    public final Camera.Parameters f63002a;

    /* renamed from: b */
    public final Lazy f63003b;

    /* renamed from: c */
    public final Lazy f63004c;

    /* renamed from: d */
    public final Lazy f63005d;

    /* renamed from: e */
    public final Lazy f63006e;

    /* renamed from: f */
    public final Lazy f63007f;

    /* renamed from: g */
    public final Lazy f63008g;

    /* renamed from: h */
    public final Lazy f63009h;

    /* renamed from: i */
    public final Lazy f63010i;

    /* renamed from: j */
    public final Lazy f63011j;

    /* renamed from: k */
    public final Lazy f63012k;

    /* renamed from: l */
    public final Lazy f63013l;

    /* renamed from: m */
    public final Lazy f63014m;

    /* renamed from: n */
    public final Lazy f63015n;

    public SupportedParameters(@NotNull Camera.Parameters cameraParameters) {
        Intrinsics.checkNotNullParameter(cameraParameters, "cameraParameters");
        this.f63002a = cameraParameters;
        this.f63003b = LazyKt__LazyJVMKt.lazy(new SupportedParameters$flashModes$2(this));
        this.f63004c = LazyKt__LazyJVMKt.lazy(new SupportedParameters$focusModes$2(this));
        this.f63005d = LazyKt__LazyJVMKt.lazy(new SupportedParameters$previewResolutions$2(this));
        this.f63006e = LazyKt__LazyJVMKt.lazy(new SupportedParameters$pictureResolutions$2(this));
        this.f63007f = LazyKt__LazyJVMKt.lazy(new SupportedParameters$supportedPreviewFpsRanges$2(this));
        this.f63008g = LazyKt__LazyJVMKt.lazy(new SupportedParameters$sensorSensitivities$2(this));
        this.f63009h = LazyKt__LazyJVMKt.lazy(new SupportedParameters$supportedZoom$2(this));
        this.f63010i = LazyKt__LazyJVMKt.lazy(new SupportedParameters$supportedSmoothZoom$2(this));
        this.f63011j = LazyKt__LazyJVMKt.lazy(new SupportedParameters$supportedAutoBandingModes$2(this));
        this.f63012k = LazyKt__LazyJVMKt.lazy(SupportedParameters$jpegQualityRange$2.INSTANCE);
        this.f63013l = LazyKt__LazyJVMKt.lazy(new SupportedParameters$exposureCompensationRange$2(this));
        this.f63014m = LazyKt__LazyJVMKt.lazy(new SupportedParameters$maxNumFocusAreas$2(this));
        this.f63015n = LazyKt__LazyJVMKt.lazy(new SupportedParameters$maxNumMeteringAreas$2(this));
    }

    @NotNull
    public final IntRange getExposureCompensationRange() {
        return (IntRange) this.f63013l.getValue();
    }

    @NotNull
    public final List<String> getFlashModes() {
        return (List) this.f63003b.getValue();
    }

    @NotNull
    public final List<String> getFocusModes() {
        Object value = this.f63004c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-focusModes>(...)");
        return (List) value;
    }

    @NotNull
    public final IntRange getJpegQualityRange() {
        return (IntRange) this.f63012k.getValue();
    }

    public final int getMaxNumFocusAreas() {
        return ((Number) this.f63014m.getValue()).intValue();
    }

    public final int getMaxNumMeteringAreas() {
        return ((Number) this.f63015n.getValue()).intValue();
    }

    @NotNull
    public final List<Camera.Size> getPictureResolutions() {
        Object value = this.f63006e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-pictureResolutions>(...)");
        return (List) value;
    }

    @NotNull
    public final List<Camera.Size> getPreviewResolutions() {
        Object value = this.f63005d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-previewResolutions>(...)");
        return (List) value;
    }

    @NotNull
    public final List<Integer> getSensorSensitivities() {
        return (List) this.f63008g.getValue();
    }

    @NotNull
    public final List<String> getSupportedAutoBandingModes() {
        return (List) this.f63011j.getValue();
    }

    @NotNull
    public final List<int[]> getSupportedPreviewFpsRanges() {
        Object value = this.f63007f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-supportedPreviewFpsRanges>(...)");
        return (List) value;
    }

    public final boolean getSupportedSmoothZoom() {
        return ((Boolean) this.f63010i.getValue()).booleanValue();
    }

    @NotNull
    public final Zoom getSupportedZoom() {
        return (Zoom) this.f63009h.getValue();
    }
}
