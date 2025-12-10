package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.IconKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.vector.ImageVector;
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
import com.google.firebase.sessions.settings.RemoteSettings;
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
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignContract;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.SmartSearchData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.util.StringHelperKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneSmartSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSmartSearchScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneSmartSearchScreenKt$CampaignCardItem$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,790:1\n71#2,7:791\n78#2:826\n73#2,5:918\n78#2:951\n82#2:1000\n76#2,2:1002\n78#2:1032\n82#2:1037\n76#2,2:1075\n78#2:1105\n82#2:1110\n82#2:1126\n78#3,11:798\n78#3,11:830\n91#3:882\n78#3,11:888\n78#3,11:923\n78#3,11:959\n91#3:994\n91#3:999\n78#3,11:1004\n91#3:1036\n78#3,11:1045\n78#3,11:1077\n91#3:1109\n91#3:1115\n91#3:1120\n91#3:1125\n456#4,8:809\n464#4,3:823\n456#4,8:841\n464#4,3:855\n36#4:871\n467#4,3:879\n456#4,8:899\n464#4,3:913\n456#4,8:934\n464#4,3:948\n456#4,8:970\n464#4,3:984\n467#4,3:991\n467#4,3:996\n456#4,8:1015\n464#4,3:1029\n467#4,3:1033\n456#4,8:1056\n464#4,3:1070\n456#4,8:1088\n464#4,3:1102\n467#4,3:1106\n467#4,3:1112\n467#4,3:1117\n467#4,3:1122\n4144#5,6:817\n4144#5,6:849\n4144#5,6:907\n4144#5,6:942\n4144#5,6:978\n4144#5,6:1023\n4144#5,6:1064\n4144#5,6:1096\n154#6:827\n154#6,11:859\n154#6:870\n154#6:878\n154#6:884\n154#6:885\n154#6:917\n154#6:988\n154#6:989\n154#6:990\n154#6:1001\n154#6:1038\n154#6:1074\n164#6:1111\n77#7,2:828\n79#7:858\n83#7:883\n77#7,2:886\n79#7:916\n72#7,7:952\n79#7:987\n83#7:995\n83#7:1121\n1097#8,6:872\n66#9,6:1039\n72#9:1073\n76#9:1116\n*S KotlinDebug\n*F\n+ 1 OneSmartSearchScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneSmartSearchScreenKt$CampaignCardItem$3\n*L\n368#1:791,7\n368#1:826\n417#1:918,5\n417#1:951\n417#1:1000\n476#1:1002,2\n476#1:1032\n476#1:1037\n511#1:1075,2\n511#1:1105\n511#1:1110\n368#1:1126\n368#1:798,11\n369#1:830,11\n369#1:882\n411#1:888,11\n417#1:923,11\n445#1:959,11\n445#1:994\n417#1:999\n476#1:1004,11\n476#1:1036\n506#1:1045,11\n511#1:1077,11\n511#1:1109\n506#1:1115\n411#1:1120\n368#1:1125\n368#1:809,8\n368#1:823,3\n369#1:841,8\n369#1:855,3\n401#1:871\n369#1:879,3\n411#1:899,8\n411#1:913,3\n417#1:934,8\n417#1:948,3\n445#1:970,8\n445#1:984,3\n445#1:991,3\n417#1:996,3\n476#1:1015,8\n476#1:1029,3\n476#1:1033,3\n506#1:1056,8\n506#1:1070,3\n511#1:1088,8\n511#1:1102,3\n511#1:1106,3\n506#1:1112,3\n411#1:1117,3\n368#1:1122,3\n368#1:817,6\n369#1:849,6\n411#1:907,6\n417#1:942,6\n445#1:978,6\n476#1:1023,6\n506#1:1064,6\n511#1:1096,6\n370#1:827\n376#1:859,11\n388#1:870\n405#1:878\n408#1:884\n409#1:885\n419#1:917\n449#1:988\n454#1:989\n458#1:990\n478#1:1001\n508#1:1038\n513#1:1074\n544#1:1111\n369#1:828,2\n369#1:858\n369#1:883\n411#1:886,2\n411#1:916\n445#1:952,7\n445#1:987\n445#1:995\n411#1:1121\n401#1:872,6\n506#1:1039,6\n506#1:1073\n506#1:1116\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneSmartSearchScreenKt$CampaignCardItem$3 */
/* loaded from: classes10.dex */
public final class OneSmartSearchScreenKt$CampaignCardItem$3 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isDiscount;
    final /* synthetic */ Function0<Unit> $onSelectDetail;
    final /* synthetic */ String $query;
    final /* synthetic */ SmartSearchData $smartSearchData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSmartSearchScreenKt$CampaignCardItem$3(SmartSearchData smartSearchData, Function0<Unit> function0, int i, String str, boolean z) {
        super(3);
        this.$smartSearchData = smartSearchData;
        this.$onSelectDetail = function0;
        this.$$dirty = i;
        this.$query = str;
        this.$isDiscount = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r125v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        String formatMoneyNoDecimal;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1226406964, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.CampaignCardItem.<anonymous> (OneSmartSearchScreen.kt:366)");
        }
        SmartSearchData smartSearchData = this.$smartSearchData;
        Function0<Unit> function0 = this.$onSelectDetail;
        int i2 = this.$$dirty;
        String str = this.$query;
        boolean z = this.$isDiscount;
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
        Modifier m69734height3ABfNKs = SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(48));
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
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
        float f = 8;
        float f2 = (float) 6.5d;
        Modifier m68554a = AbstractC17608Ez1.m68554a(rowScopeInstance, PaddingKt.m69717paddingqDBjuR0$default(companion, C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f2), 0.0f, C3623Dp.m73842constructorimpl(f2), 4, null), 1.0f, false, 2, null);
        String campaignName = smartSearchData.getCampaignName();
        Color.Companion companion4 = Color.Companion;
        long m71945getBlack0d7_KjU = companion4.m71945getBlack0d7_KjU();
        FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
        long sp = TextUnitKt.getSp(14);
        FontWeight.Companion companion5 = FontWeight.Companion;
        TextKt.m70882Text4IGK_g(campaignName, m68554a, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(m71945getBlack0d7_KjU, sp, companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 0, 3072, 57340);
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(6)), composer, 6);
        Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(companion, null, false, 3, null);
        AnnotatedString annotatedString = new AnnotatedString("ดูข้อมูล", null, null, 6, null);
        TextStyle textStyle = new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(10), companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function0);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new OneSmartSearchScreenKt$CampaignCardItem$3$1$1$1$1(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ClickableTextKt.m69906ClickableText4YKlhWE(annotatedString, wrapContentWidth$default, textStyle, false, 0, 0, null, rememberedValue, composer, 54, 120);
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(f)), composer, 6);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        float f3 = 1;
        DividerKt.m70554Divider9IZ8Weo(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(f3)), C3623Dp.m73842constructorimpl(f3), ColorKt.Color(4294375158L), composer, 438, 0);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(AbstractC17608Ez1.m68554a(rowScopeInstance, PaddingKt.m69717paddingqDBjuR0$default(companion, C3623Dp.m73842constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, companion2.getStart(), composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(fillMaxHeight$default);
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
        Updater.m71584setimpl(m71577constructorimpl4, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl4.getInserting() || !Intrinsics.areEqual(m71577constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m71577constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m71577constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        modifierMaterializerOf4.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        TextKt.m70883TextIbK3jfQ(StringHelperKt.m75276highlightTextOSu0eDM(smartSearchData.getMarketingName(), str, null, TextUnitKt.getSp(12), null, TextUnitKt.getSp(16), false, composer, ((i2 >> 3) & 112) | 1772544, 20), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.Companion.m73779getEllipsisgIe3tQ8(), false, 2, 0, null, null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(12), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), composer, 48, 3120, 120828);
        Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically3, composer, 48);
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
        IconKt.m70229Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_globle, (Composer) composer, 8), "Internet Speed", SizeKt.m69748size3ABfNKs(companion, C3623Dp.m73842constructorimpl(13)), ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), (Composer) composer, 432, 0);
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(4)), composer, 6);
        TextKt.m70882Text4IGK_g(smartSearchData.getMarketingSpeedDownValue() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + smartSearchData.getMarketingSpeedDownUnit() + RemoteSettings.FORWARD_SLASH_STRING + smartSearchData.getMarketingSpeedUpValue() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + smartSearchData.getMarketingSpeedUpUnit() + " | " + StringExtKt.formatMoneyNoDecimal(String.valueOf(smartSearchData.getMarketingRecurringChargeAmount())) + " บาท", SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(16)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(companion4.m71945getBlack0d7_KjU(), TextUnitKt.getSp(12), companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 48, 0, 65532);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier m69505backgroundbw27NRU$default = BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl((float) 56)), 0.0f, 1, null), ColorKt.Color(4294375158L), null, 2, null);
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center3 = arrangement.getCenter();
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(center3, centerHorizontally, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(m69505backgroundbw27NRU$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor6);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl6 = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl6, columnMeasurePolicy3, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl6.getInserting() || !Intrinsics.areEqual(m71577constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            m71577constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m71577constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        modifierMaterializerOf6.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        CampaignContract campaignContractFilter = smartSearchData.getCampaignContractFilter();
        TextKt.m70882Text4IGK_g(String.valueOf(campaignContractFilter != null ? Integer.valueOf(campaignContractFilter.getCampaignContractValue()) : null), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), TextUnitKt.getSp(16), companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 0, 0, 65534);
        TextKt.m70882Text4IGK_g("เดือน", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(companion4.m71945getBlack0d7_KjU(), TextUnitKt.getSp(8), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(13), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 6, 0, 65534);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        float f4 = 72;
        Modifier fillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(f4)), 0.0f, 1, null);
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(fillMaxHeight$default2);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor7);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl7 = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl7, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl7, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl7.getInserting() || !Intrinsics.areEqual(m71577constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            m71577constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            m71577constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        modifierMaterializerOf7.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier m69505backgroundbw27NRU$default2 = BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(f4)), 0.0f, 1, null), ColorKt.Color(4294962150L), null, 2, null);
        Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center4 = arrangement.getCenter();
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(center4, centerHorizontally2, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(m69505backgroundbw27NRU$default2);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor8);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl8 = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl8, columnMeasurePolicy4, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl8, currentCompositionLocalMap8, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl8.getInserting() || !Intrinsics.areEqual(m71577constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            m71577constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            m71577constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
        }
        modifierMaterializerOf8.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        if (z) {
            formatMoneyNoDecimal = "0";
        } else {
            formatMoneyNoDecimal = StringExtKt.formatMoneyNoDecimal(String.valueOf(smartSearchData.getCampaignEntryFeeValue()));
        }
        TextKt.m70882Text4IGK_g(formatMoneyNoDecimal, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(16), companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 0, 0, 65534);
        TextKt.m70882Text4IGK_g("บาท", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.red5, composer, 0), TextUnitKt.getSp(8), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(13), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 6, 0, 65534);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1939261985);
        if (z) {
            TextKt.m70882Text4IGK_g(String.valueOf(smartSearchData.getCampaignEntryFeeValue()), boxScopeInstance.align(PaddingKt.m69717paddingqDBjuR0$default(companion, 0.0f, C3623Dp.m73842constructorimpl((float) 8.5d), 0.0f, 0.0f, 13, null), companion2.getTopCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, TextDecoration.Companion.getLineThrough(), (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.warmGray, composer, 0), TextUnitKt.getSp(8), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(13), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 100663296, 0, 65276);
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
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}