package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.TransformExperimental;
import androidx.core.util.Preconditions;

@RequiresApi(21)
@TransformExperimental
/* loaded from: classes.dex */
public final class CoordinateTransform {

    /* renamed from: a */
    public final Matrix f12239a;

    public CoordinateTransform(@NonNull OutputTransform outputTransform, @NonNull OutputTransform outputTransform2) {
        if (!TransformUtils.isAspectRatioMatchingWithRoundingError(outputTransform.m61782a(), outputTransform2.m61782a())) {
            Logger.m63223w("CoordinateTransform", String.format("The source viewport (%s) does not match the target viewport (%s). Please make sure they are associated with the same Viewport.", outputTransform.m61782a(), outputTransform2.m61782a()));
        }
        Matrix matrix = new Matrix();
        this.f12239a = matrix;
        Preconditions.checkState(outputTransform.getMatrix().invert(matrix), "The source transform cannot be inverted");
        matrix.postConcat(outputTransform2.getMatrix());
    }

    public void mapPoint(@NonNull PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        this.f12239a.mapPoints(fArr);
        pointF.x = fArr[0];
        pointF.y = fArr[1];
    }

    public void mapPoints(@NonNull float[] fArr) {
        this.f12239a.mapPoints(fArr);
    }

    public void mapRect(@NonNull RectF rectF) {
        this.f12239a.mapRect(rectF);
    }

    public void transform(@NonNull Matrix matrix) {
        matrix.set(this.f12239a);
    }
}
