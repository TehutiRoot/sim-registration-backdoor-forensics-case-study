package th.p047co.dtac.android.dtacone.animation;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/animation/ProgressBarAnimation;", "Landroid/view/animation/Animation;", "Landroid/widget/ProgressBar;", "progressBar", "", "from", TypedValues.TransitionType.S_TO, "<init>", "(Landroid/widget/ProgressBar;FF)V", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/widget/ProgressBar;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", OperatorName.CURVE_TO, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.animation.ProgressBarAnimation */
/* loaded from: classes7.dex */
public final class ProgressBarAnimation extends Animation {
    public static final int $stable = 8;

    /* renamed from: a */
    public final ProgressBar f81663a;

    /* renamed from: b */
    public final float f81664b;

    /* renamed from: c */
    public final float f81665c;

    public ProgressBarAnimation(@NotNull ProgressBar progressBar, float f, float f2) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f81663a = progressBar;
        this.f81664b = f;
        this.f81665c = f2;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, @NotNull Transformation t) {
        Intrinsics.checkNotNullParameter(t, "t");
        super.applyTransformation(f, t);
        float f2 = this.f81664b;
        this.f81663a.setProgress((int) (f2 + ((this.f81665c - f2) * f)));
    }
}