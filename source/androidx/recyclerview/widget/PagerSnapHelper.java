package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class PagerSnapHelper extends SnapHelper {

    /* renamed from: d */
    public OrientationHelper f36813d;

    /* renamed from: e */
    public OrientationHelper f36814e;

    /* renamed from: androidx.recyclerview.widget.PagerSnapHelper$a */
    /* loaded from: classes2.dex */
    public class C4912a extends LinearSmoothScroller {
        public C4912a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
            int[] calculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.f37006a.getLayoutManager(), view);
            int i = calculateDistanceToFinalSnap[0];
            int i2 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                action.update(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* renamed from: e */
    private int m53503e(View view, OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
    }

    /* renamed from: f */
    private View m53502f(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: g */
    private OrientationHelper m53501g(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f36814e;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.f36814e = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.f36814e;
    }

    /* renamed from: i */
    private OrientationHelper m53499i(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.f36813d;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.f36813d = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.f36813d;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = m53503e(view, m53501g(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = m53503e(view, m53499i(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return null;
        }
        return new C4912a(this.f37006a.getContext());
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    @SuppressLint({"UnknownNullness"})
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return m53502f(layoutManager, m53499i(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return m53502f(layoutManager, m53501g(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        OrientationHelper m53500h;
        int i3;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (m53500h = m53500h(layoutManager)) == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        View view2 = null;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = layoutManager.getChildAt(i6);
            if (childAt != null) {
                int m53503e = m53503e(childAt, m53500h);
                if (m53503e <= 0 && m53503e > i4) {
                    view2 = childAt;
                    i4 = m53503e;
                }
                if (m53503e >= 0 && m53503e < i5) {
                    view = childAt;
                    i5 = m53503e;
                }
            }
        }
        boolean m53498j = m53498j(layoutManager, i, i2);
        if (m53498j && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!m53498j && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (m53498j) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        if (m53497k(layoutManager) == m53498j) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = position + i3;
        if (i7 < 0 || i7 >= itemCount) {
            return -1;
        }
        return i7;
    }

    /* renamed from: h */
    public final OrientationHelper m53500h(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return m53499i(layoutManager);
        }
        if (layoutManager.canScrollHorizontally()) {
            return m53501g(layoutManager);
        }
        return null;
    }

    /* renamed from: j */
    public final boolean m53498j(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        if (layoutManager.canScrollHorizontally()) {
            if (i <= 0) {
                return false;
            }
            return true;
        } else if (i2 <= 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: k */
    public final boolean m53497k(RecyclerView.LayoutManager layoutManager) {
        PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (computeScrollVectorForPosition.x >= 0.0f && computeScrollVectorForPosition.y >= 0.0f) {
            return false;
        }
        return true;
    }
}
