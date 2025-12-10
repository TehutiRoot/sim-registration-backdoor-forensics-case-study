package th.p047co.dtac.android.dtacone.decorator.home;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BB\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%J!\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010'J\u001f\u0010)\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010.R/\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/R$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000201\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00102¨\u00063"}, m29142d2 = {"Lth/co/dtac/android/dtacone/decorator/home/HeaderItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "bottomSpaceForCampaign", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "itemPosition", "", "isHeader", "<init>", "(Landroid/content/Context;ILandroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroidx/recyclerview/widget/RecyclerView$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Landroid/graphics/Canvas;", OperatorName.CURVE_TO, "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "e", "(ILandroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;", "header", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/graphics/Canvas;Landroid/view/View;)V", "currentHeader", "nextHeader", OperatorName.FILL_NON_ZERO, "(Landroid/graphics/Canvas;Landroid/view/View;Landroid/view/View;)V", "contactPoint", "(Landroidx/recyclerview/widget/RecyclerView;I)Landroid/view/View;", "Landroid/view/ViewGroup;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/view/ViewGroup;Landroid/view/View;)V", "d", "(I)I", "Landroid/content/Context;", "I", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Pair;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlin/Pair;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeaderItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderItemDecoration.kt\nth/co/dtac/android/dtacone/decorator/home/HeaderItemDecoration\n+ 2 HeaderItemDecoration.kt\nth/co/dtac/android/dtacone/decorator/home/HeaderItemDecorationKt\n*L\n1#1,165:1\n164#2,2:166\n*S KotlinDebug\n*F\n+ 1 HeaderItemDecoration.kt\nth/co/dtac/android/dtacone/decorator/home/HeaderItemDecoration\n*L\n30#1:166,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.decorator.home.HeaderItemDecoration */
/* loaded from: classes7.dex */
public final class HeaderItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f84842a;

    /* renamed from: b */
    public final int f84843b;

    /* renamed from: c */
    public final Function1 f84844c;

    /* renamed from: d */
    public Pair f84845d;

    public HeaderItemDecoration(@NotNull Context context, int i, @NotNull RecyclerView parent, @NotNull Function1<? super Integer, Boolean> isHeader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(isHeader, "isHeader");
        this.f84842a = context;
        this.f84843b = i;
        this.f84844c = isHeader;
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: th.co.dtac.android.dtacone.decorator.home.HeaderItemDecoration.1
                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    HeaderItemDecoration.this.f84845d = null;
                }
            });
        }
        parent.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: th.co.dtac.android.dtacone.decorator.home.HeaderItemDecoration$special$$inlined$doOnEachNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Intrinsics.checkNotNullExpressionValue(view, "view");
                HeaderItemDecoration.this.f84845d = null;
            }
        });
        parent.addOnItemTouchListener(new RecyclerView.SimpleOnItemTouchListener() { // from class: th.co.dtac.android.dtacone.decorator.home.HeaderItemDecoration.3
            @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public boolean onInterceptTouchEvent(@NotNull RecyclerView recyclerView, @NotNull MotionEvent motionEvent) {
                int i2;
                RecyclerView.ViewHolder viewHolder;
                View view;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                float y = motionEvent.getY();
                Pair pair = HeaderItemDecoration.this.f84845d;
                if (pair != null && (viewHolder = (RecyclerView.ViewHolder) pair.getSecond()) != null && (view = viewHolder.itemView) != null) {
                    i2 = view.getBottom();
                } else {
                    i2 = 0;
                }
                if (y > i2) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public final void m19692a(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        view.draw(canvas);
        canvas.restore();
    }

    /* renamed from: b */
    public final void m19691b(ViewGroup viewGroup, View view) {
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), viewGroup.getPaddingLeft() + viewGroup.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0), viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* renamed from: c */
    public final View m19690c(RecyclerView recyclerView, int i) {
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            Rect rect = new Rect();
            recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
            if (rect.bottom > i && rect.top <= i) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final int m19689d(int i) {
        while (!((Boolean) this.f84844c.invoke(Integer.valueOf(i))).booleanValue()) {
            i--;
            if (i < 0) {
                return 0;
            }
        }
        return i;
    }

    /* renamed from: e */
    public final View m19688e(int i, RecyclerView recyclerView) {
        RecyclerView.ViewHolder viewHolder;
        Pair pair;
        RecyclerView.ViewHolder viewHolder2;
        RecyclerView.ViewHolder viewHolder3;
        if (recyclerView.getAdapter() == null) {
            return null;
        }
        int m19689d = m19689d(i);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return null;
        }
        int itemViewType = adapter.getItemViewType(m19689d);
        Pair pair2 = this.f84845d;
        if (pair2 != null && ((Number) pair2.getFirst()).intValue() == m19689d && (pair = this.f84845d) != null && (viewHolder2 = (RecyclerView.ViewHolder) pair.getSecond()) != null && viewHolder2.getItemViewType() == itemViewType) {
            Pair pair3 = this.f84845d;
            if (pair3 == null || (viewHolder3 = (RecyclerView.ViewHolder) pair3.getSecond()) == null) {
                return null;
            }
            return viewHolder3.itemView;
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            viewHolder = adapter2.createViewHolder(recyclerView, itemViewType);
        } else {
            viewHolder = null;
        }
        if (viewHolder != null) {
            RecyclerView.Adapter adapter3 = recyclerView.getAdapter();
            if (adapter3 != null) {
                adapter3.onBindViewHolder(viewHolder, m19689d);
            }
            View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "headerHolder.itemView");
            m19691b(recyclerView, view);
            this.f84845d = TuplesKt.m29136to(Integer.valueOf(m19689d), viewHolder);
        }
        if (viewHolder == null) {
            return null;
        }
        return viewHolder.itemView;
    }

    /* renamed from: f */
    public final void m19687f(Canvas canvas, View view, View view2) {
        canvas.save();
        canvas.translate(0.0f, view2.getTop() - view.getHeight());
        view.draw(canvas);
        canvas.restore();
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
        DisplayMetrics displayMetrics = this.f84842a.getResources().getDisplayMetrics();
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter != null && childAdapterPosition == adapter.getItemCount() - 1) {
            outRect.bottom = (int) TypedValue.applyDimension(1, this.f84843b, displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas c, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        int childAdapterPosition;
        View m19688e;
        View m19690c;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c, parent, state);
        View childAt = parent.getChildAt(0);
        if (childAt == null || (childAdapterPosition = parent.getChildAdapterPosition(childAt)) == -1 || (m19688e = m19688e(childAdapterPosition, parent)) == null || (m19690c = m19690c(parent, m19688e.getBottom())) == null) {
            return;
        }
        if (((Boolean) this.f84844c.invoke(Integer.valueOf(parent.getChildAdapterPosition(m19690c)))).booleanValue()) {
            m19687f(c, m19688e, m19690c);
        } else {
            m19692a(c, m19688e);
        }
    }
}