package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.review;

import android.graphics.Bitmap;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.ImageResources_androidKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nReviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/review/ReviewScreenKt$ReviewScreen$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,588:1\n66#2,6:589\n72#2:623\n76#2:640\n78#3,11:595\n91#3:639\n456#4,8:606\n464#4,3:620\n67#4,3:625\n66#4:628\n467#4,3:636\n4144#5,6:614\n154#6:624\n154#6:635\n1097#7,6:629\n*S KotlinDebug\n*F\n+ 1 ReviewScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/review/ReviewScreenKt$ReviewScreen$1$1$1\n*L\n116#1:589,6\n116#1:623\n116#1:640\n116#1:595,11\n116#1:639\n116#1:606,8\n116#1:620,3\n155#1:625,3\n155#1:628\n116#1:636,3\n116#1:614,6\n134#1:624\n161#1:635\n155#1:629,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.review.ReviewScreenKt$ReviewScreen$1$1$1 */
/* loaded from: classes10.dex */
public final class ReviewScreenKt$ReviewScreen$1$1$1 extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Integer> $deleteIndex$delegate;
    final /* synthetic */ List<Bitmap> $imageList;
    final /* synthetic */ boolean $isIdCardReader;
    final /* synthetic */ MutableState<Bitmap> $previewBitmap$delegate;
    final /* synthetic */ MutableState<Boolean> $showConfirmDelete$delegate;
    final /* synthetic */ MutableState<Boolean> $showPreview$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewScreenKt$ReviewScreen$1$1$1(List<Bitmap> list, boolean z, MutableState<Boolean> mutableState, MutableState<Integer> mutableState2, MutableState<Bitmap> mutableState3, MutableState<Boolean> mutableState4) {
        super(4);
        this.$imageList = list;
        this.$isIdCardReader = z;
        this.$showConfirmDelete$delegate = mutableState;
        this.$deleteIndex$delegate = mutableState2;
        this.$previewBitmap$delegate = mutableState3;
        this.$showPreview$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r68v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull PagerScope HorizontalPager, int i, @Nullable Composer composer, int i2) {
        MutableState<Integer> mutableState;
        MutableState<Boolean> mutableState2;
        BoxScopeInstance boxScopeInstance;
        BoxScopeInstance boxScopeInstance2;
        Modifier.Companion companion;
        MutableState<Boolean> mutableState3;
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-761873661, i2, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.review.ReviewScreen.<anonymous>.<anonymous>.<anonymous> (ReviewScreen.kt:113)");
        }
        Bitmap bitmap = (Bitmap) CollectionsKt___CollectionsKt.getOrNull(this.$imageList, i);
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        boolean z = this.$isIdCardReader;
        MutableState<Boolean> mutableState4 = this.$showConfirmDelete$delegate;
        MutableState<Integer> mutableState5 = this.$deleteIndex$delegate;
        MutableState<Bitmap> mutableState6 = this.$previewBitmap$delegate;
        MutableState<Boolean> mutableState7 = this.$showPreview$delegate;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
        Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
        if (bitmap != null) {
            composer.startReplaceableGroup(-880592247);
            mutableState2 = mutableState4;
            mutableState = mutableState5;
            ImageKt.m69548Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, ClickableKt.m69531clickableXHw0xAI$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), false, null, null, new ReviewScreenKt$ReviewScreen$1$1$1$1$1(bitmap, mutableState6, mutableState7), 7, null), null, ContentScale.Companion.getCrop(), 0.0f, null, 0, composer, 24632, 232);
            composer.endReplaceableGroup();
            boxScopeInstance = boxScopeInstance3;
        } else {
            mutableState = mutableState5;
            mutableState2 = mutableState4;
            if (z && i == 0) {
                composer.startReplaceableGroup(-880591621);
                boxScopeInstance = boxScopeInstance3;
                ImageKt.m69548Image5hnEew(ImageResources_androidKt.imageResource(ImageBitmap.Companion, R.drawable.bg_id_card, composer, 8), null, boxScopeInstance3.align(SizeKt.m69748size3ABfNKs(companion2, C3623Dp.m73842constructorimpl(40)), companion3.getCenter()), null, null, 0.0f, null, 0, composer, 56, 248);
                composer.endReplaceableGroup();
            } else {
                boxScopeInstance = boxScopeInstance3;
                composer.startReplaceableGroup(-880591248);
                composer.endReplaceableGroup();
            }
        }
        composer.startReplaceableGroup(-880591227);
        if (i == 0) {
            String stringResource = StringResources_androidKt.stringResource(R.string.one_tol_review_image_watermark, composer, 0);
            long sp = TextUnitKt.getSp(14);
            long sp2 = TextUnitKt.getSp(22);
            FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
            boxScopeInstance2 = boxScopeInstance;
            mutableState3 = mutableState2;
            companion = companion2;
            TextKt.m70882Text4IGK_g(stringResource, RotateKt.rotate(boxScopeInstance.align(companion2, companion3.getCenter()), -32.0f), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), sp, new FontWeight(500), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, sp2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 0, 0, 65532);
        } else {
            boxScopeInstance2 = boxScopeInstance;
            companion = companion2;
            mutableState3 = mutableState2;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-264865571);
        if (i > 0) {
            Integer valueOf = Integer.valueOf(i);
            composer.startReplaceableGroup(1618982084);
            MutableState<Boolean> mutableState8 = mutableState3;
            MutableState<Integer> mutableState9 = mutableState;
            boolean changed = composer.changed(valueOf) | composer.changed(mutableState8) | composer.changed(mutableState9);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ReviewScreenKt$ReviewScreen$1$1$1$1$2$1(i, mutableState8, mutableState9);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            IconButtonKt.IconButton(rememberedValue, PaddingKt.m69713padding3ABfNKs(boxScopeInstance2.align(companion, companion3.getTopEnd()), C3623Dp.m73842constructorimpl(8)), false, null, null, ComposableSingletons$ReviewScreenKt.INSTANCE.m75244getLambda1$app_prodRelease(), composer, ProfileVerifier.CompilationStatus.f36619xf2722a21, 28);
        }
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