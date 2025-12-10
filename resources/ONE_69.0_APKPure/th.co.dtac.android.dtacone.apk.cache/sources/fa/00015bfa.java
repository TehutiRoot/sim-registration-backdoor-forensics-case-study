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
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogLoading$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1311\n154#2:1312\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogLoading$2\n*L\n72#1:1310\n73#1:1311\n75#1:1312\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogLoading$2 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialogLoading$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ OneDialogLoadingAlignment $alignment;
    final /* synthetic */ long $color;
    final /* synthetic */ Float $progressPercent;
    final /* synthetic */ String $text;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogLoading$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,1309:1\n154#2:1310\n154#2:1311\n154#2:1344\n154#2:1350\n154#2:1351\n154#2:1383\n76#3,2:1312\n78#3:1342\n82#3:1349\n78#4,11:1314\n91#4:1348\n78#4,11:1354\n91#4:1387\n456#5,8:1325\n464#5,3:1339\n467#5,3:1345\n456#5,8:1365\n464#5,3:1379\n467#5,3:1384\n4144#6,6:1333\n4144#6,6:1373\n1#7:1343\n77#8,2:1352\n79#8:1382\n83#8:1388\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogLoading$2$1\n*L\n82#1:1310\n83#1:1311\n88#1:1344\n102#1:1350\n103#1:1351\n108#1:1383\n78#1:1312,2\n78#1:1342\n78#1:1349\n78#1:1314,11\n78#1:1348\n98#1:1354,11\n98#1:1387\n78#1:1325,8\n78#1:1339,3\n78#1:1345,3\n98#1:1365,8\n98#1:1379,3\n98#1:1384,3\n78#1:1333,6\n98#1:1373,6\n98#1:1352,2\n98#1:1382\n98#1:1388\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogLoading$2$1 */
    /* loaded from: classes9.dex */
    public static final class C167371 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ OneDialogLoadingAlignment $alignment;
        final /* synthetic */ long $color;
        final /* synthetic */ Float $progressPercent;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C167371(OneDialogLoadingAlignment oneDialogLoadingAlignment, Float f, long j, String str, int i) {
            super(2);
            this.$alignment = oneDialogLoadingAlignment;
            this.$progressPercent = f;
            this.$color = j;
            this.$text = str;
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
            int i2;
            long j;
            Unit unit;
            String str;
            long j2;
            Unit unit2;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984480826, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialogLoading.<anonymous>.<anonymous> (OneDialog.kt:75)");
            }
            if (this.$alignment == OneDialogLoadingAlignment.Column) {
                composer.startReplaceableGroup(1128198699);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Modifier.Companion companion = Modifier.Companion;
                Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(BackgroundKt.m69504backgroundbw27NRU(companion, Color.Companion.m71956getWhite0d7_KjU(), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(8))), C3623Dp.m73842constructorimpl(24));
                Float f = this.$progressPercent;
                long j3 = this.$color;
                String str2 = this.$text;
                int i3 = this.$$dirty;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-993794368);
                if (f == null) {
                    str = str2;
                    j2 = j3;
                    unit2 = null;
                } else {
                    str = str2;
                    j2 = j3;
                    ProgressIndicatorKt.m70683CircularProgressIndicatorDUhRLBM(f.floatValue(), null, j3, 0.0f, 0L, 0, composer, ((i3 >> 3) & 14) | 384, 58);
                    unit2 = Unit.INSTANCE;
                }
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-993794385);
                if (unit2 == null) {
                    ProgressIndicatorKt.m70684CircularProgressIndicatorLxG7B9w(null, j2, 0.0f, 0L, 0, composer, 48, 29);
                }
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1128199225);
                if (str.length() > 0) {
                    SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(18)), composer, 6);
                    String str3 = str;
                    TextKt.m70882Text4IGK_g(str3, (Modifier) null, ColorResources_androidKt.colorResource(R.color.grayishBrown, composer, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge(), composer, i3 & 14, 0, 65018);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1128199679);
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier m69713padding3ABfNKs2 = PaddingKt.m69713padding3ABfNKs(BackgroundKt.m69504backgroundbw27NRU(companion3, Color.Companion.m71956getWhite0d7_KjU(), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(8))), C3623Dp.m73842constructorimpl(24));
                Float f2 = this.$progressPercent;
                long j4 = this.$color;
                String str4 = this.$text;
                int i4 = this.$$dirty;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center2, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69713padding3ABfNKs2);
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
                composer.startReplaceableGroup(-993793393);
                if (f2 == null) {
                    i2 = i4;
                    j = j4;
                    unit = null;
                } else {
                    i2 = i4;
                    j = j4;
                    ProgressIndicatorKt.m70683CircularProgressIndicatorDUhRLBM(f2.floatValue(), null, j4, 0.0f, 0L, 0, composer, ((i4 >> 3) & 14) | 384, 58);
                    unit = Unit.INSTANCE;
                }
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-993793410);
                if (unit == null) {
                    ProgressIndicatorKt.m70684CircularProgressIndicatorLxG7B9w(null, j, 0.0f, 0L, 0, composer, 48, 29);
                }
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1128200200);
                if (str4.length() > 0) {
                    SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion3, C3623Dp.m73842constructorimpl(16)), composer, 6);
                    TextKt.m70882Text4IGK_g(str4, (Modifier) null, ColorResources_androidKt.colorResource(R.color.grayishBrown, composer, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge(), composer, i2 & 14, 0, 65018);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialogLoading$2(OneDialogLoadingAlignment oneDialogLoadingAlignment, Float f, long j, String str, int i) {
        super(2);
        this.$alignment = oneDialogLoadingAlignment;
        this.$progressPercent = f;
        this.$color = j;
        this.$text = str;
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
            ComposerKt.traceEventStart(2114724191, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialogLoading.<anonymous> (OneDialog.kt:69)");
        }
        float f = 8;
        RoundedCornerShape m69895RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f));
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(10);
        Color.Companion companion = Color.Companion;
        SurfaceKt.m70812SurfaceT9BRK9s(BackgroundKt.m69504backgroundbw27NRU(Modifier.Companion, companion.m71956getWhite0d7_KjU(), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f))), m69895RoundedCornerShape0680j_4, companion.m71956getWhite0d7_KjU(), 0L, 0.0f, m73842constructorimpl, null, ComposableLambdaKt.composableLambda(composer, 984480826, true, new C167371(this.$alignment, this.$progressPercent, this.$color, this.$text, this.$$dirty)), composer, 12779904, 88);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}