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
    public static final int f50260o;

    /* renamed from: p */
    public static boolean f50261p;

    /* renamed from: q */
    public static Constructor f50262q;

    /* renamed from: r */
    public static Object f50263r;

    /* renamed from: a */
    public CharSequence f50264a;

    /* renamed from: b */
    public final TextPaint f50265b;

    /* renamed from: c */
    public final int f50266c;

    /* renamed from: e */
    public int f50268e;

    /* renamed from: l */
    public boolean f50275l;

    /* renamed from: n */
    public StaticLayoutBuilderConfigurer f50277n;

    /* renamed from: d */
    public int f50267d = 0;

    /* renamed from: f */
    public Layout.Alignment f50269f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    public int f50270g = Integer.MAX_VALUE;

    /* renamed from: h */
    public float f50271h = 0.0f;

    /* renamed from: i */
    public float f50272i = 1.0f;

    /* renamed from: j */
    public int f50273j = f50260o;

    /* renamed from: k */
    public boolean f50274k = true;

    /* renamed from: m */
    public TextUtils.TruncateAt f50276m = null;

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
        f50260o = i;
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f50264a = charSequence;
        this.f50265b = textPaint;
        this.f50266c = i;
        this.f50268e = charSequence.length();
    }

    /* renamed from: c */
    public static StaticLayoutBuilderCompat m44555c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout m44557a() {
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout build;
        if (this.f50264a == null) {
            this.f50264a = "";
        }
        int max = Math.max(0, this.f50266c);
        CharSequence charSequence = this.f50264a;
        if (this.f50270g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f50265b, max, this.f50276m);
        }
        int min = Math.min(charSequence.length(), this.f50268e);
        this.f50268e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f50275l && this.f50270g == 1) {
                this.f50269f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, this.f50267d, min, this.f50265b, max);
            obtain.setAlignment(this.f50269f);
            obtain.setIncludePad(this.f50274k);
            if (this.f50275l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.f50276m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f50270g);
            float f = this.f50271h;
            if (f != 0.0f || this.f50272i != 1.0f) {
                obtain.setLineSpacing(f, this.f50272i);
            }
            if (this.f50270g > 1) {
                obtain.setHyphenationFrequency(this.f50273j);
            }
            StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.f50277n;
            if (staticLayoutBuilderConfigurer != null) {
                staticLayoutBuilderConfigurer.configure(obtain);
            }
            build = obtain.build();
            return build;
        }
        m44556b();
        try {
            return (StaticLayout) ((Constructor) Preconditions.checkNotNull(f50262q)).newInstance(charSequence, Integer.valueOf(this.f50267d), Integer.valueOf(this.f50268e), this.f50265b, Integer.valueOf(max), this.f50269f, Preconditions.checkNotNull(f50263r), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f50274k), null, Integer.valueOf(max), Integer.valueOf(this.f50270g));
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    /* renamed from: b */
    public final void m44556b() {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        if (f50261p) {
            return;
        }
        try {
            if (this.f50275l && Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            f50263r = textDirectionHeuristic;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f50262q = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f50261p = true;
        } catch (Exception e) {
            throw new StaticLayoutBuilderCompatException(e);
        }
    }

    /* renamed from: d */
    public StaticLayoutBuilderCompat m44554d(Layout.Alignment alignment) {
        this.f50269f = alignment;
        return this;
    }

    /* renamed from: e */
    public StaticLayoutBuilderCompat m44553e(TextUtils.TruncateAt truncateAt) {
        this.f50276m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public StaticLayoutBuilderCompat m44552f(int i) {
        this.f50273j = i;
        return this;
    }

    /* renamed from: g */
    public StaticLayoutBuilderCompat m44551g(boolean z) {
        this.f50274k = z;
        return this;
    }

    /* renamed from: h */
    public StaticLayoutBuilderCompat m44550h(boolean z) {
        this.f50275l = z;
        return this;
    }

    /* renamed from: i */
    public StaticLayoutBuilderCompat m44549i(float f, float f2) {
        this.f50271h = f;
        this.f50272i = f2;
        return this;
    }

    /* renamed from: j */
    public StaticLayoutBuilderCompat m44548j(int i) {
        this.f50270g = i;
        return this;
    }

    /* renamed from: k */
    public StaticLayoutBuilderCompat m44547k(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.f50277n = staticLayoutBuilderConfigurer;
        return this;
    }
}
