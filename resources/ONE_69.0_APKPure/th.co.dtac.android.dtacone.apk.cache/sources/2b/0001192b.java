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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/decorator/DynamicSpecificVerticalItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "paddingFirst", "paddingLast", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "<init>", "(Landroid/content/Context;IIIIII)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "mPaddingFirst", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "mPaddingLast", OperatorName.CURVE_TO, "mPaddingLeft", "d", "mPaddingRight", "e", "mPaddingTop", OperatorName.FILL_NON_ZERO, "mPaddingBottom", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.decorator.DynamicSpecificVerticalItemDecorator */
/* loaded from: classes7.dex */
public final class DynamicSpecificVerticalItemDecorator extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;

    /* renamed from: a */
    public int f84829a;

    /* renamed from: b */
    public int f84830b;

    /* renamed from: c */
    public int f84831c;

    /* renamed from: d */
    public int f84832d;

    /* renamed from: e */
    public int f84833e;

    /* renamed from: f */
    public int f84834f;

    public DynamicSpecificVerticalItemDecorator(@NotNull Context context, int i, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f84829a = (int) TypedValue.applyDimension(1, i, displayMetrics);
        this.f84830b = (int) TypedValue.applyDimension(1, i2, displayMetrics);
        this.f84831c = (int) TypedValue.applyDimension(1, i3, displayMetrics);
        this.f84832d = (int) TypedValue.applyDimension(1, i4, displayMetrics);
        this.f84833e = (int) TypedValue.applyDimension(1, i5, displayMetrics);
        this.f84834f = (int) TypedValue.applyDimension(1, i6, displayMetrics);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (childAdapterPosition == 0) {
            outRect.top = this.f84829a;
        } else {
            outRect.top = this.f84833e;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter != null && childAdapterPosition == adapter.getItemCount() - 1) {
            outRect.bottom = this.f84830b;
        } else {
            outRect.bottom = this.f84834f;
        }
        outRect.left = this.f84831c;
        outRect.right = this.f84832d;
    }
}