package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
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
@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ¡\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u008d\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!R \u0010'\u001a\u00020\"8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010*\u001a\u00020\"8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0011\u0010.\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00102\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0011\u00106\u001a\u0002038G¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00067"}, m28850d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "inputFieldColors", "Landroidx/compose/material3/SearchBarColors;", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "colors", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "cursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "textColor", "placeholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getElevation-D9Ej5fM", "()F", "Elevation", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getInputFieldHeight-D9Ej5fM", "InputFieldHeight", "Landroidx/compose/ui/graphics/Shape;", "getInputFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "inputFieldShape", "getFullScreenShape", "fullScreenShape", "getDockedShape", "dockedShape", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,746:1\n76#2:747\n76#2:748\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarDefaults\n*L\n567#1:747\n605#1:748\n*E\n"})
/* loaded from: classes2.dex */
public final class SearchBarDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();

    /* renamed from: a */
    public static final float f25993a;

    /* renamed from: b */
    public static final float f25994b;

    static {
        SearchBarTokens searchBarTokens = SearchBarTokens.INSTANCE;
        f25993a = searchBarTokens.m71242getContainerElevationD9Ej5fM();
        f25994b = searchBarTokens.m71243getContainerHeightD9Ej5fM();
    }

    @Composable
    @NotNull
    /* renamed from: colors-Klgx-Pg  reason: not valid java name */
    public final SearchBarColors m70522colorsKlgxPg(long j, long j2, @Nullable TextFieldColors textFieldColors, @Nullable Composer composer, int i, int i2) {
        long j3;
        long j4;
        TextFieldColors textFieldColors2;
        composer.startReplaceableGroup(701925149);
        if ((i2 & 1) != 0) {
            j3 = ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j3 = j;
        }
        if ((i2 & 2) != 0) {
            j4 = ColorSchemeKt.toColor(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6);
        } else {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            textFieldColors2 = m70526inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i << 3) & 57344, 16383);
        } else {
            textFieldColors2 = textFieldColors;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(701925149, i, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.kt:525)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(j3, j4, textFieldColors2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return searchBarColors;
    }

    @Composable
    @JvmName(name = "getDockedShape")
    @NotNull
    public final Shape getDockedShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1447354121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1447354121, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.kt:511)");
        }
        Shape shape = ShapesKt.toShape(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getElevation-D9Ej5fM  reason: not valid java name */
    public final float m70523getElevationD9Ej5fM() {
        return f25993a;
    }

    @Composable
    @JvmName(name = "getFullScreenShape")
    @NotNull
    public final Shape getFullScreenShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2009956471);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2009956471, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.kt:508)");
        }
        Shape shape = ShapesKt.toShape(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getInputFieldHeight-D9Ej5fM  reason: not valid java name */
    public final float m70524getInputFieldHeightD9Ej5fM() {
        return f25994b;
    }

    @Composable
    @JvmName(name = "getInputFieldShape")
    @NotNull
    public final Shape getInputFieldShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1770571533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1770571533, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.kt:504)");
        }
        Shape shape = ShapesKt.toShape(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1795925906);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1795925906, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.kt:514)");
        }
        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return statusBars;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: inputFieldColors--u-KgnY  reason: not valid java name */
    public final /* synthetic */ TextFieldColors m70525inputFieldColorsuKgnY(long j, long j2, long j3, TextSelectionColors textSelectionColors, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(1842555178);
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long m71734copywmQWz5c$default = (i3 & 2) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long color2 = (i3 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j3;
        TextSelectionColors textSelectionColors2 = (i3 & 8) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color3 = (i3 & 16) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j4;
        long color4 = (i3 & 32) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long m71734copywmQWz5c$default2 = (i3 & 64) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long color5 = (i3 & 128) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j7;
        long color6 = (i3 & 256) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long m71734copywmQWz5c$default3 = (i3 & 512) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long color7 = (i3 & 1024) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j10;
        long m71734copywmQWz5c$default4 = (i3 & 2048) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1842555178, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:599)");
        }
        int i4 = i << 3;
        int i5 = i2 << 6;
        TextFieldColors m70526inputFieldColorsITpI4ow = m70526inputFieldColorsITpI4ow(color, color, m71734copywmQWz5c$default, color2, textSelectionColors2, color3, color4, m71734copywmQWz5c$default2, color5, color6, m71734copywmQWz5c$default3, color7, color7, m71734copywmQWz5c$default4, composer, (i & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), ((i >> 27) & 14) | ((i2 << 3) & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m70526inputFieldColorsITpI4ow;
    }

    @Composable
    @NotNull
    /* renamed from: inputFieldColors-ITpI4ow  reason: not valid java name */
    public final TextFieldColors m70526inputFieldColorsITpI4ow(long j, long j2, long j3, long j4, @Nullable TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, @Nullable Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(-2048506052);
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long color2 = (i3 & 2) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j2;
        long m71734copywmQWz5c$default = (i3 & 4) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long color3 = (i3 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        TextSelectionColors textSelectionColors2 = (i3 & 16) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i3 & 32) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long color5 = (i3 & 64) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j6;
        long m71734copywmQWz5c$default2 = (i3 & 128) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long color6 = (i3 & 256) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long color7 = (i3 & 512) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j9;
        long m71734copywmQWz5c$default3 = (i3 & 1024) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long color8 = (i3 & 2048) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j11;
        long color9 = (i3 & 4096) != 0 ? ColorSchemeKt.toColor(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j12;
        long m71734copywmQWz5c$default4 = (i3 & 8192) != 0 ? Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2048506052, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.kt:560)");
        }
        int i4 = i2 << 18;
        TextFieldColors m70672colors0hiis_0 = TextFieldDefaults.INSTANCE.m70672colors0hiis_0(color, color2, m71734copywmQWz5c$default, 0L, 0L, 0L, 0L, 0L, color3, 0L, textSelectionColors2, 0L, 0L, 0L, 0L, color4, color5, m71734copywmQWz5c$default2, 0L, color6, color7, m71734copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, color8, color9, m71734copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i & 1022) | ((i << 15) & 234881024), ((i >> 12) & 14) | (458752 & i) | (3670016 & i) | (i & 29360128) | ((i << 3) & 1879048192), ((i >> 27) & 14) | ((i2 << 3) & 112) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m70672colors0hiis_0;
    }
}
