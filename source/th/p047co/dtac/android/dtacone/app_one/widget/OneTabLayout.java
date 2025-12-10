package th.p047co.dtac.android.dtacone.app_one.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTabLayout */
/* loaded from: classes7.dex */
public class OneTabLayout extends TabLayout {

    /* renamed from: c0 */
    public int f82840c0;

    /* renamed from: d0 */
    public int f82841d0;

    /* renamed from: e0 */
    public int f82842e0;

    /* renamed from: f0 */
    public int f82843f0;

    /* renamed from: g0 */
    public Typeface f82844g0;

    public OneTabLayout(Context context) {
        super(context);
        this.f82840c0 = R.drawable.one_tab_single_active;
        this.f82841d0 = R.drawable.one_selector_tab_left;
        this.f82842e0 = R.drawable.one_selector_tab_center;
        this.f82843f0 = R.drawable.one_selector_tab_right;
        m19885F(context);
    }

    /* renamed from: F */
    public final void m19885F(Context context) {
        this.f82844g0 = ResourcesCompat.getFont(context, R.font.one_font_style);
    }

    public void applyTheme(TabLayout tabLayout, int i) {
        if (i == 1) {
            View childAt = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(0);
            ViewCompat.setBackground(childAt, AppCompatResources.getDrawable(childAt.getContext(), this.f82840c0));
            return;
        }
        int i2 = i - 1;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt2 = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(i3);
            if (childAt2 != null) {
                if (i3 == 0) {
                    ViewCompat.setBackground(childAt2, AppCompatResources.getDrawable(childAt2.getContext(), this.f82841d0));
                } else if (i3 == i2) {
                    ViewCompat.setBackground(childAt2, AppCompatResources.getDrawable(childAt2.getContext(), this.f82843f0));
                } else {
                    ViewCompat.setBackground(childAt2, AppCompatResources.getDrawable(childAt2.getContext(), this.f82842e0));
                }
            }
        }
    }

    public void setTabViewBgCenter(int i) {
        this.f82842e0 = i;
    }

    public void setTabViewBgLeft(int i) {
        this.f82841d0 = i;
    }

    public void setTabViewBgRight(int i) {
        this.f82843f0 = i;
    }

    public void setTabViewBgSingle(int i) {
        this.f82840c0 = i;
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        super.setupWithViewPager(viewPager);
        removeAllTabs();
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        PagerAdapter adapter = viewPager != null ? viewPager.getAdapter() : null;
        int count = adapter != null ? adapter.getCount() : 0;
        for (int i = 0; i < count; i++) {
            addTab(newTab().setText(adapter.getPageTitle(i)));
            TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(i)).getChildAt(1);
            textView.setPadding(2, 0, 2, 0);
            textView.setTextSize(1, getResources().getDimension(R.dimen.sp14));
            textView.setTypeface(this.f82844g0);
        }
    }

    public OneTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82840c0 = R.drawable.one_tab_single_active;
        this.f82841d0 = R.drawable.one_selector_tab_left;
        this.f82842e0 = R.drawable.one_selector_tab_center;
        this.f82843f0 = R.drawable.one_selector_tab_right;
        m19885F(context);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager, Float f) {
        super.setupWithViewPager(viewPager);
        removeAllTabs();
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        PagerAdapter adapter = viewPager != null ? viewPager.getAdapter() : null;
        int count = adapter != null ? adapter.getCount() : 0;
        for (int i = 0; i < count; i++) {
            addTab(newTab().setText(adapter.getPageTitle(i)));
            TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(i)).getChildAt(1);
            textView.setPadding(2, 0, 2, 0);
            textView.setTextSize(1, f.floatValue());
            textView.setTypeface(this.f82844g0);
        }
    }

    public OneTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f82840c0 = R.drawable.one_tab_single_active;
        this.f82841d0 = R.drawable.one_selector_tab_left;
        this.f82842e0 = R.drawable.one_selector_tab_center;
        this.f82843f0 = R.drawable.one_selector_tab_right;
        m19885F(context);
    }
}
