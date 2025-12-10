package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CollapsingTextHelper {

    /* renamed from: u0 */
    public static final boolean f50083u0 = false;

    /* renamed from: v0 */
    public static final Paint f50084v0 = null;

    /* renamed from: A */
    public Typeface f50085A;

    /* renamed from: B */
    public Typeface f50086B;

    /* renamed from: C */
    public Typeface f50087C;

    /* renamed from: D */
    public CancelableFontCallback f50088D;

    /* renamed from: E */
    public CancelableFontCallback f50089E;

    /* renamed from: G */
    public CharSequence f50091G;

    /* renamed from: H */
    public CharSequence f50092H;

    /* renamed from: I */
    public boolean f50093I;

    /* renamed from: K */
    public boolean f50095K;

    /* renamed from: L */
    public Bitmap f50096L;

    /* renamed from: M */
    public Paint f50097M;

    /* renamed from: N */
    public float f50098N;

    /* renamed from: O */
    public float f50099O;

    /* renamed from: P */
    public float f50100P;

    /* renamed from: Q */
    public float f50101Q;

    /* renamed from: R */
    public float f50102R;

    /* renamed from: S */
    public int f50103S;

    /* renamed from: T */
    public int[] f50104T;

    /* renamed from: U */
    public boolean f50105U;

    /* renamed from: V */
    public final TextPaint f50106V;

    /* renamed from: W */
    public final TextPaint f50107W;

    /* renamed from: X */
    public TimeInterpolator f50108X;

    /* renamed from: Y */
    public TimeInterpolator f50109Y;

    /* renamed from: Z */
    public float f50110Z;

    /* renamed from: a */
    public final View f50111a;

    /* renamed from: a0 */
    public float f50112a0;

    /* renamed from: b */
    public float f50113b;

    /* renamed from: b0 */
    public float f50114b0;

    /* renamed from: c */
    public boolean f50115c;

    /* renamed from: c0 */
    public ColorStateList f50116c0;

    /* renamed from: d */
    public float f50117d;

    /* renamed from: d0 */
    public float f50118d0;

    /* renamed from: e */
    public float f50119e;

    /* renamed from: e0 */
    public float f50120e0;

    /* renamed from: f */
    public int f50121f;

    /* renamed from: f0 */
    public float f50122f0;

    /* renamed from: g */
    public final Rect f50123g;

    /* renamed from: g0 */
    public ColorStateList f50124g0;

    /* renamed from: h */
    public final Rect f50125h;

    /* renamed from: h0 */
    public float f50126h0;

    /* renamed from: i */
    public final RectF f50127i;

    /* renamed from: i0 */
    public float f50128i0;

    /* renamed from: j0 */
    public float f50130j0;

    /* renamed from: k0 */
    public StaticLayout f50132k0;

    /* renamed from: l0 */
    public float f50134l0;

    /* renamed from: m0 */
    public float f50136m0;

    /* renamed from: n */
    public ColorStateList f50137n;

    /* renamed from: n0 */
    public float f50138n0;

    /* renamed from: o */
    public ColorStateList f50139o;

    /* renamed from: o0 */
    public CharSequence f50140o0;

    /* renamed from: p */
    public int f50141p;

    /* renamed from: q */
    public float f50143q;

    /* renamed from: r */
    public float f50145r;

    /* renamed from: s */
    public float f50147s;

    /* renamed from: t */
    public float f50149t;

    /* renamed from: t0 */
    public StaticLayoutBuilderConfigurer f50150t0;

    /* renamed from: u */
    public float f50151u;

    /* renamed from: v */
    public float f50152v;

    /* renamed from: w */
    public Typeface f50153w;

    /* renamed from: x */
    public Typeface f50154x;

    /* renamed from: y */
    public Typeface f50155y;

    /* renamed from: z */
    public Typeface f50156z;

    /* renamed from: j */
    public int f50129j = 16;

    /* renamed from: k */
    public int f50131k = 16;

    /* renamed from: l */
    public float f50133l = 15.0f;

    /* renamed from: m */
    public float f50135m = 15.0f;

    /* renamed from: F */
    public TextUtils.TruncateAt f50090F = TextUtils.TruncateAt.END;

    /* renamed from: J */
    public boolean f50094J = true;

    /* renamed from: p0 */
    public int f50142p0 = 1;

    /* renamed from: q0 */
    public float f50144q0 = 0.0f;

    /* renamed from: r0 */
    public float f50146r0 = 1.0f;

    /* renamed from: s0 */
    public int f50148s0 = StaticLayoutBuilderCompat.f50260o;

    /* renamed from: com.google.android.material.internal.CollapsingTextHelper$a */
    /* loaded from: classes4.dex */
    public class C6974a implements CancelableFontCallback.ApplyFont {
        public C6974a() {
        }

        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        public void apply(Typeface typeface) {
            CollapsingTextHelper.this.setCollapsedTypeface(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.CollapsingTextHelper$b */
    /* loaded from: classes4.dex */
    public class C6975b implements CancelableFontCallback.ApplyFont {
        public C6975b() {
        }

        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        public void apply(Typeface typeface) {
            CollapsingTextHelper.this.setExpandedTypeface(typeface);
        }
    }

    public CollapsingTextHelper(View view) {
        this.f50111a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f50106V = textPaint;
        this.f50107W = new TextPaint(textPaint);
        this.f50125h = new Rect();
        this.f50123g = new Rect();
        this.f50127i = new RectF();
        this.f50119e = m44634e();
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: A */
    public static boolean m44645A(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m44638a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: v */
    public static boolean m44617v(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static float m44614y(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AnimationUtils.lerp(f, f2, f3);
    }

    /* renamed from: B */
    public final void m44644B(float f) {
        this.f50136m0 = f;
        ViewCompat.postInvalidateOnAnimation(this.f50111a);
    }

    /* renamed from: C */
    public final boolean m44643C(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.f50089E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.f50155y != typeface) {
            this.f50155y = typeface;
            Typeface maybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.f50111a.getContext().getResources().getConfiguration(), typeface);
            this.f50154x = maybeCopyWithFontWeightAdjustment;
            if (maybeCopyWithFontWeightAdjustment == null) {
                maybeCopyWithFontWeightAdjustment = this.f50155y;
            }
            this.f50153w = maybeCopyWithFontWeightAdjustment;
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final void m44642D(float f) {
        this.f50138n0 = f;
        ViewCompat.postInvalidateOnAnimation(this.f50111a);
    }

    /* renamed from: E */
    public final boolean m44641E(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.f50088D;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.f50086B != typeface) {
            this.f50086B = typeface;
            Typeface maybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.f50111a.getContext().getResources().getConfiguration(), typeface);
            this.f50085A = maybeCopyWithFontWeightAdjustment;
            if (maybeCopyWithFontWeightAdjustment == null) {
                maybeCopyWithFontWeightAdjustment = this.f50086B;
            }
            this.f50156z = maybeCopyWithFontWeightAdjustment;
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final void m44640F(float f) {
        boolean z;
        m44631h(f);
        if (f50083u0 && this.f50098N != 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f50095K = z;
        if (z) {
            m44626m();
        }
        ViewCompat.postInvalidateOnAnimation(this.f50111a);
    }

    /* renamed from: G */
    public final boolean m44639G() {
        if (this.f50142p0 > 1 && ((!this.f50093I || this.f50115c) && !this.f50095K)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m44637b(boolean z) {
        float f;
        int i;
        StaticLayout staticLayout;
        m44630i(1.0f, z);
        CharSequence charSequence = this.f50092H;
        if (charSequence != null && (staticLayout = this.f50132k0) != null) {
            this.f50140o0 = TextUtils.ellipsize(charSequence, this.f50106V, staticLayout.getWidth(), this.f50090F);
        }
        CharSequence charSequence2 = this.f50140o0;
        float f2 = 0.0f;
        if (charSequence2 != null) {
            this.f50134l0 = m44613z(this.f50106V, charSequence2);
        } else {
            this.f50134l0 = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f50131k, this.f50093I ? 1 : 0);
        int i2 = absoluteGravity & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.f50145r = this.f50125h.centerY() - ((this.f50106V.descent() - this.f50106V.ascent()) / 2.0f);
            } else {
                this.f50145r = this.f50125h.bottom + this.f50106V.ascent();
            }
        } else {
            this.f50145r = this.f50125h.top;
        }
        int i3 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i3 != 1) {
            if (i3 != 5) {
                this.f50149t = this.f50125h.left;
            } else {
                this.f50149t = this.f50125h.right - this.f50134l0;
            }
        } else {
            this.f50149t = this.f50125h.centerX() - (this.f50134l0 / 2.0f);
        }
        m44630i(0.0f, z);
        StaticLayout staticLayout2 = this.f50132k0;
        if (staticLayout2 != null) {
            f = staticLayout2.getHeight();
        } else {
            f = 0.0f;
        }
        StaticLayout staticLayout3 = this.f50132k0;
        if (staticLayout3 != null && this.f50142p0 > 1) {
            f2 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.f50092H;
            if (charSequence3 != null) {
                f2 = m44613z(this.f50106V, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.f50132k0;
        if (staticLayout4 != null) {
            i = staticLayout4.getLineCount();
        } else {
            i = 0;
        }
        this.f50141p = i;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.f50129j, this.f50093I ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        if (i4 != 48) {
            if (i4 != 80) {
                this.f50143q = this.f50123g.centerY() - (f / 2.0f);
            } else {
                this.f50143q = (this.f50123g.bottom - f) + this.f50106V.descent();
            }
        } else {
            this.f50143q = this.f50123g.top;
        }
        int i5 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i5 != 1) {
            if (i5 != 5) {
                this.f50147s = this.f50123g.left;
            } else {
                this.f50147s = this.f50123g.right - f2;
            }
        } else {
            this.f50147s = this.f50123g.centerX() - (f2 / 2.0f);
        }
        m44629j();
        m44640F(this.f50113b);
    }

    /* renamed from: c */
    public final void m44636c() {
        m44632g(this.f50113b);
    }

    /* renamed from: d */
    public final float m44635d(float f) {
        float f2 = this.f50119e;
        if (f <= f2) {
            return AnimationUtils.lerp(1.0f, 0.0f, this.f50117d, f2, f);
        }
        return AnimationUtils.lerp(0.0f, 1.0f, f2, 1.0f, f);
    }

    public void draw(@NonNull Canvas canvas) {
        boolean z;
        int save = canvas.save();
        if (this.f50092H != null && this.f50127i.width() > 0.0f && this.f50127i.height() > 0.0f) {
            this.f50106V.setTextSize(this.f50099O);
            float f = this.f50151u;
            float f2 = this.f50152v;
            if (this.f50095K && this.f50096L != null) {
                z = true;
            } else {
                z = false;
            }
            float f3 = this.f50098N;
            if (f3 != 1.0f && !this.f50115c) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f50096L, f, f2, this.f50097M);
                canvas.restoreToCount(save);
                return;
            }
            if (m44639G() && (!this.f50115c || this.f50113b > this.f50119e)) {
                m44627l(canvas, this.f50151u - this.f50132k0.getLineStart(0), f2);
            } else {
                canvas.translate(f, f2);
                this.f50132k0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: e */
    public final float m44634e() {
        float f = this.f50117d;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: f */
    public final boolean m44633f(CharSequence charSequence) {
        boolean m44616w = m44616w();
        if (this.f50094J) {
            return m44615x(charSequence, m44616w);
        }
        return m44616w;
    }

    /* renamed from: g */
    public final void m44632g(float f) {
        float f2;
        m44618u(f);
        if (this.f50115c) {
            if (f < this.f50119e) {
                this.f50151u = this.f50147s;
                this.f50152v = this.f50143q;
                m44640F(0.0f);
                f2 = 0.0f;
            } else {
                this.f50151u = this.f50149t;
                this.f50152v = this.f50145r - Math.max(0, this.f50121f);
                m44640F(1.0f);
                f2 = 1.0f;
            }
        } else {
            this.f50151u = m44614y(this.f50147s, this.f50149t, f, this.f50108X);
            this.f50152v = m44614y(this.f50143q, this.f50145r, f, this.f50108X);
            m44640F(f);
            f2 = f;
        }
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        m44644B(1.0f - m44614y(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m44642D(m44614y(1.0f, 0.0f, f, timeInterpolator));
        if (this.f50139o != this.f50137n) {
            this.f50106V.setColor(m44638a(m44622q(), getCurrentCollapsedTextColor(), f2));
        } else {
            this.f50106V.setColor(getCurrentCollapsedTextColor());
        }
        float f3 = this.f50126h0;
        float f4 = this.f50128i0;
        if (f3 != f4) {
            this.f50106V.setLetterSpacing(m44614y(f4, f3, f, timeInterpolator));
        } else {
            this.f50106V.setLetterSpacing(f3);
        }
        this.f50100P = m44614y(this.f50118d0, this.f50110Z, f, null);
        this.f50101Q = m44614y(this.f50120e0, this.f50112a0, f, null);
        this.f50102R = m44614y(this.f50122f0, this.f50114b0, f, null);
        int m44638a = m44638a(m44623p(this.f50124g0), m44623p(this.f50116c0), f);
        this.f50103S = m44638a;
        this.f50106V.setShadowLayer(this.f50100P, this.f50101Q, this.f50102R, m44638a);
        if (this.f50115c) {
            int alpha = this.f50106V.getAlpha();
            this.f50106V.setAlpha((int) (m44635d(f) * alpha));
        }
        ViewCompat.postInvalidateOnAnimation(this.f50111a);
    }

    public void getCollapsedTextActualBounds(@NonNull RectF rectF, int i, int i2) {
        this.f50093I = m44633f(this.f50091G);
        rectF.left = Math.max(m44625n(i, i2), this.f50125h.left);
        rectF.top = this.f50125h.top;
        rectF.right = Math.min(m44624o(rectF, i, i2), this.f50125h.right);
        rectF.bottom = this.f50125h.top + getCollapsedTextHeight();
    }

    public ColorStateList getCollapsedTextColor() {
        return this.f50139o;
    }

    public int getCollapsedTextGravity() {
        return this.f50131k;
    }

    public float getCollapsedTextHeight() {
        m44620s(this.f50107W);
        return -this.f50107W.ascent();
    }

    public float getCollapsedTextSize() {
        return this.f50135m;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.f50153w;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    @ColorInt
    public int getCurrentCollapsedTextColor() {
        return m44623p(this.f50139o);
    }

    public int getExpandedLineCount() {
        return this.f50141p;
    }

    public ColorStateList getExpandedTextColor() {
        return this.f50137n;
    }

    public float getExpandedTextFullHeight() {
        m44619t(this.f50107W);
        return (-this.f50107W.ascent()) + this.f50107W.descent();
    }

    public int getExpandedTextGravity() {
        return this.f50129j;
    }

    public float getExpandedTextHeight() {
        m44619t(this.f50107W);
        return -this.f50107W.ascent();
    }

    public float getExpandedTextSize() {
        return this.f50133l;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.f50156z;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public float getExpansionFraction() {
        return this.f50113b;
    }

    public float getFadeModeThresholdFraction() {
        return this.f50119e;
    }

    @RequiresApi(23)
    public int getHyphenationFrequency() {
        return this.f50148s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f50132k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi(23)
    public float getLineSpacingAdd() {
        return this.f50132k0.getSpacingAdd();
    }

    @RequiresApi(23)
    public float getLineSpacingMultiplier() {
        return this.f50132k0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f50142p0;
    }

    @Nullable
    public TimeInterpolator getPositionInterpolator() {
        return this.f50108X;
    }

    @Nullable
    public CharSequence getText() {
        return this.f50091G;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f50090F;
    }

    /* renamed from: h */
    public final void m44631h(float f) {
        m44630i(f, false);
    }

    /* renamed from: i */
    public final void m44630i(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        boolean z3;
        boolean z4;
        StaticLayout staticLayout;
        boolean z5;
        boolean z6;
        if (this.f50091G == null) {
            return;
        }
        float width = this.f50125h.width();
        float width2 = this.f50123g.width();
        if (m44617v(f, 1.0f)) {
            f2 = this.f50135m;
            f3 = this.f50126h0;
            this.f50098N = 1.0f;
            typeface = this.f50153w;
        } else {
            float f4 = this.f50133l;
            float f5 = this.f50128i0;
            Typeface typeface2 = this.f50156z;
            if (m44617v(f, 0.0f)) {
                this.f50098N = 1.0f;
            } else {
                this.f50098N = m44614y(this.f50133l, this.f50135m, f, this.f50109Y) / this.f50133l;
            }
            float f6 = this.f50135m / this.f50133l;
            float f7 = width2 * f6;
            if (z || f7 <= width) {
                width = width2;
            } else {
                width = Math.min(width / f6, width2);
            }
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        int i = 1;
        boolean z7 = false;
        if (width > 0.0f) {
            if (this.f50099O != f2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f50130j0 != f3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.f50087C != typeface) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.f50132k0 != null && width != staticLayout.getWidth()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z2 && !z3 && !z5 && !z4 && !this.f50105U) {
                z6 = false;
            } else {
                z6 = true;
            }
            this.f50099O = f2;
            this.f50130j0 = f3;
            this.f50087C = typeface;
            this.f50105U = false;
            TextPaint textPaint = this.f50106V;
            if (this.f50098N != 1.0f) {
                z7 = true;
            }
            textPaint.setLinearText(z7);
            z7 = z6;
        }
        if (this.f50092H == null || z7) {
            this.f50106V.setTextSize(this.f50099O);
            this.f50106V.setTypeface(this.f50087C);
            this.f50106V.setLetterSpacing(this.f50130j0);
            this.f50093I = m44633f(this.f50091G);
            if (m44639G()) {
                i = this.f50142p0;
            }
            StaticLayout m44628k = m44628k(i, width, this.f50093I);
            this.f50132k0 = m44628k;
            this.f50092H = m44628k.getText();
        }
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.f50094J;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f50139o;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f50137n) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m44629j() {
        Bitmap bitmap = this.f50096L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f50096L = null;
        }
    }

    /* renamed from: k */
    public final StaticLayout m44628k(int i, float f, boolean z) {
        StaticLayout staticLayout;
        Layout.Alignment m44621r;
        try {
            if (i == 1) {
                m44621r = Layout.Alignment.ALIGN_NORMAL;
            } else {
                m44621r = m44621r();
            }
            staticLayout = StaticLayoutBuilderCompat.m44555c(this.f50091G, this.f50106V, (int) f).m44553e(this.f50090F).m44550h(z).m44554d(m44621r).m44551g(false).m44548j(i).m44549i(this.f50144q0, this.f50146r0).m44552f(this.f50148s0).m44547k(this.f50150t0).m44557a();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
            e.getCause().getMessage();
            staticLayout = null;
        }
        return (StaticLayout) Preconditions.checkNotNull(staticLayout);
    }

    /* renamed from: l */
    public final void m44627l(Canvas canvas, float f, float f2) {
        int alpha = this.f50106V.getAlpha();
        canvas.translate(f, f2);
        if (!this.f50115c) {
            this.f50106V.setAlpha((int) (this.f50138n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f50106V;
                textPaint.setShadowLayer(this.f50100P, this.f50101Q, this.f50102R, MaterialColors.compositeARGBWithAlpha(this.f50103S, textPaint.getAlpha()));
            }
            this.f50132k0.draw(canvas);
        }
        if (!this.f50115c) {
            this.f50106V.setAlpha((int) (this.f50136m0 * alpha));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint2 = this.f50106V;
            textPaint2.setShadowLayer(this.f50100P, this.f50101Q, this.f50102R, MaterialColors.compositeARGBWithAlpha(this.f50103S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f50132k0.getLineBaseline(0);
        CharSequence charSequence = this.f50140o0;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f3, this.f50106V);
        if (i >= 31) {
            this.f50106V.setShadowLayer(this.f50100P, this.f50101Q, this.f50102R, this.f50103S);
        }
        if (!this.f50115c) {
            String trim = this.f50140o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f50106V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f50132k0.getLineEnd(0), str.length()), 0.0f, f3, (Paint) this.f50106V);
        }
    }

    /* renamed from: m */
    public final void m44626m() {
        if (this.f50096L == null && !this.f50123g.isEmpty() && !TextUtils.isEmpty(this.f50092H)) {
            m44632g(0.0f);
            int width = this.f50132k0.getWidth();
            int height = this.f50132k0.getHeight();
            if (width > 0 && height > 0) {
                this.f50096L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f50132k0.draw(new Canvas(this.f50096L));
                if (this.f50097M == null) {
                    this.f50097M = new Paint(3);
                }
            }
        }
    }

    public void maybeUpdateFontWeightAdjustment(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f50155y;
            if (typeface != null) {
                this.f50154x = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.f50086B;
            if (typeface2 != null) {
                this.f50085A = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.f50154x;
            if (typeface3 == null) {
                typeface3 = this.f50155y;
            }
            this.f50153w = typeface3;
            Typeface typeface4 = this.f50085A;
            if (typeface4 == null) {
                typeface4 = this.f50086B;
            }
            this.f50156z = typeface4;
            recalculate(true);
        }
    }

    /* renamed from: n */
    public final float m44625n(int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & GravityCompat.END) != 8388613 && (i2 & 5) != 5) {
                if (this.f50093I) {
                    return this.f50125h.right - this.f50134l0;
                }
                return this.f50125h.left;
            } else if (this.f50093I) {
                return this.f50125h.left;
            } else {
                return this.f50125h.right - this.f50134l0;
            }
        }
        return (i / 2.0f) - (this.f50134l0 / 2.0f);
    }

    /* renamed from: o */
    public final float m44624o(RectF rectF, int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & GravityCompat.END) != 8388613 && (i2 & 5) != 5) {
                if (this.f50093I) {
                    return this.f50125h.right;
                }
                return rectF.left + this.f50134l0;
            } else if (this.f50093I) {
                return rectF.left + this.f50134l0;
            } else {
                return this.f50125h.right;
            }
        }
        return (i / 2.0f) + (this.f50134l0 / 2.0f);
    }

    /* renamed from: p */
    public final int m44623p(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f50104T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: q */
    public final int m44622q() {
        return m44623p(this.f50137n);
    }

    /* renamed from: r */
    public final Layout.Alignment m44621r() {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f50129j, this.f50093I ? 1 : 0) & 7;
        if (absoluteGravity != 1) {
            if (absoluteGravity != 5) {
                if (this.f50093I) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            } else if (this.f50093I) {
                return Layout.Alignment.ALIGN_NORMAL;
            } else {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    public void recalculate() {
        recalculate(false);
    }

    /* renamed from: s */
    public final void m44620s(TextPaint textPaint) {
        textPaint.setTextSize(this.f50135m);
        textPaint.setTypeface(this.f50153w);
        textPaint.setLetterSpacing(this.f50126h0);
    }

    public void setCollapsedAndExpandedTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f50139o != colorStateList || this.f50137n != colorStateList) {
            this.f50139o = colorStateList;
            this.f50137n = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedBounds(int i, int i2, int i3, int i4) {
        if (m44645A(this.f50125h, i, i2, i3, i4)) {
            return;
        }
        this.f50125h.set(i, i2, i3, i4);
        this.f50105U = true;
    }

    public void setCollapsedTextAppearance(int i) {
        TextAppearance textAppearance = new TextAppearance(this.f50111a.getContext(), i);
        if (textAppearance.getTextColor() != null) {
            this.f50139o = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.f50135m = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.f50116c0 = colorStateList;
        }
        this.f50112a0 = textAppearance.shadowDx;
        this.f50114b0 = textAppearance.shadowDy;
        this.f50110Z = textAppearance.shadowRadius;
        this.f50126h0 = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.f50089E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.f50089E = new CancelableFontCallback(new C6974a(), textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.f50111a.getContext(), this.f50089E);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.f50139o != colorStateList) {
            this.f50139o = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i) {
        if (this.f50131k != i) {
            this.f50131k = i;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f) {
        if (this.f50135m != f) {
            this.f50135m = f;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (m44643C(typeface)) {
            recalculate();
        }
    }

    public void setCurrentOffsetY(int i) {
        this.f50121f = i;
    }

    public void setExpandedBounds(int i, int i2, int i3, int i4) {
        if (m44645A(this.f50123g, i, i2, i3, i4)) {
            return;
        }
        this.f50123g.set(i, i2, i3, i4);
        this.f50105U = true;
    }

    public void setExpandedLetterSpacing(float f) {
        if (this.f50128i0 != f) {
            this.f50128i0 = f;
            recalculate();
        }
    }

    public void setExpandedTextAppearance(int i) {
        TextAppearance textAppearance = new TextAppearance(this.f50111a.getContext(), i);
        if (textAppearance.getTextColor() != null) {
            this.f50137n = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.f50133l = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.f50124g0 = colorStateList;
        }
        this.f50120e0 = textAppearance.shadowDx;
        this.f50122f0 = textAppearance.shadowDy;
        this.f50118d0 = textAppearance.shadowRadius;
        this.f50128i0 = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.f50088D;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.f50088D = new CancelableFontCallback(new C6975b(), textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.f50111a.getContext(), this.f50088D);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.f50137n != colorStateList) {
            this.f50137n = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i) {
        if (this.f50129j != i) {
            this.f50129j = i;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f) {
        if (this.f50133l != f) {
            this.f50133l = f;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (m44641E(typeface)) {
            recalculate();
        }
    }

    public void setExpansionFraction(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp != this.f50113b) {
            this.f50113b = clamp;
            m44636c();
        }
    }

    public void setFadeModeEnabled(boolean z) {
        this.f50115c = z;
    }

    public void setFadeModeStartFraction(float f) {
        this.f50117d = f;
        this.f50119e = m44634e();
    }

    @RequiresApi(23)
    public void setHyphenationFrequency(int i) {
        this.f50148s0 = i;
    }

    @RequiresApi(23)
    public void setLineSpacingAdd(float f) {
        this.f50144q0 = f;
    }

    @RequiresApi(23)
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f) {
        this.f50146r0 = f;
    }

    public void setMaxLines(int i) {
        if (i != this.f50142p0) {
            this.f50142p0 = i;
            m44629j();
            recalculate();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f50108X = timeInterpolator;
        recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f50094J = z;
    }

    public final boolean setState(int[] iArr) {
        this.f50104T = iArr;
        if (isStateful()) {
            recalculate();
            return true;
        }
        return false;
    }

    @RequiresApi(23)
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        if (this.f50150t0 != staticLayoutBuilderConfigurer) {
            this.f50150t0 = staticLayoutBuilderConfigurer;
            recalculate(true);
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f50091G, charSequence)) {
            this.f50091G = charSequence;
            this.f50092H = null;
            m44629j();
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.f50109Y = timeInterpolator;
        recalculate();
    }

    public void setTitleTextEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.f50090F = truncateAt;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean m44643C = m44643C(typeface);
        boolean m44641E = m44641E(typeface);
        if (m44643C || m44641E) {
            recalculate();
        }
    }

    /* renamed from: t */
    public final void m44619t(TextPaint textPaint) {
        textPaint.setTextSize(this.f50133l);
        textPaint.setTypeface(this.f50156z);
        textPaint.setLetterSpacing(this.f50128i0);
    }

    /* renamed from: u */
    public final void m44618u(float f) {
        Rect rect;
        if (this.f50115c) {
            RectF rectF = this.f50127i;
            if (f < this.f50119e) {
                rect = this.f50123g;
            } else {
                rect = this.f50125h;
            }
            rectF.set(rect);
            return;
        }
        this.f50127i.left = m44614y(this.f50123g.left, this.f50125h.left, f, this.f50108X);
        this.f50127i.top = m44614y(this.f50143q, this.f50145r, f, this.f50108X);
        this.f50127i.right = m44614y(this.f50123g.right, this.f50125h.right, f, this.f50108X);
        this.f50127i.bottom = m44614y(this.f50123g.bottom, this.f50125h.bottom, f, this.f50108X);
    }

    /* renamed from: w */
    public final boolean m44616w() {
        if (ViewCompat.getLayoutDirection(this.f50111a) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m44615x(CharSequence charSequence, boolean z) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat;
        if (z) {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
        } else {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        return textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    /* renamed from: z */
    public final float m44613z(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void recalculate(boolean z) {
        if ((this.f50111a.getHeight() <= 0 || this.f50111a.getWidth() <= 0) && !z) {
            return;
        }
        m44637b(z);
        m44636c();
    }

    public void setCollapsedBounds(@NonNull Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedBounds(@NonNull Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
