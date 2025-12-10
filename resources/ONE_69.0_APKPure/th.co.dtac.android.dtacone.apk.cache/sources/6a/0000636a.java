package androidx.compose.p003ui.platform;

import android.graphics.Matrix;
import androidx.compose.p003ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0011RD\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R!\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR!\u0010 \u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010#\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, m29142d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", "T", "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_TARGET, "Landroid/graphics/Matrix;", "matrix", "", "getMatrix", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "invalidate", "()V", "Landroidx/compose/ui/graphics/Matrix;", "calculateMatrix-GrdbGEg", "(Ljava/lang/Object;)[F", "calculateMatrix", "calculateInverseMatrix-bWbORWo", "calculateInverseMatrix", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/Matrix;", "androidMatrixCache", OperatorName.CURVE_TO, "previousAndroidMatrix", "d", "[F", "matrixCache", "e", "inverseMatrixCache", "", OperatorName.FILL_NON_ZERO, "Z", "isDirty", OperatorName.NON_STROKING_GRAY, "isInverseDirty", OperatorName.CLOSE_PATH, "isInverseValid", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.LayerMatrixCache */
/* loaded from: classes2.dex */
public final class LayerMatrixCache<T> {

    /* renamed from: a */
    public final Function2 f30787a;

    /* renamed from: b */
    public Matrix f30788b;

    /* renamed from: c */
    public Matrix f30789c;

    /* renamed from: d */
    public float[] f30790d;

    /* renamed from: e */
    public float[] f30791e;

    /* renamed from: f */
    public boolean f30792f;

    /* renamed from: g */
    public boolean f30793g;

    /* renamed from: h */
    public boolean f30794h;

    public LayerMatrixCache(@NotNull Function2<? super T, ? super Matrix, Unit> getMatrix) {
        Intrinsics.checkNotNullParameter(getMatrix, "getMatrix");
        this.f30787a = getMatrix;
        this.f30792f = true;
        this.f30793g = true;
        this.f30794h = true;
    }

    @Nullable
    /* renamed from: calculateInverseMatrix-bWbORWo  reason: not valid java name */
    public final float[] m73228calculateInverseMatrixbWbORWo(T t) {
        float[] fArr = this.f30791e;
        if (fArr == null) {
            fArr = androidx.compose.p003ui.graphics.Matrix.m72111constructorimpl$default(null, 1, null);
            this.f30791e = fArr;
        }
        if (this.f30793g) {
            this.f30794h = InvertMatrixKt.m73226invertToJiSxe2E(m73229calculateMatrixGrdbGEg(t), fArr);
            this.f30793g = false;
        }
        if (!this.f30794h) {
            return null;
        }
        return fArr;
    }

    @NotNull
    /* renamed from: calculateMatrix-GrdbGEg  reason: not valid java name */
    public final float[] m73229calculateMatrixGrdbGEg(T t) {
        float[] fArr = this.f30790d;
        if (fArr == null) {
            fArr = androidx.compose.p003ui.graphics.Matrix.m72111constructorimpl$default(null, 1, null);
            this.f30790d = fArr;
        }
        if (!this.f30792f) {
            return fArr;
        }
        Matrix matrix = this.f30788b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f30788b = matrix;
        }
        this.f30787a.invoke(t, matrix);
        Matrix matrix2 = this.f30789c;
        if (matrix2 == null || !Intrinsics.areEqual(matrix, matrix2)) {
            AndroidMatrixConversions_androidKt.m71799setFromtUYjHk(fArr, matrix);
            this.f30788b = matrix2;
            this.f30789c = matrix;
        }
        this.f30792f = false;
        return fArr;
    }

    public final void invalidate() {
        this.f30792f = true;
        this.f30793g = true;
    }
}