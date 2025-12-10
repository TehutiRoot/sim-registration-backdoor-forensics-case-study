package th.p047co.dtac.android.dtacone.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/animation/ExpandAnimation;", "Landroid/view/animation/Animation;", "Landroid/view/View;", "mView", "", "mFromHeight", "mToHeight", "<init>", "(Landroid/view/View;II)V", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "transformation", "", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "", "willChangeBounds", "()Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", OperatorName.CURVE_TO, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.animation.ExpandAnimation */
/* loaded from: classes7.dex */
public final class ExpandAnimation extends Animation {
    public static final int $stable = 8;

    /* renamed from: a */
    public View f81660a;

    /* renamed from: b */
    public int f81661b;

    /* renamed from: c */
    public int f81662c;

    public ExpandAnimation(@NotNull View mView, int i, int i2) {
        Intrinsics.checkNotNullParameter(mView, "mView");
        this.f81660a = mView;
        this.f81661b = i;
        this.f81662c = i2;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, @NotNull Transformation transformation) {
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        int height = this.f81660a.getHeight();
        int i = this.f81662c;
        if (height != i) {
            int i2 = this.f81661b;
            this.f81660a.getLayoutParams().height = (int) (i2 + ((i - i2) * f));
            this.f81660a.requestLayout();
        }
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}