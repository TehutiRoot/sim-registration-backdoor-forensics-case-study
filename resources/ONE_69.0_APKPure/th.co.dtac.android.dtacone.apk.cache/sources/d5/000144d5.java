package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.vector.ImageVector;
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
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMarketingCodeSelectScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketingCodeSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/MarketingCodeSelectScreenKt$CampaignCard$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,730:1\n154#2:731\n154#2:767\n154#2:803\n154#2:804\n154#2:805\n154#2:806\n154#2:846\n154#2:852\n154#2:853\n154#2:889\n154#2:890\n154#2:891\n154#2:892\n154#2:893\n154#2:894\n154#2:895\n154#2:896\n154#2:897\n154#2:898\n154#2:899\n154#2:942\n154#2:943\n154#2:944\n72#3,6:732\n78#3:766\n82#3:959\n78#4,11:738\n78#4,11:774\n78#4,11:812\n91#4:844\n91#4:850\n78#4,11:860\n78#4,11:913\n91#4:948\n91#4:953\n91#4:958\n456#5,8:749\n464#5,3:763\n456#5,8:785\n464#5,3:799\n456#5,8:823\n464#5,3:837\n467#5,3:841\n467#5,3:847\n456#5,8:871\n464#5,3:885\n36#5:900\n456#5,8:924\n464#5,3:938\n467#5,3:945\n467#5,3:950\n467#5,3:955\n4144#6,6:757\n4144#6,6:793\n4144#6,6:831\n4144#6,6:879\n4144#6,6:932\n73#7,6:768\n79#7:802\n83#7:851\n73#7,6:854\n79#7:888\n73#7,6:907\n79#7:941\n83#7:949\n83#7:954\n67#8,5:807\n72#8:840\n76#8:845\n1097#9,6:901\n*S KotlinDebug\n*F\n+ 1 MarketingCodeSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/MarketingCodeSelectScreenKt$CampaignCard$1\n*L\n219#1:731\n224#1:767\n230#1:803\n232#1:804\n234#1:805\n235#1:806\n249#1:846\n266#1:852\n267#1:853\n274#1:889\n284#1:890\n288#1:891\n298#1:892\n302#1:893\n316#1:894\n331#1:895\n344#1:896\n354#1:897\n357#1:898\n358#1:899\n366#1:942\n367#1:943\n381#1:944\n216#1:732,6\n216#1:766\n216#1:959\n216#1:738,11\n223#1:774,11\n227#1:812,11\n227#1:844\n223#1:850\n264#1:860,11\n355#1:913,11\n355#1:948\n264#1:953\n216#1:958\n216#1:749,8\n216#1:763,3\n223#1:785,8\n223#1:799,3\n227#1:823,8\n227#1:837,3\n227#1:841,3\n223#1:847,3\n264#1:871,8\n264#1:885,3\n359#1:900\n355#1:924,8\n355#1:938,3\n355#1:945,3\n264#1:950,3\n216#1:955,3\n216#1:757,6\n223#1:793,6\n227#1:831,6\n264#1:879,6\n355#1:932,6\n223#1:768,6\n223#1:802\n223#1:851\n264#1:854,6\n264#1:888\n355#1:907,6\n355#1:941\n355#1:949\n264#1:954\n227#1:807,5\n227#1:840\n227#1:845\n359#1:901,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$CampaignCard$1 */
/* loaded from: classes10.dex */
public final class MarketingCodeSelectScreenKt$CampaignCard$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ CampaignInfo $campaignSelected;
    final /* synthetic */ boolean $isSelectEntryFee;
    final /* synthetic */ Function0<Unit> $onSelectFeeDetail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingCodeSelectScreenKt$CampaignCard$1(CampaignInfo campaignInfo, boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$campaignSelected = campaignInfo;
        this.$isSelectEntryFee = z;
        this.$onSelectFeeDetail = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r115v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        Modifier.Companion companion;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-854460791, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.CampaignCard.<anonymous> (MarketingCodeSelectScreen.kt:214)");
        }
        Modifier.Companion companion2 = Modifier.Companion;
        float f = 6;
        Modifier m69716paddingqDBjuR0 = PaddingKt.m69716paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(2));
        CampaignInfo campaignInfo = this.$campaignSelected;
        boolean z = this.$isSelectEntryFee;
        Function0<Unit> function0 = this.$onSelectFeeDetail;
        composer.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier m69734height3ABfNKs = SizeKt.m69734height3ABfNKs(companion2, C3623Dp.m73842constructorimpl(22));
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69734height3ABfNKs);
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
        Updater.m71584setimpl(m71577constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        float f2 = 4;
        float f3 = 20;
        Modifier m69734height3ABfNKs2 = SizeKt.m69734height3ABfNKs(SizeKt.m69753width3ABfNKs(BorderKt.m69512borderxT4_qwU(companion2, C3623Dp.m73842constructorimpl(1), ColorResources_androidKt.colorResource(R.color.red5, composer, 0), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f2))), C3623Dp.m73842constructorimpl(46)), C3623Dp.m73842constructorimpl(f3));
        Alignment center = companion3.getCenter();
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m69734height3ABfNKs2);
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
        Updater.m71584setimpl(m71577constructorimpl3, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (m71577constructorimpl3.getInserting() || !Intrinsics.areEqual(m71577constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m71577constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m71577constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        long colorResource = ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0);
        FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
        long sp = TextUnitKt.getSp(10);
        FontWeight.Companion companion5 = FontWeight.Companion;
        TextKt.m70340Text4IGK_g("แคมเปญ", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(colorResource, sp, companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 6, 0, 65534);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion2, C3623Dp.m73842constructorimpl(f2)), composer, 6);
        TextKt.m70340Text4IGK_g(campaignInfo.getCampaignName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m73779getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(14), companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 0, 3120, 55294);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier m69734height3ABfNKs3 = SizeKt.m69734height3ABfNKs(SizeKt.m69753width3ABfNKs(companion2, C3623Dp.m73842constructorimpl(221)), C3623Dp.m73842constructorimpl(24));
        Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m69734height3ABfNKs3);
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
        Updater.m71584setimpl(m71577constructorimpl4, rowMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
        if (m71577constructorimpl4.getInserting() || !Intrinsics.areEqual(m71577constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m71577constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m71577constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        modifierMaterializerOf4.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        float f4 = 16;
        TextKt.m70340Text4IGK_g("สัญญา " + campaignInfo.getCampaignContract() + " เดือน", SizeKt.m69734height3ABfNKs(SizeKt.wrapContentWidth$default(companion2, null, false, 3, null), C3623Dp.m73842constructorimpl(f4)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(10), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 48, 0, 65532);
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion2, C3623Dp.m73842constructorimpl(f2)), composer, 6);
        TextKt.m70340Text4IGK_g("|", SizeKt.m69734height3ABfNKs(SizeKt.wrapContentWidth$default(companion2, null, false, 3, null), C3623Dp.m73842constructorimpl(f4)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(10), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 54, 0, 65532);
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion2, C3623Dp.m73842constructorimpl(f2)), composer, 6);
        TextKt.m70340Text4IGK_g("ค่าแรกเข้า ", SizeKt.m69734height3ABfNKs(SizeKt.wrapContentWidth$default(companion2, null, false, 3, null), C3623Dp.m73842constructorimpl(f4)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(10), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 54, 0, 65532);
        composer.startReplaceableGroup(-606926782);
        if (z) {
            companion = companion2;
            TextKt.m70340Text4IGK_g(String.valueOf(campaignInfo.getCampaignEntryFeeValue()), SizeKt.m69734height3ABfNKs(SizeKt.wrapContentWidth$default(companion2, null, false, 3, null), C3623Dp.m73842constructorimpl(f4)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, TextDecoration.Companion.getLineThrough(), (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.warmGray, composer, 0), TextUnitKt.getSp(10), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 100663344, 0, 65276);
        } else {
            companion = companion2;
        }
        composer.endReplaceableGroup();
        Modifier.Companion companion6 = companion;
        TextKt.m70340Text4IGK_g(z ? "0" : String.valueOf(campaignInfo.getCampaignEntryFeeValue()), SizeKt.m69734height3ABfNKs(SizeKt.wrapContentWidth$default(companion6, null, false, 3, null), C3623Dp.m73842constructorimpl(f4)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(10), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 48, 0, 65532);
        TextKt.m70340Text4IGK_g(" บาท", SizeKt.m69734height3ABfNKs(SizeKt.wrapContentWidth$default(companion6, null, false, 3, null), C3623Dp.m73842constructorimpl(f4)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(10), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 54, 0, 65532);
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion6, C3623Dp.m73842constructorimpl(f2)), composer, 6);
        Modifier m69734height3ABfNKs4 = SizeKt.m69734height3ABfNKs(SizeKt.m69753width3ABfNKs(companion6, C3623Dp.m73842constructorimpl(51)), C3623Dp.m73842constructorimpl(f3));
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function0);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new MarketingCodeSelectScreenKt$CampaignCard$1$1$2$1$1(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier m69531clickableXHw0xAI$default = ClickableKt.m69531clickableXHw0xAI$default(m69734height3ABfNKs4, false, null, null, rememberedValue, 7, null);
        Alignment.Vertical centerVertically3 = companion3.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically3, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m69531clickableXHw0xAI$default);
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
        Updater.m71584setimpl(m71577constructorimpl5, rowMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
        if (m71577constructorimpl5.getInserting() || !Intrinsics.areEqual(m71577constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m71577constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m71577constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        modifierMaterializerOf5.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        TextKt.m70340Text4IGK_g("ดูข้อมูล", SizeKt.m69734height3ABfNKs(SizeKt.m69753width3ABfNKs(companion6, C3623Dp.m73842constructorimpl(33)), C3623Dp.m73842constructorimpl(f4)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(10), companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 54, 0, 65532);
        IconKt.m70229Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_back, (Composer) composer, 8), "Arrow", SizeKt.m69748size3ABfNKs(companion6, C3623Dp.m73842constructorimpl(f3)), ColorResources_androidKt.colorResource(R.color.red5, composer, 0), (Composer) composer, 432, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
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