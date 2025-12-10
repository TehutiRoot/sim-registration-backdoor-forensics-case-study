package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.p005os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.C4946a;
import androidx.recyclerview.widget.C4949b;
import androidx.recyclerview.widget.C4977k;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.RunnableC4959e;
import androidx.recyclerview.widget.ViewBoundsCheck;
import com.google.firebase.perf.util.Constants;
import es.dmoral.toasty.BuildConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {

    /* renamed from: D0 */
    public static boolean f36816D0 = false;

    /* renamed from: E0 */
    public static boolean f36817E0 = false;

    /* renamed from: F0 */
    public static final int[] f36818F0 = {16843830};

    /* renamed from: G0 */
    public static final float f36819G0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: H0 */
    public static final boolean f36820H0;
    public static final int HORIZONTAL = 0;

    /* renamed from: I0 */
    public static final boolean f36821I0;
    public static final int INVALID_TYPE = -1;

    /* renamed from: J0 */
    public static final boolean f36822J0;

    /* renamed from: K0 */
    public static final boolean f36823K0;

    /* renamed from: L0 */
    public static final boolean f36824L0;

    /* renamed from: M0 */
    public static final boolean f36825M0;

    /* renamed from: N0 */
    public static final Class[] f36826N0;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;

    /* renamed from: O0 */
    public static final Interpolator f36827O0;

    /* renamed from: P0 */
    public static final C4928k f36828P0;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final int VERTICAL = 1;

    /* renamed from: A */
    public boolean f36829A;

    /* renamed from: A0 */
    public int f36830A0;

    /* renamed from: B */
    public int f36831B;

    /* renamed from: B0 */
    public int f36832B0;

    /* renamed from: C */
    public boolean f36833C;

    /* renamed from: C0 */
    public final C4977k.InterfaceC4979b f36834C0;

    /* renamed from: D */
    public final AccessibilityManager f36835D;

    /* renamed from: E */
    public List f36836E;

    /* renamed from: F */
    public boolean f36837F;

    /* renamed from: G */
    public boolean f36838G;

    /* renamed from: H */
    public int f36839H;

    /* renamed from: I */
    public int f36840I;

    /* renamed from: J */
    public EdgeEffectFactory f36841J;

    /* renamed from: K */
    public EdgeEffect f36842K;

    /* renamed from: L */
    public EdgeEffect f36843L;

    /* renamed from: M */
    public EdgeEffect f36844M;

    /* renamed from: N */
    public EdgeEffect f36845N;

    /* renamed from: O */
    public ItemAnimator f36846O;

    /* renamed from: P */
    public int f36847P;

    /* renamed from: Q */
    public int f36848Q;

    /* renamed from: R */
    public VelocityTracker f36849R;

    /* renamed from: S */
    public int f36850S;

    /* renamed from: T */
    public int f36851T;

    /* renamed from: U */
    public int f36852U;

    /* renamed from: V */
    public int f36853V;

    /* renamed from: W */
    public int f36854W;

    /* renamed from: a */
    public final float f36855a;

    /* renamed from: a0 */
    public OnFlingListener f36856a0;

    /* renamed from: b */
    public final C4927j f36857b;

    /* renamed from: b0 */
    public final int f36858b0;

    /* renamed from: c */
    public final Recycler f36859c;

    /* renamed from: c0 */
    public final int f36860c0;

    /* renamed from: d */
    public SavedState f36861d;

    /* renamed from: d0 */
    public float f36862d0;

    /* renamed from: e */
    public C4946a f36863e;

    /* renamed from: e0 */
    public float f36864e0;

    /* renamed from: f */
    public C4949b f36865f;

    /* renamed from: f0 */
    public boolean f36866f0;

    /* renamed from: g */
    public final C4977k f36867g;

    /* renamed from: g0 */
    public final RunnableC4929l f36868g0;

    /* renamed from: h */
    public boolean f36869h;

    /* renamed from: h0 */
    public RunnableC4959e f36870h0;

    /* renamed from: i */
    public final Runnable f36871i;

    /* renamed from: i0 */
    public RunnableC4959e.C4961b f36872i0;

    /* renamed from: j */
    public final Rect f36873j;

    /* renamed from: j0 */
    public final State f36874j0;

    /* renamed from: k */
    public final Rect f36875k;

    /* renamed from: k0 */
    public OnScrollListener f36876k0;

    /* renamed from: l */
    public final RectF f36877l;

    /* renamed from: l0 */
    public List f36878l0;

    /* renamed from: m */
    public Adapter f36879m;

    /* renamed from: m0 */
    public boolean f36880m0;

    /* renamed from: n */
    public LayoutManager f36881n;

    /* renamed from: n0 */
    public boolean f36882n0;

    /* renamed from: o */
    public RecyclerListener f36883o;

    /* renamed from: o0 */
    public ItemAnimator.InterfaceC4913a f36884o0;

    /* renamed from: p */
    public final List f36885p;

    /* renamed from: p0 */
    public boolean f36886p0;

    /* renamed from: q */
    public final ArrayList f36887q;

    /* renamed from: q0 */
    public RecyclerViewAccessibilityDelegate f36888q0;

    /* renamed from: r */
    public final ArrayList f36889r;

    /* renamed from: r0 */
    public ChildDrawingOrderCallback f36890r0;

    /* renamed from: s */
    public OnItemTouchListener f36891s;

    /* renamed from: s0 */
    public final int[] f36892s0;

    /* renamed from: t */
    public boolean f36893t;

    /* renamed from: t0 */
    public NestedScrollingChildHelper f36894t0;

    /* renamed from: u */
    public boolean f36895u;

    /* renamed from: u0 */
    public final int[] f36896u0;

    /* renamed from: v */
    public boolean f36897v;

    /* renamed from: v0 */
    public final int[] f36898v0;

    /* renamed from: w */
    public boolean f36899w;

    /* renamed from: w0 */
    public final int[] f36900w0;

    /* renamed from: x */
    public int f36901x;

    /* renamed from: x0 */
    public final List f36902x0;

    /* renamed from: y */
    public boolean f36903y;

    /* renamed from: y0 */
    public Runnable f36904y0;

    /* renamed from: z */
    public boolean f36905z;

    /* renamed from: z0 */
    public boolean f36906z0;

    /* loaded from: classes2.dex */
    public static abstract class Adapter<VH extends ViewHolder> {
        private final C4925h mObservable = new C4925h();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        /* loaded from: classes2.dex */
        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(@NonNull VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                TraceCompat.beginSection("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.f36816D0) {
                if (vh.itemView.getParent() == null && ViewCompat.isAttachedToWindow(vh.itemView) != vh.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + ViewCompat.isAttachedToWindow(vh.itemView) + ", holder: " + vh);
                } else if (vh.itemView.getParent() == null && ViewCompat.isAttachedToWindow(vh.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                }
            }
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f36935c = true;
                }
                TraceCompat.endSection();
            }
        }

        public boolean canRestoreState() {
            int i = C4924g.f36991a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i) {
            try {
                TraceCompat.beginSection("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                TraceCompat.endSection();
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends ViewHolder> adapter, @NonNull ViewHolder viewHolder, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m53304a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m53303b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.m53301d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m53299f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m53302c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m53301d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m53299f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m53298g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m53298g(i, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh, int i);

        public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
            onBindViewHolder(vh, i);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.m53297h();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemChanged(int i, @Nullable Object obj) {
            this.mObservable.m53300e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
            this.mObservable.m53300e(i, i2, obj);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class AdapterDataObserver {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    /* loaded from: classes2.dex */
    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i, int i2);
    }

    /* loaded from: classes2.dex */
    public static class EdgeEffectFactory {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface EdgeDirection {
        }

        @NonNull
        public EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;

        /* renamed from: a */
        public InterfaceC4913a f36907a = null;

        /* renamed from: b */
        public ArrayList f36908b = new ArrayList();

        /* renamed from: c */
        public long f36909c = 120;

        /* renamed from: d */
        public long f36910d = 120;

        /* renamed from: e */
        public long f36911e = 250;

        /* renamed from: f */
        public long f36912f = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface AdapterChanges {
        }

        /* loaded from: classes2.dex */
        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        /* loaded from: classes2.dex */
        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder) {
                return setFrom(viewHolder, 0);
            }

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder, int i) {
                View view = viewHolder.itemView;
                this.left = view.getLeft();
                this.top = view.getTop();
                this.right = view.getRight();
                this.bottom = view.getBottom();
                return this;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$ItemAnimator$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC4913a {
            /* renamed from: a */
            void mo53296a(ViewHolder viewHolder);
        }

        /* renamed from: a */
        public static int m53391a(ViewHolder viewHolder) {
            int i = viewHolder.mFlags;
            int i2 = i & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = viewHolder.getOldPosition();
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i2 | 2048;
                }
                return i2;
            }
            return i2;
        }

        public abstract boolean animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        /* renamed from: b */
        public void m53390b(InterfaceC4913a interfaceC4913a) {
            this.f36907a = interfaceC4913a;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder) {
            return true;
        }

        public final void dispatchAnimationFinished(@NonNull ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            InterfaceC4913a interfaceC4913a = this.f36907a;
            if (interfaceC4913a != null) {
                interfaceC4913a.mo53296a(viewHolder);
            }
        }

        public final void dispatchAnimationStarted(@NonNull ViewHolder viewHolder) {
            onAnimationStarted(viewHolder);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.f36908b.size();
            for (int i = 0; i < size; i++) {
                ((ItemAnimatorFinishedListener) this.f36908b.get(i)).onAnimationsFinished();
            }
            this.f36908b.clear();
        }

        public abstract void endAnimation(@NonNull ViewHolder viewHolder);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.f36909c;
        }

        public long getChangeDuration() {
            return this.f36912f;
        }

        public long getMoveDuration() {
            return this.f36911e;
        }

        public long getRemoveDuration() {
            return this.f36910d;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(@Nullable ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean isRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (!isRunning) {
                    itemAnimatorFinishedListener.onAnimationsFinished();
                } else {
                    this.f36908b.add(itemAnimatorFinishedListener);
                }
            }
            return isRunning;
        }

        @NonNull
        public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        public void onAnimationFinished(@NonNull ViewHolder viewHolder) {
        }

        public void onAnimationStarted(@NonNull ViewHolder viewHolder) {
        }

        @NonNull
        public ItemHolderInfo recordPostLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        @NonNull
        public ItemHolderInfo recordPreLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder, int i, @NonNull List<Object> list) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.f36909c = j;
        }

        public void setChangeDuration(long j) {
            this.f36912f = j;
        }

        public void setMoveDuration(long j) {
            this.f36911e = j;
        }

        public void setRemoveDuration(long j) {
            this.f36910d = j;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder, @NonNull List<Object> list) {
            return canReuseUpdatedViewHolder(viewHolder);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull State state) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class LayoutManager {

        /* renamed from: a */
        public C4949b f36913a;

        /* renamed from: b */
        public RecyclerView f36914b;

        /* renamed from: c */
        public final ViewBoundsCheck.InterfaceC4943b f36915c;

        /* renamed from: d */
        public final ViewBoundsCheck.InterfaceC4943b f36916d;

        /* renamed from: e */
        public ViewBoundsCheck f36917e;

        /* renamed from: f */
        public ViewBoundsCheck f36918f;

        /* renamed from: g */
        public SmoothScroller f36919g;

        /* renamed from: h */
        public boolean f36920h;

        /* renamed from: i */
        public boolean f36921i;

        /* renamed from: j */
        public boolean f36922j;

        /* renamed from: k */
        public boolean f36923k;

        /* renamed from: l */
        public boolean f36924l;

        /* renamed from: m */
        public int f36925m;

        /* renamed from: n */
        public boolean f36926n;

        /* renamed from: o */
        public int f36927o;

        /* renamed from: p */
        public int f36928p;

        /* renamed from: q */
        public int f36929q;

        /* renamed from: r */
        public int f36930r;

        /* loaded from: classes2.dex */
        public interface LayoutPrefetchRegistry {
            void addPosition(int i, int i2);
        }

        /* loaded from: classes2.dex */
        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$a */
        /* loaded from: classes2.dex */
        public class C4914a implements ViewBoundsCheck.InterfaceC4943b {
            public C4914a() {
                LayoutManager.this = r1;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: a */
            public View mo53145a(int i) {
                return LayoutManager.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: b */
            public int mo53144b() {
                return LayoutManager.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: c */
            public int mo53143c() {
                return LayoutManager.this.getWidth() - LayoutManager.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: d */
            public int mo53142d(View view) {
                return LayoutManager.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: e */
            public int mo53141e(View view) {
                return LayoutManager.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$b */
        /* loaded from: classes2.dex */
        public class C4915b implements ViewBoundsCheck.InterfaceC4943b {
            public C4915b() {
                LayoutManager.this = r1;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: a */
            public View mo53145a(int i) {
                return LayoutManager.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: b */
            public int mo53144b() {
                return LayoutManager.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: c */
            public int mo53143c() {
                return LayoutManager.this.getHeight() - LayoutManager.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: d */
            public int mo53142d(View view) {
                return LayoutManager.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.InterfaceC4943b
            /* renamed from: e */
            public int mo53141e(View view) {
                return LayoutManager.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        public LayoutManager() {
            C4914a c4914a = new C4914a();
            this.f36915c = c4914a;
            C4915b c4915b = new C4915b();
            this.f36916d = c4915b;
            this.f36917e = new ViewBoundsCheck(c4914a);
            this.f36918f = new ViewBoundsCheck(c4915b);
            this.f36920h = false;
            this.f36921i = false;
            this.f36922j = false;
            this.f36923k = true;
            this.f36924l = true;
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i2, i3);
                }
                return size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x000a, code lost:
            if (r3 >= 0) goto L4;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L11
                if (r3 < 0) goto Lf
            Lc:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L21
            Lf:
                r3 = 0
                goto L21
            L11:
                if (r3 < 0) goto L14
                goto Lc
            L14:
                r4 = -1
                if (r3 != r4) goto L1b
                r2 = 1073741824(0x40000000, float:2.0)
            L19:
                r3 = r1
                goto L21
            L1b:
                r4 = -2
                if (r3 != r4) goto Lf
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L19
            L21:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, boolean):int");
        }

        public static Properties getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
            Properties properties = new Properties();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, i2);
            properties.orientation = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
            properties.spanCount = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
            properties.reverseLayout = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
            properties.stackFromEnd = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return properties;
        }

        /* renamed from: h */
        private static boolean m53382h(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i) {
                    return false;
                }
                return true;
            } else if (size < i) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: a */
        public final void m53389a(View view, int i, boolean z) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (!z && !m53450X.isRemoved()) {
                this.f36914b.f36867g.m52949p(m53450X);
            } else {
                this.f36914b.f36867g.m52963b(m53450X);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (!m53450X.wasReturnedFromScrap() && !m53450X.isScrap()) {
                if (view.getParent() == this.f36914b) {
                    int m53092m = this.f36913a.m53092m(view);
                    if (i == -1) {
                        i = this.f36913a.m53098g();
                    }
                    if (m53092m != -1) {
                        if (m53092m != i) {
                            this.f36914b.f36881n.moveView(m53092m, i);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f36914b.indexOfChild(view) + this.f36914b.m53468O());
                    }
                } else {
                    this.f36913a.m53104a(view, i, false);
                    layoutParams.f36935c = true;
                    SmoothScroller smoothScroller = this.f36919g;
                    if (smoothScroller != null && smoothScroller.isRunning()) {
                        this.f36919g.onChildAttachedToWindow(view);
                    }
                }
            } else {
                if (m53450X.isScrap()) {
                    m53450X.unScrap();
                } else {
                    m53450X.clearReturnedFromScrapFlag();
                }
                this.f36913a.m53102c(view, i, view.getLayoutParams(), false);
            }
            if (layoutParams.f36936d) {
                if (RecyclerView.f36817E0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("consuming pending invalidate on child ");
                    sb.append(layoutParams.f36933a);
                }
                m53450X.itemView.invalidate();
                layoutParams.f36936d = false;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                recyclerView.m53421l(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                recyclerView.m53419m(str);
            }
        }

        public void attachView(@NonNull View view, int i, LayoutParams layoutParams) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (m53450X.isRemoved()) {
                this.f36914b.f36867g.m52963b(m53450X);
            } else {
                this.f36914b.f36867g.m52949p(m53450X);
            }
            this.f36913a.m53102c(view, i, layoutParams, m53450X.isRemoved());
        }

        /* renamed from: b */
        public final void m53388b(int i, View view) {
            this.f36913a.m53101d(i);
        }

        /* renamed from: c */
        public void m53387c(RecyclerView recyclerView) {
            this.f36921i = true;
            onAttachedToWindow(recyclerView);
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m53440b0(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i, int i2, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public int computeHorizontalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull State state) {
            return 0;
        }

        /* renamed from: d */
        public void m53386d(RecyclerView recyclerView, Recycler recycler) {
            this.f36921i = false;
            onDetachedFromWindow(recyclerView, recycler);
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                m53375o(recycler, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull Recycler recycler) {
            m53375o(recycler, this.f36913a.m53092m(view), view);
        }

        public void detachAndScrapViewAt(int i, @NonNull Recycler recycler) {
            m53375o(recycler, i, getChildAt(i));
        }

        public void detachView(@NonNull View view) {
            int m53092m = this.f36913a.m53092m(view);
            if (m53092m >= 0) {
                m53388b(m53092m, view);
            }
        }

        public void detachViewAt(int i) {
            m53388b(i, getChildAt(i));
        }

        /* renamed from: e */
        public final int[] m53385e(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() == 1) {
                if (max == 0) {
                    max = Math.max(min, i3);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            return new int[]{max, min2};
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            ItemAnimator itemAnimator = this.f36914b.f36846O;
            if (itemAnimator != null) {
                itemAnimator.endAnimation(RecyclerView.m53450X(view));
            }
        }

        /* renamed from: f */
        public boolean m53384f() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f36913a.m53091n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        @Nullable
        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ViewHolder m53450X = RecyclerView.m53450X(childAt);
                if (m53450X != null && m53450X.getLayoutPosition() == i && !m53450X.shouldIgnore() && (this.f36914b.f36874j0.isPreLayout() || !m53450X.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: g */
        public final boolean m53383g(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.f36914b.f36873j;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i >= width || rect.right - i <= paddingLeft || rect.top - i2 >= height || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract LayoutParams generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f36934b.bottom;
        }

        @Nullable
        public View getChildAt(int i) {
            C4949b c4949b = this.f36913a;
            if (c4949b != null) {
                return c4949b.m53099f(i);
            }
            return null;
        }

        public int getChildCount() {
            C4949b c4949b = this.f36913a;
            if (c4949b != null) {
                return c4949b.m53098g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null && recyclerView.f36869h) {
                return true;
            }
            return false;
        }

        public int getColumnCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.m53448Y(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f36934b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f36934b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f36913a.m53091n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @InterfaceC2055Px
        public int getHeight() {
            return this.f36930r;
        }

        public int getHeightMode() {
            return this.f36928p;
        }

        public int getItemCount() {
            Adapter adapter;
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.m53450X(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return ViewCompat.getLayoutDirection(this.f36914b);
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f36934b.left;
        }

        @InterfaceC2055Px
        public int getMinimumHeight() {
            return ViewCompat.getMinimumHeight(this.f36914b);
        }

        @InterfaceC2055Px
        public int getMinimumWidth() {
            return ViewCompat.getMinimumWidth(this.f36914b);
        }

        @InterfaceC2055Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @InterfaceC2055Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                return ViewCompat.getPaddingEnd(recyclerView);
            }
            return 0;
        }

        @InterfaceC2055Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @InterfaceC2055Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @InterfaceC2055Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                return ViewCompat.getPaddingStart(recyclerView);
            }
            return 0;
        }

        @InterfaceC2055Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f36934b.right;
        }

        public int getRowCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).f36934b.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f36934b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f36914b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f36914b.f36877l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @InterfaceC2055Px
        public int getWidth() {
            return this.f36929q;
        }

        public int getWidthMode() {
            return this.f36927o;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null && recyclerView.hasFocus()) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public void m53381i(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.f36914b;
            onInitializeAccessibilityNodeInfo(recyclerView.f36859c, recyclerView.f36874j0, accessibilityNodeInfoCompat);
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f36914b;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                ViewHolder m53450X = RecyclerView.m53450X(view);
                m53450X.addFlags(128);
                this.f36914b.f36867g.m52948q(m53450X);
                return;
            }
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f36914b.m53468O());
        }

        public boolean isAttachedToWindow() {
            return this.f36921i;
        }

        public boolean isAutoMeasureEnabled() {
            return this.f36922j;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null && recyclerView.isFocused()) {
                return true;
            }
            return false;
        }

        public final boolean isItemPrefetchEnabled() {
            return this.f36924l;
        }

        public boolean isLayoutHierarchical(@NonNull Recycler recycler, @NonNull State state) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.f36923k;
        }

        public boolean isSmoothScrolling() {
            SmoothScroller smoothScroller = this.f36919g;
            if (smoothScroller != null && smoothScroller.isRunning()) {
                return true;
            }
            return false;
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
            boolean z3;
            if (this.f36917e.m53151b(view, 24579) && this.f36918f.m53151b(view, 24579)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        /* renamed from: j */
        public void m53380j(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (m53450X != null && !m53450X.isRemoved() && !this.f36913a.m53091n(m53450X.itemView)) {
                RecyclerView recyclerView = this.f36914b;
                onInitializeAccessibilityNodeInfoForItem(recyclerView.f36859c, recyclerView.f36874j0, view, accessibilityNodeInfoCompat);
            }
        }

        /* renamed from: k */
        public void m53379k(SmoothScroller smoothScroller) {
            if (this.f36919g == smoothScroller) {
                this.f36919g = null;
            }
        }

        /* renamed from: l */
        public boolean m53378l(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f36914b;
            return performAccessibilityAction(recyclerView.f36859c, recyclerView.f36874j0, i, bundle);
        }

        public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f36934b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f36934b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        /* renamed from: m */
        public boolean m53377m(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f36914b;
            return performAccessibilityActionForItem(recyclerView.f36859c, recyclerView.f36874j0, view, i, bundle);
        }

        public void measureChild(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect m53440b0 = this.f36914b.m53440b0(view);
            int i3 = i + m53440b0.left + m53440b0.right;
            int i4 = i2 + m53440b0.top + m53440b0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (m53370t(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect m53440b0 = this.f36914b.m53440b0(view);
            int i3 = i + m53440b0.left + m53440b0.right;
            int i4 = i2 + m53440b0.top + m53440b0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (m53370t(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f36914b.toString());
        }

        /* renamed from: n */
        public void m53376n(Recycler recycler) {
            int m53336h = recycler.m53336h();
            for (int i = m53336h - 1; i >= 0; i--) {
                View m53333k = recycler.m53333k(i);
                ViewHolder m53450X = RecyclerView.m53450X(m53333k);
                if (!m53450X.shouldIgnore()) {
                    m53450X.setIsRecyclable(false);
                    if (m53450X.isTmpDetached()) {
                        this.f36914b.removeDetachedView(m53333k, false);
                    }
                    ItemAnimator itemAnimator = this.f36914b.f36846O;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimation(m53450X);
                    }
                    m53450X.setIsRecyclable(true);
                    recycler.m53318z(m53333k);
                }
            }
            recycler.m53340d();
            if (m53336h > 0) {
                this.f36914b.invalidate();
            }
        }

        /* renamed from: o */
        public final void m53375o(Recycler recycler, int i, View view) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (m53450X.shouldIgnore()) {
                if (RecyclerView.f36817E0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ignoring view ");
                    sb.append(m53450X);
                }
            } else if (m53450X.isInvalid() && !m53450X.isRemoved() && !this.f36914b.f36879m.hasStableIds()) {
                removeViewAt(i);
                recycler.m53353C(m53450X);
            } else {
                detachViewAt(i);
                recycler.m53352D(view);
                this.f36914b.f36867g.m52954k(m53450X);
            }
        }

        public void offsetChildrenHorizontal(@InterfaceC2055Px int i) {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(@InterfaceC2055Px int i) {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i, @NonNull Recycler recycler, @NonNull State state) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f36914b;
            onInitializeAccessibilityEvent(recyclerView.f36859c, recyclerView.f36874j0, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f36914b.canScrollVertically(-1) || this.f36914b.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            if (this.f36914b.canScrollVertically(1) || this.f36914b.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(Recycler recycler, State state) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(State state) {
        }

        public void onMeasure(@NonNull Recycler recycler, @NonNull State state, int i, int i2) {
            this.f36914b.m53397x(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        /* renamed from: p */
        public void m53374p(RecyclerView recyclerView) {
            m53373q(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public boolean performAccessibilityAction(@NonNull Recycler recycler, @NonNull State state, int i, @Nullable Bundle bundle) {
            int i2;
            int paddingLeft;
            int i3;
            int i4;
            if (this.f36914b == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.f36914b.getMatrix().isIdentity() && this.f36914b.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i != 4096) {
                if (i != 8192) {
                    i4 = 0;
                    i3 = 0;
                } else {
                    if (this.f36914b.canScrollVertically(-1)) {
                        i2 = -((height - getPaddingTop()) - getPaddingBottom());
                    } else {
                        i2 = 0;
                    }
                    if (this.f36914b.canScrollHorizontally(-1)) {
                        paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                        i3 = i2;
                        i4 = paddingLeft;
                    }
                    i3 = i2;
                    i4 = 0;
                }
            } else {
                if (this.f36914b.canScrollVertically(1)) {
                    i2 = (height - getPaddingTop()) - getPaddingBottom();
                } else {
                    i2 = 0;
                }
                if (this.f36914b.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i3 = i2;
                    i4 = paddingLeft;
                }
                i3 = i2;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.f36914b.m53453V0(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, int i, @Nullable Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                ViewCompat.postOnAnimation(recyclerView, runnable);
            }
        }

        /* renamed from: q */
        public void m53373q(int i, int i2) {
            this.f36929q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f36927o = mode;
            if (mode == 0 && !RecyclerView.f36821I0) {
                this.f36929q = 0;
            }
            this.f36930r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f36928p = mode2;
            if (mode2 == 0 && !RecyclerView.f36821I0) {
                this.f36930r = 0;
            }
        }

        /* renamed from: r */
        public void m53372r(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.f36914b.m53397x(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.f36914b.f36873j;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f36914b.f36873j.set(i5, i6, i3, i4);
            setMeasuredDimension(this.f36914b.f36873j, i, i2);
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.f36913a.m53088q(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.m53450X(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, recycler);
                }
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull Recycler recycler) {
            removeView(view);
            recycler.recycleView(view);
        }

        public void removeAndRecycleViewAt(int i, @NonNull Recycler recycler) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            recycler.recycleView(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.f36914b.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            this.f36913a.m53089p(view);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.f36913a.m53088q(i);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.f36920h = true;
        }

        /* renamed from: s */
        public void m53371s(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f36914b = null;
                this.f36913a = null;
                this.f36929q = 0;
                this.f36930r = 0;
            } else {
                this.f36914b = recyclerView;
                this.f36913a = recyclerView.f36865f;
                this.f36929q = recyclerView.getWidth();
                this.f36930r = recyclerView.getHeight();
            }
            this.f36927o = 1073741824;
            this.f36928p = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
            return 0;
        }

        public void scrollToPosition(int i) {
            boolean z = RecyclerView.f36816D0;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i, Recycler recycler, State state) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.f36922j = z;
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.f36924l) {
                this.f36924l = z;
                this.f36925m = 0;
                RecyclerView recyclerView = this.f36914b;
                if (recyclerView != null) {
                    recyclerView.f36859c.m53346J();
                }
            }
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.f36923k = z;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.f36919g;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.f36919g.stop();
            }
            this.f36919g = smoothScroller;
            smoothScroller.m53312b(this.f36914b, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            m53450X.stopIgnoring();
            m53450X.resetInternal();
            m53450X.addFlags(4);
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        /* renamed from: t */
        public boolean m53370t(View view, int i, int i2, LayoutParams layoutParams) {
            if (!view.isLayoutRequested() && this.f36923k && m53382h(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m53382h(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        /* renamed from: u */
        public boolean mo53369u() {
            return false;
        }

        /* renamed from: v */
        public boolean m53368v(View view, int i, int i2, LayoutParams layoutParams) {
            if (this.f36923k && m53382h(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m53382h(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        /* renamed from: w */
        public void m53367w() {
            SmoothScroller smoothScroller = this.f36919g;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i) {
            m53389a(view, i, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i) {
            m53389a(view, i, false);
        }

        @SuppressLint({"UnknownNullness"})
        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f36914b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f36914b.canScrollVertically(-1) && !this.f36914b.canScrollHorizontally(-1) && !this.f36914b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.f36914b.f36879m;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull State state, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            int[] m53385e = m53385e(view, rect);
            int i = m53385e[0];
            int i2 = m53385e[1];
            if ((!z2 || m53383g(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.smoothScrollBy(i, i2);
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0019, code lost:
            if (r5 == 1073741824) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1e
                if (r7 < 0) goto L13
            L10:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L13:
                if (r7 != r1) goto L1b
                if (r5 == r2) goto L23
                if (r5 == 0) goto L1b
                if (r5 == r3) goto L23
            L1b:
                r5 = 0
                r7 = 0
                goto L31
            L1e:
                if (r7 < 0) goto L21
                goto L10
            L21:
                if (r7 != r1) goto L25
            L23:
                r7 = r4
                goto L31
            L25:
                if (r7 != r0) goto L1b
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2c
                goto L2e
            L2c:
                r5 = 0
                goto L23
            L2e:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L23
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void attachView(@NonNull View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.f36914b.setMeasuredDimension(i, i2);
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }
    }

    /* loaded from: classes2.dex */
    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(@NonNull View view);

        void onChildViewDetachedFromWindow(@NonNull View view);
    }

    /* loaded from: classes2.dex */
    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i, int i2);
    }

    /* loaded from: classes2.dex */
    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    /* loaded from: classes2.dex */
    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Orientation {
    }

    /* loaded from: classes2.dex */
    public static class RecycledViewPool {

        /* renamed from: a */
        public SparseArray f36937a = new SparseArray();

        /* renamed from: b */
        public int f36938b = 0;

        /* renamed from: c */
        public Set f36939c = Collections.newSetFromMap(new IdentityHashMap());

        /* renamed from: androidx.recyclerview.widget.RecyclerView$RecycledViewPool$a */
        /* loaded from: classes2.dex */
        public static class C4916a {

            /* renamed from: a */
            public final ArrayList f36940a = new ArrayList();

            /* renamed from: b */
            public int f36941b = 5;

            /* renamed from: c */
            public long f36942c = 0;

            /* renamed from: d */
            public long f36943d = 0;
        }

        /* renamed from: a */
        public void m53366a() {
            this.f36938b++;
        }

        /* renamed from: b */
        public void m53365b(Adapter adapter) {
            this.f36939c.add(adapter);
        }

        /* renamed from: c */
        public void m53364c() {
            this.f36938b--;
        }

        public void clear() {
            for (int i = 0; i < this.f36937a.size(); i++) {
                C4916a c4916a = (C4916a) this.f36937a.valueAt(i);
                Iterator it = c4916a.f36940a.iterator();
                while (it.hasNext()) {
                    PoolingContainer.callPoolingContainerOnRelease(((ViewHolder) it.next()).itemView);
                }
                c4916a.f36940a.clear();
            }
        }

        /* renamed from: d */
        public void m53363d(Adapter adapter, boolean z) {
            this.f36939c.remove(adapter);
            if (this.f36939c.size() == 0 && !z) {
                for (int i = 0; i < this.f36937a.size(); i++) {
                    SparseArray sparseArray = this.f36937a;
                    ArrayList arrayList = ((C4916a) sparseArray.get(sparseArray.keyAt(i))).f36940a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        PoolingContainer.callPoolingContainerOnRelease(((ViewHolder) arrayList.get(i2)).itemView);
                    }
                }
            }
        }

        /* renamed from: e */
        public void m53362e(int i, long j) {
            C4916a m53360g = m53360g(i);
            m53360g.f36943d = m53358i(m53360g.f36943d, j);
        }

        /* renamed from: f */
        public void m53361f(int i, long j) {
            C4916a m53360g = m53360g(i);
            m53360g.f36942c = m53358i(m53360g.f36942c, j);
        }

        /* renamed from: g */
        public final C4916a m53360g(int i) {
            C4916a c4916a = (C4916a) this.f36937a.get(i);
            if (c4916a == null) {
                C4916a c4916a2 = new C4916a();
                this.f36937a.put(i, c4916a2);
                return c4916a2;
            }
            return c4916a;
        }

        @Nullable
        public ViewHolder getRecycledView(int i) {
            C4916a c4916a = (C4916a) this.f36937a.get(i);
            if (c4916a != null && !c4916a.f36940a.isEmpty()) {
                ArrayList arrayList = c4916a.f36940a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((ViewHolder) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                        return (ViewHolder) arrayList.remove(size);
                    }
                }
                return null;
            }
            return null;
        }

        public int getRecycledViewCount(int i) {
            return m53360g(i).f36940a.size();
        }

        /* renamed from: h */
        public void m53359h(Adapter adapter, Adapter adapter2, boolean z) {
            if (adapter != null) {
                m53364c();
            }
            if (!z && this.f36938b == 0) {
                clear();
            }
            if (adapter2 != null) {
                m53366a();
            }
        }

        /* renamed from: i */
        public long m53358i(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: j */
        public boolean m53357j(int i, long j, long j2) {
            long j3 = m53360g(i).f36943d;
            if (j3 != 0 && j + j3 >= j2) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        public boolean m53356k(int i, long j, long j2) {
            long j3 = m53360g(i).f36942c;
            if (j3 != 0 && j + j3 >= j2) {
                return false;
            }
            return true;
        }

        public void putRecycledView(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList arrayList = m53360g(itemViewType).f36940a;
            if (((C4916a) this.f36937a.get(itemViewType)).f36941b <= arrayList.size()) {
                PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
            } else if (RecyclerView.f36816D0 && arrayList.contains(viewHolder)) {
                throw new IllegalArgumentException("this scrap item already exists");
            } else {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        public void setMaxRecycledViews(int i, int i2) {
            C4916a m53360g = m53360g(i);
            m53360g.f36941b = i2;
            ArrayList arrayList = m53360g.f36940a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class Recycler {

        /* renamed from: a */
        public final ArrayList f36944a;

        /* renamed from: b */
        public ArrayList f36945b;

        /* renamed from: c */
        public final ArrayList f36946c;

        /* renamed from: d */
        public final List f36947d;

        /* renamed from: e */
        public int f36948e;

        /* renamed from: f */
        public int f36949f;

        /* renamed from: g */
        public RecycledViewPool f36950g;

        /* renamed from: h */
        public ViewCacheExtension f36951h;

        public Recycler() {
            RecyclerView.this = r2;
            ArrayList arrayList = new ArrayList();
            this.f36944a = arrayList;
            this.f36945b = null;
            this.f36946c = new ArrayList();
            this.f36947d = Collections.unmodifiableList(arrayList);
            this.f36948e = 2;
            this.f36949f = 2;
        }

        /* renamed from: A */
        public void m53355A() {
            for (int size = this.f36946c.size() - 1; size >= 0; size--) {
                m53354B(size);
            }
            this.f36946c.clear();
            if (RecyclerView.f36823K0) {
                RecyclerView.this.f36872i0.m53008a();
            }
        }

        /* renamed from: B */
        public void m53354B(int i) {
            if (RecyclerView.f36817E0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Recycling cached view at index ");
                sb.append(i);
            }
            ViewHolder viewHolder = (ViewHolder) this.f36946c.get(i);
            if (RecyclerView.f36817E0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CachedViewHolder to be recycled: ");
                sb2.append(viewHolder);
            }
            m53343a(viewHolder, true);
            this.f36946c.remove(i);
        }

        /* renamed from: C */
        public void m53353C(ViewHolder viewHolder) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            if (!viewHolder.isScrap() && viewHolder.itemView.getParent() == null) {
                if (!viewHolder.isTmpDetached()) {
                    if (!viewHolder.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                        Adapter adapter = RecyclerView.this.f36879m;
                        if (adapter != null && doesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (RecyclerView.f36816D0 && this.f36946c.contains(viewHolder)) {
                            throw new IllegalArgumentException("cached view received recycle internal? " + viewHolder + RecyclerView.this.m53468O());
                        }
                        if (!z && !viewHolder.isRecyclable()) {
                            if (RecyclerView.f36817E0) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists");
                                sb.append(RecyclerView.this.m53468O());
                            }
                        } else {
                            if (this.f36949f > 0 && !viewHolder.hasAnyOfTheFlags(526)) {
                                int size = this.f36946c.size();
                                if (size >= this.f36949f && size > 0) {
                                    m53354B(0);
                                    size--;
                                }
                                if (RecyclerView.f36823K0 && size > 0 && !RecyclerView.this.f36872i0.m53006c(viewHolder.mPosition)) {
                                    int i = size - 1;
                                    while (i >= 0) {
                                        if (!RecyclerView.this.f36872i0.m53006c(((ViewHolder) this.f36946c.get(i)).mPosition)) {
                                            break;
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                }
                                this.f36946c.add(size, viewHolder);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                m53343a(viewHolder, true);
                                z3 = z2;
                                RecyclerView.this.f36867g.m52948q(viewHolder);
                                if (z3 && !z4 && doesTransientStatePreventRecycling) {
                                    PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
                                    viewHolder.mBindingAdapter = null;
                                    viewHolder.mOwnerRecyclerView = null;
                                    return;
                                }
                                return;
                            }
                            z3 = z2;
                        }
                        z4 = false;
                        RecyclerView.this.f36867g.m52948q(viewHolder);
                        if (z3) {
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m53468O());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + viewHolder + RecyclerView.this.m53468O());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(viewHolder.isScrap());
            sb2.append(" isAttached:");
            if (viewHolder.itemView.getParent() != null) {
                z3 = true;
            }
            sb2.append(z3);
            sb2.append(RecyclerView.this.m53468O());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* renamed from: D */
        public void m53352D(View view) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (!m53450X.hasAnyOfTheFlags(12) && m53450X.isUpdated() && !RecyclerView.this.m53417n(m53450X)) {
                if (this.f36945b == null) {
                    this.f36945b = new ArrayList();
                }
                m53450X.setScrapContainer(this, true);
                this.f36945b.add(m53450X);
            } else if (m53450X.isInvalid() && !m53450X.isRemoved() && !RecyclerView.this.f36879m.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m53468O());
            } else {
                m53450X.setScrapContainer(this, false);
                this.f36944a.add(m53450X);
            }
        }

        /* renamed from: E */
        public void m53351E(RecycledViewPool recycledViewPool) {
            m53320x(RecyclerView.this.f36879m);
            RecycledViewPool recycledViewPool2 = this.f36950g;
            if (recycledViewPool2 != null) {
                recycledViewPool2.m53364c();
            }
            this.f36950g = recycledViewPool;
            if (recycledViewPool != null && RecyclerView.this.getAdapter() != null) {
                this.f36950g.m53366a();
            }
            m53327q();
        }

        /* renamed from: F */
        public void m53350F(ViewCacheExtension viewCacheExtension) {
            this.f36951h = viewCacheExtension;
        }

        /* renamed from: G */
        public final boolean m53349G(ViewHolder viewHolder, int i, int i2, long j) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z = false;
            if (j != Long.MAX_VALUE && !this.f36950g.m53357j(itemViewType, nanoTime, j)) {
                return false;
            }
            if (viewHolder.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(viewHolder.itemView, recyclerView.getChildCount(), viewHolder.itemView.getLayoutParams());
                z = true;
            }
            RecyclerView.this.f36879m.bindViewHolder(viewHolder, i);
            if (z) {
                RecyclerView.this.detachViewFromParent(viewHolder.itemView);
            }
            this.f36950g.m53362e(viewHolder.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m53342b(viewHolder);
            if (RecyclerView.this.f36874j0.isPreLayout()) {
                viewHolder.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:141:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:239:0x026c A[ADDED_TO_REGION] */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.ViewHolder m53348H(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 683
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Recycler.m53348H(int, boolean, long):androidx.recyclerview.widget.RecyclerView$ViewHolder");
        }

        /* renamed from: I */
        public void m53347I(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.f36945b.remove(viewHolder);
            } else {
                this.f36944a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        /* renamed from: J */
        public void m53346J() {
            int i;
            LayoutManager layoutManager = RecyclerView.this.f36881n;
            if (layoutManager != null) {
                i = layoutManager.f36925m;
            } else {
                i = 0;
            }
            this.f36949f = this.f36948e + i;
            for (int size = this.f36946c.size() - 1; size >= 0 && this.f36946c.size() > this.f36949f; size--) {
                m53354B(size);
            }
        }

        /* renamed from: K */
        public boolean m53345K(ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                if (RecyclerView.f36816D0 && !RecyclerView.this.f36874j0.isPreLayout()) {
                    throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.m53468O());
                }
                return RecyclerView.this.f36874j0.isPreLayout();
            }
            int i = viewHolder.mPosition;
            if (i >= 0 && i < RecyclerView.this.f36879m.getItemCount()) {
                if (!RecyclerView.this.f36874j0.isPreLayout() && RecyclerView.this.f36879m.getItemViewType(viewHolder.mPosition) != viewHolder.getItemViewType()) {
                    return false;
                }
                if (RecyclerView.this.f36879m.hasStableIds() && viewHolder.getItemId() != RecyclerView.this.f36879m.getItemId(viewHolder.mPosition)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolder + RecyclerView.this.m53468O());
        }

        /* renamed from: L */
        public void m53344L(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f36946c.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) this.f36946c.get(size);
                if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i4) {
                    viewHolder.addFlags(2);
                    m53354B(size);
                }
            }
        }

        /* renamed from: a */
        public void m53343a(ViewHolder viewHolder, boolean z) {
            AccessibilityDelegateCompat accessibilityDelegateCompat;
            RecyclerView.m53413p(viewHolder);
            View view = viewHolder.itemView;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.f36888q0;
            if (recyclerViewAccessibilityDelegate != null) {
                AccessibilityDelegateCompat itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                if (itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                    accessibilityDelegateCompat = ((RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).m53288e(view);
                } else {
                    accessibilityDelegateCompat = null;
                }
                ViewCompat.setAccessibilityDelegate(view, accessibilityDelegateCompat);
            }
            if (z) {
                m53339e(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            m53337g().putRecycledView(viewHolder);
        }

        /* renamed from: b */
        public final void m53342b(ViewHolder viewHolder) {
            if (RecyclerView.this.m53422k0()) {
                View view = viewHolder.itemView;
                if (ViewCompat.getImportantForAccessibility(view) == 0) {
                    ViewCompat.setImportantForAccessibility(view, 1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.f36888q0;
                if (recyclerViewAccessibilityDelegate == null) {
                    return;
                }
                AccessibilityDelegateCompat itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                if (itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                    ((RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).m53287f(view);
                }
                ViewCompat.setAccessibilityDelegate(view, itemDelegate);
            }
        }

        public void bindViewToPosition(@NonNull View view, int i) {
            LayoutParams layoutParams;
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (m53450X != null) {
                int m53127m = RecyclerView.this.f36863e.m53127m(i);
                if (m53127m >= 0 && m53127m < RecyclerView.this.f36879m.getItemCount()) {
                    m53349G(m53450X, m53127m, i, Long.MAX_VALUE);
                    ViewGroup.LayoutParams layoutParams2 = m53450X.itemView.getLayoutParams();
                    if (layoutParams2 == null) {
                        layoutParams = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                        m53450X.itemView.setLayoutParams(layoutParams);
                    } else if (!RecyclerView.this.checkLayoutParams(layoutParams2)) {
                        layoutParams = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams2);
                        m53450X.itemView.setLayoutParams(layoutParams);
                    } else {
                        layoutParams = (LayoutParams) layoutParams2;
                    }
                    boolean z = true;
                    layoutParams.f36935c = true;
                    layoutParams.f36933a = m53450X;
                    if (m53450X.itemView.getParent() != null) {
                        z = false;
                    }
                    layoutParams.f36936d = z;
                    return;
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + m53127m + ").state:" + RecyclerView.this.f36874j0.getItemCount() + RecyclerView.this.m53468O());
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.m53468O());
        }

        /* renamed from: c */
        public void m53341c() {
            int size = this.f36946c.size();
            for (int i = 0; i < size; i++) {
                ((ViewHolder) this.f36946c.get(i)).clearOldPosition();
            }
            int size2 = this.f36944a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((ViewHolder) this.f36944a.get(i2)).clearOldPosition();
            }
            ArrayList arrayList = this.f36945b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((ViewHolder) this.f36945b.get(i3)).clearOldPosition();
                }
            }
        }

        public void clear() {
            this.f36944a.clear();
            m53355A();
        }

        public int convertPreLayoutPositionToPostLayout(int i) {
            if (i >= 0 && i < RecyclerView.this.f36874j0.getItemCount()) {
                if (!RecyclerView.this.f36874j0.isPreLayout()) {
                    return i;
                }
                return RecyclerView.this.f36863e.m53127m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f36874j0.getItemCount() + RecyclerView.this.m53468O());
        }

        /* renamed from: d */
        public void m53340d() {
            this.f36944a.clear();
            ArrayList arrayList = this.f36945b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: e */
        public void m53339e(ViewHolder viewHolder) {
            RecyclerListener recyclerListener = RecyclerView.this.f36883o;
            if (recyclerListener != null) {
                recyclerListener.onViewRecycled(viewHolder);
            }
            int size = RecyclerView.this.f36885p.size();
            for (int i = 0; i < size; i++) {
                ((RecyclerListener) RecyclerView.this.f36885p.get(i)).onViewRecycled(viewHolder);
            }
            Adapter adapter = RecyclerView.this.f36879m;
            if (adapter != null) {
                adapter.onViewRecycled(viewHolder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f36874j0 != null) {
                recyclerView.f36867g.m52948q(viewHolder);
            }
            if (RecyclerView.f36817E0) {
                StringBuilder sb = new StringBuilder();
                sb.append("dispatchViewRecycled: ");
                sb.append(viewHolder);
            }
        }

        /* renamed from: f */
        public ViewHolder m53338f(int i) {
            int size;
            int m53127m;
            ArrayList arrayList = this.f36945b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ViewHolder viewHolder = (ViewHolder) this.f36945b.get(i2);
                    if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i) {
                        viewHolder.addFlags(32);
                        return viewHolder;
                    }
                }
                if (RecyclerView.this.f36879m.hasStableIds() && (m53127m = RecyclerView.this.f36863e.m53127m(i)) > 0 && m53127m < RecyclerView.this.f36879m.getItemCount()) {
                    long itemId = RecyclerView.this.f36879m.getItemId(m53127m);
                    for (int i3 = 0; i3 < size; i3++) {
                        ViewHolder viewHolder2 = (ViewHolder) this.f36945b.get(i3);
                        if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                            viewHolder2.addFlags(32);
                            return viewHolder2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: g */
        public RecycledViewPool m53337g() {
            if (this.f36950g == null) {
                this.f36950g = new RecycledViewPool();
                m53327q();
            }
            return this.f36950g;
        }

        @NonNull
        public List<ViewHolder> getScrapList() {
            return this.f36947d;
        }

        @NonNull
        public View getViewForPosition(int i) {
            return m53332l(i, false);
        }

        /* renamed from: h */
        public int m53336h() {
            return this.f36944a.size();
        }

        /* renamed from: i */
        public ViewHolder m53335i(long j, int i, boolean z) {
            for (int size = this.f36944a.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) this.f36944a.get(size);
                if (viewHolder.getItemId() == j && !viewHolder.wasReturnedFromScrap()) {
                    if (i == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.f36874j0.isPreLayout()) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    } else if (!z) {
                        this.f36944a.remove(size);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        m53318z(viewHolder.itemView);
                    }
                }
            }
            int size2 = this.f36946c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                ViewHolder viewHolder2 = (ViewHolder) this.f36946c.get(size2);
                if (viewHolder2.getItemId() == j && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (i == viewHolder2.getItemViewType()) {
                        if (!z) {
                            this.f36946c.remove(size2);
                        }
                        return viewHolder2;
                    } else if (!z) {
                        m53354B(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: j */
        public ViewHolder m53334j(int i, boolean z) {
            View m53100e;
            int size = this.f36944a.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewHolder viewHolder = (ViewHolder) this.f36944a.get(i2);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i && !viewHolder.isInvalid() && (RecyclerView.this.f36874j0.f36976h || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!z && (m53100e = RecyclerView.this.f36865f.m53100e(i)) != null) {
                ViewHolder m53450X = RecyclerView.m53450X(m53100e);
                RecyclerView.this.f36865f.m53086s(m53100e);
                int m53092m = RecyclerView.this.f36865f.m53092m(m53100e);
                if (m53092m != -1) {
                    RecyclerView.this.f36865f.m53101d(m53092m);
                    m53352D(m53100e);
                    m53450X.addFlags(8224);
                    return m53450X;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m53450X + RecyclerView.this.m53468O());
            }
            int size2 = this.f36946c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ViewHolder viewHolder2 = (ViewHolder) this.f36946c.get(i3);
                if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.f36946c.remove(i3);
                    }
                    if (RecyclerView.f36817E0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("getScrapOrHiddenOrCachedHolderForPosition(");
                        sb.append(i);
                        sb.append(") found match in cache: ");
                        sb.append(viewHolder2);
                    }
                    return viewHolder2;
                }
            }
            return null;
        }

        /* renamed from: k */
        public View m53333k(int i) {
            return ((ViewHolder) this.f36944a.get(i)).itemView;
        }

        /* renamed from: l */
        public View m53332l(int i, boolean z) {
            return m53348H(i, z, Long.MAX_VALUE).itemView;
        }

        /* renamed from: m */
        public final void m53331m(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m53331m((ViewGroup) childAt, true);
                }
            }
            if (!z) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }

        /* renamed from: n */
        public final void m53330n(ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ViewGroup) {
                m53331m((ViewGroup) view, false);
            }
        }

        /* renamed from: o */
        public void m53329o() {
            int size = this.f36946c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) ((ViewHolder) this.f36946c.get(i)).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f36935c = true;
                }
            }
        }

        /* renamed from: p */
        public void m53328p() {
            int size = this.f36946c.size();
            for (int i = 0; i < size; i++) {
                ViewHolder viewHolder = (ViewHolder) this.f36946c.get(i);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            Adapter adapter = RecyclerView.this.f36879m;
            if (adapter == null || !adapter.hasStableIds()) {
                m53355A();
            }
        }

        /* renamed from: q */
        public final void m53327q() {
            if (this.f36950g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f36879m != null && recyclerView.isAttachedToWindow()) {
                    this.f36950g.m53365b(RecyclerView.this.f36879m);
                }
            }
        }

        /* renamed from: r */
        public void m53326r(int i, int i2) {
            int size = this.f36946c.size();
            for (int i3 = 0; i3 < size; i3++) {
                ViewHolder viewHolder = (ViewHolder) this.f36946c.get(i3);
                if (viewHolder != null && viewHolder.mPosition >= i) {
                    if (RecyclerView.f36817E0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("offsetPositionRecordsForInsert cached ");
                        sb.append(i3);
                        sb.append(" holder ");
                        sb.append(viewHolder);
                        sb.append(" now at position ");
                        sb.append(viewHolder.mPosition + i2);
                    }
                    viewHolder.offsetPosition(i2, false);
                }
            }
        }

        public void recycleView(@NonNull View view) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (m53450X.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m53450X.isScrap()) {
                m53450X.unScrap();
            } else if (m53450X.wasReturnedFromScrap()) {
                m53450X.clearReturnedFromScrapFlag();
            }
            m53353C(m53450X);
            if (RecyclerView.this.f36846O != null && !m53450X.isRecyclable()) {
                RecyclerView.this.f36846O.endAnimation(m53450X);
            }
        }

        /* renamed from: s */
        public void m53325s(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f36946c.size();
            for (int i7 = 0; i7 < size; i7++) {
                ViewHolder viewHolder = (ViewHolder) this.f36946c.get(i7);
                if (viewHolder != null && (i6 = viewHolder.mPosition) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        viewHolder.offsetPosition(i2 - i, false);
                    } else {
                        viewHolder.offsetPosition(i3, false);
                    }
                    if (RecyclerView.f36817E0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("offsetPositionRecordsForMove cached child ");
                        sb.append(i7);
                        sb.append(" holder ");
                        sb.append(viewHolder);
                    }
                }
            }
        }

        public void setViewCacheSize(int i) {
            this.f36948e = i;
            m53346J();
        }

        /* renamed from: t */
        public void m53324t(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f36946c.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) this.f36946c.get(size);
                if (viewHolder != null) {
                    int i4 = viewHolder.mPosition;
                    if (i4 >= i3) {
                        if (RecyclerView.f36817E0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("offsetPositionRecordsForRemove cached ");
                            sb.append(size);
                            sb.append(" holder ");
                            sb.append(viewHolder);
                            sb.append(" now at position ");
                            sb.append(viewHolder.mPosition - i2);
                        }
                        viewHolder.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        viewHolder.addFlags(8);
                        m53354B(size);
                    }
                }
            }
        }

        /* renamed from: u */
        public void m53323u(Adapter adapter, Adapter adapter2, boolean z) {
            clear();
            m53319y(adapter, true);
            m53337g().m53359h(adapter, adapter2, z);
            m53327q();
        }

        /* renamed from: v */
        public void m53322v() {
            m53327q();
        }

        /* renamed from: w */
        public void m53321w() {
            for (int i = 0; i < this.f36946c.size(); i++) {
                PoolingContainer.callPoolingContainerOnRelease(((ViewHolder) this.f36946c.get(i)).itemView);
            }
            m53320x(RecyclerView.this.f36879m);
        }

        /* renamed from: x */
        public final void m53320x(Adapter adapter) {
            m53319y(adapter, false);
        }

        /* renamed from: y */
        public final void m53319y(Adapter adapter, boolean z) {
            RecycledViewPool recycledViewPool = this.f36950g;
            if (recycledViewPool != null) {
                recycledViewPool.m53363d(adapter, z);
            }
        }

        /* renamed from: z */
        public void m53318z(View view) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            m53450X.mScrapContainer = null;
            m53450X.mInChangeScrap = false;
            m53450X.clearReturnedFromScrapFlag();
            m53353C(m53450X);
        }
    }

    /* loaded from: classes2.dex */
    public interface RecyclerListener {
        void onViewRecycled(@NonNull ViewHolder viewHolder);
    }

    /* loaded from: classes2.dex */
    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class SmoothScroller {

        /* renamed from: b */
        public RecyclerView f36955b;

        /* renamed from: c */
        public LayoutManager f36956c;

        /* renamed from: d */
        public boolean f36957d;

        /* renamed from: e */
        public boolean f36958e;

        /* renamed from: f */
        public View f36959f;

        /* renamed from: h */
        public boolean f36961h;

        /* renamed from: a */
        public int f36954a = -1;

        /* renamed from: g */
        public final Action f36960g = new Action(0, 0);

        /* loaded from: classes2.dex */
        public static class Action {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;

            /* renamed from: a */
            public int f36962a;

            /* renamed from: b */
            public int f36963b;

            /* renamed from: c */
            public int f36964c;

            /* renamed from: d */
            public int f36965d;

            /* renamed from: e */
            public Interpolator f36966e;

            /* renamed from: f */
            public boolean f36967f;

            /* renamed from: g */
            public int f36968g;

            public Action(@InterfaceC2055Px int i, @InterfaceC2055Px int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: a */
            public boolean m53311a() {
                if (this.f36965d >= 0) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public void m53310b(RecyclerView recyclerView) {
                int i = this.f36965d;
                if (i >= 0) {
                    this.f36965d = -1;
                    recyclerView.m53418m0(i);
                    this.f36967f = false;
                } else if (this.f36967f) {
                    m53309c();
                    recyclerView.f36868g0.m53290f(this.f36962a, this.f36963b, this.f36964c, this.f36966e);
                    this.f36968g++;
                    this.f36967f = false;
                } else {
                    this.f36968g = 0;
                }
            }

            /* renamed from: c */
            public final void m53309c() {
                if (this.f36966e != null && this.f36964c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f36964c >= 1) {
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }

            public int getDuration() {
                return this.f36964c;
            }

            @InterfaceC2055Px
            public int getDx() {
                return this.f36962a;
            }

            @InterfaceC2055Px
            public int getDy() {
                return this.f36963b;
            }

            @Nullable
            public Interpolator getInterpolator() {
                return this.f36966e;
            }

            public void jumpTo(int i) {
                this.f36965d = i;
            }

            public void setDuration(int i) {
                this.f36967f = true;
                this.f36964c = i;
            }

            public void setDx(@InterfaceC2055Px int i) {
                this.f36967f = true;
                this.f36962a = i;
            }

            public void setDy(@InterfaceC2055Px int i) {
                this.f36967f = true;
                this.f36963b = i;
            }

            public void setInterpolator(@Nullable Interpolator interpolator) {
                this.f36967f = true;
                this.f36966e = interpolator;
            }

            public void update(@InterfaceC2055Px int i, @InterfaceC2055Px int i2, int i3, @Nullable Interpolator interpolator) {
                this.f36962a = i;
                this.f36963b = i2;
                this.f36964c = i3;
                this.f36966e = interpolator;
                this.f36967f = true;
            }

            public Action(@InterfaceC2055Px int i, @InterfaceC2055Px int i2, int i3) {
                this(i, i2, i3, null);
            }

            public Action(@InterfaceC2055Px int i, @InterfaceC2055Px int i2, int i3, @Nullable Interpolator interpolator) {
                this.f36965d = -1;
                this.f36967f = false;
                this.f36968g = 0;
                this.f36962a = i;
                this.f36963b = i2;
                this.f36964c = i3;
                this.f36966e = interpolator;
            }
        }

        /* loaded from: classes2.dex */
        public interface ScrollVectorProvider {
            @Nullable
            PointF computeScrollVectorForPosition(int i);
        }

        /* renamed from: a */
        public void m53313a(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.f36955b;
            if (this.f36954a == -1 || recyclerView == null) {
                stop();
            }
            if (this.f36957d && this.f36959f == null && this.f36956c != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.f36954a)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (f != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.m53463Q0((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.f36957d = false;
            View view = this.f36959f;
            if (view != null) {
                if (getChildPosition(view) == this.f36954a) {
                    onTargetFound(this.f36959f, recyclerView.f36874j0, this.f36960g);
                    this.f36960g.m53310b(recyclerView);
                    stop();
                } else {
                    this.f36959f = null;
                }
            }
            if (this.f36958e) {
                onSeekTargetStep(i, i2, recyclerView.f36874j0, this.f36960g);
                boolean m53311a = this.f36960g.m53311a();
                this.f36960g.m53310b(recyclerView);
                if (m53311a && this.f36958e) {
                    this.f36957d = true;
                    recyclerView.f36868g0.m53291d();
                }
            }
        }

        /* renamed from: b */
        public void m53312b(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.f36868g0.stop();
            if (this.f36961h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f36955b = recyclerView;
            this.f36956c = layoutManager;
            int i = this.f36954a;
            if (i != -1) {
                recyclerView.f36874j0.f36969a = i;
                this.f36958e = true;
                this.f36957d = true;
                this.f36959f = findViewByPosition(getTargetPosition());
                onStart();
                this.f36955b.f36868g0.m53291d();
                this.f36961h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i) {
            LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.f36955b.f36881n.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.f36955b.f36881n.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.f36955b.getChildLayoutPosition(view);
        }

        @Nullable
        public LayoutManager getLayoutManager() {
            return this.f36956c;
        }

        public int getTargetPosition() {
            return this.f36954a;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.f36955b.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.f36957d;
        }

        public boolean isRunning() {
            return this.f36958e;
        }

        public void normalize(@NonNull PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.f36959f = view;
                boolean z = RecyclerView.f36816D0;
            }
        }

        public abstract void onSeekTargetStep(@InterfaceC2055Px int i, @InterfaceC2055Px int i2, @NonNull State state, @NonNull Action action);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@NonNull View view, @NonNull State state, @NonNull Action action);

        public void setTargetPosition(int i) {
            this.f36954a = i;
        }

        public final void stop() {
            if (!this.f36958e) {
                return;
            }
            this.f36958e = false;
            onStop();
            this.f36955b.f36874j0.f36969a = -1;
            this.f36959f = null;
            this.f36954a = -1;
            this.f36957d = false;
            this.f36956c.m53379k(this);
            this.f36956c = null;
            this.f36955b = null;
        }
    }

    /* loaded from: classes2.dex */
    public static class State {

        /* renamed from: b */
        public SparseArray f36970b;

        /* renamed from: m */
        public int f36981m;

        /* renamed from: n */
        public long f36982n;

        /* renamed from: o */
        public int f36983o;

        /* renamed from: p */
        public int f36984p;

        /* renamed from: q */
        public int f36985q;

        /* renamed from: a */
        public int f36969a = -1;

        /* renamed from: c */
        public int f36971c = 0;

        /* renamed from: d */
        public int f36972d = 0;

        /* renamed from: e */
        public int f36973e = 1;

        /* renamed from: f */
        public int f36974f = 0;

        /* renamed from: g */
        public boolean f36975g = false;

        /* renamed from: h */
        public boolean f36976h = false;

        /* renamed from: i */
        public boolean f36977i = false;

        /* renamed from: j */
        public boolean f36978j = false;

        /* renamed from: k */
        public boolean f36979k = false;

        /* renamed from: l */
        public boolean f36980l = false;

        /* renamed from: a */
        public void m53308a(int i) {
            if ((this.f36973e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f36973e));
        }

        /* renamed from: b */
        public void m53307b(Adapter adapter) {
            this.f36973e = 1;
            this.f36974f = adapter.getItemCount();
            this.f36976h = false;
            this.f36977i = false;
            this.f36978j = false;
        }

        public boolean didStructureChange() {
            return this.f36975g;
        }

        public <T> T get(int i) {
            SparseArray sparseArray = this.f36970b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i);
        }

        public int getItemCount() {
            if (this.f36976h) {
                return this.f36971c - this.f36972d;
            }
            return this.f36974f;
        }

        public int getRemainingScrollHorizontal() {
            return this.f36984p;
        }

        public int getRemainingScrollVertical() {
            return this.f36985q;
        }

        public int getTargetScrollPosition() {
            return this.f36969a;
        }

        public boolean hasTargetScrollPosition() {
            if (this.f36969a != -1) {
                return true;
            }
            return false;
        }

        public boolean isMeasuring() {
            return this.f36978j;
        }

        public boolean isPreLayout() {
            return this.f36976h;
        }

        public void put(int i, Object obj) {
            if (this.f36970b == null) {
                this.f36970b = new SparseArray();
            }
            this.f36970b.put(i, obj);
        }

        public void remove(int i) {
            SparseArray sparseArray = this.f36970b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i);
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f36969a + ", mData=" + this.f36970b + ", mItemCount=" + this.f36974f + ", mIsMeasuring=" + this.f36978j + ", mPreviousLayoutItemCount=" + this.f36971c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f36972d + ", mStructureChanged=" + this.f36975g + ", mInPreLayout=" + this.f36976h + ", mRunSimpleAnimations=" + this.f36979k + ", mRunPredictiveAnimations=" + this.f36980l + '}';
        }

        public boolean willRunPredictiveAnimations() {
            return this.f36980l;
        }

        public boolean willRunSimpleAnimations() {
            return this.f36979k;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ViewCacheExtension {
        @Nullable
        public abstract View getViewForPositionAndType(@NonNull Recycler recycler, int i, int i2);
    }

    /* loaded from: classes2.dex */
    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @NonNull
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public ViewHolder(@NonNull View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: a */
        public final void m53306a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                m53306a();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView)) {
                return true;
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m53454V(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int m53454V;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (m53454V = this.mOwnerRecyclerView.m53454V(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, m53454V);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        public boolean hasAnyOfTheFlags(int i) {
            if ((i & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & 512) == 0 && !isInvalid()) {
                return false;
            }
            return true;
        }

        public boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
                return true;
            }
            return false;
        }

        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView)) {
                return true;
            }
            return false;
        }

        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        public boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f36935c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(this.itemView);
            }
            recyclerView.m53459S0(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.m53459S0(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.f36816D0 && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m53413p(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                if (!RecyclerView.f36816D0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                    sb.append(this);
                } else {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && i == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.f36817E0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("setIsRecyclable val:");
                sb2.append(z);
                sb2.append(":");
                sb2.append(this);
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb.append(str);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.m53347I(this);
        }

        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes2.dex */
    public class RunnableC4918a implements Runnable {
        public RunnableC4918a() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f36899w && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f36893t) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f36905z) {
                    recyclerView2.f36903y = true;
                } else {
                    recyclerView2.m53401v();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes2.dex */
    public class RunnableC4919b implements Runnable {
        public RunnableC4919b() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ItemAnimator itemAnimator = RecyclerView.this.f36846O;
            if (itemAnimator != null) {
                itemAnimator.runPendingAnimations();
            }
            RecyclerView.this.f36886p0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    /* loaded from: classes2.dex */
    public class animationInterpolatorC4920c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes2.dex */
    public class C4921d implements C4977k.InterfaceC4979b {
        public C4921d() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.C4977k.InterfaceC4979b
        /* renamed from: a */
        public void mo52944a(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            RecyclerView.this.m53427i(viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        @Override // androidx.recyclerview.widget.C4977k.InterfaceC4979b
        /* renamed from: b */
        public void mo52943b(ViewHolder viewHolder) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f36881n.removeAndRecycleView(viewHolder.itemView, recyclerView.f36859c);
        }

        @Override // androidx.recyclerview.widget.C4977k.InterfaceC4979b
        /* renamed from: c */
        public void mo52942c(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            RecyclerView.this.f36859c.m53347I(viewHolder);
            RecyclerView.this.m53423k(viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        @Override // androidx.recyclerview.widget.C4977k.InterfaceC4979b
        /* renamed from: d */
        public void mo52941d(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            viewHolder.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f36837F) {
                if (recyclerView.f36846O.animateChange(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    RecyclerView.this.m53396x0();
                }
            } else if (recyclerView.f36846O.animatePersistence(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                RecyclerView.this.m53396x0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes2.dex */
    public class C4922e implements C4949b.InterfaceC4951b {
        public C4922e() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: a */
        public View mo53076a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: b */
        public void mo53075b(View view) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (m53450X != null) {
                m53450X.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: c */
        public int mo53074c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: d */
        public ViewHolder mo53073d(View view) {
            return RecyclerView.m53450X(view);
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: e */
        public void mo53072e(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.m53393z(view);
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: f */
        public void mo53071f() {
            int mo53074c = mo53074c();
            for (int i = 0; i < mo53074c; i++) {
                View mo53076a = mo53076a(i);
                RecyclerView.this.m53496A(mo53076a);
                mo53076a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: g */
        public void mo53070g(View view, int i, ViewGroup.LayoutParams layoutParams) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (m53450X != null) {
                if (!m53450X.isTmpDetached() && !m53450X.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m53450X + RecyclerView.this.m53468O());
                }
                if (RecyclerView.f36817E0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("reAttach ");
                    sb.append(m53450X);
                }
                m53450X.clearTmpDetachFlag();
            } else if (RecyclerView.f36816D0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i + RecyclerView.this.m53468O());
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: h */
        public void mo53069h(int i) {
            View mo53076a = mo53076a(i);
            if (mo53076a != null) {
                ViewHolder m53450X = RecyclerView.m53450X(mo53076a);
                if (m53450X != null) {
                    if (m53450X.isTmpDetached() && !m53450X.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + m53450X + RecyclerView.this.m53468O());
                    }
                    if (RecyclerView.f36817E0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("tmpDetach ");
                        sb.append(m53450X);
                    }
                    m53450X.addFlags(256);
                }
            } else if (RecyclerView.f36816D0) {
                throw new IllegalArgumentException("No view at offset " + i + RecyclerView.this.m53468O());
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: i */
        public int mo53068i(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: j */
        public void mo53067j(View view) {
            ViewHolder m53450X = RecyclerView.m53450X(view);
            if (m53450X != null) {
                m53450X.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C4949b.InterfaceC4951b
        /* renamed from: k */
        public void mo53066k(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.m53496A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes2.dex */
    public class C4923f implements C4946a.InterfaceC4947a {
        public C4923f() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.C4946a.InterfaceC4947a
        /* renamed from: a */
        public void mo53113a(int i, int i2) {
            RecyclerView.this.m53408r0(i, i2);
            RecyclerView.this.f36880m0 = true;
        }

        @Override // androidx.recyclerview.widget.C4946a.InterfaceC4947a
        /* renamed from: b */
        public void mo53112b(C4946a.C4948b c4948b) {
            m53305i(c4948b);
        }

        @Override // androidx.recyclerview.widget.C4946a.InterfaceC4947a
        /* renamed from: c */
        public void mo53111c(C4946a.C4948b c4948b) {
            m53305i(c4948b);
        }

        @Override // androidx.recyclerview.widget.C4946a.InterfaceC4947a
        /* renamed from: d */
        public ViewHolder mo53110d(int i) {
            ViewHolder m53456U = RecyclerView.this.m53456U(i, true);
            if (m53456U == null) {
                return null;
            }
            if (RecyclerView.this.f36865f.m53091n(m53456U.itemView)) {
                boolean z = RecyclerView.f36816D0;
                return null;
            }
            return m53456U;
        }

        @Override // androidx.recyclerview.widget.C4946a.InterfaceC4947a
        /* renamed from: e */
        public void mo53109e(int i, int i2) {
            RecyclerView.this.m53410q0(i, i2);
            RecyclerView.this.f36880m0 = true;
        }

        @Override // androidx.recyclerview.widget.C4946a.InterfaceC4947a
        /* renamed from: f */
        public void mo53108f(int i, int i2) {
            RecyclerView.this.m53406s0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f36880m0 = true;
            recyclerView.f36874j0.f36972d += i2;
        }

        @Override // androidx.recyclerview.widget.C4946a.InterfaceC4947a
        /* renamed from: g */
        public void mo53107g(int i, int i2) {
            RecyclerView.this.m53406s0(i, i2, false);
            RecyclerView.this.f36880m0 = true;
        }

        @Override // androidx.recyclerview.widget.C4946a.InterfaceC4947a
        /* renamed from: h */
        public void mo53106h(int i, int i2, Object obj) {
            RecyclerView.this.m53442a1(i, i2, obj);
            RecyclerView.this.f36882n0 = true;
        }

        /* renamed from: i */
        public void m53305i(C4946a.C4948b c4948b) {
            int i = c4948b.f37115a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 8) {
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.f36881n.onItemsMoved(recyclerView, c4948b.f37116b, c4948b.f37118d, 1);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.f36881n.onItemsUpdated(recyclerView2, c4948b.f37116b, c4948b.f37118d, c4948b.f37117c);
                    return;
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f36881n.onItemsRemoved(recyclerView3, c4948b.f37116b, c4948b.f37118d);
                return;
            }
            RecyclerView recyclerView4 = RecyclerView.this;
            recyclerView4.f36881n.onItemsAdded(recyclerView4, c4948b.f37116b, c4948b.f37118d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4924g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36991a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f36991a = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36991a[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes2.dex */
    public static class C4925h extends Observable {
        /* renamed from: a */
        public boolean m53304a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m53303b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* renamed from: c */
        public void m53302c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void m53301d(int i, int i2) {
            m53300e(i, i2, null);
        }

        /* renamed from: e */
        public void m53300e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void m53299f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        /* renamed from: g */
        public void m53298g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        /* renamed from: h */
        public void m53297h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes2.dex */
    public class C4926i implements ItemAnimator.InterfaceC4913a {
        public C4926i() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.InterfaceC4913a
        /* renamed from: a */
        public void mo53296a(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (!viewHolder.shouldBeKeptAsChild() && !RecyclerView.this.m53479I0(viewHolder.itemView) && viewHolder.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes2.dex */
    public class C4927j extends AdapterDataObserver {
        public C4927j() {
            RecyclerView.this = r1;
        }

        /* renamed from: a */
        public void m53295a() {
            if (RecyclerView.f36822J0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f36895u && recyclerView.f36893t) {
                    ViewCompat.postOnAnimation(recyclerView, recyclerView.f36871i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f36833C = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView.this.m53419m(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f36874j0.f36975g = true;
            recyclerView.m53495A0(true);
            if (!RecyclerView.this.f36863e.m53124p()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.this.m53419m(null);
            if (RecyclerView.this.f36863e.m53122r(i, i2, obj)) {
                m53295a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            RecyclerView.this.m53419m(null);
            if (RecyclerView.this.f36863e.m53121s(i, i2)) {
                m53295a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.this.m53419m(null);
            if (RecyclerView.this.f36863e.m53120t(i, i2, i3)) {
                m53295a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            RecyclerView.this.m53419m(null);
            if (RecyclerView.this.f36863e.m53119u(i, i2)) {
                m53295a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f36861d != null && (adapter = recyclerView.f36879m) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes2.dex */
    public static class C4928k extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        public EdgeEffect createEdgeEffect(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes2.dex */
    public class RunnableC4929l implements Runnable {

        /* renamed from: a */
        public int f36994a;

        /* renamed from: b */
        public int f36995b;

        /* renamed from: c */
        public OverScroller f36996c;

        /* renamed from: d */
        public Interpolator f36997d;

        /* renamed from: e */
        public boolean f36998e;

        /* renamed from: f */
        public boolean f36999f;

        public RunnableC4929l() {
            RecyclerView.this = r3;
            Interpolator interpolator = RecyclerView.f36827O0;
            this.f36997d = interpolator;
            this.f36998e = false;
            this.f36999f = false;
            this.f36996c = new OverScroller(r3.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int m53294a(int i, int i2) {
            boolean z;
            int height;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((abs / height) + 1.0f) * 300.0f), (int) Constants.MAX_URL_LENGTH);
        }

        /* renamed from: b */
        public void m53293b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f36995b = 0;
            this.f36994a = 0;
            Interpolator interpolator = this.f36997d;
            Interpolator interpolator2 = RecyclerView.f36827O0;
            if (interpolator != interpolator2) {
                this.f36997d = interpolator2;
                this.f36996c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f36996c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m53291d();
        }

        /* renamed from: c */
        public final void m53292c() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.postOnAnimation(RecyclerView.this, this);
        }

        /* renamed from: d */
        public void m53291d() {
            if (this.f36998e) {
                this.f36999f = true;
            } else {
                m53292c();
            }
        }

        /* renamed from: f */
        public void m53290f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m53294a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f36827O0;
            }
            if (this.f36997d != interpolator) {
                this.f36997d = interpolator;
                this.f36996c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f36995b = 0;
            this.f36994a = 0;
            RecyclerView.this.setScrollState(2);
            this.f36996c.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f36996c.computeScrollOffset();
            }
            m53291d();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f36881n == null) {
                stop();
                return;
            }
            this.f36999f = false;
            this.f36998e = true;
            recyclerView.m53401v();
            OverScroller overScroller = this.f36996c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f36994a;
                int i5 = currY - this.f36995b;
                this.f36994a = currX;
                this.f36995b = currY;
                int m53407s = RecyclerView.this.m53407s(i4);
                int m53403u = RecyclerView.this.m53403u(i5);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f36900w0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(m53407s, m53403u, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f36900w0;
                    m53407s -= iArr2[0];
                    m53403u -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m53409r(m53407s, m53403u);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f36879m != null) {
                    int[] iArr3 = recyclerView3.f36900w0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m53463Q0(m53407s, m53403u, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f36900w0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    m53407s -= i2;
                    m53403u -= i;
                    SmoothScroller smoothScroller = recyclerView4.f36881n.f36919g;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int itemCount = RecyclerView.this.f36874j0.getItemCount();
                        if (itemCount == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= itemCount) {
                            smoothScroller.setTargetPosition(itemCount - 1);
                            smoothScroller.m53313a(i2, i);
                        } else {
                            smoothScroller.m53313a(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f36887q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f36900w0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, m53407s, m53403u, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f36900w0;
                int i6 = m53407s - iArr6[0];
                int i7 = m53403u - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.m53482H(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!overScroller.isFinished() && ((!z && i6 == 0) || (!z2 && i7 == 0))) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                SmoothScroller smoothScroller2 = RecyclerView.this.f36881n.f36919g;
                if ((smoothScroller2 == null || !smoothScroller2.isPendingInitialRun()) && z3) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.m53444a(i3, currVelocity);
                    }
                    if (RecyclerView.f36823K0) {
                        RecyclerView.this.f36872i0.m53008a();
                    }
                } else {
                    m53291d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC4959e runnableC4959e = recyclerView7.f36870h0;
                    if (runnableC4959e != null) {
                        runnableC4959e.m53014g(recyclerView7, i2, i);
                    }
                }
            }
            SmoothScroller smoothScroller3 = RecyclerView.this.f36881n.f36919g;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.m53313a(0, 0);
            }
            this.f36998e = false;
            if (this.f36999f) {
                m53292c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.f36996c.abortAnimation();
        }
    }

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        f36820H0 = false;
        if (i >= 23) {
            z = true;
        } else {
            z = false;
        }
        f36821I0 = z;
        f36822J0 = true;
        f36823K0 = true;
        f36824L0 = false;
        f36825M0 = false;
        Class cls = Integer.TYPE;
        f36826N0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f36827O0 = new animationInterpolatorC4920c();
        f36828P0 = new C4928k();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: G0 */
    private int m53483G0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f36843L;
        float f2 = 0.0f;
        if (edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.f36843L.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.onPullDistance(this.f36843L, -height, width);
                if (EdgeEffectCompat.getDistance(this.f36843L) == 0.0f) {
                    this.f36843L.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f36845N;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f36845N.onRelease();
                } else {
                    float onPullDistance = EdgeEffectCompat.onPullDistance(this.f36845N, height, 1.0f - width);
                    if (EdgeEffectCompat.getDistance(this.f36845N) == 0.0f) {
                        this.f36845N.onRelease();
                    }
                    f2 = onPullDistance;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    /* renamed from: S */
    public static RecyclerView m53460S(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView m53460S = m53460S(viewGroup.getChildAt(i));
            if (m53460S != null) {
                return m53460S;
            }
        }
        return null;
    }

    /* renamed from: X */
    public static ViewHolder m53450X(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f36933a;
    }

    /* renamed from: X0 */
    private boolean m53449X0(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f36842K;
        if (edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
            EdgeEffectCompat.onPullDistance(this.f36842K, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f36844M;
        if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            EdgeEffectCompat.onPullDistance(this.f36844M, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.f36843L;
        if (edgeEffect3 != null && EdgeEffectCompat.getDistance(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            EdgeEffectCompat.onPullDistance(this.f36843L, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.f36845N;
        if (edgeEffect4 != null && EdgeEffectCompat.getDistance(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
            EdgeEffectCompat.onPullDistance(this.f36845N, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    /* renamed from: Y */
    public static void m53448Y(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f36934b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    /* renamed from: c0 */
    private float m53438c0(int i) {
        double log = Math.log((Math.abs(i) * 0.35f) / (this.f36855a * 0.015f));
        float f = f36819G0;
        return (float) (this.f36855a * 0.015f * Math.exp((f / (f - 1.0d)) * log));
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.f36894t0 == null) {
            this.f36894t0 = new NestedScrollingChildHelper(this);
        }
        return this.f36894t0;
    }

    /* renamed from: p */
    public static void m53413p(ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        f36816D0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        f36817E0 = z;
    }

    /* renamed from: A */
    public void m53496A(View view) {
        ViewHolder m53450X = m53450X(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.f36879m;
        if (adapter != null && m53450X != null) {
            adapter.onViewDetachedFromWindow(m53450X);
        }
        List list = this.f36836E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((OnChildAttachStateChangeListener) this.f36836E.get(size)).onChildViewDetachedFromWindow(view);
            }
        }
    }

    /* renamed from: A0 */
    public void m53495A0(boolean z) {
        this.f36838G = z | this.f36838G;
        this.f36837F = true;
        m53414o0();
    }

    /* renamed from: B */
    public final void m53494B() {
        int i = this.f36831B;
        this.f36831B = 0;
        if (i != 0 && m53422k0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            AccessibilityEventCompat.setContentChangeTypes(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m53493B0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.m53474L()
            android.widget.EdgeEffect r3 = r6.f36842K
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.m53472M()
            android.widget.EdgeEffect r3 = r6.f36844M
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.m53470N()
            android.widget.EdgeEffect r9 = r6.f36843L
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.m53476K()
            android.widget.EdgeEffect r9 = r6.f36845N
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m53493B0(float, float, float, float):void");
    }

    /* renamed from: C */
    public void m53492C() {
        boolean z;
        if (this.f36879m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f36881n == null) {
        } else {
            this.f36874j0.f36978j = false;
            if (this.f36906z0 && (this.f36830A0 != getWidth() || this.f36832B0 != getHeight())) {
                z = true;
            } else {
                z = false;
            }
            this.f36830A0 = 0;
            this.f36832B0 = 0;
            this.f36906z0 = false;
            if (this.f36874j0.f36973e == 1) {
                m53490D();
                this.f36881n.m53374p(this);
                m53488E();
            } else if (!this.f36863e.m53123q() && !z && this.f36881n.getWidth() == getWidth() && this.f36881n.getHeight() == getHeight()) {
                this.f36881n.m53374p(this);
            } else {
                this.f36881n.m53374p(this);
                m53488E();
            }
            m53486F();
        }
    }

    /* renamed from: C0 */
    public void m53491C0(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        if (this.f36874j0.f36977i && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.f36867g.m52962c(m53452W(viewHolder), viewHolder);
        }
        this.f36867g.m52960e(viewHolder, itemHolderInfo);
    }

    /* renamed from: D */
    public final void m53490D() {
        boolean z = true;
        this.f36874j0.m53308a(1);
        m53466P(this.f36874j0);
        this.f36874j0.f36978j = false;
        m53451W0();
        this.f36867g.m52959f();
        m53404t0();
        m53392z0();
        m53469N0();
        State state = this.f36874j0;
        state.f36977i = (state.f36979k && this.f36882n0) ? false : false;
        this.f36882n0 = false;
        this.f36880m0 = false;
        state.f36976h = state.f36980l;
        state.f36974f = this.f36879m.getItemCount();
        m53462R(this.f36892s0);
        if (this.f36874j0.f36979k) {
            int m53098g = this.f36865f.m53098g();
            for (int i = 0; i < m53098g; i++) {
                ViewHolder m53450X = m53450X(this.f36865f.m53099f(i));
                if (!m53450X.shouldIgnore() && (!m53450X.isInvalid() || this.f36879m.hasStableIds())) {
                    this.f36867g.m52960e(m53450X, this.f36846O.recordPreLayoutInformation(this.f36874j0, m53450X, ItemAnimator.m53391a(m53450X), m53450X.getUnmodifiedPayloads()));
                    if (this.f36874j0.f36977i && m53450X.isUpdated() && !m53450X.isRemoved() && !m53450X.shouldIgnore() && !m53450X.isInvalid()) {
                        this.f36867g.m52962c(m53452W(m53450X), m53450X);
                    }
                }
            }
        }
        if (this.f36874j0.f36980l) {
            m53467O0();
            State state2 = this.f36874j0;
            boolean z2 = state2.f36975g;
            state2.f36975g = false;
            this.f36881n.onLayoutChildren(this.f36859c, state2);
            this.f36874j0.f36975g = z2;
            for (int i2 = 0; i2 < this.f36865f.m53098g(); i2++) {
                ViewHolder m53450X2 = m53450X(this.f36865f.m53099f(i2));
                if (!m53450X2.shouldIgnore() && !this.f36867g.m52956i(m53450X2)) {
                    int m53391a = ItemAnimator.m53391a(m53450X2);
                    boolean hasAnyOfTheFlags = m53450X2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        m53391a |= 4096;
                    }
                    ItemAnimator.ItemHolderInfo recordPreLayoutInformation = this.f36846O.recordPreLayoutInformation(this.f36874j0, m53450X2, m53391a, m53450X2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        m53491C0(m53450X2, recordPreLayoutInformation);
                    } else {
                        this.f36867g.m52964a(m53450X2, recordPreLayoutInformation);
                    }
                }
            }
            m53411q();
        } else {
            m53411q();
        }
        m53402u0();
        m53447Y0(false);
        this.f36874j0.f36973e = 2;
    }

    /* renamed from: D0 */
    public final void m53489D0() {
        ViewHolder viewHolder;
        View findViewById;
        if (this.f36866f0 && this.f36879m != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (f36825M0 && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.f36865f.m53098g() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.f36865f.m53091n(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.f36874j0.f36982n != -1 && this.f36879m.hasStableIds()) {
                    viewHolder = findViewHolderForItemId(this.f36874j0.f36982n);
                } else {
                    viewHolder = null;
                }
                if (viewHolder != null && !this.f36865f.m53091n(viewHolder.itemView) && viewHolder.itemView.hasFocusable()) {
                    view = viewHolder.itemView;
                } else if (this.f36865f.m53098g() > 0) {
                    view = m53458T();
                }
                if (view != null) {
                    int i = this.f36874j0.f36983o;
                    if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: E */
    public final void m53488E() {
        boolean z;
        m53451W0();
        m53404t0();
        this.f36874j0.m53308a(6);
        this.f36863e.m53130j();
        this.f36874j0.f36974f = this.f36879m.getItemCount();
        this.f36874j0.f36972d = 0;
        if (this.f36861d != null && this.f36879m.canRestoreState()) {
            Parcelable parcelable = this.f36861d.f36953b;
            if (parcelable != null) {
                this.f36881n.onRestoreInstanceState(parcelable);
            }
            this.f36861d = null;
        }
        State state = this.f36874j0;
        state.f36976h = false;
        this.f36881n.onLayoutChildren(this.f36859c, state);
        State state2 = this.f36874j0;
        state2.f36975g = false;
        if (state2.f36979k && this.f36846O != null) {
            z = true;
        } else {
            z = false;
        }
        state2.f36979k = z;
        state2.f36973e = 4;
        m53402u0();
        m53447Y0(false);
    }

    /* renamed from: E0 */
    public final void m53487E0() {
        boolean z;
        EdgeEffect edgeEffect = this.f36842K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f36842K.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f36843L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f36843L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f36844M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f36844M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f36845N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f36845N.isFinished();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* renamed from: F */
    public final void m53486F() {
        this.f36874j0.m53308a(4);
        m53451W0();
        m53404t0();
        State state = this.f36874j0;
        state.f36973e = 1;
        if (state.f36979k) {
            for (int m53098g = this.f36865f.m53098g() - 1; m53098g >= 0; m53098g--) {
                ViewHolder m53450X = m53450X(this.f36865f.m53099f(m53098g));
                if (!m53450X.shouldIgnore()) {
                    long m53452W = m53452W(m53450X);
                    ItemAnimator.ItemHolderInfo recordPostLayoutInformation = this.f36846O.recordPostLayoutInformation(this.f36874j0, m53450X);
                    ViewHolder m52958g = this.f36867g.m52958g(m53452W);
                    if (m52958g != null && !m52958g.shouldIgnore()) {
                        boolean m52957h = this.f36867g.m52957h(m52958g);
                        boolean m52957h2 = this.f36867g.m52957h(m53450X);
                        if (m52957h && m52958g == m53450X) {
                            this.f36867g.m52961d(m53450X, recordPostLayoutInformation);
                        } else {
                            ItemAnimator.ItemHolderInfo m52951n = this.f36867g.m52951n(m52958g);
                            this.f36867g.m52961d(m53450X, recordPostLayoutInformation);
                            ItemAnimator.ItemHolderInfo m52952m = this.f36867g.m52952m(m53450X);
                            if (m52951n == null) {
                                m53436d0(m53452W, m53450X, m52958g);
                            } else {
                                m53425j(m52958g, m53450X, m52951n, m52952m, m52957h, m52957h2);
                            }
                        }
                    } else {
                        this.f36867g.m52961d(m53450X, recordPostLayoutInformation);
                    }
                }
            }
            this.f36867g.m52950o(this.f36834C0);
        }
        this.f36881n.m53376n(this.f36859c);
        State state2 = this.f36874j0;
        state2.f36971c = state2.f36974f;
        this.f36837F = false;
        this.f36838G = false;
        state2.f36979k = false;
        state2.f36980l = false;
        this.f36881n.f36920h = false;
        ArrayList arrayList = this.f36859c.f36945b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager.f36926n) {
            layoutManager.f36925m = 0;
            layoutManager.f36926n = false;
            this.f36859c.m53346J();
        }
        this.f36881n.onLayoutCompleted(this.f36874j0);
        m53402u0();
        m53447Y0(false);
        this.f36867g.m52959f();
        int[] iArr = this.f36892s0;
        if (m53395y(iArr[0], iArr[1])) {
            m53482H(0, 0);
        }
        m53489D0();
        m53473L0();
    }

    /* renamed from: F0 */
    public final int m53485F0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.f36842K;
        float f2 = 0.0f;
        if (edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.f36842K.onRelease();
            } else {
                float f3 = -EdgeEffectCompat.onPullDistance(this.f36842K, -width, 1.0f - height);
                if (EdgeEffectCompat.getDistance(this.f36842K) == 0.0f) {
                    this.f36842K.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f36844M;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f36844M.onRelease();
                } else {
                    float onPullDistance = EdgeEffectCompat.onPullDistance(this.f36844M, width, height);
                    if (EdgeEffectCompat.getDistance(this.f36844M) == 0.0f) {
                        this.f36844M.onRelease();
                    }
                    f2 = onPullDistance;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    /* renamed from: G */
    public void m53484G(int i) {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        OnScrollListener onScrollListener = this.f36876k0;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i);
        }
        List list = this.f36878l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((OnScrollListener) this.f36878l0.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    /* renamed from: H */
    public void m53482H(int i, int i2) {
        this.f36840I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        OnScrollListener onScrollListener = this.f36876k0;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i, i2);
        }
        List list = this.f36878l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((OnScrollListener) this.f36878l0.get(size)).onScrolled(this, i, i2);
            }
        }
        this.f36840I--;
    }

    /* renamed from: H0 */
    public void m53481H0() {
        ItemAnimator itemAnimator = this.f36846O;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.f36859c);
            this.f36881n.m53376n(this.f36859c);
        }
        this.f36859c.clear();
    }

    /* renamed from: I */
    public void m53480I() {
        int i;
        for (int size = this.f36902x0.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) this.f36902x0.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                ViewCompat.setImportantForAccessibility(viewHolder.itemView, i);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.f36902x0.clear();
    }

    /* renamed from: I0 */
    public boolean m53479I0(View view) {
        m53451W0();
        boolean m53087r = this.f36865f.m53087r(view);
        if (m53087r) {
            ViewHolder m53450X = m53450X(view);
            this.f36859c.m53347I(m53450X);
            this.f36859c.m53353C(m53450X);
            if (f36817E0) {
                StringBuilder sb = new StringBuilder();
                sb.append("after removing animated view: ");
                sb.append(view);
                sb.append(", ");
                sb.append(this);
            }
        }
        m53447Y0(!m53087r);
        return m53087r;
    }

    /* renamed from: J */
    public final boolean m53478J(MotionEvent motionEvent) {
        OnItemTouchListener onItemTouchListener = this.f36891s;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m53464Q(motionEvent);
        }
        onItemTouchListener.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f36891s = null;
        }
        return true;
    }

    /* renamed from: J0 */
    public void m53477J0() {
        ViewHolder viewHolder;
        int m53098g = this.f36865f.m53098g();
        for (int i = 0; i < m53098g; i++) {
            View m53099f = this.f36865f.m53099f(i);
            ViewHolder childViewHolder = getChildViewHolder(m53099f);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = m53099f.getLeft();
                int top = m53099f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: K */
    public void m53476K() {
        if (this.f36845N != null) {
            return;
        }
        EdgeEffect createEdgeEffect = this.f36841J.createEdgeEffect(this, 3);
        this.f36845N = createEdgeEffect;
        if (this.f36869h) {
            createEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            createEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: K0 */
    public final void m53475K0(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f36873j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f36935c) {
                Rect rect = layoutParams2.f36934b;
                Rect rect2 = this.f36873j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f36873j);
            offsetRectIntoDescendantCoords(view, this.f36873j);
        }
        LayoutManager layoutManager = this.f36881n;
        Rect rect3 = this.f36873j;
        boolean z2 = !this.f36899w;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        layoutManager.requestChildRectangleOnScreen(this, view, rect3, z2, z);
    }

    /* renamed from: L */
    public void m53474L() {
        if (this.f36842K != null) {
            return;
        }
        EdgeEffect createEdgeEffect = this.f36841J.createEdgeEffect(this, 0);
        this.f36842K = createEdgeEffect;
        if (this.f36869h) {
            createEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            createEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: L0 */
    public final void m53473L0() {
        State state = this.f36874j0;
        state.f36982n = -1L;
        state.f36981m = -1;
        state.f36983o = -1;
    }

    /* renamed from: M */
    public void m53472M() {
        if (this.f36844M != null) {
            return;
        }
        EdgeEffect createEdgeEffect = this.f36841J.createEdgeEffect(this, 2);
        this.f36844M = createEdgeEffect;
        if (this.f36869h) {
            createEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            createEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: M0 */
    public final void m53471M0() {
        VelocityTracker velocityTracker = this.f36849R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        m53487E0();
    }

    /* renamed from: N */
    public void m53470N() {
        if (this.f36843L != null) {
            return;
        }
        EdgeEffect createEdgeEffect = this.f36841J.createEdgeEffect(this, 1);
        this.f36843L = createEdgeEffect;
        if (this.f36869h) {
            createEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            createEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: N0 */
    public final void m53469N0() {
        View view;
        long j;
        int absoluteAdapterPosition;
        ViewHolder viewHolder = null;
        if (this.f36866f0 && hasFocus() && this.f36879m != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            viewHolder = findContainingViewHolder(view);
        }
        if (viewHolder == null) {
            m53473L0();
            return;
        }
        State state = this.f36874j0;
        if (this.f36879m.hasStableIds()) {
            j = viewHolder.getItemId();
        } else {
            j = -1;
        }
        state.f36982n = j;
        State state2 = this.f36874j0;
        if (this.f36837F) {
            absoluteAdapterPosition = -1;
        } else if (viewHolder.isRemoved()) {
            absoluteAdapterPosition = viewHolder.mOldPosition;
        } else {
            absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        }
        state2.f36981m = absoluteAdapterPosition;
        this.f36874j0.f36983o = m53446Z(viewHolder.itemView);
    }

    /* renamed from: O */
    public String m53468O() {
        return HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + super.toString() + ", adapter:" + this.f36879m + ", layout:" + this.f36881n + ", context:" + getContext();
    }

    /* renamed from: O0 */
    public void m53467O0() {
        int m53095j = this.f36865f.m53095j();
        for (int i = 0; i < m53095j; i++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53096i(i));
            if (f36816D0 && m53450X.mPosition == -1 && !m53450X.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + m53468O());
            }
            if (!m53450X.shouldIgnore()) {
                m53450X.saveOldPosition();
            }
        }
    }

    /* renamed from: P */
    public final void m53466P(State state) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f36868g0.f36996c;
            state.f36984p = overScroller.getFinalX() - overScroller.getCurrX();
            state.f36985q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        state.f36984p = 0;
        state.f36985q = 0;
    }

    /* renamed from: P0 */
    public boolean m53465P0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        m53401v();
        if (this.f36879m != null) {
            int[] iArr = this.f36900w0;
            iArr[0] = 0;
            iArr[1] = 0;
            m53463Q0(i, i2, iArr);
            int[] iArr2 = this.f36900w0;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f36887q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f36900w0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.f36896u0, i3, iArr3);
        int[] iArr4 = this.f36900w0;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        if (i10 == 0 && i12 == 0) {
            z = false;
        } else {
            z = true;
        }
        int i14 = this.f36852U;
        int[] iArr5 = this.f36896u0;
        int i15 = iArr5[0];
        this.f36852U = i14 - i15;
        int i16 = this.f36853V;
        int i17 = iArr5[1];
        this.f36853V = i16 - i17;
        int[] iArr6 = this.f36898v0;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !MotionEventCompat.isFromSource(motionEvent, 8194)) {
                m53493B0(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            m53409r(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            m53482H(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z || i5 != 0 || i4 != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean m53464Q(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f36889r.size();
        for (int i = 0; i < size; i++) {
            OnItemTouchListener onItemTouchListener = (OnItemTouchListener) this.f36889r.get(i);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.f36891s = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    /* renamed from: Q0 */
    public void m53463Q0(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        m53451W0();
        m53404t0();
        TraceCompat.beginSection("RV Scroll");
        m53466P(this.f36874j0);
        if (i != 0) {
            i3 = this.f36881n.scrollHorizontallyBy(i, this.f36859c, this.f36874j0);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.f36881n.scrollVerticallyBy(i2, this.f36859c, this.f36874j0);
        } else {
            i4 = 0;
        }
        TraceCompat.endSection();
        m53477J0();
        m53402u0();
        m53447Y0(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    /* renamed from: R */
    public final void m53462R(int[] iArr) {
        int m53098g = this.f36865f.m53098g();
        if (m53098g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m53098g; i3++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53099f(i3));
            if (!m53450X.shouldIgnore()) {
                int layoutPosition = m53450X.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: R0 */
    public final void m53461R0(Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.f36879m;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f36857b);
            this.f36879m.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            m53481H0();
        }
        this.f36863e.m53115y();
        Adapter adapter3 = this.f36879m;
        this.f36879m = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f36857b);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(adapter3, this.f36879m);
        }
        this.f36859c.m53323u(adapter3, this.f36879m, z);
        this.f36874j0.f36975g = true;
    }

    /* renamed from: S0 */
    public boolean m53459S0(ViewHolder viewHolder, int i) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i;
            this.f36902x0.add(viewHolder);
            return false;
        }
        ViewCompat.setImportantForAccessibility(viewHolder.itemView, i);
        return true;
    }

    /* renamed from: T */
    public final View m53458T() {
        ViewHolder findViewHolderForAdapterPosition;
        State state = this.f36874j0;
        int i = state.f36981m;
        if (i == -1) {
            i = 0;
        }
        int itemCount = state.getItemCount();
        for (int i2 = i; i2 < itemCount; i2++) {
            ViewHolder findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(itemCount, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    /* renamed from: T0 */
    public final boolean m53457T0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        if (m53438c0(-i) < EdgeEffectCompat.getDistance(edgeEffect) * i2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0036 A[SYNTHETIC] */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.ViewHolder m53456U(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f36865f
            int r0 = r0.m53095j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f36865f
            android.view.View r3 = r3.m53096i(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = m53450X(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f36865f
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m53091n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m53456U(int, boolean):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* renamed from: U0 */
    public boolean m53455U0(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i = AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent);
        } else {
            i = 0;
        }
        if (i != 0) {
            i2 = i;
        }
        this.f36831B |= i2;
        return true;
    }

    /* renamed from: V */
    public int m53454V(ViewHolder viewHolder) {
        if (!viewHolder.hasAnyOfTheFlags(524) && viewHolder.isBound()) {
            return this.f36863e.m53135e(viewHolder.mPosition);
        }
        return -1;
    }

    /* renamed from: V0 */
    public void m53453V0(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || this.f36905z) {
            return;
        }
        int i4 = 0;
        if (!layoutManager.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.f36881n.canScrollVertically()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            if (i3 != Integer.MIN_VALUE && i3 <= 0) {
                scrollBy(i, i2);
                return;
            }
            if (z) {
                if (i != 0) {
                    i4 = 1;
                }
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.f36868g0.m53290f(i, i2, i3, interpolator);
        }
    }

    /* renamed from: W */
    public long m53452W(ViewHolder viewHolder) {
        if (this.f36879m.hasStableIds()) {
            return viewHolder.getItemId();
        }
        return viewHolder.mPosition;
    }

    /* renamed from: W0 */
    public void m53451W0() {
        int i = this.f36901x + 1;
        this.f36901x = i;
        if (i == 1 && !this.f36905z) {
            this.f36903y = false;
        }
    }

    /* renamed from: Y0 */
    public void m53447Y0(boolean z) {
        if (this.f36901x < 1) {
            if (!f36816D0) {
                this.f36901x = 1;
            } else {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + m53468O());
            }
        }
        if (!z && !this.f36905z) {
            this.f36903y = false;
        }
        if (this.f36901x == 1) {
            if (z && this.f36903y && !this.f36905z && this.f36881n != null && this.f36879m != null) {
                m53492C();
            }
            if (!this.f36905z) {
                this.f36903y = false;
            }
        }
        this.f36901x--;
    }

    /* renamed from: Z */
    public final int m53446Z(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    /* renamed from: Z0 */
    public final void m53445Z0() {
        this.f36868g0.stop();
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            layoutManager.m53367w();
        }
    }

    /* renamed from: a */
    public void m53444a(int i, int i2) {
        if (i < 0) {
            m53474L();
            if (this.f36842K.isFinished()) {
                this.f36842K.onAbsorb(-i);
            }
        } else if (i > 0) {
            m53472M();
            if (this.f36844M.isFinished()) {
                this.f36844M.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            m53470N();
            if (this.f36843L.isFinished()) {
                this.f36843L.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            m53476K();
            if (this.f36845N.isFinished()) {
                this.f36845N.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* renamed from: a0 */
    public final String m53443a0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: a1 */
    public void m53442a1(int i, int i2, Object obj) {
        int i3;
        int m53095j = this.f36865f.m53095j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < m53095j; i5++) {
            View m53096i = this.f36865f.m53096i(i5);
            ViewHolder m53450X = m53450X(m53096i);
            if (m53450X != null && !m53450X.shouldIgnore() && (i3 = m53450X.mPosition) >= i && i3 < i4) {
                m53450X.addFlags(2);
                m53450X.addChangePayload(obj);
                ((LayoutParams) m53096i.getLayoutParams()).f36935c = true;
            }
        }
        this.f36859c.m53344L(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration, int i) {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f36887q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f36887q.add(itemDecoration);
        } else {
            this.f36887q.add(i, itemDecoration);
        }
        m53416n0();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.f36836E == null) {
            this.f36836E = new ArrayList();
        }
        this.f36836E.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.f36889r.add(onItemTouchListener);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        if (this.f36878l0 == null) {
            this.f36878l0 = new ArrayList();
        }
        this.f36878l0.add(onScrollListener);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        boolean z;
        if (recyclerListener != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "'listener' arg cannot be null.");
        this.f36885p.add(recyclerListener);
    }

    /* renamed from: b0 */
    public Rect m53440b0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f36935c) {
            return layoutParams.f36934b;
        }
        if (this.f36874j0.isPreLayout() && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.f36934b;
        }
        Rect rect = layoutParams.f36934b;
        rect.set(0, 0, 0, 0);
        int size = this.f36887q.size();
        for (int i = 0; i < size; i++) {
            this.f36873j.set(0, 0, 0, 0);
            ((ItemDecoration) this.f36887q.get(i)).getItemOffsets(this.f36873j, view, this, this.f36874j0);
            int i2 = rect.left;
            Rect rect2 = this.f36873j;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f36935c = false;
        return rect;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && this.f36881n.checkLayoutParams((LayoutParams) layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list = this.f36836E;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List list = this.f36878l0;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        return this.f36881n.computeHorizontalScrollExtent(this.f36874j0);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        return this.f36881n.computeHorizontalScrollOffset(this.f36874j0);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        return this.f36881n.computeHorizontalScrollRange(this.f36874j0);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        return this.f36881n.computeVerticalScrollExtent(this.f36874j0);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        return this.f36881n.computeVerticalScrollOffset(this.f36874j0);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        return this.f36881n.computeVerticalScrollRange(this.f36874j0);
    }

    /* renamed from: d0 */
    public final void m53436d0(long j, ViewHolder viewHolder, ViewHolder viewHolder2) {
        int m53098g = this.f36865f.m53098g();
        for (int i = 0; i < m53098g; i++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53099f(i));
            if (m53450X != viewHolder && m53452W(m53450X) == j) {
                Adapter adapter = this.f36879m;
                if (adapter != null && adapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m53450X + " \n View Holder 2:" + viewHolder + m53468O());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m53450X + " \n View Holder 2:" + viewHolder + m53468O());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb.append(viewHolder2);
        sb.append(" cannot be found but it is necessary for ");
        sb.append(viewHolder);
        sb.append(m53468O());
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.f36887q.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((ItemDecoration) this.f36887q.get(i3)).onDrawOver(canvas, this, this.f36874j0);
        }
        EdgeEffect edgeEffect = this.f36842K;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f36869h) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.f36842K;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.f36843L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f36869h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f36843L;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f36844M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f36869h) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.f36844M;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f36845N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f36869h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f36845N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.f36846O == null || this.f36887q.size() <= 0 || !this.f36846O.isRunning()) {
            z5 = z;
        }
        if (z5) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public final boolean m53434e0() {
        int m53098g = this.f36865f.m53098g();
        for (int i = 0; i < m53098g; i++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53099f(i));
            if (m53450X != null && !m53450X.shouldIgnore() && m53450X.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f0 */
    public void m53432f0() {
        this.f36863e = new C4946a(new C4923f());
    }

    @Nullable
    public View findChildViewUnder(float f, float f2) {
        for (int m53098g = this.f36865f.m53098g() - 1; m53098g >= 0; m53098g--) {
            View m53099f = this.f36865f.m53099f(m53098g);
            float translationX = m53099f.getTranslationX();
            float translationY = m53099f.getTranslationY();
            if (f >= m53099f.getLeft() + translationX && f <= m53099f.getRight() + translationX && f2 >= m53099f.getTop() + translationY && f2 <= m53099f.getBottom() + translationY) {
                return m53099f;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return r3;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(@androidx.annotation.NonNull android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int i) {
        ViewHolder viewHolder = null;
        if (this.f36837F) {
            return null;
        }
        int m53095j = this.f36865f.m53095j();
        for (int i2 = 0; i2 < m53095j; i2++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53096i(i2));
            if (m53450X != null && !m53450X.isRemoved() && m53454V(m53450X) == i) {
                if (this.f36865f.m53091n(m53450X.itemView)) {
                    viewHolder = m53450X;
                } else {
                    return m53450X;
                }
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j) {
        Adapter adapter = this.f36879m;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int m53095j = this.f36865f.m53095j();
            for (int i = 0; i < m53095j; i++) {
                ViewHolder m53450X = m53450X(this.f36865f.m53096i(i));
                if (m53450X != null && !m53450X.isRemoved() && m53450X.getItemId() == j) {
                    if (this.f36865f.m53091n(m53450X.itemView)) {
                        viewHolder = m53450X;
                    } else {
                        return m53450X;
                    }
                }
            }
        }
        return viewHolder;
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int i) {
        return m53456U(i, false);
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int i) {
        return m53456U(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00e9  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean fling(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        View onInterceptFocusSearch = this.f36881n.onInterceptFocusSearch(view, i);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z5 = true;
        if (this.f36879m != null && this.f36881n != null && !isComputingLayout() && !this.f36905z) {
            z = true;
        } else {
            z = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z && (i == 2 || i == 1)) {
            if (this.f36881n.canScrollVertically()) {
                if (i == 2) {
                    i3 = BuildConfig.VERSION_CODE;
                } else {
                    i3 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f36824L0) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.f36881n.canScrollHorizontally()) {
                if (this.f36881n.getLayoutDirection() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 ^ z4) {
                    i2 = 66;
                } else {
                    i2 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i2) != null) {
                    z5 = false;
                }
                if (f36824L0) {
                    i = i2;
                }
                z2 = z5;
            }
            if (z2) {
                m53401v();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                m53451W0();
                this.f36881n.onFocusSearchFailed(view, i, this.f36859c, this.f36874j0);
                m53447Y0(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z) {
                m53401v();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                m53451W0();
                view2 = this.f36881n.onFocusSearchFailed(view, i, this.f36859c, this.f36874j0);
                m53447Y0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m53475K0(view2, null);
            return view;
        } else if (!m53420l0(view, view2, i)) {
            return super.focusSearch(view, i);
        } else {
            return view2;
        }
    }

    /* renamed from: g0 */
    public final void m53430g0() {
        if (ViewCompat.getImportantForAutofill(this) == 0) {
            ViewCompat.setImportantForAutofill(this, 8);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m53468O());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m53468O());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.f36879m;
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            return layoutManager.getBaseline();
        }
        return super.getBaseline();
    }

    public int getChildAdapterPosition(@NonNull View view) {
        ViewHolder m53450X = m53450X(view);
        if (m53450X != null) {
            return m53450X.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.f36890r0;
        if (childDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return childDrawingOrderCallback.onGetChildDrawingOrder(i, i2);
    }

    public long getChildItemId(@NonNull View view) {
        ViewHolder m53450X;
        Adapter adapter = this.f36879m;
        if (adapter == null || !adapter.hasStableIds() || (m53450X = m53450X(view)) == null) {
            return -1L;
        }
        return m53450X.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        ViewHolder m53450X = m53450X(view);
        if (m53450X != null) {
            return m53450X.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return m53450X(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f36869h;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.f36888q0;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        m53448Y(view, rect);
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.f36841J;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.f36846O;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (ItemDecoration) this.f36887q.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.f36887q.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.f36881n;
    }

    public int getMaxFlingVelocity() {
        return this.f36860c0;
    }

    public int getMinFlingVelocity() {
        return this.f36858b0;
    }

    public long getNanoTime() {
        if (f36823K0) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.f36856a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f36866f0;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.f36859c.m53337g();
    }

    public int getScrollState() {
        return this.f36847P;
    }

    /* renamed from: h */
    public final void m53429h(ViewHolder viewHolder) {
        boolean z;
        View view = viewHolder.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f36859c.m53347I(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.f36865f.m53102c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f36865f.m53103b(view, true);
        } else {
            this.f36865f.m53094k(view);
        }
    }

    /* renamed from: h0 */
    public final void m53428h0() {
        this.f36865f = new C4949b(new C4922e());
    }

    public boolean hasFixedSize() {
        return this.f36895u;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent();
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.f36899w && !this.f36837F && !this.f36863e.m53124p()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void m53427i(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.f36846O.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            m53396x0();
        }
    }

    /* renamed from: i0 */
    public void m53426i0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C4954d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m53468O());
    }

    public void invalidateItemDecorations() {
        if (this.f36887q.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        m53416n0();
        requestLayout();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.f36846O;
        if (itemAnimator != null && itemAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f36893t;
    }

    public boolean isComputingLayout() {
        if (this.f36839H > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f36905z;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().isNestedScrollingEnabled();
    }

    /* renamed from: j */
    public final void m53425j(ViewHolder viewHolder, ViewHolder viewHolder2, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z, boolean z2) {
        viewHolder.setIsRecyclable(false);
        if (z) {
            m53429h(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z2) {
                m53429h(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            m53429h(viewHolder);
            this.f36859c.m53347I(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.f36846O.animateChange(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
            m53396x0();
        }
    }

    /* renamed from: j0 */
    public void m53424j0() {
        this.f36845N = null;
        this.f36843L = null;
        this.f36844M = null;
        this.f36842K = null;
    }

    /* renamed from: k */
    public void m53423k(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        m53429h(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.f36846O.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            m53396x0();
        }
    }

    /* renamed from: k0 */
    public boolean m53422k0() {
        AccessibilityManager accessibilityManager = this.f36835D;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void m53421l(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + m53468O());
            }
            throw new IllegalStateException(str + m53468O());
        }
    }

    /* renamed from: l0 */
    public final boolean m53420l0(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.f36873j.set(0, 0, view.getWidth(), view.getHeight());
        this.f36875k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f36873j);
        offsetDescendantRectToMyCoords(view2, this.f36875k);
        char c = 65535;
        if (this.f36881n.getLayoutDirection() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        Rect rect = this.f36873j;
        int i4 = rect.left;
        Rect rect2 = this.f36875k;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            if ((i6 > i7 || i4 >= i7) && i4 > i5) {
                i3 = -1;
            } else {
                i3 = 0;
            }
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130) {
                                if (c <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            throw new IllegalArgumentException("Invalid direction: " + i + m53468O());
                        } else if (i3 <= 0) {
                            return false;
                        } else {
                            return true;
                        }
                    } else if (c >= 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i3 >= 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (c <= 0 && (c != 0 || i3 * i2 <= 0)) {
                return false;
            } else {
                return true;
            }
        } else if (c >= 0 && (c != 0 || i3 * i2 >= 0)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    public void m53419m(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m53468O());
            }
            throw new IllegalStateException(str);
        } else if (this.f36840I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m53468O()));
        }
    }

    /* renamed from: m0 */
    public void m53418m0(int i) {
        if (this.f36881n == null) {
            return;
        }
        setScrollState(2);
        this.f36881n.scrollToPosition(i);
        awakenScrollBars();
    }

    /* renamed from: n */
    public boolean m53417n(ViewHolder viewHolder) {
        ItemAnimator itemAnimator = this.f36846O;
        if (itemAnimator != null && !itemAnimator.canReuseUpdatedViewHolder(viewHolder, viewHolder.getUnmodifiedPayloads())) {
            return false;
        }
        return true;
    }

    /* renamed from: n0 */
    public void m53416n0() {
        int m53095j = this.f36865f.m53095j();
        for (int i = 0; i < m53095j; i++) {
            ((LayoutParams) this.f36865f.m53096i(i).getLayoutParams()).f36935c = true;
        }
        this.f36859c.m53329o();
    }

    public void nestedScrollBy(int i, int i2) {
        m53412p0(i, i2, null, 1);
    }

    /* renamed from: o */
    public final void m53415o() {
        m53471M0();
        setScrollState(0);
    }

    /* renamed from: o0 */
    public void m53414o0() {
        int m53095j = this.f36865f.m53095j();
        for (int i = 0; i < m53095j; i++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53096i(i));
            if (m53450X != null && !m53450X.shouldIgnore()) {
                m53450X.addFlags(6);
            }
        }
        m53416n0();
        this.f36859c.m53328p();
    }

    public void offsetChildrenHorizontal(@InterfaceC2055Px int i) {
        int m53098g = this.f36865f.m53098g();
        for (int i2 = 0; i2 < m53098g; i2++) {
            this.f36865f.m53099f(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(@InterfaceC2055Px int i) {
        int m53098g = this.f36865f.m53098g();
        for (int i2 = 0; i2 < m53098g; i2++) {
            this.f36865f.m53099f(i2).offsetTopAndBottom(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0050, code lost:
        if (r1 >= 30.0f) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f36839H = r0
            r1 = 1
            r5.f36893t = r1
            boolean r2 = r5.f36899w
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.f36899w = r1
            androidx.recyclerview.widget.RecyclerView$Recycler r1 = r5.f36859c
            r1.m53322v()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r5.f36881n
            if (r1 == 0) goto L23
            r1.m53387c(r5)
        L23:
            r5.f36886p0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f36823K0
            if (r0 == 0) goto L66
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC4959e.f37173e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.RunnableC4959e) r1
            r5.f36870h0 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f36870h0 = r1
            android.view.Display r1 = androidx.core.view.ViewCompat.getDisplay(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.e r2 = r5.f36870h0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f37177c = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.e r0 = r5.f36870h0
            r0.m53019a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC4959e runnableC4959e;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.f36846O;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.f36893t = false;
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            layoutManager.m53386d(this, this.f36859c);
        }
        this.f36902x0.clear();
        removeCallbacks(this.f36904y0);
        this.f36867g.m52955j();
        this.f36859c.m53321w();
        PoolingContainer.callPoolingContainerOnReleaseForChildren(this);
        if (f36823K0 && (runnableC4959e = this.f36870h0) != null) {
            runnableC4959e.m53010l(this);
            this.f36870h0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f36887q.size();
        for (int i = 0; i < size; i++) {
            ((ItemDecoration) this.f36887q.get(i)).onDraw(canvas, this, this.f36874j0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.f36881n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f36905z
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L7a
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.f36881n
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.f36881n
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = 0
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.f36881n
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.f36881n
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = 0
            goto L64
        L62:
            r0 = 0
            goto L3c
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L7a
        L6c:
            float r2 = r5.f36862d0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f36864e0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.m53412p0(r2, r0, r6, r3)
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f36905z) {
            return false;
        }
        this.f36891s = null;
        if (m53464Q(motionEvent)) {
            m53415o();
            return true;
        }
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null) {
            return false;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.f36881n.canScrollVertically();
        if (this.f36849R == null) {
            this.f36849R = VelocityTracker.obtain();
        }
        this.f36849R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m53398w0(motionEvent);
                            }
                        } else {
                            this.f36848Q = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f36852U = x;
                            this.f36850S = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f36853V = y;
                            this.f36851T = y;
                        }
                    } else {
                        m53415o();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f36848Q);
                    if (findPointerIndex < 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error processing scroll; pointer index for id ");
                        sb.append(this.f36848Q);
                        sb.append(" not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f36847P != 1) {
                        int i = x2 - this.f36850S;
                        int i2 = y2 - this.f36851T;
                        if (canScrollHorizontally && Math.abs(i) > this.f36854W) {
                            this.f36852U = x2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (canScrollVertically && Math.abs(i2) > this.f36854W) {
                            this.f36853V = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f36849R.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.f36829A) {
                this.f36829A = false;
            }
            this.f36848Q = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f36852U = x3;
            this.f36850S = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f36853V = y3;
            this.f36851T = y3;
            if (m53449X0(motionEvent) || this.f36847P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.f36898v0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = canScrollHorizontally;
            if (canScrollVertically) {
                i3 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i3, 0);
        }
        if (this.f36847P != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TraceCompat.beginSection("RV OnLayout");
        m53492C();
        TraceCompat.endSection();
        this.f36899w = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null) {
            m53397x(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f36881n.onMeasure(this.f36859c, this.f36874j0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f36906z0 = z;
            if (!z && this.f36879m != null) {
                if (this.f36874j0.f36973e == 1) {
                    m53490D();
                }
                this.f36881n.m53373q(i, i2);
                this.f36874j0.f36978j = true;
                m53488E();
                this.f36881n.m53372r(i, i2);
                if (this.f36881n.mo53369u()) {
                    this.f36881n.m53373q(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f36874j0.f36978j = true;
                    m53488E();
                    this.f36881n.m53372r(i, i2);
                }
                this.f36830A0 = getMeasuredWidth();
                this.f36832B0 = getMeasuredHeight();
            }
        } else if (this.f36895u) {
            this.f36881n.onMeasure(this.f36859c, this.f36874j0, i, i2);
        } else {
            if (this.f36833C) {
                m53451W0();
                m53404t0();
                m53392z0();
                m53402u0();
                State state = this.f36874j0;
                if (state.f36980l) {
                    state.f36976h = true;
                } else {
                    this.f36863e.m53130j();
                    this.f36874j0.f36976h = false;
                }
                this.f36833C = false;
                m53447Y0(false);
            } else if (this.f36874j0.f36980l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.f36879m;
            if (adapter != null) {
                this.f36874j0.f36974f = adapter.getItemCount();
            } else {
                this.f36874j0.f36974f = 0;
            }
            m53451W0();
            this.f36881n.onMeasure(this.f36859c, this.f36874j0, i, i2);
            m53447Y0(false);
            this.f36874j0.f36976h = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f36861d = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f36861d;
        if (savedState2 != null) {
            savedState.m53317a(savedState2);
        } else {
            LayoutManager layoutManager = this.f36881n;
            if (layoutManager != null) {
                savedState.f36953b = layoutManager.onSaveInstanceState();
            } else {
                savedState.f36953b = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(@InterfaceC2055Px int i, @InterfaceC2055Px int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m53424j0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p0 */
    public final void m53412p0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        float y;
        float x;
        int i5;
        int i6;
        int i7;
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || this.f36905z) {
            return;
        }
        int[] iArr = this.f36900w0;
        int i8 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.f36881n.canScrollVertically();
        if (canScrollVertically) {
            i4 = canScrollHorizontally | 2;
        } else {
            i4 = canScrollHorizontally;
        }
        if (motionEvent == null) {
            y = getHeight() / 2.0f;
        } else {
            y = motionEvent.getY();
        }
        if (motionEvent == null) {
            x = getWidth() / 2.0f;
        } else {
            x = motionEvent.getX();
        }
        int m53485F0 = i - m53485F0(i, y);
        int m53483G0 = i2 - m53483G0(i2, x);
        startNestedScroll(i4, i3);
        if (canScrollHorizontally != 0) {
            i5 = m53485F0;
        } else {
            i5 = 0;
        }
        if (canScrollVertically) {
            i6 = m53483G0;
        } else {
            i6 = 0;
        }
        if (dispatchNestedPreScroll(i5, i6, this.f36900w0, this.f36896u0, i3)) {
            int[] iArr2 = this.f36900w0;
            m53485F0 -= iArr2[0];
            m53483G0 -= iArr2[1];
        }
        if (canScrollHorizontally != 0) {
            i7 = m53485F0;
        } else {
            i7 = 0;
        }
        if (canScrollVertically) {
            i8 = m53483G0;
        }
        m53465P0(i7, i8, motionEvent, i3);
        RunnableC4959e runnableC4959e = this.f36870h0;
        if (runnableC4959e != null && (m53485F0 != 0 || m53483G0 != 0)) {
            runnableC4959e.m53014g(this, m53485F0, m53483G0);
        }
        stopNestedScroll(i3);
    }

    /* renamed from: q */
    public void m53411q() {
        int m53095j = this.f36865f.m53095j();
        for (int i = 0; i < m53095j; i++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53096i(i));
            if (!m53450X.shouldIgnore()) {
                m53450X.clearOldPosition();
            }
        }
        this.f36859c.m53341c();
    }

    /* renamed from: q0 */
    public void m53410q0(int i, int i2) {
        int m53095j = this.f36865f.m53095j();
        for (int i3 = 0; i3 < m53095j; i3++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53096i(i3));
            if (m53450X != null && !m53450X.shouldIgnore() && m53450X.mPosition >= i) {
                if (f36817E0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("offsetPositionRecordsForInsert attached child ");
                    sb.append(i3);
                    sb.append(" holder ");
                    sb.append(m53450X);
                    sb.append(" now at position ");
                    sb.append(m53450X.mPosition + i2);
                }
                m53450X.offsetPosition(i2, false);
                this.f36874j0.f36975g = true;
            }
        }
        this.f36859c.m53326r(i, i2);
        requestLayout();
    }

    /* renamed from: r */
    public void m53409r(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f36842K;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.f36842K.onRelease();
            z = this.f36842K.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f36844M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f36844M.onRelease();
            z |= this.f36844M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f36843L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f36843L.onRelease();
            z |= this.f36843L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f36845N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f36845N.onRelease();
            z |= this.f36845N.isFinished();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* renamed from: r0 */
    public void m53408r0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int m53095j = this.f36865f.m53095j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < m53095j; i7++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53096i(i7));
            if (m53450X != null && (i6 = m53450X.mPosition) >= i4 && i6 <= i3) {
                if (f36817E0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("offsetPositionRecordsForMove attached child ");
                    sb.append(i7);
                    sb.append(" holder ");
                    sb.append(m53450X);
                }
                if (m53450X.mPosition == i) {
                    m53450X.offsetPosition(i2 - i, false);
                } else {
                    m53450X.offsetPosition(i5, false);
                }
                this.f36874j0.f36975g = true;
            }
        }
        this.f36859c.m53325s(i, i2);
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        ViewHolder m53450X = m53450X(view);
        if (m53450X != null) {
            if (m53450X.isTmpDetached()) {
                m53450X.clearTmpDetachFlag();
            } else if (!m53450X.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m53450X + m53468O());
            }
        } else if (f36816D0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + m53468O());
        }
        view.clearAnimation();
        m53496A(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(@NonNull ItemDecoration itemDecoration) {
        boolean z;
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.f36887q.remove(itemDecoration);
        if (this.f36887q.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        m53416n0();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List list = this.f36836E;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.f36889r.remove(onItemTouchListener);
        if (this.f36891s == onItemTouchListener) {
            this.f36891s = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List list = this.f36878l0;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        this.f36885p.remove(recyclerListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f36881n.onRequestChildFocus(this, this.f36874j0, view, view2) && view2 != null) {
            m53475K0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f36881n.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f36889r.size();
        for (int i = 0; i < size; i++) {
            ((OnItemTouchListener) this.f36889r.get(i)).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f36901x == 0 && !this.f36905z) {
            super.requestLayout();
        } else {
            this.f36903y = true;
        }
    }

    /* renamed from: s */
    public int m53407s(int i) {
        return m53405t(i, this.f36842K, this.f36844M, getWidth());
    }

    /* renamed from: s0 */
    public void m53406s0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m53095j = this.f36865f.m53095j();
        for (int i4 = 0; i4 < m53095j; i4++) {
            ViewHolder m53450X = m53450X(this.f36865f.m53096i(i4));
            if (m53450X != null && !m53450X.shouldIgnore()) {
                int i5 = m53450X.mPosition;
                if (i5 >= i3) {
                    if (f36817E0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("offsetPositionRecordsForRemove attached child ");
                        sb.append(i4);
                        sb.append(" holder ");
                        sb.append(m53450X);
                        sb.append(" now at position ");
                        sb.append(m53450X.mPosition - i2);
                    }
                    m53450X.offsetPosition(-i2, z);
                    this.f36874j0.f36975g = true;
                } else if (i5 >= i) {
                    if (f36817E0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("offsetPositionRecordsForRemove attached child ");
                        sb2.append(i4);
                        sb2.append(" holder ");
                        sb2.append(m53450X);
                        sb2.append(" now REMOVED");
                    }
                    m53450X.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f36874j0.f36975g = true;
                }
            }
        }
        this.f36859c.m53324t(i, i2, z);
        requestLayout();
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null || this.f36905z) {
            return;
        }
        boolean canScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean canScrollVertically = this.f36881n.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i = 0;
            }
            if (!canScrollVertically) {
                i2 = 0;
            }
            m53465P0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.f36905z) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPosition(i);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m53455U0(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.f36888q0 = recyclerViewAccessibilityDelegate;
        ViewCompat.setAccessibilityDelegate(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        m53461R0(adapter, false, true);
        m53495A0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        boolean z;
        if (childDrawingOrderCallback == this.f36890r0) {
            return;
        }
        this.f36890r0 = childDrawingOrderCallback;
        if (childDrawingOrderCallback != null) {
            z = true;
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f36869h) {
            m53424j0();
        }
        this.f36869h = z;
        super.setClipToPadding(z);
        if (this.f36899w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        Preconditions.checkNotNull(edgeEffectFactory);
        this.f36841J = edgeEffectFactory;
        m53424j0();
    }

    public void setHasFixedSize(boolean z) {
        this.f36895u = z;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.f36846O;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.f36846O.m53390b(null);
        }
        this.f36846O = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.m53390b(this.f36884o0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f36859c.setViewCacheSize(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        if (layoutManager == this.f36881n) {
            return;
        }
        stopScroll();
        if (this.f36881n != null) {
            ItemAnimator itemAnimator = this.f36846O;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            this.f36881n.removeAndRecycleAllViews(this.f36859c);
            this.f36881n.m53376n(this.f36859c);
            this.f36859c.clear();
            if (this.f36893t) {
                this.f36881n.m53386d(this, this.f36859c);
            }
            this.f36881n.m53371s(null);
            this.f36881n = null;
        } else {
            this.f36859c.clear();
        }
        this.f36865f.m53090o();
        this.f36881n = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.f36914b == null) {
                layoutManager.m53371s(this);
                if (this.f36893t) {
                    this.f36881n.m53387c(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.f36914b.m53468O());
            }
        }
        this.f36859c.m53346J();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().setNestedScrollingEnabled(z);
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.f36856a0 = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.f36876k0 = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f36866f0 = z;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
        this.f36859c.m53351E(recycledViewPool);
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
        this.f36883o = recyclerListener;
    }

    public void setScrollState(int i) {
        if (i == this.f36847P) {
            return;
        }
        if (f36817E0) {
            StringBuilder sb = new StringBuilder();
            sb.append("setting scroll state to ");
            sb.append(i);
            sb.append(" from ");
            sb.append(this.f36847P);
            new Exception();
        }
        this.f36847P = i;
        if (i != 2) {
            m53445Z0();
        }
        m53484G(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.f36854W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f36854W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
        this.f36859c.m53350F(viewCacheExtension);
    }

    public void smoothScrollBy(@InterfaceC2055Px int i, @InterfaceC2055Px int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        LayoutManager layoutManager;
        if (this.f36905z || (layoutManager = this.f36881n) == null) {
            return;
        }
        layoutManager.smoothScrollToPosition(this, this.f36874j0, i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().startNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll();
    }

    public void stopScroll() {
        setScrollState(0);
        m53445Z0();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f36905z) {
            m53419m("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f36905z = false;
                if (this.f36903y && this.f36881n != null && this.f36879m != null) {
                    requestLayout();
                }
                this.f36903y = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f36905z = true;
            this.f36829A = true;
            stopScroll();
        }
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        m53461R0(adapter, true, z);
        m53495A0(true);
        requestLayout();
    }

    /* renamed from: t */
    public final int m53405t(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            int round = Math.round(((-i2) / 4.0f) * EdgeEffectCompat.onPullDistance(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        } else if (i < 0 && edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
            float f = i2;
            int round2 = Math.round((f / 4.0f) * EdgeEffectCompat.onPullDistance(edgeEffect2, (i * 4.0f) / f, 0.5f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        } else {
            return i;
        }
    }

    /* renamed from: t0 */
    public void m53404t0() {
        this.f36839H++;
    }

    /* renamed from: u */
    public int m53403u(int i) {
        return m53405t(i, this.f36843L, this.f36845N, getHeight());
    }

    /* renamed from: u0 */
    public void m53402u0() {
        m53400v0(true);
    }

    /* renamed from: v */
    public void m53401v() {
        if (this.f36899w && !this.f36837F) {
            if (!this.f36863e.m53124p()) {
                return;
            }
            if (this.f36863e.m53125o(4) && !this.f36863e.m53125o(11)) {
                TraceCompat.beginSection("RV PartialInvalidate");
                m53451W0();
                m53404t0();
                this.f36863e.m53117w();
                if (!this.f36903y) {
                    if (m53434e0()) {
                        m53492C();
                    } else {
                        this.f36863e.m53131i();
                    }
                }
                m53447Y0(true);
                m53402u0();
                TraceCompat.endSection();
                return;
            } else if (this.f36863e.m53124p()) {
                TraceCompat.beginSection("RV FullInvalidate");
                m53492C();
                TraceCompat.endSection();
                return;
            } else {
                return;
            }
        }
        TraceCompat.beginSection("RV FullInvalidate");
        m53492C();
        TraceCompat.endSection();
    }

    /* renamed from: v0 */
    public void m53400v0(boolean z) {
        int i = this.f36839H - 1;
        this.f36839H = i;
        if (i < 1) {
            if (f36816D0 && i < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + m53468O());
            }
            this.f36839H = 0;
            if (z) {
                m53494B();
                m53480I();
            }
        }
    }

    /* renamed from: w */
    public final void m53399w(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String m53443a0 = m53443a0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(m53443a0, false, classLoader).asSubclass(LayoutManager.class);
                    try {
                        constructor = asSubclass.getConstructor(f36826N0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        objArr = null;
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m53443a0, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m53443a0, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m53443a0, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m53443a0, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m53443a0, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m53443a0, e7);
                }
            }
        }
    }

    /* renamed from: w0 */
    public final void m53398w0(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f36848Q) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f36848Q = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f36852U = x;
            this.f36850S = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f36853V = y;
            this.f36851T = y;
        }
    }

    /* renamed from: x */
    public void m53397x(int i, int i2) {
        setMeasuredDimension(LayoutManager.chooseSize(i, getPaddingLeft() + getPaddingRight(), ViewCompat.getMinimumWidth(this)), LayoutManager.chooseSize(i2, getPaddingTop() + getPaddingBottom(), ViewCompat.getMinimumHeight(this)));
    }

    /* renamed from: x0 */
    public void m53396x0() {
        if (!this.f36886p0 && this.f36893t) {
            ViewCompat.postOnAnimation(this, this.f36904y0);
            this.f36886p0 = true;
        }
    }

    /* renamed from: y */
    public final boolean m53395y(int i, int i2) {
        m53462R(this.f36892s0);
        int[] iArr = this.f36892s0;
        if (iArr[0] == i && iArr[1] == i2) {
            return false;
        }
        return true;
    }

    /* renamed from: y0 */
    public final boolean m53394y0() {
        if (this.f36846O != null && this.f36881n.supportsPredictiveItemAnimations()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public void m53393z(View view) {
        ViewHolder m53450X = m53450X(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.f36879m;
        if (adapter != null && m53450X != null) {
            adapter.onViewAttachedToWindow(m53450X);
        }
        List list = this.f36836E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((OnChildAttachStateChangeListener) this.f36836E.get(size)).onChildViewAttachedToWindow(view);
            }
        }
    }

    /* renamed from: z0 */
    public final void m53392z0() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f36837F) {
            this.f36863e.m53115y();
            if (this.f36838G) {
                this.f36881n.onItemsChanged(this);
            }
        }
        if (m53394y0()) {
            this.f36863e.m53117w();
        } else {
            this.f36863e.m53130j();
        }
        boolean z4 = true;
        if (!this.f36880m0 && !this.f36882n0) {
            z = false;
        } else {
            z = true;
        }
        State state = this.f36874j0;
        if (this.f36899w && this.f36846O != null && (((z3 = this.f36837F) || z || this.f36881n.f36920h) && (!z3 || this.f36879m.hasStableIds()))) {
            z2 = true;
        } else {
            z2 = false;
        }
        state.f36979k = z2;
        State state2 = this.f36874j0;
        state2.f36980l = (state2.f36979k && z && !this.f36837F && m53394y0()) ? false : false;
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().hasNestedScrollingParent(i);
    }

    public void smoothScrollBy(@InterfaceC2055Px int i, @InterfaceC2055Px int i2, @Nullable Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().startNestedScroll(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        getScrollingChildHelper().stopNestedScroll(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4917a();

        /* renamed from: b */
        public Parcelable f36953b;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        /* loaded from: classes2.dex */
        public class C4917a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f36953b = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        /* renamed from: a */
        public void m53317a(SavedState savedState) {
            this.f36953b = savedState.f36953b;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f36953b, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36857b = new C4927j();
        this.f36859c = new Recycler();
        this.f36867g = new C4977k();
        this.f36871i = new RunnableC4918a();
        this.f36873j = new Rect();
        this.f36875k = new Rect();
        this.f36877l = new RectF();
        this.f36885p = new ArrayList();
        this.f36887q = new ArrayList();
        this.f36889r = new ArrayList();
        this.f36901x = 0;
        this.f36837F = false;
        this.f36838G = false;
        this.f36839H = 0;
        this.f36840I = 0;
        this.f36841J = f36828P0;
        this.f36846O = new DefaultItemAnimator();
        this.f36847P = 0;
        this.f36848Q = -1;
        this.f36862d0 = Float.MIN_VALUE;
        this.f36864e0 = Float.MIN_VALUE;
        this.f36866f0 = true;
        this.f36868g0 = new RunnableC4929l();
        this.f36872i0 = f36823K0 ? new RunnableC4959e.C4961b() : null;
        this.f36874j0 = new State();
        this.f36880m0 = false;
        this.f36882n0 = false;
        this.f36884o0 = new C4926i();
        this.f36886p0 = false;
        this.f36892s0 = new int[2];
        this.f36896u0 = new int[2];
        this.f36898v0 = new int[2];
        this.f36900w0 = new int[2];
        this.f36902x0 = new ArrayList();
        this.f36904y0 = new RunnableC4919b();
        this.f36830A0 = 0;
        this.f36832B0 = 0;
        this.f36834C0 = new C4921d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f36854W = viewConfiguration.getScaledTouchSlop();
        this.f36862d0 = ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.f36864e0 = ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.f36858b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f36860c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f36855a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f36846O.m53390b(this.f36884o0);
        m53432f0();
        m53428h0();
        m53430g0();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.f36835D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.RecyclerView, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f36869h = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_fastScrollEnabled, false);
        this.f36897v = z;
        if (z) {
            m53426i0((StateListDrawable) obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        m53399w(context, string, attributeSet, i, 0);
        int[] iArr = f36818F0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        PoolingContainer.setPoolingContainer(this, true);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NonNull int[] iArr2) {
        getScrollingChildHelper().dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void smoothScrollBy(@InterfaceC2055Px int i, @InterfaceC2055Px int i2, @Nullable Interpolator interpolator, int i3) {
        m53453V0(i, i2, interpolator, i3, false);
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public ViewHolder f36933a;

        /* renamed from: b */
        public final Rect f36934b;

        /* renamed from: c */
        public boolean f36935c;

        /* renamed from: d */
        public boolean f36936d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f36934b = new Rect();
            this.f36935c = true;
            this.f36936d = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.f36933a.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.f36933a.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.f36933a.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.f36933a.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.f36933a.getPosition();
        }

        public boolean isItemChanged() {
            return this.f36933a.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.f36933a.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.f36933a.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.f36933a.needsUpdate();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f36934b = new Rect();
            this.f36935c = true;
            this.f36936d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f36934b = new Rect();
            this.f36935c = true;
            this.f36936d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36934b = new Rect();
            this.f36935c = true;
            this.f36936d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f36934b = new Rect();
            this.f36935c = true;
            this.f36936d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.f36881n;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m53468O());
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }
}
