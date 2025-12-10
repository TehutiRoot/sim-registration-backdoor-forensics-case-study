package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C7095a;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes4.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* renamed from: a */
    public final int f50810a;

    /* renamed from: b */
    public final int f50811b;

    /* renamed from: c */
    public final int f50812c;

    /* renamed from: d */
    public final TimeInterpolator f50813d;

    /* renamed from: e */
    public final TimeInterpolator f50814e;

    /* renamed from: f */
    public final TimeInterpolator f50815f;

    /* renamed from: g */
    public final ViewGroup f50816g;

    /* renamed from: h */
    public final Context f50817h;

    /* renamed from: i */
    public final com.google.android.material.snackbar.ContentViewCallback f50818i;

    /* renamed from: j */
    public int f50819j;

    /* renamed from: k */
    public boolean f50820k;

    /* renamed from: l */
    public View$OnAttachStateChangeListenerC7094q f50821l;

    /* renamed from: m */
    public boolean f50822m;

    /* renamed from: n */
    public final Runnable f50823n;

    /* renamed from: o */
    public int f50824o;

    /* renamed from: p */
    public int f50825p;

    /* renamed from: q */
    public int f50826q;

    /* renamed from: r */
    public int f50827r;

    /* renamed from: s */
    public int f50828s;

    /* renamed from: t */
    public int f50829t;

    /* renamed from: u */
    public boolean f50830u;

    /* renamed from: v */
    public List f50831v;
    @NonNull
    protected final SnackbarBaseLayout view;

    /* renamed from: w */
    public Behavior f50832w;

    /* renamed from: x */
    public final AccessibilityManager f50833x;

    /* renamed from: y */
    public C7095a.InterfaceC7097b f50834y;

    /* renamed from: z */
    public static final TimeInterpolator f50809z = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;

    /* renamed from: A */
    public static final TimeInterpolator f50803A = AnimationUtils.LINEAR_INTERPOLATOR;

    /* renamed from: B */
    public static final TimeInterpolator f50804B = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;

    /* renamed from: D */
    public static final boolean f50806D = false;

    /* renamed from: E */
    public static final int[] f50807E = {R.attr.snackbarStyle};

    /* renamed from: F */
    public static final String f50808F = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: C */
    public static final Handler f50805C = new Handler(Looper.getMainLooper(), new C7085h());

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface AnimationMode {
    }

    /* loaded from: classes4.dex */
    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes4.dex */
        public @interface DismissEvent {
        }

        public void onDismissed(B b, int i) {
        }

        public void onShown(B b) {
        }
    }

    /* loaded from: classes4.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: l */
        public final BehaviorDelegate f50835l = new BehaviorDelegate(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
            return this.f50835l.canSwipeDismissView(view);
        }

        /* renamed from: h */
        public final void m43996h(BaseTransientBottomBar baseTransientBottomBar) {
            this.f50835l.setBaseTransientBottomBar(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f50835l.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static class BehaviorDelegate {

        /* renamed from: a */
        public C7095a.InterfaceC7097b f50836a;

        public BehaviorDelegate(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.setStartAlphaSwipeDistance(0.1f);
            swipeDismissBehavior.setEndAlphaSwipeDistance(0.6f);
            swipeDismissBehavior.setSwipeDirection(0);
        }

        public boolean canSwipeDismissView(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C7095a.m43973c().m43964l(this.f50836a);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C7095a.m43973c().m43965k(this.f50836a);
            }
        }

        public void setBaseTransientBottomBar(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f50836a = baseTransientBottomBar.f50834y;
        }
    }

    @Deprecated
    /* loaded from: classes4.dex */
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @IntRange(from = WorkQueueKt.NOTHING_TO_STEAL)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface Duration {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: l */
        public static final View.OnTouchListener f50837l = new View$OnTouchListenerC7077a();

        /* renamed from: a */
        public BaseTransientBottomBar f50838a;

        /* renamed from: b */
        public ShapeAppearanceModel f50839b;

        /* renamed from: c */
        public int f50840c;

        /* renamed from: d */
        public final float f50841d;

        /* renamed from: e */
        public final float f50842e;

        /* renamed from: f */
        public final int f50843f;

        /* renamed from: g */
        public final int f50844g;

        /* renamed from: h */
        public ColorStateList f50845h;

        /* renamed from: i */
        public PorterDuff.Mode f50846i;

        /* renamed from: j */
        public Rect f50847j;

        /* renamed from: k */
        public boolean f50848k;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a */
        /* loaded from: classes4.dex */
        public class View$OnTouchListenerC7077a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(@NonNull Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f50838a = baseTransientBottomBar;
        }

        /* renamed from: c */
        public void m43993c(ViewGroup viewGroup) {
            this.f50848k = true;
            viewGroup.addView(this);
            this.f50848k = false;
        }

        /* renamed from: d */
        public final Drawable m43992d() {
            int layer = MaterialColors.layer(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha());
            ShapeAppearanceModel shapeAppearanceModel = this.f50839b;
            Drawable m43999y = shapeAppearanceModel != null ? BaseTransientBottomBar.m43999y(layer, shapeAppearanceModel) : BaseTransientBottomBar.m44000x(layer, getResources());
            if (this.f50845h != null) {
                Drawable wrap = DrawableCompat.wrap(m43999y);
                DrawableCompat.setTintList(wrap, this.f50845h);
                return wrap;
            }
            return DrawableCompat.wrap(m43999y);
        }

        /* renamed from: e */
        public final void m43991e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f50847j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f50842e;
        }

        public int getAnimationMode() {
            return this.f50840c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f50841d;
        }

        public int getMaxInlineActionWidth() {
            return this.f50844g;
        }

        public int getMaxWidth() {
            return this.f50843f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f50838a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m44039F();
            }
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f50838a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m44038G();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar baseTransientBottomBar = this.f50838a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m44037H();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f50843f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f50843f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.f50840c = i;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f50845h != null) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.f50845h);
                DrawableCompat.setTintMode(drawable, this.f50846i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f50845h = colorStateList;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(wrap, colorStateList);
                DrawableCompat.setTintMode(wrap, this.f50846i);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f50846i = mode;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintMode(wrap, mode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f50848k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                m43991e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar baseTransientBottomBar = this.f50838a;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.m44024U();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f50837l;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }

        public SnackbarBaseLayout(@NonNull Context context, AttributeSet attributeSet) {
            super(MaterialThemeOverlay.wrap(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_elevation)) {
                ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_elevation, 0));
            }
            this.f50840c = obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            if (obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f50839b = ShapeAppearanceModel.builder(context2, attributeSet, 0, 0).build();
            }
            this.f50841d = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(ViewUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f50842e = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f50843f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f50844g = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f50837l);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.setBackground(this, m43992d());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    /* loaded from: classes4.dex */
    public class C7078a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f50849a;

        public C7078a(int i) {
            this.f50849a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m44036I(this.f50849a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    /* loaded from: classes4.dex */
    public class C7079b implements ValueAnimator.AnimatorUpdateListener {
        public C7079b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    /* loaded from: classes4.dex */
    public class C7080c implements ValueAnimator.AnimatorUpdateListener {
        public C7080c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.view.setScaleX(floatValue);
            BaseTransientBottomBar.this.view.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    /* loaded from: classes4.dex */
    public class C7081d extends AnimatorListenerAdapter {
        public C7081d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m44035J();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f50818i.animateContentIn(BaseTransientBottomBar.this.f50812c - BaseTransientBottomBar.this.f50810a, BaseTransientBottomBar.this.f50810a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    /* loaded from: classes4.dex */
    public class C7082e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f50854a;

        /* renamed from: b */
        public final /* synthetic */ int f50855b;

        public C7082e(int i) {
            this.f50855b = i;
            this.f50854a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f50806D) {
                ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.view, intValue - this.f50854a);
            } else {
                BaseTransientBottomBar.this.view.setTranslationY(intValue);
            }
            this.f50854a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    /* loaded from: classes4.dex */
    public class C7083f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f50857a;

        public C7083f(int i) {
            this.f50857a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m44036I(this.f50857a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f50818i.animateContentOut(0, BaseTransientBottomBar.this.f50811b);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    /* loaded from: classes4.dex */
    public class C7084g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f50859a = 0;

        public C7084g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f50806D) {
                ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.view, intValue - this.f50859a);
            } else {
                BaseTransientBottomBar.this.view.setTranslationY(intValue);
            }
            this.f50859a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    /* loaded from: classes4.dex */
    public class C7085h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).m44041D(message.arg1);
                return true;
            }
            ((BaseTransientBottomBar) message.obj).m44030O();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    /* loaded from: classes4.dex */
    public class RunnableC7086i implements Runnable {
        public RunnableC7086i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.view != null && baseTransientBottomBar.f50817h != null) {
                int height = (WindowUtils.getCurrentWindowBounds(BaseTransientBottomBar.this.f50817h).height() - BaseTransientBottomBar.this.m44042C()) + ((int) BaseTransientBottomBar.this.view.getTranslationY());
                if (height >= BaseTransientBottomBar.this.f50828s) {
                    BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                    baseTransientBottomBar2.f50829t = baseTransientBottomBar2.f50828s;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f50808F, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                baseTransientBottomBar3.f50829t = baseTransientBottomBar3.f50828s;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f50828s - height;
                BaseTransientBottomBar.this.view.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    /* loaded from: classes4.dex */
    public class C7087j implements OnApplyWindowInsetsListener {
        public C7087j() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f50824o = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar.this.f50825p = windowInsetsCompat.getSystemWindowInsetLeft();
            BaseTransientBottomBar.this.f50826q = windowInsetsCompat.getSystemWindowInsetRight();
            BaseTransientBottomBar.this.m44024U();
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    /* loaded from: classes4.dex */
    public class C7088k extends AccessibilityDelegateCompat {
        public C7088k() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.addAction(1048576);
            accessibilityNodeInfoCompat.setDismissable(true);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BaseTransientBottomBar.this.dismiss();
                return true;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    /* loaded from: classes4.dex */
    public class C7089l implements C7095a.InterfaceC7097b {
        public C7089l() {
        }

        @Override // com.google.android.material.snackbar.C7095a.InterfaceC7097b
        /* renamed from: a */
        public void mo43960a(int i) {
            Handler handler = BaseTransientBottomBar.f50805C;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C7095a.InterfaceC7097b
        public void show() {
            Handler handler = BaseTransientBottomBar.f50805C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    /* loaded from: classes4.dex */
    public class RunnableC7090m implements Runnable {
        public RunnableC7090m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.m44036I(3);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    /* loaded from: classes4.dex */
    public class C7091n implements SwipeDismissBehavior.OnDismissListener {
        public C7091n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
        public void onDismiss(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.dispatchDismiss(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
        public void onDragStateChanged(int i) {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    C7095a.m43973c().m43965k(BaseTransientBottomBar.this.f50834y);
                    return;
                }
                return;
            }
            C7095a.m43973c().m43964l(BaseTransientBottomBar.this.f50834y);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    /* loaded from: classes4.dex */
    public class RunnableC7092o implements Runnable {
        public RunnableC7092o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.view;
            if (snackbarBaseLayout == null) {
                return;
            }
            if (snackbarBaseLayout.getParent() != null) {
                BaseTransientBottomBar.this.view.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.view.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m44028Q();
            } else {
                BaseTransientBottomBar.this.m44026S();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    /* loaded from: classes4.dex */
    public class C7093p extends AnimatorListenerAdapter {
        public C7093p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m44035J();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    /* loaded from: classes4.dex */
    public static class View$OnAttachStateChangeListenerC7094q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final WeakReference f50869a;

        /* renamed from: b */
        public final WeakReference f50870b;

        public View$OnAttachStateChangeListenerC7094q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f50869a = new WeakReference(baseTransientBottomBar);
            this.f50870b = new WeakReference(view);
        }

        /* renamed from: a */
        public static View$OnAttachStateChangeListenerC7094q m43990a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            View$OnAttachStateChangeListenerC7094q view$OnAttachStateChangeListenerC7094q = new View$OnAttachStateChangeListenerC7094q(baseTransientBottomBar, view);
            if (ViewCompat.isAttachedToWindow(view)) {
                ViewUtils.addOnGlobalLayoutListener(view, view$OnAttachStateChangeListenerC7094q);
            }
            view.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC7094q);
            return view$OnAttachStateChangeListenerC7094q;
        }

        /* renamed from: b */
        public View m43989b() {
            return (View) this.f50870b.get();
        }

        /* renamed from: c */
        public void m43988c() {
            if (this.f50870b.get() != null) {
                ((View) this.f50870b.get()).removeOnAttachStateChangeListener(this);
                ViewUtils.removeOnGlobalLayoutListener((View) this.f50870b.get(), this);
            }
            this.f50870b.clear();
            this.f50869a.clear();
        }

        /* renamed from: d */
        public final boolean m43987d() {
            if (this.f50869a.get() == null) {
                m43988c();
                return true;
            }
            return false;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!m43987d() && ((BaseTransientBottomBar) this.f50869a.get()).f50822m) {
                ((BaseTransientBottomBar) this.f50869a.get()).m44034K();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (m43987d()) {
                return;
            }
            ViewUtils.addOnGlobalLayoutListener(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (m43987d()) {
                return;
            }
            ViewUtils.removeOnGlobalLayoutListener(view, this);
        }
    }

    public BaseTransientBottomBar(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        this(viewGroup.getContext(), viewGroup, view, contentViewCallback);
    }

    /* renamed from: x */
    public static GradientDrawable m44000x(int i, Resources resources) {
        float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: y */
    public static MaterialShapeDrawable m43999y(int i, ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(i));
        return materialShapeDrawable;
    }

    /* renamed from: A */
    public final ValueAnimator m44044A(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f50815f);
        ofFloat.addUpdateListener(new C7080c());
        return ofFloat;
    }

    /* renamed from: B */
    public final int m44043B() {
        int height = this.view.getHeight();
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* renamed from: C */
    public final int m44042C() {
        int[] iArr = new int[2];
        this.view.getLocationOnScreen(iArr);
        return iArr[1] + this.view.getHeight();
    }

    /* renamed from: D */
    public final void m44041D(int i) {
        if (m44032M() && this.view.getVisibility() == 0) {
            m44002v(i);
        } else {
            m44036I(i);
        }
    }

    /* renamed from: E */
    public final boolean m44040E() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if ((layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof SwipeDismissBehavior)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r2.view.getRootWindowInsets();
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m44039F() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1b
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.WindowInsets r0 = p000.AbstractC1619Wa.m65599a(r0)
            if (r0 == 0) goto L1b
            android.graphics.Insets r0 = p000.L42.m67555a(r0)
            int r0 = p000.AbstractC16888vK.m1059a(r0)
            r2.f50828s = r0
            r2.m44024U()
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.m44039F():void");
    }

    /* renamed from: G */
    public void m44038G() {
        if (isShownOrQueued()) {
            f50805C.post(new RunnableC7090m());
        }
    }

    /* renamed from: H */
    public void m44037H() {
        if (this.f50830u) {
            m44029P();
            this.f50830u = false;
        }
    }

    /* renamed from: I */
    public void m44036I(int i) {
        C7095a.m43973c().m43967i(this.f50834y);
        List list = this.f50831v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f50831v.get(size)).onDismissed(this, i);
            }
        }
        ViewParent parent = this.view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.view);
        }
    }

    /* renamed from: J */
    public void m44035J() {
        C7095a.m43973c().m43966j(this.f50834y);
        List list = this.f50831v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f50831v.get(size)).onShown(this);
            }
        }
    }

    /* renamed from: K */
    public final void m44034K() {
        this.f50827r = m44001w();
        m44024U();
    }

    /* renamed from: L */
    public final void m44033L(CoordinatorLayout.LayoutParams layoutParams) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f50832w;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = getNewBehavior();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m43996h(this);
        }
        swipeDismissBehavior.setListener(new C7091n());
        layoutParams.setBehavior(swipeDismissBehavior);
        if (getAnchorView() == null) {
            layoutParams.insetEdge = 80;
        }
    }

    /* renamed from: M */
    public boolean m44032M() {
        AccessibilityManager accessibilityManager = this.f50833x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean m44031N() {
        if (this.f50828s > 0 && !this.f50820k && m44040E()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final void m44030O() {
        if (this.view.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                m44033L((CoordinatorLayout.LayoutParams) layoutParams);
            }
            this.view.m43993c(this.f50816g);
            m44034K();
            this.view.setVisibility(4);
        }
        if (ViewCompat.isLaidOut(this.view)) {
            m44029P();
        } else {
            this.f50830u = true;
        }
    }

    /* renamed from: P */
    public final void m44029P() {
        if (m44032M()) {
            m44003u();
            return;
        }
        if (this.view.getParent() != null) {
            this.view.setVisibility(0);
        }
        m44035J();
    }

    /* renamed from: Q */
    public final void m44028Q() {
        ValueAnimator m43998z = m43998z(0.0f, 1.0f);
        ValueAnimator m44044A = m44044A(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m43998z, m44044A);
        animatorSet.setDuration(this.f50810a);
        animatorSet.addListener(new C7093p());
        animatorSet.start();
    }

    /* renamed from: R */
    public final void m44027R(int i) {
        ValueAnimator m43998z = m43998z(1.0f, 0.0f);
        m43998z.setDuration(this.f50811b);
        m43998z.addListener(new C7078a(i));
        m43998z.start();
    }

    /* renamed from: S */
    public final void m44026S() {
        int m44043B = m44043B();
        if (f50806D) {
            ViewCompat.offsetTopAndBottom(this.view, m44043B);
        } else {
            this.view.setTranslationY(m44043B);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(m44043B, 0);
        valueAnimator.setInterpolator(this.f50814e);
        valueAnimator.setDuration(this.f50812c);
        valueAnimator.addListener(new C7081d());
        valueAnimator.addUpdateListener(new C7082e(m44043B));
        valueAnimator.start();
    }

    /* renamed from: T */
    public final void m44025T(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m44043B());
        valueAnimator.setInterpolator(this.f50814e);
        valueAnimator.setDuration(this.f50812c);
        valueAnimator.addListener(new C7083f(i));
        valueAnimator.addUpdateListener(new C7084g());
        valueAnimator.start();
    }

    /* renamed from: U */
    public final void m44024U() {
        int i;
        boolean z;
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f50808F, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (this.view.f50847j == null) {
            Log.w(f50808F, "Unable to update margins because original view margins are not set");
        } else if (this.view.getParent() == null) {
        } else {
            if (getAnchorView() != null) {
                i = this.f50827r;
            } else {
                i = this.f50824o;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i2 = this.view.f50847j.bottom + i;
            int i3 = this.view.f50847j.left + this.f50825p;
            int i4 = this.view.f50847j.right + this.f50826q;
            int i5 = this.view.f50847j.top;
            if (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                marginLayoutParams.bottomMargin = i2;
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = i4;
                marginLayoutParams.topMargin = i5;
                this.view.requestLayout();
            }
            if ((z || this.f50829t != this.f50828s) && Build.VERSION.SDK_INT >= 29 && m44031N()) {
                this.view.removeCallbacks(this.f50823n);
                this.view.post(this.f50823n);
            }
        }
    }

    @NonNull
    public B addCallback(@Nullable BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        if (this.f50831v == null) {
            this.f50831v = new ArrayList();
        }
        this.f50831v.add(baseCallback);
        return this;
    }

    public void dismiss() {
        dispatchDismiss(3);
    }

    public void dispatchDismiss(int i) {
        C7095a.m43973c().m43974b(this.f50834y, i);
    }

    @Nullable
    public View getAnchorView() {
        View$OnAttachStateChangeListenerC7094q view$OnAttachStateChangeListenerC7094q = this.f50821l;
        if (view$OnAttachStateChangeListenerC7094q == null) {
            return null;
        }
        return view$OnAttachStateChangeListenerC7094q.m43989b();
    }

    public int getAnimationMode() {
        return this.view.getAnimationMode();
    }

    public Behavior getBehavior() {
        return this.f50832w;
    }

    @NonNull
    public Context getContext() {
        return this.f50817h;
    }

    public int getDuration() {
        return this.f50819j;
    }

    @NonNull
    public SwipeDismissBehavior<? extends View> getNewBehavior() {
        return new Behavior();
    }

    @LayoutRes
    public int getSnackbarBaseLayoutResId() {
        if (hasSnackbarStyleAttr()) {
            return R.layout.mtrl_layout_snackbar;
        }
        return R.layout.design_layout_snackbar;
    }

    @NonNull
    public View getView() {
        return this.view;
    }

    public boolean hasSnackbarStyleAttr() {
        TypedArray obtainStyledAttributes = this.f50817h.obtainStyledAttributes(f50807E);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
        return this.f50822m;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.f50820k;
    }

    public boolean isShown() {
        return C7095a.m43973c().m43971e(this.f50834y);
    }

    public boolean isShownOrQueued() {
        return C7095a.m43973c().m43970f(this.f50834y);
    }

    @NonNull
    public B removeCallback(@Nullable BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        List list = this.f50831v;
        if (list == null) {
            return this;
        }
        list.remove(baseCallback);
        return this;
    }

    @NonNull
    public B setAnchorView(@Nullable View view) {
        View$OnAttachStateChangeListenerC7094q view$OnAttachStateChangeListenerC7094q = this.f50821l;
        if (view$OnAttachStateChangeListenerC7094q != null) {
            view$OnAttachStateChangeListenerC7094q.m43988c();
        }
        this.f50821l = view == null ? null : View$OnAttachStateChangeListenerC7094q.m43990a(this, view);
        return this;
    }

    public void setAnchorViewLayoutListenerEnabled(boolean z) {
        this.f50822m = z;
    }

    @NonNull
    public B setAnimationMode(int i) {
        this.view.setAnimationMode(i);
        return this;
    }

    @NonNull
    public B setBehavior(Behavior behavior) {
        this.f50832w = behavior;
        return this;
    }

    @NonNull
    public B setDuration(int i) {
        this.f50819j = i;
        return this;
    }

    @NonNull
    public B setGestureInsetBottomIgnored(boolean z) {
        this.f50820k = z;
        return this;
    }

    public void show() {
        C7095a.m43973c().m43962n(getDuration(), this.f50834y);
    }

    /* renamed from: u */
    public void m44003u() {
        this.view.post(new RunnableC7092o());
    }

    /* renamed from: v */
    public final void m44002v(int i) {
        if (this.view.getAnimationMode() == 1) {
            m44027R(i);
        } else {
            m44025T(i);
        }
    }

    /* renamed from: w */
    public final int m44001w() {
        if (getAnchorView() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        getAnchorView().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f50816g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f50816g.getHeight()) - i;
    }

    /* renamed from: z */
    public final ValueAnimator m43998z(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f50813d);
        ofFloat.addUpdateListener(new C7079b());
        return ofFloat;
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        this.f50822m = false;
        this.f50823n = new RunnableC7086i();
        this.f50834y = new C7089l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (contentViewCallback != null) {
            this.f50816g = viewGroup;
            this.f50818i = contentViewCallback;
            this.f50817h = context;
            ThemeEnforcement.checkAppCompatTheme(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(getSnackbarBaseLayoutResId(), viewGroup, false);
            this.view = snackbarBaseLayout;
            snackbarBaseLayout.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.m43978a(snackbarBaseLayout.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
            }
            snackbarBaseLayout.addView(view);
            ViewCompat.setAccessibilityLiveRegion(snackbarBaseLayout, 1);
            ViewCompat.setImportantForAccessibility(snackbarBaseLayout, 1);
            ViewCompat.setFitsSystemWindows(snackbarBaseLayout, true);
            ViewCompat.setOnApplyWindowInsetsListener(snackbarBaseLayout, new C7087j());
            ViewCompat.setAccessibilityDelegate(snackbarBaseLayout, new C7088k());
            this.f50833x = (AccessibilityManager) context.getSystemService("accessibility");
            this.f50812c = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            this.f50810a = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 150);
            this.f50811b = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium1, 75);
            this.f50813d = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, f50803A);
            this.f50815f = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, f50804B);
            this.f50814e = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, f50809z);
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }

    @NonNull
    public B setAnchorView(@IdRes int i) {
        View findViewById = this.f50816g.findViewById(i);
        if (findViewById != null) {
            return setAnchorView(findViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i);
    }
}
