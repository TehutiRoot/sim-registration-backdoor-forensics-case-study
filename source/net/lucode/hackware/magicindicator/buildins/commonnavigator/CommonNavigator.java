package net.lucode.hackware.magicindicator.buildins.commonnavigator;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.NavigatorHelper;
import net.lucode.hackware.magicindicator.R;
import net.lucode.hackware.magicindicator.abs.IPagerNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* loaded from: classes6.dex */
public class CommonNavigator extends FrameLayout implements IPagerNavigator, NavigatorHelper.OnNavigatorScrollListener {

    /* renamed from: a */
    public HorizontalScrollView f72304a;

    /* renamed from: b */
    public LinearLayout f72305b;

    /* renamed from: c */
    public LinearLayout f72306c;

    /* renamed from: d */
    public IPagerIndicator f72307d;

    /* renamed from: e */
    public CommonNavigatorAdapter f72308e;

    /* renamed from: f */
    public NavigatorHelper f72309f;

    /* renamed from: g */
    public boolean f72310g;

    /* renamed from: h */
    public boolean f72311h;

    /* renamed from: i */
    public float f72312i;

    /* renamed from: j */
    public boolean f72313j;

    /* renamed from: k */
    public boolean f72314k;

    /* renamed from: l */
    public int f72315l;

    /* renamed from: m */
    public int f72316m;

    /* renamed from: n */
    public boolean f72317n;

    /* renamed from: o */
    public boolean f72318o;

    /* renamed from: p */
    public boolean f72319p;

    /* renamed from: q */
    public List f72320q;

    /* renamed from: r */
    public DataSetObserver f72321r;

    /* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator$a */
    /* loaded from: classes6.dex */
    public class C12382a extends DataSetObserver {
        public C12382a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            CommonNavigator.this.f72309f.setTotalCount(CommonNavigator.this.f72308e.getCount());
            CommonNavigator.this.m26088d();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    public CommonNavigator(Context context) {
        super(context);
        this.f72312i = 0.5f;
        this.f72313j = true;
        this.f72314k = true;
        this.f72319p = true;
        this.f72320q = new ArrayList();
        this.f72321r = new C12382a();
        NavigatorHelper navigatorHelper = new NavigatorHelper();
        this.f72309f = navigatorHelper;
        navigatorHelper.setNavigatorScrollListener(this);
    }

    /* renamed from: d */
    public final void m26088d() {
        View inflate;
        removeAllViews();
        if (this.f72310g) {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout_no_scroll, this);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout, this);
        }
        this.f72304a = (HorizontalScrollView) inflate.findViewById(R.id.scroll_view);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.title_container);
        this.f72305b = linearLayout;
        linearLayout.setPadding(this.f72316m, 0, this.f72315l, 0);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.indicator_container);
        this.f72306c = linearLayout2;
        if (this.f72317n) {
            linearLayout2.getParent().bringChildToFront(this.f72306c);
        }
        m26087e();
    }

    /* renamed from: e */
    public final void m26087e() {
        LinearLayout.LayoutParams layoutParams;
        int totalCount = this.f72309f.getTotalCount();
        for (int i = 0; i < totalCount; i++) {
            IPagerTitleView titleView = this.f72308e.getTitleView(getContext(), i);
            if (titleView instanceof View) {
                View view = (View) titleView;
                if (this.f72310g) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = this.f72308e.getTitleWeight(getContext(), i);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                this.f72305b.addView(view, layoutParams);
            }
        }
        CommonNavigatorAdapter commonNavigatorAdapter = this.f72308e;
        if (commonNavigatorAdapter != null) {
            IPagerIndicator indicator = commonNavigatorAdapter.getIndicator(getContext());
            this.f72307d = indicator;
            if (indicator instanceof View) {
                this.f72306c.addView((View) this.f72307d, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: f */
    public final void m26086f() {
        this.f72320q.clear();
        int totalCount = this.f72309f.getTotalCount();
        for (int i = 0; i < totalCount; i++) {
            PositionData positionData = new PositionData();
            View childAt = this.f72305b.getChildAt(i);
            if (childAt != null) {
                positionData.mLeft = childAt.getLeft();
                positionData.mTop = childAt.getTop();
                positionData.mRight = childAt.getRight();
                int bottom = childAt.getBottom();
                positionData.mBottom = bottom;
                if (childAt instanceof IMeasurablePagerTitleView) {
                    IMeasurablePagerTitleView iMeasurablePagerTitleView = (IMeasurablePagerTitleView) childAt;
                    positionData.mContentLeft = iMeasurablePagerTitleView.getContentLeft();
                    positionData.mContentTop = iMeasurablePagerTitleView.getContentTop();
                    positionData.mContentRight = iMeasurablePagerTitleView.getContentRight();
                    positionData.mContentBottom = iMeasurablePagerTitleView.getContentBottom();
                } else {
                    positionData.mContentLeft = positionData.mLeft;
                    positionData.mContentTop = positionData.mTop;
                    positionData.mContentRight = positionData.mRight;
                    positionData.mContentBottom = bottom;
                }
            }
            this.f72320q.add(positionData);
        }
    }

    public CommonNavigatorAdapter getAdapter() {
        return this.f72308e;
    }

    public int getLeftPadding() {
        return this.f72316m;
    }

    public IPagerIndicator getPagerIndicator() {
        return this.f72307d;
    }

    public IPagerTitleView getPagerTitleView(int i) {
        LinearLayout linearLayout = this.f72305b;
        if (linearLayout == null) {
            return null;
        }
        return (IPagerTitleView) linearLayout.getChildAt(i);
    }

    public int getRightPadding() {
        return this.f72315l;
    }

    public float getScrollPivotX() {
        return this.f72312i;
    }

    public LinearLayout getTitleContainer() {
        return this.f72305b;
    }

    public boolean isAdjustMode() {
        return this.f72310g;
    }

    public boolean isEnablePivotScroll() {
        return this.f72311h;
    }

    public boolean isFollowTouch() {
        return this.f72314k;
    }

    public boolean isIndicatorOnTop() {
        return this.f72317n;
    }

    public boolean isReselectWhenLayout() {
        return this.f72319p;
    }

    public boolean isSkimOver() {
        return this.f72318o;
    }

    public boolean isSmoothScroll() {
        return this.f72313j;
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void notifyDataSetChanged() {
        CommonNavigatorAdapter commonNavigatorAdapter = this.f72308e;
        if (commonNavigatorAdapter != null) {
            commonNavigatorAdapter.notifyDataSetChanged();
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onAttachToMagicIndicator() {
        m26088d();
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onDeselected(int i, int i2) {
        LinearLayout linearLayout = this.f72305b;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        if (childAt instanceof IPagerTitleView) {
            ((IPagerTitleView) childAt).onDeselected(i, i2);
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onDetachFromMagicIndicator() {
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onEnter(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f72305b;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        if (childAt instanceof IPagerTitleView) {
            ((IPagerTitleView) childAt).onEnter(i, i2, f, z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f72308e != null) {
            m26086f();
            IPagerIndicator iPagerIndicator = this.f72307d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPositionDataProvide(this.f72320q);
            }
            if (this.f72319p && this.f72309f.getScrollState() == 0) {
                onPageSelected(this.f72309f.getCurrentIndex());
                onPageScrolled(this.f72309f.getCurrentIndex(), 0.0f, 0);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onLeave(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f72305b;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        if (childAt instanceof IPagerTitleView) {
            ((IPagerTitleView) childAt).onLeave(i, i2, f, z);
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrollStateChanged(int i) {
        if (this.f72308e != null) {
            this.f72309f.onPageScrollStateChanged(i);
            IPagerIndicator iPagerIndicator = this.f72307d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPageScrollStateChanged(i);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f72308e != null) {
            this.f72309f.onPageScrolled(i, f, i2);
            IPagerIndicator iPagerIndicator = this.f72307d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPageScrolled(i, f, i2);
            }
            if (this.f72304a != null && this.f72320q.size() > 0 && i >= 0 && i < this.f72320q.size() && this.f72314k) {
                int min = Math.min(this.f72320q.size() - 1, i);
                int min2 = Math.min(this.f72320q.size() - 1, i + 1);
                float horizontalCenter = ((PositionData) this.f72320q.get(min)).horizontalCenter() - (this.f72304a.getWidth() * this.f72312i);
                this.f72304a.scrollTo((int) (horizontalCenter + (((((PositionData) this.f72320q.get(min2)).horizontalCenter() - (this.f72304a.getWidth() * this.f72312i)) - horizontalCenter) * f)), 0);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageSelected(int i) {
        if (this.f72308e != null) {
            this.f72309f.onPageSelected(i);
            IPagerIndicator iPagerIndicator = this.f72307d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPageSelected(i);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onSelected(int i, int i2) {
        LinearLayout linearLayout = this.f72305b;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        if (childAt instanceof IPagerTitleView) {
            ((IPagerTitleView) childAt).onSelected(i, i2);
        }
        if (!this.f72310g && !this.f72314k && this.f72304a != null && this.f72320q.size() > 0) {
            PositionData positionData = (PositionData) this.f72320q.get(Math.min(this.f72320q.size() - 1, i));
            if (this.f72311h) {
                float horizontalCenter = positionData.horizontalCenter() - (this.f72304a.getWidth() * this.f72312i);
                if (this.f72313j) {
                    this.f72304a.smoothScrollTo((int) horizontalCenter, 0);
                    return;
                } else {
                    this.f72304a.scrollTo((int) horizontalCenter, 0);
                    return;
                }
            }
            int scrollX = this.f72304a.getScrollX();
            int i3 = positionData.mLeft;
            if (scrollX > i3) {
                if (this.f72313j) {
                    this.f72304a.smoothScrollTo(i3, 0);
                    return;
                } else {
                    this.f72304a.scrollTo(i3, 0);
                    return;
                }
            }
            int scrollX2 = this.f72304a.getScrollX() + getWidth();
            int i4 = positionData.mRight;
            if (scrollX2 < i4) {
                if (this.f72313j) {
                    this.f72304a.smoothScrollTo(i4 - getWidth(), 0);
                } else {
                    this.f72304a.scrollTo(i4 - getWidth(), 0);
                }
            }
        }
    }

    public void setAdapter(CommonNavigatorAdapter commonNavigatorAdapter) {
        CommonNavigatorAdapter commonNavigatorAdapter2 = this.f72308e;
        if (commonNavigatorAdapter2 == commonNavigatorAdapter) {
            return;
        }
        if (commonNavigatorAdapter2 != null) {
            commonNavigatorAdapter2.unregisterDataSetObserver(this.f72321r);
        }
        this.f72308e = commonNavigatorAdapter;
        if (commonNavigatorAdapter != null) {
            commonNavigatorAdapter.registerDataSetObserver(this.f72321r);
            this.f72309f.setTotalCount(this.f72308e.getCount());
            if (this.f72305b != null) {
                this.f72308e.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.f72309f.setTotalCount(0);
        m26088d();
    }

    public void setAdjustMode(boolean z) {
        this.f72310g = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.f72311h = z;
    }

    public void setFollowTouch(boolean z) {
        this.f72314k = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.f72317n = z;
    }

    public void setLeftPadding(int i) {
        this.f72316m = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.f72319p = z;
    }

    public void setRightPadding(int i) {
        this.f72315l = i;
    }

    public void setScrollPivotX(float f) {
        this.f72312i = f;
    }

    public void setSkimOver(boolean z) {
        this.f72318o = z;
        this.f72309f.setSkimOver(z);
    }

    public void setSmoothScroll(boolean z) {
        this.f72313j = z;
    }
}
