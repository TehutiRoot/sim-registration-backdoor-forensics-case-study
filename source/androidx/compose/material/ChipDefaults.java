package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.unit.C3641Dp;
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
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\rJo\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018Jo\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018R \u0010!\u001a\u00020\u001c8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\"8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\"8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001eR \u0010(\u001a\u00020\u001c8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 R \u0010+\u001a\u00020\u001c8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R \u0010.\u001a\u00020\u001c8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 R\u0011\u00102\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, m28850d2 = {"Landroidx/compose/material/ChipDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "Landroidx/compose/material/ChipColors;", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "chipColors", "outlinedChipColors-5tl4gsc", "outlinedChipColors", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "Landroidx/compose/material/SelectableChipColors;", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "filterChipColors", "outlinedFilterChipColors-J08w3-E", "outlinedFilterChipColors", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", "", "LeadingIconOpacity", "ContentOpacity", "OutlinedBorderOpacity", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", OperatorName.CURVE_TO, "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "d", "getSelectedIconSize-D9Ej5fM", "SelectedIconSize", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedBorder", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,753:1\n154#2:754\n154#2:755\n154#2:756\n154#2:757\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n370#1:754\n565#1:755\n570#1:756\n575#1:757\n*E\n"})
/* loaded from: classes.dex */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;
    @NotNull
    public static final ChipDefaults INSTANCE = new ChipDefaults();

    /* renamed from: a */
    public static final float f14408a = C3641Dp.m73658constructorimpl(32);

    /* renamed from: b */
    public static final float f14409b = C3641Dp.m73658constructorimpl(1);

    /* renamed from: c */
    public static final float f14410c = C3641Dp.m73658constructorimpl(20);

    /* renamed from: d */
    public static final float f14411d = C3641Dp.m73658constructorimpl(18);

    @Composable
    @NotNull
    /* renamed from: chipColors-5tl4gsc  reason: not valid java name */
    public final ChipColors m69953chipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(1838505436);
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j7 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(materialTheme.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m69974getSurface0d7_KjU());
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = Color.m71734copywmQWz5c$default(j8, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j10 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(materialTheme2.getColors(composer, 6).m69969getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m69974getSurface0d7_KjU());
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = Color.m71734copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = Color.m71734copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:384)");
        }
        C12426oE c12426oE = new C12426oE(j7, j8, j9, j10, j11, j12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c12426oE;
    }

    @Composable
    @NotNull
    /* renamed from: filterChipColors-J08w3-E  reason: not valid java name */
    public final SelectableChipColors m69954filterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, @Nullable Composer composer, int i, int i2) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        composer.startReplaceableGroup(830140629);
        if ((i2 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j10 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(materialTheme.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m69974getSurface0d7_KjU());
        } else {
            j10 = j;
        }
        if ((i2 & 2) != 0) {
            j11 = Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j2;
        }
        if ((i2 & 4) != 0) {
            j12 = Color.m71734copywmQWz5c$default(j11, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j3;
        }
        if ((i2 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j13 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(materialTheme2.getColors(composer, 6).m69969getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m69974getSurface0d7_KjU());
        } else {
            j13 = j4;
        }
        if ((i2 & 16) != 0) {
            j14 = Color.m71734copywmQWz5c$default(j11, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j5;
        }
        if ((i2 & 32) != 0) {
            j15 = Color.m71734copywmQWz5c$default(j12, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j6;
        }
        if ((i2 & 64) != 0) {
            j16 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j10);
        } else {
            j16 = j7;
        }
        if ((i2 & 128) != 0) {
            j17 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j11);
        } else {
            j17 = j8;
        }
        if ((i2 & 256) != 0) {
            j18 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j12);
        } else {
            j18 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830140629, i, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:454)");
        }
        C1000OE c1000oe = new C1000OE(j10, j11, j12, j13, j14, j15, j16, j17, j18, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c1000oe;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m69955getLeadingIconSizeD9Ej5fM() {
        return f14410c;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m69956getMinHeightD9Ej5fM() {
        return f14408a;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1650225597);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:542)");
        }
        BorderStroke m69339BorderStrokecXLIe8U = BorderStrokeKt.m69339BorderStrokecXLIe8U(f14409b, Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69339BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM  reason: not valid java name */
    public final float m69957getOutlinedBorderSizeD9Ej5fM() {
        return f14409b;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM  reason: not valid java name */
    public final float m69958getSelectedIconSizeD9Ej5fM() {
        return f14411d;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedChipColors-5tl4gsc  reason: not valid java name */
    public final ChipColors m69959outlinedChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-1763922662);
        if ((i2 & 1) != 0) {
            j7 = MaterialTheme.INSTANCE.getColors(composer, 6).m69974getSurface0d7_KjU();
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = Color.m71734copywmQWz5c$default(j8, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = j7;
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = Color.m71734copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = Color.m71734copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:420)");
        }
        ChipColors m69953chipColors5tl4gsc = m69953chipColors5tl4gsc(j7, j8, j9, j10, j11, j12, composer, i & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m69953chipColors5tl4gsc;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedFilterChipColors-J08w3-E  reason: not valid java name */
    public final SelectableChipColors m69960outlinedFilterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, @Nullable Composer composer, int i, int i2) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        composer.startReplaceableGroup(346878099);
        if ((i2 & 1) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, 6).m69974getSurface0d7_KjU();
        } else {
            j10 = j;
        }
        if ((i2 & 2) != 0) {
            j11 = Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j2;
        }
        if ((i2 & 4) != 0) {
            j12 = Color.m71734copywmQWz5c$default(j11, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j3;
        }
        if ((i2 & 8) != 0) {
            j13 = j10;
        } else {
            j13 = j4;
        }
        if ((i2 & 16) != 0) {
            j14 = Color.m71734copywmQWz5c$default(j11, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j5;
        }
        if ((i2 & 32) != 0) {
            j15 = Color.m71734copywmQWz5c$default(j12, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j6;
        }
        if ((i2 & 64) != 0) {
            j16 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j10);
        } else {
            j16 = j7;
        }
        if ((i2 & 128) != 0) {
            j17 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j11);
        } else {
            j17 = j8;
        }
        if ((i2 & 256) != 0) {
            j18 = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j12);
        } else {
            j18 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346878099, i, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:505)");
        }
        C1000OE c1000oe = new C1000OE(j10, j11, j12, j13, j14, j15, j16, j17, j18, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c1000oe;
    }
}
