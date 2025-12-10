package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.c */
/* loaded from: classes2.dex */
public final class C5216c extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public ViewPager2.OnPageChangeCallback f38157a;

    /* renamed from: b */
    public final ViewPager2 f38158b;

    /* renamed from: c */
    public final RecyclerView f38159c;

    /* renamed from: d */
    public final LinearLayoutManager f38160d;

    /* renamed from: e */
    public int f38161e;

    /* renamed from: f */
    public int f38162f;

    /* renamed from: g */
    public C5217a f38163g;

    /* renamed from: h */
    public int f38164h;

    /* renamed from: i */
    public int f38165i;

    /* renamed from: j */
    public boolean f38166j;

    /* renamed from: k */
    public boolean f38167k;

    /* renamed from: l */
    public boolean f38168l;

    /* renamed from: m */
    public boolean f38169m;

    /* renamed from: androidx.viewpager2.widget.c$a */
    /* loaded from: classes2.dex */
    public static final class C5217a {

        /* renamed from: a */
        public int f38170a;

        /* renamed from: b */
        public float f38171b;

        /* renamed from: c */
        public int f38172c;

        /* renamed from: a */
        public void m52362a() {
            this.f38170a = -1;
            this.f38171b = 0.0f;
            this.f38172c = 0;
        }
    }

    public C5216c(ViewPager2 viewPager2) {
        this.f38158b = viewPager2;
        RecyclerView recyclerView = viewPager2.f38122j;
        this.f38159c = recyclerView;
        this.f38160d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f38163g = new C5217a();
        m52366o();
    }

    /* renamed from: a */
    public final void m52380a(int i, float f, int i2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f38157a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: b */
    public final void m52379b(int i) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f38157a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i);
        }
    }

    /* renamed from: c */
    public final void m52378c(int i) {
        if ((this.f38161e == 3 && this.f38162f == 0) || this.f38162f == i) {
            return;
        }
        this.f38162f = i;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f38157a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: d */
    public final int m52377d() {
        return this.f38160d.findFirstVisibleItemPosition();
    }

    /* renamed from: e */
    public double m52376e() {
        m52363r();
        C5217a c5217a = this.f38163g;
        return c5217a.f38170a + c5217a.f38171b;
    }

    /* renamed from: f */
    public int m52375f() {
        return this.f38162f;
    }

    /* renamed from: g */
    public boolean m52374g() {
        if (this.f38162f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m52373h() {
        return this.f38169m;
    }

    /* renamed from: i */
    public boolean m52372i() {
        if (this.f38162f == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m52371j() {
        int i = this.f38161e;
        if (i == 1 || i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m52370k() {
        this.f38161e = 4;
        m52364q(true);
    }

    /* renamed from: l */
    public void m52369l() {
        this.f38168l = true;
    }

    /* renamed from: m */
    public void m52368m() {
        if (m52374g() && !this.f38169m) {
            return;
        }
        this.f38169m = false;
        m52363r();
        C5217a c5217a = this.f38163g;
        if (c5217a.f38172c == 0) {
            int i = c5217a.f38170a;
            if (i != this.f38164h) {
                m52379b(i);
            }
            m52378c(0);
            m52366o();
            return;
        }
        m52378c(2);
    }

    /* renamed from: n */
    public void m52367n(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f38161e = i2;
        boolean z2 = false;
        this.f38169m = false;
        if (this.f38165i != i) {
            z2 = true;
        }
        this.f38165i = i;
        m52378c(2);
        if (z2) {
            m52379b(i);
        }
    }

    /* renamed from: o */
    public final void m52366o() {
        this.f38161e = 0;
        this.f38162f = 0;
        this.f38163g.m52362a();
        this.f38164h = -1;
        this.f38165i = -1;
        this.f38166j = false;
        this.f38167k = false;
        this.f38169m = false;
        this.f38168l = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if ((this.f38161e != 1 || this.f38162f != 1) && i == 1) {
            m52364q(false);
        } else if (m52371j() && i == 2) {
            if (this.f38167k) {
                m52378c(2);
                this.f38166j = true;
            }
        } else {
            if (m52371j() && i == 0) {
                m52363r();
                if (!this.f38167k) {
                    int i2 = this.f38163g.f38170a;
                    if (i2 != -1) {
                        m52380a(i2, 0.0f, 0);
                    }
                } else {
                    C5217a c5217a = this.f38163g;
                    if (c5217a.f38172c == 0) {
                        int i3 = this.f38164h;
                        int i4 = c5217a.f38170a;
                        if (i3 != i4) {
                            m52379b(i4);
                        }
                    }
                }
                m52378c(0);
                m52366o();
            }
            if (this.f38161e == 2 && i == 0 && this.f38168l) {
                m52363r();
                C5217a c5217a2 = this.f38163g;
                if (c5217a2.f38172c == 0) {
                    int i5 = this.f38165i;
                    int i6 = c5217a2.f38170a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m52379b(i6);
                    }
                    m52378c(0);
                    m52366o();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r5 == r3.f38158b.m52423c()) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f38167k = r4
            r3.m52363r()
            boolean r0 = r3.f38166j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f38166j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f38158b
            boolean r6 = r6.m52423c()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.c$a r5 = r3.f38163g
            int r6 = r5.f38172c
            if (r6 == 0) goto L29
            int r5 = r5.f38170a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.c$a r5 = r3.f38163g
            int r5 = r5.f38170a
        L2d:
            r3.f38165i = r5
            int r6 = r3.f38164h
            if (r6 == r5) goto L45
            r3.m52379b(r5)
            goto L45
        L37:
            int r5 = r3.f38161e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.c$a r5 = r3.f38163g
            int r5 = r5.f38170a
            if (r5 != r1) goto L42
            r5 = 0
        L42:
            r3.m52379b(r5)
        L45:
            androidx.viewpager2.widget.c$a r5 = r3.f38163g
            int r6 = r5.f38170a
            if (r6 != r1) goto L4c
            r6 = 0
        L4c:
            float r0 = r5.f38171b
            int r5 = r5.f38172c
            r3.m52380a(r6, r0, r5)
            androidx.viewpager2.widget.c$a r5 = r3.f38163g
            int r6 = r5.f38170a
            int r0 = r3.f38165i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f38172c
            if (r5 != 0) goto L6b
            int r5 = r3.f38162f
            if (r5 == r4) goto L6b
            r3.m52378c(r2)
            r3.m52366o()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C5216c.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: p */
    public void m52365p(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f38157a = onPageChangeCallback;
    }

    /* renamed from: q */
    public final void m52364q(boolean z) {
        int i;
        this.f38169m = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.f38161e = i;
        int i2 = this.f38165i;
        if (i2 != -1) {
            this.f38164h = i2;
            this.f38165i = -1;
        } else if (this.f38164h == -1) {
            this.f38164h = m52377d();
        }
        m52378c(1);
    }

    /* renamed from: r */
    public final void m52363r() {
        int top;
        float f;
        C5217a c5217a = this.f38163g;
        int findFirstVisibleItemPosition = this.f38160d.findFirstVisibleItemPosition();
        c5217a.f38170a = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            c5217a.m52362a();
            return;
        }
        View findViewByPosition = this.f38160d.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            c5217a.m52362a();
            return;
        }
        int leftDecorationWidth = this.f38160d.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.f38160d.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.f38160d.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.f38160d.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f38160d.getOrientation() == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - this.f38159c.getPaddingLeft();
            if (this.f38158b.m52423c()) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - this.f38159c.getPaddingTop();
        }
        int i = -top;
        c5217a.f38172c = i;
        if (i < 0) {
            if (new C16943w4(this.f38160d).m924d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(c5217a.f38172c)));
        }
        if (height == 0) {
            f = 0.0f;
        } else {
            f = i / height;
        }
        c5217a.f38171b = f;
    }
}
