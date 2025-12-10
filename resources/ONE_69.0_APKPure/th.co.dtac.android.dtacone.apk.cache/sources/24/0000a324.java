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
    public static final int f50767x = R.string.side_sheet_accessibility_pane_title;

    /* renamed from: y */
    public static final int f50768y = R.style.Widget_Material3_SideSheet;

    /* renamed from: a */
    public RH1 f50769a;

    /* renamed from: b */
    public float f50770b;

    /* renamed from: c */
    public MaterialShapeDrawable f50771c;

    /* renamed from: d */
    public ColorStateList f50772d;

    /* renamed from: e */
    public ShapeAppearanceModel f50773e;

    /* renamed from: f */
    public final C7059b f50774f;

    /* renamed from: g */
    public float f50775g;

    /* renamed from: h */
    public boolean f50776h;

    /* renamed from: i */
    public int f50777i;

    /* renamed from: j */
    public int f50778j;

    /* renamed from: k */
    public ViewDragHelper f50779k;

    /* renamed from: l */
    public boolean f50780l;

    /* renamed from: m */
    public float f50781m;

    /* renamed from: n */
    public int f50782n;

    /* renamed from: o */
    public int f50783o;

    /* renamed from: p */
    public int f50784p;

    /* renamed from: q */
    public WeakReference f50785q;

    /* renamed from: r */
    public WeakReference f50786r;

    /* renamed from: s */
    public int f50787s;

    /* renamed from: t */
    public VelocityTracker f50788t;

    /* renamed from: u */
    public int f50789u;

    /* renamed from: v */
    public final Set f50790v;

    /* renamed from: w */
    public final ViewDragHelper.Callback f50791w;

    /* loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7057a();

        /* renamed from: b */
        public final int f50792b;

        /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$a */
        /* loaded from: classes4.dex */
        public class C7057a implements Parcelable.ClassLoaderCreator {
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
            parcel.writeInt(this.f50792b);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f50792b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f50792b = sideSheetBehavior.f50777i;
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    /* loaded from: classes4.dex */
    public class C7058a extends ViewDragHelper.Callback {
        public C7058a() {
            SideSheetBehavior.this = r1;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return MathUtils.clamp(i, SideSheetBehavior.this.getExpandedOffset(), SideSheetBehavior.this.f50783o);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return SideSheetBehavior.this.f50783o;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (i == 1 && SideSheetBehavior.this.f50776h) {
                SideSheetBehavior.this.m44090I(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
            if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                SideSheetBehavior.this.f50769a.mo22751i(marginLayoutParams, view.getLeft(), view.getRight());
                coplanarSiblingView.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.m44069p(view, i);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int mo22757c = SideSheetBehavior.this.f50769a.mo22757c(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.m44087L(view, mo22757c, sideSheetBehavior.shouldSkipSmoothAnimation());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            if (SideSheetBehavior.this.f50777i == 1 || SideSheetBehavior.this.f50785q == null || SideSheetBehavior.this.f50785q.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    /* loaded from: classes4.dex */
    public class C7059b {

        /* renamed from: a */
        public int f50794a;

        /* renamed from: b */
        public boolean f50795b;

        /* renamed from: c */
        public final Runnable f50796c = new Runnable() { // from class: MJ1
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.C7059b.m44055a(SideSheetBehavior.C7059b.this);
            }
        };

        public C7059b() {
            SideSheetBehavior.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m44055a(C7059b c7059b) {
            c7059b.m44053c();
        }

        /* renamed from: b */
        public void m44054b(int i) {
            if (SideSheetBehavior.this.f50785q != null && SideSheetBehavior.this.f50785q.get() != null) {
                this.f50794a = i;
                if (!this.f50795b) {
                    ViewCompat.postOnAnimation((View) SideSheetBehavior.this.f50785q.get(), this.f50796c);
                    this.f50795b = true;
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void m44053c() {
            this.f50795b = false;
            if (SideSheetBehavior.this.f50779k != null && SideSheetBehavior.this.f50779k.continueSettling(true)) {
                m44054b(this.f50794a);
            } else if (SideSheetBehavior.this.f50777i == 2) {
                SideSheetBehavior.this.m44090I(this.f50794a);
            }
        }
    }

    public SideSheetBehavior() {
        this.f50774f = new C7059b();
        this.f50776h = true;
        this.f50777i = 5;
        this.f50778j = 5;
        this.f50781m = 0.1f;
        this.f50787s = -1;
        this.f50790v = new LinkedHashSet();
        this.f50791w = new C7058a();
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m44084a(SideSheetBehavior sideSheetBehavior, int i, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return sideSheetBehavior.m44097B(i, view, commandArguments);
    }

    /* renamed from: b */
    public static /* synthetic */ void m44083b(SideSheetBehavior sideSheetBehavior, int i) {
        sideSheetBehavior.m44096C(i);
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
    public final boolean m44098A(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final /* synthetic */ boolean m44097B(int i, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        setState(i);
        return true;
    }

    /* renamed from: C */
    public final /* synthetic */ void m44096C(int i) {
        View view = (View) this.f50785q.get();
        if (view != null) {
            m44087L(view, i, false);
        }
    }

    /* renamed from: D */
    public final void m44095D(CoordinatorLayout coordinatorLayout) {
        int i;
        View findViewById;
        if (this.f50786r == null && (i = this.f50787s) != -1 && (findViewById = coordinatorLayout.findViewById(i)) != null) {
            this.f50786r = new WeakReference(findViewById);
        }
    }

    /* renamed from: E */
    public final void m44094E(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, m44071n(i));
    }

    /* renamed from: F */
    public final void m44093F() {
        VelocityTracker velocityTracker = this.f50788t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f50788t = null;
        }
    }

    /* renamed from: G */
    public final void m44092G(View view, Runnable runnable) {
        if (m44098A(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: H */
    public final void m44091H(int i) {
        RH1 rh1 = this.f50769a;
        if (rh1 != null && rh1.mo22753g() == i) {
            return;
        }
        if (i == 0) {
            this.f50769a = new C22262sz1(this);
            return;
        }
        throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0");
    }

    /* renamed from: I */
    public void m44090I(int i) {
        View view;
        if (this.f50777i == i) {
            return;
        }
        this.f50777i = i;
        if (i == 3 || i == 5) {
            this.f50778j = i;
        }
        WeakReference weakReference = this.f50785q;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        m44085N(view);
        for (QH1 qh1 : this.f50790v) {
            qh1.onStateChanged(view, i);
        }
        m44086M();
    }

    /* renamed from: J */
    public final boolean m44089J() {
        if (this.f50779k != null && (this.f50776h || this.f50777i == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m44088K(View view) {
        if ((view.isShown() || ViewCompat.getAccessibilityPaneTitle(view) != null) && this.f50776h) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final void m44087L(View view, int i, boolean z) {
        if (this.f50769a.mo22752h(view, i, z)) {
            m44090I(2);
            this.f50774f.m44054b(i);
            return;
        }
        m44090I(i);
    }

    /* renamed from: M */
    public final void m44086M() {
        View view;
        WeakReference weakReference = this.f50785q;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        if (this.f50777i != 5) {
            m44094E(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        if (this.f50777i != 3) {
            m44094E(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
        }
    }

    /* renamed from: N */
    public final void m44085N(View view) {
        int i;
        if (this.f50777i == 5) {
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
        WeakReference weakReference = this.f50786r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.f50769a.mo22756d();
    }

    public float getHideFriction() {
        return this.f50781m;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.f50778j;
    }

    public int getSignificantVelocityThreshold() {
        return 500;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.f50777i;
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.f50776h;
    }

    /* renamed from: k */
    public final int m44074k(int i, View view) {
        int i2 = this.f50777i;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 5) {
                    return this.f50769a.mo22755e();
                }
                throw new IllegalStateException("Unexpected value: " + this.f50777i);
            }
            return 0;
        }
        return i - this.f50769a.mo22754f(view);
    }

    /* renamed from: l */
    public final float m44073l(float f, float f2) {
        return Math.abs(f - f2);
    }

    /* renamed from: m */
    public final void m44072m() {
        WeakReference weakReference = this.f50786r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f50786r = null;
    }

    /* renamed from: n */
    public final AccessibilityViewCommand m44071n(final int i) {
        return new AccessibilityViewCommand() { // from class: LJ1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return SideSheetBehavior.m44084a(SideSheetBehavior.this, i, view, commandArguments);
            }
        };
    }

    /* renamed from: o */
    public final void m44070o(Context context) {
        if (this.f50773e == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f50773e);
        this.f50771c = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.f50772d;
        if (colorStateList != null) {
            this.f50771c.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f50771c.setTint(typedValue.data);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f50785q = null;
        this.f50779k = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f50785q = null;
        this.f50779k = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!m44088K(v)) {
            this.f50780l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m44093F();
        }
        if (this.f50788t == null) {
            this.f50788t = VelocityTracker.obtain();
        }
        this.f50788t.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f50780l) {
                this.f50780l = false;
                return false;
            }
        } else {
            this.f50789u = (int) motionEvent.getX();
        }
        if (!this.f50780l && (viewDragHelper = this.f50779k) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
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
        if (this.f50785q == null) {
            this.f50785q = new WeakReference(v);
            MaterialShapeDrawable materialShapeDrawable = this.f50771c;
            if (materialShapeDrawable != null) {
                ViewCompat.setBackground(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f50771c;
                float f = this.f50775g;
                if (f == -1.0f) {
                    f = ViewCompat.getElevation(v);
                }
                materialShapeDrawable2.setElevation(f);
            } else {
                ColorStateList colorStateList = this.f50772d;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            m44085N(v);
            m44086M();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
            m44068q(v);
        }
        if (this.f50779k == null) {
            this.f50779k = ViewDragHelper.create(coordinatorLayout, this.f50791w);
        }
        int mo22754f = this.f50769a.mo22754f(v);
        coordinatorLayout.onLayoutChild(v, i);
        this.f50783o = coordinatorLayout.getWidth();
        this.f50782n = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        if (marginLayoutParams != null) {
            i2 = this.f50769a.mo22759a(marginLayoutParams);
        } else {
            i2 = 0;
        }
        this.f50784p = i2;
        ViewCompat.offsetLeftAndRight(v, m44074k(mo22754f, v));
        m44095D(coordinatorLayout);
        for (QH1 qh1 : this.f50790v) {
            if (qh1 instanceof SideSheetCallback) {
                ((SideSheetCallback) qh1).m44052a(v);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m44067r(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), m44067r(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        }
        int i = savedState.f50792b;
        i = (i == 1 || i == 2) ? 5 : 5;
        this.f50777i = i;
        this.f50778j = i;
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
        if (this.f50777i == 1 && actionMasked == 0) {
            return true;
        }
        if (m44089J()) {
            this.f50779k.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            m44093F();
        }
        if (this.f50788t == null) {
            this.f50788t = VelocityTracker.obtain();
        }
        this.f50788t.addMovement(motionEvent);
        if (m44089J() && actionMasked == 2 && !this.f50780l && m44059z(motionEvent)) {
            this.f50779k.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f50780l;
    }

    /* renamed from: p */
    public final void m44069p(View view, int i) {
        if (!this.f50790v.isEmpty()) {
            float mo22758b = this.f50769a.mo22758b(i);
            for (QH1 qh1 : this.f50790v) {
                qh1.onSlide(view, mo22758b);
            }
        }
    }

    /* renamed from: q */
    public final void m44068q(View view) {
        if (ViewCompat.getAccessibilityPaneTitle(view) == null) {
            ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(f50767x));
        }
    }

    /* renamed from: r */
    public final int m44067r(int i, int i2, int i3, int i4) {
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
    public int m44066s() {
        return this.f50782n;
    }

    public void setCoplanarSiblingView(@Nullable View view) {
        this.f50787s = -1;
        if (view == null) {
            m44072m();
            return;
        }
        this.f50786r = new WeakReference(view);
        WeakReference weakReference = this.f50785q;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            if (ViewCompat.isLaidOut(view2)) {
                view2.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(@IdRes int i) {
        this.f50787s = i;
        m44072m();
        WeakReference weakReference = this.f50785q;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i != -1 && ViewCompat.isLaidOut(view)) {
                view.requestLayout();
            }
        }
    }

    public void setDraggable(boolean z) {
        this.f50776h = z;
    }

    public void setHideFriction(float f) {
        this.f50781m = f;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(final int i) {
        String str;
        if (i != 1 && i != 2) {
            WeakReference weakReference = this.f50785q;
            if (weakReference != null && weakReference.get() != null) {
                m44092G((View) this.f50785q.get(), new Runnable() { // from class: KJ1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SideSheetBehavior.m44083b(SideSheetBehavior.this, i);
                    }
                });
                return;
            } else {
                m44090I(i);
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
    public final int m44065t() {
        return 0;
    }

    /* renamed from: u */
    public float m44064u() {
        return 0.5f;
    }

    /* renamed from: v */
    public int m44063v() {
        return this.f50784p;
    }

    /* renamed from: w */
    public int m44062w(int i) {
        if (i != 3) {
            if (i == 5) {
                return this.f50769a.mo22755e();
            }
            throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
        }
        return getExpandedOffset();
    }

    /* renamed from: x */
    public int m44061x() {
        return this.f50783o;
    }

    /* renamed from: y */
    public ViewDragHelper m44060y() {
        return this.f50779k;
    }

    /* renamed from: z */
    public final boolean m44059z(MotionEvent motionEvent) {
        if (!m44089J() || m44073l(this.f50789u, motionEvent.getX()) <= this.f50779k.getTouchSlop()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.f50790v.add(sideSheetCallback);
    }

    public void removeCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.f50790v.remove(sideSheetCallback);
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50774f = new C7059b();
        this.f50776h = true;
        this.f50777i = 5;
        this.f50778j = 5;
        this.f50781m = 0.1f;
        this.f50787s = -1;
        this.f50790v = new LinkedHashSet();
        this.f50791w = new C7058a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.f50772d = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f50773e = ShapeAppearanceModel.builder(context, attributeSet, 0, f50768y).build();
        }
        if (obtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            setCoplanarSiblingViewId(obtainStyledAttributes.getResourceId(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        m44070o(context);
        this.f50775g = obtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        obtainStyledAttributes.recycle();
        m44091H(m44065t());
        this.f50770b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}