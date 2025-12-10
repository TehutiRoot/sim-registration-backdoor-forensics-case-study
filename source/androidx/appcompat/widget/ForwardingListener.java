package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f9682a;

    /* renamed from: b */
    public final int f9683b;

    /* renamed from: c */
    public final int f9684c;

    /* renamed from: d */
    public final View f9685d;

    /* renamed from: e */
    public Runnable f9686e;

    /* renamed from: f */
    public Runnable f9687f;

    /* renamed from: g */
    public boolean f9688g;

    /* renamed from: h */
    public int f9689h;

    /* renamed from: i */
    public final int[] f9690i = new int[2];

    /* renamed from: androidx.appcompat.widget.ForwardingListener$a */
    /* loaded from: classes.dex */
    public class RunnableC2201a implements Runnable {
        public RunnableC2201a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = ForwardingListener.this.f9685d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ForwardingListener$b */
    /* loaded from: classes.dex */
    public class RunnableC2202b implements Runnable {
        public RunnableC2202b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForwardingListener.this.m64292b();
        }
    }

    public ForwardingListener(View view) {
        this.f9685d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9682a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f9683b = tapTimeout;
        this.f9684c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: e */
    public static boolean m64289e(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f >= f4 && f2 >= f4 && f < (view.getRight() - view.getLeft()) + f3 && f2 < (view.getBottom() - view.getTop()) + f3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m64293a() {
        Runnable runnable = this.f9687f;
        if (runnable != null) {
            this.f9685d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f9686e;
        if (runnable2 != null) {
            this.f9685d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public void m64292b() {
        m64293a();
        View view = this.f9685d;
        if (!view.isEnabled() || view.isLongClickable() || !onForwardingStarted()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.f9688g = true;
    }

    /* renamed from: c */
    public final boolean m64291c(MotionEvent motionEvent) {
        C17112yK c17112yK;
        boolean z;
        View view = this.f9685d;
        ShowableListMenu popup = getPopup();
        if (popup == null || !popup.isShowing() || (c17112yK = (C17112yK) popup.getListView()) == null || !c17112yK.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m64288f(view, obtainNoHistory);
        m64287g(c17112yK, obtainNoHistory);
        boolean onForwardedEvent = c17112yK.onForwardedEvent(obtainNoHistory, this.f9689h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            z = true;
        } else {
            z = false;
        }
        if (!onForwardedEvent || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m64290d(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f9685d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f9689h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f9682a
            boolean r6 = m64289e(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m64293a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m64293a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f9689h = r6
            java.lang.Runnable r6 = r5.f9686e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.ForwardingListener$a r6 = new androidx.appcompat.widget.ForwardingListener$a
            r6.<init>()
            r5.f9686e = r6
        L52:
            java.lang.Runnable r6 = r5.f9686e
            int r1 = r5.f9683b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f9687f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.ForwardingListener$b r6 = new androidx.appcompat.widget.ForwardingListener$b
            r6.<init>()
            r5.f9687f = r6
        L65:
            java.lang.Runnable r6 = r5.f9687f
            int r1 = r5.f9684c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ForwardingListener.m64290d(android.view.MotionEvent):boolean");
    }

    /* renamed from: f */
    public final boolean m64288f(View view, MotionEvent motionEvent) {
        int[] iArr = this.f9690i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* renamed from: g */
    public final boolean m64287g(View view, MotionEvent motionEvent) {
        int[] iArr = this.f9690i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract ShowableListMenu getPopup();

    public boolean onForwardingStarted() {
        ShowableListMenu popup = getPopup();
        if (popup != null && !popup.isShowing()) {
            popup.show();
            return true;
        }
        return true;
    }

    public boolean onForwardingStopped() {
        ShowableListMenu popup = getPopup();
        if (popup != null && popup.isShowing()) {
            popup.dismiss();
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f9688g;
        if (z2) {
            if (!m64291c(motionEvent) && onForwardingStopped()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            if (m64290d(motionEvent) && onForwardingStarted()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f9685d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f9688g = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f9688g = false;
        this.f9689h = -1;
        Runnable runnable = this.f9686e;
        if (runnable != null) {
            this.f9685d.removeCallbacks(runnable);
        }
    }
}
