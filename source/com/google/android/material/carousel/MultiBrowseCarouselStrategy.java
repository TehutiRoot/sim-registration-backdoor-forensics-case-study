package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.carousel.C6869a;

/* loaded from: classes4.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {

    /* renamed from: b */
    public static final int[] f49392b = {1};

    /* renamed from: c */
    public static final int[] f49393c = {1, 0};

    /* renamed from: d */
    public static final int[] f49394d = {0};

    /* renamed from: a */
    public final boolean f49395a;

    /* renamed from: com.google.android.material.carousel.MultiBrowseCarouselStrategy$a */
    /* loaded from: classes4.dex */
    public static final class C6868a {

        /* renamed from: a */
        public final int f49396a;

        /* renamed from: b */
        public float f49397b;

        /* renamed from: c */
        public final int f49398c;

        /* renamed from: d */
        public final int f49399d;

        /* renamed from: e */
        public float f49400e;

        /* renamed from: f */
        public float f49401f;

        /* renamed from: g */
        public final int f49402g;

        /* renamed from: h */
        public final float f49403h;

        public C6868a(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
            this.f49396a = i;
            this.f49397b = MathUtils.clamp(f, f2, f3);
            this.f49398c = i2;
            this.f49400e = f4;
            this.f49399d = i3;
            this.f49401f = f5;
            this.f49402g = i4;
            m45479c(f6, f2, f3, f5);
            this.f49403h = m45480b(f5);
        }

        /* renamed from: a */
        public final float m45481a(float f, int i, float f2, int i2, int i3) {
            if (i <= 0) {
                f2 = 0.0f;
            }
            float f3 = i2 / 2.0f;
            return (f - ((i + f3) * f2)) / (i3 + f3);
        }

        /* renamed from: b */
        public final float m45480b(float f) {
            if (!m45477e()) {
                return Float.MAX_VALUE;
            }
            return Math.abs(f - this.f49401f) * this.f49396a;
        }

        /* renamed from: c */
        public final void m45479c(float f, float f2, float f3, float f4) {
            float m45478d = f - m45478d();
            int i = this.f49398c;
            if (i > 0 && m45478d > 0.0f) {
                float f5 = this.f49397b;
                this.f49397b = f5 + Math.min(m45478d / i, f3 - f5);
            } else if (i > 0 && m45478d < 0.0f) {
                float f6 = this.f49397b;
                this.f49397b = f6 + Math.max(m45478d / i, f2 - f6);
            }
            float m45481a = m45481a(f, this.f49398c, this.f49397b, this.f49399d, this.f49402g);
            this.f49401f = m45481a;
            float f7 = (this.f49397b + m45481a) / 2.0f;
            this.f49400e = f7;
            int i2 = this.f49399d;
            if (i2 > 0 && m45481a != f4) {
                float f8 = (f4 - m45481a) * this.f49402g;
                float min = Math.min(Math.abs(f8), f7 * 0.1f * i2);
                if (f8 > 0.0f) {
                    this.f49400e -= min / this.f49399d;
                    this.f49401f += min / this.f49402g;
                    return;
                }
                this.f49400e += min / this.f49399d;
                this.f49401f -= min / this.f49402g;
            }
        }

        /* renamed from: d */
        public final float m45478d() {
            return (this.f49401f * this.f49402g) + (this.f49400e * this.f49399d) + (this.f49397b * this.f49398c);
        }

        /* renamed from: e */
        public final boolean m45477e() {
            int i = this.f49402g;
            if (i > 0 && this.f49398c > 0 && this.f49399d > 0) {
                float f = this.f49401f;
                float f2 = this.f49400e;
                if (f <= f2 || f2 <= this.f49397b) {
                    return false;
                }
                return true;
            } else if (i > 0 && this.f49398c > 0 && this.f49401f <= this.f49397b) {
                return false;
            } else {
                return true;
            }
        }

        public String toString() {
            return "Arrangement [priority=" + this.f49396a + ", smallCount=" + this.f49398c + ", smallSize=" + this.f49397b + ", mediumCount=" + this.f49399d + ", mediumSize=" + this.f49400e + ", largeCount=" + this.f49402g + ", largeSize=" + this.f49401f + ", cost=" + this.f49403h + "]";
        }
    }

    public MultiBrowseCarouselStrategy() {
        this(false);
    }

    /* renamed from: c */
    public static C6868a m45486c(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        C6868a c6868a = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = i5;
                    int i7 = length2;
                    int i8 = i3;
                    int i9 = length;
                    C6868a c6868a2 = new C6868a(i, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    if (c6868a == null || c6868a2.f49403h < c6868a.f49403h) {
                        if (c6868a2.f49403h == 0.0f) {
                            return c6868a2;
                        }
                        c6868a = c6868a2;
                    }
                    i++;
                    i5 = i6 + 1;
                    length2 = i7;
                    i3 = i8;
                    length = i9;
                }
                i3++;
            }
        }
        return c6868a;
    }

    /* renamed from: g */
    public static int m45482g(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    /* renamed from: b */
    public C6869a mo45487b(InterfaceC13206qm interfaceC13206qm, View view) {
        int[] iArr;
        float f;
        float containerWidth = interfaceC13206qm.getContainerWidth();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        float m45483f = m45483f(view.getContext()) + f2;
        float m45484e = m45484e(view.getContext()) + f2;
        float measuredWidth = view.getMeasuredWidth();
        float min = Math.min(measuredWidth + f2, containerWidth);
        float clamp = MathUtils.clamp((measuredWidth / 3.0f) + f2, m45483f(view.getContext()) + f2, m45484e(view.getContext()) + f2);
        float f3 = (min + clamp) / 2.0f;
        int[] iArr2 = f49392b;
        if (this.f49395a) {
            iArr = f49394d;
        } else {
            iArr = f49393c;
        }
        int max = (int) Math.max(1.0d, Math.floor(((containerWidth - (m45482g(iArr) * f3)) - (m45482g(iArr2) * m45484e)) / min));
        int ceil = (int) Math.ceil(containerWidth / min);
        int i = (ceil - max) + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = ceil - i2;
        }
        C6868a m45486c = m45486c(containerWidth, clamp, m45483f, m45484e, iArr2, f3, iArr, min, iArr3);
        float m45485d = m45485d(view.getContext()) + f2;
        float f4 = m45485d / 2.0f;
        float f5 = 0.0f - f4;
        float f6 = (m45486c.f49401f / 2.0f) + 0.0f;
        float f7 = m45486c.f49401f;
        float max2 = f6 + (Math.max(0, m45486c.f49402g - 1) * f7);
        float f8 = (f7 / 2.0f) + max2;
        int i3 = m45486c.f49399d;
        if (i3 > 0) {
            max2 = (m45486c.f49400e / 2.0f) + f8;
        }
        if (i3 > 0) {
            f8 = (m45486c.f49400e / 2.0f) + max2;
        }
        if (m45486c.f49398c > 0) {
            f = f8 + (m45486c.f49397b / 2.0f);
        } else {
            f = max2;
        }
        float containerWidth2 = interfaceC13206qm.getContainerWidth() + f4;
        float m45507a = CarouselStrategy.m45507a(m45485d, m45486c.f49401f, f2);
        float m45507a2 = CarouselStrategy.m45507a(m45486c.f49397b, m45486c.f49401f, f2);
        float m45507a3 = CarouselStrategy.m45507a(m45486c.f49400e, m45486c.f49401f, f2);
        C6869a.C6871b m45463d = new C6869a.C6871b(m45486c.f49401f).m45466a(f5, m45507a, m45485d).m45463d(f6, 0.0f, m45486c.f49401f, m45486c.f49402g, true);
        if (m45486c.f49399d > 0) {
            m45463d.m45466a(max2, m45507a3, m45486c.f49400e);
        }
        int i4 = m45486c.f49398c;
        if (i4 > 0) {
            m45463d.m45464c(f, m45507a2, m45486c.f49397b, i4);
        }
        m45463d.m45466a(containerWidth2, m45507a, m45485d);
        return m45463d.m45462e();
    }

    /* renamed from: d */
    public final float m45485d(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    /* renamed from: e */
    public final float m45484e(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    /* renamed from: f */
    public final float m45483f(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MultiBrowseCarouselStrategy(boolean z) {
        this.f49395a = z;
    }
}
