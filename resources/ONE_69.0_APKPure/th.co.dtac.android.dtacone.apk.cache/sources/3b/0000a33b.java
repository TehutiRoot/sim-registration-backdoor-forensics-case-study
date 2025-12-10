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
import com.google.android.material.snackbar.C7084a;
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
    public final int f50822a;

    /* renamed from: b */
    public final int f50823b;

    /* renamed from: c */
    public final int f50824c;

    /* renamed from: d */
    public final TimeInterpolator f50825d;

    /* renamed from: e */
    public final TimeInterpolator f50826e;

    /* renamed from: f */
    public final TimeInterpolator f50827f;

    /* renamed from: g */
    public final ViewGroup f50828g;

    /* renamed from: h */
    public final Context f50829h;

    /* renamed from: i */
    public final com.google.android.material.snackbar.ContentViewCallback f50830i;

    /* renamed from: j */
    public int f50831j;

    /* renamed from: k */
    public boolean f50832k;

    /* renamed from: l */
    public View$OnAttachStateChangeListenerC7083q f50833l;

    /* renamed from: m */
    public boolean f50834m;

    /* renamed from: n */
    public final Runnable f50835n;

    /* renamed from: o */
    public int f50836o;

    /* renamed from: p */
    public int f50837p;

    /* renamed from: q */
    public int f50838q;

    /* renamed from: r */
    public int f50839r;

    /* renamed from: s */
    public int f50840s;

    /* renamed from: t */
    public int f50841t;

    /* renamed from: u */
    public boolean f50842u;

    /* renamed from: v */
    public List f50843v;
    @NonNull
    protected final SnackbarBaseLayout view;

    /* renamed from: w */
    public Behavior f50844w;

    /* renamed from: x */
    public final AccessibilityManager f50845x;

    /* renamed from: y */
    public C7084a.InterfaceC7086b f50846y;

    /* renamed from: z */
    public static final TimeInterpolator f50821z = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;

    /* renamed from: A */
    public static final TimeInterpolator f50815A = AnimationUtils.LINEAR_INTERPOLATOR;

    /* renamed from: B */
    public static final TimeInterpolator f50816B = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;

    /* renamed from: D */
    public static final boolean f50818D = false;

    /* renamed from: E */
    public static final int[] f50819E = {R.attr.snackbarStyle};

    /* renamed from: F */
    public static final String f50820F = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: C */
    public static final Handler f50817C = new Handler(Looper.getMainLooper(), new C7074h());

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
        public final BehaviorDelegate f50847l = new BehaviorDelegate(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
            return this.f50847l.canSwipeDismissView(view);
        }

        /* renamed from: h */
        public final void m43983h(BaseTransientBottomBar baseTransientBottomBar) {
            this.f50847l.setBaseTransientBottomBar(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f50847l.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static class BehaviorDelegate {

        /* renamed from: a */
        public C7084a.InterfaceC7086b f50848a;

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
                    C7084a.m43960c().m43951l(this.f50848a);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C7084a.m43960c().m43952k(this.f50848a);
            }
        }

        public void setBaseTransientBottomBar(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f50848a = baseTransientBottomBar.f50846y;
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
        public static final View.OnTouchListener f50849l = new View$OnTouchListenerC7066a();

        /* renamed from: a */
        public BaseTransientBottomBar f50850a;

        /* renamed from: b */
        public ShapeAppearanceModel f50851b;

        /* renamed from: c */
        public int f50852c;

        /* renamed from: d */
        public final float f50853d;

        /* renamed from: e */
        public final float f50854e;

        /* renamed from: f */
        public final int f50855f;

        /* renamed from: g */
        public final int f50856g;

        /* renamed from: h */
        public ColorStateList f50857h;

        /* renamed from: i */
        public PorterDuff.Mode f50858i;

        /* renamed from: j */
        public Rect f50859j;

        /* renamed from: k */
        public boolean f50860k;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a */
        /* loaded from: classes4.dex */
        public class View$OnTouchListenerC7066a implements View.OnTouchListener {
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
            this.f50850a = baseTransientBottomBar;
        }

        /* renamed from: c */
        public void m43980c(ViewGroup viewGroup) {
            this.f50860k = true;
            viewGroup.addView(this);
            this.f50860k = false;
        }

        /* renamed from: d */
        public final Drawable m43979d() {
            int layer = MaterialColors.layer(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha());
            ShapeAppearanceModel shapeAppearanceModel = this.f50851b;
            Drawable m43986y = shapeAppearanceModel != null ? BaseTransientBottomBar.m43986y(layer, shapeAppearanceModel) : BaseTransientBottomBar.m43987x(layer, getResources());
            if (this.f50857h != null) {
                Drawable wrap = DrawableCompat.wrap(m43986y);
                DrawableCompat.setTintList(wrap, this.f50857h);
                return wrap;
            }
            return DrawableCompat.wrap(m43986y);
        }

        /* renamed from: e */
        public final void m43978e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f50859j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f50854e;
        }

        public int getAnimationMode() {
            return this.f50852c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f50853d;
        }

        public int getMaxInlineActionWidth() {
            return this.f50856g;
        }

        public int getMaxWidth() {
            return this.f50855f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f50850a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m44026F();
            }
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f50850a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m44025G();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar baseTransientBottomBar = this.f50850a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m44024H();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f50855f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f50855f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setAnimationMode(int i) {
            this.f50852c = i;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f50857h != null) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.f50857h);
                DrawableCompat.setTintMode(drawable, this.f50858i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f50857h = colorStateList;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(wrap, colorStateList);
                DrawableCompat.setTintMode(wrap, this.f50858i);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f50858i = mode;
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
            if (!this.f50860k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                m43978e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar baseTransientBottomBar = this.f50850a;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.m44011U();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f50849l;
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
            this.f50852c = obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            if (obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f50851b = ShapeAppearanceModel.builder(context2, attributeSet, 0, 0).build();
            }
            this.f50853d = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(ViewUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f50854e = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f50855f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f50856g = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f50849l);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.setBackground(this, m43979d());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    /* loaded from: classes4.dex */
    public class C7067a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f50861a;

        public C7067a(int i) {
            this.f50861a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m44023I(this.f50861a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    /* loaded from: classes4.dex */
    public class C7068b implements ValueAnimator.AnimatorUpdateListener {
        public C7068b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    /* loaded from: classes4.dex */
    public class C7069c implements ValueAnimator.AnimatorUpdateListener {
        public C7069c() {
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
    public class C7070d extends AnimatorListenerAdapter {
        public C7070d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m44022J();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f50830i.animateContentIn(BaseTransientBottomBar.this.f50824c - BaseTransientBottomBar.this.f50822a, BaseTransientBottomBar.this.f50822a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    /* loaded from: classes4.dex */
    public class C7071e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f50866a;

        /* renamed from: b */
        public final /* synthetic */ int f50867b;

        public C7071e(int i) {
            this.f50867b = i;
            this.f50866a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f50818D) {
                ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.view, intValue - this.f50866a);
            } else {
                BaseTransientBottomBar.this.view.setTranslationY(intValue);
            }
            this.f50866a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    /* loaded from: classes4.dex */
    public class C7072f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f50869a;

        public C7072f(int i) {
            this.f50869a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m44023I(this.f50869a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f50830i.animateContentOut(0, BaseTransientBottomBar.this.f50823b);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    /* loaded from: classes4.dex */
    public class C7073g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f50871a = 0;

        public C7073g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f50818D) {
                ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.view, intValue - this.f50871a);
            } else {
                BaseTransientBottomBar.this.view.setTranslationY(intValue);
            }
            this.f50871a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    /* loaded from: classes4.dex */
    public class C7074h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).m44028D(message.arg1);
                return true;
            }
            ((BaseTransientBottomBar) message.obj).m44017O();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    /* loaded from: classes4.dex */
    public class RunnableC7075i implements Runnable {
        public RunnableC7075i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.view != null && baseTransientBottomBar.f50829h != null) {
                int height = (WindowUtils.getCurrentWindowBounds(BaseTransientBottomBar.this.f50829h).height() - BaseTransientBottomBar.this.m44029C()) + ((int) BaseTransientBottomBar.this.view.getTranslationY());
                if (height >= BaseTransientBottomBar.this.f50840s) {
                    BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                    baseTransientBottomBar2.f50841t = baseTransientBottomBar2.f50840s;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f50820F, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                baseTransientBottomBar3.f50841t = baseTransientBottomBar3.f50840s;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f50840s - height;
                BaseTransientBottomBar.this.view.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    /* loaded from: classes4.dex */
    public class C7076j implements OnApplyWindowInsetsListener {
        public C7076j() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f50836o = windowInsetsCompat.getSystemWindowInsetBottom();
            BaseTransientBottomBar.this.f50837p = windowInsetsCompat.getSystemWindowInsetLeft();
            BaseTransientBottomBar.this.f50838q = windowInsetsCompat.getSystemWindowInsetRight();
            BaseTransientBottomBar.this.m44011U();
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    /* loaded from: classes4.dex */
    public class C7077k extends AccessibilityDelegateCompat {
        public C7077k() {
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
    public class C7078l implements C7084a.InterfaceC7086b {
        public C7078l() {
        }

        @Override // com.google.android.material.snackbar.C7084a.InterfaceC7086b
        /* renamed from: a */
        public void mo43947a(int i) {
            Handler handler = BaseTransientBottomBar.f50817C;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C7084a.InterfaceC7086b
        public void show() {
            Handler handler = BaseTransientBottomBar.f50817C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    /* loaded from: classes4.dex */
    public class RunnableC7079m implements Runnable {
        public RunnableC7079m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.m44023I(3);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    /* loaded from: classes4.dex */
    public class C7080n implements SwipeDismissBehavior.OnDismissListener {
        public C7080n() {
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
                    C7084a.m43960c().m43952k(BaseTransientBottomBar.this.f50846y);
                    return;
                }
                return;
            }
            C7084a.m43960c().m43951l(BaseTransientBottomBar.this.f50846y);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    /* loaded from: classes4.dex */
    public class RunnableC7081o implements Runnable {
        public RunnableC7081o() {
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
                BaseTransientBottomBar.this.m44015Q();
            } else {
                BaseTransientBottomBar.this.m44013S();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    /* loaded from: classes4.dex */
    public class C7082p extends AnimatorListenerAdapter {
        public C7082p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m44022J();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    /* loaded from: classes4.dex */
    public static class View$OnAttachStateChangeListenerC7083q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final WeakReference f50881a;

        /* renamed from: b */
        public final WeakReference f50882b;

        public View$OnAttachStateChangeListenerC7083q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f50881a = new WeakReference(baseTransientBottomBar);
            this.f50882b = new WeakReference(view);
        }

        /* renamed from: a */
        public static View$OnAttachStateChangeListenerC7083q m43977a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            View$OnAttachStateChangeListenerC7083q view$OnAttachStateChangeListenerC7083q = new View$OnAttachStateChangeListenerC7083q(baseTransientBottomBar, view);
            if (ViewCompat.isAttachedToWindow(view)) {
                ViewUtils.addOnGlobalLayoutListener(view, view$OnAttachStateChangeListenerC7083q);
            }
            view.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC7083q);
            return view$OnAttachStateChangeListenerC7083q;
        }

        /* renamed from: b */
        public View m43976b() {
            return (View) this.f50882b.get();
        }

        /* renamed from: c */
        public void m43975c() {
            if (this.f50882b.get() != null) {
                ((View) this.f50882b.get()).removeOnAttachStateChangeListener(this);
                ViewUtils.removeOnGlobalLayoutListener((View) this.f50882b.get(), this);
            }
            this.f50882b.clear();
            this.f50881a.clear();
        }

        /* renamed from: d */
        public final boolean m43974d() {
            if (this.f50881a.get() == null) {
                m43975c();
                return true;
            }
            return false;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!m43974d() && ((BaseTransientBottomBar) this.f50881a.get()).f50834m) {
                ((BaseTransientBottomBar) this.f50881a.get()).m44021K();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (m43974d()) {
                return;
            }
            ViewUtils.addOnGlobalLayoutListener(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (m43974d()) {
                return;
            }
            ViewUtils.removeOnGlobalLayoutListener(view, this);
        }
    }

    public BaseTransientBottomBar(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        this(viewGroup.getContext(), viewGroup, view, contentViewCallback);
    }

    /* renamed from: x */
    public static GradientDrawable m43987x(int i, Resources resources) {
        float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: y */
    public static MaterialShapeDrawable m43986y(int i, ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(i));
        return materialShapeDrawable;
    }

    /* renamed from: A */
    public final ValueAnimator m44031A(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f50827f);
        ofFloat.addUpdateListener(new C7069c());
        return ofFloat;
    }

    /* renamed from: B */
    public final int m44030B() {
        int height = this.view.getHeight();
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* renamed from: C */
    public final int m44029C() {
        int[] iArr = new int[2];
        this.view.getLocationOnScreen(iArr);
        return iArr[1] + this.view.getHeight();
    }

    /* renamed from: D */
    public final void m44028D(int i) {
        if (m44019M() && this.view.getVisibility() == 0) {
            m43989v(i);
        } else {
            m44023I(i);
        }
    }

    /* renamed from: E */
    public final boolean m44027E() {
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
    public void m44026F() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1b
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.WindowInsets r0 = p000.AbstractC1610Wa.m65743a(r0)
            if (r0 == 0) goto L1b
            android.graphics.Insets r0 = p000.I52.m68061a(r0)
            int r0 = p000.AbstractC16971wK.m759a(r0)
            r2.f50840s = r0
            r2.m44011U()
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.m44026F():void");
    }

    /* renamed from: G */
    public void m44025G() {
        if (isShownOrQueued()) {
            f50817C.post(new RunnableC7079m());
        }
    }

    /* renamed from: H */
    public void m44024H() {
        if (this.f50842u) {
            m44016P();
            this.f50842u = false;
        }
    }

    /* renamed from: I */
    public void m44023I(int i) {
        C7084a.m43960c().m43954i(this.f50846y);
        List list = this.f50843v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f50843v.get(size)).onDismissed(this, i);
            }
        }
        ViewParent parent = this.view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.view);
        }
    }

    /* renamed from: J */
    public void m44022J() {
        C7084a.m43960c().m43953j(this.f50846y);
        List list = this.f50843v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f50843v.get(size)).onShown(this);
            }
        }
    }

    /* renamed from: K */
    public final void m44021K() {
        this.f50839r = m43988w();
        m44011U();
    }

    /* renamed from: L */
    public final void m44020L(CoordinatorLayout.LayoutParams layoutParams) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f50844w;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = getNewBehavior();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m43983h(this);
        }
        swipeDismissBehavior.setListener(new C7080n());
        layoutParams.setBehavior(swipeDismissBehavior);
        if (getAnchorView() == null) {
            layoutParams.insetEdge = 80;
        }
    }

    /* renamed from: M */
    public boolean m44019M() {
        AccessibilityManager accessibilityManager = this.f50845x;
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
    public final boolean m44018N() {
        if (this.f50840s > 0 && !this.f50832k && m44027E()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final void m44017O() {
        if (this.view.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                m44020L((CoordinatorLayout.LayoutParams) layoutParams);
            }
            this.view.m43980c(this.f50828g);
            m44021K();
            this.view.setVisibility(4);
        }
        if (ViewCompat.isLaidOut(this.view)) {
            m44016P();
        } else {
            this.f50842u = true;
        }
    }

    /* renamed from: P */
    public final void m44016P() {
        if (m44019M()) {
            m43990u();
            return;
        }
        if (this.view.getParent() != null) {
            this.view.setVisibility(0);
        }
        m44022J();
    }

    /* renamed from: Q */
    public final void m44015Q() {
        ValueAnimator m43985z = m43985z(0.0f, 1.0f);
        ValueAnimator m44031A = m44031A(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m43985z, m44031A);
        animatorSet.setDuration(this.f50822a);
        animatorSet.addListener(new C7082p());
        animatorSet.start();
    }

    /* renamed from: R */
    public final void m44014R(int i) {
        ValueAnimator m43985z = m43985z(1.0f, 0.0f);
        m43985z.setDuration(this.f50823b);
        m43985z.addListener(new C7067a(i));
        m43985z.start();
    }

    /* renamed from: S */
    public final void m44013S() {
        int m44030B = m44030B();
        if (f50818D) {
            ViewCompat.offsetTopAndBottom(this.view, m44030B);
        } else {
            this.view.setTranslationY(m44030B);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(m44030B, 0);
        valueAnimator.setInterpolator(this.f50826e);
        valueAnimator.setDuration(this.f50824c);
        valueAnimator.addListener(new C7070d());
        valueAnimator.addUpdateListener(new C7071e(m44030B));
        valueAnimator.start();
    }

    /* renamed from: T */
    public final void m44012T(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m44030B());
        valueAnimator.setInterpolator(this.f50826e);
        valueAnimator.setDuration(this.f50824c);
        valueAnimator.addListener(new C7072f(i));
        valueAnimator.addUpdateListener(new C7073g());
        valueAnimator.start();
    }

    /* renamed from: U */
    public final void m44011U() {
        int i;
        boolean z;
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f50820F, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (this.view.f50859j == null) {
            Log.w(f50820F, "Unable to update margins because original view margins are not set");
        } else if (this.view.getParent() == null) {
        } else {
            if (getAnchorView() != null) {
                i = this.f50839r;
            } else {
                i = this.f50836o;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i2 = this.view.f50859j.bottom + i;
            int i3 = this.view.f50859j.left + this.f50837p;
            int i4 = this.view.f50859j.right + this.f50838q;
            int i5 = this.view.f50859j.top;
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
            if ((z || this.f50841t != this.f50840s) && Build.VERSION.SDK_INT >= 29 && m44018N()) {
                this.view.removeCallbacks(this.f50835n);
                this.view.post(this.f50835n);
            }
        }
    }

    @NonNull
    public B addCallback(@Nullable BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        if (this.f50843v == null) {
            this.f50843v = new ArrayList();
        }
        this.f50843v.add(baseCallback);
        return this;
    }

    public void dismiss() {
        dispatchDismiss(3);
    }

    public void dispatchDismiss(int i) {
        C7084a.m43960c().m43961b(this.f50846y, i);
    }

    @Nullable
    public View getAnchorView() {
        View$OnAttachStateChangeListenerC7083q view$OnAttachStateChangeListenerC7083q = this.f50833l;
        if (view$OnAttachStateChangeListenerC7083q == null) {
            return null;
        }
        return view$OnAttachStateChangeListenerC7083q.m43976b();
    }

    public int getAnimationMode() {
        return this.view.getAnimationMode();
    }

    public Behavior getBehavior() {
        return this.f50844w;
    }

    @NonNull
    public Context getContext() {
        return this.f50829h;
    }

    public int getDuration() {
        return this.f50831j;
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
        TypedArray obtainStyledAttributes = this.f50829h.obtainStyledAttributes(f50819E);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
        return this.f50834m;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.f50832k;
    }

    public boolean isShown() {
        return C7084a.m43960c().m43958e(this.f50846y);
    }

    public boolean isShownOrQueued() {
        return C7084a.m43960c().m43957f(this.f50846y);
    }

    @NonNull
    public B removeCallback(@Nullable BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        List list = this.f50843v;
        if (list == null) {
            return this;
        }
        list.remove(baseCallback);
        return this;
    }

    @NonNull
    public B setAnchorView(@Nullable View view) {
        View$OnAttachStateChangeListenerC7083q view$OnAttachStateChangeListenerC7083q = this.f50833l;
        if (view$OnAttachStateChangeListenerC7083q != null) {
            view$OnAttachStateChangeListenerC7083q.m43975c();
        }
        this.f50833l = view == null ? null : View$OnAttachStateChangeListenerC7083q.m43977a(this, view);
        return this;
    }

    public void setAnchorViewLayoutListenerEnabled(boolean z) {
        this.f50834m = z;
    }

    @NonNull
    public B setAnimationMode(int i) {
        this.view.setAnimationMode(i);
        return this;
    }

    @NonNull
    public B setBehavior(Behavior behavior) {
        this.f50844w = behavior;
        return this;
    }

    @NonNull
    public B setDuration(int i) {
        this.f50831j = i;
        return this;
    }

    @NonNull
    public B setGestureInsetBottomIgnored(boolean z) {
        this.f50832k = z;
        return this;
    }

    public void show() {
        C7084a.m43960c().m43949n(getDuration(), this.f50846y);
    }

    /* renamed from: u */
    public void m43990u() {
        this.view.post(new RunnableC7081o());
    }

    /* renamed from: v */
    public final void m43989v(int i) {
        if (this.view.getAnimationMode() == 1) {
            m44014R(i);
        } else {
            m44012T(i);
        }
    }

    /* renamed from: w */
    public final int m43988w() {
        if (getAnchorView() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        getAnchorView().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f50828g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f50828g.getHeight()) - i;
    }

    /* renamed from: z */
    public final ValueAnimator m43985z(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f50825d);
        ofFloat.addUpdateListener(new C7068b());
        return ofFloat;
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.ContentViewCallback contentViewCallback) {
        this.f50834m = false;
        this.f50835n = new RunnableC7075i();
        this.f50846y = new C7078l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (contentViewCallback != null) {
            this.f50828g = viewGroup;
            this.f50830i = contentViewCallback;
            this.f50829h = context;
            ThemeEnforcement.checkAppCompatTheme(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(getSnackbarBaseLayoutResId(), viewGroup, false);
            this.view = snackbarBaseLayout;
            snackbarBaseLayout.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.m43965a(snackbarBaseLayout.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
            }
            snackbarBaseLayout.addView(view);
            ViewCompat.setAccessibilityLiveRegion(snackbarBaseLayout, 1);
            ViewCompat.setImportantForAccessibility(snackbarBaseLayout, 1);
            ViewCompat.setFitsSystemWindows(snackbarBaseLayout, true);
            ViewCompat.setOnApplyWindowInsetsListener(snackbarBaseLayout, new C7076j());
            ViewCompat.setAccessibilityDelegate(snackbarBaseLayout, new C7077k());
            this.f50845x = (AccessibilityManager) context.getSystemService("accessibility");
            this.f50824c = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            this.f50822a = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 150);
            this.f50823b = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium1, 75);
            this.f50825d = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, f50815A);
            this.f50827f = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, f50816B);
            this.f50826e = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, f50821z);
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }

    @NonNull
    public B setAnchorView(@IdRes int i) {
        View findViewById = this.f50828g.findViewById(i);
        if (findViewById != null) {
            return setAnchorView(findViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i);
    }
}