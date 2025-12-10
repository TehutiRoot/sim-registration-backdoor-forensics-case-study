package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTakePhotoIdCardScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakePhotoIdCardScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/takePhoto/TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,430:1\n154#2:431\n154#2:466\n154#2:467\n67#3,5:432\n72#3:465\n66#3,6:468\n72#3:502\n76#3:507\n76#3:512\n78#4,11:437\n78#4,11:474\n91#4:506\n91#4:511\n456#5,8:448\n464#5,3:462\n456#5,8:485\n464#5,3:499\n467#5,3:503\n467#5,3:508\n4144#6,6:456\n4144#6,6:493\n*S KotlinDebug\n*F\n+ 1 TakePhotoIdCardScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/takePhoto/TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$4\n*L\n125#1:431\n129#1:466\n130#1:467\n121#1:432,5\n121#1:465\n127#1:468,6\n127#1:502\n127#1:507\n121#1:512\n121#1:437,11\n127#1:474,11\n127#1:506\n121#1:511\n121#1:448,8\n121#1:462,3\n127#1:485,8\n127#1:499,3\n127#1:503,3\n121#1:508,3\n121#1:456,6\n127#1:493,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$4 */
/* loaded from: classes10.dex */
public final class TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$4 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ BoxScope $this_Box;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$4(BoxScope boxScope) {
        super(3);
        this.$this_Box = boxScope;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(756513404, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreen.<anonymous>.<anonymous> (TakePhotoIdCardScreen.kt:119)");
        }
        Alignment.Companion companion = Alignment.Companion;
        Alignment topCenter = companion.getTopCenter();
        BoxScope boxScope = this.$this_Box;
        Modifier.Companion companion2 = Modifier.Companion;
        float f = 8;
        Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(boxScope.align(companion2, companion.getTopCenter()), C3623Dp.m73842constructorimpl(f));
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69713padding3ABfNKs);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier m69713padding3ABfNKs2 = PaddingKt.m69713padding3ABfNKs(BackgroundKt.m69504backgroundbw27NRU(companion2, ColorKt.Color(4280295456L), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(4))), C3623Dp.m73842constructorimpl(f));
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69713padding3ABfNKs2);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl2 = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        TextKt.m70882Text4IGK_g(StringResources_androidKt.stringResource(R.string.one_camera_sorry_face_in_card_not_found, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Color.Companion.m71956getWhite0d7_KjU(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646108, (DefaultConstructorMarker) null), composer, 0, 0, 65534);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}