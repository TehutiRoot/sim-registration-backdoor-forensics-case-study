package androidx.compose.animation.core;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000f\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, m29142d2 = {"Landroidx/compose/animation/core/Easing;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Easing;", "getFastOutSlowInEasing", "()Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLinearOutSlowInEasing", "LinearOutSlowInEasing", OperatorName.CURVE_TO, "getFastOutLinearInEasing", "FastOutLinearInEasing", "d", "getLinearEasing", "LinearEasing", "animation-core_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EasingKt {

    /* renamed from: a */
    public static final Easing f12603a = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: b */
    public static final Easing f12604b = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: c */
    public static final Easing f12605c = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d */
    public static final Easing f12606d = C2722a.f12607a;

    /* renamed from: androidx.compose.animation.core.EasingKt$a */
    /* loaded from: classes.dex */
    public static final class C2722a implements Easing {

        /* renamed from: a */
        public static final C2722a f12607a = new C2722a();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            return f;
        }
    }

    @NotNull
    public static final Easing getFastOutLinearInEasing() {
        return f12605c;
    }

    @NotNull
    public static final Easing getFastOutSlowInEasing() {
        return f12603a;
    }

    @NotNull
    public static final Easing getLinearEasing() {
        return f12606d;
    }

    @NotNull
    public static final Easing getLinearOutSlowInEasing() {
        return f12604b;
    }
}