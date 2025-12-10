package th.p047co.dtac.android.dtacone.widget.indicator;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001SB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001f¢\u0006\u0004\b$\u0010\"J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0000¢\u0006\u0004\b)\u0010\u0018J/\u0010-\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.JG\u00103\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00192\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00105R\u0016\u00108\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00107R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00109R\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010=\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00107R\u0014\u0010B\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00109R\u0016\u0010F\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u0010H\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010AR\u0016\u0010J\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010AR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006T"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Lcom/yarolegovich/discretescrollview/DiscreteScrollView;", "discreteScrollView", "<init>", "(Lcom/yarolegovich/discretescrollview/DiscreteScrollView;)V", "Builder", "(Lcom/yarolegovich/discretescrollview/DiscreteScrollView;)Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator;", "Landroid/graphics/Canvas;", OperatorName.CURVE_TO, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", Promotion.ACTION_VIEW, "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "appendToBottom", "()Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator;", "", "colorActive", "setColorActive", "(I)Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator;", "colorInactive", "setColorInactive", "", "indicatorStrokeWidth", "setIndicatorStrokeWidth", "(F)Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator;", "indicatorItemPadding", "setIndicatorItemPadding", "Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator$Alignment;", "alignment", "align", "(Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator$Alignment;)Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator;", "matchParentWidth", "indicatorStartX", "indicatorPosY", "itemCount", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/graphics/Canvas;FFI)V", "highlightPosition", "progress", "", "reverseScrolling", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/graphics/Canvas;FFIFIZ)V", "Lcom/yarolegovich/discretescrollview/DiscreteScrollView;", "mDiscreteScrollView", "Z", "mAppendToBottom", "I", "d", "e", "Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator$Alignment;", "mAlignment", OperatorName.FILL_NON_ZERO, "mMatchParentWidth", OperatorName.NON_STROKING_GRAY, "F", OperatorName.MARKED_CONTENT_POINT_WITH_PROPS, OperatorName.CLOSE_PATH, "mIndicatorHeight", "i", "mIndicatorStrokeWidth", OperatorName.SET_LINE_JOINSTYLE, "mIndicatorItemLength", OperatorName.NON_STROKING_CMYK, "mIndicatorItemPadding", "Landroid/view/animation/AccelerateDecelerateInterpolator;", OperatorName.LINE_TO, "Landroid/view/animation/AccelerateDecelerateInterpolator;", "mInterpolator", "Landroid/graphics/Paint;", OperatorName.MOVE_TO, "Landroid/graphics/Paint;", "mPaint", "Alignment", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.indicator.IntroductionDiscreteScrollViewIndicator */
/* loaded from: classes9.dex */
public final class IntroductionDiscreteScrollViewIndicator extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;

    /* renamed from: a */
    public DiscreteScrollView f107396a;

    /* renamed from: b */
    public boolean f107397b;

    /* renamed from: c */
    public int f107398c;

    /* renamed from: d */
    public int f107399d;

    /* renamed from: e */
    public Alignment f107400e;

    /* renamed from: f */
    public boolean f107401f;

    /* renamed from: g */
    public final float f107402g;

    /* renamed from: h */
    public final int f107403h;

    /* renamed from: i */
    public float f107404i;

    /* renamed from: j */
    public float f107405j;

    /* renamed from: k */
    public float f107406k;

    /* renamed from: l */
    public final AccelerateDecelerateInterpolator f107407l;

    /* renamed from: m */
    public final Paint f107408m;

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/indicator/IntroductionDiscreteScrollViewIndicator$Alignment;", "", "(Ljava/lang/String;I)V", "PARENT_TOP", "PARENT_BOTTOM", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.indicator.IntroductionDiscreteScrollViewIndicator$Alignment */
    /* loaded from: classes9.dex */
    public enum Alignment {
        PARENT_TOP,
        PARENT_BOTTOM
    }

    public IntroductionDiscreteScrollViewIndicator(@NotNull DiscreteScrollView discreteScrollView) {
        Intrinsics.checkNotNullParameter(discreteScrollView, "discreteScrollView");
        this.f107396a = discreteScrollView;
        this.f107398c = -1;
        this.f107399d = 1728053247;
        this.f107400e = Alignment.PARENT_BOTTOM;
        float f = Resources.getSystem().getDisplayMetrics().density;
        this.f107402g = f;
        float f2 = 32;
        this.f107403h = (int) (f * f2);
        this.f107404i = 4 * f;
        this.f107405j = f2 * f;
        this.f107406k = f * 0;
        this.f107407l = new AccelerateDecelerateInterpolator();
        Paint paint = new Paint();
        this.f107408m = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.f107404i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
    }

    @NotNull
    public final IntroductionDiscreteScrollViewIndicator Builder(@NotNull DiscreteScrollView discreteScrollView) {
        Intrinsics.checkNotNullParameter(discreteScrollView, "discreteScrollView");
        return new IntroductionDiscreteScrollViewIndicator(discreteScrollView);
    }

    /* renamed from: a */
    public final void m1456a(Canvas canvas, float f, float f2, int i, float f3, int i2, boolean z) {
        this.f107408m.setColor(this.f107398c);
        float f4 = this.f107405j;
        float f5 = this.f107406k;
        float f6 = f4 + f5;
        float f7 = f + (i * f6);
        if (f3 == 0.0f) {
            canvas.drawLine(f7, f2, f7 + f4, f2, this.f107408m);
            return;
        }
        float f8 = f4 * f3;
        if (z) {
            canvas.drawLine((f7 - f5) - f8, f2, f7 - f5, f2, this.f107408m);
            canvas.drawLine(f7, f2, (this.f107405j + f7) - f8, f2, this.f107408m);
            return;
        }
        canvas.drawLine(f7 + f8, f2, f7 + f4, f2, this.f107408m);
        if (i < i2 - 1) {
            float f9 = f7 + f6;
            canvas.drawLine(f9, f2, f9 + f8, f2, this.f107408m);
        }
    }

    @NotNull
    public final IntroductionDiscreteScrollViewIndicator align(@NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f107400e = alignment;
        return this;
    }

    @NotNull
    public final IntroductionDiscreteScrollViewIndicator appendToBottom() {
        this.f107397b = true;
        return this;
    }

    /* renamed from: b */
    public final void m1455b(Canvas canvas, float f, float f2, int i) {
        this.f107408m.setColor(this.f107399d);
        canvas.drawLine(f, f2, f + (this.f107405j * i), f2, this.f107408m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull @NotNull Rect outRect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView parent, @NonNull @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        if (this.f107397b) {
            outRect.bottom = this.f107403h;
        }
    }

    @NotNull
    public final IntroductionDiscreteScrollViewIndicator matchParentWidth() {
        this.f107401f = true;
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NonNull @NotNull Canvas c, @NonNull @NotNull RecyclerView parent, @NonNull @NotNull RecyclerView.State state) {
        int currentItem;
        float f;
        boolean z;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c, parent, state);
        if (parent.getAdapter() == null || (currentItem = this.f107396a.getCurrentItem()) == -1) {
            return;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.checkNotNull(adapter);
        int itemCount = adapter.getItemCount();
        if (itemCount == 0) {
            return;
        }
        float max = Math.max(0, itemCount - 1) * this.f107406k;
        if (this.f107401f) {
            this.f107405j = ((this.f107396a.getWidth() - max) - (2 * this.f107406k)) / itemCount;
        }
        float width = (parent.getWidth() - ((this.f107405j * itemCount) + max)) / 2.0f;
        if (this.f107400e == Alignment.PARENT_BOTTOM) {
            f = parent.getHeight() - (this.f107403h / 2.0f);
        } else {
            f = this.f107403h / 2.0f;
        }
        m1455b(c, width, f, itemCount);
        RecyclerView.ViewHolder viewHolder = this.f107396a.getViewHolder(currentItem);
        if (viewHolder == null) {
            return;
        }
        View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
        int left = view.getLeft();
        int width2 = view.getWidth();
        if (left > 0) {
            z = true;
        } else {
            z = false;
        }
        m1456a(c, width, f, currentItem, this.f107407l.getInterpolation((left * (-1)) / width2), itemCount, z);
    }

    @NotNull
    public final IntroductionDiscreteScrollViewIndicator setColorActive(int i) {
        this.f107398c = i;
        return this;
    }

    @NotNull
    public final IntroductionDiscreteScrollViewIndicator setColorInactive(int i) {
        this.f107399d = i;
        return this;
    }

    @NotNull
    public final IntroductionDiscreteScrollViewIndicator setIndicatorItemPadding(float f) {
        this.f107406k = f;
        return this;
    }

    @NotNull
    public final IntroductionDiscreteScrollViewIndicator setIndicatorStrokeWidth(float f) {
        this.f107404i = f;
        this.f107408m.setStrokeWidth(f);
        return this;
    }
}