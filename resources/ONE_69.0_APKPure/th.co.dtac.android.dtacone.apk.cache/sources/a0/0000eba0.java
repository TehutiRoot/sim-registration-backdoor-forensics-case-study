package net.lucode.hackware.magicindicator;

import androidx.viewpager.widget.ViewPager;

/* loaded from: classes6.dex */
public class ViewPagerHelper {

    /* renamed from: net.lucode.hackware.magicindicator.ViewPagerHelper$a */
    /* loaded from: classes6.dex */
    public static class C12378a implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public final /* synthetic */ MagicIndicator f72409a;

        public C12378a(MagicIndicator magicIndicator) {
            this.f72409a = magicIndicator;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f72409a.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            this.f72409a.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            this.f72409a.onPageSelected(i);
        }
    }

    public static void bind(MagicIndicator magicIndicator, ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new C12378a(magicIndicator));
    }
}