package ru.tinkoff.scrollingpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes5.dex */
public class ScrollingPagerIndicator extends View {

    /* renamed from: a */
    public int f77468a;

    /* renamed from: b */
    public final int f77469b;

    /* renamed from: c */
    public final int f77470c;

    /* renamed from: d */
    public final int f77471d;

    /* renamed from: e */
    public int f77472e;

    /* renamed from: f */
    public int f77473f;

    /* renamed from: g */
    public float f77474g;

    /* renamed from: h */
    public float f77475h;

    /* renamed from: i */
    public float f77476i;

    /* renamed from: j */
    public SparseArray f77477j;

    /* renamed from: k */
    public int f77478k;

    /* renamed from: l */
    public final Paint f77479l;

    /* renamed from: m */
    public final ArgbEvaluator f77480m;

    /* renamed from: n */
    public int f77481n;

    /* renamed from: o */
    public int f77482o;

    /* renamed from: p */
    public boolean f77483p;

    /* renamed from: q */
    public Runnable f77484q;

    /* renamed from: r */
    public PagerAttacher f77485r;

    /* renamed from: s */
    public boolean f77486s;

    /* loaded from: classes5.dex */
    public interface PagerAttacher<T> {
        void attachToPager(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull T t);

        void detachFromPager();
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator$a */
    /* loaded from: classes5.dex */
    public class RunnableC13305a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f77487a;

        /* renamed from: b */
        public final /* synthetic */ PagerAttacher f77488b;

        public RunnableC13305a(Object obj, PagerAttacher pagerAttacher) {
            this.f77487a = obj;
            this.f77488b = pagerAttacher;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingPagerIndicator.this.f77478k = -1;
            ScrollingPagerIndicator.this.attachToPager(this.f77487a, this.f77488b);
        }
    }

    public ScrollingPagerIndicator(Context context) {
        this(context, null);
    }

    private int getDotCount() {
        if (this.f77483p && this.f77478k > this.f77472e) {
            return this.f77468a;
        }
        return this.f77478k;
    }

    public void attachToPager(@NonNull ViewPager viewPager) {
        attachToPager(viewPager, new ViewPagerAttacher());
    }

    public void attachToRecyclerView(@NonNull RecyclerView recyclerView) {
        attachToPager(recyclerView, new RecyclerViewAttacher());
    }

    /* renamed from: b */
    public final void m23230b(float f, int i) {
        int i2 = this.f77478k;
        int i3 = this.f77472e;
        if (i2 <= i3) {
            this.f77474g = 0.0f;
        } else if (!this.f77483p && i2 > i3) {
            this.f77474g = (m23228d(i) + (this.f77471d * f)) - (this.f77475h / 2.0f);
            int i4 = this.f77472e / 2;
            float m23228d = m23228d((getDotCount() - 1) - i4);
            if (this.f77474g + (this.f77475h / 2.0f) < m23228d(i4)) {
                this.f77474g = m23228d(i4) - (this.f77475h / 2.0f);
                return;
            }
            float f2 = this.f77474g;
            float f3 = this.f77475h;
            if (f2 + (f3 / 2.0f) > m23228d) {
                this.f77474g = m23228d - (f3 / 2.0f);
            }
        } else {
            this.f77474g = (m23228d(this.f77468a / 2) + (this.f77471d * f)) - (this.f77475h / 2.0f);
        }
    }

    /* renamed from: c */
    public final int m23229c(float f) {
        return ((Integer) this.f77480m.evaluate(f, Integer.valueOf(this.f77481n), Integer.valueOf(this.f77482o))).intValue();
    }

    /* renamed from: d */
    public final float m23228d(int i) {
        return this.f77476i + (i * this.f77471d);
    }

    public void detachFromPager() {
        PagerAttacher pagerAttacher = this.f77485r;
        if (pagerAttacher != null) {
            pagerAttacher.detachFromPager();
            this.f77485r = null;
            this.f77484q = null;
        }
        this.f77486s = false;
    }

    /* renamed from: e */
    public final float m23227e(int i) {
        Float f = (Float) this.f77477j.get(i);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final void m23226f(int i) {
        float f;
        if (this.f77478k == i && this.f77486s) {
            return;
        }
        this.f77478k = i;
        this.f77486s = true;
        this.f77477j = new SparseArray();
        if (i < this.f77473f) {
            requestLayout();
            invalidate();
            return;
        }
        if (this.f77483p && this.f77478k > this.f77472e) {
            f = 0.0f;
        } else {
            f = this.f77470c / 2;
        }
        this.f77476i = f;
        this.f77475h = ((this.f77472e - 1) * this.f77471d) + this.f77470c;
        requestLayout();
        invalidate();
    }

    /* renamed from: g */
    public final void m23225g(int i, float f) {
        if (this.f77477j != null && getDotCount() != 0) {
            m23224h(i, 1.0f - Math.abs(f));
        }
    }

    @ColorInt
    public int getDotColor() {
        return this.f77481n;
    }

    @ColorInt
    public int getSelectedDotColor() {
        return this.f77482o;
    }

    public int getVisibleDotCount() {
        return this.f77472e;
    }

    public int getVisibleDotThreshold() {
        return this.f77473f;
    }

    /* renamed from: h */
    public final void m23224h(int i, float f) {
        if (f == 0.0f) {
            this.f77477j.remove(i);
        } else {
            this.f77477j.put(i, Float.valueOf(f));
        }
    }

    /* renamed from: i */
    public final void m23223i(int i) {
        if (!this.f77483p || this.f77478k < this.f77472e) {
            this.f77477j.clear();
            this.f77477j.put(i, Float.valueOf(1.0f));
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r11 < r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        if (r11 < r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r9 = r11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L12
            int r4 = r3.f77472e
            int r4 = r4 + (-1)
            int r0 = r3.f77471d
            int r4 = r4 * r0
            int r0 = r3.f77470c
        L10:
            int r4 = r4 + r0
            goto L25
        L12:
            int r4 = r3.f77478k
            int r0 = r3.f77472e
            if (r4 < r0) goto L1c
            float r4 = r3.f77475h
            int r4 = (int) r4
            goto L25
        L1c:
            int r4 = r4 + (-1)
            int r0 = r3.f77471d
            int r4 = r4 * r0
            int r0 = r3.f77470c
            goto L10
        L25:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r1 = r3.f77470c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L39
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L3d
            r5 = r1
            goto L3d
        L39:
            int r5 = java.lang.Math.min(r1, r5)
        L3d:
            r3.setMeasuredDimension(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onMeasure(int, int):void");
    }

    public void onPageScrolled(int i, float f) {
        int i2;
        if (f >= 0.0f && f <= 1.0f) {
            if (i >= 0 && (i == 0 || i < this.f77478k)) {
                if (!this.f77483p || ((i2 = this.f77478k) <= this.f77472e && i2 > 1)) {
                    this.f77477j.clear();
                    m23225g(i, f);
                    int i3 = this.f77478k;
                    if (i < i3 - 1) {
                        m23225g(i + 1, 1.0f - f);
                    } else if (i3 > 1) {
                        m23225g(0, 1.0f - f);
                    }
                    invalidate();
                }
                m23230b(f, i);
                invalidate();
                return;
            }
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        }
        throw new IllegalArgumentException("Offset must be [0, 1]");
    }

    public void reattach() {
        Runnable runnable = this.f77484q;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    public void setCurrentPosition(int i) {
        if (i != 0 && (i < 0 || i >= this.f77478k)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        }
        if (this.f77478k == 0) {
            return;
        }
        m23230b(0.0f, i);
        m23223i(i);
    }

    public void setDotColor(@ColorInt int i) {
        this.f77481n = i;
        invalidate();
    }

    public void setDotCount(int i) {
        m23226f(i);
    }

    public void setLooped(boolean z) {
        this.f77483p = z;
        reattach();
        invalidate();
    }

    public void setSelectedDotColor(@ColorInt int i) {
        this.f77482o = i;
        invalidate();
    }

    public void setVisibleDotCount(int i) {
        if (i % 2 != 0) {
            this.f77472e = i;
            this.f77468a = i + 2;
            if (this.f77484q != null) {
                reattach();
                return;
            } else {
                requestLayout();
                return;
            }
        }
        throw new IllegalArgumentException("visibleDotCount must be odd");
    }

    public void setVisibleDotThreshold(int i) {
        this.f77473f = i;
        if (this.f77484q != null) {
            reattach();
        } else {
            requestLayout();
        }
    }

    public ScrollingPagerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public <T> void attachToPager(@NonNull T t, @NonNull PagerAttacher<T> pagerAttacher) {
        detachFromPager();
        pagerAttacher.attachToPager(this, t);
        this.f77485r = pagerAttacher;
        this.f77484q = new RunnableC13305a(t, pagerAttacher);
    }

    public void attachToRecyclerView(@NonNull RecyclerView recyclerView, int i) {
        attachToPager(recyclerView, new RecyclerViewAttacher(i));
    }

    public ScrollingPagerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77480m = new ArgbEvaluator();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingPagerIndicator, i, R.style.ScrollingPagerIndicator);
        int color = obtainStyledAttributes.getColor(R.styleable.ScrollingPagerIndicator_spi_dotColor, 0);
        this.f77481n = color;
        this.f77482o = obtainStyledAttributes.getColor(R.styleable.ScrollingPagerIndicator_spi_dotSelectedColor, color);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingPagerIndicator_spi_dotSize, 0);
        this.f77469b = dimensionPixelSize;
        this.f77470c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingPagerIndicator_spi_dotSelectedSize, 0);
        this.f77471d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingPagerIndicator_spi_dotSpacing, 0) + dimensionPixelSize;
        this.f77483p = obtainStyledAttributes.getBoolean(R.styleable.ScrollingPagerIndicator_spi_looped, false);
        int i2 = obtainStyledAttributes.getInt(R.styleable.ScrollingPagerIndicator_spi_visibleDotCount, 0);
        setVisibleDotCount(i2);
        this.f77473f = obtainStyledAttributes.getInt(R.styleable.ScrollingPagerIndicator_spi_visibleDotThreshold, 2);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f77479l = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i2);
            onPageScrolled(i2 / 2, 0.0f);
        }
    }
}
