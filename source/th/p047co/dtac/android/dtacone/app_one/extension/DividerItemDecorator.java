package th.p047co.dtac.android.dtacone.app_one.extension;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/extension/DividerItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/drawable/Drawable;", "divider", "", "viewType", "", "isSpecificViewType", "<init>", "(Landroid/graphics/drawable/Drawable;IZ)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/drawable/Drawable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", OperatorName.CURVE_TO, "Z", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.extension.DividerItemDecorator */
/* loaded from: classes7.dex */
public final class DividerItemDecorator extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Drawable f81581a;

    /* renamed from: b */
    public final int f81582b;

    /* renamed from: c */
    public final boolean f81583c;

    public /* synthetic */ DividerItemDecorator(Drawable drawable, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Integer num;
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount() - 2;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = parent.getChildAt(i2);
                Intrinsics.checkNotNullExpressionValue(childAt, "parent.getChildAt(i)");
                int childAdapterPosition = parent.getChildAdapterPosition(childAt);
                RecyclerView.Adapter adapter = parent.getAdapter();
                if (adapter != null) {
                    num = Integer.valueOf(adapter.getItemViewType(childAdapterPosition));
                } else {
                    num = null;
                }
                if (this.f81583c) {
                    int i3 = this.f81582b;
                    if (num != null && num.intValue() == i3) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                        Drawable drawable = this.f81581a;
                        if (drawable != null) {
                            i = drawable.getIntrinsicHeight();
                        } else {
                            i = 0;
                        }
                        int i4 = i + bottom;
                        Drawable drawable2 = this.f81581a;
                        if (drawable2 != null) {
                            drawable2.setBounds(paddingLeft, bottom, width, i4);
                        }
                        Drawable drawable3 = this.f81581a;
                        if (drawable3 != null) {
                            drawable3.draw(canvas);
                        }
                    }
                }
                if (i2 != childCount) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public DividerItemDecorator(@Nullable Drawable drawable, int i, boolean z) {
        this.f81581a = drawable;
        this.f81582b = i;
        this.f81583c = z;
    }
}
