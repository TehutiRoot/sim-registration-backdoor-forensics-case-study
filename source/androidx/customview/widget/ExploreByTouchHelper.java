package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.customview.widget.FocusStrategy;
import es.dmoral.toasty.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;

    /* renamed from: n */
    public static final Rect f34440n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final FocusStrategy.BoundsAdapter f34441o = new C4254a();

    /* renamed from: p */
    public static final FocusStrategy.CollectionAdapter f34442p = new C4255b();

    /* renamed from: h */
    public final AccessibilityManager f34447h;

    /* renamed from: i */
    public final View f34448i;

    /* renamed from: j */
    public C4256c f34449j;

    /* renamed from: d */
    public final Rect f34443d = new Rect();

    /* renamed from: e */
    public final Rect f34444e = new Rect();

    /* renamed from: f */
    public final Rect f34445f = new Rect();

    /* renamed from: g */
    public final int[] f34446g = new int[2];

    /* renamed from: k */
    public int f34450k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f34451l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f34452m = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$a */
    /* loaded from: classes2.dex */
    public class C4254a implements FocusStrategy.BoundsAdapter {
        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        /* renamed from: a */
        public void obtainBounds(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, Rect rect) {
            accessibilityNodeInfoCompat.getBoundsInParent(rect);
        }
    }

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$b */
    /* loaded from: classes2.dex */
    public class C4255b implements FocusStrategy.CollectionAdapter {
        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        /* renamed from: a */
        public AccessibilityNodeInfoCompat get(SparseArrayCompat sparseArrayCompat, int i) {
            return (AccessibilityNodeInfoCompat) sparseArrayCompat.valueAt(i);
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        /* renamed from: b */
        public int size(SparseArrayCompat sparseArrayCompat) {
            return sparseArrayCompat.size();
        }
    }

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$c */
    /* loaded from: classes2.dex */
    public class C4256c extends AccessibilityNodeProviderCompat {
        public C4256c() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
            return AccessibilityNodeInfoCompat.obtain(ExploreByTouchHelper.this.m56412r(i));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int i) {
            int i2;
            if (i == 2) {
                i2 = ExploreByTouchHelper.this.f34450k;
            } else {
                i2 = ExploreByTouchHelper.this.f34451l;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(i2);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i, int i2, Bundle bundle) {
            return ExploreByTouchHelper.this.m56411s(i, i2, bundle);
        }
    }

    public ExploreByTouchHelper(@NonNull View view) {
        if (view != null) {
            this.f34448i = view;
            this.f34447h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ViewCompat.getImportantForAccessibility(view) == 0) {
                ViewCompat.setImportantForAccessibility(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: e */
    private boolean m56425e(int i) {
        if (this.f34450k == i) {
            this.f34450k = Integer.MIN_VALUE;
            this.f34448i.invalidate();
            sendEventForVirtualView(i, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static Rect m56416n(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    /* renamed from: p */
    public static int m56414p(int i) {
        if (i != 19) {
            if (i != 21) {
                if (i != 22) {
                    return BuildConfig.VERSION_CODE;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    /* renamed from: v */
    private boolean m56408v(int i) {
        int i2;
        if (!this.f34447h.isEnabled() || !this.f34447h.isTouchExplorationEnabled() || (i2 = this.f34450k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m56425e(i2);
        }
        this.f34450k = i;
        this.f34448i.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    /* renamed from: w */
    private void m56407w(int i) {
        int i2 = this.f34452m;
        if (i2 == i) {
            return;
        }
        this.f34452m = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.f34451l != i) {
            return false;
        }
        this.f34451l = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (!this.f34447h.isEnabled() || !this.f34447h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.f34452m == Integer.MIN_VALUE) {
                return false;
            }
            m56407w(Integer.MIN_VALUE);
            return true;
        }
        int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
        m56407w(virtualViewAt);
        if (virtualViewAt == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int m56414p = m56414p(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m56413q(m56414p, null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m56424f();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m56413q(2, null);
        } else {
            if (!keyEvent.hasModifiers(1)) {
                return false;
            }
            return m56413q(1, null);
        }
    }

    /* renamed from: f */
    public final boolean m56424f() {
        int i = this.f34451l;
        if (i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final AccessibilityEvent m56423g(int i, int i2) {
        if (i != -1) {
            return m56422h(i, i2);
        }
        return m56421i(i2);
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f34450k;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.f34449j == null) {
            this.f34449j = new C4256c();
        }
        return this.f34449j;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.f34451l;
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    /* renamed from: h */
    public final AccessibilityEvent m56422h(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        AccessibilityNodeInfoCompat m56412r = m56412r(i);
        obtain.getText().add(m56412r.getText());
        obtain.setContentDescription(m56412r.getContentDescription());
        obtain.setScrollable(m56412r.isScrollable());
        obtain.setPassword(m56412r.isPassword());
        obtain.setEnabled(m56412r.isEnabled());
        obtain.setChecked(m56412r.isChecked());
        onPopulateEventForVirtualView(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m56412r.getClassName());
        AccessibilityRecordCompat.setSource(obtain, this.f34448i, i);
        obtain.setPackageName(this.f34448i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: i */
    public final AccessibilityEvent m56421i(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f34448i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    /* renamed from: j */
    public final AccessibilityNodeInfoCompat m56420j(int i) {
        boolean z;
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        Rect rect = f34440n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        obtain.setParent(this.f34448i);
        onPopulateNodeForVirtualView(i, obtain);
        if (obtain.getText() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.f34444e);
        if (!this.f34444e.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(this.f34448i.getContext().getPackageName());
                    obtain.setSource(this.f34448i, i);
                    if (this.f34450k == i) {
                        obtain.setAccessibilityFocused(true);
                        obtain.addAction(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        obtain.addAction(64);
                    }
                    if (this.f34451l == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        obtain.addAction(2);
                    } else if (obtain.isFocusable()) {
                        obtain.addAction(1);
                    }
                    obtain.setFocused(z);
                    this.f34448i.getLocationOnScreen(this.f34446g);
                    obtain.getBoundsInScreen(this.f34443d);
                    if (this.f34443d.equals(rect)) {
                        obtain.getBoundsInParent(this.f34443d);
                        if (obtain.mParentVirtualDescendantId != -1) {
                            AccessibilityNodeInfoCompat obtain2 = AccessibilityNodeInfoCompat.obtain();
                            for (int i2 = obtain.mParentVirtualDescendantId; i2 != -1; i2 = obtain2.mParentVirtualDescendantId) {
                                obtain2.setParent(this.f34448i, -1);
                                obtain2.setBoundsInParent(f34440n);
                                onPopulateNodeForVirtualView(i2, obtain2);
                                obtain2.getBoundsInParent(this.f34444e);
                                Rect rect2 = this.f34443d;
                                Rect rect3 = this.f34444e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            obtain2.recycle();
                        }
                        this.f34443d.offset(this.f34446g[0] - this.f34448i.getScrollX(), this.f34446g[1] - this.f34448i.getScrollY());
                    }
                    if (this.f34448i.getLocalVisibleRect(this.f34445f)) {
                        this.f34445f.offset(this.f34446g[0] - this.f34448i.getScrollX(), this.f34446g[1] - this.f34448i.getScrollY());
                        if (this.f34443d.intersect(this.f34445f)) {
                            obtain.setBoundsInScreen(this.f34443d);
                            if (m56415o(this.f34443d)) {
                                obtain.setVisibleToUser(true);
                            }
                        }
                    }
                    return obtain;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* renamed from: k */
    public final AccessibilityNodeInfoCompat m56419k() {
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain(this.f34448i);
        ViewCompat.onInitializeAccessibilityNodeInfo(this.f34448i, obtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            obtain.addChild(this.f34448i, ((Integer) arrayList.get(i)).intValue());
        }
        return obtain;
    }

    /* renamed from: l */
    public final SparseArrayCompat m56418l() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        for (int i = 0; i < arrayList.size(); i++) {
            sparseArrayCompat.put(arrayList.get(i).intValue(), m56420j(arrayList.get(i).intValue()));
        }
        return sparseArrayCompat;
    }

    /* renamed from: m */
    public final void m56417m(int i, Rect rect) {
        m56412r(i).getBoundsInParent(rect);
    }

    /* renamed from: o */
    public final boolean m56415o(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f34448i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f34448i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        int i2 = this.f34451l;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            m56413q(i, rect);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        onPopulateNodeForHost(accessibilityNodeInfoCompat);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, @Nullable Bundle bundle);

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    /* renamed from: q */
    public final boolean m56413q(int i, Rect rect) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        boolean z;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2;
        SparseArrayCompat m56418l = m56418l();
        int i2 = this.f34451l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            accessibilityNodeInfoCompat = null;
        } else {
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) m56418l.get(i2);
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.f34451l;
            if (i4 != Integer.MIN_VALUE) {
                m56417m(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m56416n(this.f34448i, i, rect2);
            }
            accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) FocusStrategy.m56401c(m56418l, f34442p, f34441o, accessibilityNodeInfoCompat3, rect2, i);
        } else {
            if (ViewCompat.getLayoutDirection(this.f34448i) == 1) {
                z = true;
            } else {
                z = false;
            }
            accessibilityNodeInfoCompat2 = (AccessibilityNodeInfoCompat) FocusStrategy.m56400d(m56418l, f34442p, f34441o, accessibilityNodeInfoCompat3, i, z, false);
        }
        if (accessibilityNodeInfoCompat2 != null) {
            i3 = m56418l.keyAt(m56418l.indexOfValue(accessibilityNodeInfoCompat2));
        }
        return requestKeyboardFocusForVirtualView(i3);
    }

    /* renamed from: r */
    public AccessibilityNodeInfoCompat m56412r(int i) {
        if (i == -1) {
            return m56419k();
        }
        return m56420j(i);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.f34448i.isFocused() && !this.f34448i.requestFocus()) || (i2 = this.f34451l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f34451l = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    /* renamed from: s */
    public boolean m56411s(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m56410t(i, i2, bundle);
        }
        return m56409u(i2, bundle);
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f34447h.isEnabled() || (parent = this.f34448i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f34448i, m56423g(i, i2));
    }

    /* renamed from: t */
    public final boolean m56410t(int i, int i2, Bundle bundle) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        return onPerformActionForVirtualView(i, i2, bundle);
                    }
                    return m56425e(i);
                }
                return m56408v(i);
            }
            return clearKeyboardFocusForVirtualView(i);
        }
        return requestKeyboardFocusForVirtualView(i);
    }

    /* renamed from: u */
    public final boolean m56409u(int i, Bundle bundle) {
        return ViewCompat.performAccessibilityAction(this.f34448i, i, bundle);
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f34447h.isEnabled() || (parent = this.f34448i.getParent()) == null) {
            return;
        }
        AccessibilityEvent m56423g = m56423g(i, 2048);
        AccessibilityEventCompat.setContentChangeTypes(m56423g, i2);
        parent.requestSendAccessibilityEvent(this.f34448i, m56423g);
    }
}
