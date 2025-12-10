package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import co.omise.android.C5500R;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Z72 */
/* loaded from: classes3.dex */
public final class Z72 extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final Context f8100a;

    /* renamed from: b */
    public final Drawable f8101b;

    public Z72(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8100a = context;
        this.f8101b = AppCompatResources.getDrawable(context, C5500R.C5502drawable.item_decoration);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        Drawable drawable = this.f8101b;
        if (drawable == null || parent.getChildAdapterPosition(view) == -1) {
            return;
        }
        outRect.bottom = drawable.getIntrinsicHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Drawable drawable = this.f8101b;
        if (drawable == null) {
            return;
        }
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            if (parent.getChildAdapterPosition(childAt) != -1) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int left = ((TextView) childAt.findViewById(C5500R.C5503id.text_item_title)).getLeft();
                int width = parent.getWidth();
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                drawable.setBounds(left, bottom, width, drawable.getIntrinsicHeight() + bottom);
                drawable.draw(c);
            }
        }
    }
}