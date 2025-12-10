package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import th.p047co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolAddBankAccountFragment;

/* loaded from: classes2.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int START = 16;

    /* renamed from: UP */
    public static final int f36795UP = 1;

    /* renamed from: A */
    public C4885e f36796A;

    /* renamed from: C */
    public Rect f36798C;

    /* renamed from: D */
    public long f36799D;

    /* renamed from: d */
    public float f36803d;

    /* renamed from: e */
    public float f36804e;

    /* renamed from: f */
    public float f36805f;

    /* renamed from: g */
    public float f36806g;

    /* renamed from: h */
    public float f36807h;

    /* renamed from: i */
    public float f36808i;

    /* renamed from: j */
    public float f36809j;

    /* renamed from: k */
    public float f36810k;

    /* renamed from: m */
    public Callback f36812m;

    /* renamed from: o */
    public int f36814o;

    /* renamed from: q */
    public int f36816q;

    /* renamed from: r */
    public RecyclerView f36817r;

    /* renamed from: t */
    public VelocityTracker f36819t;

    /* renamed from: u */
    public List f36820u;

    /* renamed from: v */
    public List f36821v;

    /* renamed from: z */
    public GestureDetectorCompat f36825z;

    /* renamed from: a */
    public final List f36800a = new ArrayList();

    /* renamed from: b */
    public final float[] f36801b = new float[2];

    /* renamed from: c */
    public RecyclerView.ViewHolder f36802c = null;

    /* renamed from: l */
    public int f36811l = -1;

    /* renamed from: n */
    public int f36813n = 0;

    /* renamed from: p */
    public List f36815p = new ArrayList();

    /* renamed from: s */
    public final Runnable f36818s = new RunnableC4881a();

    /* renamed from: w */
    public RecyclerView.ChildDrawingOrderCallback f36822w = null;

    /* renamed from: x */
    public View f36823x = null;

    /* renamed from: y */
    public int f36824y = -1;

    /* renamed from: B */
    public final RecyclerView.OnItemTouchListener f36797B = new C4882b();

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;

        /* renamed from: b */
        public static final Interpolator f36826b = new animationInterpolatorC4879a();

        /* renamed from: c */
        public static final Interpolator f36827c = new animationInterpolatorC4880b();

        /* renamed from: a */
        public int f36828a = -1;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$a  reason: invalid class name */
        /* loaded from: classes2.dex */
        public class animationInterpolatorC4879a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$b  reason: invalid class name */
        /* loaded from: classes2.dex */
        public class animationInterpolatorC4880b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        @NonNull
        public static ItemTouchUIUtil getDefaultUIUtil() {
            return C17367Bg0.f459a;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        /* renamed from: a */
        public final int m53529a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), ViewCompat.getLayoutDirection(recyclerView));
        }

        /* renamed from: b */
        public final int m53528b(RecyclerView recyclerView) {
            if (this.f36828a == -1) {
                this.f36828a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f36828a;
        }

        /* renamed from: c */
        public boolean m53527c(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((m53529a(recyclerView, viewHolder) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.ViewHolder chooseDropTarget(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<RecyclerView.ViewHolder> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + viewHolder.itemView.getWidth();
            int height = i2 + viewHolder.itemView.getHeight();
            int left2 = i - viewHolder.itemView.getLeft();
            int top2 = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i2) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs;
                }
            }
            return viewHolder2;
        }

        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            C17367Bg0.f459a.clearView(viewHolder.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: d */
        public boolean m53526d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((m53529a(recyclerView, viewHolder) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void m53525e(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4886f c4886f = (C4886f) list.get(i2);
                c4886f.m53518e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, c4886f.f36845e, c4886f.f36850j, c4886f.f36851k, c4886f.f36846f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: f */
        public void m53524f(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C4886f c4886f = (C4886f) list.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, c4886f.f36845e, c4886f.f36850j, c4886f.f36851k, c4886f.f36846f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C4886f c4886f2 = (C4886f) list.get(i3);
                boolean z2 = c4886f2.f36853m;
                if (z2 && !c4886f2.f36849i) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200L;
                }
                return 250L;
            } else if (i == 8) {
                return itemAnimator.getMoveDuration();
            } else {
                return itemAnimator.getRemoveDuration();
            }
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((int) Math.signum(i2)) * m53528b(recyclerView) * f36827c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)));
            if (j <= BuyDolAddBankAccountFragment.WAIT_MILLI) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (signum * f36826b.getInterpolation(f));
            if (interpolation == 0) {
                if (i2 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C17367Bg0.f459a.onDraw(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C17367Bg0.f459a.onDrawOver(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public abstract boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2);

        public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                C17367Bg0.f459a.onSelected(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i);
    }

    /* loaded from: classes2.dex */
    public static abstract class SimpleCallback extends Callback {

        /* renamed from: d */
        public int f36829d;

        /* renamed from: e */
        public int f36830e;

        public SimpleCallback(int i, int i2) {
            this.f36829d = i2;
            this.f36830e = i;
        }

        public int getDragDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.f36830e;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return Callback.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.f36829d;
        }

        public void setDefaultDragDirs(int i) {
            this.f36830e = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.f36829d = i;
        }
    }

    /* loaded from: classes2.dex */
    public interface ViewDropHandler {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$a */
    /* loaded from: classes2.dex */
    public class RunnableC4881a implements Runnable {
        public RunnableC4881a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.f36802c != null && itemTouchHelper.m53536s()) {
                ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                RecyclerView.ViewHolder viewHolder = itemTouchHelper2.f36802c;
                if (viewHolder != null) {
                    itemTouchHelper2.m53541n(viewHolder);
                }
                ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                itemTouchHelper3.f36817r.removeCallbacks(itemTouchHelper3.f36818s);
                ViewCompat.postOnAnimation(ItemTouchHelper.this.f36817r, this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$b */
    /* loaded from: classes2.dex */
    public class C4882b implements RecyclerView.OnItemTouchListener {
        public C4882b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C4886f m53548g;
            ItemTouchHelper.this.f36825z.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.f36811l = motionEvent.getPointerId(0);
                ItemTouchHelper.this.f36803d = motionEvent.getX();
                ItemTouchHelper.this.f36804e = motionEvent.getY();
                ItemTouchHelper.this.m53540o();
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (itemTouchHelper.f36802c == null && (m53548g = itemTouchHelper.m53548g(motionEvent)) != null) {
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.f36803d -= m53548g.f36850j;
                    itemTouchHelper2.f36804e -= m53548g.f36851k;
                    itemTouchHelper2.m53549f(m53548g.f36845e, true);
                    if (ItemTouchHelper.this.f36800a.remove(m53548g.f36845e.itemView)) {
                        ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                        itemTouchHelper3.f36812m.clearView(itemTouchHelper3.f36817r, m53548g.f36845e);
                    }
                    ItemTouchHelper.this.m53535t(m53548g.f36845e, m53548g.f36846f);
                    ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                    itemTouchHelper4.m53530y(motionEvent, itemTouchHelper4.f36814o, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = ItemTouchHelper.this.f36811l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    ItemTouchHelper.this.m53552c(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                ItemTouchHelper itemTouchHelper5 = ItemTouchHelper.this;
                itemTouchHelper5.f36811l = -1;
                itemTouchHelper5.m53535t(null, 0);
            }
            VelocityTracker velocityTracker = ItemTouchHelper.this.f36819t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.f36802c != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (!z) {
                return;
            }
            ItemTouchHelper.this.m53535t(null, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.f36825z.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = ItemTouchHelper.this.f36819t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.f36811l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.f36811l);
            if (findPointerIndex >= 0) {
                ItemTouchHelper.this.m53552c(actionMasked, motionEvent, findPointerIndex);
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.f36802c;
            if (viewHolder == null) {
                return;
            }
            int i = 0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                            if (pointerId == itemTouchHelper2.f36811l) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                itemTouchHelper2.f36811l = motionEvent.getPointerId(i);
                                ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                                itemTouchHelper3.m53530y(motionEvent, itemTouchHelper3.f36814o, actionIndex);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = itemTouchHelper.f36819t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else if (findPointerIndex >= 0) {
                    itemTouchHelper.m53530y(motionEvent, itemTouchHelper.f36814o, findPointerIndex);
                    ItemTouchHelper.this.m53541n(viewHolder);
                    ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                    itemTouchHelper4.f36817r.removeCallbacks(itemTouchHelper4.f36818s);
                    ItemTouchHelper.this.f36818s.run();
                    ItemTouchHelper.this.f36817r.invalidate();
                    return;
                } else {
                    return;
                }
            }
            ItemTouchHelper.this.m53535t(null, 0);
            ItemTouchHelper.this.f36811l = -1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$c */
    /* loaded from: classes2.dex */
    public class C4883c extends C4886f {

        /* renamed from: o */
        public final /* synthetic */ int f36833o;

        /* renamed from: p */
        public final /* synthetic */ RecyclerView.ViewHolder f36834p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4883c(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.ViewHolder viewHolder2) {
            super(viewHolder, i, i2, f, f2, f3, f4);
            this.f36833o = i3;
            this.f36834p = viewHolder2;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.C4886f, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f36852l) {
                return;
            }
            if (this.f36833o <= 0) {
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                itemTouchHelper.f36812m.clearView(itemTouchHelper.f36817r, this.f36834p);
            } else {
                ItemTouchHelper.this.f36800a.add(this.f36834p.itemView);
                this.f36849i = true;
                int i = this.f36833o;
                if (i > 0) {
                    ItemTouchHelper.this.m53539p(this, i);
                }
            }
            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
            View view = itemTouchHelper2.f36823x;
            View view2 = this.f36834p.itemView;
            if (view == view2) {
                itemTouchHelper2.m53537r(view2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$d */
    /* loaded from: classes2.dex */
    public class RunnableC4884d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4886f f36836a;

        /* renamed from: b */
        public final /* synthetic */ int f36837b;

        public RunnableC4884d(C4886f c4886f, int i) {
            this.f36836a = c4886f;
            this.f36837b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = ItemTouchHelper.this.f36817r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C4886f c4886f = this.f36836a;
                if (!c4886f.f36852l && c4886f.f36845e.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.f36817r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.m53543l()) {
                        ItemTouchHelper.this.f36812m.onSwiped(this.f36836a.f36845e, this.f36837b);
                    } else {
                        ItemTouchHelper.this.f36817r.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$e */
    /* loaded from: classes2.dex */
    public class C4885e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public boolean f36839a = true;

        public C4885e() {
        }

        /* renamed from: a */
        public void m53523a() {
            this.f36839a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View m53547h;
            RecyclerView.ViewHolder childViewHolder;
            if (this.f36839a && (m53547h = ItemTouchHelper.this.m53547h(motionEvent)) != null && (childViewHolder = ItemTouchHelper.this.f36817r.getChildViewHolder(m53547h)) != null) {
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (!itemTouchHelper.f36812m.m53527c(itemTouchHelper.f36817r, childViewHolder)) {
                    return;
                }
                int pointerId = motionEvent.getPointerId(0);
                int i = ItemTouchHelper.this.f36811l;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.f36803d = x;
                    itemTouchHelper2.f36804e = y;
                    itemTouchHelper2.f36808i = 0.0f;
                    itemTouchHelper2.f36807h = 0.0f;
                    if (itemTouchHelper2.f36812m.isLongPressDragEnabled()) {
                        ItemTouchHelper.this.m53535t(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$f */
    /* loaded from: classes2.dex */
    public static class C4886f implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f36841a;

        /* renamed from: b */
        public final float f36842b;

        /* renamed from: c */
        public final float f36843c;

        /* renamed from: d */
        public final float f36844d;

        /* renamed from: e */
        public final RecyclerView.ViewHolder f36845e;

        /* renamed from: f */
        public final int f36846f;

        /* renamed from: g */
        public final ValueAnimator f36847g;

        /* renamed from: h */
        public final int f36848h;

        /* renamed from: i */
        public boolean f36849i;

        /* renamed from: j */
        public float f36850j;

        /* renamed from: k */
        public float f36851k;

        /* renamed from: l */
        public boolean f36852l = false;

        /* renamed from: m */
        public boolean f36853m = false;

        /* renamed from: n */
        public float f36854n;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$f$a */
        /* loaded from: classes2.dex */
        public class C4887a implements ValueAnimator.AnimatorUpdateListener {
            public C4887a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4886f.this.m53520c(valueAnimator.getAnimatedFraction());
            }
        }

        public C4886f(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.f36846f = i2;
            this.f36848h = i;
            this.f36845e = viewHolder;
            this.f36841a = f;
            this.f36842b = f2;
            this.f36843c = f3;
            this.f36844d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f36847g = ofFloat;
            ofFloat.addUpdateListener(new C4887a());
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            m53520c(0.0f);
        }

        /* renamed from: a */
        public void m53522a() {
            this.f36847g.cancel();
        }

        /* renamed from: b */
        public void m53521b(long j) {
            this.f36847g.setDuration(j);
        }

        /* renamed from: c */
        public void m53520c(float f) {
            this.f36854n = f;
        }

        /* renamed from: d */
        public void m53519d() {
            this.f36845e.setIsRecyclable(false);
            this.f36847g.start();
        }

        /* renamed from: e */
        public void m53518e() {
            float f = this.f36841a;
            float f2 = this.f36843c;
            if (f == f2) {
                this.f36850j = this.f36845e.itemView.getTranslationX();
            } else {
                this.f36850j = f + (this.f36854n * (f2 - f));
            }
            float f3 = this.f36842b;
            float f4 = this.f36844d;
            if (f3 == f4) {
                this.f36851k = this.f36845e.itemView.getTranslationY();
            } else {
                this.f36851k = f3 + (this.f36854n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m53520c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f36853m) {
                this.f36845e.setIsRecyclable(true);
            }
            this.f36853m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public ItemTouchHelper(@NonNull Callback callback) {
        this.f36812m = callback;
    }

    /* renamed from: e */
    private void m53550e() {
        this.f36817r.removeItemDecoration(this);
        this.f36817r.removeOnItemTouchListener(this.f36797B);
        this.f36817r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f36815p.size() - 1; size >= 0; size--) {
            C4886f c4886f = (C4886f) this.f36815p.get(0);
            c4886f.m53522a();
            this.f36812m.clearView(this.f36817r, c4886f.f36845e);
        }
        this.f36815p.clear();
        this.f36823x = null;
        this.f36824y = -1;
        m53538q();
        m53532w();
    }

    /* renamed from: m */
    public static boolean m53542m(View view, float f, float f2, float f3, float f4) {
        if (f >= f3 && f <= f3 + view.getWidth() && f2 >= f4 && f2 <= f4 + view.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private void m53534u() {
        this.f36816q = ViewConfiguration.get(this.f36817r.getContext()).getScaledTouchSlop();
        this.f36817r.addItemDecoration(this);
        this.f36817r.addOnItemTouchListener(this.f36797B);
        this.f36817r.addOnChildAttachStateChangeListener(this);
        m53533v();
    }

    /* renamed from: a */
    public final void m53554a() {
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f36817r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m53550e();
        }
        this.f36817r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f36805f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f36806g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            m53534u();
        }
    }

    /* renamed from: b */
    public final int m53553b(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 4;
            if (this.f36807h > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.f36819t;
            if (velocityTracker != null && this.f36811l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f36812m.getSwipeVelocityThreshold(this.f36806g));
                float xVelocity = this.f36819t.getXVelocity(this.f36811l);
                float yVelocity = this.f36819t.getYVelocity(this.f36811l);
                if (xVelocity > 0.0f) {
                    i3 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= this.f36812m.getSwipeEscapeVelocity(this.f36805f) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.f36817r.getWidth() * this.f36812m.getSwipeThreshold(viewHolder);
            if ((i & i2) != 0 && Math.abs(this.f36807h) > width) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: c */
    public void m53552c(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.ViewHolder m53545j;
        int m53529a;
        if (this.f36802c != null || i != 2 || this.f36813n == 2 || !this.f36812m.isItemViewSwipeEnabled() || this.f36817r.getScrollState() == 1 || (m53545j = m53545j(motionEvent)) == null || (m53529a = (this.f36812m.m53529a(this.f36817r, m53545j) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f36803d;
        float f2 = y - this.f36804e;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        int i3 = this.f36816q;
        if (abs < i3 && abs2 < i3) {
            return;
        }
        if (abs > abs2) {
            if (f < 0.0f && (m53529a & 4) == 0) {
                return;
            }
            if (f > 0.0f && (m53529a & 8) == 0) {
                return;
            }
        } else if (f2 < 0.0f && (m53529a & 1) == 0) {
            return;
        } else {
            if (f2 > 0.0f && (m53529a & 2) == 0) {
                return;
            }
        }
        this.f36808i = 0.0f;
        this.f36807h = 0.0f;
        this.f36811l = motionEvent.getPointerId(0);
        m53535t(m53545j, 1);
    }

    /* renamed from: d */
    public final int m53551d(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 1;
            if (this.f36808i > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.f36819t;
            if (velocityTracker != null && this.f36811l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f36812m.getSwipeVelocityThreshold(this.f36806g));
                float xVelocity = this.f36819t.getXVelocity(this.f36811l);
                float yVelocity = this.f36819t.getYVelocity(this.f36811l);
                if (yVelocity > 0.0f) {
                    i3 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= this.f36812m.getSwipeEscapeVelocity(this.f36805f) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.f36817r.getHeight() * this.f36812m.getSwipeThreshold(viewHolder);
            if ((i & i2) != 0 && Math.abs(this.f36808i) > height) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: f */
    public void m53549f(RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.f36815p.size() - 1; size >= 0; size--) {
            C4886f c4886f = (C4886f) this.f36815p.get(size);
            if (c4886f.f36845e == viewHolder) {
                c4886f.f36852l |= z;
                if (!c4886f.f36853m) {
                    c4886f.m53522a();
                }
                this.f36815p.remove(size);
                return;
            }
        }
    }

    /* renamed from: g */
    public C4886f m53548g(MotionEvent motionEvent) {
        if (this.f36815p.isEmpty()) {
            return null;
        }
        View m53547h = m53547h(motionEvent);
        for (int size = this.f36815p.size() - 1; size >= 0; size--) {
            C4886f c4886f = (C4886f) this.f36815p.get(size);
            if (c4886f.f36845e.itemView == m53547h) {
                return c4886f;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    /* renamed from: h */
    public View m53547h(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.f36802c;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (m53542m(view, x, y, this.f36809j + this.f36807h, this.f36810k + this.f36808i)) {
                return view;
            }
        }
        for (int size = this.f36815p.size() - 1; size >= 0; size--) {
            C4886f c4886f = (C4886f) this.f36815p.get(size);
            View view2 = c4886f.f36845e.itemView;
            if (m53542m(view2, x, y, c4886f.f36850j, c4886f.f36851k)) {
                return view2;
            }
        }
        return this.f36817r.findChildViewUnder(x, y);
    }

    /* renamed from: i */
    public final List m53546i(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list = this.f36820u;
        if (list == null) {
            this.f36820u = new ArrayList();
            this.f36821v = new ArrayList();
        } else {
            list.clear();
            this.f36821v.clear();
        }
        int boundingBoxMargin = this.f36812m.getBoundingBoxMargin();
        int round = Math.round(this.f36809j + this.f36807h) - boundingBoxMargin;
        int round2 = Math.round(this.f36810k + this.f36808i) - boundingBoxMargin;
        int i = boundingBoxMargin * 2;
        int width = viewHolder2.itemView.getWidth() + round + i;
        int height = viewHolder2.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.f36817r.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = layoutManager.getChildAt(i4);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.f36817r.getChildViewHolder(childAt);
                if (this.f36812m.canDropOver(this.f36817r, this.f36802c, childViewHolder)) {
                    int abs = Math.abs(i2 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f36820u.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > ((Integer) this.f36821v.get(i7)).intValue(); i7++) {
                        i6++;
                    }
                    this.f36820u.add(i6, childViewHolder);
                    this.f36821v.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            viewHolder2 = viewHolder;
        }
        return this.f36820u;
    }

    /* renamed from: j */
    public final RecyclerView.ViewHolder m53545j(MotionEvent motionEvent) {
        View m53547h;
        RecyclerView.LayoutManager layoutManager = this.f36817r.getLayoutManager();
        int i = this.f36811l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f36803d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f36804e);
        int i2 = this.f36816q;
        if (abs < i2 && abs2 < i2) {
            return null;
        }
        if (abs > abs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((abs2 > abs && layoutManager.canScrollVertically()) || (m53547h = m53547h(motionEvent)) == null) {
            return null;
        }
        return this.f36817r.getChildViewHolder(m53547h);
    }

    /* renamed from: k */
    public final void m53544k(float[] fArr) {
        if ((this.f36814o & 12) != 0) {
            fArr[0] = (this.f36809j + this.f36807h) - this.f36802c.itemView.getLeft();
        } else {
            fArr[0] = this.f36802c.itemView.getTranslationX();
        }
        if ((this.f36814o & 3) != 0) {
            fArr[1] = (this.f36810k + this.f36808i) - this.f36802c.itemView.getTop();
        } else {
            fArr[1] = this.f36802c.itemView.getTranslationY();
        }
    }

    /* renamed from: l */
    public boolean m53543l() {
        int size = this.f36815p.size();
        for (int i = 0; i < size; i++) {
            if (!((C4886f) this.f36815p.get(i)).f36853m) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void m53541n(RecyclerView.ViewHolder viewHolder) {
        if (this.f36817r.isLayoutRequested() || this.f36813n != 2) {
            return;
        }
        float moveThreshold = this.f36812m.getMoveThreshold(viewHolder);
        int i = (int) (this.f36809j + this.f36807h);
        int i2 = (int) (this.f36810k + this.f36808i);
        if (Math.abs(i2 - viewHolder.itemView.getTop()) < viewHolder.itemView.getHeight() * moveThreshold && Math.abs(i - viewHolder.itemView.getLeft()) < viewHolder.itemView.getWidth() * moveThreshold) {
            return;
        }
        List<RecyclerView.ViewHolder> m53546i = m53546i(viewHolder);
        if (m53546i.size() == 0) {
            return;
        }
        RecyclerView.ViewHolder chooseDropTarget = this.f36812m.chooseDropTarget(viewHolder, m53546i, i, i2);
        if (chooseDropTarget == null) {
            this.f36820u.clear();
            this.f36821v.clear();
            return;
        }
        int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
        if (this.f36812m.onMove(this.f36817r, viewHolder, chooseDropTarget)) {
            this.f36812m.onMoved(this.f36817r, viewHolder, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i, i2);
        }
    }

    /* renamed from: o */
    public void m53540o() {
        VelocityTracker velocityTracker = this.f36819t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f36819t = VelocityTracker.obtain();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@NonNull View view) {
        m53537r(view);
        RecyclerView.ViewHolder childViewHolder = this.f36817r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.f36802c;
        if (viewHolder != null && childViewHolder == viewHolder) {
            m53535t(null, 0);
            return;
        }
        m53549f(childViewHolder, false);
        if (this.f36800a.remove(childViewHolder.itemView)) {
            this.f36812m.clearView(this.f36817r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.f36824y = -1;
        if (this.f36802c != null) {
            m53544k(this.f36801b);
            float[] fArr = this.f36801b;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f36812m.m53525e(canvas, recyclerView, this.f36802c, this.f36815p, this.f36813n, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        float f;
        float f2;
        if (this.f36802c != null) {
            m53544k(this.f36801b);
            float[] fArr = this.f36801b;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f36812m.m53524f(canvas, recyclerView, this.f36802c, this.f36815p, this.f36813n, f, f2);
    }

    /* renamed from: p */
    public void m53539p(C4886f c4886f, int i) {
        this.f36817r.post(new RunnableC4884d(c4886f, i));
    }

    /* renamed from: q */
    public final void m53538q() {
        VelocityTracker velocityTracker = this.f36819t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f36819t = null;
        }
    }

    /* renamed from: r */
    public void m53537r(View view) {
        if (view == this.f36823x) {
            this.f36823x = null;
            if (this.f36822w != null) {
                this.f36817r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r1 > 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m53536s() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.m53536s():boolean");
    }

    public void startDrag(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (!this.f36812m.m53527c(this.f36817r, viewHolder) || viewHolder.itemView.getParent() != this.f36817r) {
            return;
        }
        m53540o();
        this.f36808i = 0.0f;
        this.f36807h = 0.0f;
        m53535t(viewHolder, 2);
    }

    public void startSwipe(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (!this.f36812m.m53526d(this.f36817r, viewHolder) || viewHolder.itemView.getParent() != this.f36817r) {
            return;
        }
        m53540o();
        this.f36808i = 0.0f;
        this.f36807h = 0.0f;
        m53535t(viewHolder, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m53535t(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.m53535t(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: v */
    public final void m53533v() {
        this.f36796A = new C4885e();
        this.f36825z = new GestureDetectorCompat(this.f36817r.getContext(), this.f36796A);
    }

    /* renamed from: w */
    public final void m53532w() {
        C4885e c4885e = this.f36796A;
        if (c4885e != null) {
            c4885e.m53523a();
            this.f36796A = null;
        }
        if (this.f36825z != null) {
            this.f36825z = null;
        }
    }

    /* renamed from: x */
    public final int m53531x(RecyclerView.ViewHolder viewHolder) {
        if (this.f36813n == 2) {
            return 0;
        }
        int movementFlags = this.f36812m.getMovementFlags(this.f36817r, viewHolder);
        int convertToAbsoluteDirection = (this.f36812m.convertToAbsoluteDirection(movementFlags, ViewCompat.getLayoutDirection(this.f36817r)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (Math.abs(this.f36807h) > Math.abs(this.f36808i)) {
            int m53553b = m53553b(viewHolder, convertToAbsoluteDirection);
            if (m53553b > 0) {
                if ((i & m53553b) == 0) {
                    return Callback.convertToRelativeDirection(m53553b, ViewCompat.getLayoutDirection(this.f36817r));
                }
                return m53553b;
            }
            int m53551d = m53551d(viewHolder, convertToAbsoluteDirection);
            if (m53551d > 0) {
                return m53551d;
            }
        } else {
            int m53551d2 = m53551d(viewHolder, convertToAbsoluteDirection);
            if (m53551d2 > 0) {
                return m53551d2;
            }
            int m53553b2 = m53553b(viewHolder, convertToAbsoluteDirection);
            if (m53553b2 > 0) {
                if ((i & m53553b2) == 0) {
                    return Callback.convertToRelativeDirection(m53553b2, ViewCompat.getLayoutDirection(this.f36817r));
                }
                return m53553b2;
            }
        }
        return 0;
    }

    /* renamed from: y */
    public void m53530y(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f36803d;
        this.f36807h = f;
        this.f36808i = y - this.f36804e;
        if ((i & 4) == 0) {
            this.f36807h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f36807h = Math.min(0.0f, this.f36807h);
        }
        if ((i & 1) == 0) {
            this.f36808i = Math.max(0.0f, this.f36808i);
        }
        if ((i & 2) == 0) {
            this.f36808i = Math.min(0.0f, this.f36808i);
        }
    }
}