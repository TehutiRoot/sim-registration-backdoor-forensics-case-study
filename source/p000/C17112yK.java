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

/* renamed from: yK */
/* loaded from: classes.dex */
public class C17112yK extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;

    /* renamed from: a */
    public final Rect f108695a;

    /* renamed from: b */
    public int f108696b;

    /* renamed from: c */
    public int f108697c;

    /* renamed from: d */
    public int f108698d;

    /* renamed from: e */
    public int f108699e;

    /* renamed from: f */
    public int f108700f;

    /* renamed from: g */
    public C17116d f108701g;

    /* renamed from: h */
    public boolean f108702h;

    /* renamed from: i */
    public boolean f108703i;

    /* renamed from: j */
    public boolean f108704j;

    /* renamed from: k */
    public ViewPropertyAnimatorCompat f108705k;

    /* renamed from: l */
    public ListViewAutoScrollHelper f108706l;

    /* renamed from: m */
    public RunnableC17118f f108707m;

    /* renamed from: yK$a */
    /* loaded from: classes.dex */
    public static class C17113a {
        @DoNotInline
        /* renamed from: a */
        public static void m297a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: yK$b */
    /* loaded from: classes.dex */
    public static class C17114b {

        /* renamed from: a */
        public static Method f108708a;

        /* renamed from: b */
        public static Method f108709b;

        /* renamed from: c */
        public static Method f108710c;

        /* renamed from: d */
        public static boolean f108711d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f108708a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f108709b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f108710c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f108711d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public static boolean m296a() {
            return f108711d;
        }

        /* renamed from: b */
        public static void m295b(C17112yK c17112yK, int i, View view) {
            try {
                f108708a.invoke(c17112yK, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f108709b.invoke(c17112yK, Integer.valueOf(i));
                f108710c.invoke(c17112yK, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: yK$c */
    /* loaded from: classes.dex */
    public static class C17115c {
        @DoNotInline
        /* renamed from: a */
        public static boolean m294a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m293b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: yK$d */
    /* loaded from: classes.dex */
    public static class C17116d extends DrawableWrapperCompat {

        /* renamed from: b */
        public boolean f108712b;

        public C17116d(Drawable drawable) {
            super(drawable);
            this.f108712b = true;
        }

        /* renamed from: a */
        public void m292a(boolean z) {
            this.f108712b = z;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f108712b) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f108712b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f108712b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f108712b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f108712b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: yK$e */
    /* loaded from: classes.dex */
    public static class C17117e {

        /* renamed from: a */
        public static final Field f108713a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f108713a = field;
        }

        /* renamed from: a */
        public static boolean m291a(AbsListView absListView) {
            Field field = f108713a;
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
        public static void m290b(AbsListView absListView, boolean z) {
            Field field = f108713a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: yK$f */
    /* loaded from: classes.dex */
    public class RunnableC17118f implements Runnable {
        public RunnableC17118f() {
        }

        /* renamed from: a */
        public void m289a() {
            C17112yK c17112yK = C17112yK.this;
            c17112yK.f108707m = null;
            c17112yK.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m288b() {
            C17112yK.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C17112yK c17112yK = C17112yK.this;
            c17112yK.f108707m = null;
            c17112yK.drawableStateChanged();
        }
    }

    public C17112yK(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f108695a = new Rect();
        this.f108696b = 0;
        this.f108697c = 0;
        this.f108698d = 0;
        this.f108699e = 0;
        this.f108703i = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final void m309a() {
        this.f108704j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f108700f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f108705k;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
            this.f108705k = null;
        }
    }

    /* renamed from: b */
    public final void m308b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    public final void m307c(Canvas canvas) {
        Drawable selector;
        if (!this.f108695a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f108695a);
            selector.draw(canvas);
        }
    }

    /* renamed from: d */
    public final void m306d(int i, View view) {
        Rect rect = this.f108695a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f108696b;
        rect.top -= this.f108697c;
        rect.right += this.f108698d;
        rect.bottom += this.f108699e;
        boolean m301i = m301i();
        if (view.isEnabled() != m301i) {
            m300j(!m301i);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m307c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f108707m != null) {
            return;
        }
        super.drawableStateChanged();
        m302h(true);
        m298l();
    }

    /* renamed from: e */
    public final void m305e(int i, View view) {
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
        m306d(i, view);
        if (z) {
            Rect rect = this.f108695a;
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
    public final void m304f(int i, View view, float f, float f2) {
        m305e(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            DrawableCompat.setHotspot(selector, f, f2);
        }
    }

    /* renamed from: g */
    public final void m303g(View view, int i, float f, float f2) {
        View childAt;
        this.f108704j = true;
        C17113a.m297a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f108700f;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f108700f = i;
        C17113a.m297a(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m304f(i, view, f, f2);
        m302h(false);
        refreshDrawableState();
    }

    /* renamed from: h */
    public final void m302h(boolean z) {
        C17116d c17116d = this.f108701g;
        if (c17116d != null) {
            c17116d.m292a(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        if (!this.f108703i && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        if (!this.f108703i && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m301i() {
        if (BuildCompat.isAtLeastT()) {
            return C17115c.m294a(this);
        }
        return C17117e.m291a(this);
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (!this.f108703i && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if ((this.f108703i && this.f108702h) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m300j(boolean z) {
        if (BuildCompat.isAtLeastT()) {
            C17115c.m293b(this, z);
        } else {
            C17117e.m290b(this, z);
        }
    }

    /* renamed from: k */
    public final boolean m299k() {
        return this.f108704j;
    }

    /* renamed from: l */
    public final void m298l() {
        Drawable selector = getSelector();
        if (selector != null && m299k() && isPressed()) {
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
        this.f108707m = null;
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
            r7.m303g(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.m308b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m309a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.f108706l
            if (r9 != 0) goto L5a
            androidx.core.widget.ListViewAutoScrollHelper r9 = new androidx.core.widget.ListViewAutoScrollHelper
            r9.<init>(r7)
            r7.f108706l = r9
        L5a:
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.f108706l
            r9.setEnabled(r1)
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.f108706l
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.ListViewAutoScrollHelper r8 = r7.f108706l
            if (r8 == 0) goto L6c
            r8.setEnabled(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C17112yK.onForwardedEvent(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f108707m == null) {
            RunnableC17118f runnableC17118f = new RunnableC17118f();
            this.f108707m = runnableC17118f;
            runnableC17118f.m288b();
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
                    if (i >= 30 && C17114b.m296a()) {
                        C17114b.m295b(this, pointToPosition, childAt);
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                m298l();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f108700f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC17118f runnableC17118f = this.f108707m;
        if (runnableC17118f != null) {
            runnableC17118f.m289a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f108702h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C17116d c17116d;
        if (drawable != null) {
            c17116d = new C17116d(drawable);
        } else {
            c17116d = null;
        }
        this.f108701g = c17116d;
        super.setSelector(c17116d);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f108696b = rect.left;
        this.f108697c = rect.top;
        this.f108698d = rect.right;
        this.f108699e = rect.bottom;
    }
}
