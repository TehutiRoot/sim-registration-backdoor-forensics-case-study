package net.lucode.hackware.magicindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import net.lucode.hackware.magicindicator.abs.IPagerNavigator;

/* loaded from: classes6.dex */
public class MagicIndicator extends FrameLayout {

    /* renamed from: a */
    public IPagerNavigator f72277a;

    public MagicIndicator(Context context) {
        super(context);
    }

    public IPagerNavigator getNavigator() {
        return this.f72277a;
    }

    public void onPageScrollStateChanged(int i) {
        IPagerNavigator iPagerNavigator = this.f72277a;
        if (iPagerNavigator != null) {
            iPagerNavigator.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        IPagerNavigator iPagerNavigator = this.f72277a;
        if (iPagerNavigator != null) {
            iPagerNavigator.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        IPagerNavigator iPagerNavigator = this.f72277a;
        if (iPagerNavigator != null) {
            iPagerNavigator.onPageSelected(i);
        }
    }

    public void setNavigator(IPagerNavigator iPagerNavigator) {
        IPagerNavigator iPagerNavigator2 = this.f72277a;
        if (iPagerNavigator2 == iPagerNavigator) {
            return;
        }
        if (iPagerNavigator2 != null) {
            iPagerNavigator2.onDetachFromMagicIndicator();
        }
        this.f72277a = iPagerNavigator;
        removeAllViews();
        if (this.f72277a instanceof View) {
            addView((View) this.f72277a, new FrameLayout.LayoutParams(-1, -1));
            this.f72277a.onAttachToMagicIndicator();
        }
    }

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
