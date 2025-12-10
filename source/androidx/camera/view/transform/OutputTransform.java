package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.view.TransformExperimental;

@RequiresApi(21)
@TransformExperimental
/* loaded from: classes.dex */
public final class OutputTransform {

    /* renamed from: a */
    public final Matrix f12243a;

    /* renamed from: b */
    public final Size f12244b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OutputTransform(@NonNull Matrix matrix, @NonNull Size size) {
        this.f12243a = matrix;
        this.f12244b = size;
    }

    /* renamed from: a */
    public Size m61782a() {
        return this.f12244b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Matrix getMatrix() {
        return this.f12243a;
    }
}
