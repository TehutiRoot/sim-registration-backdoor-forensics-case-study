package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.VectorResources_androidKt;
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
import androidx.compose.p003ui.text.style.TextOverflow;
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
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.paymentSummary.PaymentSummaryTolInfo;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nPaymentSummaryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSummaryScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/paymentSummary/PaymentSummaryScreenKt$ServiceInfoCard$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,838:1\n154#2:839\n154#2:840\n154#2:881\n154#2:917\n154#2:918\n154#2:919\n154#2:920\n154#2:960\n154#2:961\n154#2:962\n154#2:963\n154#2:964\n154#2:965\n154#2:1005\n154#2:1006\n154#2:1043\n154#2:1044\n154#2:1050\n72#3,6:841\n78#3:875\n82#3:880\n72#3,6:882\n78#3:916\n82#3:1055\n78#4,11:847\n91#4:879\n78#4,11:888\n78#4,11:926\n91#4:958\n78#4,11:971\n91#4:1003\n78#4,11:1014\n91#4:1048\n91#4:1054\n456#5,8:858\n464#5,3:872\n467#5,3:876\n456#5,8:899\n464#5,3:913\n456#5,8:937\n464#5,3:951\n467#5,3:955\n456#5,8:982\n464#5,3:996\n467#5,3:1000\n456#5,8:1025\n464#5,3:1039\n467#5,3:1045\n467#5,3:1051\n4144#6,6:866\n4144#6,6:907\n4144#6,6:945\n4144#6,6:990\n4144#6,6:1033\n67#7,5:921\n72#7:954\n76#7:959\n67#7,5:966\n72#7:999\n76#7:1004\n72#8,7:1007\n79#8:1042\n83#8:1049\n*S KotlinDebug\n*F\n+ 1 PaymentSummaryScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/paymentSummary/PaymentSummaryScreenKt$ServiceInfoCard$1\n*L\n457#1:839\n459#1:840\n476#1:881\n481#1:917\n483#1:918\n485#1:919\n486#1:920\n500#1:960\n517#1:961\n521#1:962\n523#1:963\n525#1:964\n526#1:965\n540#1:1005\n556#1:1006\n559#1:1043\n564#1:1044\n621#1:1050\n454#1:841,6\n454#1:875\n454#1:880\n472#1:882,6\n472#1:916\n472#1:1055\n454#1:847,11\n454#1:879\n472#1:888,11\n478#1:926,11\n478#1:958\n518#1:971,11\n518#1:1003\n557#1:1014,11\n557#1:1048\n472#1:1054\n454#1:858,8\n454#1:872,3\n454#1:876,3\n472#1:899,8\n472#1:913,3\n478#1:937,8\n478#1:951,3\n478#1:955,3\n518#1:982,8\n518#1:996,3\n518#1:1000,3\n557#1:1025,8\n557#1:1039,3\n557#1:1045,3\n472#1:1051,3\n454#1:866,6\n472#1:907,6\n478#1:945,6\n518#1:990,6\n557#1:1033,6\n478#1:921,5\n478#1:954\n478#1:959\n518#1:966,5\n518#1:999\n518#1:1004\n557#1:1007,7\n557#1:1042\n557#1:1049\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary.PaymentSummaryScreenKt$ServiceInfoCard$1 */
/* loaded from: classes10.dex */
public final class PaymentSummaryScreenKt$ServiceInfoCard$1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ PaymentSummaryTolInfo $paymentSummaryTolInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSummaryScreenKt$ServiceInfoCard$1(PaymentSummaryTolInfo paymentSummaryTolInfo) {
        super(3);
        this.$paymentSummaryTolInfo = paymentSummaryTolInfo;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        String str;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1339693536, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary.ServiceInfoCard.<anonymous> (PaymentSummaryScreen.kt:452)");
        }
        Modifier.Companion companion = Modifier.Companion;
        float f = 16;
        float f2 = 8;
        Modifier m69716paddingqDBjuR0 = PaddingKt.m69716paddingqDBjuR0(BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(40)), ColorResources_androidKt.colorResource(R.color.red4, composer, 0), null, 2, null), C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f2), C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(6));
        composer.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69716paddingqDBjuR0);
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
        Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        long colorResource = ColorResources_androidKt.colorResource(R.color.white, composer, 0);
        FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
        long sp = TextUnitKt.getSp(16);
        FontWeight.Companion companion4 = FontWeight.Companion;
        TextKt.m70882Text4IGK_g("ข้อมูลการเปิดบริการทรูออนไลน์", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(colorResource, sp, companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 6, 0, 65534);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        float f3 = 4;
        Modifier m69716paddingqDBjuR02 = PaddingKt.m69716paddingqDBjuR0(BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.white, composer, 0), null, 2, null), C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(12), C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f3));
        PaymentSummaryTolInfo paymentSummaryTolInfo = this.$paymentSummaryTolInfo;
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69716paddingqDBjuR02);
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
        Updater.m71584setimpl(m71577constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        float f4 = 1;
        float f5 = 20;
        Modifier m69734height3ABfNKs = SizeKt.m69734height3ABfNKs(SizeKt.m69753width3ABfNKs(BorderKt.m69512borderxT4_qwU(companion, C3623Dp.m73842constructorimpl(f4), ColorResources_androidKt.colorResource(R.color.red5, composer, 0), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f3))), C3623Dp.m73842constructorimpl(61)), C3623Dp.m73842constructorimpl(f5));
        Alignment center = companion2.getCenter();
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m69734height3ABfNKs);
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
        Updater.m71584setimpl(m71577constructorimpl3, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl3.getInserting() || !Intrinsics.areEqual(m71577constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m71577constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m71577constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        TextKt.m70882Text4IGK_g("แคมเปญ", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(12), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 6, 0, 65534);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(f3)), composer, 6);
        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
        TextStyle textStyle = new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(14), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null);
        TextOverflow.Companion companion5 = TextOverflow.Companion;
        TextKt.m70882Text4IGK_g("paymentSummaryTolInfo.tolCampaign.campaignName", wrapContentHeight$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m73779getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 54, 3120, 55292);
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(f2)), composer, 6);
        Modifier m69734height3ABfNKs2 = SizeKt.m69734height3ABfNKs(SizeKt.m69753width3ABfNKs(BorderKt.m69512borderxT4_qwU(companion, C3623Dp.m73842constructorimpl(f4), ColorResources_androidKt.colorResource(R.color.red5, composer, 0), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f3))), C3623Dp.m73842constructorimpl(91)), C3623Dp.m73842constructorimpl(f5));
        Alignment center2 = companion2.getCenter();
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m69734height3ABfNKs2);
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
        TextKt.m70882Text4IGK_g("มาร์เก็ตติ้งโค้ด", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(12), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 6, 0, 65534);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(f2)), composer, 6);
        TextKt.m70882Text4IGK_g(paymentSummaryTolInfo.getTolMarketing().getMarketingName(), SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m73779getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(14), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 48, 3120, 55292);
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(f2)), composer, 6);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor5);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl5 = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl5, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl5.getInserting() || !Intrinsics.areEqual(m71577constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m71577constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m71577constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        modifierMaterializerOf5.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        IconKt.m70611Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_globle, composer, 8), "Internet Speed", SizeKt.m69748size3ABfNKs(companion, C3623Dp.m73842constructorimpl(24)), ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), composer, 432, 0);
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(f3)), composer, 6);
        TextKt.m70882Text4IGK_g(paymentSummaryTolInfo.getTolMarketing().getMarketingSpeedDownValue() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(16), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
        TextKt.m70882Text4IGK_g(paymentSummaryTolInfo.getTolMarketing().getMarketingSpeedDownUnit(), rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(12), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
        TextKt.m70882Text4IGK_g(" / ", rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(12), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 6, 0, 65532);
        TextKt.m70882Text4IGK_g(paymentSummaryTolInfo.getTolMarketing().getMarketingSpeedUpValue() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(16), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
        TextKt.m70882Text4IGK_g(paymentSummaryTolInfo.getTolMarketing().getMarketingSpeedUpUnit(), rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(12), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(f2)), composer, 6);
        PaymentSummaryScreenKt.FeeRow("ค่าบริการ", null, StringExtKt.formatMoneyNoDecimal(String.valueOf(paymentSummaryTolInfo.getTolMarketing().getMarketingRecurringChargeAmount())) + " บ.", false, composer, 6, 10);
        if (paymentSummaryTolInfo.getTolCampaign().getCampaignEntryFeeValue() == 0) {
            str = "ฟรี";
        } else {
            str = StringExtKt.formatMoneyNoDecimal(String.valueOf(paymentSummaryTolInfo.getTolCampaign().getCampaignEntryFeeValue())) + " บ.";
        }
        PaymentSummaryScreenKt.FeeRow("ค่าแรกเข้า", null, str, false, composer, 6, 10);
        PaymentSummaryScreenKt.FeeRow("ค่าการเดินสายเพิ่มเติม", "(ขึ้นอยู่กับการประเมินหน้างานของช่าง)", "แจ้งหน้างาน", false, composer, 438, 8);
        PaymentSummaryScreenKt.FeeRow("ระยะเวลา", null, "paymentSummaryTolInfo.tolCampaign.campaignContractValue เดือน", false, composer, 390, 10);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}