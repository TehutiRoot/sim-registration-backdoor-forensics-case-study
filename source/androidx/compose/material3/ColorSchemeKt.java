package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aµ\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aµ\u0002\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010 \u001a\u001f\u0010'\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010$\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a\u001d\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a)\u0010.\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a\u001f\u00101\u001a\u00020\u0000*\u00020\u001e2\u0006\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a\u001b\u00104\u001a\u000203*\u00020\u001e2\u0006\u00102\u001a\u00020\u001eH\u0000¢\u0006\u0004\b4\u00105\u001a\u001e\u00108\u001a\u00020\u0000*\u00020\u001e2\u0006\u00107\u001a\u000206H\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a\u0016\u0010:\u001a\u00020\u0000*\u000206H\u0001ø\u0001\u0001¢\u0006\u0004\b:\u0010;\" \u0010A\u001a\b\u0012\u0004\u0012\u00020\u001e0<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0014\u0010C\u001a\u00020B8\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, m28850d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "Landroidx/compose/material3/ColorScheme;", "lightColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "darkColorScheme-G1PFc-w", "darkColorScheme", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/ui/unit/Dp;", "elevation", "applyTonalElevation-Hht5A8o", "(Landroidx/compose/material3/ColorScheme;JF)J", "applyTonalElevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "surfaceColorAtElevation", "other", "", "updateColorSchemeFrom", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/ColorScheme;)V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "value", "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "toColor", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColorScheme", "", "DisabledAlpha", "F", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,615:1\n658#2:616\n646#2:617\n76#3:618\n154#4:619\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorSchemeKt\n*L\n475#1:616\n475#1:617\n476#1:618\n504#1:619\n*E\n"})
/* loaded from: classes2.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;

    /* renamed from: a */
    public static final ProvidableCompositionLocal f25678a = CompositionLocalKt.staticCompositionLocalOf(ColorSchemeKt$LocalColorScheme$1.INSTANCE);

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: applyTonalElevation-Hht5A8o  reason: not valid java name */
    public static final long m70294applyTonalElevationHht5A8o(@NotNull ColorScheme applyTonalElevation, long j, float f) {
        Intrinsics.checkNotNullParameter(applyTonalElevation, "$this$applyTonalElevation");
        if (Color.m71736equalsimpl0(j, applyTonalElevation.m70260getSurface0d7_KjU())) {
            return m70301surfaceColorAtElevation3ABfNKs(applyTonalElevation, f);
        }
        return j;
    }

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m70295contentColorFor4WTKRHQ(@NotNull ColorScheme contentColorFor, long j) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        if (Color.m71736equalsimpl0(j, contentColorFor.m70255getPrimary0d7_KjU())) {
            return contentColorFor.m70245getOnPrimary0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70258getSecondary0d7_KjU())) {
            return contentColorFor.m70247getOnSecondary0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70263getTertiary0d7_KjU())) {
            return contentColorFor.m70251getOnTertiary0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70236getBackground0d7_KjU())) {
            return contentColorFor.m70242getOnBackground0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70237getError0d7_KjU())) {
            return contentColorFor.m70243getOnError0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70260getSurface0d7_KjU())) {
            return contentColorFor.m70249getOnSurface0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70262getSurfaceVariant0d7_KjU())) {
            return contentColorFor.m70250getOnSurfaceVariant0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70256getPrimaryContainer0d7_KjU())) {
            return contentColorFor.m70246getOnPrimaryContainer0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70259getSecondaryContainer0d7_KjU())) {
            return contentColorFor.m70248getOnSecondaryContainer0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70264getTertiaryContainer0d7_KjU())) {
            return contentColorFor.m70252getOnTertiaryContainer0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70238getErrorContainer0d7_KjU())) {
            return contentColorFor.m70244getOnErrorContainer0d7_KjU();
        }
        if (Color.m71736equalsimpl0(j, contentColorFor.m70241getInverseSurface0d7_KjU())) {
            return contentColorFor.m70239getInverseOnSurface0d7_KjU();
        }
        return Color.Companion.m71771getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m70296contentColorForek8zF_U(long j, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:473)");
        }
        long m70295contentColorFor4WTKRHQ = m70295contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (m70295contentColorFor4WTKRHQ == Color.Companion.m71771getUnspecified0d7_KjU()) {
            m70295contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m71745unboximpl();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m70295contentColorFor4WTKRHQ;
    }

    @NotNull
    /* renamed from: darkColorScheme-G1PFc-w  reason: not valid java name */
    public static final ColorScheme m70297darkColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default  reason: not valid java name */
    public static /* synthetic */ ColorScheme m70298darkColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long m70877getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m70877getPrimary0d7_KjU() : j;
        return m70297darkColorSchemeG1PFcw(m70877getPrimary0d7_KjU, (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m70867getOnPrimary0d7_KjU() : j2, (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m70878getPrimaryContainer0d7_KjU() : j3, (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m70868getOnPrimaryContainer0d7_KjU() : j4, (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m70862getInversePrimary0d7_KjU() : j5, (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m70880getSecondary0d7_KjU() : j6, (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m70869getOnSecondary0d7_KjU() : j7, (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m70881getSecondaryContainer0d7_KjU() : j8, (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m70870getOnSecondaryContainer0d7_KjU() : j9, (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m70885getTertiary0d7_KjU() : j10, (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m70873getOnTertiary0d7_KjU() : j11, (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m70886getTertiaryContainer0d7_KjU() : j12, (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m70874getOnTertiaryContainer0d7_KjU() : j13, (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m70858getBackground0d7_KjU() : j14, (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m70864getOnBackground0d7_KjU() : j15, (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m70882getSurface0d7_KjU() : j16, (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m70871getOnSurface0d7_KjU() : j17, (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m70884getSurfaceVariant0d7_KjU() : j18, (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m70872getOnSurfaceVariant0d7_KjU() : j19, (i & 524288) != 0 ? m70877getPrimary0d7_KjU : j20, (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m70863getInverseSurface0d7_KjU() : j21, (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m70861getInverseOnSurface0d7_KjU() : j22, (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m70859getError0d7_KjU() : j23, (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m70865getOnError0d7_KjU() : j24, (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m70860getErrorContainer0d7_KjU() : j25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? ColorDarkTokens.INSTANCE.m70866getOnErrorContainer0d7_KjU() : j26, (i & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m70875getOutline0d7_KjU() : j27, (i & 134217728) != 0 ? ColorDarkTokens.INSTANCE.m70876getOutlineVariant0d7_KjU() : j28, (i & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m70879getScrim0d7_KjU() : j29);
    }

    public static final long fromToken(@NotNull ColorScheme colorScheme, @NotNull ColorSchemeKeyTokens value) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return colorScheme.m70236getBackground0d7_KjU();
            case 2:
                return colorScheme.m70237getError0d7_KjU();
            case 3:
                return colorScheme.m70238getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m70239getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m70240getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m70241getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m70242getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m70243getOnError0d7_KjU();
            case 9:
                return colorScheme.m70244getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m70245getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m70246getOnPrimaryContainer0d7_KjU();
            case 12:
                return colorScheme.m70247getOnSecondary0d7_KjU();
            case 13:
                return colorScheme.m70248getOnSecondaryContainer0d7_KjU();
            case 14:
                return colorScheme.m70249getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m70250getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m70261getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m70251getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m70252getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m70253getOutline0d7_KjU();
            case 20:
                return colorScheme.m70254getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m70255getPrimary0d7_KjU();
            case 22:
                return colorScheme.m70256getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m70257getScrim0d7_KjU();
            case 24:
                return colorScheme.m70258getSecondary0d7_KjU();
            case 25:
                return colorScheme.m70259getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m70260getSurface0d7_KjU();
            case 27:
                return colorScheme.m70262getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m70263getTertiary0d7_KjU();
            case 29:
                return colorScheme.m70264getTertiaryContainer0d7_KjU();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return f25678a;
    }

    @NotNull
    /* renamed from: lightColorScheme-G1PFc-w  reason: not valid java name */
    public static final ColorScheme m70299lightColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default  reason: not valid java name */
    public static /* synthetic */ ColorScheme m70300lightColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long m70906getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m70906getPrimary0d7_KjU() : j;
        return m70299lightColorSchemeG1PFcw(m70906getPrimary0d7_KjU, (i & 2) != 0 ? ColorLightTokens.INSTANCE.m70896getOnPrimary0d7_KjU() : j2, (i & 4) != 0 ? ColorLightTokens.INSTANCE.m70907getPrimaryContainer0d7_KjU() : j3, (i & 8) != 0 ? ColorLightTokens.INSTANCE.m70897getOnPrimaryContainer0d7_KjU() : j4, (i & 16) != 0 ? ColorLightTokens.INSTANCE.m70891getInversePrimary0d7_KjU() : j5, (i & 32) != 0 ? ColorLightTokens.INSTANCE.m70909getSecondary0d7_KjU() : j6, (i & 64) != 0 ? ColorLightTokens.INSTANCE.m70898getOnSecondary0d7_KjU() : j7, (i & 128) != 0 ? ColorLightTokens.INSTANCE.m70910getSecondaryContainer0d7_KjU() : j8, (i & 256) != 0 ? ColorLightTokens.INSTANCE.m70899getOnSecondaryContainer0d7_KjU() : j9, (i & 512) != 0 ? ColorLightTokens.INSTANCE.m70914getTertiary0d7_KjU() : j10, (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m70902getOnTertiary0d7_KjU() : j11, (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m70915getTertiaryContainer0d7_KjU() : j12, (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m70903getOnTertiaryContainer0d7_KjU() : j13, (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m70887getBackground0d7_KjU() : j14, (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m70893getOnBackground0d7_KjU() : j15, (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m70911getSurface0d7_KjU() : j16, (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m70900getOnSurface0d7_KjU() : j17, (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m70913getSurfaceVariant0d7_KjU() : j18, (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m70901getOnSurfaceVariant0d7_KjU() : j19, (i & 524288) != 0 ? m70906getPrimary0d7_KjU : j20, (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m70892getInverseSurface0d7_KjU() : j21, (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m70890getInverseOnSurface0d7_KjU() : j22, (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m70888getError0d7_KjU() : j23, (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m70894getOnError0d7_KjU() : j24, (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m70889getErrorContainer0d7_KjU() : j25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? ColorLightTokens.INSTANCE.m70895getOnErrorContainer0d7_KjU() : j26, (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m70904getOutline0d7_KjU() : j27, (i & 134217728) != 0 ? ColorLightTokens.INSTANCE.m70905getOutlineVariant0d7_KjU() : j28, (i & 268435456) != 0 ? ColorLightTokens.INSTANCE.m70908getScrim0d7_KjU() : j29);
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs  reason: not valid java name */
    public static final long m70301surfaceColorAtElevation3ABfNKs(@NotNull ColorScheme surfaceColorAtElevation, float f) {
        Intrinsics.checkNotNullParameter(surfaceColorAtElevation, "$this$surfaceColorAtElevation");
        if (C3641Dp.m73663equalsimpl0(f, C3641Dp.m73658constructorimpl(0))) {
            return surfaceColorAtElevation.m70260getSurface0d7_KjU();
        }
        return ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(surfaceColorAtElevation.m70261getSurfaceTint0d7_KjU(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), surfaceColorAtElevation.m70260getSurface0d7_KjU());
    }

    @Composable
    @ReadOnlyComposable
    public static final long toColor(@NotNull ColorSchemeKeyTokens colorSchemeKeyTokens, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colorSchemeKeyTokens, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330949347, i, -1, "androidx.compose.material3.toColor (ColorScheme.kt:611)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    public static final void updateColorSchemeFrom(@NotNull ColorScheme colorScheme, @NotNull ColorScheme other) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colorScheme.m70284setPrimary8_81llA$material3_release(other.m70255getPrimary0d7_KjU());
        colorScheme.m70274setOnPrimary8_81llA$material3_release(other.m70245getOnPrimary0d7_KjU());
        colorScheme.m70285setPrimaryContainer8_81llA$material3_release(other.m70256getPrimaryContainer0d7_KjU());
        colorScheme.m70275setOnPrimaryContainer8_81llA$material3_release(other.m70246getOnPrimaryContainer0d7_KjU());
        colorScheme.m70269setInversePrimary8_81llA$material3_release(other.m70240getInversePrimary0d7_KjU());
        colorScheme.m70287setSecondary8_81llA$material3_release(other.m70258getSecondary0d7_KjU());
        colorScheme.m70276setOnSecondary8_81llA$material3_release(other.m70247getOnSecondary0d7_KjU());
        colorScheme.m70288setSecondaryContainer8_81llA$material3_release(other.m70259getSecondaryContainer0d7_KjU());
        colorScheme.m70277setOnSecondaryContainer8_81llA$material3_release(other.m70248getOnSecondaryContainer0d7_KjU());
        colorScheme.m70292setTertiary8_81llA$material3_release(other.m70263getTertiary0d7_KjU());
        colorScheme.m70280setOnTertiary8_81llA$material3_release(other.m70251getOnTertiary0d7_KjU());
        colorScheme.m70293setTertiaryContainer8_81llA$material3_release(other.m70264getTertiaryContainer0d7_KjU());
        colorScheme.m70281setOnTertiaryContainer8_81llA$material3_release(other.m70252getOnTertiaryContainer0d7_KjU());
        colorScheme.m70265setBackground8_81llA$material3_release(other.m70236getBackground0d7_KjU());
        colorScheme.m70271setOnBackground8_81llA$material3_release(other.m70242getOnBackground0d7_KjU());
        colorScheme.m70289setSurface8_81llA$material3_release(other.m70260getSurface0d7_KjU());
        colorScheme.m70278setOnSurface8_81llA$material3_release(other.m70249getOnSurface0d7_KjU());
        colorScheme.m70291setSurfaceVariant8_81llA$material3_release(other.m70262getSurfaceVariant0d7_KjU());
        colorScheme.m70279setOnSurfaceVariant8_81llA$material3_release(other.m70250getOnSurfaceVariant0d7_KjU());
        colorScheme.m70290setSurfaceTint8_81llA$material3_release(other.m70261getSurfaceTint0d7_KjU());
        colorScheme.m70270setInverseSurface8_81llA$material3_release(other.m70241getInverseSurface0d7_KjU());
        colorScheme.m70268setInverseOnSurface8_81llA$material3_release(other.m70239getInverseOnSurface0d7_KjU());
        colorScheme.m70266setError8_81llA$material3_release(other.m70237getError0d7_KjU());
        colorScheme.m70272setOnError8_81llA$material3_release(other.m70243getOnError0d7_KjU());
        colorScheme.m70267setErrorContainer8_81llA$material3_release(other.m70238getErrorContainer0d7_KjU());
        colorScheme.m70273setOnErrorContainer8_81llA$material3_release(other.m70244getOnErrorContainer0d7_KjU());
        colorScheme.m70282setOutline8_81llA$material3_release(other.m70253getOutline0d7_KjU());
        colorScheme.m70283setOutlineVariant8_81llA$material3_release(other.m70254getOutlineVariant0d7_KjU());
        colorScheme.m70286setScrim8_81llA$material3_release(other.m70257getScrim0d7_KjU());
    }
}
