package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.FloatRange;
import androidx.annotation.InterfaceC2037Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;

    /* renamed from: h0 */
    public static final int f49214h0 = R.style.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    public boolean f49215A;

    /* renamed from: B */
    public final C6827f f49216B;

    /* renamed from: C */
    public ValueAnimator f49217C;

    /* renamed from: D */
    public int f49218D;

    /* renamed from: E */
    public int f49219E;

    /* renamed from: F */
    public int f49220F;

    /* renamed from: G */
    public float f49221G;

    /* renamed from: H */
    public int f49222H;

    /* renamed from: I */
    public float f49223I;

    /* renamed from: J */
    public boolean f49224J;

    /* renamed from: K */
    public boolean f49225K;

    /* renamed from: L */
    public boolean f49226L;

    /* renamed from: M */
    public int f49227M;

    /* renamed from: N */
    public int f49228N;

    /* renamed from: O */
    public ViewDragHelper f49229O;

    /* renamed from: P */
    public boolean f49230P;

    /* renamed from: Q */
    public int f49231Q;

    /* renamed from: R */
    public boolean f49232R;

    /* renamed from: S */
    public float f49233S;

    /* renamed from: T */
    public int f49234T;

    /* renamed from: U */
    public int f49235U;

    /* renamed from: V */
    public int f49236V;

    /* renamed from: W */
    public WeakReference f49237W;

    /* renamed from: X */
    public WeakReference f49238X;

    /* renamed from: Y */
    public WeakReference f49239Y;

    /* renamed from: Z */
    public final ArrayList f49240Z;

    /* renamed from: a */
    public int f49241a;

    /* renamed from: a0 */
    public VelocityTracker f49242a0;

    /* renamed from: b */
    public boolean f49243b;

    /* renamed from: b0 */
    public int f49244b0;

    /* renamed from: c */
    public boolean f49245c;

    /* renamed from: c0 */
    public int f49246c0;

    /* renamed from: d */
    public float f49247d;

    /* renamed from: d0 */
    public boolean f49248d0;

    /* renamed from: e */
    public int f49249e;

    /* renamed from: e0 */
    public Map f49250e0;

    /* renamed from: f */
    public int f49251f;

    /* renamed from: f0 */
    public final SparseIntArray f49252f0;

    /* renamed from: g */
    public boolean f49253g;

    /* renamed from: g0 */
    public final ViewDragHelper.Callback f49254g0;

    /* renamed from: h */
    public int f49255h;

    /* renamed from: i */
    public int f49256i;

    /* renamed from: j */
    public MaterialShapeDrawable f49257j;

    /* renamed from: k */
    public ColorStateList f49258k;

    /* renamed from: l */
    public int f49259l;

    /* renamed from: m */
    public int f49260m;

    /* renamed from: n */
    public int f49261n;

    /* renamed from: o */
    public boolean f49262o;

    /* renamed from: p */
    public boolean f49263p;

    /* renamed from: q */
    public boolean f49264q;

    /* renamed from: r */
    public boolean f49265r;

    /* renamed from: s */
    public boolean f49266s;

    /* renamed from: t */
    public boolean f49267t;

    /* renamed from: u */
    public boolean f49268u;

    /* renamed from: v */
    public boolean f49269v;

    /* renamed from: w */
    public int f49270w;

    /* renamed from: x */
    public int f49271x;

    /* renamed from: y */
    public boolean f49272y;

    /* renamed from: z */
    public ShapeAppearanceModel f49273z;

    /* loaded from: classes4.dex */
    public static abstract class BottomSheetCallback {
        /* renamed from: a */
        public void mo45576a(View view) {
        }

        public abstract void onSlide(@NonNull View view, float f);

        public abstract void onStateChanged(@NonNull View view, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface SaveFlags {
    }

    /* loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6821a();

        /* renamed from: b */
        public final int f49274b;

        /* renamed from: c */
        public int f49275c;

        /* renamed from: d */
        public boolean f49276d;

        /* renamed from: e */
        public boolean f49277e;

        /* renamed from: f */
        public boolean f49278f;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        /* loaded from: classes4.dex */
        public class C6821a implements Parcelable.ClassLoaderCreator {
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
            parcel.writeInt(this.f49274b);
            parcel.writeInt(this.f49275c);
            parcel.writeInt(this.f49276d ? 1 : 0);
            parcel.writeInt(this.f49277e ? 1 : 0);
            parcel.writeInt(this.f49278f ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f49274b = parcel.readInt();
            this.f49275c = parcel.readInt();
            this.f49276d = parcel.readInt() == 1;
            this.f49277e = parcel.readInt() == 1;
            this.f49278f = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f49274b = bottomSheetBehavior.f49227M;
            this.f49275c = bottomSheetBehavior.f49251f;
            this.f49276d = bottomSheetBehavior.f49243b;
            this.f49277e = bottomSheetBehavior.f49224J;
            this.f49278f = bottomSheetBehavior.f49225K;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f49274b = i;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface State {
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes4.dex */
    public class RunnableC6822a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f49279a;

        /* renamed from: b */
        public final /* synthetic */ int f49280b;

        public RunnableC6822a(View view, int i) {
            this.f49279a = view;
            this.f49280b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m45624U(this.f49279a, this.f49280b, false);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes4.dex */
    public class C6823b implements ValueAnimator.AnimatorUpdateListener {
        public C6823b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f49257j != null) {
                BottomSheetBehavior.this.f49257j.setInterpolation(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes4.dex */
    public class C6824c implements ViewUtils.OnApplyWindowInsetsListener {

        /* renamed from: a */
        public final /* synthetic */ boolean f49283a;

        public C6824c(boolean z) {
            this.f49283a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, com.google.android.material.internal.ViewUtils.RelativePadding r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
                androidx.core.graphics.Insets r0 = r12.getInsets(r0)
                int r1 = androidx.core.view.WindowInsetsCompat.Type.mandatorySystemGestures()
                androidx.core.graphics.Insets r1 = r12.getInsets(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.top
                com.google.android.material.bottomsheet.BottomSheetBehavior.m45607l(r2, r3)
                boolean r2 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m45606m(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.getSystemWindowInsetBottom()
                com.google.android.material.bottomsheet.BottomSheetBehavior.m45604o(r3, r6)
                int r3 = r13.bottom
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m45605n(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m45603p(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.end
                goto L50
            L4e:
                int r4 = r13.start
            L50:
                int r6 = r0.left
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m45602q(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.start
                goto L62
            L60:
                int r13 = r13.end
            L62:
                int r2 = r0.right
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.m45601r(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.left
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = 1
                goto L81
            L80:
                r2 = 0
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.m45600s(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.right
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = 1
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.m45617b(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.top
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f49283a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.bottom
                com.google.android.material.bottomsheet.BottomSheetBehavior.m45616c(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.m45606m(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f49283a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.m45615d(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C6824c.onApplyWindowInsets(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.ViewUtils$RelativePadding):androidx.core.view.WindowInsetsCompat");
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes4.dex */
    public class C6825d extends ViewDragHelper.Callback {

        /* renamed from: a */
        public long f49285a;

        public C6825d() {
        }

        /* renamed from: a */
        public final boolean m45589a(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.f49236V + bottomSheetBehavior.getExpandedOffset()) / 2) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return MathUtils.clamp(i, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View view) {
            if (BottomSheetBehavior.this.m45594y()) {
                return BottomSheetBehavior.this.f49236V;
            }
            return BottomSheetBehavior.this.f49222H;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (i == 1 && BottomSheetBehavior.this.f49226L) {
                BottomSheetBehavior.this.m45628Q(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m45641D(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
            if (r10.shouldExpandOnUpwardDrag(r3, (r9 * 100.0f) / r10.f49236V) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
            if (r9 > r7.f49286b.f49220F) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f49286b.getExpandedOffset()) < java.lang.Math.abs(r8.getTop() - r7.f49286b.f49220F)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
            if (r7.f49286b.shouldSkipHalfExpandedStateWhenDragging() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
            if (java.lang.Math.abs(r9 - r7.f49286b.f49219E) < java.lang.Math.abs(r9 - r7.f49286b.f49222H)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010e, code lost:
            if (r7.f49286b.shouldSkipHalfExpandedStateWhenDragging() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0128, code lost:
            if (r7.f49286b.shouldSkipHalfExpandedStateWhenDragging() == false) goto L6;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onViewReleased(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C6825d.onViewReleased(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f49227M;
            if (i2 == 1 || bottomSheetBehavior.f49248d0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f49244b0 == i) {
                WeakReference weakReference = bottomSheetBehavior.f49239Y;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f49285a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f49237W;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes4.dex */
    public class C6826e implements AccessibilityViewCommand {

        /* renamed from: a */
        public final /* synthetic */ int f49287a;

        public C6826e(int i) {
            this.f49287a = i;
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
            BottomSheetBehavior.this.setState(this.f49287a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f49241a = 0;
        this.f49243b = true;
        this.f49245c = false;
        this.f49259l = -1;
        this.f49260m = -1;
        this.f49216B = new C6827f(this, null);
        this.f49221G = 0.5f;
        this.f49223I = -1.0f;
        this.f49226L = true;
        this.f49227M = 4;
        this.f49228N = 4;
        this.f49233S = 0.1f;
        this.f49240Z = new ArrayList();
        this.f49252f0 = new SparseIntArray();
        this.f49254g0 = new C6825d();
    }

    /* renamed from: A */
    private AccessibilityViewCommand m45644A(int i) {
        return new C6826e(i);
    }

    /* renamed from: B */
    private void m45643B(Context context) {
        if (this.f49273z == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f49273z);
        this.f49257j = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.f49258k;
        if (colorStateList != null) {
            this.f49257j.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f49257j.setTint(typedValue.data);
    }

    /* renamed from: F */
    private int m45639F(int i, int i2, int i3, int i4) {
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

    /* renamed from: L */
    private void m45633L(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, m45644A(i));
    }

    /* renamed from: O */
    private void m45630O(View view, Runnable runnable) {
        if (m45634K(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: S */
    private boolean m45626S() {
        if (this.f49229O != null && (this.f49226L || this.f49227M == 1)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m45624U(View view, int i, boolean z) {
        int m45637H = m45637H(i);
        ViewDragHelper viewDragHelper = this.f49229O;
        if (viewDragHelper != null && (!z ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), m45637H) : viewDragHelper.settleCapturedViewAt(view.getLeft(), m45637H))) {
            m45628Q(2);
            m45621X(i, true);
            this.f49216B.m45586c(i);
            return;
        }
        m45628Q(i);
    }

    /* renamed from: V */
    private void m45623V() {
        WeakReference weakReference = this.f49237W;
        if (weakReference != null) {
            m45622W((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f49238X;
        if (weakReference2 != null) {
            m45622W((View) weakReference2.get(), 1);
        }
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: C */
    public final void m45642C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f49217C = ofFloat;
        ofFloat.setDuration(500L);
        this.f49217C.addUpdateListener(new C6823b());
    }

    /* renamed from: D */
    public void m45641D(int i) {
        View view = (View) this.f49237W.get();
        if (view != null && !this.f49240Z.isEmpty()) {
            float m45595x = m45595x(i);
            for (int i2 = 0; i2 < this.f49240Z.size(); i2++) {
                ((BottomSheetCallback) this.f49240Z.get(i2)).onSlide(view, m45595x);
            }
        }
    }

    /* renamed from: E */
    public View m45640E(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m45640E = m45640E(viewGroup.getChildAt(i));
                if (m45640E != null) {
                    return m45640E;
                }
            }
        }
        return null;
    }

    /* renamed from: G */
    public MaterialShapeDrawable m45638G() {
        return this.f49257j;
    }

    /* renamed from: H */
    public final int m45637H(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.f49220F;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i);
                }
                return this.f49236V;
            }
            return this.f49222H;
        }
        return getExpandedOffset();
    }

    /* renamed from: I */
    public final float m45636I() {
        VelocityTracker velocityTracker = this.f49242a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f49247d);
        return this.f49242a0.getYVelocity(this.f49244b0);
    }

    /* renamed from: J */
    public final boolean m45635J() {
        if (this.f49227M == 3 && (this.f49272y || getExpandedOffset() == 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m45634K(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view)) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final void m45632M() {
        this.f49244b0 = -1;
        VelocityTracker velocityTracker = this.f49242a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f49242a0 = null;
        }
    }

    /* renamed from: N */
    public final void m45631N(SavedState savedState) {
        int i = this.f49241a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f49251f = savedState.f49275c;
        }
        if (i == -1 || (i & 2) == 2) {
            this.f49243b = savedState.f49276d;
        }
        if (i == -1 || (i & 4) == 4) {
            this.f49224J = savedState.f49277e;
        }
        if (i == -1 || (i & 8) == 8) {
            this.f49225K = savedState.f49278f;
        }
    }

    /* renamed from: P */
    public void m45629P(View view) {
        WeakReference weakReference;
        if (view == null && (weakReference = this.f49238X) != null) {
            m45593z((View) weakReference.get(), 1);
            this.f49238X = null;
            return;
        }
        this.f49238X = new WeakReference(view);
        m45622W(view, 1);
    }

    /* renamed from: Q */
    public void m45628Q(int i) {
        View view;
        if (this.f49227M == i) {
            return;
        }
        this.f49227M = i;
        if (i == 4 || i == 3 || i == 6 || (this.f49224J && i == 5)) {
            this.f49228N = i;
        }
        WeakReference weakReference = this.f49237W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m45620Y(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m45620Y(false);
        }
        m45621X(i, true);
        for (int i2 = 0; i2 < this.f49240Z.size(); i2++) {
            ((BottomSheetCallback) this.f49240Z.get(i2)).onStateChanged(view, i);
        }
        m45623V();
    }

    /* renamed from: R */
    public final void m45627R(View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29 && !isGestureInsetBottomIgnored() && !this.f49253g) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f49263p && !this.f49264q && !this.f49265r && !this.f49267t && !this.f49268u && !this.f49269v && !z) {
            return;
        }
        ViewUtils.doOnApplyWindowInsets(view, new C6824c(z));
    }

    /* renamed from: T */
    public boolean m45625T(View view, float f) {
        if (this.f49225K) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.f49222H) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * this.f49233S)) - this.f49222H) / m45596w() > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public final void m45622W(View view, int i) {
        if (view == null) {
            return;
        }
        m45593z(view, i);
        int i2 = 6;
        if (!this.f49243b && this.f49227M != 6) {
            this.f49252f0.put(i, m45599t(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.f49224J && isHideableWhenDragging() && this.f49227M != 5) {
            m45633L(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
        }
        int i3 = this.f49227M;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 6) {
                    m45633L(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
                    m45633L(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
                    return;
                }
                return;
            }
            if (this.f49243b) {
                i2 = 3;
            }
            m45633L(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, i2);
            return;
        }
        if (this.f49243b) {
            i2 = 4;
        }
        m45633L(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, i2);
    }

    /* renamed from: X */
    public final void m45621X(int i, boolean z) {
        boolean m45635J;
        ValueAnimator valueAnimator;
        if (i != 2 && this.f49215A != (m45635J = m45635J()) && this.f49257j != null) {
            this.f49215A = m45635J;
            float f = 0.0f;
            if (z && (valueAnimator = this.f49217C) != null) {
                if (valueAnimator.isRunning()) {
                    this.f49217C.reverse();
                    return;
                }
                if (!m45635J) {
                    f = 1.0f;
                }
                this.f49217C.setFloatValues(1.0f - f, f);
                this.f49217C.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f49217C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f49217C.cancel();
            }
            MaterialShapeDrawable materialShapeDrawable = this.f49257j;
            if (!this.f49215A) {
                f = 1.0f;
            }
            materialShapeDrawable.setInterpolation(f);
        }
    }

    /* renamed from: Y */
    public final void m45620Y(boolean z) {
        Map map;
        WeakReference weakReference = this.f49237W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.f49250e0 == null) {
                this.f49250e0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.f49237W.get()) {
                if (z) {
                    this.f49250e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.f49245c) {
                        ViewCompat.setImportantForAccessibility(childAt, 4);
                    }
                } else if (this.f49245c && (map = this.f49250e0) != null && map.containsKey(childAt)) {
                    ViewCompat.setImportantForAccessibility(childAt, ((Integer) this.f49250e0.get(childAt)).intValue());
                }
            }
        }
        if (!z) {
            this.f49250e0 = null;
        } else if (this.f49245c) {
            ((View) this.f49237W.get()).sendAccessibilityEvent(8);
        }
    }

    /* renamed from: Z */
    public final void m45619Z(boolean z) {
        View view;
        if (this.f49237W != null) {
            m45598u();
            if (this.f49227M == 4 && (view = (View) this.f49237W.get()) != null) {
                if (z) {
                    setState(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (!this.f49240Z.contains(bottomSheetCallback)) {
            this.f49240Z.add(bottomSheetCallback);
        }
    }

    public float calculateSlideOffset() {
        WeakReference weakReference = this.f49237W;
        if (weakReference != null && weakReference.get() != null) {
            return m45595x(((View) this.f49237W.get()).getTop());
        }
        return -1.0f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.f49217C = null;
    }

    public int getExpandedOffset() {
        int i;
        if (this.f49243b) {
            return this.f49219E;
        }
        int i2 = this.f49218D;
        if (this.f49266s) {
            i = 0;
        } else {
            i = this.f49271x;
        }
        return Math.max(i2, i);
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getHalfExpandedRatio() {
        return this.f49221G;
    }

    public float getHideFriction() {
        return this.f49233S;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.f49228N;
    }

    @InterfaceC2037Px
    public int getMaxHeight() {
        return this.f49260m;
    }

    @InterfaceC2037Px
    public int getMaxWidth() {
        return this.f49259l;
    }

    public int getPeekHeight() {
        if (this.f49253g) {
            return -1;
        }
        return this.f49251f;
    }

    public int getSaveFlags() {
        return this.f49241a;
    }

    public int getSignificantVelocityThreshold() {
        return this.f49249e;
    }

    public boolean getSkipCollapsed() {
        return this.f49225K;
    }

    public int getState() {
        return this.f49227M;
    }

    public boolean isDraggable() {
        return this.f49226L;
    }

    public boolean isFitToContents() {
        return this.f49243b;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.f49262o;
    }

    public boolean isHideable() {
        return this.f49224J;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f49237W = null;
        this.f49229O = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f49237W = null;
        this.f49229O = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        View view;
        ViewDragHelper viewDragHelper;
        if (v.isShown() && this.f49226L) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m45632M();
            }
            if (this.f49242a0 == null) {
                this.f49242a0 = VelocityTracker.obtain();
            }
            this.f49242a0.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f49248d0 = false;
                    this.f49244b0 = -1;
                    if (this.f49230P) {
                        this.f49230P = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.f49246c0 = (int) motionEvent.getY();
                if (this.f49227M != 2) {
                    WeakReference weakReference = this.f49239Y;
                    if (weakReference != null) {
                        view = (View) weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.f49246c0)) {
                        this.f49244b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f49248d0 = true;
                    }
                }
                if (this.f49244b0 == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.f49246c0)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f49230P = z;
            }
            if (!this.f49230P && (viewDragHelper = this.f49229O) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.f49239Y;
            if (weakReference2 != null) {
                view2 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.f49230P || this.f49227M == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f49229O == null || Math.abs(this.f49246c0 - motionEvent.getY()) <= this.f49229O.getTouchSlop()) {
                return false;
            }
            return true;
        }
        this.f49230P = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f49237W == null) {
            this.f49255h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            m45627R(v);
            ViewCompat.setWindowInsetsAnimationCallback(v, new C18920Ze0(v));
            this.f49237W = new WeakReference(v);
            MaterialShapeDrawable materialShapeDrawable = this.f49257j;
            if (materialShapeDrawable != null) {
                ViewCompat.setBackground(v, materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.f49257j;
                float f = this.f49223I;
                if (f == -1.0f) {
                    f = ViewCompat.getElevation(v);
                }
                materialShapeDrawable2.setElevation(f);
            } else {
                ColorStateList colorStateList = this.f49258k;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            m45623V();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
        }
        if (this.f49229O == null) {
            this.f49229O = ViewDragHelper.create(coordinatorLayout, this.f49254g0);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.f49235U = coordinatorLayout.getWidth();
        this.f49236V = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f49234T = height;
        int i2 = this.f49236V;
        int i3 = i2 - height;
        int i4 = this.f49271x;
        if (i3 < i4) {
            if (this.f49266s) {
                this.f49234T = i2;
            } else {
                this.f49234T = i2 - i4;
            }
        }
        this.f49219E = Math.max(0, i2 - this.f49234T);
        m45597v();
        m45598u();
        int i5 = this.f49227M;
        if (i5 == 3) {
            ViewCompat.offsetTopAndBottom(v, getExpandedOffset());
        } else if (i5 == 6) {
            ViewCompat.offsetTopAndBottom(v, this.f49220F);
        } else if (this.f49224J && i5 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.f49236V);
        } else if (i5 == 4) {
            ViewCompat.offsetTopAndBottom(v, this.f49222H);
        } else if (i5 == 1 || i5 == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        m45621X(this.f49227M, false);
        this.f49239Y = new WeakReference(m45640E(v));
        for (int i6 = 0; i6 < this.f49240Z.size(); i6++) {
            ((BottomSheetCallback) this.f49240Z.get(i6)).mo45576a(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m45639F(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f49259l, marginLayoutParams.width), m45639F(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f49260m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        WeakReference weakReference;
        if (!isNestedScrollingCheckEnabled() || (weakReference = this.f49239Y) == null || view != weakReference.get()) {
            return false;
        }
        if (this.f49227M == 3 && !super.onNestedPreFling(coordinatorLayout, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f49239Y;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (isNestedScrollingCheckEnabled() && view != view2) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                ViewCompat.offsetTopAndBottom(v, -expandedOffset);
                m45628Q(3);
            } else if (!this.f49226L) {
                return;
            } else {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                m45628Q(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (i4 > this.f49222H && !m45594y()) {
                int i5 = top - this.f49222H;
                iArr[1] = i5;
                ViewCompat.offsetTopAndBottom(v, -i5);
                m45628Q(4);
            } else if (!this.f49226L) {
                return;
            } else {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                m45628Q(1);
            }
        }
        m45641D(v.getTop());
        this.f49231Q = i2;
        this.f49232R = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        m45631N(savedState);
        int i = savedState.f49274b;
        if (i != 1 && i != 2) {
            this.f49227M = i;
            this.f49228N = i;
            return;
        }
        this.f49227M = 4;
        this.f49228N = 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.f49231Q = 0;
        this.f49232R = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r4.getTop() <= r2.f49220F) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f49219E) < java.lang.Math.abs(r3 - r2.f49222H)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f49222H)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f49220F) < java.lang.Math.abs(r3 - r2.f49222H)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r3, @androidx.annotation.NonNull V r4, @androidx.annotation.NonNull android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.m45628Q(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f49239Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f49232R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f49231Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f49243b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f49220F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f49224J
            if (r3 == 0) goto L49
            float r3 = r2.m45636I()
            boolean r3 = r2.m45625T(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f49231Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f49243b
            if (r1 == 0) goto L68
            int r5 = r2.f49219E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f49222H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f49220F
            if (r3 >= r1) goto L7e
            int r1 = r2.f49222H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f49222H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f49243b
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f49220F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f49222H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.m45624U(r4, r0, r3)
            r2.f49232R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f49227M == 1 && actionMasked == 0) {
            return true;
        }
        if (m45626S()) {
            this.f49229O.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            m45632M();
        }
        if (this.f49242a0 == null) {
            this.f49242a0 = VelocityTracker.obtain();
        }
        this.f49242a0.addMovement(motionEvent);
        if (m45626S() && actionMasked == 2 && !this.f49230P && Math.abs(this.f49246c0 - motionEvent.getY()) > this.f49229O.getTouchSlop()) {
            this.f49229O.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f49230P;
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.f49240Z.remove(bottomSheetCallback);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f49240Z.clear();
        if (bottomSheetCallback != null) {
            this.f49240Z.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z) {
        this.f49226L = z;
    }

    public void setExpandedOffset(int i) {
        if (i >= 0) {
            this.f49218D = i;
            m45621X(this.f49227M, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void setFitToContents(boolean z) {
        int i;
        if (this.f49243b == z) {
            return;
        }
        this.f49243b = z;
        if (this.f49237W != null) {
            m45598u();
        }
        if (this.f49243b && this.f49227M == 6) {
            i = 3;
        } else {
            i = this.f49227M;
        }
        m45628Q(i);
        m45621X(this.f49227M, true);
        m45623V();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.f49262o = z;
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, fromInclusive = false, m64694to = 1.0d, toInclusive = false) float f) {
        if (f > 0.0f && f < 1.0f) {
            this.f49221G = f;
            if (this.f49237W != null) {
                m45597v();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void setHideFriction(float f) {
        this.f49233S = f;
    }

    public void setHideable(boolean z) {
        if (this.f49224J != z) {
            this.f49224J = z;
            if (!z && this.f49227M == 5) {
                setState(4);
            }
            m45623V();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHideableInternal(boolean z) {
        this.f49224J = z;
    }

    public void setMaxHeight(@InterfaceC2037Px int i) {
        this.f49260m = i;
    }

    public void setMaxWidth(@InterfaceC2037Px int i) {
        this.f49259l = i;
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public void setSaveFlags(int i) {
        this.f49241a = i;
    }

    public void setSignificantVelocityThreshold(int i) {
        this.f49249e = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.f49225K = z;
    }

    public void setState(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2) {
            if (!this.f49224J && i == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i);
                return;
            }
            if (i == 6 && this.f49243b && m45637H(i) <= this.f49219E) {
                i2 = 3;
            } else {
                i2 = i;
            }
            WeakReference weakReference = this.f49237W;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f49237W.get();
                m45630O(view, new RunnableC6822a(view, i2));
                return;
            }
            m45628Q(i);
            return;
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

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.f49245c = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long j, @FloatRange(from = 0.0d, m64694to = 100.0d) float f) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    /* renamed from: t */
    public final int m45599t(View view, int i, int i2) {
        return ViewCompat.addAccessibilityAction(view, view.getResources().getString(i), m45644A(i2));
    }

    /* renamed from: u */
    public final void m45598u() {
        int m45596w = m45596w();
        if (this.f49243b) {
            this.f49222H = Math.max(this.f49236V - m45596w, this.f49219E);
        } else {
            this.f49222H = this.f49236V - m45596w;
        }
    }

    /* renamed from: v */
    public final void m45597v() {
        this.f49220F = (int) (this.f49236V * (1.0f - this.f49221G));
    }

    /* renamed from: w */
    public final int m45596w() {
        int i;
        if (this.f49253g) {
            return Math.min(Math.max(this.f49255h, this.f49236V - ((this.f49235U * 9) / 16)), this.f49234T) + this.f49270w;
        }
        if (!this.f49262o && !this.f49263p && (i = this.f49261n) > 0) {
            return Math.max(this.f49251f, i + this.f49256i);
        }
        return this.f49251f + this.f49270w;
    }

    /* renamed from: x */
    public final float m45595x(int i) {
        float f;
        float f2;
        int i2 = this.f49222H;
        if (i <= i2 && i2 != getExpandedOffset()) {
            int i3 = this.f49222H;
            f = i3 - i;
            f2 = i3 - getExpandedOffset();
        } else {
            int i4 = this.f49222H;
            f = i4 - i;
            f2 = this.f49236V - i4;
        }
        return f / f2;
    }

    /* renamed from: y */
    public final boolean m45594y() {
        if (isHideable() && isHideableWhenDragging()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final void m45593z(View view, int i) {
        if (view == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(view, 524288);
        ViewCompat.removeAccessibilityAction(view, 262144);
        ViewCompat.removeAccessibilityAction(view, 1048576);
        int i2 = this.f49252f0.get(i, -1);
        if (i2 != -1) {
            ViewCompat.removeAccessibilityAction(view, i2);
            this.f49252f0.delete(i);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes4.dex */
    public class C6827f {

        /* renamed from: a */
        public int f49289a;

        /* renamed from: b */
        public boolean f49290b;

        /* renamed from: c */
        public final Runnable f49291c;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f$a */
        /* loaded from: classes4.dex */
        public class RunnableC6828a implements Runnable {
            public RunnableC6828a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C6827f.this.f49290b = false;
                ViewDragHelper viewDragHelper = BottomSheetBehavior.this.f49229O;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    C6827f c6827f = C6827f.this;
                    c6827f.m45586c(c6827f.f49289a);
                    return;
                }
                C6827f c6827f2 = C6827f.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f49227M == 2) {
                    bottomSheetBehavior.m45628Q(c6827f2.f49289a);
                }
            }
        }

        public C6827f() {
            this.f49291c = new RunnableC6828a();
        }

        /* renamed from: c */
        public void m45586c(int i) {
            WeakReference weakReference = BottomSheetBehavior.this.f49237W;
            if (weakReference != null && weakReference.get() != null) {
                this.f49289a = i;
                if (!this.f49290b) {
                    ViewCompat.postOnAnimation((View) BottomSheetBehavior.this.f49237W.get(), this.f49291c);
                    this.f49290b = true;
                }
            }
        }

        public /* synthetic */ C6827f(BottomSheetBehavior bottomSheetBehavior, RunnableC6822a runnableC6822a) {
            this();
        }
    }

    public final void setPeekHeight(int i, boolean z) {
        if (i == -1) {
            if (this.f49253g) {
                return;
            }
            this.f49253g = true;
        } else if (!this.f49253g && this.f49251f == i) {
            return;
        } else {
            this.f49253g = false;
            this.f49251f = Math.max(0, i);
        }
        m45619Z(z);
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f49241a = 0;
        this.f49243b = true;
        this.f49245c = false;
        this.f49259l = -1;
        this.f49260m = -1;
        this.f49216B = new C6827f(this, null);
        this.f49221G = 0.5f;
        this.f49223I = -1.0f;
        this.f49226L = true;
        this.f49227M = 4;
        this.f49228N = 4;
        this.f49233S = 0.1f;
        this.f49240Z = new ArrayList();
        this.f49252f0 = new SparseIntArray();
        this.f49254g0 = new C6825d();
        this.f49256i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.f49258k = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.f49273z = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, f49214h0).build();
        }
        m45643B(context);
        m45642C();
        this.f49223I = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.f49263p = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f49264q = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f49265r = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f49266s = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.f49267t = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.f49268u = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.f49269v = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.f49272y = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.f49247d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}