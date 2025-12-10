package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.c */
/* loaded from: classes2.dex */
public final class C5198c extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public ViewPager2.OnPageChangeCallback f38245a;

    /* renamed from: b */
    public final ViewPager2 f38246b;

    /* renamed from: c */
    public final RecyclerView f38247c;

    /* renamed from: d */
    public final LinearLayoutManager f38248d;

    /* renamed from: e */
    public int f38249e;

    /* renamed from: f */
    public int f38250f;

    /* renamed from: g */
    public C5199a f38251g;

    /* renamed from: h */
    public int f38252h;

    /* renamed from: i */
    public int f38253i;

    /* renamed from: j */
    public boolean f38254j;

    /* renamed from: k */
    public boolean f38255k;

    /* renamed from: l */
    public boolean f38256l;

    /* renamed from: m */
    public boolean f38257m;

    /* renamed from: androidx.viewpager2.widget.c$a */
    /* loaded from: classes2.dex */
    public static final class C5199a {

        /* renamed from: a */
        public int f38258a;

        /* renamed from: b */
        public float f38259b;

        /* renamed from: c */
        public int f38260c;

        /* renamed from: a */
        public void m52314a() {
            this.f38258a = -1;
            this.f38259b = 0.0f;
            this.f38260c = 0;
        }
    }

    public C5198c(ViewPager2 viewPager2) {
        this.f38246b = viewPager2;
        RecyclerView recyclerView = viewPager2.f38210j;
        this.f38247c = recyclerView;
        this.f38248d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f38251g = new C5199a();
        m52318o();
    }

    /* renamed from: a */
    public final void m52332a(int i, float f, int i2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f38245a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: b */
    public final void m52331b(int i) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f38245a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i);
        }
    }

    /* renamed from: c */
    public final void m52330c(int i) {
        if ((this.f38249e == 3 && this.f38250f == 0) || this.f38250f == i) {
            return;
        }
        this.f38250f = i;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f38245a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i);
        }
    }

    /* renamed from: d */
    public final int m52329d() {
        return this.f38248d.findFirstVisibleItemPosition();
    }

    /* renamed from: e */
    public double m52328e() {
        m52315r();
        C5199a c5199a = this.f38251g;
        return c5199a.f38258a + c5199a.f38259b;
    }

    /* renamed from: f */
    public int m52327f() {
        return this.f38250f;
    }

    /* renamed from: g */
    public boolean m52326g() {
        if (this.f38250f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m52325h() {
        return this.f38257m;
    }

    /* renamed from: i */
    public boolean m52324i() {
        if (this.f38250f == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m52323j() {
        int i = this.f38249e;
        if (i == 1 || i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m52322k() {
        this.f38249e = 4;
        m52316q(true);
    }

    /* renamed from: l */
    public void m52321l() {
        this.f38256l = true;
    }

    /* renamed from: m */
    public void m52320m() {
        if (m52326g() && !this.f38257m) {
            return;
        }
        this.f38257m = false;
        m52315r();
        C5199a c5199a = this.f38251g;
        if (c5199a.f38260c == 0) {
            int i = c5199a.f38258a;
            if (i != this.f38252h) {
                m52331b(i);
            }
            m52330c(0);
            m52318o();
            return;
        }
        m52330c(2);
    }

    /* renamed from: n */
    public void m52319n(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f38249e = i2;
        boolean z2 = false;
        this.f38257m = false;
        if (this.f38253i != i) {
            z2 = true;
        }
        this.f38253i = i;
        m52330c(2);
        if (z2) {
            m52331b(i);
        }
    }

    /* renamed from: o */
    public final void m52318o() {
        this.f38249e = 0;
        this.f38250f = 0;
        this.f38251g.m52314a();
        this.f38252h = -1;
        this.f38253i = -1;
        this.f38254j = false;
        this.f38255k = false;
        this.f38257m = false;
        this.f38256l = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if ((this.f38249e != 1 || this.f38250f != 1) && i == 1) {
            m52316q(false);
        } else if (m52323j() && i == 2) {
            if (this.f38255k) {
                m52330c(2);
                this.f38254j = true;
            }
        } else {
            if (m52323j() && i == 0) {
                m52315r();
                if (!this.f38255k) {
                    int i2 = this.f38251g.f38258a;
                    if (i2 != -1) {
                        m52332a(i2, 0.0f, 0);
                    }
                } else {
                    C5199a c5199a = this.f38251g;
                    if (c5199a.f38260c == 0) {
                        int i3 = this.f38252h;
                        int i4 = c5199a.f38258a;
                        if (i3 != i4) {
                            m52331b(i4);
                        }
                    }
                }
                m52330c(0);
                m52318o();
            }
            if (this.f38249e == 2 && i == 0 && this.f38256l) {
                m52315r();
                C5199a c5199a2 = this.f38251g;
                if (c5199a2.f38260c == 0) {
                    int i5 = this.f38253i;
                    int i6 = c5199a2.f38258a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m52331b(i6);
                    }
                    m52330c(0);
                    m52318o();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r5 == r3.f38246b.m52375c()) goto L31;
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
            r3.f38255k = r4
            r3.m52315r()
            boolean r0 = r3.f38254j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f38254j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f38246b
            boolean r6 = r6.m52375c()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.c$a r5 = r3.f38251g
            int r6 = r5.f38260c
            if (r6 == 0) goto L29
            int r5 = r5.f38258a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.c$a r5 = r3.f38251g
            int r5 = r5.f38258a
        L2d:
            r3.f38253i = r5
            int r6 = r3.f38252h
            if (r6 == r5) goto L45
            r3.m52331b(r5)
            goto L45
        L37:
            int r5 = r3.f38249e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.c$a r5 = r3.f38251g
            int r5 = r5.f38258a
            if (r5 != r1) goto L42
            r5 = 0
        L42:
            r3.m52331b(r5)
        L45:
            androidx.viewpager2.widget.c$a r5 = r3.f38251g
            int r6 = r5.f38258a
            if (r6 != r1) goto L4c
            r6 = 0
        L4c:
            float r0 = r5.f38259b
            int r5 = r5.f38260c
            r3.m52332a(r6, r0, r5)
            androidx.viewpager2.widget.c$a r5 = r3.f38251g
            int r6 = r5.f38258a
            int r0 = r3.f38253i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f38260c
            if (r5 != 0) goto L6b
            int r5 = r3.f38250f
            if (r5 == r4) goto L6b
            r3.m52330c(r2)
            r3.m52318o()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C5198c.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: p */
    public void m52317p(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.f38245a = onPageChangeCallback;
    }

    /* renamed from: q */
    public final void m52316q(boolean z) {
        int i;
        this.f38257m = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.f38249e = i;
        int i2 = this.f38253i;
        if (i2 != -1) {
            this.f38252h = i2;
            this.f38253i = -1;
        } else if (this.f38252h == -1) {
            this.f38252h = m52329d();
        }
        m52330c(1);
    }

    /* renamed from: r */
    public final void m52315r() {
        int top;
        float f;
        C5199a c5199a = this.f38251g;
        int findFirstVisibleItemPosition = this.f38248d.findFirstVisibleItemPosition();
        c5199a.f38258a = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            c5199a.m52314a();
            return;
        }
        View findViewByPosition = this.f38248d.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            c5199a.m52314a();
            return;
        }
        int leftDecorationWidth = this.f38248d.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.f38248d.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.f38248d.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.f38248d.getBottomDecorationHeight(findViewByPosition);
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
        if (this.f38248d.getOrientation() == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - this.f38247c.getPaddingLeft();
            if (this.f38246b.m52375c()) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - this.f38247c.getPaddingTop();
        }
        int i = -top;
        c5199a.f38260c = i;
        if (i < 0) {
            if (new C16953w4(this.f38248d).m806d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(c5199a.f38260c)));
        }
        if (height == 0) {
            f = 0.0f;
        } else {
            f = i / height;
        }
        c5199a.f38259b = f;
    }
}