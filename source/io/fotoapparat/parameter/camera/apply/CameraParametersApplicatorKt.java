package io.fotoapparat.parameter.camera.apply;

import android.hardware.Camera;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.parameter.AntiBandingMode;
import io.fotoapparat.parameter.Flash;
import io.fotoapparat.parameter.FocusMode;
import io.fotoapparat.parameter.FpsRange;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.parameter.camera.CameraParameters;
import io.fotoapparat.parameter.camera.convert.AntiBandingConverterKt;
import io.fotoapparat.parameter.camera.convert.FlashConverterKt;
import io.fotoapparat.parameter.camera.convert.FocusModeConverterKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00060\u0001R\u00020\u0002*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\n\u001a\u00020\u0006*\u00020\t2\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\n\u0010\u000b\u001a \u0010\r\u001a\u00020\u0006*\u00020\f2\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a \u0010\u0010\u001a\u00020\u0006*\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\u0010\u0010\u0011\u001a \u0010\u0012\u001a\u00020\u0006*\u00020\u000f2\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\u0012\u0010\u0011\u001a \u0010\u0014\u001a\u00020\u0006*\u00020\u00132\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\u0014\u0010\u0015\u001a \u0010\u0017\u001a\u00020\u0006*\u00020\u00162\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a\"\u0010\u0019\u001a\u00020\u0006*\u0004\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\u0019\u0010\u001a\u001a \u0010\u001c\u001a\u00020\u0006*\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\u001c\u0010\u001d\u001a \u0010\u001e\u001a\u00020\u0006*\u00020\u001b2\n\u0010\u0003\u001a\u00060\u0001R\u00020\u0002H\u0082\u0004¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u0019\u0010 \u001a\u0004\u0018\u00010\u001f*\u00060\u0001R\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!\"\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#¨\u0006%"}, m28850d2 = {"Lio/fotoapparat/parameter/camera/CameraParameters;", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "parameters", "applyInto", "(Lio/fotoapparat/parameter/camera/CameraParameters;Landroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Parameters;", "", OperatorName.NON_STROKING_CMYK, "(Lio/fotoapparat/parameter/camera/CameraParameters;Landroid/hardware/Camera$Parameters;)V", "Lio/fotoapparat/parameter/Flash;", OperatorName.CURVE_TO, "(Lio/fotoapparat/parameter/Flash;Landroid/hardware/Camera$Parameters;)V", "Lio/fotoapparat/parameter/FocusMode;", "d", "(Lio/fotoapparat/parameter/FocusMode;Landroid/hardware/Camera$Parameters;)V", "", OperatorName.FILL_NON_ZERO, "(ILandroid/hardware/Camera$Parameters;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/parameter/AntiBandingMode;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lio/fotoapparat/parameter/AntiBandingMode;Landroid/hardware/Camera$Parameters;)V", "Lio/fotoapparat/parameter/FpsRange;", "e", "(Lio/fotoapparat/parameter/FpsRange;Landroid/hardware/Camera$Parameters;)V", "i", "(Ljava/lang/Integer;Landroid/hardware/Camera$Parameters;)V", "Lio/fotoapparat/parameter/Resolution;", OperatorName.CLOSE_PATH, "(Lio/fotoapparat/parameter/Resolution;Landroid/hardware/Camera$Parameters;)V", OperatorName.NON_STROKING_GRAY, "", OperatorName.SET_LINE_JOINSTYLE, "(Landroid/hardware/Camera$Parameters;)Ljava/lang/String;", "", "Ljava/util/List;", "currentSensitivityKeys", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCameraParametersApplicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraParametersApplicator.kt\nio/fotoapparat/parameter/camera/apply/CameraParametersApplicatorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes5.dex */
public final class CameraParametersApplicatorKt {

    /* renamed from: a */
    public static final List f63028a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"iso", "iso-speed", "nv-picture-iso"});

    /* renamed from: a */
    public static final void m30522a(int i, Camera.Parameters parameters) {
        parameters.setExposureCompensation(i);
    }

    @NotNull
    public static final Camera.Parameters applyInto(@NotNull CameraParameters cameraParameters, @NotNull Camera.Parameters parameters) {
        Intrinsics.checkNotNullParameter(cameraParameters, "<this>");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        m30512k(cameraParameters, parameters);
        return parameters;
    }

    /* renamed from: b */
    public static final void m30521b(AntiBandingMode antiBandingMode, Camera.Parameters parameters) {
        parameters.setAntibanding(AntiBandingConverterKt.toCode(antiBandingMode));
    }

    /* renamed from: c */
    public static final void m30520c(Flash flash, Camera.Parameters parameters) {
        parameters.setFlashMode(FlashConverterKt.toCode(flash));
    }

    /* renamed from: d */
    public static final void m30519d(FocusMode focusMode, Camera.Parameters parameters) {
        parameters.setFocusMode(FocusModeConverterKt.toCode(focusMode));
    }

    /* renamed from: e */
    public static final void m30518e(FpsRange fpsRange, Camera.Parameters parameters) {
        parameters.setPreviewFpsRange(fpsRange.getMin(), fpsRange.getMax());
    }

    /* renamed from: f */
    public static final void m30517f(int i, Camera.Parameters parameters) {
        parameters.setJpegQuality(i);
    }

    /* renamed from: g */
    public static final void m30516g(Resolution resolution, Camera.Parameters parameters) {
        parameters.setPictureSize(resolution.width, resolution.height);
    }

    /* renamed from: h */
    public static final void m30515h(Resolution resolution, Camera.Parameters parameters) {
        parameters.setPreviewSize(resolution.width, resolution.height);
    }

    /* renamed from: i */
    public static final void m30514i(Integer num, Camera.Parameters parameters) {
        if (num != null) {
            int intValue = num.intValue();
            String m30513j = m30513j(parameters);
            if (m30513j != null) {
                parameters.set(m30513j, intValue);
            }
        }
    }

    /* renamed from: j */
    public static final String m30513j(Camera.Parameters parameters) {
        Object obj;
        Iterator it = f63028a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (parameters.get((String) obj) != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (String) obj;
    }

    /* renamed from: k */
    public static final void m30512k(CameraParameters cameraParameters, Camera.Parameters parameters) {
        m30520c(cameraParameters.getFlashMode(), parameters);
        m30519d(cameraParameters.getFocusMode(), parameters);
        m30517f(cameraParameters.getJpegQuality(), parameters);
        m30522a(cameraParameters.getExposureCompensation(), parameters);
        m30521b(cameraParameters.getAntiBandingMode(), parameters);
        m30518e(cameraParameters.getPreviewFpsRange(), parameters);
        m30515h(cameraParameters.getPreviewResolution(), parameters);
        m30514i(cameraParameters.getSensorSensitivity(), parameters);
        m30516g(cameraParameters.getPictureResolution(), parameters);
    }
}
