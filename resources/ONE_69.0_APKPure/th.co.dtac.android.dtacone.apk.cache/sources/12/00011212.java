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
    public int f82932c0;

    /* renamed from: d0 */
    public int f82933d0;

    /* renamed from: e0 */
    public int f82934e0;

    /* renamed from: f0 */
    public int f82935f0;

    /* renamed from: g0 */
    public Typeface f82936g0;

    public OneTabLayout(Context context) {
        super(context);
        this.f82932c0 = R.drawable.one_tab_single_active;
        this.f82933d0 = R.drawable.one_selector_tab_left;
        this.f82934e0 = R.drawable.one_selector_tab_center;
        this.f82935f0 = R.drawable.one_selector_tab_right;
        m20060F(context);
    }

    /* renamed from: F */
    public final void m20060F(Context context) {
        this.f82936g0 = ResourcesCompat.getFont(context, R.font.one_font_style);
    }

    public void applyTheme(TabLayout tabLayout, int i) {
        if (i == 1) {
            View childAt = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(0);
            ViewCompat.setBackground(childAt, AppCompatResources.getDrawable(childAt.getContext(), this.f82932c0));
            return;
        }
        int i2 = i - 1;
        for (int i3 = 0; i3 < i; i3++) {
            View childAt2 = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(i3);
            if (childAt2 != null) {
                if (i3 == 0) {
                    ViewCompat.setBackground(childAt2, AppCompatResources.getDrawable(childAt2.getContext(), this.f82933d0));
                } else if (i3 == i2) {
                    ViewCompat.setBackground(childAt2, AppCompatResources.getDrawable(childAt2.getContext(), this.f82935f0));
                } else {
                    ViewCompat.setBackground(childAt2, AppCompatResources.getDrawable(childAt2.getContext(), this.f82934e0));
                }
            }
        }
    }

    public void setTabViewBgCenter(int i) {
        this.f82934e0 = i;
    }

    public void setTabViewBgLeft(int i) {
        this.f82933d0 = i;
    }

    public void setTabViewBgRight(int i) {
        this.f82935f0 = i;
    }

    public void setTabViewBgSingle(int i) {
        this.f82932c0 = i;
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
            textView.setTypeface(this.f82936g0);
        }
    }

    public OneTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82932c0 = R.drawable.one_tab_single_active;
        this.f82933d0 = R.drawable.one_selector_tab_left;
        this.f82934e0 = R.drawable.one_selector_tab_center;
        this.f82935f0 = R.drawable.one_selector_tab_right;
        m20060F(context);
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
            textView.setTypeface(this.f82936g0);
        }
    }

    public OneTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f82932c0 = R.drawable.one_tab_single_active;
        this.f82933d0 = R.drawable.one_selector_tab_left;
        this.f82934e0 = R.drawable.one_selector_tab_center;
        this.f82935f0 = R.drawable.one_selector_tab_right;
        m20060F(context);
    }
}