package th.p047co.dtac.android.dtacone.decorator;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/decorator/DynamicVerticalGridItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "spanCount", "paddingFirstAndLastOfRow", "paddingLeftAndRight", "paddingTopAndBottom", "<init>", "(Landroid/content/Context;IIII)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "mPaddingTopAndBottom", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "mPaddingLeftAndRight", OperatorName.CURVE_TO, "mPaddingFirstAndLastOfRow", "d", "mSpanCount", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.decorator.DynamicVerticalGridItemDecorator */
/* loaded from: classes7.dex */
public final class DynamicVerticalGridItemDecorator extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;

    /* renamed from: a */
    public int f84725a;

    /* renamed from: b */
    public int f84726b;

    /* renamed from: c */
    public int f84727c;

    /* renamed from: d */
    public int f84728d;

    public DynamicVerticalGridItemDecorator(@NotNull Context context, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f84725a = (int) TypedValue.applyDimension(1, i4, displayMetrics);
        this.f84726b = (int) TypedValue.applyDimension(1, i3, displayMetrics);
        this.f84727c = (int) TypedValue.applyDimension(1, i2, displayMetrics);
        this.f84728d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int i2 = this.f84728d;
        if (childAdapterPosition % i2 == 0) {
            outRect.left = this.f84727c;
            outRect.right = this.f84726b;
        } else if (childAdapterPosition % i2 == i2 - 1) {
            outRect.left = this.f84726b;
            outRect.right = this.f84727c;
        } else {
            int i3 = this.f84726b;
            outRect.left = i3;
            outRect.right = i3;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        int i4 = this.f84728d;
        int i5 = (i - 1) / i4;
        if (adapter != null && childAdapterPosition / i4 == i5) {
            outRect.bottom = this.f84725a;
        }
        outRect.top = this.f84725a;
    }
}
