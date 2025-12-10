package th.p047co.dtac.android.dtacone.widget.compose.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.p003ui.text.style.TextOverflow;
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
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogError$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1311\n154#2:1312\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogError$2\n*L\n553#1:1310\n554#1:1311\n556#1:1312\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogError$2 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialogError$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $code;
    final /* synthetic */ String $date;
    final /* synthetic */ String $desc;
    final /* synthetic */ int $descriptionMaxLines;
    final /* synthetic */ TextStyle $infoStyle;
    final /* synthetic */ TextStyle $messageStyle;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ String $systemMessage;
    final /* synthetic */ String $user;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogError$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1311\n76#3,2:1312\n78#3:1342\n71#3,7:1343\n78#3:1378\n82#3:1383\n82#3:1428\n78#4,11:1314\n78#4,11:1350\n91#4:1382\n78#4,11:1390\n91#4:1422\n91#4:1427\n456#5,8:1325\n464#5,3:1339\n456#5,8:1361\n464#5,3:1375\n467#5,3:1379\n456#5,8:1401\n464#5,3:1415\n467#5,3:1419\n467#5,3:1424\n4144#6,6:1333\n4144#6,6:1369\n4144#6,6:1409\n73#7,6:1384\n79#7:1418\n83#7:1423\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogError$2$1\n*L\n559#1:1310\n561#1:1311\n558#1:1312,2\n558#1:1342\n568#1:1343,7\n568#1:1378\n568#1:1383\n558#1:1428\n558#1:1314,11\n568#1:1350,11\n568#1:1382\n593#1:1390,11\n593#1:1422\n558#1:1427\n558#1:1325,8\n558#1:1339,3\n568#1:1361,8\n568#1:1375,3\n568#1:1379,3\n593#1:1401,8\n593#1:1415,3\n593#1:1419,3\n558#1:1424,3\n558#1:1333,6\n568#1:1369,6\n593#1:1409,6\n593#1:1384,6\n593#1:1418\n593#1:1423\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogError$2$1 */
    /* loaded from: classes9.dex */
    public static final class C167351 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $code;
        final /* synthetic */ String $date;
        final /* synthetic */ String $desc;
        final /* synthetic */ int $descriptionMaxLines;
        final /* synthetic */ TextStyle $infoStyle;
        final /* synthetic */ TextStyle $messageStyle;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ String $systemMessage;
        final /* synthetic */ String $user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C167351(String str, TextStyle textStyle, int i, String str2, int i2, TextStyle textStyle2, String str3, String str4, String str5, Function0<Unit> function0) {
            super(2);
            this.$desc = str;
            this.$messageStyle = textStyle;
            this.$$dirty = i;
            this.$systemMessage = str2;
            this.$descriptionMaxLines = i2;
            this.$infoStyle = textStyle2;
            this.$date = str3;
            this.$user = str4;
            this.$code = str5;
            this.$onDismiss = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            Composer composer2;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(34531468, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialogError.<anonymous>.<anonymous> (OneDialog.kt:556)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            float f = 24;
            float m73842constructorimpl = C3623Dp.m73842constructorimpl(f);
            Alignment.Companion companion = Alignment.Companion;
            Arrangement.Vertical m69664spacedByD5KLDUw = arrangement.m69664spacedByD5KLDUw(m73842constructorimpl, companion.getCenterVertically());
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(companion2, C3623Dp.m73842constructorimpl(f));
            String str = this.$desc;
            TextStyle textStyle = this.$messageStyle;
            int i2 = this.$$dirty;
            String str2 = this.$systemMessage;
            int i3 = this.$descriptionMaxLines;
            TextStyle textStyle2 = this.$infoStyle;
            String str3 = this.$date;
            String str4 = this.$user;
            String str5 = this.$code;
            Function0<Unit> function0 = this.$onDismiss;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69664spacedByD5KLDUw, centerHorizontally, composer, 54);
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
            TextKt.m70882Text4IGK_g(str, (Modifier) null, ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, i2 & 14, 0, 65530);
            Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
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
            composer.startReplaceableGroup(-937259143);
            if (str3.length() > 0) {
                composer2 = composer;
                TextKt.m70882Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(R.color.warmGrey, composer, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 0, 0, 65530);
            } else {
                composer2 = composer;
            }
            composer.endReplaceableGroup();
            composer2.startReplaceableGroup(-937258864);
            if (str4.length() > 0) {
                TextKt.m70882Text4IGK_g(str4, (Modifier) null, ColorResources_androidKt.colorResource(R.color.warmGrey, composer2, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 0, 0, 65530);
            }
            composer.endReplaceableGroup();
            composer2.startReplaceableGroup(-549439994);
            if (str5.length() > 0) {
                TextKt.m70882Text4IGK_g(str5, (Modifier) null, ColorResources_androidKt.colorResource(R.color.warmGrey, composer2, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 0, 0, 65530);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor3);
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
            modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(AbstractC17608Ez1.m68554a(rowScopeInstance, companion2, 0.2f, false, 2, null), composer2, 0);
            OneButtonKt.OneButtonRed(function0, StringResources_androidKt.stringResource(R.string.ok, composer2, 0), AbstractC17608Ez1.m68554a(rowScopeInstance, companion2, 0.6f, false, 2, null), composer, (i2 >> 12) & 14, 0);
            SpacerKt.Spacer(AbstractC17608Ez1.m68554a(rowScopeInstance, companion2, 0.2f, false, 2, null), composer2, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            int i4 = i2 >> 9;
            TextKt.m70882Text4IGK_g(str2, (Modifier) null, ColorResources_androidKt.colorResource(R.color.warmGrey, composer2, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m73779getEllipsisgIe3tQ8(), false, i3, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, i4 & 14, (i4 & 7168) | 48, 55290);
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
    public OneDialogKt$OneDialogError$2(String str, TextStyle textStyle, int i, String str2, int i2, TextStyle textStyle2, String str3, String str4, String str5, Function0<Unit> function0) {
        super(2);
        this.$desc = str;
        this.$messageStyle = textStyle;
        this.$$dirty = i;
        this.$systemMessage = str2;
        this.$descriptionMaxLines = i2;
        this.$infoStyle = textStyle2;
        this.$date = str3;
        this.$user = str4;
        this.$code = str5;
        this.$onDismiss = function0;
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
            ComposerKt.traceEventStart(1499207857, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialogError.<anonymous> (OneDialog.kt:550)");
        }
        float f = 8;
        RoundedCornerShape m69895RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f));
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(10);
        Color.Companion companion = Color.Companion;
        SurfaceKt.m70812SurfaceT9BRK9s(BackgroundKt.m69504backgroundbw27NRU(Modifier.Companion, companion.m71956getWhite0d7_KjU(), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f))), m69895RoundedCornerShape0680j_4, companion.m71956getWhite0d7_KjU(), 0L, 0.0f, m73842constructorimpl, null, ComposableLambdaKt.composableLambda(composer, 34531468, true, new C167351(this.$desc, this.$messageStyle, this.$$dirty, this.$systemMessage, this.$descriptionMaxLines, this.$infoStyle, this.$date, this.$user, this.$code, this.$onDismiss)), composer, 12779904, 88);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}