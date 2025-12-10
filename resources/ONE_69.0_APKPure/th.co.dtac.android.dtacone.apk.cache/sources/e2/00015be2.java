package th.p047co.dtac.android.dtacone.widget.compose.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialog1IDXDevice$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1311\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialog1IDXDevice$1\n*L\n878#1:1310\n879#1:1311\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialog1IDXDevice$1 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialog1IDXDevice$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $alertMessage;
    final /* synthetic */ String $alertXDeviceMessage;
    final /* synthetic */ String $dateText;
    final /* synthetic */ TextStyle $infoStyle;
    final /* synthetic */ TextStyle $messageStyle;
    final /* synthetic */ Function0<Unit> $onCancel;
    final /* synthetic */ Function0<Unit> $onConfirm;
    final /* synthetic */ TextStyle $suggestionStyle;
    final /* synthetic */ String $userId;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialog1IDXDevice$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1346\n154#2:1347\n154#2:1348\n154#2:1389\n154#2:1390\n154#2:1391\n154#2:1392\n154#2:1393\n154#2:1428\n154#2:1429\n72#3,6:1311\n78#3:1345\n73#3,5:1394\n78#3:1427\n82#3:1434\n82#3:1439\n78#4,11:1317\n78#4,11:1355\n91#4:1387\n78#4,11:1399\n91#4:1433\n91#4:1438\n456#5,8:1328\n464#5,3:1342\n456#5,8:1366\n464#5,3:1380\n467#5,3:1384\n456#5,8:1410\n464#5,3:1424\n467#5,3:1430\n467#5,3:1435\n4144#6,6:1336\n4144#6,6:1374\n4144#6,6:1418\n66#7,6:1349\n72#7:1383\n76#7:1388\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialog1IDXDevice$1$1\n*L\n884#1:1310\n890#1:1346\n896#1:1347\n898#1:1348\n911#1:1389\n915#1:1390\n921#1:1391\n924#1:1392\n927#1:1393\n935#1:1428\n943#1:1429\n882#1:1311,6\n882#1:1345\n926#1:1394,5\n926#1:1427\n926#1:1434\n882#1:1439\n882#1:1317,11\n892#1:1355,11\n892#1:1387\n926#1:1399,11\n926#1:1433\n882#1:1438\n882#1:1328,8\n882#1:1342,3\n892#1:1366,8\n892#1:1380,3\n892#1:1384,3\n926#1:1410,8\n926#1:1424,3\n926#1:1430,3\n882#1:1435,3\n882#1:1336,6\n892#1:1374,6\n926#1:1418,6\n892#1:1349,6\n892#1:1383\n892#1:1388\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialog1IDXDevice$1$1 */
    /* loaded from: classes9.dex */
    public static final class C167311 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $alertMessage;
        final /* synthetic */ String $alertXDeviceMessage;
        final /* synthetic */ String $dateText;
        final /* synthetic */ TextStyle $infoStyle;
        final /* synthetic */ TextStyle $messageStyle;
        final /* synthetic */ Function0<Unit> $onCancel;
        final /* synthetic */ Function0<Unit> $onConfirm;
        final /* synthetic */ TextStyle $suggestionStyle;
        final /* synthetic */ String $userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C167311(String str, TextStyle textStyle, int i, String str2, TextStyle textStyle2, String str3, TextStyle textStyle3, String str4, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$alertMessage = str;
            this.$messageStyle = textStyle;
            this.$$dirty = i;
            this.$dateText = str2;
            this.$infoStyle = textStyle2;
            this.$userId = str3;
            this.$suggestionStyle = textStyle3;
            this.$alertXDeviceMessage = str4;
            this.$onConfirm = function0;
            this.$onCancel = function02;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            TextStyle m73418copyv2rsoow;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-254722846, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialog1IDXDevice.<anonymous>.<anonymous> (OneDialog.kt:880)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f = 24;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m69713padding3ABfNKs(companion, C3623Dp.m73842constructorimpl(f)), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            String str = this.$alertMessage;
            TextStyle textStyle = this.$messageStyle;
            int i2 = this.$$dirty;
            String str2 = this.$dateText;
            TextStyle textStyle2 = this.$infoStyle;
            String str3 = this.$userId;
            TextStyle textStyle3 = this.$suggestionStyle;
            String str4 = this.$alertXDeviceMessage;
            Function0<Unit> function0 = this.$onConfirm;
            Function0<Unit> function02 = this.$onCancel;
            composer.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            String str5 = str4;
            TextKt.m70882Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, i2 & 14, 0, 65534);
            float f2 = 16;
            SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(f2)), composer, 6);
            float f3 = 8;
            Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(BackgroundKt.m69504backgroundbw27NRU(companion, Color.m71918copywmQWz5c$default(ColorResources_androidKt.colorResource(R.color.oneError_transparent_25, composer, 0), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f3))), C3623Dp.m73842constructorimpl(f3));
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
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
            Updater.m71584setimpl(m71577constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (str5 == null) {
                str5 = "ติด 1 ID : 1 เครื่อง";
            }
            m73418copyv2rsoow = r43.m73418copyv2rsoow((r48 & 1) != 0 ? r43.f31200a.m73360getColor0d7_KjU() : ColorResources_androidKt.colorResource(R.color.red, composer, 0), (r48 & 2) != 0 ? r43.f31200a.m73361getFontSizeXSAIIZE() : TextUnitKt.getSp(16), (r48 & 4) != 0 ? r43.f31200a.getFontWeight() : null, (r48 & 8) != 0 ? r43.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r43.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r43.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? r43.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r43.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r43.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r43.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r43.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? r43.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r43.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? r43.f31200a.getShadow() : null, (r48 & 16384) != 0 ? r43.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? r43.f31201b.m73316getTextAlignbuA522U() : TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), (r48 & 65536) != 0 ? r43.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r43.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r43.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? r43.f31202c : null, (r48 & 1048576) != 0 ? r43.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r43.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r43.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium().f31201b.getTextMotion() : null);
            TextKt.m70882Text4IGK_g(str5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m73418copyv2rsoow, composer, 0, 0, 65534);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-1687060502);
            if (str2.length() > 0) {
                TextKt.m70882Text4IGK_g(str2, PaddingKt.m69717paddingqDBjuR0$default(companion, 0.0f, C3623Dp.m73842constructorimpl(f2), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 48, 0, 65532);
            }
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-1687060335);
            if (str3 != null && str3.length() != 0) {
                TextKt.m70882Text4IGK_g("User : " + str3, PaddingKt.m69717paddingqDBjuR0$default(companion, 0.0f, C3623Dp.m73842constructorimpl(2), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 48, 0, 65532);
            }
            composer.endReplaceableGroup();
            float f4 = 12;
            TextKt.m70882Text4IGK_g(StringResources_androidKt.stringResource(R.string.one_postpaid_suggest, composer, 0), PaddingKt.m69717paddingqDBjuR0$default(companion, 0.0f, C3623Dp.m73842constructorimpl(f4), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle3, composer, 48, 0, 65532);
            SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(f)), composer, 6);
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = arrangement.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(f4));
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m69662spacedBy0680j_4, companion2.getStart(), composer, 6);
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
            Updater.m71584setimpl(m71577constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl3.getInserting() || !Intrinsics.areEqual(m71577constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m71577constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m71577constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            String stringResource = StringResources_androidKt.stringResource(R.string.one_postpaid_confirm_buy_device, composer, 0);
            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f5 = 48;
            OneButtonKt.OneButtonOutline(function0, stringResource, SizeKt.m69734height3ABfNKs(fillMaxWidth$default3, C3623Dp.m73842constructorimpl(f5)), composer, ((i2 >> 12) & 14) | 384, 0);
            OneButtonKt.OneButton(function02, StringResources_androidKt.stringResource(R.string.one_postpaid_cancel_buy_device, composer, 0), SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(f5)), composer, ((i2 >> 15) & 14) | 384, 0);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialog1IDXDevice$1(String str, TextStyle textStyle, int i, String str2, TextStyle textStyle2, String str3, TextStyle textStyle3, String str4, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$alertMessage = str;
        this.$messageStyle = textStyle;
        this.$$dirty = i;
        this.$dateText = str2;
        this.$infoStyle = textStyle2;
        this.$userId = str3;
        this.$suggestionStyle = textStyle3;
        this.$alertXDeviceMessage = str4;
        this.$onConfirm = function0;
        this.$onCancel = function02;
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
            ComposerKt.traceEventStart(-2146446713, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialog1IDXDevice.<anonymous> (OneDialog.kt:875)");
        }
        SurfaceKt.m70812SurfaceT9BRK9s(null, RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(8)), Color.Companion.m71956getWhite0d7_KjU(), 0L, 0.0f, C3623Dp.m73842constructorimpl(10), null, ComposableLambdaKt.composableLambda(composer, -254722846, true, new C167311(this.$alertMessage, this.$messageStyle, this.$$dirty, this.$dateText, this.$infoStyle, this.$userId, this.$suggestionStyle, this.$alertXDeviceMessage, this.$onConfirm, this.$onCancel)), composer, 12779904, 89);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}