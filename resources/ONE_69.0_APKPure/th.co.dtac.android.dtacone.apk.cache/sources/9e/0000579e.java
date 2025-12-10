package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000bJ=\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ=\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ=\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u000bJG\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001dJG\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001dR\u001d\u0010%\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010'\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u0010$R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010/\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b.\u0010$R\u0017\u00102\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,R\u001d\u00104\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b3\u0010$R\u0017\u00107\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010,R\u001d\u00109\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b8\u0010$R\u0017\u0010<\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010,R \u0010@\u001a\u00020\u00158\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010?R \u0010C\u001a\u00020\u00158\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010$\u001a\u0004\bB\u0010?R \u0010F\u001a\u00020\u00158\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010$\u001a\u0004\bE\u0010?R \u0010I\u001a\u00020\u00158\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010$\u001a\u0004\bH\u0010?R\u0011\u0010M\u001a\u00020J8G¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010O\u001a\u00020J8G¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0011\u0010Q\u001a\u00020J8G¢\u0006\u0006\u001a\u0004\bP\u0010LR\u0011\u0010S\u001a\u00020J8G¢\u0006\u0006\u001a\u0004\bR\u0010LR\u0011\u0010U\u001a\u00020J8G¢\u0006\u0006\u001a\u0004\bT\u0010LR\u0011\u0010Y\u001a\u00020V8G¢\u0006\u0006\u001a\u0004\bW\u0010X\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Z"}, m29142d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "Landroidx/compose/material3/ButtonColors;", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "buttonColors", "elevatedButtonColors-ro_MJ88", "elevatedButtonColors", "filledTonalButtonColors-ro_MJ88", "filledTonalButtonColors", "outlinedButtonColors-ro_MJ88", "outlinedButtonColors", "textButtonColors-ro_MJ88", "textButtonColors", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Landroidx/compose/material3/ButtonElevation;", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "buttonElevation", "elevatedButtonElevation-R_JCAzs", "elevatedButtonElevation", "filledTonalButtonElevation-R_JCAzs", "filledTonalButtonElevation", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "ButtonHorizontalPadding", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "d", "ButtonWithIconHorizontalStartPadding", "e", "getButtonWithIconContentPadding", "ButtonWithIconContentPadding", OperatorName.FILL_NON_ZERO, "TextButtonHorizontalPadding", OperatorName.NON_STROKING_GRAY, "getTextButtonContentPadding", "TextButtonContentPadding", OperatorName.CLOSE_PATH, "TextButtonWithIconHorizontalEndPadding", "i", "getTextButtonWithIconContentPadding", "TextButtonWithIconContentPadding", OperatorName.SET_LINE_JOINSTYLE, "getMinWidth-D9Ej5fM", "()F", "MinWidth", OperatorName.NON_STROKING_CMYK, "getMinHeight-D9Ej5fM", "MinHeight", OperatorName.LINE_TO, "getIconSize-D9Ej5fM", "IconSize", OperatorName.MOVE_TO, "getIconSpacing-D9Ej5fM", "IconSpacing", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getElevatedShape", "elevatedShape", "getFilledTonalShape", "filledTonalShape", "getOutlinedShape", "outlinedShape", "getTextShape", "textShape", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedButtonBorder", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,956:1\n154#2:957\n154#2:958\n154#2:959\n154#2:960\n154#2:961\n154#2:962\n154#2:963\n154#2:964\n154#2:965\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n738#1:957\n451#1:958\n452#1:959\n471#1:960\n482#1:961\n497#1:962\n512#1:963\n518#1:964\n526#1:965\n*E\n"})
/* loaded from: classes2.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();

    /* renamed from: a */
    public static final float f25657a;

    /* renamed from: b */
    public static final float f25658b;

    /* renamed from: c */
    public static final PaddingValues f25659c;

    /* renamed from: d */
    public static final float f25660d;

    /* renamed from: e */
    public static final PaddingValues f25661e;

    /* renamed from: f */
    public static final float f25662f;

    /* renamed from: g */
    public static final PaddingValues f25663g;

    /* renamed from: h */
    public static final float f25664h;

    /* renamed from: i */
    public static final PaddingValues f25665i;

    /* renamed from: j */
    public static final float f25666j;

    /* renamed from: k */
    public static final float f25667k;

    /* renamed from: l */
    public static final float f25668l;

    /* renamed from: m */
    public static final float f25669m;

    static {
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(24);
        f25657a = m73842constructorimpl;
        float f = 8;
        float m73842constructorimpl2 = C3623Dp.m73842constructorimpl(f);
        f25658b = m73842constructorimpl2;
        PaddingValues m69709PaddingValuesa9UjIt4 = PaddingKt.m69709PaddingValuesa9UjIt4(m73842constructorimpl, m73842constructorimpl2, m73842constructorimpl, m73842constructorimpl2);
        f25659c = m69709PaddingValuesa9UjIt4;
        float f2 = 16;
        float m73842constructorimpl3 = C3623Dp.m73842constructorimpl(f2);
        f25660d = m73842constructorimpl3;
        f25661e = PaddingKt.m69709PaddingValuesa9UjIt4(m73842constructorimpl3, m73842constructorimpl2, m73842constructorimpl, m73842constructorimpl2);
        float m73842constructorimpl4 = C3623Dp.m73842constructorimpl(12);
        f25662f = m73842constructorimpl4;
        f25663g = PaddingKt.m69709PaddingValuesa9UjIt4(m73842constructorimpl4, m69709PaddingValuesa9UjIt4.mo69345calculateTopPaddingD9Ej5fM(), m73842constructorimpl4, m69709PaddingValuesa9UjIt4.mo69342calculateBottomPaddingD9Ej5fM());
        float m73842constructorimpl5 = C3623Dp.m73842constructorimpl(f2);
        f25664h = m73842constructorimpl5;
        f25665i = PaddingKt.m69709PaddingValuesa9UjIt4(m73842constructorimpl4, m69709PaddingValuesa9UjIt4.mo69345calculateTopPaddingD9Ej5fM(), m73842constructorimpl5, m69709PaddingValuesa9UjIt4.mo69342calculateBottomPaddingD9Ej5fM());
        f25666j = C3623Dp.m73842constructorimpl(58);
        f25667k = C3623Dp.m73842constructorimpl(40);
        f25668l = FilledButtonTokens.INSTANCE.m71214getIconSizeD9Ej5fM();
        f25669m = C3623Dp.m73842constructorimpl(f);
    }

    @Composable
    @NotNull
    /* renamed from: buttonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m70394buttonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        composer.startReplaceableGroup(-339300779);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m71918copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m71918copywmQWz5c$default(ColorSchemeKt.toColor(FilledButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:552)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    @NotNull
    /* renamed from: buttonElevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m70395buttonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, @Nullable Composer composer, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        composer.startReplaceableGroup(1827791191);
        if ((i2 & 1) != 0) {
            f6 = FilledButtonTokens.INSTANCE.m71209getContainerElevationD9Ej5fM();
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = FilledButtonTokens.INSTANCE.m71215getPressedContainerElevationD9Ej5fM();
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = FilledButtonTokens.INSTANCE.m71212getFocusContainerElevationD9Ej5fM();
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = FilledButtonTokens.INSTANCE.m71213getHoverContainerElevationD9Ej5fM();
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = FilledButtonTokens.INSTANCE.m71211getDisabledContainerElevationD9Ej5fM();
        } else {
            f10 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:679)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedButtonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m70396elevatedButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        composer.startReplaceableGroup(1507908383);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m71918copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m71918copywmQWz5c$default(ColorSchemeKt.toColor(ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:577)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedButtonElevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m70397elevatedButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, @Nullable Composer composer, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        composer.startReplaceableGroup(1065482445);
        if ((i2 & 1) != 0) {
            f6 = ElevatedButtonTokens.INSTANCE.m71125getContainerElevationD9Ej5fM();
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = ElevatedButtonTokens.INSTANCE.m71131getPressedContainerElevationD9Ej5fM();
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = ElevatedButtonTokens.INSTANCE.m71128getFocusContainerElevationD9Ej5fM();
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = ElevatedButtonTokens.INSTANCE.m71129getHoverContainerElevationD9Ej5fM();
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = ElevatedButtonTokens.INSTANCE.m71127getDisabledContainerElevationD9Ej5fM();
        } else {
            f10 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:705)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    @NotNull
    /* renamed from: filledTonalButtonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m70398filledTonalButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        composer.startReplaceableGroup(1670757653);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.m71918copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m71918copywmQWz5c$default(ColorSchemeKt.toColor(FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:603)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    @NotNull
    /* renamed from: filledTonalButtonElevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m70399filledTonalButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, @Nullable Composer composer, int i, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        composer.startReplaceableGroup(5982871);
        if ((i2 & 1) != 0) {
            f6 = FilledTonalButtonTokens.INSTANCE.m71232getContainerElevationD9Ej5fM();
        } else {
            f6 = f;
        }
        if ((i2 & 2) != 0) {
            f7 = FilledTonalButtonTokens.INSTANCE.m71238getPressedContainerElevationD9Ej5fM();
        } else {
            f7 = f2;
        }
        if ((i2 & 4) != 0) {
            f8 = FilledTonalButtonTokens.INSTANCE.m71235getFocusContainerElevationD9Ej5fM();
        } else {
            f8 = f3;
        }
        if ((i2 & 8) != 0) {
            f9 = FilledTonalButtonTokens.INSTANCE.m71236getHoverContainerElevationD9Ej5fM();
        } else {
            f9 = f4;
        }
        if ((i2 & 16) != 0) {
            f10 = C3623Dp.m73842constructorimpl(0);
        } else {
            f10 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:732)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f6, f7, f8, f9, f10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @NotNull
    public final PaddingValues getButtonWithIconContentPadding() {
        return f25661e;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return f25659c;
    }

    @Composable
    @JvmName(name = "getElevatedShape")
    @NotNull
    public final Shape getElevatedShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2143958791);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:531)");
        }
        Shape shape = ShapesKt.toShape(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getFilledTonalShape")
    @NotNull
    public final Shape getFilledTonalShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-886584987);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:534)");
        }
        Shape shape = ShapesKt.toShape(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m70400getIconSizeD9Ej5fM() {
        return f25668l;
    }

    /* renamed from: getIconSpacing-D9Ej5fM  reason: not valid java name */
    public final float m70401getIconSpacingD9Ej5fM() {
        return f25669m;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m70402getMinHeightD9Ej5fM() {
        return f25667k;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m70403getMinWidthD9Ej5fM() {
        return f25666j;
    }

    @Composable
    @JvmName(name = "getOutlinedButtonBorder")
    @NotNull
    public final BorderStroke getOutlinedButtonBorder(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-563957672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:749)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke m69525BorderStrokecXLIe8U = BorderStrokeKt.m69525BorderStrokecXLIe8U(outlinedButtonTokens.m71317getOutlineWidthD9Ej5fM(), ColorSchemeKt.toColor(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69525BorderStrokecXLIe8U;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2045213065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:537)");
        }
        Shape shape = ShapesKt.toShape(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1234923021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:528)");
        }
        Shape shape = ShapesKt.toShape(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return f25663g;
    }

    @NotNull
    public final PaddingValues getTextButtonWithIconContentPadding() {
        return f25665i;
    }

    @Composable
    @JvmName(name = "getTextShape")
    @NotNull
    public final Shape getTextShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-349121587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:540)");
        }
        Shape shape = ShapesKt.toShape(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedButtonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m70404outlinedButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        composer.startReplaceableGroup(-1778526249);
        if ((i2 & 1) != 0) {
            j5 = Color.Companion.m71954getTransparent0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.Companion.m71954getTransparent0d7_KjU();
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m71918copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:629)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }

    @Composable
    @NotNull
    /* renamed from: textButtonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m70405textButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        composer.startReplaceableGroup(-1402274782);
        if ((i2 & 1) != 0) {
            j5 = Color.Companion.m71954getTransparent0d7_KjU();
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = Color.Companion.m71954getTransparent0d7_KjU();
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = Color.m71918copywmQWz5c$default(ColorSchemeKt.toColor(TextButtonTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:653)");
        }
        ButtonColors buttonColors = new ButtonColors(j5, j6, j7, j8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColors;
    }
}