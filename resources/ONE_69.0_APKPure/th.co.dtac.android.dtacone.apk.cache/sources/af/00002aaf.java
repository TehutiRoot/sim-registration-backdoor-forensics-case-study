package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJG\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001aR\u001d\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010,\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R \u0010/\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010+R \u00102\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010+R \u00105\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010+R\u0014\u00107\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u001fR \u0010:\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010+R\u001d\u0010<\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b;\u0010\u001fR\u0017\u0010?\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R\u0011\u0010C\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006D"}, m29142d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "disabledElevation", "Landroidx/compose/material/ButtonElevation;", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "elevation", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "Landroidx/compose/material/ButtonColors;", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "buttonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "outlinedButtonColors", "textButtonColors-RGew2ao", "textButtonColors", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "ButtonHorizontalPadding", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "d", "getMinWidth-D9Ej5fM", "()F", "MinWidth", "e", "getMinHeight-D9Ej5fM", "MinHeight", OperatorName.FILL_NON_ZERO, "getIconSize-D9Ej5fM", "IconSize", OperatorName.NON_STROKING_GRAY, "getIconSpacing-D9Ej5fM", "IconSpacing", "", "OutlinedBorderOpacity", OperatorName.CLOSE_PATH, "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "i", "TextButtonHorizontalPadding", OperatorName.SET_LINE_JOINSTYLE, "getTextButtonContentPadding", "TextButtonContentPadding", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedBorder", "material_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,618:1\n154#2:619\n154#2:620\n154#2:621\n154#2:622\n154#2:623\n154#2:624\n154#2:625\n154#2:626\n154#2:627\n154#2:628\n154#2:638\n154#2:639\n154#2:640\n154#2:641\n154#2:642\n154#2:643\n154#2:644\n154#2:645\n83#3,3:629\n1097#4,6:632\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n347#1:619\n348#1:620\n349#1:621\n354#1:622\n355#1:623\n373#1:624\n374#1:625\n375#1:626\n376#1:627\n377#1:628\n295#1:638\n296#1:639\n312#1:640\n318#1:641\n325#1:642\n332#1:643\n470#1:644\n481#1:645\n379#1:629,3\n379#1:632,6\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    public static final float OutlinedBorderOpacity = 0.12f;

    /* renamed from: a */
    public static final float f14481a;

    /* renamed from: b */
    public static final float f14482b;

    /* renamed from: c */
    public static final PaddingValues f14483c;

    /* renamed from: d */
    public static final float f14484d;

    /* renamed from: e */
    public static final float f14485e;

    /* renamed from: f */
    public static final float f14486f;

    /* renamed from: g */
    public static final float f14487g;

    /* renamed from: h */
    public static final float f14488h;

    /* renamed from: i */
    public static final float f14489i;

    /* renamed from: j */
    public static final PaddingValues f14490j;

    static {
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(16);
        f14481a = m73842constructorimpl;
        float f = 8;
        float m73842constructorimpl2 = C3623Dp.m73842constructorimpl(f);
        f14482b = m73842constructorimpl2;
        PaddingValues m69709PaddingValuesa9UjIt4 = PaddingKt.m69709PaddingValuesa9UjIt4(m73842constructorimpl, m73842constructorimpl2, m73842constructorimpl, m73842constructorimpl2);
        f14483c = m69709PaddingValuesa9UjIt4;
        f14484d = C3623Dp.m73842constructorimpl(64);
        f14485e = C3623Dp.m73842constructorimpl(36);
        f14486f = C3623Dp.m73842constructorimpl(18);
        f14487g = C3623Dp.m73842constructorimpl(f);
        f14488h = C3623Dp.m73842constructorimpl(1);
        float m73842constructorimpl3 = C3623Dp.m73842constructorimpl(f);
        f14489i = m73842constructorimpl3;
        f14490j = PaddingKt.m69709PaddingValuesa9UjIt4(m73842constructorimpl3, m69709PaddingValuesa9UjIt4.mo69345calculateTopPaddingD9Ej5fM(), m73842constructorimpl3, m69709PaddingValuesa9UjIt4.mo69342calculateBottomPaddingD9Ej5fM());
    }

    @Composable
    @NotNull
    /* renamed from: buttonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m70121buttonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        composer.startReplaceableGroup(1870371134);
        if ((i2 & 1) != 0) {
            j5 = MaterialTheme.INSTANCE.getColors(composer, 6).m70154getPrimary0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorsKt.m70172contentColorForek8zF_U(j5, composer, i & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j7 = ColorKt.m71964compositeOverOWjLjI(Color.m71918copywmQWz5c$default(materialTheme.getColors(composer, 6).m70153getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m70158getSurface0d7_KjU());
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m71918copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m70153getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:405)");
        }
        C12423oE c12423oE = new C12423oE(j5, j6, j7, j8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c12423oE;
    }

    @Composable
    @NotNull
    /* renamed from: elevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m70122elevationR_JCAzs(float f, float f2, float f3, float f4, float f5, @Nullable Composer composer, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        composer.startReplaceableGroup(-737170518);
        if ((i2 & 1) != 0) {
            f6 = C3623Dp.m73842constructorimpl(2);
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = C3623Dp.m73842constructorimpl(8);
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = C3623Dp.m73842constructorimpl(0);
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = C3623Dp.m73842constructorimpl(4);
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = C3623Dp.m73842constructorimpl(4);
        } else {
            f10 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:371)");
        }
        Object[] objArr = {C3623Dp.m73840boximpl(f6), C3623Dp.m73840boximpl(f7), C3623Dp.m73840boximpl(f8), C3623Dp.m73840boximpl(f9), C3623Dp.m73840boximpl(f10)};
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultButtonElevation(f6, f7, f8, f9, f10, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    @Composable
    /* renamed from: elevation-yajeYGU  reason: not valid java name */
    public final /* synthetic */ ButtonElevation m70123elevationyajeYGU(float f, float f2, float f3, Composer composer, int i, int i2) {
        float f4;
        float f5;
        float f6;
        composer.startReplaceableGroup(1428576874);
        if ((i2 & 1) != 0) {
            f4 = C3623Dp.m73842constructorimpl(2);
        } else {
            f4 = f;
        }
        if ((i2 & 2) != 0) {
            f5 = C3623Dp.m73842constructorimpl(8);
        } else {
            f5 = f2;
        }
        if ((i2 & 4) != 0) {
            f6 = C3623Dp.m73842constructorimpl(0);
        } else {
            f6 = f3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:345)");
        }
        float f7 = 4;
        ButtonElevation m70122elevationR_JCAzs = m70122elevationR_JCAzs(f4, f5, f6, C3623Dp.m73842constructorimpl(f7), C3623Dp.m73842constructorimpl(f7), composer, (i & 14) | 27648 | (i & 112) | (i & 896) | ((i << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m70122elevationR_JCAzs;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return f14483c;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m70124getIconSizeD9Ej5fM() {
        return f14486f;
    }

    /* renamed from: getIconSpacing-D9Ej5fM  reason: not valid java name */
    public final float m70125getIconSpacingD9Ej5fM() {
        return f14487g;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m70126getMinHeightD9Ej5fM() {
        return f14485e;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m70127getMinWidthD9Ej5fM() {
        return f14484d;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2091313033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        BorderStroke m69525BorderStrokecXLIe8U = BorderStrokeKt.m69525BorderStrokecXLIe8U(f14488h, Color.m71918copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m70153getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69525BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM  reason: not valid java name */
    public final float m70128getOutlinedBorderSizeD9Ej5fM() {
        return f14488h;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return f14490j;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m70129outlinedButtonColorsRGew2ao(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        long j4;
        long j5;
        long j6;
        composer.startReplaceableGroup(-2124406093);
        if ((i2 & 1) != 0) {
            j4 = MaterialTheme.INSTANCE.getColors(composer, 6).m70158getSurface0d7_KjU();
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = MaterialTheme.INSTANCE.getColors(composer, 6).m70154getPrimary0d7_KjU();
        } else {
            j5 = j2;
        }
        if ((i2 & 4) != 0) {
            j6 = Color.m71918copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m70153getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j6 = j3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:428)");
        }
        C12423oE c12423oE = new C12423oE(j4, j5, j4, j6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c12423oE;
    }

    @Composable
    @NotNull
    /* renamed from: textButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m70130textButtonColorsRGew2ao(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        long j4;
        long j5;
        long j6;
        composer.startReplaceableGroup(182742216);
        if ((i2 & 1) != 0) {
            j4 = Color.Companion.m71954getTransparent0d7_KjU();
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = MaterialTheme.INSTANCE.getColors(composer, 6).m70154getPrimary0d7_KjU();
        } else {
            j5 = j2;
        }
        if ((i2 & 4) != 0) {
            j6 = Color.m71918copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m70153getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j6 = j3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:449)");
        }
        C12423oE c12423oE = new C12423oE(j4, j5, j4, j6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c12423oE;
    }
}