package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.p003ui.text.AnnotatedString;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails;
import th.p047co.dtac.android.dtacone.view.appOne.tol.util.StringHelperKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMarketingCodeSelectScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketingCodeSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/MarketingCodeSelectScreenKt$PackageCard$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,730:1\n71#2,7:731\n78#2:766\n71#2,7:818\n78#2:853\n82#2:902\n82#2:958\n78#3,11:738\n78#3,11:789\n78#3,11:825\n78#3,11:861\n91#3:895\n91#3:901\n78#3,11:910\n91#3:947\n91#3:952\n91#3:957\n456#4,8:749\n464#4,3:763\n456#4,8:800\n464#4,3:814\n456#4,8:836\n464#4,3:850\n456#4,8:872\n464#4,3:886\n467#4,3:892\n467#4,3:898\n456#4,8:921\n464#4,3:935\n467#4,3:944\n467#4,3:949\n467#4,3:954\n4144#5,6:757\n4144#5,6:808\n4144#5,6:844\n4144#5,6:880\n4144#5,6:929\n164#6:767\n154#6,11:768\n154#6:779\n154#6:780\n154#6:781\n154#6:782\n154#6:890\n154#6:891\n154#6:897\n154#6:939\n154#6:940\n154#6:941\n154#6:942\n154#6:943\n73#7,6:783\n79#7:817\n72#7,7:854\n79#7:889\n83#7:896\n72#7,7:903\n79#7:938\n83#7:948\n83#7:953\n*S KotlinDebug\n*F\n+ 1 MarketingCodeSelectScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/MarketingCodeSelectScreenKt$PackageCard$2\n*L\n445#1:731,7\n445#1:766\n472#1:818,7\n472#1:853\n472#1:902\n445#1:958\n445#1:738,11\n464#1:789,11\n472#1:825,11\n474#1:861,11\n474#1:895\n472#1:901\n619#1:910,11\n619#1:947\n464#1:952\n445#1:957\n445#1:749,8\n445#1:763,3\n464#1:800,8\n464#1:814,3\n472#1:836,8\n472#1:850,3\n474#1:872,8\n474#1:886,3\n474#1:892,3\n472#1:898,3\n619#1:921,8\n619#1:935,3\n619#1:944,3\n464#1:949,3\n445#1:954,3\n445#1:757,6\n464#1:808,6\n472#1:844,6\n474#1:880,6\n619#1:929,6\n448#1:767\n448#1:768,11\n450#1:779\n463#1:780\n466#1:781\n468#1:782\n476#1:890\n481#1:891\n538#1:897\n622#1:939\n624#1:940\n626#1:941\n628#1:942\n630#1:943\n464#1:783,6\n464#1:817\n474#1:854,7\n474#1:889\n474#1:896\n619#1:903,7\n619#1:938\n619#1:948\n464#1:953\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$PackageCard$2 */
/* loaded from: classes10.dex */
public final class MarketingCodeSelectScreenKt$PackageCard$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MarketingDetails $marketingResponse;
    final /* synthetic */ String $query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingCodeSelectScreenKt$PackageCard$2(MarketingDetails marketingDetails, String str, int i) {
        super(2);
        this.$marketingResponse = marketingDetails;
        this.$query = str;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-850137919, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.PackageCard.<anonymous> (MarketingCodeSelectScreen.kt:443)");
        }
        MarketingDetails marketingDetails = this.$marketingResponse;
        String str = this.$query;
        int i2 = this.$$dirty;
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        float f = (float) 17.5d;
        float f2 = 8;
        Modifier m69734height3ABfNKs = SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m69717paddingqDBjuR0$default(companion, C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f2), C3623Dp.m73842constructorimpl(f), 0.0f, 8, null), 0.0f, 1, null), C3623Dp.m73842constructorimpl(51));
        AnnotatedString m75276highlightTextOSu0eDM = StringHelperKt.m75276highlightTextOSu0eDM(marketingDetails.getMarketingName(), str, null, 0L, null, 0L, false, composer, i2 & 112, 124);
        long colorResource = ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0);
        FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
        long sp = TextUnitKt.getSp(16);
        FontWeight.Companion companion4 = FontWeight.Companion;
        TextKt.m70341TextIbK3jfQ(m75276highlightTextOSu0eDM, m69734height3ABfNKs, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(colorResource, sp, companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 48, 0, 131068);
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(13)), composer, 6);
        Modifier m69734height3ABfNKs2 = SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m69717paddingqDBjuR0$default(companion, C3623Dp.m73842constructorimpl(16), 0.0f, 0.0f, C3623Dp.m73842constructorimpl(12), 6, null), 0.0f, 1, null), C3623Dp.m73842constructorimpl(55));
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69734height3ABfNKs2);
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
        Updater.m71584setimpl(m71577constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
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
        Updater.m71584setimpl(m71577constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl3.getInserting() || !Intrinsics.areEqual(m71577constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m71577constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m71577constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
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
        Updater.m71584setimpl(m71577constructorimpl4, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl4.getInserting() || !Intrinsics.areEqual(m71577constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m71577constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m71577constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        modifierMaterializerOf4.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        IconKt.m70229Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_globle, composer, 8), "Internet Speed", SizeKt.m69748size3ABfNKs(companion, C3623Dp.m73842constructorimpl(24)), ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), composer, 432, 0);
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(4)), composer, 6);
        TextKt.m70340Text4IGK_g(marketingDetails.getMarketingSpeedUpValue() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(16), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
        TextKt.m70340Text4IGK_g(marketingDetails.getMarketingSpeedUpUnit(), rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(12), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
        TextKt.m70340Text4IGK_g(" / ", rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(12), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 6, 0, 65532);
        TextKt.m70340Text4IGK_g(marketingDetails.getMarketingSpeedDownValue() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(16), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
        TextKt.m70340Text4IGK_g(marketingDetails.getMarketingSpeedDownUnit(), rowScopeInstance.alignBy(companion, AlignmentLineKt.getFirstBaseline()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(12), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(5)), composer, 6);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(AbstractC17608Ez1.m68554a(rowScopeInstance, companion, 1.0f, false, 2, null), composer, 0);
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
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
        Updater.m71584setimpl(m71577constructorimpl5, rowMeasurePolicy3, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl5.getInserting() || !Intrinsics.areEqual(m71577constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m71577constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m71577constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        modifierMaterializerOf5.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        CardKt.m70132CardFjzlyU(BorderKt.m69512borderxT4_qwU(OffsetKt.m69687offsetVpY3zN4$default(SizeKt.fillMaxHeight$default(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl((float) DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight)), 0.0f, 1, null), C3623Dp.m73842constructorimpl(20), 0.0f, 2, null), C3623Dp.m73842constructorimpl(1), ColorResources_androidKt.colorResource(R.color.bgGray, composer, 0), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f2))), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f2)), 0L, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer, -107049822, true, new MarketingCodeSelectScreenKt$PackageCard$2$1$1$2$1(marketingDetails)), composer, 1572864, 60);
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