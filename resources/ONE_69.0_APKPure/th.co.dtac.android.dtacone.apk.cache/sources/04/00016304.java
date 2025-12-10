package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.p005os.BuildCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: zK */
/* loaded from: classes.dex */
public class C17201zK extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;

    /* renamed from: a */
    public final Rect f109326a;

    /* renamed from: b */
    public int f109327b;

    /* renamed from: c */
    public int f109328c;

    /* renamed from: d */
    public int f109329d;

    /* renamed from: e */
    public int f109330e;

    /* renamed from: f */
    public int f109331f;

    /* renamed from: g */
    public C17205d f109332g;

    /* renamed from: h */
    public boolean f109333h;

    /* renamed from: i */
    public boolean f109334i;

    /* renamed from: j */
    public boolean f109335j;

    /* renamed from: k */
    public ViewPropertyAnimatorCompat f109336k;

    /* renamed from: l */
    public ListViewAutoScrollHelper f109337l;

    /* renamed from: m */
    public RunnableC17207f f109338m;

    /* renamed from: zK$a */
    /* loaded from: classes.dex */
    public static class C17202a {
        @DoNotInline
        /* renamed from: a */
        public static void m148a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: zK$b */
    /* loaded from: classes.dex */
    public static class C17203b {

        /* renamed from: a */
        public static Method f109339a;

        /* renamed from: b */
        public static Method f109340b;

        /* renamed from: c */
        public static Method f109341c;

        /* renamed from: d */
        public static boolean f109342d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f109339a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f109340b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f109341c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f109342d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public static boolean m147a() {
            return f109342d;
        }

        /* renamed from: b */
        public static void m146b(C17201zK c17201zK, int i, View view) {
            try {
                f109339a.invoke(c17201zK, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f109340b.invoke(c17201zK, Integer.valueOf(i));
                f109341c.invoke(c17201zK, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: zK$c */
    /* loaded from: classes.dex */
    public static class C17204c {
        @DoNotInline
        /* renamed from: a */
        public static boolean m145a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m144b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: zK$d */
    /* loaded from: classes.dex */
    public static class C17205d extends DrawableWrapperCompat {

        /* renamed from: b */
        public boolean f109343b;

        public C17205d(Drawable drawable) {
            super(drawable);
            this.f109343b = true;
        }

        /* renamed from: a */
        public void m143a(boolean z) {
            this.f109343b = z;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f109343b) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f109343b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f109343b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f109343b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f109343b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: zK$e */
    /* loaded from: classes.dex */
    public static class C17206e {

        /* renamed from: a */
        public static final Field f109344a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f109344a = field;
        }

        /* renamed from: a */
        public static boolean m142a(AbsListView absListView) {
            Field field = f109344a;
            if (field != null) {
                try {
                    return field.getBoolean(absListView);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static void m141b(AbsListView absListView, boolean z) {
            Field field = f109344a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: zK$f */
    /* loaded from: classes.dex */
    public class RunnableC17207f implements Runnable {
        public RunnableC17207f() {
        }

        /* renamed from: a */
        public void m140a() {
            C17201zK c17201zK = C17201zK.this;
            c17201zK.f109338m = null;
            c17201zK.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m139b() {
            C17201zK.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C17201zK c17201zK = C17201zK.this;
            c17201zK.f109338m = null;
            c17201zK.drawableStateChanged();
        }
    }

    public C17201zK(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f109326a = new Rect();
        this.f109327b = 0;
        this.f109328c = 0;
        this.f109329d = 0;
        this.f109330e = 0;
        this.f109334i = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final void m160a() {
        this.f109335j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f109331f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f109336k;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
            this.f109336k = null;
        }
    }

    /* renamed from: b */
    public final void m159b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    public final void m158c(Canvas canvas) {
        Drawable selector;
        if (!this.f109326a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f109326a);
            selector.draw(canvas);
        }
    }

    /* renamed from: d */
    public final void m157d(int i, View view) {
        Rect rect = this.f109326a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f109327b;
        rect.top -= this.f109328c;
        rect.right += this.f109329d;
        rect.bottom += this.f109330e;
        boolean m152i = m152i();
        if (view.isEnabled() != m152i) {
            m151j(!m152i);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m158c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f109338m != null) {
            return;
        }
        super.drawableStateChanged();
        m153h(true);
        m149l();
    }

    /* renamed from: e */
    public final void m156e(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector != null && i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        m157d(i, view);
        if (z) {
            Rect rect = this.f109326a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            DrawableCompat.setHotspot(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: f */
    public final void m155f(int i, View view, float f, float f2) {
        m156e(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            DrawableCompat.setHotspot(selector, f, f2);
        }
    }

    /* renamed from: g */
    public final void m154g(View view, int i, float f, float f2) {
        View childAt;
        this.f109335j = true;
        C17202a.m148a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f109331f;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f109331f = i;
        C17202a.m148a(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m155f(i, view, f, f2);
        m153h(false);
        refreshDrawableState();
    }

    /* renamed from: h */
    public final void m153h(boolean z) {
        C17205d c17205d = this.f109332g;
        if (c17205d != null) {
            c17205d.m143a(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        if (!this.f109334i && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        if (!this.f109334i && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m152i() {
        if (BuildCompat.isAtLeastT()) {
            return C17204c.m145a(this);
        }
        return C17206e.m142a(this);
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (!this.f109334i && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if ((this.f109334i && this.f109333h) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m151j(boolean z) {
        if (BuildCompat.isAtLeastT()) {
            C17204c.m144b(this, z);
        } else {
            C17206e.m141b(this, z);
        }
    }

    /* renamed from: k */
    public final boolean m150k() {
        return this.f109335j;
    }

    /* renamed from: l */
    public final void m149l() {
        Drawable selector = getSelector();
        if (selector != null && m150k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int lookForSelectablePosition(int i, boolean z) {
        int min;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    min = Math.max(0, i);
                    while (min < count && !adapter.isEnabled(min)) {
                        min++;
                    }
                } else {
                    min = Math.min(i, count - 1);
                    while (min >= 0 && !adapter.isEnabled(min)) {
                        min--;
                    }
                }
                if (min < 0 || min >= count) {
                    return -1;
                }
                return min;
            } else if (i >= 0 && i < count) {
                return i;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            if (i10 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i9 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                if (i5 >= 0 && i9 > i5 && i8 > 0 && i6 != i4) {
                    return i8;
                }
                return i4;
            }
            if (i5 >= 0 && i9 >= i5) {
                i8 = i6;
            }
        }
        return i6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f109338m = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onForwardedEvent(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m154g(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.m159b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m160a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.f109337l
            if (r9 != 0) goto L5a
            androidx.core.widget.ListViewAutoScrollHelper r9 = new androidx.core.widget.ListViewAutoScrollHelper
            r9.<init>(r7)
            r7.f109337l = r9
        L5a:
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.f109337l
            r9.setEnabled(r1)
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.f109337l
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.ListViewAutoScrollHelper r8 = r7.f109337l
            if (r8 == 0) goto L6c
            r8.setEnabled(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C17201zK.onForwardedEvent(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f109338m == null) {
            RunnableC17207f runnableC17207f = new RunnableC17207f();
            this.f109338m = runnableC17207f;
            runnableC17207f.m139b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && C17203b.m147a()) {
                        C17203b.m146b(this, pointToPosition, childAt);
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                m149l();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f109331f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC17207f runnableC17207f = this.f109338m;
        if (runnableC17207f != null) {
            runnableC17207f.m140a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f109333h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C17205d c17205d;
        if (drawable != null) {
            c17205d = new C17205d(drawable);
        } else {
            c17205d = null;
        }
        this.f109332g = c17205d;
        super.setSelector(c17205d);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f109327b = rect.left;
        this.f109328c = rect.top;
        this.f109329d = rect.right;
        this.f109330e = rect.bottom;
    }
}