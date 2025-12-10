package androidx.compose.material;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u008b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u008b\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u001f\u0010\u0016\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\" \u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0018\u0010%\u001a\u00020\u0000*\u00020\r8Fø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, m28850d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "darkColors-2qZNXz8", "darkColors", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "other", "", "updateColorsFrom", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Colors;)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "primarySurface", "material_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,337:1\n658#2:338\n646#2:339\n76#3:340\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n297#1:338\n297#1:339\n297#1:340\n*E\n"})
/* loaded from: classes.dex */
public final class ColorsKt {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f14430a = CompositionLocalKt.staticCompositionLocalOf(ColorsKt$LocalColors$1.INSTANCE);

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m69987contentColorFor4WTKRHQ(@NotNull Colors contentColorFor, long j) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        if (Color.m71736equalsimpl0(j, contentColorFor.m69970getPrimary0d7_KjU())) {
            return contentColorFor.m69967getOnPrimary0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m69971getPrimaryVariant0d7_KjU())) {
            return contentColorFor.m69967getOnPrimary0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m69972getSecondary0d7_KjU())) {
            return contentColorFor.m69968getOnSecondary0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m69973getSecondaryVariant0d7_KjU())) {
            return contentColorFor.m69968getOnSecondary0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m69963getBackground0d7_KjU())) {
            return contentColorFor.m69965getOnBackground0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m69974getSurface0d7_KjU())) {
            return contentColorFor.m69969getOnSurface0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m69964getError0d7_KjU())) {
            return contentColorFor.m69966getOnError0d7_KjU();
        }
        return Color.Companion.m71771getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m69988contentColorForek8zF_U(long j, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long m69987contentColorFor4WTKRHQ = m69987contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (m69987contentColorFor4WTKRHQ == Color.Companion.m71771getUnspecified0d7_KjU()) {
            m69987contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m71745unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m69987contentColorFor4WTKRHQ;
    }

    @NotNull
    /* renamed from: darkColors-2qZNXz8  reason: not valid java name */
    public static final Colors m69989darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    /* renamed from: darkColors-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ Colors m69990darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long Color = (i & 1) != 0 ? ColorKt.Color(4290479868L) : j;
        long Color2 = (i & 2) != 0 ? ColorKt.Color(4281794739L) : j2;
        long Color3 = (i & 4) != 0 ? ColorKt.Color(4278442694L) : j3;
        return m69989darkColors2qZNXz8(Color, Color2, Color3, (i & 8) != 0 ? Color3 : j4, (i & 16) != 0 ? ColorKt.Color(4279374354L) : j5, (i & 32) != 0 ? ColorKt.Color(4279374354L) : j6, (i & 64) != 0 ? ColorKt.Color(4291782265L) : j7, (i & 128) != 0 ? Color.Companion.m71761getBlack0d7_KjU() : j8, (i & 256) != 0 ? Color.Companion.m71761getBlack0d7_KjU() : j9, (i & 512) != 0 ? Color.Companion.m71772getWhite0d7_KjU() : j10, (i & 1024) != 0 ? Color.Companion.m71772getWhite0d7_KjU() : j11, (i & 2048) != 0 ? Color.Companion.m71761getBlack0d7_KjU() : j12);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return f14430a;
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        if (colors.isLight()) {
            return colors.m69970getPrimary0d7_KjU();
        }
        return colors.m69974getSurface0d7_KjU();
    }

    @NotNull
    /* renamed from: lightColors-2qZNXz8  reason: not valid java name */
    public static final Colors m69991lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors other) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colors.m69982setPrimary8_81llA$material_release(other.m69970getPrimary0d7_KjU());
        colors.m69983setPrimaryVariant8_81llA$material_release(other.m69971getPrimaryVariant0d7_KjU());
        colors.m69984setSecondary8_81llA$material_release(other.m69972getSecondary0d7_KjU());
        colors.m69985setSecondaryVariant8_81llA$material_release(other.m69973getSecondaryVariant0d7_KjU());
        colors.m69975setBackground8_81llA$material_release(other.m69963getBackground0d7_KjU());
        colors.m69986setSurface8_81llA$material_release(other.m69974getSurface0d7_KjU());
        colors.m69976setError8_81llA$material_release(other.m69964getError0d7_KjU());
        colors.m69979setOnPrimary8_81llA$material_release(other.m69967getOnPrimary0d7_KjU());
        colors.m69980setOnSecondary8_81llA$material_release(other.m69968getOnSecondary0d7_KjU());
        colors.m69977setOnBackground8_81llA$material_release(other.m69965getOnBackground0d7_KjU());
        colors.m69981setOnSurface8_81llA$material_release(other.m69969getOnSurface0d7_KjU());
        colors.m69978setOnError8_81llA$material_release(other.m69966getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }
}
