package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.Preconditions;
import java.lang.reflect.Constructor;

/* loaded from: classes4.dex */
public final class StaticLayoutBuilderCompat {

    /* renamed from: o */
    public static final int f50272o;

    /* renamed from: p */
    public static boolean f50273p;

    /* renamed from: q */
    public static Constructor f50274q;

    /* renamed from: r */
    public static Object f50275r;

    /* renamed from: a */
    public CharSequence f50276a;

    /* renamed from: b */
    public final TextPaint f50277b;

    /* renamed from: c */
    public final int f50278c;

    /* renamed from: e */
    public int f50280e;

    /* renamed from: l */
    public boolean f50287l;

    /* renamed from: n */
    public StaticLayoutBuilderConfigurer f50289n;

    /* renamed from: d */
    public int f50279d = 0;

    /* renamed from: f */
    public Layout.Alignment f50281f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    public int f50282g = Integer.MAX_VALUE;

    /* renamed from: h */
    public float f50283h = 0.0f;

    /* renamed from: i */
    public float f50284i = 1.0f;

    /* renamed from: j */
    public int f50285j = f50272o;

    /* renamed from: k */
    public boolean f50286k = true;

    /* renamed from: m */
    public TextUtils.TruncateAt f50288m = null;

    /* loaded from: classes4.dex */
    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 1;
        } else {
            i = 0;
        }
        f50272o = i;
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f50276a = charSequence;
        this.f50277b = textPaint;
        this.f50278c = i;
        this.f50280e = charSequence.length();
    }

    /* renamed from: c */
    public static StaticLayoutBuilderCompat m44542c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout m44544a() {
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout build;
        if (this.f50276a == null) {
            this.f50276a = "";
        }
        int max = Math.max(0, this.f50278c);
        CharSequence charSequence = this.f50276a;
        if (this.f50282g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f50277b, max, this.f50288m);
        }
        int min = Math.min(charSequence.length(), this.f50280e);
        this.f50280e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f50287l && this.f50282g == 1) {
                this.f50281f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, this.f50279d, min, this.f50277b, max);
            obtain.setAlignment(this.f50281f);
            obtain.setIncludePad(this.f50286k);
            if (this.f50287l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.f50288m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f50282g);
            float f = this.f50283h;
            if (f != 0.0f || this.f50284i != 1.0f) {
                obtain.setLineSpacing(f, this.f50284i);
            }
            if (this.f50282g > 1) {
                obtain.setHyphenationFrequency(this.f50285j);
            }
            StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.f50289n;
            if (staticLayoutBuilderConfigurer != null) {
                staticLayoutBuilderConfigurer.configure(obtain);
            }
            build = obtain.build();
            return build;
        }
        m44543b();
        try {
            return (StaticLayout) ((Constructor) Preconditions.checkNotNull(f50274q)).newInstance(charSequence, Integer.valueOf(this.f50279d), Integer.valueOf(this.f50280e), this.f50277b, Integer.valueOf(max), this.f50281f, Preconditions.checkNotNull(f50275r), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f50286k), null, Integer.valueOf(max), Integer.valueOf(this.f50282g));
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    /* renamed from: b */
    public final void m44543b() {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        if (f50273p) {
            return;
        }
        try {
            if (this.f50287l && Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            f50275r = textDirectionHeuristic;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f50274q = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f50273p = true;
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    /* renamed from: d */
    public StaticLayoutBuilderCompat m44541d(Layout.Alignment alignment) {
        this.f50281f = alignment;
        return this;
    }

    /* renamed from: e */
    public StaticLayoutBuilderCompat m44540e(TextUtils.TruncateAt truncateAt) {
        this.f50288m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public StaticLayoutBuilderCompat m44539f(int i) {
        this.f50285j = i;
        return this;
    }

    /* renamed from: g */
    public StaticLayoutBuilderCompat m44538g(boolean z) {
        this.f50286k = z;
        return this;
    }

    /* renamed from: h */
    public StaticLayoutBuilderCompat m44537h(boolean z) {
        this.f50287l = z;
        return this;
    }

    /* renamed from: i */
    public StaticLayoutBuilderCompat m44536i(float f, float f2) {
        this.f50283h = f;
        this.f50284i = f2;
        return this;
    }

    /* renamed from: j */
    public StaticLayoutBuilderCompat m44535j(int i) {
        this.f50282g = i;
        return this;
    }

    /* renamed from: k */
    public StaticLayoutBuilderCompat m44534k(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.f50289n = staticLayoutBuilderConfigurer;
        return this;
    }
}