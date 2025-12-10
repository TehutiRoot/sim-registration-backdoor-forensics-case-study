package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet {

    /* renamed from: x */
    public static final int f50755x = R.string.side_sheet_accessibility_pane_title;

    /* renamed from: y */
    public static final int f50756y = R.style.Widget_Material3_SideSheet;

    /* renamed from: a */
    public UG1 f50757a;

    /* renamed from: b */
    public float f50758b;

    /* renamed from: c */
    public MaterialShapeDrawable f50759c;

    /* renamed from: d */
    public ColorStateList f50760d;

    /* renamed from: e */
    public ShapeAppearanceModel f50761e;

    /* renamed from: f */
    public final C7070b f50762f;

    /* renamed from: g */
    public float f50763g;

    /* renamed from: h */
    public boolean f50764h;

    /* renamed from: i */
    public int f50765i;

    /* renamed from: j */
    public int f50766j;

    /* renamed from: k */
    public ViewDragHelper f50767k;

    /* renamed from: l */
    public boolean f50768l;

    /* renamed from: m */
    public float f50769m;

    /* renamed from: n */
    public int f50770n;

    /* renamed from: o */
    public int f50771o;

    /* renamed from: p */
    public int f50772p;

    /* renamed from: q */
    public WeakReference f50773q;

    /* renamed from: r */
    public WeakReference f50774r;

    /* renamed from: s */
    public int f50775s;

    /* renamed from: t */
    public VelocityTracker f50776t;

    /* renamed from: u */
    public int f50777u;

    /* renamed from: v */
    public final Set f50778v;

    /* renamed from: w */
    public final ViewDragHelper.Callback f50779w;

    /* loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7068a();

        /* renamed from: b */
        public final int f50780b;

        /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$a */
        /* loaded from: classes4.dex */
        public class C7068a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f50780b);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f50780b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f50780b = sideSheetBehavior.f50765i;
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    /* loaded from: classes4.dex */
    public class C7069a extends ViewDragHelper.Callback {
        public C7069a() {
            SideSheetBehavior.this = r1;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return MathUtils.clamp(i, SideSheetBehavior.this.getExpandedOffset(), SideSheetBehavior.this.f50771o);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return SideSheetBehavior.this.f50771o;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (i == 1 && SideSheetBehavior.this.f50764h) {
                SideSheetBehavior.this.m44103I(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
            if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                SideSheetBehavior.this.f50757a.mo957i(marginLayoutParams, view.getLeft(), view.getRight());
                coplanarSiblingView.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.m44082p(view, i);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int mo963c = SideSheetBehavior.this.f50757a.mo963c(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.m44100L(view, mo963c, sideSheetBehavior.shouldSkipSmoothAnimation());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            if (SideSheetBehavior.this.f50765i == 1 || SideSheetBehavior.this.f50773q == null || SideSheetBehavior.this.f50773q.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    /* loaded from: classes4.dex */
    public class C7070b {

        /* renamed from: a */
        public int f50782a;

        /* renamed from: b */
        public boolean f50783b;

        /* renamed from: c */
        public final Runnable f50784c = new Runnable() { // from class: PI1
            {
                SideSheetBehavior.C7070b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.C7070b.m44068a(SideSheetBehavior.C7070b.this);
            }
        };

        public C7070b() {
            SideSheetBehavior.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m44068a(C7070b c7070b) {
            c7070b.m44066c();
        }

        /* renamed from: b */
        public void m44067b(int i) {
            if (SideSheetBehavior.this.f50773q != null && SideSheetBehavior.this.f50773q.get() != null) {
                this.f50782a = i;
                if (!this.f50783b) {
                    ViewCompat.postOnAnimation((View) SideSheetBehavior.this.f50773q.get(), this.f50784c);
                    this.f50783b = true;
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void m44066c() {
            this.f50783b = false;
            if (SideSheetBehavior.this.f50767k != null && SideSheetBehavior.this.f50767k.continueSettling(true)) {
                m44067b(this.f50782a);
            } else if (SideSheetBehavior.this.f50765i == 2) {
                SideSheetBehavior.this.m44103I(this.f50782a);
            }
        }
    }

    public SideSheetBehavior() {
        this.f50762f = new C7070b();
        this.f50764h = true;
        this.f50765i = 5;
        this.f50766j = 5;
        this.f50769m = 0.1f;
        this.f50775s = -1;
        this.f50778v = new LinkedHashSet();
        this.f50779w = new C7069a();
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m44097a(SideSheetBehavior sideSheetBehavior, int i, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return sideSheetBehavior.m44110B(i, view, commandArguments);
    }

    /* renamed from: b */
    public static /* synthetic */ void m44096b(SideSheetBehavior sideSheetBehavior, int i) {
        sideSheetBehavior.m44109C(i);
    }

    @NonNull
    public static <V extends View> SideSheetBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof SideSheetBehavior) {
                return (SideSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: A */
    public final boolean m44111A(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final /* synthetic */ boolean m44110B(int i, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        setState(i);
        return true;
    }

    /* renamed from: C */
    public final /* synthetic */ void m44109C(int i) {
        View view = (View) this.f50773q.get();
        if (view != null) {
            m44100L(view, i, false);
        }
    }

    /* renamed from: D */
    public final void m44108D(CoordinatorLayout coordinatorLayout) {
        int i;
        View findViewById;
        if (this.f50774r == null && (i = this.f50775s) != -1 && (findViewById = coordinatorLayout.findViewById(i)) != null) {
            this.f50774r = new WeakReference(findViewById);
        }
    }

    /* renamed from: E */
    public final void m44107E(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, m44084n(i));
    }

    /* renamed from: F */
    public final void m44106F() {
        VelocityTracker velocityTracker = this.f50776t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f50776t = null;
        }
    }

    /* renamed from: G */
    public final void m44105G(View view, Runnable runnable) {
        if (m44111A(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: H */
    public final void m44104H(int i) {
        UG1 ug1 = this.f50757a;
        if (ug1 != null && ug1.mo959g() == i) {
            return;
        }
        if (i == 0) {
            this.f50757a = new C22710vy1(this);
            return;
        }
        throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0");
    }

    /* renamed from: I */
    public void m44103I(int i) {
        View view;
        if (this.f50765i == i) {
            return;
        }
        this.f50765i = i;
        if (i == 3 || i == 5) {
            this.f50766j = i;
        }
        WeakReference weakReference = this.f50773q;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        m44098N(view);
        for (TG1 tg1 : this.f50778v) {
            tg1.onStateChanged(view, i);
        }
        m44099M();
    }

    /* renamed from: J */
    public final boolean m44102J() {
        if (this.f50767k != null && (this.f50764h || this.f50765i == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m44101K(View view) {
        if ((view.isShown() || ViewCompat.getAccessibilityPaneTitle(view) != null) && this.f50764h) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final void m44100L(View view, int i, boolean z) {
        if (this.f50757a.mo958h(view, i, z)) {
            m44103I(2);
            this.f50762f.m44067b(i);
            return;
        }
        m44103I(i);
    }

    /* renamed from: M */
    public final void m44099M() {
        View view;
        WeakReference weakReference = this.f50773q;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (this.f50765i != 5) {
            m44107E(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        if (this.f50765i != 3) {
            m44107E(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    /* renamed from: N */
    public final void m44098N(View view) {
        int i;
        if (this.f50765i == 5) {
            i = 4;
        } else {
            i = 0;
        }
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    public void expand() {
        setState(3);
    }

    @Nullable
    public View getCoplanarSiblingView() {
        WeakReference weakReference = this.f50774r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.f50757a.mo962d();
    }

    public float getHideFriction() {
        return this.f50769m;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.f50766j;
    }

    public int getSignificantVelocityThreshold() {
        return 500;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.f50765i;
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.f50764h;
    }

    /* renamed from: k */
    public final int m44087k(int i, View view) {
        int i2 = this.f50765i;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 5) {
                    return this.f50757a.mo961e();
                }
                throw new IllegalStateException("Unexpected value: " + this.f50765i);
            }
            return 0;
        }
        return i - this.f50757a.mo960f(view);
    }

    /* renamed from: l */
    public final float m44086l(float f, float f2) {
        return Math.abs(f - f2);
    }

    /* renamed from: m */
    public final void m44085m() {
        WeakReference weakReference = this.f50774r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f50774r = null;
    }

    /* renamed from: n */
    public final AccessibilityViewCommand m44084n(final int i) {
        return new AccessibilityViewCommand() { // from class: OI1
            {
                SideSheetBehavior.this = this;
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return SideSheetBehavior.m44097a(SideSheetBehavior.this, i, view, commandArguments);
            }
        };
    }

    /* renamed from: o */
    public final void m44083o(Context context) {
        if (this.f50761e == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f50761e);
        this.f50759c = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.f50760d;
        if (colorStateList != null) {
            this.f50759c.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f50759c.setTint(typedValue.data);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f50773q = null;
        this.f50767k = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f50773q = null;
        this.f50767k = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!m44101K(v)) {
            this.f50768l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m44106F();
        }
        if (this.f50776t == null) {
            this.f50776t = VelocityTracker.obtain();
        }
        this.f50776t.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f50768l) {
                this.f50768l = false;
                return false;
            }
        } else {
            this.f50777u = (int) motionEvent.getX();
        }
        if (!this.f50768l && (viewDragHelper = this.f50767k) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        int i2;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f50773q == null) {
            this.f50773q = new WeakReference(v);
            MaterialShapeDrawable materialShapeDrawable = this.f50759c;
            if (materialShapeDrawable != null) {
                ViewCompat.setBackground(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f50759c;
                float f = this.f50763g;
                if (f == -1.0f) {
                    f = ViewCompat.getElevation(v);
                }
                materialShapeDrawable2.setElevation(f);
            } else {
                ColorStateList colorStateList = this.f50760d;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            m44098N(v);
            m44099M();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
            m44081q(v);
        }
        if (this.f50767k == null) {
            this.f50767k = ViewDragHelper.create(coordinatorLayout, this.f50779w);
        }
        int mo960f = this.f50757a.mo960f(v);
        coordinatorLayout.onLayoutChild(v, i);
        this.f50771o = coordinatorLayout.getWidth();
        this.f50770n = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        if (marginLayoutParams != null) {
            i2 = this.f50757a.mo965a(marginLayoutParams);
        } else {
            i2 = 0;
        }
        this.f50772p = i2;
        ViewCompat.offsetLeftAndRight(v, m44087k(mo960f, v));
        m44108D(coordinatorLayout);
        for (TG1 tg1 : this.f50778v) {
            if (tg1 instanceof SideSheetCallback) {
                ((SideSheetCallback) tg1).m44065a(v);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m44080r(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), m44080r(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        }
        int i = savedState.f50780b;
        i = (i == 1 || i == 2) ? 5 : 5;
        this.f50765i = i;
        this.f50766j = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f50765i == 1 && actionMasked == 0) {
            return true;
        }
        if (m44102J()) {
            this.f50767k.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            m44106F();
        }
        if (this.f50776t == null) {
            this.f50776t = VelocityTracker.obtain();
        }
        this.f50776t.addMovement(motionEvent);
        if (m44102J() && actionMasked == 2 && !this.f50768l && m44072z(motionEvent)) {
            this.f50767k.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f50768l;
    }

    /* renamed from: p */
    public final void m44082p(View view, int i) {
        if (!this.f50778v.isEmpty()) {
            float mo964b = this.f50757a.mo964b(i);
            for (TG1 tg1 : this.f50778v) {
                tg1.onSlide(view, mo964b);
            }
        }
    }

    /* renamed from: q */
    public final void m44081q(View view) {
        if (ViewCompat.getAccessibilityPaneTitle(view) == null) {
            ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(f50755x));
        }
    }

    /* renamed from: r */
    public final int m44080r(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    /* renamed from: s */
    public int m44079s() {
        return this.f50770n;
    }

    public void setCoplanarSiblingView(@Nullable View view) {
        this.f50775s = -1;
        if (view == null) {
            m44085m();
            return;
        }
        this.f50774r = new WeakReference(view);
        WeakReference weakReference = this.f50773q;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            if (ViewCompat.isLaidOut(view2)) {
                view2.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(@IdRes int i) {
        this.f50775s = i;
        m44085m();
        WeakReference weakReference = this.f50773q;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i != -1 && ViewCompat.isLaidOut(view)) {
                view.requestLayout();
            }
        }
    }

    public void setDraggable(boolean z) {
        this.f50764h = z;
    }

    public void setHideFriction(float f) {
        this.f50769m = f;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i) {
        String str;
        if (i != 1 && i != 2) {
            WeakReference weakReference = this.f50773q;
            if (weakReference != null && weakReference.get() != null) {
                m44105G((View) this.f50773q.get(), new Runnable() { // from class: NI1
                    {
                        SideSheetBehavior.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        SideSheetBehavior.m44096b(SideSheetBehavior.this, i);
                    }
                });
                return;
            } else {
                m44103I(i);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb.append(str);
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    /* renamed from: t */
    public final int m44078t() {
        return 0;
    }

    /* renamed from: u */
    public float m44077u() {
        return 0.5f;
    }

    /* renamed from: v */
    public int m44076v() {
        return this.f50772p;
    }

    /* renamed from: w */
    public int m44075w(int i) {
        if (i != 3) {
            if (i == 5) {
                return this.f50757a.mo961e();
            }
            throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
        }
        return getExpandedOffset();
    }

    /* renamed from: x */
    public int m44074x() {
        return this.f50771o;
    }

    /* renamed from: y */
    public ViewDragHelper m44073y() {
        return this.f50767k;
    }

    /* renamed from: z */
    public final boolean m44072z(MotionEvent motionEvent) {
        if (!m44102J() || m44086l(this.f50777u, motionEvent.getX()) <= this.f50767k.getTouchSlop()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.f50778v.add(sideSheetCallback);
    }

    public void removeCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.f50778v.remove(sideSheetCallback);
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50762f = new C7070b();
        this.f50764h = true;
        this.f50765i = 5;
        this.f50766j = 5;
        this.f50769m = 0.1f;
        this.f50775s = -1;
        this.f50778v = new LinkedHashSet();
        this.f50779w = new C7069a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.f50760d = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f50761e = ShapeAppearanceModel.builder(context, attributeSet, 0, f50756y).build();
        }
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            setCoplanarSiblingViewId(obtainStyledAttributes.getResourceId(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        m44083o(context);
        this.f50763g = obtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        obtainStyledAttributes.recycle();
        m44104H(m44078t());
        this.f50758b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
