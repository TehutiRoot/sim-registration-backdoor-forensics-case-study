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
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.C3641Dp;
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

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogError$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n154#2:646\n154#2:647\n154#2:648\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogError$2\n*L\n502#1:646\n503#1:647\n505#1:648\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt$OneDialogError$2 */
/* loaded from: classes7.dex */
public final class OneDialogKt$OneDialogError$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $code;
    final /* synthetic */ String $date;
    final /* synthetic */ String $desc;
    final /* synthetic */ TextStyle $infoStyle;
    final /* synthetic */ TextStyle $messageStyle;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ String $systemMessage;
    final /* synthetic */ String $user;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogError$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,645:1\n154#2:646\n154#2:647\n76#3,2:648\n78#3:678\n71#3,7:679\n78#3:714\n82#3:719\n82#3:764\n78#4,11:650\n78#4,11:686\n91#4:718\n78#4,11:726\n91#4:758\n91#4:763\n456#5,8:661\n464#5,3:675\n456#5,8:697\n464#5,3:711\n467#5,3:715\n456#5,8:737\n464#5,3:751\n467#5,3:755\n467#5,3:760\n4144#6,6:669\n4144#6,6:705\n4144#6,6:745\n73#7,6:720\n79#7:754\n83#7:759\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogError$2$1\n*L\n508#1:646\n510#1:647\n507#1:648,2\n507#1:678\n516#1:679,7\n516#1:714\n516#1:719\n507#1:764\n507#1:650,11\n516#1:686,11\n516#1:718\n538#1:726,11\n538#1:758\n507#1:763\n507#1:661,8\n507#1:675,3\n516#1:697,8\n516#1:711,3\n516#1:715,3\n538#1:737,8\n538#1:751,3\n538#1:755,3\n507#1:760,3\n507#1:669,6\n516#1:705,6\n538#1:745,6\n538#1:720,6\n538#1:754\n538#1:759\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt$OneDialogError$2$1 */
    /* loaded from: classes7.dex */
    public static final class C141761 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $code;
        final /* synthetic */ String $date;
        final /* synthetic */ String $desc;
        final /* synthetic */ TextStyle $infoStyle;
        final /* synthetic */ TextStyle $messageStyle;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ String $systemMessage;
        final /* synthetic */ String $user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141761(String str, TextStyle textStyle, int i, String str2, TextStyle textStyle2, String str3, String str4, String str5, Function0<Unit> function0) {
            super(2);
            this.$desc = str;
            this.$messageStyle = textStyle;
            this.$$dirty = i;
            this.$systemMessage = str2;
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
                ComposerKt.traceEventStart(-386903799, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogError.<anonymous>.<anonymous> (OneDialog.kt:505)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            float f = 24;
            float m73658constructorimpl = C3641Dp.m73658constructorimpl(f);
            Alignment.Companion companion = Alignment.Companion;
            Arrangement.Vertical m69480spacedByD5KLDUw = arrangement.m69480spacedByD5KLDUw(m73658constructorimpl, companion.getCenterVertically());
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier m69529padding3ABfNKs = PaddingKt.m69529padding3ABfNKs(companion2, C3641Dp.m73658constructorimpl(f));
            String str = this.$desc;
            TextStyle textStyle = this.$messageStyle;
            int i2 = this.$$dirty;
            String str2 = this.$systemMessage;
            TextStyle textStyle2 = this.$infoStyle;
            String str3 = this.$date;
            String str4 = this.$user;
            String str5 = this.$code;
            Function0<Unit> function0 = this.$onDismiss;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69480spacedByD5KLDUw, centerHorizontally, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m70698Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, i2 & 14, 0, 65534);
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
            Composer m71393constructorimpl2 = Updater.m71393constructorimpl(composer);
            Updater.m71400setimpl(m71393constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m71393constructorimpl2.getInserting() || !Intrinsics.areEqual(m71393constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m71393constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m71393constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(1697484214);
            if (str3.length() > 0) {
                composer2 = composer;
                TextKt.m70698Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 0, 0, 65534);
            } else {
                composer2 = composer;
            }
            composer.endReplaceableGroup();
            composer2.startReplaceableGroup(1697484424);
            if (str4.length() > 0) {
                TextKt.m70698Text4IGK_g(str4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 0, 0, 65534);
            }
            composer.endReplaceableGroup();
            composer2.startReplaceableGroup(1567531961);
            if (str5.length() > 0) {
                TextKt.m70698Text4IGK_g(str5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, 0, 0, 65534);
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
            Composer m71393constructorimpl3 = Updater.m71393constructorimpl(composer);
            Updater.m71400setimpl(m71393constructorimpl3, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m71393constructorimpl3.getInserting() || !Intrinsics.areEqual(m71393constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m71393constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m71393constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(AbstractC17770Hy1.m68013a(rowScopeInstance, companion2, 0.2f, false, 2, null), composer2, 0);
            OneButtonKt.OneButton(function0, StringResources_androidKt.stringResource(R.string.ok, composer2, 0), AbstractC17770Hy1.m68013a(rowScopeInstance, companion2, 0.6f, false, 2, null), false, composer, (i2 >> 12) & 14, 8);
            SpacerKt.Spacer(AbstractC17770Hy1.m68013a(rowScopeInstance, companion2, 0.2f, false, 2, null), composer2, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            TextKt.m70698Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m73595getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composer, (i2 >> 9) & 14, 3120, 55294);
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
    public OneDialogKt$OneDialogError$2(String str, TextStyle textStyle, int i, String str2, TextStyle textStyle2, String str3, String str4, String str5, Function0<Unit> function0) {
        super(2);
        this.$desc = str;
        this.$messageStyle = textStyle;
        this.$$dirty = i;
        this.$systemMessage = str2;
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
            ComposerKt.traceEventStart(1077772590, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogError.<anonymous> (OneDialog.kt:499)");
        }
        float f = 8;
        RoundedCornerShape m69711RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(f));
        float m73658constructorimpl = C3641Dp.m73658constructorimpl(10);
        Color.Companion companion = Color.Companion;
        SurfaceKt.m70628SurfaceT9BRK9s(BackgroundKt.m69318backgroundbw27NRU(Modifier.Companion, companion.m71772getWhite0d7_KjU(), RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(f))), m69711RoundedCornerShape0680j_4, companion.m71772getWhite0d7_KjU(), 0L, 0.0f, m73658constructorimpl, null, ComposableLambdaKt.composableLambda(composer, -386903799, true, new C141761(this.$desc, this.$messageStyle, this.$$dirty, this.$systemMessage, this.$infoStyle, this.$date, this.$user, this.$code, this.$onDismiss)), composer, 12779904, 88);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
