package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
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
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneButtonKt;
import th.p047co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustomKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineSignaturePageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineSignaturePageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/signaturePage/OneRegisterTrueOnlineSignaturePageScreenKt$SignatureModalBottomSheet$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,345:1\n67#2,5:346\n72#2:379\n67#2,5:472\n72#2:505\n76#2:521\n76#2:540\n78#3,11:351\n78#3,11:388\n78#3,11:419\n91#3:466\n78#3,11:477\n91#3:520\n91#3:534\n91#3:539\n456#4,8:362\n464#4,3:376\n456#4,8:399\n464#4,3:413\n456#4,8:430\n464#4,3:444\n36#4:448\n50#4:455\n49#4:456\n467#4,3:463\n456#4,8:488\n464#4,3:502\n50#4:508\n49#4:509\n467#4,3:517\n50#4:523\n49#4:524\n467#4,3:531\n467#4,3:536\n4144#5,6:370\n4144#5,6:407\n4144#5,6:438\n4144#5,6:496\n154#6:380\n154#6:381\n154#6:468\n154#6:469\n154#6:470\n154#6:471\n154#6:506\n154#6:507\n154#6:516\n154#6:522\n72#7,6:382\n78#7:416\n82#7:535\n77#8,2:417\n79#8:447\n83#8:467\n1097#9,6:449\n1097#9,6:457\n1097#9,6:510\n1097#9,6:525\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineSignaturePageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/signaturePage/OneRegisterTrueOnlineSignaturePageScreenKt$SignatureModalBottomSheet$3\n*L\n211#1:346,5\n211#1:379\n272#1:472,5\n272#1:505\n272#1:521\n211#1:540\n211#1:351,11\n218#1:388,11\n225#1:419,11\n225#1:466\n272#1:477,11\n272#1:520\n218#1:534\n211#1:539\n211#1:362,8\n211#1:376,3\n218#1:399,8\n218#1:413,3\n225#1:430,8\n225#1:444,3\n231#1:448\n254#1:455\n254#1:456\n225#1:463,3\n272#1:488,8\n272#1:502,3\n292#1:508\n292#1:509\n272#1:517,3\n324#1:523\n324#1:524\n218#1:531,3\n211#1:536,3\n211#1:370,6\n218#1:407,6\n225#1:438,6\n272#1:496,6\n220#1:380\n223#1:381\n271#1:468\n274#1:469\n277#1:470\n279#1:471\n287#1:506\n289#1:507\n318#1:516\n322#1:522\n218#1:382,6\n218#1:416\n218#1:535\n225#1:417,2\n225#1:447\n225#1:467\n231#1:449,6\n254#1:457,6\n292#1:510,6\n324#1:525,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage.OneRegisterTrueOnlineSignaturePageScreenKt$SignatureModalBottomSheet$3 */
/* loaded from: classes10.dex */
public final class C15536xc072651c extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MutableState<Boolean> $clearClick$delegate;
    final /* synthetic */ MutableState<Boolean> $doneClick$delegate;
    final /* synthetic */ MutableState<ImageBitmap> $imageBitmap$delegate;
    final /* synthetic */ State<C3623Dp> $offsetY$delegate;
    final /* synthetic */ Function1<ImageBitmap, Unit> $onComplete;
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15536xc072651c(State<C3623Dp> state, MutableState<Boolean> mutableState, Function0<Unit> function0, int i, MutableState<ImageBitmap> mutableState2, MutableState<Boolean> mutableState3, Function1<? super ImageBitmap, Unit> function1) {
        super(3);
        this.$offsetY$delegate = state;
        this.$doneClick$delegate = mutableState;
        this.$onDismiss = function0;
        this.$$dirty = i;
        this.$imageBitmap$delegate = mutableState2;
        this.$clearClick$delegate = mutableState3;
        this.$onComplete = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r77v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer, int i) {
        float m9416l;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(711305154, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage.SignatureModalBottomSheet.<anonymous> (OneRegisterTrueOnlineSignaturePageScreen.kt:209)");
        }
        Alignment.Companion companion = Alignment.Companion;
        Alignment bottomCenter = companion.getBottomCenter();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier m69505backgroundbw27NRU$default = BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Color.m71918copywmQWz5c$default(ColorResources_androidKt.colorResource(R.color.colorBlack, composer, 0), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        m9416l = OneRegisterTrueOnlineSignaturePageScreenKt.m9416l(this.$offsetY$delegate);
        Modifier m69687offsetVpY3zN4$default = OffsetKt.m69687offsetVpY3zN4$default(m69505backgroundbw27NRU$default, 0.0f, m9416l, 1, null);
        MutableState<Boolean> mutableState = this.$doneClick$delegate;
        Function0<Unit> function0 = this.$onDismiss;
        MutableState<ImageBitmap> mutableState2 = this.$imageBitmap$delegate;
        MutableState<Boolean> mutableState3 = this.$clearClick$delegate;
        Function1<ImageBitmap, Unit> function1 = this.$onComplete;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69687offsetVpY3zN4$default);
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
        float f = 16;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ClipKt.clip(companion2, RoundedCornerShapeKt.m69897RoundedCornerShapea9UjIt4$default(C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f), 0.0f, 0.0f, 12, null)), 0.0f, 1, null);
        Color.Companion companion4 = Color.Companion;
        Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(BackgroundKt.m69505backgroundbw27NRU$default(fillMaxWidth$default, companion4.m71956getWhite0d7_KjU(), null, 2, null), C3623Dp.m73842constructorimpl(f));
        composer.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69713padding3ABfNKs);
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
        Updater.m71584setimpl(m71577constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Vertical centerVertically = companion.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl3 = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl3, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl3.getInserting() || !Intrinsics.areEqual(m71577constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m71577constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m71577constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function0);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C15537x94d6905d(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ComposableSingletons$OneRegisterTrueOnlineSignaturePageScreenKt composableSingletons$OneRegisterTrueOnlineSignaturePageScreenKt = ComposableSingletons$OneRegisterTrueOnlineSignaturePageScreenKt.INSTANCE;
        IconButtonKt.IconButton(rememberedValue, null, false, null, null, composableSingletons$OneRegisterTrueOnlineSignaturePageScreenKt.m75250getLambda2$app_prodRelease(), composer, ProfileVerifier.CompilationStatus.f36619xf2722a21, 30);
        long colorResource = ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0);
        FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
        long sp = TextUnitKt.getSp(16);
        long sp2 = TextUnitKt.getSp(26);
        FontWeight.Companion companion5 = FontWeight.Companion;
        TextKt.m70882Text4IGK_g("ลายเซ็นของลูกค้า", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(colorResource, sp, companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, sp2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 6, 0, 65534);
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(mutableState2) | composer.changed(mutableState3);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new C15538x94d6941e(mutableState2, mutableState3);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ButtonKt.TextButton(rememberedValue2, null, false, null, null, null, null, null, null, composableSingletons$OneRegisterTrueOnlineSignaturePageScreenKt.m75251getLambda3$app_prodRelease(), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion2, C3623Dp.m73842constructorimpl(24)), composer, 6);
        Modifier m69505backgroundbw27NRU$default2 = BackgroundKt.m69505backgroundbw27NRU$default(BorderKt.m69512borderxT4_qwU(SizeKt.fillMaxWidth$default(SizeKt.m69734height3ABfNKs(companion2, C3623Dp.m73842constructorimpl(280)), 0.0f, 1, null), C3623Dp.m73842constructorimpl(1), ColorResources_androidKt.colorResource(R.color.opacityWhite25PercentOne, composer, 0), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(8))), companion4.m71956getWhite0d7_KjU(), null, 2, null);
        Alignment center = companion.getCenter();
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m69505backgroundbw27NRU$default2);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl4 = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl4, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl4.getInserting() || !Intrinsics.areEqual(m71577constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m71577constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m71577constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        modifierMaterializerOf4.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(0);
        long m71956getWhite0d7_KjU = companion4.m71956getWhite0d7_KjU();
        float m73842constructorimpl2 = C3623Dp.m73842constructorimpl(200);
        long m71945getBlack0d7_KjU = companion4.m71945getBlack0d7_KjU();
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 888646029, true, new C15539x61a74391(mutableState));
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer, 299711502, true, new C15540x61a74392(mutableState3));
        composer.startReplaceableGroup(511388516);
        boolean changed3 = composer.changed(mutableState2) | composer.changed(function1);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new C15541x94e4af60(function1, mutableState2);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        ComposeSignatureCustomKt.m75353ComposeSignatureCustom4oWs0OM(fillMaxSize$default, m71956getWhite0d7_KjU, m73842constructorimpl2, m71945getBlack0d7_KjU, m73842constructorimpl, 10.0f, false, composableLambda, composableLambda2, rememberedValue3, null, composer, 113470902, 0, 1088);
        TextKt.m70882Text4IGK_g("เซ็นชื่อด้วยลายมือของลูกค้า", boxScopeInstance.align(PaddingKt.m69717paddingqDBjuR0$default(companion2, 0.0f, C3623Dp.m73842constructorimpl(f), 0.0f, 0.0f, 13, null), companion.getTopCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.colorGray, composer, 0), TextUnitKt.getSp(16), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), (Composer) composer, 6, 0, 65532);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion2, C3623Dp.m73842constructorimpl(f)), composer, 6);
        composer.startReplaceableGroup(511388516);
        boolean changed4 = composer.changed(mutableState) | composer.changed(function0);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new C15542x61a74752(function0, mutableState);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        OneButtonKt.OneButton(rememberedValue4, "ตกลง", SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, composer, 432, 8);
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