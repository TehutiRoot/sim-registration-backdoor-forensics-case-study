package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.DecorView
/* loaded from: classes2.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: o */
    public static final int[] f37984o = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: p */
    public static final int[] f37985p = {16843660};

    /* renamed from: a */
    public ViewPager f37986a;

    /* renamed from: b */
    public TextView f37987b;

    /* renamed from: c */
    public TextView f37988c;

    /* renamed from: d */
    public TextView f37989d;

    /* renamed from: e */
    public int f37990e;

    /* renamed from: f */
    public float f37991f;

    /* renamed from: g */
    public int f37992g;

    /* renamed from: h */
    public int f37993h;

    /* renamed from: i */
    public boolean f37994i;

    /* renamed from: j */
    public boolean f37995j;

    /* renamed from: k */
    public final C5174a f37996k;

    /* renamed from: l */
    public WeakReference f37997l;

    /* renamed from: m */
    public int f37998m;

    /* renamed from: n */
    public int f37999n;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    /* loaded from: classes2.dex */
    public class C5174a extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {

        /* renamed from: a */
        public int f38000a;

        public C5174a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.m52497a(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.m52496b(pagerTitleStrip.f37986a.getCurrentItem(), PagerTitleStrip.this.f37986a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f37991f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo52495c(pagerTitleStrip2.f37986a.getCurrentItem(), f, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f38000a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo52495c(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f38000a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.m52496b(pagerTitleStrip.f37986a.getCurrentItem(), PagerTitleStrip.this.f37986a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f37991f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo52495c(pagerTitleStrip2.f37986a.getCurrentItem(), f, true);
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    /* loaded from: classes2.dex */
    public static class C5175b extends SingleLineTransformationMethod {

        /* renamed from: a */
        public Locale f38002a;

        public C5175b(Context context) {
            this.f38002a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f38002a);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C5175b(textView.getContext()));
    }

    /* renamed from: a */
    public void m52497a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.f37996k);
            this.f37997l = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.f37996k);
            this.f37997l = new WeakReference(pagerAdapter2);
        }
        ViewPager viewPager = this.f37986a;
        if (viewPager != null) {
            this.f37990e = -1;
            this.f37991f = -1.0f;
            m52496b(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void m52496b(int i, PagerAdapter pagerAdapter) {
        int i2;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (pagerAdapter != null) {
            i2 = pagerAdapter.getCount();
        } else {
            i2 = 0;
        }
        this.f37994i = true;
        CharSequence charSequence3 = null;
        if (i >= 1 && pagerAdapter != null) {
            charSequence = pagerAdapter.getPageTitle(i - 1);
        } else {
            charSequence = null;
        }
        this.f37987b.setText(charSequence);
        TextView textView = this.f37988c;
        if (pagerAdapter != null && i < i2) {
            charSequence2 = pagerAdapter.getPageTitle(i);
        } else {
            charSequence2 = null;
        }
        textView.setText(charSequence2);
        int i3 = i + 1;
        if (i3 < i2 && pagerAdapter != null) {
            charSequence3 = pagerAdapter.getPageTitle(i3);
        }
        this.f37989d.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f37987b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f37988c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f37989d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f37990e = i;
        if (!this.f37995j) {
            mo52495c(i, this.f37991f, false);
        }
        this.f37994i = false;
    }

    /* renamed from: c */
    public void mo52495c(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f37990e) {
            m52496b(i, this.f37986a.getAdapter());
        } else if (!z && f == this.f37991f) {
            return;
        }
        this.f37995j = true;
        int measuredWidth = this.f37987b.getMeasuredWidth();
        int measuredWidth2 = this.f37988c.getMeasuredWidth();
        int measuredWidth3 = this.f37989d.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f37987b.getBaseline();
        int baseline2 = this.f37988c.getBaseline();
        int baseline3 = this.f37989d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.f37987b.getMeasuredHeight() + i11, this.f37988c.getMeasuredHeight() + i12), this.f37989d.getMeasuredHeight() + i13);
        int i14 = this.f37993h & 112;
        if (i14 != 16) {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                TextView textView = this.f37988c;
                textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
                int min = Math.min(paddingLeft, (i9 - this.f37992g) - measuredWidth);
                TextView textView2 = this.f37987b;
                textView2.layout(min, i3, measuredWidth + min, textView2.getMeasuredHeight() + i3);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f37992g);
                TextView textView3 = this.f37989d;
                textView3.layout(max3, i5, max3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.f37991f = f;
                this.f37995j = false;
            }
            i2 = (height - paddingBottom) - max2;
        } else {
            i2 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.f37988c;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int min2 = Math.min(paddingLeft, (i9 - this.f37992g) - measuredWidth);
        TextView textView22 = this.f37987b;
        textView22.layout(min2, i3, measuredWidth + min2, textView22.getMeasuredHeight() + i3);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f37992g);
        TextView textView32 = this.f37989d;
        textView32.layout(max32, i5, max32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.f37991f = f;
        this.f37995j = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f37992g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        PagerAdapter pagerAdapter;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.m52487H(this.f37996k);
            viewPager.addOnAdapterChangeListener(this.f37996k);
            this.f37986a = viewPager;
            WeakReference weakReference = this.f37997l;
            if (weakReference != null) {
                pagerAdapter = (PagerAdapter) weakReference.get();
            } else {
                pagerAdapter = null;
            }
            m52497a(pagerAdapter, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f37986a;
        if (viewPager != null) {
            m52497a(viewPager.getAdapter(), null);
            this.f37986a.m52487H(null);
            this.f37986a.removeOnAdapterChangeListener(this.f37996k);
            this.f37986a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f37986a != null) {
            float f = this.f37991f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo52495c(this.f37990e, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
            this.f37987b.measure(childMeasureSpec2, childMeasureSpec);
            this.f37988c.measure(childMeasureSpec2, childMeasureSpec);
            this.f37989d.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                max = View.MeasureSpec.getSize(i2);
            } else {
                max = Math.max(getMinHeight(), this.f37988c.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(max, i2, this.f37988c.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f37994i) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f37993h = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f37998m = i;
        int i2 = (i << 24) | (this.f37999n & ViewCompat.MEASURED_SIZE_MASK);
        this.f37987b.setTextColor(i2);
        this.f37989d.setTextColor(i2);
    }

    public void setTextColor(@ColorInt int i) {
        this.f37999n = i;
        this.f37988c.setTextColor(i);
        int i2 = (this.f37998m << 24) | (this.f37999n & ViewCompat.MEASURED_SIZE_MASK);
        this.f37987b.setTextColor(i2);
        this.f37989d.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.f37987b.setTextSize(i, f);
        this.f37988c.setTextSize(i, f);
        this.f37989d.setTextSize(i, f);
    }

    public void setTextSpacing(int i) {
        this.f37992g = i;
        requestLayout();
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37990e = -1;
        this.f37991f = -1.0f;
        this.f37996k = new C5174a();
        TextView textView = new TextView(context);
        this.f37987b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f37988c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f37989d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f37984o);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.setTextAppearance(this.f37987b, resourceId);
            TextViewCompat.setTextAppearance(this.f37988c, resourceId);
            TextViewCompat.setTextAppearance(this.f37989d, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f37987b.setTextColor(color);
            this.f37988c.setTextColor(color);
            this.f37989d.setTextColor(color);
        }
        this.f37993h = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f37999n = this.f37988c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.f37987b;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f37988c.setEllipsize(truncateAt);
        this.f37989d.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f37985p);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f37987b);
            setSingleLineAllCaps(this.f37988c);
            setSingleLineAllCaps(this.f37989d);
        } else {
            this.f37987b.setSingleLine();
            this.f37988c.setSingleLine();
            this.f37989d.setSingleLine();
        }
        this.f37992g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
