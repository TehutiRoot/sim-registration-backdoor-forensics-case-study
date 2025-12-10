package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\bi\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0014\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u001a\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u0017\u0010 \u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u0017\u0010#\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u0017\u0010&\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004\"\u0017\u0010)\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0004\"\u0017\u0010,\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0004\"\u0017\u0010/\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u0017\u00102\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0004\"\u0017\u00105\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u0017\u00108\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0004\"\u0017\u0010;\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u0017\u0010>\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0004\"\u0017\u0010A\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0004\"\u0017\u0010D\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010\u0004\"\u0017\u0010G\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u0004\"\u0017\u0010J\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u0004\"\u0017\u0010M\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u0004\"\u0017\u0010P\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bN\u0010\u0002\u001a\u0004\bO\u0010\u0004\"\u0017\u0010S\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bQ\u0010\u0002\u001a\u0004\bR\u0010\u0004\"\u0017\u0010V\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u0004\"\u0017\u0010Y\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\u0004\"\u0017\u0010\\\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bZ\u0010\u0002\u001a\u0004\b[\u0010\u0004\"\u0017\u0010_\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b]\u0010\u0002\u001a\u0004\b^\u0010\u0004\"\u0017\u0010b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b`\u0010\u0002\u001a\u0004\ba\u0010\u0004\"\u0017\u0010e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bc\u0010\u0002\u001a\u0004\bd\u0010\u0004\"\u0017\u0010h\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bf\u0010\u0002\u001a\u0004\bg\u0010\u0004¨\u0006i"}, m28850d2 = {"Landroidx/compose/animation/core/Easing;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Easing;", "getEase", "()Landroidx/compose/animation/core/Easing;", "Ease", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEaseOut", "EaseOut", OperatorName.CURVE_TO, "getEaseIn", "EaseIn", "d", "getEaseInOut", "EaseInOut", "e", "getEaseInSine", "EaseInSine", OperatorName.FILL_NON_ZERO, "getEaseOutSine", "EaseOutSine", OperatorName.NON_STROKING_GRAY, "getEaseInOutSine", "EaseInOutSine", OperatorName.CLOSE_PATH, "getEaseInCubic", "EaseInCubic", "i", "getEaseOutCubic", "EaseOutCubic", OperatorName.SET_LINE_JOINSTYLE, "getEaseInOutCubic", "EaseInOutCubic", OperatorName.NON_STROKING_CMYK, "getEaseInQuint", "EaseInQuint", OperatorName.LINE_TO, "getEaseOutQuint", "EaseOutQuint", OperatorName.MOVE_TO, "getEaseInOutQuint", "EaseInOutQuint", OperatorName.ENDPATH, "getEaseInCirc", "EaseInCirc", "o", "getEaseOutCirc", "EaseOutCirc", "p", "getEaseInOutCirc", "EaseInOutCirc", OperatorName.SAVE, "getEaseInQuad", "EaseInQuad", PDPageLabelRange.STYLE_ROMAN_LOWER, "getEaseOutQuad", "EaseOutQuad", OperatorName.CLOSE_AND_STROKE, "getEaseInOutQuad", "EaseInOutQuad", "t", "getEaseInQuart", "EaseInQuart", "u", "getEaseOutQuart", "EaseOutQuart", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getEaseInOutQuart", "EaseInOutQuart", OperatorName.SET_LINE_WIDTH, "getEaseInExpo", "EaseInExpo", "x", "getEaseOutExpo", "EaseOutExpo", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getEaseInOutExpo", "EaseInOutExpo", "z", "getEaseInBack", "EaseInBack", "A", "getEaseOutBack", "EaseOutBack", "B", "getEaseInOutBack", "EaseInOutBack", "C", "getEaseInElastic", "EaseInElastic", "D", "getEaseOutElastic", "EaseOutElastic", ExifInterface.LONGITUDE_EAST, "getEaseInOutElastic", "EaseInOutElastic", "F", "getEaseOutBounce", "EaseOutBounce", OperatorName.STROKING_COLOR_GRAY, "getEaseInBounce", "EaseInBounce", "H", "getEaseInOutBounce", "EaseInOutBounce", "animation-core_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EasingFunctionsKt {

    /* renamed from: a */
    public static final Easing f12483a = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: b */
    public static final Easing f12484b = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);

    /* renamed from: c */
    public static final Easing f12485c = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d */
    public static final Easing f12486d = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: e */
    public static final Easing f12487e = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);

    /* renamed from: f */
    public static final Easing f12488f = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);

    /* renamed from: g */
    public static final Easing f12489g = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);

    /* renamed from: h */
    public static final Easing f12490h = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);

    /* renamed from: i */
    public static final Easing f12491i = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);

    /* renamed from: j */
    public static final Easing f12492j = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);

    /* renamed from: k */
    public static final Easing f12493k = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);

    /* renamed from: l */
    public static final Easing f12494l = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);

    /* renamed from: m */
    public static final Easing f12495m = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);

    /* renamed from: n */
    public static final Easing f12496n = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);

    /* renamed from: o */
    public static final Easing f12497o = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);

    /* renamed from: p */
    public static final Easing f12498p = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);

    /* renamed from: q */
    public static final Easing f12499q = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);

    /* renamed from: r */
    public static final Easing f12500r = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);

    /* renamed from: s */
    public static final Easing f12501s = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);

    /* renamed from: t */
    public static final Easing f12502t = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);

    /* renamed from: u */
    public static final Easing f12503u = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);

    /* renamed from: v */
    public static final Easing f12504v = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);

    /* renamed from: w */
    public static final Easing f12505w = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);

    /* renamed from: x */
    public static final Easing f12506x = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);

    /* renamed from: y */
    public static final Easing f12507y = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);

    /* renamed from: z */
    public static final Easing f12508z = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);

    /* renamed from: A */
    public static final Easing f12475A = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);

    /* renamed from: B */
    public static final Easing f12476B = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);

    /* renamed from: C */
    public static final Easing f12477C = C2735b.f12510a;

    /* renamed from: D */
    public static final Easing f12478D = C2739f.f12514a;

    /* renamed from: E */
    public static final Easing f12479E = C2737d.f12512a;

    /* renamed from: F */
    public static final Easing f12480F = C2738e.f12513a;

    /* renamed from: G */
    public static final Easing f12481G = C2734a.f12509a;

    /* renamed from: H */
    public static final Easing f12482H = C2736c.f12511a;

    /* renamed from: androidx.compose.animation.core.EasingFunctionsKt$a */
    /* loaded from: classes.dex */
    public static final class C2734a implements Easing {

        /* renamed from: a */
        public static final C2734a f12509a = new C2734a();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            return 1 - EasingFunctionsKt.getEaseOutBounce().transform(1.0f - f);
        }
    }

    /* renamed from: androidx.compose.animation.core.EasingFunctionsKt$b */
    /* loaded from: classes.dex */
    public static final class C2735b implements Easing {

        /* renamed from: a */
        public static final C2735b f12510a = new C2735b();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f * 10.0f;
            return (float) ((-((float) Math.pow(2.0f, f2 - 10.0f))) * Math.sin((f2 - 10.75f) * 2.0943951023931953d));
        }
    }

    /* renamed from: androidx.compose.animation.core.EasingFunctionsKt$c */
    /* loaded from: classes.dex */
    public static final class C2736c implements Easing {

        /* renamed from: a */
        public static final C2736c f12511a = new C2736c();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float transform;
            if (f < 0.5d) {
                transform = 1 - EasingFunctionsKt.getEaseOutBounce().transform(1.0f - (f * 2.0f));
            } else {
                transform = 1 + EasingFunctionsKt.getEaseOutBounce().transform((f * 2.0f) - 1.0f);
            }
            return transform / 2.0f;
        }
    }

    /* renamed from: androidx.compose.animation.core.EasingFunctionsKt$d */
    /* loaded from: classes.dex */
    public static final class C2737d implements Easing {

        /* renamed from: a */
        public static final C2737d f12512a = new C2737d();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            double d;
            double d2;
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            if (0.0f <= f && f <= 0.5f) {
                float f2 = f * 20.0f;
                return (float) ((-(((float) Math.pow(d2, f2 - 10.0f)) * Math.sin((f2 - 11.125f) * 1.3962634015954636d))) / 2.0f);
            }
            return ((float) ((((float) Math.pow(d, ((-20.0f) * f) + 10.0f)) * Math.sin(((f * 20.0f) - 11.125f) * 1.3962634015954636d)) / 2.0f)) + 1.0f;
        }
    }

    /* renamed from: androidx.compose.animation.core.EasingFunctionsKt$e */
    /* loaded from: classes.dex */
    public static final class C2738e implements Easing {

        /* renamed from: a */
        public static final C2738e f12513a = new C2738e();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float f2;
            float f3;
            if (f < 0.36363637f) {
                return 7.5625f * f * f;
            }
            if (f < 0.72727275f) {
                float f4 = f - 0.54545456f;
                f2 = 7.5625f * f4 * f4;
                f3 = 0.75f;
            } else if (f < 0.90909094f) {
                float f5 = f - 0.8181818f;
                f2 = 7.5625f * f5 * f5;
                f3 = 0.9375f;
            } else {
                float f6 = f - 0.95454544f;
                f2 = 7.5625f * f6 * f6;
                f3 = 0.984375f;
            }
            return f2 + f3;
        }
    }

    /* renamed from: androidx.compose.animation.core.EasingFunctionsKt$f */
    /* loaded from: classes.dex */
    public static final class C2739f implements Easing {

        /* renamed from: a */
        public static final C2739f f12514a = new C2739f();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            return (float) ((((float) Math.pow(2.0f, (-10.0f) * f)) * Math.sin(((f * 10.0f) - 0.75f) * 2.0943951023931953d)) + 1.0f);
        }
    }

    @NotNull
    public static final Easing getEase() {
        return f12483a;
    }

    @NotNull
    public static final Easing getEaseIn() {
        return f12485c;
    }

    @NotNull
    public static final Easing getEaseInBack() {
        return f12508z;
    }

    @NotNull
    public static final Easing getEaseInBounce() {
        return f12481G;
    }

    @NotNull
    public static final Easing getEaseInCirc() {
        return f12496n;
    }

    @NotNull
    public static final Easing getEaseInCubic() {
        return f12490h;
    }

    @NotNull
    public static final Easing getEaseInElastic() {
        return f12477C;
    }

    @NotNull
    public static final Easing getEaseInExpo() {
        return f12505w;
    }

    @NotNull
    public static final Easing getEaseInOut() {
        return f12486d;
    }

    @NotNull
    public static final Easing getEaseInOutBack() {
        return f12476B;
    }

    @NotNull
    public static final Easing getEaseInOutBounce() {
        return f12482H;
    }

    @NotNull
    public static final Easing getEaseInOutCirc() {
        return f12498p;
    }

    @NotNull
    public static final Easing getEaseInOutCubic() {
        return f12492j;
    }

    @NotNull
    public static final Easing getEaseInOutElastic() {
        return f12479E;
    }

    @NotNull
    public static final Easing getEaseInOutExpo() {
        return f12507y;
    }

    @NotNull
    public static final Easing getEaseInOutQuad() {
        return f12501s;
    }

    @NotNull
    public static final Easing getEaseInOutQuart() {
        return f12504v;
    }

    @NotNull
    public static final Easing getEaseInOutQuint() {
        return f12495m;
    }

    @NotNull
    public static final Easing getEaseInOutSine() {
        return f12489g;
    }

    @NotNull
    public static final Easing getEaseInQuad() {
        return f12499q;
    }

    @NotNull
    public static final Easing getEaseInQuart() {
        return f12502t;
    }

    @NotNull
    public static final Easing getEaseInQuint() {
        return f12493k;
    }

    @NotNull
    public static final Easing getEaseInSine() {
        return f12487e;
    }

    @NotNull
    public static final Easing getEaseOut() {
        return f12484b;
    }

    @NotNull
    public static final Easing getEaseOutBack() {
        return f12475A;
    }

    @NotNull
    public static final Easing getEaseOutBounce() {
        return f12480F;
    }

    @NotNull
    public static final Easing getEaseOutCirc() {
        return f12497o;
    }

    @NotNull
    public static final Easing getEaseOutCubic() {
        return f12491i;
    }

    @NotNull
    public static final Easing getEaseOutElastic() {
        return f12478D;
    }

    @NotNull
    public static final Easing getEaseOutExpo() {
        return f12506x;
    }

    @NotNull
    public static final Easing getEaseOutQuad() {
        return f12500r;
    }

    @NotNull
    public static final Easing getEaseOutQuart() {
        return f12503u;
    }

    @NotNull
    public static final Easing getEaseOutQuint() {
        return f12494l;
    }

    @NotNull
    public static final Easing getEaseOutSine() {
        return f12488f;
    }
}
