package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.unit.C3623Dp;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.common.composable.StringHelperKt;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneOrderInfoModel;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.AdditionalInformation;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSignaturePageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignaturePageScreen.kt\nth/co/dtac/android/dtacone/widget/compose/signature/SignaturePageScreenKt$OrderInfoLayout$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1068:1\n72#2,6:1069\n78#2:1103\n73#2,5:1106\n78#2:1139\n82#2:1146\n82#2:1151\n78#3,11:1075\n78#3,11:1111\n91#3:1145\n91#3:1150\n456#4,8:1086\n464#4,3:1100\n456#4,8:1122\n464#4,3:1136\n467#4,3:1142\n467#4,3:1147\n4144#5,6:1094\n4144#5,6:1130\n154#6:1104\n154#6:1105\n1855#7,2:1140\n*S KotlinDebug\n*F\n+ 1 SignaturePageScreen.kt\nth/co/dtac/android/dtacone/widget/compose/signature/SignaturePageScreenKt$OrderInfoLayout$1\n*L\n295#1:1069,6\n295#1:1103\n305#1:1106,5\n305#1:1139\n305#1:1146\n295#1:1151\n295#1:1075,11\n305#1:1111,11\n305#1:1145\n295#1:1150\n295#1:1086,8\n295#1:1100,3\n305#1:1122,8\n305#1:1136,3\n305#1:1142,3\n295#1:1147,3\n295#1:1094,6\n305#1:1130,6\n306#1:1104\n307#1:1105\n362#1:1140,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$OrderInfoLayout$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$OrderInfoLayout$1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ CompanyThemes $isTrueThemes;
    final /* synthetic */ OneOrderInfoModel $orderInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$OrderInfoLayout$1(CompanyThemes companyThemes, int i, OneOrderInfoModel oneOrderInfoModel) {
        super(3);
        this.$isTrueThemes = companyThemes;
        this.$$dirty = i;
        this.$orderInfo = oneOrderInfoModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-685931669, i, -1, "th.co.dtac.android.dtacone.widget.compose.signature.OrderInfoLayout.<anonymous> (SignaturePageScreen.kt:292)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier m69505backgroundbw27NRU$default = BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.Companion.m71956getWhite0d7_KjU(), null, 2, null);
        CompanyThemes companyThemes = this.$isTrueThemes;
        int i7 = this.$$dirty;
        OneOrderInfoModel oneOrderInfoModel = this.$orderInfo;
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
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69505backgroundbw27NRU$default);
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
        SignaturePageScreenKt.TitleLayout(StringResources_androidKt.stringResource(R.string.customer_data, composer, 0), companyThemes, composer, (i7 >> 3) & 112);
        Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(companion, C3623Dp.m73842constructorimpl(16));
        Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = arrangement.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(8));
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m69662spacedBy0680j_4, companion2.getStart(), composer, 6);
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
        Updater.m71584setimpl(m71577constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        String tel = oneOrderInfoModel.getTel();
        composer.startReplaceableGroup(1959539879);
        if (tel != null && StringExtKt.isNotEmpty(tel)) {
            String stringResource = StringResources_androidKt.stringResource(R.string.phone_number, composer, 0);
            String formatMobileNumber = StringHelperKt.formatMobileNumber(tel);
            if (companyThemes == CompanyThemes.ONE_TRUE) {
                composer.startReplaceableGroup(1523463674);
                i6 = R.color.red5;
            } else {
                composer.startReplaceableGroup(1523463707);
                i6 = R.color.niceBlueFive;
            }
            long colorResource = ColorResources_androidKt.colorResource(i6, composer, 0);
            composer.endReplaceableGroup();
            SignaturePageScreenKt.m75355OrderItemLayoutXOJAsU(stringResource, formatMobileNumber, colorResource, composer, 0);
        }
        composer.endReplaceableGroup();
        String simCardNumber = oneOrderInfoModel.getSimCardNumber();
        composer.startReplaceableGroup(1959540424);
        if (simCardNumber != null && StringExtKt.isNotEmpty(simCardNumber)) {
            String stringResource2 = StringResources_androidKt.stringResource(R.string.one_unify_sim_title, composer, 0);
            if (companyThemes == CompanyThemes.ONE_TRUE) {
                composer.startReplaceableGroup(1523464205);
                i5 = R.color.red5;
            } else {
                composer.startReplaceableGroup(1523464238);
                i5 = R.color.niceBlueFive;
            }
            long colorResource2 = ColorResources_androidKt.colorResource(i5, composer, 0);
            composer.endReplaceableGroup();
            SignaturePageScreenKt.m75355OrderItemLayoutXOJAsU(stringResource2, simCardNumber, colorResource2, composer, 0);
        }
        composer.endReplaceableGroup();
        String advancePayment = oneOrderInfoModel.getAdvancePayment();
        composer.startReplaceableGroup(1959540956);
        if (advancePayment != null && StringExtKt.isNotEmpty(advancePayment)) {
            String stringResource3 = StringResources_androidKt.stringResource(R.string.one_unify_advance_payment_title, composer, 0);
            if (!StringsKt__StringsKt.contains$default((CharSequence) advancePayment, (CharSequence) "บาท", false, 2, (Object) null)) {
                advancePayment = advancePayment + " บาท";
            }
            String str = advancePayment;
            if (companyThemes == CompanyThemes.ONE_TRUE) {
                composer.startReplaceableGroup(1523464852);
                i4 = R.color.red5;
            } else {
                composer.startReplaceableGroup(1523464885);
                i4 = R.color.niceBlueFive;
            }
            long colorResource3 = ColorResources_androidKt.colorResource(i4, composer, 0);
            composer.endReplaceableGroup();
            SignaturePageScreenKt.m75355OrderItemLayoutXOJAsU(stringResource3, str, colorResource3, composer, 0);
        }
        composer.endReplaceableGroup();
        String contractPeriod = oneOrderInfoModel.getContractPeriod();
        composer.startReplaceableGroup(1959541604);
        if (contractPeriod != null && StringExtKt.isNotEmpty(contractPeriod)) {
            String stringResource4 = StringResources_androidKt.stringResource(R.string.one_unify_contract_period_title, composer, 0);
            if (!StringsKt__StringsKt.contains$default((CharSequence) contractPeriod, (CharSequence) "เดือน", false, 2, (Object) null)) {
                contractPeriod = contractPeriod + " เดือน";
            }
            String str2 = contractPeriod;
            if (companyThemes == CompanyThemes.ONE_TRUE) {
                composer.startReplaceableGroup(1523465504);
                i3 = R.color.red5;
            } else {
                composer.startReplaceableGroup(1523465537);
                i3 = R.color.niceBlueFive;
            }
            long colorResource4 = ColorResources_androidKt.colorResource(i3, composer, 0);
            composer.endReplaceableGroup();
            SignaturePageScreenKt.m75355OrderItemLayoutXOJAsU(stringResource4, str2, colorResource4, composer, 0);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-455355308);
        for (AdditionalInformation additionalInformation : oneOrderInfoModel.getAdditionalInformation()) {
            String name = additionalInformation.getName();
            String value = additionalInformation.getValue();
            if (companyThemes == CompanyThemes.ONE_TRUE) {
                composer.startReplaceableGroup(1523465956);
                i2 = R.color.red5;
            } else {
                composer.startReplaceableGroup(1523465989);
                i2 = R.color.niceBlueFive;
            }
            long colorResource5 = ColorResources_androidKt.colorResource(i2, composer, 0);
            composer.endReplaceableGroup();
            SignaturePageScreenKt.m75355OrderItemLayoutXOJAsU(name, value, colorResource5, composer, 0);
        }
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