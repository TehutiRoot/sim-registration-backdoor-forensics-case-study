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
    public static final int f36707UP = 1;

    /* renamed from: A */
    public C4903e f36708A;

    /* renamed from: C */
    public Rect f36710C;

    /* renamed from: D */
    public long f36711D;

    /* renamed from: d */
    public float f36715d;

    /* renamed from: e */
    public float f36716e;

    /* renamed from: f */
    public float f36717f;

    /* renamed from: g */
    public float f36718g;

    /* renamed from: h */
    public float f36719h;

    /* renamed from: i */
    public float f36720i;

    /* renamed from: j */
    public float f36721j;

    /* renamed from: k */
    public float f36722k;

    /* renamed from: m */
    public Callback f36724m;

    /* renamed from: o */
    public int f36726o;

    /* renamed from: q */
    public int f36728q;

    /* renamed from: r */
    public RecyclerView f36729r;

    /* renamed from: t */
    public VelocityTracker f36731t;

    /* renamed from: u */
    public List f36732u;

    /* renamed from: v */
    public List f36733v;

    /* renamed from: z */
    public GestureDetectorCompat f36737z;

    /* renamed from: a */
    public final List f36712a = new ArrayList();

    /* renamed from: b */
    public final float[] f36713b = new float[2];

    /* renamed from: c */
    public RecyclerView.ViewHolder f36714c = null;

    /* renamed from: l */
    public int f36723l = -1;

    /* renamed from: n */
    public int f36725n = 0;

    /* renamed from: p */
    public List f36727p = new ArrayList();

    /* renamed from: s */
    public final Runnable f36730s = new RunnableC4899a();

    /* renamed from: w */
    public RecyclerView.ChildDrawingOrderCallback f36734w = null;

    /* renamed from: x */
    public View f36735x = null;

    /* renamed from: y */
    public int f36736y = -1;

    /* renamed from: B */
    public final RecyclerView.OnItemTouchListener f36709B = new C4900b();

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;

        /* renamed from: b */
        public static final Interpolator f36738b = new animationInterpolatorC4897a();

        /* renamed from: c */
        public static final Interpolator f36739c = new animationInterpolatorC4898b();

        /* renamed from: a */
        public int f36740a = -1;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$a  reason: invalid class name */
        /* loaded from: classes2.dex */
        public class animationInterpolatorC4897a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$b  reason: invalid class name */
        /* loaded from: classes2.dex */
        public class animationInterpolatorC4898b implements Interpolator {
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
            return C22655vg0.f107744a;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        /* renamed from: a */
        public final int m53578a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), ViewCompat.getLayoutDirection(recyclerView));
        }

        /* renamed from: b */
        public final int m53577b(RecyclerView recyclerView) {
            if (this.f36740a == -1) {
                this.f36740a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f36740a;
        }

        /* renamed from: c */
        public boolean m53576c(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((m53578a(recyclerView, viewHolder) & 16711680) != 0) {
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
            C22655vg0.f107744a.clearView(viewHolder.itemView);
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
        public boolean m53575d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((m53578a(recyclerView, viewHolder) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void m53574e(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4904f c4904f = (C4904f) list.get(i2);
                c4904f.m53567e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, c4904f.f36757e, c4904f.f36762j, c4904f.f36763k, c4904f.f36758f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: f */
        public void m53573f(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C4904f c4904f = (C4904f) list.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, c4904f.f36757e, c4904f.f36762j, c4904f.f36763k, c4904f.f36758f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C4904f c4904f2 = (C4904f) list.get(i3);
                boolean z2 = c4904f2.f36765m;
                if (z2 && !c4904f2.f36761i) {
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
            int signum = (int) (((int) Math.signum(i2)) * m53577b(recyclerView) * f36739c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)));
            if (j <= BuyDolAddBankAccountFragment.WAIT_MILLI) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (signum * f36738b.getInterpolation(f));
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
            C22655vg0.f107744a.onDraw(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C22655vg0.f107744a.onDrawOver(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
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
                C22655vg0.f107744a.onSelected(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i);
    }

    /* loaded from: classes2.dex */
    public static abstract class SimpleCallback extends Callback {

        /* renamed from: d */
        public int f36741d;

        /* renamed from: e */
        public int f36742e;

        public SimpleCallback(int i, int i2) {
            this.f36741d = i2;
            this.f36742e = i;
        }

        public int getDragDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.f36742e;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return Callback.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.f36741d;
        }

        public void setDefaultDragDirs(int i) {
            this.f36742e = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.f36741d = i;
        }
    }

    /* loaded from: classes2.dex */
    public interface ViewDropHandler {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$a */
    /* loaded from: classes2.dex */
    public class RunnableC4899a implements Runnable {
        public RunnableC4899a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.f36714c != null && itemTouchHelper.m53585s()) {
                ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                RecyclerView.ViewHolder viewHolder = itemTouchHelper2.f36714c;
                if (viewHolder != null) {
                    itemTouchHelper2.m53590n(viewHolder);
                }
                ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                itemTouchHelper3.f36729r.removeCallbacks(itemTouchHelper3.f36730s);
                ViewCompat.postOnAnimation(ItemTouchHelper.this.f36729r, this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$b */
    /* loaded from: classes2.dex */
    public class C4900b implements RecyclerView.OnItemTouchListener {
        public C4900b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C4904f m53597g;
            ItemTouchHelper.this.f36737z.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.f36723l = motionEvent.getPointerId(0);
                ItemTouchHelper.this.f36715d = motionEvent.getX();
                ItemTouchHelper.this.f36716e = motionEvent.getY();
                ItemTouchHelper.this.m53589o();
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (itemTouchHelper.f36714c == null && (m53597g = itemTouchHelper.m53597g(motionEvent)) != null) {
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.f36715d -= m53597g.f36762j;
                    itemTouchHelper2.f36716e -= m53597g.f36763k;
                    itemTouchHelper2.m53598f(m53597g.f36757e, true);
                    if (ItemTouchHelper.this.f36712a.remove(m53597g.f36757e.itemView)) {
                        ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                        itemTouchHelper3.f36724m.clearView(itemTouchHelper3.f36729r, m53597g.f36757e);
                    }
                    ItemTouchHelper.this.m53584t(m53597g.f36757e, m53597g.f36758f);
                    ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                    itemTouchHelper4.m53579y(motionEvent, itemTouchHelper4.f36726o, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = ItemTouchHelper.this.f36723l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    ItemTouchHelper.this.m53601c(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                ItemTouchHelper itemTouchHelper5 = ItemTouchHelper.this;
                itemTouchHelper5.f36723l = -1;
                itemTouchHelper5.m53584t(null, 0);
            }
            VelocityTracker velocityTracker = ItemTouchHelper.this.f36731t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.f36714c != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (!z) {
                return;
            }
            ItemTouchHelper.this.m53584t(null, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.f36737z.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = ItemTouchHelper.this.f36731t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.f36723l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.f36723l);
            if (findPointerIndex >= 0) {
                ItemTouchHelper.this.m53601c(actionMasked, motionEvent, findPointerIndex);
            }
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            RecyclerView.ViewHolder viewHolder = itemTouchHelper.f36714c;
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
                            if (pointerId == itemTouchHelper2.f36723l) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                itemTouchHelper2.f36723l = motionEvent.getPointerId(i);
                                ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                                itemTouchHelper3.m53579y(motionEvent, itemTouchHelper3.f36726o, actionIndex);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = itemTouchHelper.f36731t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else if (findPointerIndex >= 0) {
                    itemTouchHelper.m53579y(motionEvent, itemTouchHelper.f36726o, findPointerIndex);
                    ItemTouchHelper.this.m53590n(viewHolder);
                    ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                    itemTouchHelper4.f36729r.removeCallbacks(itemTouchHelper4.f36730s);
                    ItemTouchHelper.this.f36730s.run();
                    ItemTouchHelper.this.f36729r.invalidate();
                    return;
                } else {
                    return;
                }
            }
            ItemTouchHelper.this.m53584t(null, 0);
            ItemTouchHelper.this.f36723l = -1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$c */
    /* loaded from: classes2.dex */
    public class C4901c extends C4904f {

        /* renamed from: o */
        public final /* synthetic */ int f36745o;

        /* renamed from: p */
        public final /* synthetic */ RecyclerView.ViewHolder f36746p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4901c(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.ViewHolder viewHolder2) {
            super(viewHolder, i, i2, f, f2, f3, f4);
            this.f36745o = i3;
            this.f36746p = viewHolder2;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.C4904f, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f36764l) {
                return;
            }
            if (this.f36745o <= 0) {
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                itemTouchHelper.f36724m.clearView(itemTouchHelper.f36729r, this.f36746p);
            } else {
                ItemTouchHelper.this.f36712a.add(this.f36746p.itemView);
                this.f36761i = true;
                int i = this.f36745o;
                if (i > 0) {
                    ItemTouchHelper.this.m53588p(this, i);
                }
            }
            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
            View view = itemTouchHelper2.f36735x;
            View view2 = this.f36746p.itemView;
            if (view == view2) {
                itemTouchHelper2.m53586r(view2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$d */
    /* loaded from: classes2.dex */
    public class RunnableC4902d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4904f f36748a;

        /* renamed from: b */
        public final /* synthetic */ int f36749b;

        public RunnableC4902d(C4904f c4904f, int i) {
            this.f36748a = c4904f;
            this.f36749b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = ItemTouchHelper.this.f36729r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C4904f c4904f = this.f36748a;
                if (!c4904f.f36764l && c4904f.f36757e.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.f36729r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.m53592l()) {
                        ItemTouchHelper.this.f36724m.onSwiped(this.f36748a.f36757e, this.f36749b);
                    } else {
                        ItemTouchHelper.this.f36729r.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$e */
    /* loaded from: classes2.dex */
    public class C4903e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public boolean f36751a = true;

        public C4903e() {
        }

        /* renamed from: a */
        public void m53572a() {
            this.f36751a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View m53596h;
            RecyclerView.ViewHolder childViewHolder;
            if (this.f36751a && (m53596h = ItemTouchHelper.this.m53596h(motionEvent)) != null && (childViewHolder = ItemTouchHelper.this.f36729r.getChildViewHolder(m53596h)) != null) {
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (!itemTouchHelper.f36724m.m53576c(itemTouchHelper.f36729r, childViewHolder)) {
                    return;
                }
                int pointerId = motionEvent.getPointerId(0);
                int i = ItemTouchHelper.this.f36723l;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.f36715d = x;
                    itemTouchHelper2.f36716e = y;
                    itemTouchHelper2.f36720i = 0.0f;
                    itemTouchHelper2.f36719h = 0.0f;
                    if (itemTouchHelper2.f36724m.isLongPressDragEnabled()) {
                        ItemTouchHelper.this.m53584t(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$f */
    /* loaded from: classes2.dex */
    public static class C4904f implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f36753a;

        /* renamed from: b */
        public final float f36754b;

        /* renamed from: c */
        public final float f36755c;

        /* renamed from: d */
        public final float f36756d;

        /* renamed from: e */
        public final RecyclerView.ViewHolder f36757e;

        /* renamed from: f */
        public final int f36758f;

        /* renamed from: g */
        public final ValueAnimator f36759g;

        /* renamed from: h */
        public final int f36760h;

        /* renamed from: i */
        public boolean f36761i;

        /* renamed from: j */
        public float f36762j;

        /* renamed from: k */
        public float f36763k;

        /* renamed from: l */
        public boolean f36764l = false;

        /* renamed from: m */
        public boolean f36765m = false;

        /* renamed from: n */
        public float f36766n;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$f$a */
        /* loaded from: classes2.dex */
        public class C4905a implements ValueAnimator.AnimatorUpdateListener {
            public C4905a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4904f.this.m53569c(valueAnimator.getAnimatedFraction());
            }
        }

        public C4904f(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.f36758f = i2;
            this.f36760h = i;
            this.f36757e = viewHolder;
            this.f36753a = f;
            this.f36754b = f2;
            this.f36755c = f3;
            this.f36756d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f36759g = ofFloat;
            ofFloat.addUpdateListener(new C4905a());
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            m53569c(0.0f);
        }

        /* renamed from: a */
        public void m53571a() {
            this.f36759g.cancel();
        }

        /* renamed from: b */
        public void m53570b(long j) {
            this.f36759g.setDuration(j);
        }

        /* renamed from: c */
        public void m53569c(float f) {
            this.f36766n = f;
        }

        /* renamed from: d */
        public void m53568d() {
            this.f36757e.setIsRecyclable(false);
            this.f36759g.start();
        }

        /* renamed from: e */
        public void m53567e() {
            float f = this.f36753a;
            float f2 = this.f36755c;
            if (f == f2) {
                this.f36762j = this.f36757e.itemView.getTranslationX();
            } else {
                this.f36762j = f + (this.f36766n * (f2 - f));
            }
            float f3 = this.f36754b;
            float f4 = this.f36756d;
            if (f3 == f4) {
                this.f36763k = this.f36757e.itemView.getTranslationY();
            } else {
                this.f36763k = f3 + (this.f36766n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m53569c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f36765m) {
                this.f36757e.setIsRecyclable(true);
            }
            this.f36765m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public ItemTouchHelper(@NonNull Callback callback) {
        this.f36724m = callback;
    }

    /* renamed from: e */
    private void m53599e() {
        this.f36729r.removeItemDecoration(this);
        this.f36729r.removeOnItemTouchListener(this.f36709B);
        this.f36729r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f36727p.size() - 1; size >= 0; size--) {
            C4904f c4904f = (C4904f) this.f36727p.get(0);
            c4904f.m53571a();
            this.f36724m.clearView(this.f36729r, c4904f.f36757e);
        }
        this.f36727p.clear();
        this.f36735x = null;
        this.f36736y = -1;
        m53587q();
        m53581w();
    }

    /* renamed from: m */
    public static boolean m53591m(View view, float f, float f2, float f3, float f4) {
        if (f >= f3 && f <= f3 + view.getWidth() && f2 >= f4 && f2 <= f4 + view.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private void m53583u() {
        this.f36728q = ViewConfiguration.get(this.f36729r.getContext()).getScaledTouchSlop();
        this.f36729r.addItemDecoration(this);
        this.f36729r.addOnItemTouchListener(this.f36709B);
        this.f36729r.addOnChildAttachStateChangeListener(this);
        m53582v();
    }

    /* renamed from: a */
    public final void m53603a() {
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f36729r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m53599e();
        }
        this.f36729r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f36717f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f36718g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            m53583u();
        }
    }

    /* renamed from: b */
    public final int m53602b(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 4;
            if (this.f36719h > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.f36731t;
            if (velocityTracker != null && this.f36723l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f36724m.getSwipeVelocityThreshold(this.f36718g));
                float xVelocity = this.f36731t.getXVelocity(this.f36723l);
                float yVelocity = this.f36731t.getYVelocity(this.f36723l);
                if (xVelocity > 0.0f) {
                    i3 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= this.f36724m.getSwipeEscapeVelocity(this.f36717f) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.f36729r.getWidth() * this.f36724m.getSwipeThreshold(viewHolder);
            if ((i & i2) != 0 && Math.abs(this.f36719h) > width) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: c */
    public void m53601c(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.ViewHolder m53594j;
        int m53578a;
        if (this.f36714c != null || i != 2 || this.f36725n == 2 || !this.f36724m.isItemViewSwipeEnabled() || this.f36729r.getScrollState() == 1 || (m53594j = m53594j(motionEvent)) == null || (m53578a = (this.f36724m.m53578a(this.f36729r, m53594j) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f36715d;
        float f2 = y - this.f36716e;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        int i3 = this.f36728q;
        if (abs < i3 && abs2 < i3) {
            return;
        }
        if (abs > abs2) {
            if (f < 0.0f && (m53578a & 4) == 0) {
                return;
            }
            if (f > 0.0f && (m53578a & 8) == 0) {
                return;
            }
        } else if (f2 < 0.0f && (m53578a & 1) == 0) {
            return;
        } else {
            if (f2 > 0.0f && (m53578a & 2) == 0) {
                return;
            }
        }
        this.f36720i = 0.0f;
        this.f36719h = 0.0f;
        this.f36723l = motionEvent.getPointerId(0);
        m53584t(m53594j, 1);
    }

    /* renamed from: d */
    public final int m53600d(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 1;
            if (this.f36720i > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.f36731t;
            if (velocityTracker != null && this.f36723l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f36724m.getSwipeVelocityThreshold(this.f36718g));
                float xVelocity = this.f36731t.getXVelocity(this.f36723l);
                float yVelocity = this.f36731t.getYVelocity(this.f36723l);
                if (yVelocity > 0.0f) {
                    i3 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= this.f36724m.getSwipeEscapeVelocity(this.f36717f) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.f36729r.getHeight() * this.f36724m.getSwipeThreshold(viewHolder);
            if ((i & i2) != 0 && Math.abs(this.f36720i) > height) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: f */
    public void m53598f(RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.f36727p.size() - 1; size >= 0; size--) {
            C4904f c4904f = (C4904f) this.f36727p.get(size);
            if (c4904f.f36757e == viewHolder) {
                c4904f.f36764l |= z;
                if (!c4904f.f36765m) {
                    c4904f.m53571a();
                }
                this.f36727p.remove(size);
                return;
            }
        }
    }

    /* renamed from: g */
    public C4904f m53597g(MotionEvent motionEvent) {
        if (this.f36727p.isEmpty()) {
            return null;
        }
        View m53596h = m53596h(motionEvent);
        for (int size = this.f36727p.size() - 1; size >= 0; size--) {
            C4904f c4904f = (C4904f) this.f36727p.get(size);
            if (c4904f.f36757e.itemView == m53596h) {
                return c4904f;
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
    public View m53596h(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.f36714c;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (m53591m(view, x, y, this.f36721j + this.f36719h, this.f36722k + this.f36720i)) {
                return view;
            }
        }
        for (int size = this.f36727p.size() - 1; size >= 0; size--) {
            C4904f c4904f = (C4904f) this.f36727p.get(size);
            View view2 = c4904f.f36757e.itemView;
            if (m53591m(view2, x, y, c4904f.f36762j, c4904f.f36763k)) {
                return view2;
            }
        }
        return this.f36729r.findChildViewUnder(x, y);
    }

    /* renamed from: i */
    public final List m53595i(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list = this.f36732u;
        if (list == null) {
            this.f36732u = new ArrayList();
            this.f36733v = new ArrayList();
        } else {
            list.clear();
            this.f36733v.clear();
        }
        int boundingBoxMargin = this.f36724m.getBoundingBoxMargin();
        int round = Math.round(this.f36721j + this.f36719h) - boundingBoxMargin;
        int round2 = Math.round(this.f36722k + this.f36720i) - boundingBoxMargin;
        int i = boundingBoxMargin * 2;
        int width = viewHolder2.itemView.getWidth() + round + i;
        int height = viewHolder2.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.f36729r.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = layoutManager.getChildAt(i4);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.f36729r.getChildViewHolder(childAt);
                if (this.f36724m.canDropOver(this.f36729r, this.f36714c, childViewHolder)) {
                    int abs = Math.abs(i2 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f36732u.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > ((Integer) this.f36733v.get(i7)).intValue(); i7++) {
                        i6++;
                    }
                    this.f36732u.add(i6, childViewHolder);
                    this.f36733v.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            viewHolder2 = viewHolder;
        }
        return this.f36732u;
    }

    /* renamed from: j */
    public final RecyclerView.ViewHolder m53594j(MotionEvent motionEvent) {
        View m53596h;
        RecyclerView.LayoutManager layoutManager = this.f36729r.getLayoutManager();
        int i = this.f36723l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f36715d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f36716e);
        int i2 = this.f36728q;
        if (abs < i2 && abs2 < i2) {
            return null;
        }
        if (abs > abs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((abs2 > abs && layoutManager.canScrollVertically()) || (m53596h = m53596h(motionEvent)) == null) {
            return null;
        }
        return this.f36729r.getChildViewHolder(m53596h);
    }

    /* renamed from: k */
    public final void m53593k(float[] fArr) {
        if ((this.f36726o & 12) != 0) {
            fArr[0] = (this.f36721j + this.f36719h) - this.f36714c.itemView.getLeft();
        } else {
            fArr[0] = this.f36714c.itemView.getTranslationX();
        }
        if ((this.f36726o & 3) != 0) {
            fArr[1] = (this.f36722k + this.f36720i) - this.f36714c.itemView.getTop();
        } else {
            fArr[1] = this.f36714c.itemView.getTranslationY();
        }
    }

    /* renamed from: l */
    public boolean m53592l() {
        int size = this.f36727p.size();
        for (int i = 0; i < size; i++) {
            if (!((C4904f) this.f36727p.get(i)).f36765m) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void m53590n(RecyclerView.ViewHolder viewHolder) {
        if (this.f36729r.isLayoutRequested() || this.f36725n != 2) {
            return;
        }
        float moveThreshold = this.f36724m.getMoveThreshold(viewHolder);
        int i = (int) (this.f36721j + this.f36719h);
        int i2 = (int) (this.f36722k + this.f36720i);
        if (Math.abs(i2 - viewHolder.itemView.getTop()) < viewHolder.itemView.getHeight() * moveThreshold && Math.abs(i - viewHolder.itemView.getLeft()) < viewHolder.itemView.getWidth() * moveThreshold) {
            return;
        }
        List<RecyclerView.ViewHolder> m53595i = m53595i(viewHolder);
        if (m53595i.size() == 0) {
            return;
        }
        RecyclerView.ViewHolder chooseDropTarget = this.f36724m.chooseDropTarget(viewHolder, m53595i, i, i2);
        if (chooseDropTarget == null) {
            this.f36732u.clear();
            this.f36733v.clear();
            return;
        }
        int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
        if (this.f36724m.onMove(this.f36729r, viewHolder, chooseDropTarget)) {
            this.f36724m.onMoved(this.f36729r, viewHolder, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i, i2);
        }
    }

    /* renamed from: o */
    public void m53589o() {
        VelocityTracker velocityTracker = this.f36731t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f36731t = VelocityTracker.obtain();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(@NonNull View view) {
        m53586r(view);
        RecyclerView.ViewHolder childViewHolder = this.f36729r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.f36714c;
        if (viewHolder != null && childViewHolder == viewHolder) {
            m53584t(null, 0);
            return;
        }
        m53598f(childViewHolder, false);
        if (this.f36712a.remove(childViewHolder.itemView)) {
            this.f36724m.clearView(this.f36729r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.f36736y = -1;
        if (this.f36714c != null) {
            m53593k(this.f36713b);
            float[] fArr = this.f36713b;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f36724m.m53574e(canvas, recyclerView, this.f36714c, this.f36727p, this.f36725n, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        float f;
        float f2;
        if (this.f36714c != null) {
            m53593k(this.f36713b);
            float[] fArr = this.f36713b;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f36724m.m53573f(canvas, recyclerView, this.f36714c, this.f36727p, this.f36725n, f, f2);
    }

    /* renamed from: p */
    public void m53588p(C4904f c4904f, int i) {
        this.f36729r.post(new RunnableC4902d(c4904f, i));
    }

    /* renamed from: q */
    public final void m53587q() {
        VelocityTracker velocityTracker = this.f36731t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f36731t = null;
        }
    }

    /* renamed from: r */
    public void m53586r(View view) {
        if (view == this.f36735x) {
            this.f36735x = null;
            if (this.f36734w != null) {
                this.f36729r.setChildDrawingOrderCallback(null);
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
    public boolean m53585s() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.m53585s():boolean");
    }

    public void startDrag(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (!this.f36724m.m53576c(this.f36729r, viewHolder) || viewHolder.itemView.getParent() != this.f36729r) {
            return;
        }
        m53589o();
        this.f36720i = 0.0f;
        this.f36719h = 0.0f;
        m53584t(viewHolder, 2);
    }

    public void startSwipe(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (!this.f36724m.m53575d(this.f36729r, viewHolder) || viewHolder.itemView.getParent() != this.f36729r) {
            return;
        }
        m53589o();
        this.f36720i = 0.0f;
        this.f36719h = 0.0f;
        m53584t(viewHolder, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m53584t(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.m53584t(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: v */
    public final void m53582v() {
        this.f36708A = new C4903e();
        this.f36737z = new GestureDetectorCompat(this.f36729r.getContext(), this.f36708A);
    }

    /* renamed from: w */
    public final void m53581w() {
        C4903e c4903e = this.f36708A;
        if (c4903e != null) {
            c4903e.m53572a();
            this.f36708A = null;
        }
        if (this.f36737z != null) {
            this.f36737z = null;
        }
    }

    /* renamed from: x */
    public final int m53580x(RecyclerView.ViewHolder viewHolder) {
        if (this.f36725n == 2) {
            return 0;
        }
        int movementFlags = this.f36724m.getMovementFlags(this.f36729r, viewHolder);
        int convertToAbsoluteDirection = (this.f36724m.convertToAbsoluteDirection(movementFlags, ViewCompat.getLayoutDirection(this.f36729r)) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (Math.abs(this.f36719h) > Math.abs(this.f36720i)) {
            int m53602b = m53602b(viewHolder, convertToAbsoluteDirection);
            if (m53602b > 0) {
                if ((i & m53602b) == 0) {
                    return Callback.convertToRelativeDirection(m53602b, ViewCompat.getLayoutDirection(this.f36729r));
                }
                return m53602b;
            }
            int m53600d = m53600d(viewHolder, convertToAbsoluteDirection);
            if (m53600d > 0) {
                return m53600d;
            }
        } else {
            int m53600d2 = m53600d(viewHolder, convertToAbsoluteDirection);
            if (m53600d2 > 0) {
                return m53600d2;
            }
            int m53602b2 = m53602b(viewHolder, convertToAbsoluteDirection);
            if (m53602b2 > 0) {
                if ((i & m53602b2) == 0) {
                    return Callback.convertToRelativeDirection(m53602b2, ViewCompat.getLayoutDirection(this.f36729r));
                }
                return m53602b2;
            }
        }
        return 0;
    }

    /* renamed from: y */
    public void m53579y(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f36715d;
        this.f36719h = f;
        this.f36720i = y - this.f36716e;
        if ((i & 4) == 0) {
            this.f36719h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f36719h = Math.min(0.0f, this.f36719h);
        }
        if ((i & 1) == 0) {
            this.f36720i = Math.max(0.0f, this.f36720i);
        }
        if ((i & 2) == 0) {
            this.f36720i = Math.min(0.0f, this.f36720i);
        }
    }
}
