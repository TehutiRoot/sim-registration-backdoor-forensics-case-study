package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.ScaleFactor;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimationKt$LottieAnimation$2 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ boolean $applyOpacityToLayers;
    final /* synthetic */ boolean $clipToCompositionBounds;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ LottieDrawable $drawable;
    final /* synthetic */ LottieDynamicProperties $dynamicProperties;
    final /* synthetic */ boolean $enableMergePaths;
    final /* synthetic */ Map<String, Typeface> $fontMap;
    final /* synthetic */ boolean $maintainOriginalImageBounds;
    final /* synthetic */ Matrix $matrix;
    final /* synthetic */ boolean $outlineMasksAndMattes;
    final /* synthetic */ Function0<Float> $progress;
    final /* synthetic */ RenderMode $renderMode;
    final /* synthetic */ MutableState<LottieDynamicProperties> $setDynamicProperties$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LottieAnimationKt$LottieAnimation$2(LottieComposition lottieComposition, ContentScale contentScale, Alignment alignment, Matrix matrix, LottieDrawable lottieDrawable, boolean z, RenderMode renderMode, Map<String, ? extends Typeface> map, LottieDynamicProperties lottieDynamicProperties, boolean z2, boolean z3, boolean z4, boolean z5, Function0<Float> function0, MutableState<LottieDynamicProperties> mutableState) {
        super(1);
        this.$composition = lottieComposition;
        this.$contentScale = contentScale;
        this.$alignment = alignment;
        this.$matrix = matrix;
        this.$drawable = lottieDrawable;
        this.$enableMergePaths = z;
        this.$renderMode = renderMode;
        this.$fontMap = map;
        this.$dynamicProperties = lottieDynamicProperties;
        this.$outlineMasksAndMattes = z2;
        this.$applyOpacityToLayers = z3;
        this.$maintainOriginalImageBounds = z4;
        this.$clipToCompositionBounds = z5;
        this.$progress = function0;
        this.$setDynamicProperties$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        long m50821d;
        LottieDynamicProperties m50824a;
        LottieDynamicProperties m50824a2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        LottieComposition lottieComposition = this.$composition;
        ContentScale contentScale = this.$contentScale;
        Alignment alignment = this.$alignment;
        Matrix matrix = this.$matrix;
        LottieDrawable lottieDrawable = this.$drawable;
        boolean z = this.$enableMergePaths;
        RenderMode renderMode = this.$renderMode;
        Map<String, Typeface> map = this.$fontMap;
        LottieDynamicProperties lottieDynamicProperties = this.$dynamicProperties;
        boolean z2 = this.$outlineMasksAndMattes;
        boolean z3 = this.$applyOpacityToLayers;
        boolean z4 = this.$maintainOriginalImageBounds;
        boolean z5 = this.$clipToCompositionBounds;
        Function0<Float> function0 = this.$progress;
        MutableState<LottieDynamicProperties> mutableState = this.$setDynamicProperties$delegate;
        Canvas canvas = Canvas.getDrawContext().getCanvas();
        long Size = SizeKt.Size(lottieComposition.getBounds().width(), lottieComposition.getBounds().height());
        long IntSize = IntSizeKt.IntSize(AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(Canvas.mo72144getSizeNHjbRc())), AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(Canvas.mo72144getSizeNHjbRc())));
        long mo72806computeScaleFactorH7hwNQA = contentScale.mo72806computeScaleFactorH7hwNQA(Size, Canvas.mo72144getSizeNHjbRc());
        m50821d = LottieAnimationKt.m50821d(Size, mo72806computeScaleFactorH7hwNQA);
        long mo71407alignKFBX0sM = alignment.mo71407alignKFBX0sM(m50821d, IntSize, Canvas.getLayoutDirection());
        matrix.reset();
        matrix.preTranslate(IntOffset.m73776getXimpl(mo71407alignKFBX0sM), IntOffset.m73777getYimpl(mo71407alignKFBX0sM));
        matrix.preScale(ScaleFactor.m72869getScaleXimpl(mo72806computeScaleFactorH7hwNQA), ScaleFactor.m72870getScaleYimpl(mo72806computeScaleFactorH7hwNQA));
        lottieDrawable.enableMergePathsForKitKatAndAbove(z);
        lottieDrawable.setRenderMode(renderMode);
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setFontMap(map);
        m50824a = LottieAnimationKt.m50824a(mutableState);
        if (lottieDynamicProperties != m50824a) {
            m50824a2 = LottieAnimationKt.m50824a(mutableState);
            if (m50824a2 != null) {
                m50824a2.removeFrom$lottie_compose_release(lottieDrawable);
            }
            if (lottieDynamicProperties != null) {
                lottieDynamicProperties.addTo$lottie_compose_release(lottieDrawable);
            }
            LottieAnimationKt.m50823b(mutableState, lottieDynamicProperties);
        }
        lottieDrawable.setOutlineMasksAndMattes(z2);
        lottieDrawable.setApplyingOpacityToLayersEnabled(z3);
        lottieDrawable.setMaintainOriginalImageBounds(z4);
        lottieDrawable.setClipToCompositionBounds(z5);
        lottieDrawable.setProgress(function0.invoke().floatValue());
        lottieDrawable.setBounds(0, 0, lottieComposition.getBounds().width(), lottieComposition.getBounds().height());
        lottieDrawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas), matrix);
    }
}
