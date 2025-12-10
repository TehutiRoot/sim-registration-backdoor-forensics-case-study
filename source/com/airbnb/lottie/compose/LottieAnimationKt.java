package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.annotation.FloatRange;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.ScaleFactor;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.utils.Utils;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¥\u0001\u0010\u001a\u001a\u00020\u00192\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0089\u0001\u0010\u001a\u001a\u00020\u00192\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001c\u001aÕ\u0001\u0010\u001a\u001a\u00020\u00192\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001a\u0010%\u001a\"\u0010*\u001a\u00020)*\u00020&2\u0006\u0010(\u001a\u00020'H\u0082\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m28850d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "Lkotlin/Function0;", "", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "", "outlineMasksAndMattes", "applyOpacityToLayers", "enableMergePaths", "Lcom/airbnb/lottie/RenderMode;", "renderMode", "maintainOriginalImageBounds", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "dynamicProperties", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "clipToCompositionBounds", "", "", "Landroid/graphics/Typeface;", "fontMap", "", "LottieAnimation", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLjava/util/Map;Landroidx/compose/runtime/Composer;III)V", "(Lcom/airbnb/lottie/LottieComposition;FLandroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLandroidx/compose/runtime/Composer;III)V", "isPlaying", "restartOnPlay", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "speed", "", "iterations", "reverseOnRepeat", "(Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/LottieClipSpec;FIZZZLcom/airbnb/lottie/RenderMode;ZZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZLjava/util/Map;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/layout/ScaleFactor;", "scale", "Landroidx/compose/ui/unit/IntSize;", "d", "(JJ)J", "lottie-compose_release"}, m28849k = 2, m28848mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LottieAnimationKt {
    @Composable
    public static final void LottieAnimation(@Nullable LottieComposition lottieComposition, @NotNull Function0<Float> progress, @Nullable Modifier modifier, boolean z, boolean z2, boolean z3, @Nullable RenderMode renderMode, boolean z4, @Nullable LottieDynamicProperties lottieDynamicProperties, @Nullable Alignment alignment, @Nullable ContentScale contentScale, boolean z5, @Nullable Map<String, ? extends Typeface> map, @Nullable Composer composer, int i, int i2, int i3) {
        Modifier modifier2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(progress, "progress");
        Composer startRestartGroup = composer.startRestartGroup(185150686);
        Modifier.Companion companion = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        boolean z7 = (i3 & 16) != 0 ? false : z2;
        boolean z8 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z9 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i3 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i3 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z10 = (i3 & 2048) != 0 ? true : z5;
        Map<String, ? extends Typeface> map2 = (i3 & 4096) != 0 ? null : map;
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new LottieDrawable();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LottieDrawable lottieDrawable = (LottieDrawable) rememberedValue;
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new Matrix();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Matrix matrix = (Matrix) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = AbstractC19508dK1.m31891g(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        startRestartGroup.startReplaceableGroup(185151463);
        if (lottieComposition != null && lottieComposition.getDuration() != 0.0f) {
            startRestartGroup.endReplaceableGroup();
            float dpScale = Utils.dpScale();
            CanvasKt.Canvas(SizeKt.m69566sizeVpY3zN4(companion, C3641Dp.m73658constructorimpl(lottieComposition.getBounds().width() / dpScale), C3641Dp.m73658constructorimpl(lottieComposition.getBounds().height() / dpScale)), new LottieAnimationKt$LottieAnimation$2(lottieComposition, fit, center, matrix, lottieDrawable, z8, renderMode2, map2, lottieDynamicProperties2, z6, z7, z9, z10, progress, mutableState), startRestartGroup, 0);
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new LottieAnimationKt$LottieAnimation$3(lottieComposition, progress, companion, z6, z7, z8, renderMode2, z9, lottieDynamicProperties2, center, fit, z10, map2, i, i2, i3));
            return;
        }
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            modifier2 = companion;
            composer2 = startRestartGroup;
        } else {
            modifier2 = companion;
            composer2 = startRestartGroup;
            endRestartGroup2.updateScope(new LottieAnimationKt$LottieAnimation$1(lottieComposition, progress, companion, z6, z7, z8, renderMode2, z9, lottieDynamicProperties2, center, fit, z10, map2, i, i2, i3));
        }
        BoxKt.Box(modifier2, composer2, (i >> 6) & 14);
    }

    /* renamed from: a */
    public static final LottieDynamicProperties m50824a(MutableState mutableState) {
        return (LottieDynamicProperties) mutableState.getValue();
    }

    /* renamed from: b */
    public static final void m50823b(MutableState mutableState, LottieDynamicProperties lottieDynamicProperties) {
        mutableState.setValue(lottieDynamicProperties);
    }

    /* renamed from: c */
    public static final float m50822c(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* renamed from: d */
    public static final long m50821d(long j, long j2) {
        return IntSizeKt.IntSize((int) (Size.m71571getWidthimpl(j) * ScaleFactor.m72869getScaleXimpl(j2)), (int) (Size.m71568getHeightimpl(j) * ScaleFactor.m72870getScaleYimpl(j2)));
    }

    @Deprecated(message = "Pass progress as a lambda instead of a float. This overload will be removed in the next release.")
    @Composable
    public static final void LottieAnimation(@Nullable LottieComposition lottieComposition, @FloatRange(from = 0.0d, m64743to = 1.0d) float f, @Nullable Modifier modifier, boolean z, boolean z2, boolean z3, @Nullable RenderMode renderMode, boolean z4, @Nullable LottieDynamicProperties lottieDynamicProperties, @Nullable Alignment alignment, @Nullable ContentScale contentScale, boolean z5, @Nullable Composer composer, int i, int i2, int i3) {
        Composer startRestartGroup = composer.startRestartGroup(185153540);
        Modifier.Companion companion = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        boolean z7 = (i3 & 16) != 0 ? false : z2;
        boolean z8 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z9 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i3 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i3 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z10 = (i3 & 2048) != 0 ? true : z5;
        Float valueOf = Float.valueOf(f);
        startRestartGroup.startReplaceableGroup(-3686930);
        boolean changed = startRestartGroup.changed(valueOf);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LottieAnimationKt$LottieAnimation$4$1(f);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LottieAnimation(lottieComposition, (Function0) rememberedValue, companion, z6, z7, z8, renderMode2, z9, lottieDynamicProperties2, center, fit, z10, null, startRestartGroup, (i & 896) | 134217736 | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (1879048192 & i), i2 & WebSocketProtocol.PAYLOAD_SHORT, 4096);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new LottieAnimationKt$LottieAnimation$5(lottieComposition, f, companion, z6, z7, z8, renderMode2, z9, lottieDynamicProperties2, center, fit, z10, i, i2, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Composable
    public static final void LottieAnimation(@Nullable LottieComposition lottieComposition, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable LottieClipSpec lottieClipSpec, float f, int i, boolean z3, boolean z4, boolean z5, @Nullable RenderMode renderMode, boolean z6, boolean z7, @Nullable LottieDynamicProperties lottieDynamicProperties, @Nullable Alignment alignment, @Nullable ContentScale contentScale, boolean z8, @Nullable Map<String, ? extends Typeface> map, @Nullable Composer composer, int i2, int i3, int i4) {
        Composer startRestartGroup = composer.startRestartGroup(185154698);
        Modifier.Companion companion = (i4 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z9 = (i4 & 4) != 0 ? true : z;
        boolean z10 = (i4 & 8) != 0 ? true : z2;
        LottieClipSpec lottieClipSpec2 = (i4 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i4 & 32) != 0 ? 1.0f : f;
        int i5 = (i4 & 64) != 0 ? 1 : i;
        boolean z11 = (i4 & 128) != 0 ? false : z3;
        boolean z12 = (i4 & 256) != 0 ? false : z4;
        boolean z13 = (i4 & 512) != 0 ? false : z5;
        RenderMode renderMode2 = (i4 & 1024) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z14 = (i4 & 2048) != 0 ? false : z6;
        boolean z15 = (i4 & 4096) != 0 ? false : z7;
        LottieDynamicProperties lottieDynamicProperties2 = (i4 & 8192) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i4 & 16384) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (32768 & i4) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z16 = (65536 & i4) != 0 ? true : z8;
        Map<String, ? extends Typeface> map2 = (131072 & i4) != 0 ? null : map;
        int i6 = i2 >> 3;
        LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(lottieComposition, z9, z10, z14, lottieClipSpec2, f2, i5, null, false, false, startRestartGroup, (i6 & 896) | (i6 & 112) | 8 | ((i3 << 6) & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016), 896);
        startRestartGroup.startReplaceableGroup(-3686930);
        boolean changed = startRestartGroup.changed(animateLottieCompositionAsState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LottieAnimationKt$LottieAnimation$6$1(animateLottieCompositionAsState);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Function0 function0 = rememberedValue;
        int i7 = i2 >> 12;
        int i8 = i3 << 15;
        int i9 = i3 >> 15;
        Modifier modifier2 = companion;
        boolean z17 = z11;
        boolean z18 = z12;
        boolean z19 = z13;
        RenderMode renderMode3 = renderMode2;
        boolean z20 = z15;
        LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        Alignment alignment2 = center;
        ContentScale contentScale2 = fit;
        boolean z21 = z16;
        Map<String, ? extends Typeface> map3 = map2;
        LottieAnimation(lottieComposition, function0, modifier2, z17, z18, z19, renderMode3, z20, lottieDynamicProperties3, alignment2, contentScale2, z21, map3, startRestartGroup, ((i2 << 3) & 896) | 134217736 | (i7 & 7168) | (57344 & i7) | (458752 & i7) | ((i3 << 18) & 3670016) | (29360128 & i8) | (i8 & 1879048192), (i9 & 112) | (i9 & 14) | 512, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new LottieAnimationKt$LottieAnimation$7(lottieComposition, companion, z9, z10, lottieClipSpec2, f2, i5, z11, z12, z13, renderMode2, z14, z15, lottieDynamicProperties2, center, fit, z16, map2, i2, i3, i4));
    }
}
