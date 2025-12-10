package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.R;
import androidx.viewpager2.adapter.StatefulAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;

    /* renamed from: u */
    public static boolean f38112u = true;

    /* renamed from: a */
    public final Rect f38113a;

    /* renamed from: b */
    public final Rect f38114b;

    /* renamed from: c */
    public C5214a f38115c;

    /* renamed from: d */
    public int f38116d;

    /* renamed from: e */
    public boolean f38117e;

    /* renamed from: f */
    public RecyclerView.AdapterDataObserver f38118f;

    /* renamed from: g */
    public LinearLayoutManager f38119g;

    /* renamed from: h */
    public int f38120h;

    /* renamed from: i */
    public Parcelable f38121i;

    /* renamed from: j */
    public RecyclerView f38122j;

    /* renamed from: k */
    public PagerSnapHelper f38123k;

    /* renamed from: l */
    public C5216c f38124l;

    /* renamed from: m */
    public C5214a f38125m;

    /* renamed from: n */
    public C1684XV f38126n;

    /* renamed from: o */
    public C5215b f38127o;

    /* renamed from: p */
    public RecyclerView.ItemAnimator f38128p;

    /* renamed from: q */
    public boolean f38129q;

    /* renamed from: r */
    public boolean f38130r;

    /* renamed from: s */
    public int f38131s;

    /* renamed from: t */
    public AbstractC5201e f38132t;

    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface OffscreenPageLimit {
    }

    /* loaded from: classes2.dex */
    public static abstract class OnPageChangeCallback {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, @InterfaceC2055Px int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Orientation {
    }

    /* loaded from: classes2.dex */
    public interface PageTransformer {
        void transformPage(@NonNull View view, float f);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface ScrollState {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    /* loaded from: classes2.dex */
    public class C5197a extends AbstractC5203g {
        public C5197a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5203g, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f38117e = true;
            viewPager2.f38124l.m52369l();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    /* loaded from: classes2.dex */
    public class C5198b extends OnPageChangeCallback {
        public C5198b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                ViewPager2.this.m52416j();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f38116d != i) {
                viewPager2.f38116d = i;
                viewPager2.f38132t.mo52398r();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    /* loaded from: classes2.dex */
    public class C5199c extends OnPageChangeCallback {
        public C5199c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f38122j.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    /* loaded from: classes2.dex */
    public class C5200d implements RecyclerView.OnChildAttachStateChangeListener {
        public C5200d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1 && ((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                return;
            }
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    /* loaded from: classes2.dex */
    public abstract class AbstractC5201e {
        public AbstractC5201e() {
        }

        /* renamed from: a */
        public boolean mo52410a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo52415b(int i) {
            return false;
        }

        /* renamed from: c */
        public boolean mo52409c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        public boolean mo52414d() {
            return false;
        }

        /* renamed from: e */
        public void mo52408e(RecyclerView.Adapter adapter) {
        }

        /* renamed from: f */
        public void mo52407f(RecyclerView.Adapter adapter) {
        }

        /* renamed from: g */
        public String mo52406g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        public void mo52405h(C5214a c5214a, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo52404i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        public void mo52413j(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* renamed from: k */
        public void mo52403k(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* renamed from: l */
        public boolean mo52412l(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        public boolean mo52402m(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: n */
        public void mo52401n() {
        }

        /* renamed from: o */
        public CharSequence mo52411o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: p */
        public void mo52400p(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: q */
        public void mo52399q() {
        }

        /* renamed from: r */
        public void mo52398r() {
        }

        /* renamed from: s */
        public void mo52397s() {
        }

        /* renamed from: t */
        public void mo52396t() {
        }

        public /* synthetic */ AbstractC5201e(ViewPager2 viewPager2, C5197a c5197a) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    /* loaded from: classes2.dex */
    public class C5202f extends AbstractC5201e {
        public C5202f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: b */
        public boolean mo52415b(int i) {
            if ((i == 8192 || i == 4096) && !ViewPager2.this.isUserInputEnabled()) {
                return true;
            }
            return false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: d */
        public boolean mo52414d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: j */
        public void mo52413j(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (!ViewPager2.this.isUserInputEnabled()) {
                accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfoCompat.setScrollable(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: l */
        public boolean mo52412l(int i) {
            if (mo52415b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: o */
        public CharSequence mo52411o() {
            if (mo52414d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5203g extends RecyclerView.AdapterDataObserver {
        public AbstractC5203g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ AbstractC5203g(C5197a c5197a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    /* loaded from: classes2.dex */
    public class C5204h extends LinearLayoutManager {
        public C5204h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            ViewPager2.this.f38132t.mo52413j(accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewPager2.this.f38132t.mo52403k(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
            if (ViewPager2.this.f38132t.mo52415b(i)) {
                return ViewPager2.this.f38132t.mo52412l(i);
            }
            return super.performAccessibilityAction(recycler, state, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    /* loaded from: classes2.dex */
    public class C5205i extends AbstractC5201e {

        /* renamed from: b */
        public final AccessibilityViewCommand f38140b;

        /* renamed from: c */
        public final AccessibilityViewCommand f38141c;

        /* renamed from: d */
        public RecyclerView.AdapterDataObserver f38142d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$i$a */
        /* loaded from: classes2.dex */
        public class C5206a implements AccessibilityViewCommand {
            public C5206a() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                C5205i.this.m52392x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$i$b */
        /* loaded from: classes2.dex */
        public class C5207b implements AccessibilityViewCommand {
            public C5207b() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                C5205i.this.m52392x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$i$c */
        /* loaded from: classes2.dex */
        public class C5208c extends AbstractC5203g {
            public C5208c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5203g, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                C5205i.this.m52391y();
            }
        }

        public C5205i() {
            super(ViewPager2.this, null);
            this.f38140b = new C5206a();
            this.f38141c = new C5207b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: a */
        public boolean mo52410a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: c */
        public boolean mo52409c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: e */
        public void mo52408e(RecyclerView.Adapter adapter) {
            m52391y();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f38142d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: f */
        public void mo52407f(RecyclerView.Adapter adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f38142d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: g */
        public String mo52406g() {
            if (mo52410a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: h */
        public void mo52405h(C5214a c5214a, RecyclerView recyclerView) {
            ViewCompat.setImportantForAccessibility(recyclerView, 2);
            this.f38142d = new C5208c();
            if (ViewCompat.getImportantForAccessibility(ViewPager2.this) == 0) {
                ViewCompat.setImportantForAccessibility(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: i */
        public void mo52404i(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            m52395u(wrap);
            m52393w(wrap);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: k */
        public void mo52403k(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            m52394v(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: m */
        public boolean mo52402m(int i, Bundle bundle) {
            int currentItem;
            if (mo52409c(i, bundle)) {
                if (i == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                m52392x(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: n */
        public void mo52401n() {
            m52391y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: p */
        public void mo52400p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo52406g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: q */
        public void mo52399q() {
            m52391y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: r */
        public void mo52398r() {
            m52391y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: s */
        public void mo52397s() {
            m52391y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC5201e
        /* renamed from: t */
        public void mo52396t() {
            m52391y();
        }

        /* renamed from: u */
        public final void m52395u(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() != null) {
                i2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    i2 = ViewPager2.this.getAdapter().getItemCount();
                    i = 1;
                } else {
                    i = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                i = 0;
                i2 = 0;
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(i2, i, false, 0));
        }

        /* renamed from: v */
        public final void m52394v(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i;
            int i2;
            if (ViewPager2.this.getOrientation() == 1) {
                i = ViewPager2.this.f38119g.getPosition(view);
            } else {
                i = 0;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                i2 = ViewPager2.this.f38119g.getPosition(view);
            } else {
                i2 = 0;
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i, 1, i2, 1, false, false));
        }

        /* renamed from: w */
        public final void m52393w(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.isUserInputEnabled()) {
                if (ViewPager2.this.f38116d > 0) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (ViewPager2.this.f38116d < itemCount - 1) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
                accessibilityNodeInfoCompat.setScrollable(true);
            }
        }

        /* renamed from: x */
        public void m52392x(int i) {
            if (ViewPager2.this.isUserInputEnabled()) {
                ViewPager2.this.m52420f(i, true);
            }
        }

        /* renamed from: y */
        public void m52391y() {
            int itemCount;
            int i;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = 16908360;
            ViewCompat.removeAccessibilityAction(viewPager2, 16908360);
            ViewCompat.removeAccessibilityAction(viewPager2, 16908361);
            ViewCompat.removeAccessibilityAction(viewPager2, 16908358);
            ViewCompat.removeAccessibilityAction(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.isUserInputEnabled()) {
                return;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                boolean m52423c = ViewPager2.this.m52423c();
                if (m52423c) {
                    i = 16908360;
                } else {
                    i = 16908361;
                }
                if (m52423c) {
                    i2 = 16908361;
                }
                if (ViewPager2.this.f38116d < itemCount - 1) {
                    ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i, null), null, this.f38140b);
                }
                if (ViewPager2.this.f38116d > 0) {
                    ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, null), null, this.f38141c);
                    return;
                }
                return;
            }
            if (ViewPager2.this.f38116d < itemCount - 1) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, null), null, this.f38140b);
            }
            if (ViewPager2.this.f38116d > 0) {
                ViewCompat.replaceAccessibilityAction(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, null), null, this.f38141c);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    /* loaded from: classes2.dex */
    public class C5209j extends PagerSnapHelper {
        public C5209j() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.isFakeDragging()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    /* loaded from: classes2.dex */
    public class C5210k extends RecyclerView {
        public C5210k(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f38132t.mo52414d()) {
                return ViewPager2.this.f38132t.mo52411o();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f38116d);
            accessibilityEvent.setToIndex(ViewPager2.this.f38116d);
            ViewPager2.this.f38132t.mo52400p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.isUserInputEnabled() && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    /* loaded from: classes2.dex */
    public static class RunnableC5213m implements Runnable {

        /* renamed from: a */
        public final int f38152a;

        /* renamed from: b */
        public final RecyclerView f38153b;

        public RunnableC5213m(int i, RecyclerView recyclerView) {
            this.f38152a = i;
            this.f38153b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38153b.smoothScrollToPosition(this.f38152a);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.f38113a = new Rect();
        this.f38114b = new Rect();
        this.f38115c = new C5214a(3);
        this.f38117e = false;
        this.f38118f = new C5197a();
        this.f38120h = -1;
        this.f38128p = null;
        this.f38129q = false;
        this.f38130r = true;
        this.f38131s = -1;
        m52424b(context, null);
    }

    /* renamed from: a */
    public final RecyclerView.OnChildAttachStateChangeListener m52425a() {
        return new C5200d();
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration) {
        this.f38122j.addItemDecoration(itemDecoration);
    }

    /* renamed from: b */
    public final void m52424b(Context context, AttributeSet attributeSet) {
        AbstractC5201e c5202f;
        if (f38112u) {
            c5202f = new C5205i();
        } else {
            c5202f = new C5202f();
        }
        this.f38132t = c5202f;
        C5210k c5210k = new C5210k(context);
        this.f38122j = c5210k;
        c5210k.setId(ViewCompat.generateViewId());
        this.f38122j.setDescendantFocusability(131072);
        C5204h c5204h = new C5204h(context);
        this.f38119g = c5204h;
        this.f38122j.setLayoutManager(c5204h);
        this.f38122j.setScrollingTouchSlop(1);
        m52419g(context, attributeSet);
        this.f38122j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f38122j.addOnChildAttachStateChangeListener(m52425a());
        C5216c c5216c = new C5216c(this);
        this.f38124l = c5216c;
        this.f38126n = new C1684XV(this, c5216c, this.f38122j);
        C5209j c5209j = new C5209j();
        this.f38123k = c5209j;
        c5209j.attachToRecyclerView(this.f38122j);
        this.f38122j.addOnScrollListener(this.f38124l);
        C5214a c5214a = new C5214a(3);
        this.f38125m = c5214a;
        this.f38124l.m52365p(c5214a);
        C5198b c5198b = new C5198b();
        C5199c c5199c = new C5199c();
        this.f38125m.m52385a(c5198b);
        this.f38125m.m52385a(c5199c);
        this.f38132t.mo52405h(this.f38125m, this.f38122j);
        this.f38125m.m52385a(this.f38115c);
        C5215b c5215b = new C5215b(this.f38119g);
        this.f38127o = c5215b;
        this.f38125m.m52385a(c5215b);
        RecyclerView recyclerView = this.f38122j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public boolean beginFakeDrag() {
        return this.f38126n.m65490b();
    }

    /* renamed from: c */
    public boolean m52423c() {
        if (this.f38119g.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f38122j.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f38122j.canScrollVertically(i);
    }

    /* renamed from: d */
    public final void m52422d(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f38118f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof C5211l) {
            int i = ((C5211l) parcelable).f38149a;
            sparseArray.put(this.f38122j.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m52421e();
    }

    /* renamed from: e */
    public final void m52421e() {
        RecyclerView.Adapter adapter;
        if (this.f38120h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f38121i;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).restoreState(parcelable);
            }
            this.f38121i = null;
        }
        int max = Math.max(0, Math.min(this.f38120h, adapter.getItemCount() - 1));
        this.f38116d = max;
        this.f38120h = -1;
        this.f38122j.scrollToPosition(max);
        this.f38132t.mo52401n();
    }

    public boolean endFakeDrag() {
        return this.f38126n.m65488d();
    }

    /* renamed from: f */
    public void m52420f(int i, boolean z) {
        int i2;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f38120h != -1) {
                this.f38120h = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.f38116d && this.f38124l.m52372i()) {
                return;
            }
            int i3 = this.f38116d;
            if (min == i3 && z) {
                return;
            }
            double d = i3;
            this.f38116d = min;
            this.f38132t.mo52398r();
            if (!this.f38124l.m52372i()) {
                d = this.f38124l.m52376e();
            }
            this.f38124l.m52367n(min, z);
            if (!z) {
                this.f38122j.scrollToPosition(min);
                return;
            }
            double d2 = min;
            if (Math.abs(d2 - d) > 3.0d) {
                RecyclerView recyclerView = this.f38122j;
                if (d2 > d) {
                    i2 = min - 3;
                } else {
                    i2 = min + 3;
                }
                recyclerView.scrollToPosition(i2);
                RecyclerView recyclerView2 = this.f38122j;
                recyclerView2.post(new RunnableC5213m(min, recyclerView2));
                return;
            }
            this.f38122j.smoothScrollToPosition(min);
        }
    }

    public boolean fakeDragBy(@InterfaceC2055Px @SuppressLint({"SupportAnnotationUsage"}) float f) {
        return this.f38126n.m65487e(f);
    }

    /* renamed from: g */
    public final void m52419g(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewPager2);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        if (this.f38132t.mo52410a()) {
            return this.f38132t.mo52406g();
        }
        return super.getAccessibilityClassName();
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.f38122j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f38116d;
    }

    @NonNull
    public RecyclerView.ItemDecoration getItemDecorationAt(int i) {
        return this.f38122j.getItemDecorationAt(i);
    }

    public int getItemDecorationCount() {
        return this.f38122j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f38131s;
    }

    public int getOrientation() {
        if (this.f38119g.getOrientation() == 1) {
            return 1;
        }
        return 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f38122j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f38124l.m52375f();
    }

    /* renamed from: h */
    public void m52418h() {
        View findSnapView = this.f38123k.findSnapView(this.f38119g);
        if (findSnapView == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = this.f38123k.calculateDistanceToFinalSnap(this.f38119g, findSnapView);
        int i = calculateDistanceToFinalSnap[0];
        if (i != 0 || calculateDistanceToFinalSnap[1] != 0) {
            this.f38122j.smoothScrollBy(i, calculateDistanceToFinalSnap[1]);
        }
    }

    /* renamed from: i */
    public final void m52417i(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f38118f);
        }
    }

    public void invalidateItemDecorations() {
        this.f38122j.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.f38126n.m65486f();
    }

    public boolean isUserInputEnabled() {
        return this.f38130r;
    }

    /* renamed from: j */
    public void m52416j() {
        PagerSnapHelper pagerSnapHelper = this.f38123k;
        if (pagerSnapHelper != null) {
            View findSnapView = pagerSnapHelper.findSnapView(this.f38119g);
            if (findSnapView == null) {
                return;
            }
            int position = this.f38119g.getPosition(findSnapView);
            if (position != this.f38116d && getScrollState() == 0) {
                this.f38125m.onPageSelected(position);
            }
            this.f38117e = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38132t.mo52404i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f38122j.getMeasuredWidth();
        int measuredHeight = this.f38122j.getMeasuredHeight();
        this.f38113a.left = getPaddingLeft();
        this.f38113a.right = (i3 - i) - getPaddingRight();
        this.f38113a.top = getPaddingTop();
        this.f38113a.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f38113a, this.f38114b);
        RecyclerView recyclerView = this.f38122j;
        Rect rect = this.f38114b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f38117e) {
            m52416j();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.f38122j, i, i2);
        int measuredWidth = this.f38122j.getMeasuredWidth();
        int measuredHeight = this.f38122j.getMeasuredHeight();
        int measuredState = this.f38122j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5211l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5211l c5211l = (C5211l) parcelable;
        super.onRestoreInstanceState(c5211l.getSuperState());
        this.f38120h = c5211l.f38150b;
        this.f38121i = c5211l.f38151c;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        C5211l c5211l = new C5211l(super.onSaveInstanceState());
        c5211l.f38149a = this.f38122j.getId();
        int i = this.f38120h;
        if (i == -1) {
            i = this.f38116d;
        }
        c5211l.f38150b = i;
        Parcelable parcelable = this.f38121i;
        if (parcelable != null) {
            c5211l.f38151c = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.f38122j.getAdapter();
            if (adapter instanceof StatefulAdapter) {
                c5211l.f38151c = ((StatefulAdapter) adapter).saveState();
            }
        }
        return c5211l;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    @RequiresApi(16)
    public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        if (this.f38132t.mo52409c(i, bundle)) {
            return this.f38132t.mo52402m(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void registerOnPageChangeCallback(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.f38115c.m52385a(onPageChangeCallback);
    }

    public void removeItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration) {
        this.f38122j.removeItemDecoration(itemDecoration);
    }

    public void removeItemDecorationAt(int i) {
        this.f38122j.removeItemDecorationAt(i);
    }

    public void requestTransform() {
        if (this.f38127o.m52382a() == null) {
            return;
        }
        double m52376e = this.f38124l.m52376e();
        int i = (int) m52376e;
        float f = (float) (m52376e - i);
        this.f38127o.onPageScrolled(i, f, Math.round(getPageSize() * f));
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f38122j.getAdapter();
        this.f38132t.mo52407f(adapter2);
        m52417i(adapter2);
        this.f38122j.setAdapter(adapter);
        this.f38116d = 0;
        m52421e();
        this.f38132t.mo52408e(adapter);
        m52422d(adapter);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f38132t.mo52399q();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f38131s = i;
        this.f38122j.requestLayout();
    }

    public void setOrientation(int i) {
        this.f38119g.setOrientation(i);
        this.f38132t.mo52397s();
    }

    public void setPageTransformer(@Nullable PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.f38129q) {
                this.f38128p = this.f38122j.getItemAnimator();
                this.f38129q = true;
            }
            this.f38122j.setItemAnimator(null);
        } else if (this.f38129q) {
            this.f38122j.setItemAnimator(this.f38128p);
            this.f38128p = null;
            this.f38129q = false;
        }
        if (pageTransformer == this.f38127o.m52382a()) {
            return;
        }
        this.f38127o.m52381b(pageTransformer);
        requestTransform();
    }

    public void setUserInputEnabled(boolean z) {
        this.f38130r = z;
        this.f38132t.mo52396t();
    }

    public void unregisterOnPageChangeCallback(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.f38115c.m52384b(onPageChangeCallback);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    /* loaded from: classes2.dex */
    public static class C5211l extends View.BaseSavedState {
        public static final Parcelable.Creator<C5211l> CREATOR = new C5212a();

        /* renamed from: a */
        public int f38149a;

        /* renamed from: b */
        public int f38150b;

        /* renamed from: c */
        public Parcelable f38151c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$a */
        /* loaded from: classes2.dex */
        public class C5212a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C5211l createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C5211l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new C5211l(parcel, classLoader);
                }
                return new C5211l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C5211l[] newArray(int i) {
                return new C5211l[i];
            }
        }

        public C5211l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m52390a(parcel, classLoader);
        }

        /* renamed from: a */
        public final void m52390a(Parcel parcel, ClassLoader classLoader) {
            this.f38149a = parcel.readInt();
            this.f38150b = parcel.readInt();
            this.f38151c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f38149a);
            parcel.writeInt(this.f38150b);
            parcel.writeParcelable(this.f38151c, i);
        }

        public C5211l(Parcel parcel) {
            super(parcel);
            m52390a(parcel, null);
        }

        public C5211l(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration, int i) {
        this.f38122j.addItemDecoration(itemDecoration, i);
    }

    public void setCurrentItem(int i, boolean z) {
        if (!isFakeDragging()) {
            m52420f(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38113a = new Rect();
        this.f38114b = new Rect();
        this.f38115c = new C5214a(3);
        this.f38117e = false;
        this.f38118f = new C5197a();
        this.f38120h = -1;
        this.f38128p = null;
        this.f38129q = false;
        this.f38130r = true;
        this.f38131s = -1;
        m52424b(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38113a = new Rect();
        this.f38114b = new Rect();
        this.f38115c = new C5214a(3);
        this.f38117e = false;
        this.f38118f = new C5197a();
        this.f38120h = -1;
        this.f38128p = null;
        this.f38129q = false;
        this.f38130r = true;
        this.f38131s = -1;
        m52424b(context, attributeSet);
    }

    @RequiresApi(21)
    @SuppressLint({"ClassVerificationFailure"})
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f38113a = new Rect();
        this.f38114b = new Rect();
        this.f38115c = new C5214a(3);
        this.f38117e = false;
        this.f38118f = new C5197a();
        this.f38120h = -1;
        this.f38128p = null;
        this.f38129q = false;
        this.f38130r = true;
        this.f38131s = -1;
        m52424b(context, attributeSet);
    }
}
