package th.p047co.dtac.android.dtacone.app_one.extension;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/extension/DividerItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/drawable/Drawable;", "divider", "", "viewType", "", "isSpecificViewType", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/graphics/drawable/Drawable;IZLandroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/drawable/Drawable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", OperatorName.CURVE_TO, "Z", "d", "Landroid/content/Context;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.extension.DividerItemDecorator */
/* loaded from: classes7.dex */
public final class DividerItemDecorator extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Drawable f81672a;

    /* renamed from: b */
    public final int f81673b;

    /* renamed from: c */
    public final boolean f81674c;

    /* renamed from: d */
    public final Context f81675d;

    public /* synthetic */ DividerItemDecorator(Drawable drawable, int i, boolean z, Context context, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Drawable drawable;
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
                    adapter.getItemViewType(childAdapterPosition);
                }
                if (this.f81674c) {
                    drawable = this.f81672a;
                } else if (childAdapterPosition == 0) {
                    drawable = ContextCompat.getDrawable(this.f81675d, R.drawable.one_divider_item);
                } else {
                    drawable = ContextCompat.getDrawable(this.f81675d, R.drawable.one_custom_divider_item);
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                if (drawable != null) {
                    i = drawable.getIntrinsicHeight();
                } else {
                    i = 0;
                }
                int i3 = i + bottom;
                if (drawable != null) {
                    drawable.setBounds(paddingLeft, bottom, width, i3);
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                if (i2 != childCount) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public DividerItemDecorator(@Nullable Drawable drawable, int i, boolean z, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81672a = drawable;
        this.f81673b = i;
        this.f81674c = z;
        this.f81675d = context;
    }
}