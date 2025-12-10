package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.collection.SimpleArrayMap;
import androidx.core.R;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Marker;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes2.dex */
public class ViewCompat {
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    @Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;
    @Deprecated
    public static final int LAYER_TYPE_NONE = 0;
    @Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    @Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    @Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;
    @Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;
    @Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    @Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;
    @Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    @Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;

    /* renamed from: b */
    public static Method f34188b;

    /* renamed from: c */
    public static Method f34189c;

    /* renamed from: d */
    public static boolean f34190d;

    /* renamed from: f */
    public static Method f34192f;

    /* renamed from: g */
    public static Field f34193g;

    /* renamed from: i */
    public static ThreadLocal f34195i;

    /* renamed from: a */
    public static final AtomicInteger f34187a = new AtomicInteger(1);

    /* renamed from: e */
    public static WeakHashMap f34191e = null;

    /* renamed from: h */
    public static boolean f34194h = false;

    /* renamed from: j */
    public static final int[] f34196j = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: k */
    public static final OnReceiveContentViewBehavior f34197k = new OnReceiveContentViewBehavior() { // from class: m22
        @Override // androidx.core.view.OnReceiveContentViewBehavior
        public final ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
            ContentInfoCompat m56943p;
            m56943p = ViewCompat.m56943p(contentInfoCompat);
            return m56943p;
        }
    };

    /* renamed from: l */
    public static final ViewTreeObserver$OnGlobalLayoutListenerC4125e f34198l = new ViewTreeObserver$OnGlobalLayoutListenerC4125e();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface NestedScrollType {
    }

    /* loaded from: classes2.dex */
    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface ScrollIndicators {
    }

    /* renamed from: androidx.core.view.ViewCompat$a */
    /* loaded from: classes2.dex */
    public class C4121a extends AbstractC4126f {
        public C4121a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: i */
        public Boolean mo56915d(View view) {
            return Boolean.valueOf(C4138q.m56812d(view));
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: j */
        public void mo56914e(View view, Boolean bool) {
            C4138q.m56807i(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: k */
        public boolean mo56911h(Boolean bool, Boolean bool2) {
            return !m56918a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$b */
    /* loaded from: classes2.dex */
    public class C4122b extends AbstractC4126f {
        public C4122b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: i */
        public CharSequence mo56915d(View view) {
            return C4138q.m56814b(view);
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: j */
        public void mo56914e(View view, CharSequence charSequence) {
            C4138q.m56808h(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: k */
        public boolean mo56911h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$c */
    /* loaded from: classes2.dex */
    public class C4123c extends AbstractC4126f {
        public C4123c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: i */
        public CharSequence mo56915d(View view) {
            return C4140s.m56802a(view);
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: j */
        public void mo56914e(View view, CharSequence charSequence) {
            C4140s.m56800c(view, charSequence);
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: k */
        public boolean mo56911h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$d */
    /* loaded from: classes2.dex */
    public class C4124d extends AbstractC4126f {
        public C4124d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: i */
        public Boolean mo56915d(View view) {
            return Boolean.valueOf(C4138q.m56813c(view));
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: j */
        public void mo56914e(View view, Boolean bool) {
            C4138q.m56809g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AbstractC4126f
        /* renamed from: k */
        public boolean mo56911h(Boolean bool, Boolean bool2) {
            return !m56918a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$e */
    /* loaded from: classes2.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC4125e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final WeakHashMap f34199a = new WeakHashMap();

        /* renamed from: a */
        public void m56923a(View view) {
            boolean z;
            WeakHashMap weakHashMap = this.f34199a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(this);
            if (C4131k.m56875b(view)) {
                m56921c(view);
            }
        }

        /* renamed from: b */
        public final void m56922b(View view, boolean z) {
            boolean z2;
            int i;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (z2) {
                    i = 16;
                } else {
                    i = 32;
                }
                ViewCompat.m56942q(view, i);
                this.f34199a.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        public final void m56921c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: d */
        public void m56920d(View view) {
            this.f34199a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m56919e(view);
        }

        /* renamed from: e */
        public final void m56919e(View view) {
            C4128h.m56895o(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f34199a.entrySet()) {
                    m56922b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m56921c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4126f {

        /* renamed from: a */
        public final int f34200a;

        /* renamed from: b */
        public final Class f34201b;

        /* renamed from: c */
        public final int f34202c;

        /* renamed from: d */
        public final int f34203d;

        public AbstractC4126f(int i, Class cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: a */
        public boolean m56918a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean z2;
            if (bool != null && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final boolean m56917b() {
            return true;
        }

        /* renamed from: c */
        public final boolean m56916c() {
            if (Build.VERSION.SDK_INT >= this.f34202c) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public abstract Object mo56915d(View view);

        /* renamed from: e */
        public abstract void mo56914e(View view, Object obj);

        /* renamed from: f */
        public Object m56913f(View view) {
            if (m56916c()) {
                return mo56915d(view);
            }
            if (m56917b()) {
                Object tag = view.getTag(this.f34200a);
                if (this.f34201b.isInstance(tag)) {
                    return tag;
                }
                return null;
            }
            return null;
        }

        /* renamed from: g */
        public void m56912g(View view, Object obj) {
            if (m56916c()) {
                mo56914e(view, obj);
            } else if (m56917b() && mo56911h(m56913f(view), obj)) {
                ViewCompat.m56950i(view);
                view.setTag(this.f34200a, obj);
                ViewCompat.m56942q(view, this.f34203d);
            }
        }

        /* renamed from: h */
        public abstract boolean mo56911h(Object obj, Object obj2);

        public AbstractC4126f(int i, Class cls, int i2, int i3) {
            this.f34200a = i;
            this.f34201b = cls;
            this.f34203d = i2;
            this.f34202c = i3;
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$g */
    /* loaded from: classes2.dex */
    public static class C4127g {
        @DoNotInline
        /* renamed from: a */
        public static boolean m56910a(@NonNull View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$h */
    /* loaded from: classes2.dex */
    public static class C4128h {
        @DoNotInline
        /* renamed from: a */
        public static AccessibilityNodeProvider m56909a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m56908b(View view) {
            return view.getFitsSystemWindows();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m56907c(View view) {
            return view.getImportantForAccessibility();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m56906d(View view) {
            return view.getMinimumHeight();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m56905e(View view) {
            return view.getMinimumWidth();
        }

        @DoNotInline
        /* renamed from: f */
        public static ViewParent m56904f(View view) {
            return view.getParentForAccessibility();
        }

        @DoNotInline
        /* renamed from: g */
        public static int m56903g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @DoNotInline
        /* renamed from: h */
        public static boolean m56902h(View view) {
            return view.hasOverlappingRendering();
        }

        @DoNotInline
        /* renamed from: i */
        public static boolean m56901i(View view) {
            return view.hasTransientState();
        }

        @DoNotInline
        /* renamed from: j */
        public static boolean m56900j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m56899k(View view) {
            view.postInvalidateOnAnimation();
        }

        @DoNotInline
        /* renamed from: l */
        public static void m56898l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: m */
        public static void m56897m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @DoNotInline
        /* renamed from: n */
        public static void m56896n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @DoNotInline
        /* renamed from: o */
        public static void m56895o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @DoNotInline
        /* renamed from: p */
        public static void m56894p(View view) {
            view.requestFitSystemWindows();
        }

        @DoNotInline
        /* renamed from: q */
        public static void m56893q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @DoNotInline
        /* renamed from: r */
        public static void m56892r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        @DoNotInline
        /* renamed from: s */
        public static void m56891s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$i */
    /* loaded from: classes2.dex */
    public static class C4129i {
        @DoNotInline
        /* renamed from: a */
        public static int m56890a() {
            return View.generateViewId();
        }

        @DoNotInline
        /* renamed from: b */
        public static Display m56889b(@NonNull View view) {
            return view.getDisplay();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m56888c(View view) {
            return view.getLabelFor();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m56887d(View view) {
            return view.getLayoutDirection();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m56886e(View view) {
            return view.getPaddingEnd();
        }

        @DoNotInline
        /* renamed from: f */
        public static int m56885f(View view) {
            return view.getPaddingStart();
        }

        @DoNotInline
        /* renamed from: g */
        public static boolean m56884g(View view) {
            return view.isPaddingRelative();
        }

        @DoNotInline
        /* renamed from: h */
        public static void m56883h(View view, int i) {
            view.setLabelFor(i);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m56882i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @DoNotInline
        /* renamed from: j */
        public static void m56881j(View view, int i) {
            view.setLayoutDirection(i);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m56880k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$j */
    /* loaded from: classes2.dex */
    public static class C4130j {
        @DoNotInline
        /* renamed from: a */
        public static Rect m56879a(@NonNull View view) {
            return view.getClipBounds();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m56878b(@NonNull View view) {
            return view.isInLayout();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56877c(@NonNull View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$k */
    /* loaded from: classes2.dex */
    public static class C4131k {
        @DoNotInline
        /* renamed from: a */
        public static int m56876a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m56875b(@NonNull View view) {
            return view.isAttachedToWindow();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m56874c(@NonNull View view) {
            return view.isLaidOut();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m56873d(@NonNull View view) {
            return view.isLayoutDirectionResolved();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m56872e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m56871f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m56870g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$l */
    /* loaded from: classes2.dex */
    public static class C4132l {
        @DoNotInline
        /* renamed from: a */
        public static WindowInsets m56869a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* renamed from: b */
        public static WindowInsets m56868b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56867c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$m */
    /* loaded from: classes2.dex */
    public static class C4133m {

        /* renamed from: androidx.core.view.ViewCompat$m$a */
        /* loaded from: classes2.dex */
        public class View$OnApplyWindowInsetsListenerC4134a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public WindowInsetsCompat f34204a = null;

            /* renamed from: b */
            public final /* synthetic */ View f34205b;

            /* renamed from: c */
            public final /* synthetic */ OnApplyWindowInsetsListener f34206c;

            public View$OnApplyWindowInsetsListenerC4134a(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
                this.f34205b = view;
                this.f34206c = onApplyWindowInsetsListener;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C4133m.m56866a(windowInsets, this.f34205b);
                    if (windowInsetsCompat.equals(this.f34204a)) {
                        return this.f34206c.onApplyWindowInsets(view, windowInsetsCompat).toWindowInsets();
                    }
                }
                this.f34204a = windowInsetsCompat;
                WindowInsetsCompat onApplyWindowInsets = this.f34206c.onApplyWindowInsets(view, windowInsetsCompat);
                if (i >= 30) {
                    return onApplyWindowInsets.toWindowInsets();
                }
                ViewCompat.requestApplyInsets(view);
                return onApplyWindowInsets.toWindowInsets();
            }
        }

        @DoNotInline
        /* renamed from: a */
        public static void m56866a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        /* renamed from: b */
        public static WindowInsetsCompat m56865b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m56864c(@NonNull View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m56863d(@NonNull View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m56862e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m56861f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        @DoNotInline
        /* renamed from: g */
        public static ColorStateList m56860g(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        /* renamed from: h */
        public static PorterDuff.Mode m56859h(View view) {
            return view.getBackgroundTintMode();
        }

        @DoNotInline
        /* renamed from: i */
        public static float m56858i(View view) {
            return view.getElevation();
        }

        @Nullable
        @DoNotInline
        /* renamed from: j */
        public static WindowInsetsCompat m56857j(@NonNull View view) {
            return WindowInsetsCompat.C4168a.m56703a(view);
        }

        @DoNotInline
        /* renamed from: k */
        public static String m56856k(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        /* renamed from: l */
        public static float m56855l(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        /* renamed from: m */
        public static float m56854m(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        /* renamed from: n */
        public static boolean m56853n(View view) {
            return view.hasNestedScrollingParent();
        }

        @DoNotInline
        /* renamed from: o */
        public static boolean m56852o(View view) {
            return view.isImportantForAccessibility();
        }

        @DoNotInline
        /* renamed from: p */
        public static boolean m56851p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        /* renamed from: q */
        public static void m56850q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: r */
        public static void m56849r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        /* renamed from: s */
        public static void m56848s(View view, float f) {
            view.setElevation(f);
        }

        @DoNotInline
        /* renamed from: t */
        public static void m56847t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @DoNotInline
        /* renamed from: u */
        public static void m56846u(@NonNull View view, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC4134a(view, onApplyWindowInsetsListener));
            }
        }

        @DoNotInline
        /* renamed from: v */
        public static void m56845v(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        /* renamed from: w */
        public static void m56844w(View view, float f) {
            view.setTranslationZ(f);
        }

        @DoNotInline
        /* renamed from: x */
        public static void m56843x(@NonNull View view, float f) {
            view.setZ(f);
        }

        @DoNotInline
        /* renamed from: y */
        public static boolean m56842y(View view, int i) {
            return view.startNestedScroll(i);
        }

        @DoNotInline
        /* renamed from: z */
        public static void m56841z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$n */
    /* loaded from: classes2.dex */
    public static class C4135n {
        @Nullable
        /* renamed from: a */
        public static WindowInsetsCompat m56840a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.m56707e(windowInsetsCompat);
            windowInsetsCompat.m56711a(view.getRootView());
            return windowInsetsCompat;
        }

        @DoNotInline
        /* renamed from: b */
        public static int m56839b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56838c(@NonNull View view, int i) {
            view.setScrollIndicators(i);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m56837d(@NonNull View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$o */
    /* loaded from: classes2.dex */
    public static class C4136o {
        @DoNotInline
        /* renamed from: a */
        public static void m56836a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m56835b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56834c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m56833d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m56832e(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m56831f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$p */
    /* loaded from: classes2.dex */
    public static class C4137p {
        @DoNotInline
        /* renamed from: a */
        public static void m56830a(@NonNull View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m56829b(View view) {
            return view.getImportantForAutofill();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m56828c(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m56827d(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m56826e(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m56825f(View view) {
            return view.isImportantForAutofill();
        }

        @DoNotInline
        /* renamed from: g */
        public static boolean m56824g(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        @DoNotInline
        /* renamed from: h */
        public static View m56823h(@NonNull View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        @DoNotInline
        /* renamed from: i */
        public static boolean m56822i(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        @DoNotInline
        /* renamed from: j */
        public static void m56821j(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m56820k(@NonNull View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @DoNotInline
        /* renamed from: l */
        public static void m56819l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        @DoNotInline
        /* renamed from: m */
        public static void m56818m(@NonNull View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @DoNotInline
        /* renamed from: n */
        public static void m56817n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        @DoNotInline
        /* renamed from: o */
        public static void m56816o(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$q */
    /* loaded from: classes2.dex */
    public static class C4138q {
        @DoNotInline
        /* renamed from: a */
        public static void m56815a(@NonNull View view, @NonNull final OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(R.id.tag_unhandled_key_listeners, simpleArrayMap);
            }
            Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: n22
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return onUnhandledKeyEventListenerCompat.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        /* renamed from: b */
        public static CharSequence m56814b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m56813c(View view) {
            return view.isAccessibilityHeading();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m56812d(View view) {
            return view.isScreenReaderFocusable();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m56811e(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        @DoNotInline
        /* renamed from: f */
        public static <T> T m56810f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m56809g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m56808h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m56807i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$r */
    /* loaded from: classes2.dex */
    public static class C4139r {
        @DoNotInline
        /* renamed from: a */
        public static View.AccessibilityDelegate m56806a(View view) {
            return view.getAccessibilityDelegate();
        }

        @DoNotInline
        /* renamed from: b */
        public static List<Rect> m56805b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56804c(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m56803d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$s */
    /* loaded from: classes2.dex */
    public static class C4140s {
        @DoNotInline
        /* renamed from: a */
        public static CharSequence m56802a(View view) {
            return view.getStateDescription();
        }

        @Nullable
        /* renamed from: b */
        public static WindowInsetsControllerCompat m56801b(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return WindowInsetsControllerCompat.toWindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56800c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$t */
    /* loaded from: classes2.dex */
    public static final class C4141t {
        @Nullable
        @DoNotInline
        /* renamed from: a */
        public static String[] m56799a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @Nullable
        @DoNotInline
        /* renamed from: b */
        public static ContentInfoCompat m56798b(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfo = contentInfoCompat.toContentInfo();
            ContentInfo performReceiveContent = view.performReceiveContent(contentInfo);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == contentInfo) {
                return contentInfoCompat;
            }
            return ContentInfoCompat.toContentInfoCompat(performReceiveContent);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56797c(@NonNull View view, @Nullable String[] strArr, @Nullable OnReceiveContentListener onReceiveContentListener) {
            if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC4142u(onReceiveContentListener));
            }
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$u */
    /* loaded from: classes2.dex */
    public static final class OnReceiveContentListenerC4142u implements android.view.OnReceiveContentListener {

        /* renamed from: a */
        public final OnReceiveContentListener f34207a;

        public OnReceiveContentListenerC4142u(OnReceiveContentListener onReceiveContentListener) {
            this.f34207a = onReceiveContentListener;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = ContentInfoCompat.toContentInfoCompat(contentInfo);
            ContentInfoCompat onReceiveContent = this.f34207a.onReceiveContent(view, contentInfoCompat);
            if (onReceiveContent == null) {
                return null;
            }
            if (onReceiveContent == contentInfoCompat) {
                return contentInfo;
            }
            return onReceiveContent.toContentInfo();
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$v */
    /* loaded from: classes2.dex */
    public static class C4143v {

        /* renamed from: d */
        public static final ArrayList f34208d = new ArrayList();

        /* renamed from: a */
        public WeakHashMap f34209a = null;

        /* renamed from: b */
        public SparseArray f34210b = null;

        /* renamed from: c */
        public WeakReference f34211c = null;

        /* renamed from: a */
        public static C4143v m56796a(View view) {
            C4143v c4143v = (C4143v) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (c4143v == null) {
                C4143v c4143v2 = new C4143v();
                view.setTag(R.id.tag_unhandled_key_event_manager, c4143v2);
                return c4143v2;
            }
            return c4143v;
        }

        /* renamed from: h */
        public static void m56789h(View view) {
            ArrayList arrayList = f34208d;
            synchronized (arrayList) {
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == view) {
                            return;
                        }
                    }
                    f34208d.add(new WeakReference(view));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: i */
        public static void m56788i(View view) {
            synchronized (f34208d) {
                int i = 0;
                while (true) {
                    try {
                        ArrayList arrayList = f34208d;
                        if (i < arrayList.size()) {
                            if (((WeakReference) arrayList.get(i)).get() == view) {
                                arrayList.remove(i);
                                return;
                            }
                            i++;
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean m56795b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m56790g();
            }
            View m56794c = m56794c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m56794c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m56793d().put(keyCode, new WeakReference(m56794c));
                }
            }
            if (m56794c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final View m56794c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f34209a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m56794c = m56794c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m56794c != null) {
                            return m56794c;
                        }
                    }
                }
                if (m56792e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray m56793d() {
            if (this.f34210b == null) {
                this.f34210b = new SparseArray();
            }
            return this.f34210b;
        }

        /* renamed from: e */
        public final boolean m56792e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* renamed from: f */
        public boolean m56791f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f34211c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f34211c = new WeakReference(keyEvent);
            SparseArray m56793d = m56793d();
            if (keyEvent.getAction() == 1 && (indexOfKey = m56793d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = (WeakReference) m56793d.valueAt(indexOfKey);
                m56793d.removeAt(indexOfKey);
            } else {
                weakReference = null;
            }
            if (weakReference == null) {
                weakReference = (WeakReference) m56793d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && ViewCompat.isAttachedToWindow(view)) {
                m56792e(view, keyEvent);
            }
            return true;
        }

        /* renamed from: g */
        public final void m56790g() {
            WeakHashMap weakHashMap = this.f34209a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f34208d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f34209a == null) {
                        this.f34209a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f34208d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f34209a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f34209a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static int addAccessibilityAction(@NonNull View view, @NonNull CharSequence charSequence, @NonNull AccessibilityViewCommand accessibilityViewCommand) {
        int m56946m = m56946m(view, charSequence);
        if (m56946m != -1) {
            m56956c(view, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(m56946m, charSequence, accessibilityViewCommand));
        }
        return m56946m;
    }

    public static void addKeyboardNavigationClusters(@NonNull View view, @NonNull Collection<View> collection, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4137p.m56830a(view, collection, i);
        }
    }

    public static void addOnUnhandledKeyEventListener(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            C4138q.m56815a(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(onUnhandledKeyEventListenerCompat);
        if (arrayList.size() == 1) {
            C4143v.m56789h(view);
        }
    }

    @NonNull
    public static ViewPropertyAnimatorCompat animate(@NonNull View view) {
        if (f34191e == null) {
            f34191e = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) f34191e.get(view);
        if (viewPropertyAnimatorCompat == null) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
            f34191e.put(view, viewPropertyAnimatorCompat2);
            return viewPropertyAnimatorCompat2;
        }
        return viewPropertyAnimatorCompat;
    }

    /* renamed from: b */
    public static AbstractC4126f m56957b() {
        return new C4124d(R.id.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: c */
    public static void m56956c(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        m56950i(view);
        m56940s(accessibilityActionCompat.getId(), view);
        m56947l(view).add(accessibilityActionCompat);
        m56942q(view, 0);
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    public static boolean canScrollVertically(View view, int i) {
        return view.canScrollVertically(i);
    }

    public static void cancelDragAndDrop(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            C4136o.m56836a(view);
        }
    }

    @Deprecated
    public static int combineMeasuredStates(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    @NonNull
    public static WindowInsetsCompat computeSystemWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
        return C4133m.m56865b(view, windowInsetsCompat, rect);
    }

    /* renamed from: d */
    public static void m56955d() {
        try {
            f34188b = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            f34189c = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        } catch (NoSuchMethodException unused) {
        }
        f34190d = true;
    }

    @NonNull
    public static WindowInsetsCompat dispatchApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets m56869a = C4132l.m56869a(view, windowInsets);
            if (!m56869a.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(m56869a, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void dispatchFinishTemporaryDetach(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            C4136o.m56835b(view);
            return;
        }
        if (!f34190d) {
            m56955d();
        }
        Method method = f34189c;
        if (method != null) {
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        view.onFinishTemporaryDetach();
    }

    public static boolean dispatchNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return C4133m.m56864c(view, f, f2, z);
    }

    public static boolean dispatchNestedPreFling(@NonNull View view, float f, float f2) {
        return C4133m.m56863d(view, f, f2);
    }

    public static boolean dispatchNestedPreScroll(@NonNull View view, int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return C4133m.m56862e(view, i, i2, iArr, iArr2);
    }

    public static boolean dispatchNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return C4133m.m56861f(view, i, i2, i3, i4, iArr);
    }

    public static void dispatchStartTemporaryDetach(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            C4136o.m56834c(view);
            return;
        }
        if (!f34190d) {
            m56955d();
        }
        Method method = f34188b;
        if (method != null) {
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        view.onStartTemporaryDetach();
    }

    /* renamed from: e */
    public static void m56954e(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m56936w(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m56936w((View) parent);
            }
        }
    }

    public static void enableAccessibleClickableSpanSupport(@NonNull View view) {
        m56950i(view);
    }

    /* renamed from: f */
    public static void m56953f(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m56936w(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m56936w((View) parent);
            }
        }
    }

    /* renamed from: g */
    public static boolean m56952g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C4143v.m56796a(view).m56795b(view, keyEvent);
    }

    public static int generateViewId() {
        return C4129i.m56890a();
    }

    @Nullable
    public static AccessibilityDelegateCompat getAccessibilityDelegate(@NonNull View view) {
        View.AccessibilityDelegate m56949j = m56949j(view);
        if (m56949j == null) {
            return null;
        }
        if (m56949j instanceof AccessibilityDelegateCompat.C4094a) {
            return ((AccessibilityDelegateCompat.C4094a) m56949j).f34130a;
        }
        return new AccessibilityDelegateCompat(m56949j);
    }

    public static int getAccessibilityLiveRegion(@NonNull View view) {
        return C4131k.m56876a(view);
    }

    @Nullable
    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View view) {
        AccessibilityNodeProvider m56909a = C4128h.m56909a(view);
        if (m56909a != null) {
            return new AccessibilityNodeProviderCompat(m56909a);
        }
        return null;
    }

    @Nullable
    @UiThread
    public static CharSequence getAccessibilityPaneTitle(@NonNull View view) {
        return (CharSequence) m56941r().m56913f(view);
    }

    @Deprecated
    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    @Nullable
    public static ColorStateList getBackgroundTintList(@NonNull View view) {
        return C4133m.m56860g(view);
    }

    @Nullable
    public static PorterDuff.Mode getBackgroundTintMode(@NonNull View view) {
        return C4133m.m56859h(view);
    }

    @Nullable
    public static Rect getClipBounds(@NonNull View view) {
        return C4130j.m56879a(view);
    }

    @Nullable
    public static Display getDisplay(@NonNull View view) {
        return C4129i.m56889b(view);
    }

    public static float getElevation(@NonNull View view) {
        return C4133m.m56858i(view);
    }

    public static boolean getFitsSystemWindows(@NonNull View view) {
        return C4128h.m56908b(view);
    }

    public static int getImportantForAccessibility(@NonNull View view) {
        return C4128h.m56907c(view);
    }

    @SuppressLint({"InlinedApi"})
    public static int getImportantForAutofill(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4137p.m56829b(view);
        }
        return 0;
    }

    public static int getLabelFor(@NonNull View view) {
        return C4129i.m56888c(view);
    }

    @Deprecated
    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    public static int getLayoutDirection(@NonNull View view) {
        return C4129i.m56887d(view);
    }

    @Nullable
    @Deprecated
    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static int getMinimumHeight(@NonNull View view) {
        return C4128h.m56906d(view);
    }

    public static int getMinimumWidth(@NonNull View view) {
        return C4128h.m56905e(view);
    }

    public static int getNextClusterForwardId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4137p.m56828c(view);
        }
        return -1;
    }

    @Nullable
    public static String[] getOnReceiveContentMimeTypes(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4141t.m56799a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    @InterfaceC2055Px
    public static int getPaddingEnd(@NonNull View view) {
        return C4129i.m56886e(view);
    }

    @InterfaceC2055Px
    public static int getPaddingStart(@NonNull View view) {
        return C4129i.m56885f(view);
    }

    @Nullable
    public static ViewParent getParentForAccessibility(@NonNull View view) {
        return C4128h.m56904f(view);
    }

    @Deprecated
    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    @Deprecated
    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    @Nullable
    public static WindowInsetsCompat getRootWindowInsets(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4135n.m56840a(view);
        }
        return C4133m.m56857j(view);
    }

    @Deprecated
    public static float getRotation(View view) {
        return view.getRotation();
    }

    @Deprecated
    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    @Deprecated
    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    @Deprecated
    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    @Deprecated
    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    public static int getScrollIndicators(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C4135n.m56839b(view);
        }
        return 0;
    }

    @Nullable
    @UiThread
    public static CharSequence getStateDescription(@NonNull View view) {
        return (CharSequence) m56937v().m56913f(view);
    }

    @NonNull
    public static List<Rect> getSystemGestureExclusionRects(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C4139r.m56805b(view);
        }
        return Collections.emptyList();
    }

    @Nullable
    public static String getTransitionName(@NonNull View view) {
        return C4133m.m56856k(view);
    }

    @Deprecated
    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    public static float getTranslationZ(@NonNull View view) {
        return C4133m.m56855l(view);
    }

    @Nullable
    @Deprecated
    public static WindowInsetsControllerCompat getWindowInsetsController(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C4140s.m56801b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return WindowCompat.getInsetsController(window, view);
            }
        }
        return null;
    }

    @Deprecated
    public static int getWindowSystemUiVisibility(@NonNull View view) {
        return C4128h.m56903g(view);
    }

    @Deprecated
    public static float getX(View view) {
        return view.getX();
    }

    @Deprecated
    public static float getY(View view) {
        return view.getY();
    }

    public static float getZ(@NonNull View view) {
        return C4133m.m56854m(view);
    }

    /* renamed from: h */
    public static boolean m56951h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C4143v.m56796a(view).m56791f(keyEvent);
    }

    public static boolean hasAccessibilityDelegate(@NonNull View view) {
        if (m56949j(view) != null) {
            return true;
        }
        return false;
    }

    public static boolean hasExplicitFocusable(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4137p.m56827d(view);
        }
        return view.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(@NonNull View view) {
        return C4133m.m56853n(view);
    }

    public static boolean hasOnClickListeners(@NonNull View view) {
        return C4127g.m56910a(view);
    }

    public static boolean hasOverlappingRendering(@NonNull View view) {
        return C4128h.m56902h(view);
    }

    public static boolean hasTransientState(@NonNull View view) {
        return C4128h.m56901i(view);
    }

    /* renamed from: i */
    public static void m56950i(View view) {
        AccessibilityDelegateCompat accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    @UiThread
    public static boolean isAccessibilityHeading(@NonNull View view) {
        Boolean bool = (Boolean) m56957b().m56913f(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean isAttachedToWindow(@NonNull View view) {
        return C4131k.m56875b(view);
    }

    public static boolean isFocusedByDefault(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4137p.m56826e(view);
        }
        return false;
    }

    public static boolean isImportantForAccessibility(@NonNull View view) {
        return C4133m.m56852o(view);
    }

    public static boolean isImportantForAutofill(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4137p.m56825f(view);
        }
        return true;
    }

    public static boolean isInLayout(@NonNull View view) {
        return C4130j.m56878b(view);
    }

    public static boolean isKeyboardNavigationCluster(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4137p.m56824g(view);
        }
        return false;
    }

    public static boolean isLaidOut(@NonNull View view) {
        return C4131k.m56874c(view);
    }

    public static boolean isLayoutDirectionResolved(@NonNull View view) {
        return C4131k.m56873d(view);
    }

    public static boolean isNestedScrollingEnabled(@NonNull View view) {
        return C4133m.m56851p(view);
    }

    @Deprecated
    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    public static boolean isPaddingRelative(@NonNull View view) {
        return C4129i.m56884g(view);
    }

    @UiThread
    public static boolean isScreenReaderFocusable(@NonNull View view) {
        Boolean bool = (Boolean) m56939t().m56913f(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static View.AccessibilityDelegate m56949j(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C4139r.m56806a(view);
        }
        return m56948k(view);
    }

    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    /* renamed from: k */
    public static View.AccessibilityDelegate m56948k(View view) {
        if (f34194h) {
            return null;
        }
        if (f34193g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f34193g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f34194h = true;
                return null;
            }
        }
        try {
            Object obj = f34193g.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f34194h = true;
            return null;
        }
    }

    @Nullable
    public static View keyboardNavigationClusterSearch(@NonNull View view, @Nullable View view2, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4137p.m56823h(view, view2, i);
        }
        return null;
    }

    /* renamed from: l */
    public static List m56947l(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: m */
    public static int m56946m(View view, CharSequence charSequence) {
        boolean z;
        List m56947l = m56947l(view);
        for (int i = 0; i < m56947l.size(); i++) {
            if (TextUtils.equals(charSequence, ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) m56947l.get(i)).getLabel())) {
                return ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) m56947l.get(i)).getId();
            }
        }
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = f34196j;
            if (i2 >= iArr.length || i3 != -1) {
                break;
            }
            int i4 = iArr[i2];
            boolean z2 = true;
            for (int i5 = 0; i5 < m56947l.size(); i5++) {
                if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) m56947l.get(i5)).getId() != i4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
            }
            if (z2) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: n */
    public static Rect m56945n() {
        if (f34195i == null) {
            f34195i = new ThreadLocal();
        }
        Rect rect = (Rect) f34195i.get();
        if (rect == null) {
            rect = new Rect();
            f34195i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: o */
    public static OnReceiveContentViewBehavior m56944o(View view) {
        if (view instanceof OnReceiveContentViewBehavior) {
            return (OnReceiveContentViewBehavior) view;
        }
        return f34197k;
    }

    public static void offsetLeftAndRight(@NonNull View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect m56945n = m56945n();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m56945n.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m56945n.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        m56954e(view, i);
        if (z && m56945n.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m56945n);
        }
    }

    public static void offsetTopAndBottom(@NonNull View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect m56945n = m56945n();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m56945n.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m56945n.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        m56953f(view, i);
        if (z && m56945n.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m56945n);
        }
    }

    @NonNull
    public static WindowInsetsCompat onApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets m56868b = C4132l.m56868b(view, windowInsets);
            if (!m56868b.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(m56868b, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.unwrap());
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: p */
    public static /* synthetic */ ContentInfoCompat m56943p(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    public static boolean performAccessibilityAction(@NonNull View view, int i, @Nullable Bundle bundle) {
        return C4128h.m56900j(view, i, bundle);
    }

    @Nullable
    public static ContentInfoCompat performReceiveContent(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(contentInfoCompat);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C4141t.m56798b(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        if (onReceiveContentListener != null) {
            ContentInfoCompat onReceiveContent = onReceiveContentListener.onReceiveContent(view, contentInfoCompat);
            if (onReceiveContent == null) {
                return null;
            }
            return m56944o(view).onReceiveContent(onReceiveContent);
        }
        return m56944o(view).onReceiveContent(contentInfoCompat);
    }

    public static void postInvalidateOnAnimation(@NonNull View view) {
        C4128h.m56899k(view);
    }

    public static void postOnAnimation(@NonNull View view, @NonNull Runnable runnable) {
        C4128h.m56897m(view, runnable);
    }

    @SuppressLint({"LambdaLast"})
    public static void postOnAnimationDelayed(@NonNull View view, @NonNull Runnable runnable, long j) {
        C4128h.m56896n(view, runnable, j);
    }

    /* renamed from: q */
    public static void m56942q(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (getAccessibilityLiveRegion(view) == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                C4131k.m56870g(obtain, i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(getAccessibilityPaneTitle(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    C4131k.m56872e(view.getParent(), view, view, i);
                    return;
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = 2048;
        }
        obtain2.setEventType(i2);
        C4131k.m56870g(obtain2, i);
        if (z) {
            obtain2.getText().add(getAccessibilityPaneTitle(view));
            m56938u(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    /* renamed from: r */
    public static AbstractC4126f m56941r() {
        return new C4122b(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static void removeAccessibilityAction(@NonNull View view, int i) {
        m56940s(i, view);
        m56942q(view, 0);
    }

    public static void removeOnUnhandledKeyEventListener(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        if (Build.VERSION.SDK_INT >= 28) {
            C4138q.m56811e(view, onUnhandledKeyEventListenerCompat);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(onUnhandledKeyEventListenerCompat);
            if (arrayList.size() == 0) {
                C4143v.m56788i(view);
            }
        }
    }

    public static void replaceAccessibilityAction(@NonNull View view, @NonNull AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, @Nullable CharSequence charSequence, @Nullable AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && charSequence == null) {
            removeAccessibilityAction(view, accessibilityActionCompat.getId());
        } else {
            m56956c(view, accessibilityActionCompat.createReplacementAction(charSequence, accessibilityViewCommand));
        }
    }

    public static void requestApplyInsets(@NonNull View view) {
        C4132l.m56867c(view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull View view, @IdRes int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C4138q.m56810f(view, i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static int resolveSizeAndState(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static boolean restoreDefaultFocus(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4137p.m56822i(view);
        }
        return view.requestFocus();
    }

    /* renamed from: s */
    public static void m56940s(int i, View view) {
        List m56947l = m56947l(view);
        for (int i2 = 0; i2 < m56947l.size(); i2++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) m56947l.get(i2)).getId() == i) {
                m56947l.remove(i2);
                return;
            }
        }
    }

    public static void saveAttributeDataForStyleable(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C4139r.m56804c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void setAccessibilityDelegate(@NonNull View view, @Nullable AccessibilityDelegateCompat accessibilityDelegateCompat) {
        View.AccessibilityDelegate m57051b;
        if (accessibilityDelegateCompat == null && (m56949j(view) instanceof AccessibilityDelegateCompat.C4094a)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        if (accessibilityDelegateCompat == null) {
            m57051b = null;
        } else {
            m57051b = accessibilityDelegateCompat.m57051b();
        }
        view.setAccessibilityDelegate(m57051b);
    }

    @UiThread
    public static void setAccessibilityHeading(@NonNull View view, boolean z) {
        m56957b().m56912g(view, Boolean.valueOf(z));
    }

    public static void setAccessibilityLiveRegion(@NonNull View view, int i) {
        C4131k.m56871f(view, i);
    }

    @UiThread
    public static void setAccessibilityPaneTitle(@NonNull View view, @Nullable CharSequence charSequence) {
        m56941r().m56912g(view, charSequence);
        if (charSequence != null) {
            f34198l.m56923a(view);
        } else {
            f34198l.m56920d(view);
        }
    }

    @Deprecated
    public static void setActivated(View view, boolean z) {
        view.setActivated(z);
    }

    @Deprecated
    public static void setAlpha(View view, @FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        view.setAlpha(f);
    }

    public static void setAutofillHints(@NonNull View view, @Nullable String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4137p.m56821j(view, strArr);
        }
    }

    public static void setBackground(@NonNull View view, @Nullable Drawable drawable) {
        C4128h.m56893q(view, drawable);
    }

    public static void setBackgroundTintList(@NonNull View view, @Nullable ColorStateList colorStateList) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        C4133m.m56850q(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            if (C4133m.m56860g(view) == null && C4133m.m56859h(view) == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                C4128h.m56893q(view, background);
            }
        }
    }

    public static void setBackgroundTintMode(@NonNull View view, @Nullable PorterDuff.Mode mode) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        C4133m.m56849r(view, mode);
        if (i == 21) {
            Drawable background = view.getBackground();
            if (C4133m.m56860g(view) == null && C4133m.m56859h(view) == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                C4128h.m56893q(view, background);
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z) {
        if (f34192f == null) {
            try {
                f34192f = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            f34192f.setAccessible(true);
        }
        try {
            f34192f.invoke(viewGroup, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    public static void setClipBounds(@NonNull View view, @Nullable Rect rect) {
        C4130j.m56877c(view, rect);
    }

    public static void setElevation(@NonNull View view, float f) {
        C4133m.m56848s(view, f);
    }

    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void setFocusedByDefault(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4137p.m56820k(view, z);
        }
    }

    public static void setHasTransientState(@NonNull View view, boolean z) {
        C4128h.m56892r(view, z);
    }

    @UiThread
    public static void setImportantForAccessibility(@NonNull View view, int i) {
        C4128h.m56891s(view, i);
    }

    public static void setImportantForAutofill(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4137p.m56819l(view, i);
        }
    }

    public static void setKeyboardNavigationCluster(@NonNull View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4137p.m56818m(view, z);
        }
    }

    public static void setLabelFor(@NonNull View view, @IdRes int i) {
        C4129i.m56883h(view, i);
    }

    public static void setLayerPaint(@NonNull View view, @Nullable Paint paint) {
        C4129i.m56882i(view, paint);
    }

    @Deprecated
    public static void setLayerType(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static void setLayoutDirection(@NonNull View view, int i) {
        C4129i.m56881j(view, i);
    }

    public static void setNestedScrollingEnabled(@NonNull View view, boolean z) {
        C4133m.m56847t(view, z);
    }

    public static void setNextClusterForwardId(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4137p.m56817n(view, i);
        }
    }

    public static void setOnApplyWindowInsetsListener(@NonNull View view, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C4133m.m56846u(view, onApplyWindowInsetsListener);
    }

    public static void setOnReceiveContentListener(@NonNull View view, @Nullable String[] strArr, @Nullable OnReceiveContentListener onReceiveContentListener) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            C4141t.m56797c(view, strArr, onReceiveContentListener);
            return;
        }
        strArr = (strArr == null || strArr.length == 0) ? null : null;
        boolean z2 = false;
        if (onReceiveContentListener != null) {
            if (strArr != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].startsWith(Marker.ANY_MARKER)) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            Preconditions.checkArgument(!z2, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, onReceiveContentListener);
    }

    @Deprecated
    public static void setOverScrollMode(View view, int i) {
        view.setOverScrollMode(i);
    }

    public static void setPaddingRelative(@NonNull View view, @InterfaceC2055Px int i, @InterfaceC2055Px int i2, @InterfaceC2055Px int i3, @InterfaceC2055Px int i4) {
        C4129i.m56880k(view, i, i2, i3, i4);
    }

    @Deprecated
    public static void setPivotX(View view, float f) {
        view.setPivotX(f);
    }

    @Deprecated
    public static void setPivotY(View view, float f) {
        view.setPivotY(f);
    }

    public static void setPointerIcon(@NonNull View view, @Nullable PointerIconCompat pointerIconCompat) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (pointerIconCompat != null) {
                obj = pointerIconCompat.getPointerIcon();
            } else {
                obj = null;
            }
            C4136o.m56833d(view, AbstractC20831l22.m26569a(obj));
        }
    }

    @Deprecated
    public static void setRotation(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    public static void setRotationX(View view, float f) {
        view.setRotationX(f);
    }

    @Deprecated
    public static void setRotationY(View view, float f) {
        view.setRotationY(f);
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    @Deprecated
    public static void setScaleX(View view, float f) {
        view.setScaleX(f);
    }

    @Deprecated
    public static void setScaleY(View view, float f) {
        view.setScaleY(f);
    }

    @UiThread
    public static void setScreenReaderFocusable(@NonNull View view, boolean z) {
        m56939t().m56912g(view, Boolean.valueOf(z));
    }

    public static void setScrollIndicators(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C4135n.m56838c(view, i);
        }
    }

    @UiThread
    public static void setStateDescription(@NonNull View view, @Nullable CharSequence charSequence) {
        m56937v().m56912g(view, charSequence);
    }

    public static void setSystemGestureExclusionRects(@NonNull View view, @NonNull List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            C4139r.m56803d(view, list);
        }
    }

    public static void setTooltipText(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4137p.m56816o(view, charSequence);
        }
    }

    public static void setTransitionName(@NonNull View view, @Nullable String str) {
        C4133m.m56845v(view, str);
    }

    @Deprecated
    public static void setTranslationX(View view, float f) {
        view.setTranslationX(f);
    }

    @Deprecated
    public static void setTranslationY(View view, float f) {
        view.setTranslationY(f);
    }

    public static void setTranslationZ(@NonNull View view, float f) {
        C4133m.m56844w(view, f);
    }

    public static void setWindowInsetsAnimationCallback(@NonNull View view, @Nullable WindowInsetsAnimationCompat.Callback callback) {
        WindowInsetsAnimationCompat.m56748a(view, callback);
    }

    @Deprecated
    public static void setX(View view, float f) {
        view.setX(f);
    }

    @Deprecated
    public static void setY(View view, float f) {
        view.setY(f);
    }

    public static void setZ(@NonNull View view, float f) {
        C4133m.m56843x(view, f);
    }

    public static boolean startDragAndDrop(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4136o.m56832e(view, clipData, dragShadowBuilder, obj, i);
        }
        return view.startDrag(clipData, dragShadowBuilder, obj, i);
    }

    public static boolean startNestedScroll(@NonNull View view, int i) {
        return C4133m.m56842y(view, i);
    }

    public static void stopNestedScroll(@NonNull View view) {
        C4133m.m56841z(view);
    }

    /* renamed from: t */
    public static AbstractC4126f m56939t() {
        return new C4121a(R.id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: u */
    public static void m56938u(View view) {
        if (getImportantForAccessibility(view) == 0) {
            setImportantForAccessibility(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (getImportantForAccessibility((View) parent) == 4) {
                setImportantForAccessibility(view, 2);
                return;
            }
        }
    }

    public static void updateDragShadow(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            C4136o.m56831f(view, dragShadowBuilder);
        }
    }

    /* renamed from: v */
    public static AbstractC4126f m56937v() {
        return new C4123c(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: w */
    public static void m56936w(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean dispatchNestedPreScroll(@NonNull View view, int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return dispatchNestedPreScroll(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    public static void dispatchNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @NonNull int[] iArr2) {
        if (view instanceof NestedScrollingChild3) {
            ((NestedScrollingChild3) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            dispatchNestedScroll(view, i, i2, i3, i4, iArr, i5);
        }
    }

    public static boolean hasNestedScrollingParent(@NonNull View view, int i) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).hasNestedScrollingParent(i);
            return false;
        } else if (i == 0) {
            return hasNestedScrollingParent(view);
        } else {
            return false;
        }
    }

    public static void postInvalidateOnAnimation(@NonNull View view, int i, int i2, int i3, int i4) {
        C4128h.m56898l(view, i, i2, i3, i4);
    }

    public static boolean startNestedScroll(@NonNull View view, int i, int i2) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return startNestedScroll(view, i);
        }
        return false;
    }

    public static void stopNestedScroll(@NonNull View view, int i) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).stopNestedScroll(i);
        } else if (i == 0) {
            stopNestedScroll(view);
        }
    }

    public static void setScrollIndicators(@NonNull View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C4135n.m56837d(view, i, i2);
        }
    }

    public static boolean dispatchNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        if (view instanceof NestedScrollingChild2) {
            return ((NestedScrollingChild2) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return dispatchNestedScroll(view, i, i2, i3, i4, iArr);
        }
        return false;
    }
}
