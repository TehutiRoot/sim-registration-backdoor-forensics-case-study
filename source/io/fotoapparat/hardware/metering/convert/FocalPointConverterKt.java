package io.fotoapparat.hardware.metering.convert;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.Camera;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.hardware.metering.FocalRequest;
import io.fotoapparat.hardware.metering.PointF;
import io.fotoapparat.parameter.Resolution;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u0010\u001a\u00020\r*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0013\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\n*\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0001*\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001d\u001a\u00020\t*\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m28850d2 = {"Lio/fotoapparat/hardware/metering/FocalRequest;", "", "displayOrientationDegrees", "", "cameraIsMirrored", "", "Landroid/hardware/Camera$Area;", "toFocusAreas", "(Lio/fotoapparat/hardware/metering/FocalRequest;IZ)Ljava/util/List;", "", "Landroid/graphics/Rect;", "e", "(Lio/fotoapparat/hardware/metering/FocalRequest;FZ)Landroid/graphics/Rect;", "Lio/fotoapparat/hardware/metering/PointF;", "Lio/fotoapparat/parameter/Resolution;", "visibleResolution", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lio/fotoapparat/hardware/metering/PointF;Lio/fotoapparat/parameter/Resolution;FZ)Lio/fotoapparat/hardware/metering/PointF;", "Landroid/graphics/Matrix;", OperatorName.CURVE_TO, "(Landroid/graphics/Matrix;Lio/fotoapparat/parameter/Resolution;FZ)Landroid/graphics/Matrix;", OperatorName.NON_STROKING_GRAY, "(F)F", OperatorName.FILL_NON_ZERO, "(Lio/fotoapparat/hardware/metering/PointF;)Landroid/graphics/Rect;", "d", "(F)I", "min", "max", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(FFF)F", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocalPointConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocalPointConverter.kt\nio/fotoapparat/hardware/metering/convert/FocalPointConverterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
/* loaded from: classes5.dex */
public final class FocalPointConverterKt {
    /* renamed from: a */
    public static final PointF m30530a(PointF pointF, Resolution resolution, float f, boolean z) {
        Matrix m30528c = m30528c(new Matrix(), resolution, f, z);
        float[] fArr = {pointF.getX(), pointF.getY()};
        m30528c.mapPoints(fArr);
        return new PointF(m30524g(fArr[0]), m30524g(fArr[1]));
    }

    /* renamed from: b */
    public static final float m30529b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: c */
    public static final Matrix m30528c(Matrix matrix, Resolution resolution, float f, boolean z) {
        float f2;
        matrix.postScale(2000.0f / resolution.width, 2000.0f / resolution.height);
        matrix.postTranslate(-1000.0f, -1000.0f);
        matrix.postRotate(-f);
        if (z) {
            f2 = -1.0f;
        } else {
            f2 = 1.0f;
        }
        matrix.postScale(f2, 1.0f);
        return matrix;
    }

    /* renamed from: d */
    public static final int m30527d(float f) {
        return (int) m30529b(f, -1000.0f, 1000.0f);
    }

    /* renamed from: e */
    public static final Rect m30526e(FocalRequest focalRequest, float f, boolean z) {
        return m30525f(m30530a(focalRequest.getPoint(), focalRequest.getPreviewResolution(), f, z));
    }

    /* renamed from: f */
    public static final Rect m30525f(PointF pointF) {
        float f = 50;
        return new Rect(m30527d(pointF.getX() - f), m30527d(pointF.getY() - f), m30527d(pointF.getX() + f), m30527d(pointF.getY() + f));
    }

    /* renamed from: g */
    public static final float m30524g(float f) {
        float floatValue = Float.valueOf(f).floatValue();
        Float f2 = (-1000.0f > floatValue || floatValue > 1000.0f) ? null : null;
        if (f2 != null) {
            return f2.floatValue();
        }
        throw new IllegalArgumentException("Point value should be between -1000.0 and 1000.0. Was " + f);
    }

    @NotNull
    public static final List<Camera.Area> toFocusAreas(@NotNull FocalRequest focalRequest, int i, boolean z) {
        Intrinsics.checkNotNullParameter(focalRequest, "<this>");
        return AbstractC10108ds.listOf(new Camera.Area(m30526e(focalRequest, i, z), 1000));
    }
}
