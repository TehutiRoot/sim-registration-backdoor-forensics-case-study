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
    public HorizontalScrollView f72426a;

    /* renamed from: b */
    public LinearLayout f72427b;

    /* renamed from: c */
    public LinearLayout f72428c;

    /* renamed from: d */
    public IPagerIndicator f72429d;

    /* renamed from: e */
    public CommonNavigatorAdapter f72430e;

    /* renamed from: f */
    public NavigatorHelper f72431f;

    /* renamed from: g */
    public boolean f72432g;

    /* renamed from: h */
    public boolean f72433h;

    /* renamed from: i */
    public float f72434i;

    /* renamed from: j */
    public boolean f72435j;

    /* renamed from: k */
    public boolean f72436k;

    /* renamed from: l */
    public int f72437l;

    /* renamed from: m */
    public int f72438m;

    /* renamed from: n */
    public boolean f72439n;

    /* renamed from: o */
    public boolean f72440o;

    /* renamed from: p */
    public boolean f72441p;

    /* renamed from: q */
    public List f72442q;

    /* renamed from: r */
    public DataSetObserver f72443r;

    /* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator$a */
    /* loaded from: classes6.dex */
    public class C12379a extends DataSetObserver {
        public C12379a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            CommonNavigator.this.f72431f.setTotalCount(CommonNavigator.this.f72430e.getCount());
            CommonNavigator.this.m26348d();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    public CommonNavigator(Context context) {
        super(context);
        this.f72434i = 0.5f;
        this.f72435j = true;
        this.f72436k = true;
        this.f72441p = true;
        this.f72442q = new ArrayList();
        this.f72443r = new C12379a();
        NavigatorHelper navigatorHelper = new NavigatorHelper();
        this.f72431f = navigatorHelper;
        navigatorHelper.setNavigatorScrollListener(this);
    }

    /* renamed from: d */
    public final void m26348d() {
        View inflate;
        removeAllViews();
        if (this.f72432g) {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout_no_scroll, this);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout, this);
        }
        this.f72426a = (HorizontalScrollView) inflate.findViewById(R.id.scroll_view);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.title_container);
        this.f72427b = linearLayout;
        linearLayout.setPadding(this.f72438m, 0, this.f72437l, 0);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.indicator_container);
        this.f72428c = linearLayout2;
        if (this.f72439n) {
            linearLayout2.getParent().bringChildToFront(this.f72428c);
        }
        m26347e();
    }

    /* renamed from: e */
    public final void m26347e() {
        LinearLayout.LayoutParams layoutParams;
        int totalCount = this.f72431f.getTotalCount();
        for (int i = 0; i < totalCount; i++) {
            IPagerTitleView titleView = this.f72430e.getTitleView(getContext(), i);
            if (titleView instanceof View) {
                View view = (View) titleView;
                if (this.f72432g) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = this.f72430e.getTitleWeight(getContext(), i);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                this.f72427b.addView(view, layoutParams);
            }
        }
        CommonNavigatorAdapter commonNavigatorAdapter = this.f72430e;
        if (commonNavigatorAdapter != null) {
            IPagerIndicator indicator = commonNavigatorAdapter.getIndicator(getContext());
            this.f72429d = indicator;
            if (indicator instanceof View) {
                this.f72428c.addView((View) this.f72429d, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: f */
    public final void m26346f() {
        this.f72442q.clear();
        int totalCount = this.f72431f.getTotalCount();
        for (int i = 0; i < totalCount; i++) {
            PositionData positionData = new PositionData();
            View childAt = this.f72427b.getChildAt(i);
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
            this.f72442q.add(positionData);
        }
    }

    public CommonNavigatorAdapter getAdapter() {
        return this.f72430e;
    }

    public int getLeftPadding() {
        return this.f72438m;
    }

    public IPagerIndicator getPagerIndicator() {
        return this.f72429d;
    }

    public IPagerTitleView getPagerTitleView(int i) {
        LinearLayout linearLayout = this.f72427b;
        if (linearLayout == null) {
            return null;
        }
        return (IPagerTitleView) linearLayout.getChildAt(i);
    }

    public int getRightPadding() {
        return this.f72437l;
    }

    public float getScrollPivotX() {
        return this.f72434i;
    }

    public LinearLayout getTitleContainer() {
        return this.f72427b;
    }

    public boolean isAdjustMode() {
        return this.f72432g;
    }

    public boolean isEnablePivotScroll() {
        return this.f72433h;
    }

    public boolean isFollowTouch() {
        return this.f72436k;
    }

    public boolean isIndicatorOnTop() {
        return this.f72439n;
    }

    public boolean isReselectWhenLayout() {
        return this.f72441p;
    }

    public boolean isSkimOver() {
        return this.f72440o;
    }

    public boolean isSmoothScroll() {
        return this.f72435j;
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void notifyDataSetChanged() {
        CommonNavigatorAdapter commonNavigatorAdapter = this.f72430e;
        if (commonNavigatorAdapter != null) {
            commonNavigatorAdapter.notifyDataSetChanged();
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onAttachToMagicIndicator() {
        m26348d();
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onDeselected(int i, int i2) {
        LinearLayout linearLayout = this.f72427b;
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
        LinearLayout linearLayout = this.f72427b;
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
        if (this.f72430e != null) {
            m26346f();
            IPagerIndicator iPagerIndicator = this.f72429d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPositionDataProvide(this.f72442q);
            }
            if (this.f72441p && this.f72431f.getScrollState() == 0) {
                onPageSelected(this.f72431f.getCurrentIndex());
                onPageScrolled(this.f72431f.getCurrentIndex(), 0.0f, 0);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onLeave(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f72427b;
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
        if (this.f72430e != null) {
            this.f72431f.onPageScrollStateChanged(i);
            IPagerIndicator iPagerIndicator = this.f72429d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPageScrollStateChanged(i);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f72430e != null) {
            this.f72431f.onPageScrolled(i, f, i2);
            IPagerIndicator iPagerIndicator = this.f72429d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPageScrolled(i, f, i2);
            }
            if (this.f72426a != null && this.f72442q.size() > 0 && i >= 0 && i < this.f72442q.size() && this.f72436k) {
                int min = Math.min(this.f72442q.size() - 1, i);
                int min2 = Math.min(this.f72442q.size() - 1, i + 1);
                float horizontalCenter = ((PositionData) this.f72442q.get(min)).horizontalCenter() - (this.f72426a.getWidth() * this.f72434i);
                this.f72426a.scrollTo((int) (horizontalCenter + (((((PositionData) this.f72442q.get(min2)).horizontalCenter() - (this.f72426a.getWidth() * this.f72434i)) - horizontalCenter) * f)), 0);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageSelected(int i) {
        if (this.f72430e != null) {
            this.f72431f.onPageSelected(i);
            IPagerIndicator iPagerIndicator = this.f72429d;
            if (iPagerIndicator != null) {
                iPagerIndicator.onPageSelected(i);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onSelected(int i, int i2) {
        LinearLayout linearLayout = this.f72427b;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        if (childAt instanceof IPagerTitleView) {
            ((IPagerTitleView) childAt).onSelected(i, i2);
        }
        if (!this.f72432g && !this.f72436k && this.f72426a != null && this.f72442q.size() > 0) {
            PositionData positionData = (PositionData) this.f72442q.get(Math.min(this.f72442q.size() - 1, i));
            if (this.f72433h) {
                float horizontalCenter = positionData.horizontalCenter() - (this.f72426a.getWidth() * this.f72434i);
                if (this.f72435j) {
                    this.f72426a.smoothScrollTo((int) horizontalCenter, 0);
                    return;
                } else {
                    this.f72426a.scrollTo((int) horizontalCenter, 0);
                    return;
                }
            }
            int scrollX = this.f72426a.getScrollX();
            int i3 = positionData.mLeft;
            if (scrollX > i3) {
                if (this.f72435j) {
                    this.f72426a.smoothScrollTo(i3, 0);
                    return;
                } else {
                    this.f72426a.scrollTo(i3, 0);
                    return;
                }
            }
            int scrollX2 = this.f72426a.getScrollX() + getWidth();
            int i4 = positionData.mRight;
            if (scrollX2 < i4) {
                if (this.f72435j) {
                    this.f72426a.smoothScrollTo(i4 - getWidth(), 0);
                } else {
                    this.f72426a.scrollTo(i4 - getWidth(), 0);
                }
            }
        }
    }

    public void setAdapter(CommonNavigatorAdapter commonNavigatorAdapter) {
        CommonNavigatorAdapter commonNavigatorAdapter2 = this.f72430e;
        if (commonNavigatorAdapter2 == commonNavigatorAdapter) {
            return;
        }
        if (commonNavigatorAdapter2 != null) {
            commonNavigatorAdapter2.unregisterDataSetObserver(this.f72443r);
        }
        this.f72430e = commonNavigatorAdapter;
        if (commonNavigatorAdapter != null) {
            commonNavigatorAdapter.registerDataSetObserver(this.f72443r);
            this.f72431f.setTotalCount(this.f72430e.getCount());
            if (this.f72427b != null) {
                this.f72430e.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.f72431f.setTotalCount(0);
        m26348d();
    }

    public void setAdjustMode(boolean z) {
        this.f72432g = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.f72433h = z;
    }

    public void setFollowTouch(boolean z) {
        this.f72436k = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.f72439n = z;
    }

    public void setLeftPadding(int i) {
        this.f72438m = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.f72441p = z;
    }

    public void setRightPadding(int i) {
        this.f72437l = i;
    }

    public void setScrollPivotX(float f) {
        this.f72434i = f;
    }

    public void setSkimOver(boolean z) {
        this.f72440o = z;
        this.f72431f.setSkimOver(z);
    }

    public void setSmoothScroll(boolean z) {
        this.f72435j = z;
    }
}