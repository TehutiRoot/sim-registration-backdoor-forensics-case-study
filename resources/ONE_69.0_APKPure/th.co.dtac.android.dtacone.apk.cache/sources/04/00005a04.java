package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0015\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u001d8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020\u001d8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001a\u0010$\u001a\u00020\u001d8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u001a\u0010&\u001a\u00020\u001d8Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b%\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m29142d2 = {"Landroidx/compose/material3/ProgressIndicatorDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getCircularStrokeWidth-D9Ej5fM", "()F", "CircularStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getLinearStrokeCap-KaPHkGw", "()I", "LinearStrokeCap", OperatorName.CURVE_TO, "getCircularDeterminateStrokeCap-KaPHkGw", "CircularDeterminateStrokeCap", "d", "getCircularIndeterminateStrokeCap-KaPHkGw", "CircularIndeterminateStrokeCap", "Landroidx/compose/animation/core/SpringSpec;", "", "e", "Landroidx/compose/animation/core/SpringSpec;", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "ProgressAnimationSpec", "Landroidx/compose/ui/graphics/Color;", "getLinearColor", "(Landroidx/compose/runtime/Composer;I)J", "linearColor", "getCircularColor", "circularColor", "getLinearTrackColor", "linearTrackColor", "getCircularTrackColor", "circularTrackColor", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();

    /* renamed from: a */
    public static final float f26039a = CircularProgressIndicatorTokens.INSTANCE.m71040getActiveIndicatorWidthD9Ej5fM();

    /* renamed from: b */
    public static final int f26040b;

    /* renamed from: c */
    public static final int f26041c;

    /* renamed from: d */
    public static final int f26042d;

    /* renamed from: e */
    public static final SpringSpec f26043e;

    static {
        StrokeCap.Companion companion = StrokeCap.Companion;
        f26040b = companion.m72227getButtKaPHkGw();
        f26041c = companion.m72227getButtKaPHkGw();
        f26042d = companion.m72229getSquareKaPHkGw();
        f26043e = new SpringSpec(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    @Composable
    @JvmName(name = "getCircularColor")
    public final long getCircularColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1803349725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:509)");
        }
        long color = ColorSchemeKt.toColor(CircularProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getCircularDeterminateStrokeCap-KaPHkGw  reason: not valid java name */
    public final int m70679getCircularDeterminateStrokeCapKaPHkGw() {
        return f26041c;
    }

    /* renamed from: getCircularIndeterminateStrokeCap-KaPHkGw  reason: not valid java name */
    public final int m70680getCircularIndeterminateStrokeCapKaPHkGw() {
        return f26042d;
    }

    /* renamed from: getCircularStrokeWidth-D9Ej5fM  reason: not valid java name */
    public final float m70681getCircularStrokeWidthD9Ej5fM() {
        return f26039a;
    }

    @Composable
    @JvmName(name = "getCircularTrackColor")
    public final long getCircularTrackColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-404222247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404222247, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:517)");
        }
        long m71954getTransparent0d7_KjU = Color.Companion.m71954getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m71954getTransparent0d7_KjU;
    }

    @Composable
    @JvmName(name = "getLinearColor")
    public final long getLinearColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-914312983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-914312983, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:505)");
        }
        long color = ColorSchemeKt.toColor(LinearProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getLinearStrokeCap-KaPHkGw  reason: not valid java name */
    public final int m70682getLinearStrokeCapKaPHkGw() {
        return f26040b;
    }

    @Composable
    @JvmName(name = "getLinearTrackColor")
    public final long getLinearTrackColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1677541593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677541593, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:513)");
        }
        long color = ColorSchemeKt.toColor(LinearProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @NotNull
    public final SpringSpec<Float> getProgressAnimationSpec() {
        return f26043e;
    }
}