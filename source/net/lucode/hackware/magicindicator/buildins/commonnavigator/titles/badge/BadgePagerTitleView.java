package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;

/* loaded from: classes6.dex */
public class BadgePagerTitleView extends FrameLayout implements IMeasurablePagerTitleView {

    /* renamed from: a */
    public IPagerTitleView f72385a;

    /* renamed from: b */
    public View f72386b;

    /* renamed from: c */
    public boolean f72387c;

    /* renamed from: d */
    public BadgeRule f72388d;

    /* renamed from: e */
    public BadgeRule f72389e;

    public BadgePagerTitleView(Context context) {
        super(context);
        this.f72387c = true;
    }

    public View getBadgeView() {
        return this.f72386b;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentBottom() {
        IPagerTitleView iPagerTitleView = this.f72385a;
        if (iPagerTitleView instanceof IMeasurablePagerTitleView) {
            return ((IMeasurablePagerTitleView) iPagerTitleView).getContentBottom();
        }
        return getBottom();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentLeft() {
        if (this.f72385a instanceof IMeasurablePagerTitleView) {
            return getLeft() + ((IMeasurablePagerTitleView) this.f72385a).getContentLeft();
        }
        return getLeft();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentRight() {
        if (this.f72385a instanceof IMeasurablePagerTitleView) {
            return getLeft() + ((IMeasurablePagerTitleView) this.f72385a).getContentRight();
        }
        return getRight();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IMeasurablePagerTitleView
    public int getContentTop() {
        IPagerTitleView iPagerTitleView = this.f72385a;
        if (iPagerTitleView instanceof IMeasurablePagerTitleView) {
            return ((IMeasurablePagerTitleView) iPagerTitleView).getContentTop();
        }
        return getTop();
    }

    public IPagerTitleView getInnerPagerTitleView() {
        return this.f72385a;
    }

    public BadgeRule getXBadgeRule() {
        return this.f72388d;
    }

    public BadgeRule getYBadgeRule() {
        return this.f72389e;
    }

    public boolean isAutoCancelBadge() {
        return this.f72387c;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onDeselected(int i, int i2) {
        IPagerTitleView iPagerTitleView = this.f72385a;
        if (iPagerTitleView != null) {
            iPagerTitleView.onDeselected(i, i2);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onEnter(int i, int i2, float f, boolean z) {
        IPagerTitleView iPagerTitleView = this.f72385a;
        if (iPagerTitleView != null) {
            iPagerTitleView.onEnter(i, i2, f, z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        IPagerTitleView iPagerTitleView = this.f72385a;
        if ((iPagerTitleView instanceof View) && this.f72386b != null) {
            int[] iArr = new int[14];
            View view = (View) iPagerTitleView;
            iArr[0] = view.getLeft();
            iArr[1] = view.getTop();
            iArr[2] = view.getRight();
            iArr[3] = view.getBottom();
            IPagerTitleView iPagerTitleView2 = this.f72385a;
            if (iPagerTitleView2 instanceof IMeasurablePagerTitleView) {
                IMeasurablePagerTitleView iMeasurablePagerTitleView = (IMeasurablePagerTitleView) iPagerTitleView2;
                iArr[4] = iMeasurablePagerTitleView.getContentLeft();
                iArr[5] = iMeasurablePagerTitleView.getContentTop();
                iArr[6] = iMeasurablePagerTitleView.getContentRight();
                iArr[7] = iMeasurablePagerTitleView.getContentBottom();
            } else {
                for (int i5 = 4; i5 < 8; i5++) {
                    iArr[i5] = iArr[i5 - 4];
                }
            }
            iArr[8] = view.getWidth() / 2;
            iArr[9] = view.getHeight() / 2;
            iArr[10] = iArr[4] / 2;
            iArr[11] = iArr[5] / 2;
            int i6 = iArr[6];
            iArr[12] = i6 + ((iArr[2] - i6) / 2);
            int i7 = iArr[7];
            iArr[13] = i7 + ((iArr[3] - i7) / 2);
            BadgeRule badgeRule = this.f72388d;
            if (badgeRule != null) {
                int offset = iArr[badgeRule.getAnchor().ordinal()] + this.f72388d.getOffset();
                View view2 = this.f72386b;
                view2.offsetLeftAndRight(offset - view2.getLeft());
            }
            BadgeRule badgeRule2 = this.f72389e;
            if (badgeRule2 != null) {
                int offset2 = iArr[badgeRule2.getAnchor().ordinal()] + this.f72389e.getOffset();
                View view3 = this.f72386b;
                view3.offsetTopAndBottom(offset2 - view3.getTop());
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onLeave(int i, int i2, float f, boolean z) {
        IPagerTitleView iPagerTitleView = this.f72385a;
        if (iPagerTitleView != null) {
            iPagerTitleView.onLeave(i, i2, f, z);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView
    public void onSelected(int i, int i2) {
        IPagerTitleView iPagerTitleView = this.f72385a;
        if (iPagerTitleView != null) {
            iPagerTitleView.onSelected(i, i2);
        }
        if (this.f72387c) {
            setBadgeView(null);
        }
    }

    public void setAutoCancelBadge(boolean z) {
        this.f72387c = z;
    }

    public void setBadgeView(View view) {
        if (this.f72386b == view) {
            return;
        }
        this.f72386b = view;
        removeAllViews();
        if (this.f72385a instanceof View) {
            addView((View) this.f72385a, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.f72386b != null) {
            addView(this.f72386b, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setInnerPagerTitleView(IPagerTitleView iPagerTitleView) {
        if (this.f72385a == iPagerTitleView) {
            return;
        }
        this.f72385a = iPagerTitleView;
        removeAllViews();
        if (this.f72385a instanceof View) {
            addView((View) this.f72385a, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.f72386b != null) {
            addView(this.f72386b, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public void setXBadgeRule(BadgeRule badgeRule) {
        BadgeAnchor anchor;
        if (badgeRule != null && (anchor = badgeRule.getAnchor()) != BadgeAnchor.LEFT && anchor != BadgeAnchor.RIGHT && anchor != BadgeAnchor.CONTENT_LEFT && anchor != BadgeAnchor.CONTENT_RIGHT && anchor != BadgeAnchor.CENTER_X && anchor != BadgeAnchor.LEFT_EDGE_CENTER_X && anchor != BadgeAnchor.RIGHT_EDGE_CENTER_X) {
            throw new IllegalArgumentException("x badge rule is wrong.");
        }
        this.f72388d = badgeRule;
    }

    public void setYBadgeRule(BadgeRule badgeRule) {
        BadgeAnchor anchor;
        if (badgeRule != null && (anchor = badgeRule.getAnchor()) != BadgeAnchor.TOP && anchor != BadgeAnchor.BOTTOM && anchor != BadgeAnchor.CONTENT_TOP && anchor != BadgeAnchor.CONTENT_BOTTOM && anchor != BadgeAnchor.CENTER_Y && anchor != BadgeAnchor.TOP_EDGE_CENTER_Y && anchor != BadgeAnchor.BOTTOM_EDGE_CENTER_Y) {
            throw new IllegalArgumentException("y badge rule is wrong.");
        }
        this.f72389e = badgeRule;
    }
}
