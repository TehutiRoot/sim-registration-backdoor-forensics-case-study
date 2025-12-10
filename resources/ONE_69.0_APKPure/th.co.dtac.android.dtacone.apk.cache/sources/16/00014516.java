package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
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
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneRoundedCornerCheckBoxKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneFeeInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneFeeInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneFeeInfoScreenKt$SubscriptionInfoCard$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,407:1\n71#2,7:408\n78#2:443\n82#2:622\n78#3,11:415\n78#3,11:452\n91#3:484\n78#3,11:494\n91#3:526\n78#3,11:536\n91#3:568\n78#3,11:577\n91#3:616\n91#3:621\n456#4,8:426\n464#4,3:440\n456#4,8:463\n464#4,3:477\n467#4,3:481\n456#4,8:505\n464#4,3:519\n467#4,3:523\n456#4,8:547\n464#4,3:561\n467#4,3:565\n456#4,8:588\n464#4,3:602\n36#4:606\n467#4,3:613\n467#4,3:618\n4144#5,6:434\n4144#5,6:471\n4144#5,6:513\n4144#5,6:555\n4144#5,6:596\n154#6:444\n154#6:445\n154#6:486\n154#6:487\n154#6:488\n154#6:528\n154#6:529\n154#6:530\n154#6:570\n73#7,6:446\n79#7:480\n83#7:485\n74#7,5:489\n79#7:522\n83#7:527\n74#7,5:531\n79#7:564\n83#7:569\n73#7,6:571\n79#7:605\n83#7:617\n1097#8,6:607\n*S KotlinDebug\n*F\n+ 1 OneFeeInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneFeeInfoScreenKt$SubscriptionInfoCard$1\n*L\n146#1:408,7\n146#1:443\n146#1:622\n146#1:415,11\n149#1:452,11\n149#1:484\n185#1:494,11\n185#1:526\n218#1:536,11\n218#1:568\n246#1:577,11\n246#1:616\n146#1:621\n146#1:426,8\n146#1:440,3\n149#1:463,8\n149#1:477,3\n149#1:481,3\n185#1:505,8\n185#1:519,3\n185#1:523,3\n218#1:547,8\n218#1:561,3\n218#1:565,3\n246#1:588,8\n246#1:602,3\n260#1:606\n246#1:613,3\n146#1:618,3\n146#1:434,6\n149#1:471,6\n185#1:513,6\n218#1:555,6\n246#1:596,6\n151#1:444\n153#1:445\n181#1:486\n187#1:487\n189#1:488\n214#1:528\n220#1:529\n222#1:530\n247#1:570\n149#1:446,6\n149#1:480\n149#1:485\n185#1:489,5\n185#1:522\n185#1:527\n218#1:531,5\n218#1:564\n218#1:569\n246#1:571,6\n246#1:605\n246#1:617\n260#1:607,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$SubscriptionInfoCard$1 */
/* loaded from: classes10.dex */
public final class OneFeeInfoScreenKt$SubscriptionInfoCard$1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ CampaignInfo $campaignInfo;
    final /* synthetic */ boolean $isCheck;
    final /* synthetic */ Function1<Boolean, Unit> $onCheck;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneFeeInfoScreenKt$SubscriptionInfoCard$1(CampaignInfo campaignInfo, boolean z, Function1<? super Boolean, Unit> function1, int i) {
        super(3);
        this.$campaignInfo = campaignInfo;
        this.$isCheck = z;
        this.$onCheck = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-385173357, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.SubscriptionInfoCard.<anonymous> (OneFeeInfoScreen.kt:144)");
        }
        CampaignInfo campaignInfo = this.$campaignInfo;
        boolean z = this.$isCheck;
        Function1<Boolean, Unit> function1 = this.$onCheck;
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
        float f = 16;
        Modifier m69734height3ABfNKs = SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m69713padding3ABfNKs(companion, C3623Dp.m73842constructorimpl(f)), 0.0f, 1, null), C3623Dp.m73842constructorimpl(47));
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        Modifier m68554a = AbstractC17608Ez1.m68554a(rowScopeInstance, companion, 1.0f, false, 2, null);
        long colorResource = ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0);
        FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
        long sp = TextUnitKt.getSp(14);
        FontWeight.Companion companion4 = FontWeight.Companion;
        TextKt.m70882Text4IGK_g("แคมเปญ", m68554a, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(colorResource, sp, companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 6, 0, 65532);
        TextKt.m70882Text4IGK_g(campaignInfo.getCampaignName(), AbstractC17608Ez1.m68554a(rowScopeInstance, companion, 2.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73725boximpl(TextAlign.Companion.m73733getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(14), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65020);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        float f2 = 1;
        DividerKt.m70554Divider9IZ8Weo(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(f2), ColorResources_androidKt.colorResource(R.color.line_platinum, composer, 0), composer, 54, 0);
        float f3 = 22;
        Modifier m69734height3ABfNKs2 = SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m69713padding3ABfNKs(companion, C3623Dp.m73842constructorimpl(f)), 0.0f, 1, null), C3623Dp.m73842constructorimpl(f3));
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, companion2.getTop(), composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
        Updater.m71584setimpl(m71577constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl3.getInserting() || !Intrinsics.areEqual(m71577constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m71577constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m71577constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        TextKt.m70882Text4IGK_g("สัญญา", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(14), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 6, 0, 65534);
        TextKt.m70882Text4IGK_g(campaignInfo.getCampaignContract() + " เดือน", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(14), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65534);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        DividerKt.m70554Divider9IZ8Weo(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(f2), ColorResources_androidKt.colorResource(R.color.line_platinum, composer, 0), composer, 54, 0);
        Modifier m69734height3ABfNKs3 = SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m69717paddingqDBjuR0$default(companion, C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f), 0.0f, 8, null), 0.0f, 1, null), C3623Dp.m73842constructorimpl(f3));
        Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, companion2.getTop(), composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
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
        Updater.m71584setimpl(m71577constructorimpl4, rowMeasurePolicy3, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl4.getInserting() || !Intrinsics.areEqual(m71577constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m71577constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m71577constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        modifierMaterializerOf4.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        TextKt.m70882Text4IGK_g("ค่าแรกเข้า", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(14), companion4.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 6, 0, 65534);
        TextKt.m70882Text4IGK_g(campaignInfo.getCampaignEntryFeeValue() + " บาท", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(14), companion4.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 0, 0, 65534);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier m69717paddingqDBjuR0$default = PaddingKt.m69717paddingqDBjuR0$default(companion, C3623Dp.m73842constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m69717paddingqDBjuR0$default);
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
        Updater.m71584setimpl(m71577constructorimpl5, rowMeasurePolicy4, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl5.getInserting() || !Intrinsics.areEqual(m71577constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m71577constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m71577constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        modifierMaterializerOf5.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        long colorResource2 = ColorResources_androidKt.colorResource(R.color.red5, composer, 0);
        long colorResource3 = ColorResources_androidKt.colorResource(R.color.colorGray, composer, 0);
        TextStyle textStyle = new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777180, (DefaultConstructorMarker) null);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new OneFeeInfoScreenKt$SubscriptionInfoCard$1$1$4$1$1(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        OneRoundedCornerCheckBoxKt.m75132OneRoundedCornerCheckBox7gqYH70("ขอยกเว้นค่าแรกเข้า", z, (Function1) rememberedValue, null, 0.0f, 0.0f, colorResource2, 0.0f, 0L, colorResource3, textStyle, 0.0f, composer, (i2 & 112) | 6, 0, 2488);
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