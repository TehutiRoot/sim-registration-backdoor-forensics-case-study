package io.fotoapparat.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m29142d2 = {"Lio/fotoapparat/view/FeedbackCircleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "", "showAt$fotoapparat_release", "(FF)V", "showAt", "id", "Landroid/view/View;", TypedValues.AttributesType.S_TARGET, "Landroid/animation/Animator;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "(ILandroid/view/View;)Landroid/animation/Animator;", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "inner", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "outer", "Landroid/animation/AnimatorSet;", OperatorName.CURVE_TO, "Landroid/animation/AnimatorSet;", "animatorSet", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class FeedbackCircleView extends FrameLayout {

    /* renamed from: a */
    public final ImageView f63113a;

    /* renamed from: b */
    public final ImageView f63114b;

    /* renamed from: c */
    public final AnimatorSet f63115c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedbackCircleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final Animator m30805a(int i, View view) {
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), i);
        loadAnimator.setTarget(view);
        return loadAnimator;
    }

    public final void showAt$fotoapparat_release(float f, float f2) {
        setTranslationX(f);
        setTranslationY(f2);
        this.f63115c.cancel();
        this.f63115c.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedbackCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FeedbackCircleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedbackCircleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context, attributeSet, i);
        imageView.setImageResource(R.drawable.focus_inner);
        context.getResources();
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setAlpha(0.0f);
        this.f63113a = imageView;
        ImageView imageView2 = new ImageView(context, attributeSet, i);
        imageView2.setImageResource(R.drawable.focus_outer);
        context.getResources();
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView2.setAlpha(0.0f);
        this.f63114b = imageView2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m30805a(R.animator.focus_outer, imageView2), m30805a(R.animator.focus_inner, imageView));
        this.f63115c = animatorSet;
        Resources resources = context.getResources();
        setLayoutParams(new ViewGroup.LayoutParams(resources.getDimensionPixelSize(R.dimen.focus_diameter), resources.getDimensionPixelSize(R.dimen.focus_diameter)));
        setClipToPadding(false);
        setClipChildren(false);
        addView(imageView2);
        addView(imageView);
    }
}