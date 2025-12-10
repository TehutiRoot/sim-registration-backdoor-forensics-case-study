package th.p047co.dtac.android.dtacone.app_one.widget.composable;

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
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
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
import androidx.compose.p003ui.unit.C3641Dp;
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
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogLoading$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n154#2:646\n154#2:647\n154#2:648\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogLoading$2\n*L\n70#1:646\n71#1:647\n73#1:648\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt$OneDialogLoading$2 */
/* loaded from: classes7.dex */
public final class OneDialogKt$OneDialogLoading$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ OneDialogLoadingAlignment $alignment;
    final /* synthetic */ String $text;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogLoading$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,645:1\n154#2:646\n154#2:647\n154#2:679\n154#2:685\n154#2:686\n154#2:718\n76#3,2:648\n78#3:678\n82#3:684\n78#4,11:650\n91#4:683\n78#4,11:689\n91#4:722\n456#5,8:661\n464#5,3:675\n467#5,3:680\n456#5,8:700\n464#5,3:714\n467#5,3:719\n4144#6,6:669\n4144#6,6:708\n77#7,2:687\n79#7:717\n83#7:723\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogLoading$2$1\n*L\n80#1:646\n81#1:647\n85#1:679\n102#1:685\n103#1:686\n107#1:718\n76#1:648,2\n76#1:678\n76#1:684\n76#1:650,11\n76#1:683\n98#1:689,11\n98#1:722\n76#1:661,8\n76#1:675,3\n76#1:680,3\n98#1:700,8\n98#1:714,3\n98#1:719,3\n76#1:669,6\n98#1:708,6\n98#1:687,2\n98#1:717\n98#1:723\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt$OneDialogLoading$2$1 */
    /* loaded from: classes7.dex */
    public static final class C141781 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ OneDialogLoadingAlignment $alignment;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141781(OneDialogLoadingAlignment oneDialogLoadingAlignment, String str, int i) {
            super(2);
            this.$alignment = oneDialogLoadingAlignment;
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
                ComposerKt.traceEventStart(536107530, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogLoading.<anonymous>.<anonymous> (OneDialog.kt:73)");
            }
            if (this.$alignment == OneDialogLoadingAlignment.Column) {
                composer.startReplaceableGroup(-782897305);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                Modifier.Companion companion = Modifier.Companion;
                Modifier m69529padding3ABfNKs = PaddingKt.m69529padding3ABfNKs(BackgroundKt.m69318backgroundbw27NRU(companion, Color.Companion.m71772getWhite0d7_KjU(), RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(8))), C3641Dp.m73658constructorimpl(24));
                String str = this.$text;
                int i2 = this.$$dirty;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69529padding3ABfNKs);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m71393constructorimpl = Updater.m71393constructorimpl(composer);
                Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ProgressIndicatorKt.m70500CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer, 0, 31);
                composer.startReplaceableGroup(-782896902);
                if (str.length() > 0) {
                    SpacerKt.Spacer(SizeKt.m69550height3ABfNKs(companion, C3641Dp.m73658constructorimpl(18)), composer, 6);
                    long colorResource = ColorResources_androidKt.colorResource(R.color.grayishBrown, composer, 0);
                    FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
                    TextKt.m70698Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(colorResource, TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m73541boximpl(TextAlign.Companion.m73548getCentere0LSkKk()), (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613340, (DefaultConstructorMarker) null), composer, i2 & 14, 0, 65534);
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-782896300);
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier m69529padding3ABfNKs2 = PaddingKt.m69529padding3ABfNKs(BackgroundKt.m69318backgroundbw27NRU(companion3, Color.Companion.m71772getWhite0d7_KjU(), RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(8))), C3641Dp.m73658constructorimpl(24));
                String str2 = this.$text;
                int i3 = this.$$dirty;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center2, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69529padding3ABfNKs2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m71393constructorimpl2 = Updater.m71393constructorimpl(composer);
                Updater.m71400setimpl(m71393constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (m71393constructorimpl2.getInserting() || !Intrinsics.areEqual(m71393constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m71393constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m71393constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ProgressIndicatorKt.m70500CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer, 0, 31);
                composer.startReplaceableGroup(-782895902);
                if (str2.length() > 0) {
                    SpacerKt.Spacer(SizeKt.m69569width3ABfNKs(companion3, C3641Dp.m73658constructorimpl(16)), composer, 6);
                    long colorResource2 = ColorResources_androidKt.colorResource(R.color.grayishBrown, composer, 0);
                    FontFamily betterTogetherFont2 = TypeKt.getBetterTogetherFont();
                    TextKt.m70698Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(colorResource2, TextUnitKt.getSp(16), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, betterTogetherFont2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m73541boximpl(TextAlign.Companion.m73548getCentere0LSkKk()), (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613340, (DefaultConstructorMarker) null), composer, i3 & 14, 0, 65534);
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
    public OneDialogKt$OneDialogLoading$2(OneDialogLoadingAlignment oneDialogLoadingAlignment, String str, int i) {
        super(2);
        this.$alignment = oneDialogLoadingAlignment;
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
            ComposerKt.traceEventStart(108233839, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogLoading.<anonymous> (OneDialog.kt:67)");
        }
        float f = 8;
        RoundedCornerShape m69711RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(f));
        float m73658constructorimpl = C3641Dp.m73658constructorimpl(10);
        Color.Companion companion = Color.Companion;
        SurfaceKt.m70628SurfaceT9BRK9s(BackgroundKt.m69318backgroundbw27NRU(Modifier.Companion, companion.m71772getWhite0d7_KjU(), RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(f))), m69711RoundedCornerShape0680j_4, companion.m71772getWhite0d7_KjU(), 0L, 0.0f, m73658constructorimpl, null, ComposableLambdaKt.composableLambda(composer, 536107530, true, new C141781(this.$alignment, this.$text, this.$$dirty)), composer, 12779904, 88);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
