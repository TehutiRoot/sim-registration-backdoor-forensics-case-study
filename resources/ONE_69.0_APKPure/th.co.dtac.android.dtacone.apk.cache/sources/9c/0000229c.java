package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\bi\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0014\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u001a\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u0017\u0010 \u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u0017\u0010#\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u0017\u0010&\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004\"\u0017\u0010)\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0004\"\u0017\u0010,\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0004\"\u0017\u0010/\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u0017\u00102\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0004\"\u0017\u00105\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u0017\u00108\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0004\"\u0017\u0010;\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u0017\u0010>\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0004\"\u0017\u0010A\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0004\"\u0017\u0010D\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010\u0004\"\u0017\u0010G\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u0004\"\u0017\u0010J\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u0004\"\u0017\u0010M\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u0004\"\u0017\u0010P\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bN\u0010\u0002\u001a\u0004\bO\u0010\u0004\"\u0017\u0010S\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bQ\u0010\u0002\u001a\u0004\bR\u0010\u0004\"\u0017\u0010V\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u0004\"\u0017\u0010Y\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\u0004\"\u0017\u0010\\\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bZ\u0010\u0002\u001a\u0004\b[\u0010\u0004\"\u0017\u0010_\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b]\u0010\u0002\u001a\u0004\b^\u0010\u0004\"\u0017\u0010b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b`\u0010\u0002\u001a\u0004\ba\u0010\u0004\"\u0017\u0010e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bc\u0010\u0002\u001a\u0004\bd\u0010\u0004\"\u0017\u0010h\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bf\u0010\u0002\u001a\u0004\bg\u0010\u0004¨\u0006i"}, m29142d2 = {"Landroidx/compose/animation/core/Easing;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Easing;", "getEase", "()Landroidx/compose/animation/core/Easing;", "Ease", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEaseOut", "EaseOut", OperatorName.CURVE_TO, "getEaseIn", "EaseIn", "d", "getEaseInOut", "EaseInOut", "e", "getEaseInSine", "EaseInSine", OperatorName.FILL_NON_ZERO, "getEaseOutSine", "EaseOutSine", OperatorName.NON_STROKING_GRAY, "getEaseInOutSine", "EaseInOutSine", OperatorName.CLOSE_PATH, "getEaseInCubic", "EaseInCubic", "i", "getEaseOutCubic", "EaseOutCubic", OperatorName.SET_LINE_JOINSTYLE, "getEaseInOutCubic", "EaseInOutCubic", OperatorName.NON_STROKING_CMYK, "getEaseInQuint", "EaseInQuint", OperatorName.LINE_TO, "getEaseOutQuint", "EaseOutQuint", OperatorName.MOVE_TO, "getEaseInOutQuint", "EaseInOutQuint", OperatorName.ENDPATH, "getEaseInCirc", "EaseInCirc", "o", "getEaseOutCirc", "EaseOutCirc", "p", "getEaseInOutCirc", "EaseInOutCirc", OperatorName.SAVE, "getEaseInQuad", "EaseInQuad", PDPageLabelRange.STYLE_ROMAN_LOWER, "getEaseOutQuad", "EaseOutQuad", OperatorName.CLOSE_AND_STROKE, "getEaseInOutQuad", "EaseInOutQuad", "t", "getEaseInQuart", "EaseInQuart", "u", "getEaseOutQuart", "EaseOutQuart", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getEaseInOutQuart", "EaseInOutQuart", OperatorName.SET_LINE_WIDTH, "getEaseInExpo", "EaseInExpo", "x", "getEaseOutExpo", "EaseOutExpo", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getEaseInOutExpo", "EaseInOutExpo", "z", "getEaseInBack", "EaseInBack", "A", "getEaseOutBack", "EaseOutBack", "B", "getEaseInOutBack", "EaseInOutBack", "C", "getEaseInElastic", "EaseInElastic", "D", "getEaseOutElastic", "EaseOutElastic", ExifInterface.LONGITUDE_EAST, "getEaseInOutElastic", "EaseInOutElastic", "F", "getEaseOutBounce", "EaseOutBounce", OperatorName.STROKING_COLOR_GRAY, "getEaseInBounce", "EaseInBounce", "H", "getEaseInOutBounce", "EaseInOutBounce", "animation-core_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EasingFunctionsKt {

    /* renamed from: a */
    public static final Easing f12571a = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: b */
    public static final Easing f12572b = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);

    /* renamed from: c */
    public static final Easing f12573c = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d */
    public static final Easing f12574d = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: e */
    public static final Easing f12575e = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);

    /* renamed from: f */
    public static final Easing f12576f = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);

    /* renamed from: g */
    public static final Easing f12577g = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);

    /* renamed from: h */
    public static final Easing f12578h = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);

    /* renamed from: i */
    public static final Easing f12579i = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);

    /* renamed from: j */
    public static final Easing f12580j = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);

    /* renamed from: k */
    public static final Easing f12581k = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);

    /* renamed from: l */
    public static final Easing f12582l = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);

    /* renamed from: m */
    public static final Easing f12583m = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);

    /* renamed from: n */
    public static final Easing f12584n = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);

    /* renamed from: o */
    public static final Easing f12585o = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);

    /* renamed from: p */
    public static final Easing f12586p = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);

    /* renamed from: q */
    public static final Easing f12587q = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);

    /* renamed from: r */
    public static final Easing f12588r = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);

    /* renamed from: s */
    public static final Easing f12589s = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);

    /* renamed from: t */
    public static final Easing f12590t = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);

    /* renamed from: u */
    public static final Easing f12591u = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);

    /* renamed from: v */
    public static final Easing f12592v = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);

    /* renamed from: w */
    public static final Easing f12593w = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);

    /* renamed from: x */
    public static final Easing f12594x = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);

    /* renamed from: y */
    public static final Easing f12595y = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);

    /* renamed from: z */
    public static final Easing f12596z = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);

    /* renamed from: A */
    public static final Easing f12563A = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);

    /* renamed from: B */
    public static final Easing f12564B = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);

    /* renamed from: C */
    public static final Easing f12565C = C2717b.f12598a;

    /* renamed from: D */
    public static final Easing f12566D = C2721f.f12602a;

    /* renamed from: E */
    public static final Easing f12567E = C2719d.f12600a;

    /* renamed from: F */
    public static final Easing f12568F = C2720e.f12601a;

    /* renamed from: G */
    public static final Easing f12569G = C2716a.f12597a;

    /* renamed from: H */
    public static final Easing f12570H = C2718c.f12599a;

    /* renamed from: androidx.compose.animation.core.EasingFunctionsKt$a */
    /* loaded from: classes.dex */
    public static final class C2716a implements Easing {

        /* renamed from: a */
        public static final C2716a f12597a = new C2716a();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            return 1 - EasingFunctionsKt.getEaseOutBounce().transform(1.0f - f);
        }
    }

    /* renamed from: androidx.compose.animation.core.EasingFunctionsKt$b */
    /* loaded from: classes.dex */
    public static final class C2717b implements Easing {

        /* renamed from: a */
        public static final C2717b f12598a = new C2717b();

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
    public static final class C2718c implements Easing {

        /* renamed from: a */
        public static final C2718c f12599a = new C2718c();

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
    public static final class C2719d implements Easing {

        /* renamed from: a */
        public static final C2719d f12600a = new C2719d();

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
    public static final class C2720e implements Easing {

        /* renamed from: a */
        public static final C2720e f12601a = new C2720e();

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
    public static final class C2721f implements Easing {

        /* renamed from: a */
        public static final C2721f f12602a = new C2721f();

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
        return f12571a;
    }

    @NotNull
    public static final Easing getEaseIn() {
        return f12573c;
    }

    @NotNull
    public static final Easing getEaseInBack() {
        return f12596z;
    }

    @NotNull
    public static final Easing getEaseInBounce() {
        return f12569G;
    }

    @NotNull
    public static final Easing getEaseInCirc() {
        return f12584n;
    }

    @NotNull
    public static final Easing getEaseInCubic() {
        return f12578h;
    }

    @NotNull
    public static final Easing getEaseInElastic() {
        return f12565C;
    }

    @NotNull
    public static final Easing getEaseInExpo() {
        return f12593w;
    }

    @NotNull
    public static final Easing getEaseInOut() {
        return f12574d;
    }

    @NotNull
    public static final Easing getEaseInOutBack() {
        return f12564B;
    }

    @NotNull
    public static final Easing getEaseInOutBounce() {
        return f12570H;
    }

    @NotNull
    public static final Easing getEaseInOutCirc() {
        return f12586p;
    }

    @NotNull
    public static final Easing getEaseInOutCubic() {
        return f12580j;
    }

    @NotNull
    public static final Easing getEaseInOutElastic() {
        return f12567E;
    }

    @NotNull
    public static final Easing getEaseInOutExpo() {
        return f12595y;
    }

    @NotNull
    public static final Easing getEaseInOutQuad() {
        return f12589s;
    }

    @NotNull
    public static final Easing getEaseInOutQuart() {
        return f12592v;
    }

    @NotNull
    public static final Easing getEaseInOutQuint() {
        return f12583m;
    }

    @NotNull
    public static final Easing getEaseInOutSine() {
        return f12577g;
    }

    @NotNull
    public static final Easing getEaseInQuad() {
        return f12587q;
    }

    @NotNull
    public static final Easing getEaseInQuart() {
        return f12590t;
    }

    @NotNull
    public static final Easing getEaseInQuint() {
        return f12581k;
    }

    @NotNull
    public static final Easing getEaseInSine() {
        return f12575e;
    }

    @NotNull
    public static final Easing getEaseOut() {
        return f12572b;
    }

    @NotNull
    public static final Easing getEaseOutBack() {
        return f12563A;
    }

    @NotNull
    public static final Easing getEaseOutBounce() {
        return f12568F;
    }

    @NotNull
    public static final Easing getEaseOutCirc() {
        return f12585o;
    }

    @NotNull
    public static final Easing getEaseOutCubic() {
        return f12579i;
    }

    @NotNull
    public static final Easing getEaseOutElastic() {
        return f12566D;
    }

    @NotNull
    public static final Easing getEaseOutExpo() {
        return f12594x;
    }

    @NotNull
    public static final Easing getEaseOutQuad() {
        return f12588r;
    }

    @NotNull
    public static final Easing getEaseOutQuart() {
        return f12591u;
    }

    @NotNull
    public static final Easing getEaseOutQuint() {
        return f12582l;
    }

    @NotNull
    public static final Easing getEaseOutSine() {
        return f12576f;
    }
}