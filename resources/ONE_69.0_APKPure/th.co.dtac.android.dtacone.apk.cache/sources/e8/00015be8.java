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
import androidx.compose.p003ui.text.TextLayoutResult;
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
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogConfirm$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1311\n154#2:1312\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogConfirm$1\n*L\n136#1:1310\n137#1:1311\n139#1:1312\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogConfirm$1 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialogConfirm$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $cancelText;
    final /* synthetic */ String $confirmText;
    final /* synthetic */ Function0<Unit> $onConfirm;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ String $text;
    final /* synthetic */ String $title;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogConfirm$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1311\n154#2:1312\n154#2:1344\n76#3,2:1313\n78#3:1343\n82#3:1388\n78#4,11:1315\n78#4,11:1350\n91#4:1382\n91#4:1387\n456#5,8:1326\n464#5,3:1340\n456#5,8:1361\n464#5,3:1375\n467#5,3:1379\n467#5,3:1384\n4144#6,6:1334\n4144#6,6:1369\n74#7,5:1345\n79#7:1378\n83#7:1383\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogConfirm$1$1\n*L\n142#1:1310\n145#1:1311\n146#1:1312\n162#1:1344\n141#1:1313,2\n141#1:1343\n141#1:1388\n141#1:1315,11\n161#1:1350,11\n161#1:1382\n141#1:1387\n141#1:1326,8\n141#1:1340,3\n161#1:1361,8\n161#1:1375,3\n161#1:1379,3\n141#1:1384,3\n141#1:1334,6\n161#1:1369,6\n161#1:1345,5\n161#1:1378\n161#1:1383\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogConfirm$1$1 */
    /* loaded from: classes9.dex */
    public static final class C167331 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $cancelText;
        final /* synthetic */ String $confirmText;
        final /* synthetic */ Function0<Unit> $onConfirm;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ String $text;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C167331(String str, int i, String str2, Function0<Unit> function0, String str3, Function0<Unit> function02, String str4) {
            super(2);
            this.$title = str;
            this.$$dirty = i;
            this.$text = str2;
            this.$onDismiss = function0;
            this.$cancelText = str3;
            this.$onConfirm = function02;
            this.$confirmText = str4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            String str;
            Function0<Unit> function0;
            String str2;
            Function0<Unit> function02;
            int i2;
            String str3;
            Modifier.Companion companion;
            Arrangement arrangement;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1823901020, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialogConfirm.<anonymous>.<anonymous> (OneDialog.kt:139)");
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            float f = 24;
            float m73842constructorimpl = C3623Dp.m73842constructorimpl(f);
            Alignment.Companion companion2 = Alignment.Companion;
            Arrangement.Vertical m69664spacedByD5KLDUw = arrangement2.m69664spacedByD5KLDUw(m73842constructorimpl, companion2.getCenterVertically());
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(BackgroundKt.m69504backgroundbw27NRU(companion3, Color.Companion.m71956getWhite0d7_KjU(), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(8))), C3623Dp.m73842constructorimpl(f));
            String str4 = this.$title;
            int i3 = this.$$dirty;
            String str5 = this.$text;
            Function0<Unit> function03 = this.$onDismiss;
            String str6 = this.$cancelText;
            Function0<Unit> function04 = this.$onConfirm;
            String str7 = this.$confirmText;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69664spacedByD5KLDUw, centerHorizontally, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            composer.startReplaceableGroup(-808727071);
            if (str4.length() > 0) {
                str = str7;
                function0 = function04;
                str2 = str6;
                function02 = function03;
                i2 = i3;
                str3 = str5;
                companion = companion3;
                arrangement = arrangement2;
                TextKt.m70882Text4IGK_g(str4, (Modifier) null, ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineLarge(), composer, (i3 >> 3) & 14, 0, 65530);
            } else {
                str = str7;
                function0 = function04;
                str2 = str6;
                function02 = function03;
                i2 = i3;
                str3 = str5;
                companion = companion3;
                arrangement = arrangement2;
            }
            composer.endReplaceableGroup();
            TextKt.m70882Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getDisplayLarge(), composer, i2 & 14, 0, 65018);
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = arrangement.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(16));
            Modifier.Companion companion5 = companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m69662spacedBy0680j_4, companion2.getTop(), composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
            Modifier m68554a = AbstractC17608Ez1.m68554a(RowScopeInstance.INSTANCE, companion5, 1.0f, false, 2, null);
            OneButtonKt.OneButtonGray(function02, str2, m68554a, composer, ((i2 >> 15) & 14) | ((i2 >> 6) & 112), 0);
            OneButtonKt.OneButton(function0, str, m68554a, composer, ((i2 >> 12) & 14) | ((i2 >> 3) & 112), 0);
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
    public OneDialogKt$OneDialogConfirm$1(String str, int i, String str2, Function0<Unit> function0, String str3, Function0<Unit> function02, String str4) {
        super(2);
        this.$title = str;
        this.$$dirty = i;
        this.$text = str2;
        this.$onDismiss = function0;
        this.$cancelText = str3;
        this.$onConfirm = function02;
        this.$confirmText = str4;
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
            ComposerKt.traceEventStart(-15771177, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialogConfirm.<anonymous> (OneDialog.kt:133)");
        }
        float f = 8;
        RoundedCornerShape m69895RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f));
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(10);
        Color.Companion companion = Color.Companion;
        SurfaceKt.m70812SurfaceT9BRK9s(BackgroundKt.m69504backgroundbw27NRU(Modifier.Companion, companion.m71956getWhite0d7_KjU(), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f))), m69895RoundedCornerShape0680j_4, companion.m71956getWhite0d7_KjU(), 0L, 0.0f, m73842constructorimpl, null, ComposableLambdaKt.composableLambda(composer, 1823901020, true, new C167331(this.$title, this.$$dirty, this.$text, this.$onDismiss, this.$cancelText, this.$onConfirm, this.$confirmText)), composer, 12779904, 88);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}