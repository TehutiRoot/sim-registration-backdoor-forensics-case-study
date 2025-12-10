package io.fotoapparat.capability;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.parameter.AntiBandingMode;
import io.fotoapparat.parameter.Flash;
import io.fotoapparat.parameter.FocusMode;
import io.fotoapparat.parameter.FpsRange;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.parameter.Zoom;
import io.fotoapparat.util.StringExtensionsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004HÆ\u0003¢\u0006\u0004\b+\u0010!J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003¢\u0006\u0004\b/\u0010!J¼\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b2\u0010&J\u001a\u00104\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010&R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010)R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010)R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0006¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010!R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u0010!R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\bO\u0010:\u001a\u0004\bP\u0010!R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010:\u001a\u0004\bR\u0010!R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010!¨\u0006U"}, m28850d2 = {"Lio/fotoapparat/capability/Capabilities;", "", "Lio/fotoapparat/parameter/Zoom;", "zoom", "", "Lio/fotoapparat/parameter/Flash;", "flashModes", "Lio/fotoapparat/parameter/FocusMode;", "focusModes", "", "canSmoothZoom", "", "maxFocusAreas", "maxMeteringAreas", "Lkotlin/ranges/IntRange;", "jpegQualityRange", "exposureCompensationRange", "Lio/fotoapparat/parameter/FpsRange;", "previewFpsRanges", "Lio/fotoapparat/parameter/AntiBandingMode;", "antiBandingModes", "Lio/fotoapparat/parameter/Resolution;", "pictureResolutions", "previewResolutions", "sensorSensitivities", "<init>", "(Lio/fotoapparat/parameter/Zoom;Ljava/util/Set;Ljava/util/Set;ZIILkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lio/fotoapparat/parameter/Zoom;", "component2", "()Ljava/util/Set;", "component3", "component4", "()Z", "component5", "()I", "component6", "component7", "()Lkotlin/ranges/IntRange;", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lio/fotoapparat/parameter/Zoom;Ljava/util/Set;Ljava/util/Set;ZIILkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lio/fotoapparat/capability/Capabilities;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/parameter/Zoom;", "getZoom", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Set;", "getFlashModes", OperatorName.CURVE_TO, "getFocusModes", "d", "Z", "getCanSmoothZoom", "e", "I", "getMaxFocusAreas", OperatorName.FILL_NON_ZERO, "getMaxMeteringAreas", OperatorName.NON_STROKING_GRAY, "Lkotlin/ranges/IntRange;", "getJpegQualityRange", OperatorName.CLOSE_PATH, "getExposureCompensationRange", "i", "getPreviewFpsRanges", OperatorName.SET_LINE_JOINSTYLE, "getAntiBandingModes", OperatorName.NON_STROKING_CMYK, "getPictureResolutions", OperatorName.LINE_TO, "getPreviewResolutions", OperatorName.MOVE_TO, "getSensorSensitivities", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCapabilities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Capabilities.kt\nio/fotoapparat/capability/Capabilities\n+ 2 Capabilities.kt\nio/fotoapparat/capability/CapabilitiesKt\n*L\n1#1,60:1\n56#2,4:61\n56#2,4:65\n56#2,4:69\n56#2,4:73\n56#2,4:77\n56#2,4:81\n*S KotlinDebug\n*F\n+ 1 Capabilities.kt\nio/fotoapparat/capability/Capabilities\n*L\n29#1:61,4\n30#1:65,4\n31#1:69,4\n32#1:73,4\n33#1:77,4\n34#1:81,4\n*E\n"})
/* loaded from: classes5.dex */
public final class Capabilities {

    /* renamed from: a */
    public final Zoom f62912a;

    /* renamed from: b */
    public final Set f62913b;

    /* renamed from: c */
    public final Set f62914c;

    /* renamed from: d */
    public final boolean f62915d;

    /* renamed from: e */
    public final int f62916e;

    /* renamed from: f */
    public final int f62917f;

    /* renamed from: g */
    public final IntRange f62918g;

    /* renamed from: h */
    public final IntRange f62919h;

    /* renamed from: i */
    public final Set f62920i;

    /* renamed from: j */
    public final Set f62921j;

    /* renamed from: k */
    public final Set f62922k;

    /* renamed from: l */
    public final Set f62923l;

    /* renamed from: m */
    public final Set f62924m;

    public Capabilities(@NotNull Zoom zoom, @NotNull Set<? extends Flash> flashModes, @NotNull Set<? extends FocusMode> focusModes, boolean z, int i, int i2, @NotNull IntRange jpegQualityRange, @NotNull IntRange exposureCompensationRange, @NotNull Set<FpsRange> previewFpsRanges, @NotNull Set<? extends AntiBandingMode> antiBandingModes, @NotNull Set<Resolution> pictureResolutions, @NotNull Set<Resolution> previewResolutions, @NotNull Set<Integer> sensorSensitivities) {
        Intrinsics.checkNotNullParameter(zoom, "zoom");
        Intrinsics.checkNotNullParameter(flashModes, "flashModes");
        Intrinsics.checkNotNullParameter(focusModes, "focusModes");
        Intrinsics.checkNotNullParameter(jpegQualityRange, "jpegQualityRange");
        Intrinsics.checkNotNullParameter(exposureCompensationRange, "exposureCompensationRange");
        Intrinsics.checkNotNullParameter(previewFpsRanges, "previewFpsRanges");
        Intrinsics.checkNotNullParameter(antiBandingModes, "antiBandingModes");
        Intrinsics.checkNotNullParameter(pictureResolutions, "pictureResolutions");
        Intrinsics.checkNotNullParameter(previewResolutions, "previewResolutions");
        Intrinsics.checkNotNullParameter(sensorSensitivities, "sensorSensitivities");
        this.f62912a = zoom;
        this.f62913b = flashModes;
        this.f62914c = focusModes;
        this.f62915d = z;
        this.f62916e = i;
        this.f62917f = i2;
        this.f62918g = jpegQualityRange;
        this.f62919h = exposureCompensationRange;
        this.f62920i = previewFpsRanges;
        this.f62921j = antiBandingModes;
        this.f62922k = pictureResolutions;
        this.f62923l = previewResolutions;
        this.f62924m = sensorSensitivities;
        if (!flashModes.isEmpty()) {
            if (!focusModes.isEmpty()) {
                if (!antiBandingModes.isEmpty()) {
                    if (!previewFpsRanges.isEmpty()) {
                        if (!pictureResolutions.isEmpty()) {
                            if (previewResolutions.isEmpty()) {
                                String simpleName = Resolution.class.getSimpleName();
                                throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + simpleName + ">.");
                            }
                            return;
                        }
                        String simpleName2 = Resolution.class.getSimpleName();
                        throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + simpleName2 + ">.");
                    }
                    String simpleName3 = FpsRange.class.getSimpleName();
                    throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + simpleName3 + ">.");
                }
                String simpleName4 = AntiBandingMode.class.getSimpleName();
                throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + simpleName4 + ">.");
            }
            String simpleName5 = FocusMode.class.getSimpleName();
            throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + simpleName5 + ">.");
        }
        String simpleName6 = Flash.class.getSimpleName();
        throw new IllegalArgumentException("Capabilities cannot have an empty Set<" + simpleName6 + ">.");
    }

    @NotNull
    public final Zoom component1() {
        return this.f62912a;
    }

    @NotNull
    public final Set<AntiBandingMode> component10() {
        return this.f62921j;
    }

    @NotNull
    public final Set<Resolution> component11() {
        return this.f62922k;
    }

    @NotNull
    public final Set<Resolution> component12() {
        return this.f62923l;
    }

    @NotNull
    public final Set<Integer> component13() {
        return this.f62924m;
    }

    @NotNull
    public final Set<Flash> component2() {
        return this.f62913b;
    }

    @NotNull
    public final Set<FocusMode> component3() {
        return this.f62914c;
    }

    public final boolean component4() {
        return this.f62915d;
    }

    public final int component5() {
        return this.f62916e;
    }

    public final int component6() {
        return this.f62917f;
    }

    @NotNull
    public final IntRange component7() {
        return this.f62918g;
    }

    @NotNull
    public final IntRange component8() {
        return this.f62919h;
    }

    @NotNull
    public final Set<FpsRange> component9() {
        return this.f62920i;
    }

    @NotNull
    public final Capabilities copy(@NotNull Zoom zoom, @NotNull Set<? extends Flash> flashModes, @NotNull Set<? extends FocusMode> focusModes, boolean z, int i, int i2, @NotNull IntRange jpegQualityRange, @NotNull IntRange exposureCompensationRange, @NotNull Set<FpsRange> previewFpsRanges, @NotNull Set<? extends AntiBandingMode> antiBandingModes, @NotNull Set<Resolution> pictureResolutions, @NotNull Set<Resolution> previewResolutions, @NotNull Set<Integer> sensorSensitivities) {
        Intrinsics.checkNotNullParameter(zoom, "zoom");
        Intrinsics.checkNotNullParameter(flashModes, "flashModes");
        Intrinsics.checkNotNullParameter(focusModes, "focusModes");
        Intrinsics.checkNotNullParameter(jpegQualityRange, "jpegQualityRange");
        Intrinsics.checkNotNullParameter(exposureCompensationRange, "exposureCompensationRange");
        Intrinsics.checkNotNullParameter(previewFpsRanges, "previewFpsRanges");
        Intrinsics.checkNotNullParameter(antiBandingModes, "antiBandingModes");
        Intrinsics.checkNotNullParameter(pictureResolutions, "pictureResolutions");
        Intrinsics.checkNotNullParameter(previewResolutions, "previewResolutions");
        Intrinsics.checkNotNullParameter(sensorSensitivities, "sensorSensitivities");
        return new Capabilities(zoom, flashModes, focusModes, z, i, i2, jpegQualityRange, exposureCompensationRange, previewFpsRanges, antiBandingModes, pictureResolutions, previewResolutions, sensorSensitivities);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Capabilities) {
            Capabilities capabilities = (Capabilities) obj;
            return Intrinsics.areEqual(this.f62912a, capabilities.f62912a) && Intrinsics.areEqual(this.f62913b, capabilities.f62913b) && Intrinsics.areEqual(this.f62914c, capabilities.f62914c) && this.f62915d == capabilities.f62915d && this.f62916e == capabilities.f62916e && this.f62917f == capabilities.f62917f && Intrinsics.areEqual(this.f62918g, capabilities.f62918g) && Intrinsics.areEqual(this.f62919h, capabilities.f62919h) && Intrinsics.areEqual(this.f62920i, capabilities.f62920i) && Intrinsics.areEqual(this.f62921j, capabilities.f62921j) && Intrinsics.areEqual(this.f62922k, capabilities.f62922k) && Intrinsics.areEqual(this.f62923l, capabilities.f62923l) && Intrinsics.areEqual(this.f62924m, capabilities.f62924m);
        }
        return false;
    }

    @NotNull
    public final Set<AntiBandingMode> getAntiBandingModes() {
        return this.f62921j;
    }

    public final boolean getCanSmoothZoom() {
        return this.f62915d;
    }

    @NotNull
    public final IntRange getExposureCompensationRange() {
        return this.f62919h;
    }

    @NotNull
    public final Set<Flash> getFlashModes() {
        return this.f62913b;
    }

    @NotNull
    public final Set<FocusMode> getFocusModes() {
        return this.f62914c;
    }

    @NotNull
    public final IntRange getJpegQualityRange() {
        return this.f62918g;
    }

    public final int getMaxFocusAreas() {
        return this.f62916e;
    }

    public final int getMaxMeteringAreas() {
        return this.f62917f;
    }

    @NotNull
    public final Set<Resolution> getPictureResolutions() {
        return this.f62922k;
    }

    @NotNull
    public final Set<FpsRange> getPreviewFpsRanges() {
        return this.f62920i;
    }

    @NotNull
    public final Set<Resolution> getPreviewResolutions() {
        return this.f62923l;
    }

    @NotNull
    public final Set<Integer> getSensorSensitivities() {
        return this.f62924m;
    }

    @NotNull
    public final Zoom getZoom() {
        return this.f62912a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f62912a.hashCode() * 31) + this.f62913b.hashCode()) * 31) + this.f62914c.hashCode()) * 31;
        boolean z = this.f62915d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((((((((hashCode + i) * 31) + this.f62916e) * 31) + this.f62917f) * 31) + this.f62918g.hashCode()) * 31) + this.f62919h.hashCode()) * 31) + this.f62920i.hashCode()) * 31) + this.f62921j.hashCode()) * 31) + this.f62922k.hashCode()) * 31) + this.f62923l.hashCode()) * 31) + this.f62924m.hashCode();
    }

    @NotNull
    public String toString() {
        String lineSeparator = StringExtensionsKt.getLineSeparator();
        String wrap = StringExtensionsKt.wrap(this.f62912a);
        String wrap2 = StringExtensionsKt.wrap((Set<? extends Object>) this.f62913b);
        String wrap3 = StringExtensionsKt.wrap((Set<? extends Object>) this.f62914c);
        String wrap4 = StringExtensionsKt.wrap(Boolean.valueOf(this.f62915d));
        String wrap5 = StringExtensionsKt.wrap(Integer.valueOf(this.f62916e));
        String wrap6 = StringExtensionsKt.wrap(Integer.valueOf(this.f62917f));
        String wrap7 = StringExtensionsKt.wrap(this.f62918g);
        String wrap8 = StringExtensionsKt.wrap(this.f62919h);
        String wrap9 = StringExtensionsKt.wrap((Set<? extends Object>) this.f62921j);
        String wrap10 = StringExtensionsKt.wrap((Set<? extends Object>) this.f62920i);
        String wrap11 = StringExtensionsKt.wrap((Set<? extends Object>) this.f62922k);
        String wrap12 = StringExtensionsKt.wrap((Set<? extends Object>) this.f62923l);
        String wrap13 = StringExtensionsKt.wrap((Set<? extends Object>) this.f62924m);
        return "Capabilities" + lineSeparator + "zoom:" + wrap + "flashModes:" + wrap2 + "focusModes:" + wrap3 + "canSmoothZoom:" + wrap4 + "maxFocusAreas:" + wrap5 + "maxMeteringAreas:" + wrap6 + "jpegQualityRange:" + wrap7 + "exposureCompensationRange:" + wrap8 + "antiBandingModes:" + wrap9 + "previewFpsRanges:" + wrap10 + "pictureResolutions:" + wrap11 + "previewResolutions:" + wrap12 + "sensorSensitivities:" + wrap13;
    }
}
