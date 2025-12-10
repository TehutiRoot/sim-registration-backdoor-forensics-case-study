package th.p047co.dtac.android.dtacone.widget.compose.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
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

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogConfirmError$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1311\n154#2:1312\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogConfirmError$1\n*L\n669#1:1310\n670#1:1311\n672#1:1312\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogConfirmError$1 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialogConfirmError$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $cancelText;
    final /* synthetic */ String $code;
    final /* synthetic */ String $confirmText;
    final /* synthetic */ String $date;
    final /* synthetic */ String $desc;
    final /* synthetic */ TextStyle $infoStyle;
    final /* synthetic */ Boolean $isCancelButtonLine;
    final /* synthetic */ TextStyle $messageStyle;
    final /* synthetic */ Function0<Unit> $onConfirm;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ String $user;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogConfirmError$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1311\n154#2:1384\n76#3,2:1312\n78#3:1342\n71#3,7:1343\n78#3:1378\n82#3:1383\n82#3:1428\n78#4,11:1314\n78#4,11:1350\n91#4:1382\n78#4,11:1390\n91#4:1422\n91#4:1427\n456#5,8:1325\n464#5,3:1339\n456#5,8:1361\n464#5,3:1375\n467#5,3:1379\n456#5,8:1401\n464#5,3:1415\n467#5,3:1419\n467#5,3:1424\n4144#6,6:1333\n4144#6,6:1369\n4144#6,6:1409\n74#7,5:1385\n79#7:1418\n83#7:1423\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogConfirmError$1$1\n*L\n675#1:1310\n677#1:1311\n706#1:1384\n674#1:1312,2\n674#1:1342\n683#1:1343,7\n683#1:1378\n683#1:1383\n674#1:1428\n674#1:1314,11\n683#1:1350,11\n683#1:1382\n705#1:1390,11\n705#1:1422\n674#1:1427\n674#1:1325,8\n674#1:1339,3\n683#1:1361,8\n683#1:1375,3\n683#1:1379,3\n705#1:1401,8\n705#1:1415,3\n705#1:1419,3\n674#1:1424,3\n674#1:1333,6\n683#1:1369,6\n705#1:1409,6\n705#1:1385,5\n705#1:1418\n705#1:1423\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogConfirmError$1$1 */
    /* loaded from: classes9.dex */
    public static final class C167341 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $cancelText;
        final /* synthetic */ String $code;
        final /* synthetic */ String $confirmText;
        final /* synthetic */ String $date;
        final /* synthetic */ String $desc;
        final /* synthetic */ TextStyle $infoStyle;
        final /* synthetic */ Boolean $isCancelButtonLine;
        final /* synthetic */ TextStyle $messageStyle;
        final /* synthetic */ Function0<Unit> $onConfirm;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ String $user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C167341(String str, TextStyle textStyle, int i, String str2, TextStyle textStyle2, String str3, String str4, Boolean bool, Function0<Unit> function0, String str5, Function0<Unit> function02, String str6) {
            super(2);
            this.$desc = str;
            this.$messageStyle = textStyle;
            this.$$dirty = i;
            this.$date = str2;
            this.$infoStyle = textStyle2;
            this.$user = str3;
            this.$code = str4;
            this.$isCancelButtonLine = bool;
            this.$onDismiss = function0;
            this.$cancelText = str5;
            this.$onConfirm = function02;
            this.$confirmText = str6;
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
                ComposerKt.traceEventStart(1967977636, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialogConfirmError.<anonymous>.<anonymous> (OneDialog.kt:672)");
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
            String str2 = this.$date;
            TextStyle textStyle2 = this.$infoStyle;
            String str3 = this.$user;
            String str4 = this.$code;
            Boolean bool = this.$isCancelButtonLine;
            Function0<Unit> function0 = this.$onDismiss;
            String str5 = this.$cancelText;
            Function0<Unit> function02 = this.$onConfirm;
            String str6 = this.$confirmText;
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
            TextKt.m70882Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, i2 & 14, 0, 65534);
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
            composer.startReplaceableGroup(744390719);
            if (str2.length() > 0) {
                composer2 = composer;
                TextKt.m70882Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 0, 0, 65534);
            } else {
                composer2 = composer;
            }
            composer.endReplaceableGroup();
            composer2.startReplaceableGroup(744390929);
            if (str3.length() > 0) {
                TextKt.m70882Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 0, 0, 65534);
            }
            composer.endReplaceableGroup();
            composer2.startReplaceableGroup(-359249342);
            if (str4.length() > 0) {
                TextKt.m70882Text4IGK_g(str4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 0, 0, 65534);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = arrangement.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(16));
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m69662spacedBy0680j_4, companion.getTop(), composer2, 6);
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
            Modifier m68554a = AbstractC17608Ez1.m68554a(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null);
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                composer2.startReplaceableGroup(744391625);
                OneButtonKt.OneButtonOutline(function0, str5, m68554a, composer, ((i2 >> 24) & 14) | ((i2 >> 15) & 112), 0);
                composer.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(744391759);
                OneButtonKt.OneButtonGray(function0, str5, m68554a, composer, ((i2 >> 24) & 14) | ((i2 >> 15) & 112), 0);
                composer.endReplaceableGroup();
            }
            OneButtonKt.OneButton(function02, str6, m68554a, composer, ((i2 >> 21) & 14) | ((i2 >> 12) & 112), 0);
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
    public OneDialogKt$OneDialogConfirmError$1(String str, TextStyle textStyle, int i, String str2, TextStyle textStyle2, String str3, String str4, Boolean bool, Function0<Unit> function0, String str5, Function0<Unit> function02, String str6) {
        super(2);
        this.$desc = str;
        this.$messageStyle = textStyle;
        this.$$dirty = i;
        this.$date = str2;
        this.$infoStyle = textStyle2;
        this.$user = str3;
        this.$code = str4;
        this.$isCancelButtonLine = bool;
        this.$onDismiss = function0;
        this.$cancelText = str5;
        this.$onConfirm = function02;
        this.$confirmText = str6;
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
            ComposerKt.traceEventStart(-92394679, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialogConfirmError.<anonymous> (OneDialog.kt:666)");
        }
        float f = 8;
        RoundedCornerShape m69895RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f));
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(10);
        Color.Companion companion = Color.Companion;
        SurfaceKt.m70812SurfaceT9BRK9s(BackgroundKt.m69504backgroundbw27NRU(Modifier.Companion, companion.m71956getWhite0d7_KjU(), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f))), m69895RoundedCornerShape0680j_4, companion.m71956getWhite0d7_KjU(), 0L, 0.0f, m73842constructorimpl, null, ComposableLambdaKt.composableLambda(composer, 1967977636, true, new C167341(this.$desc, this.$messageStyle, this.$$dirty, this.$date, this.$infoStyle, this.$user, this.$code, this.$isCancelButtonLine, this.$onDismiss, this.$cancelText, this.$onConfirm, this.$confirmText)), composer, 12779904, 88);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}