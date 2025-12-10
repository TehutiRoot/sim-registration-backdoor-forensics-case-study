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
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
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
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogMessage$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n154#2:646\n154#2:647\n154#2:648\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogMessage$1\n*L\n253#1:646\n254#1:647\n256#1:648\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt$OneDialogMessage$1 */
/* loaded from: classes7.dex */
public final class OneDialogKt$OneDialogMessage$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $confirmText;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Object $text;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogMessage$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,645:1\n154#2:646\n154#2:647\n154#2:648\n154#2:680\n154#2:681\n76#3,2:649\n78#3:679\n82#3:726\n78#4,11:651\n78#4,11:688\n91#4:720\n91#4:725\n456#5,8:662\n464#5,3:676\n456#5,8:699\n464#5,3:713\n467#5,3:717\n467#5,3:722\n4144#6,6:670\n4144#6,6:707\n73#7,6:682\n79#7:716\n83#7:721\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneDialogKt$OneDialogMessage$1$1\n*L\n259#1:646\n262#1:647\n263#1:648\n276#1:680\n289#1:681\n258#1:649,2\n258#1:679\n258#1:726\n258#1:651,11\n306#1:688,11\n306#1:720\n258#1:725\n258#1:662,8\n258#1:676,3\n306#1:699,8\n306#1:713,3\n306#1:717,3\n258#1:722,3\n258#1:670,6\n306#1:707,6\n306#1:682,6\n306#1:716\n306#1:721\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt$OneDialogMessage$1$1 */
    /* loaded from: classes7.dex */
    public static final class C141791 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $confirmText;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Object $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141791(Object obj, Function0<Unit> function0, String str, int i) {
            super(2);
            this.$text = obj;
            this.$onDismiss = function0;
            this.$confirmText = str;
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
            String str;
            int i2;
            Function0<Unit> function0;
            Arrangement arrangement;
            Modifier.Companion companion;
            Composer composer2;
            Modifier.Companion companion2;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(363473034, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogMessage.<anonymous>.<anonymous> (OneDialog.kt:256)");
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            float f = 24;
            float m73658constructorimpl = C3641Dp.m73658constructorimpl(f);
            Alignment.Companion companion3 = Alignment.Companion;
            Arrangement.Vertical m69480spacedByD5KLDUw = arrangement2.m69480spacedByD5KLDUw(m73658constructorimpl, companion3.getCenterVertically());
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier m69529padding3ABfNKs = PaddingKt.m69529padding3ABfNKs(BackgroundKt.m69318backgroundbw27NRU(companion4, Color.Companion.m71772getWhite0d7_KjU(), RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(8))), C3641Dp.m73658constructorimpl(f));
            Object obj = this.$text;
            Function0<Unit> function02 = this.$onDismiss;
            String str2 = this.$confirmText;
            int i3 = this.$$dirty;
            composer.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69480spacedByD5KLDUw, centerHorizontally, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (obj instanceof String) {
                composer.startReplaceableGroup(124674953);
                long sp = TextUnitKt.getSp(16);
                long sp2 = TextUnitKt.getSp(26);
                TextStyle textStyle = new TextStyle(ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), sp, FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m73541boximpl(TextAlign.Companion.m73548getCentere0LSkKk()), (TextDirection) null, sp2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613336, (DefaultConstructorMarker) null);
                str = str2;
                i2 = i3;
                function0 = function02;
                arrangement = arrangement2;
                TextKt.m70698Text4IGK_g((String) obj, PaddingKt.m69531paddingVpY3zN4$default(companion4, 0.0f, C3641Dp.m73658constructorimpl(26), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 48, 0, 65532);
                composer.endReplaceableGroup();
                composer2 = composer;
                companion2 = companion4;
            } else {
                str = str2;
                i2 = i3;
                function0 = function02;
                arrangement = arrangement2;
                if (obj instanceof AnnotatedString) {
                    composer.startReplaceableGroup(124675573);
                    companion = companion4;
                    TextKt.m70699TextIbK3jfQ((AnnotatedString) obj, PaddingKt.m69531paddingVpY3zN4$default(companion4, 0.0f, C3641Dp.m73658constructorimpl(26), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.m73541boximpl(TextAlign.Companion.m73548getCentere0LSkKk()), (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16613337, (DefaultConstructorMarker) null), composer, 48, 0, 131068);
                    composer.endReplaceableGroup();
                    composer2 = composer;
                } else {
                    companion = companion4;
                    composer2 = composer;
                    composer2.startReplaceableGroup(124676160);
                    composer.endReplaceableGroup();
                }
                companion2 = companion;
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m71393constructorimpl2 = Updater.m71393constructorimpl(composer);
            Updater.m71400setimpl(m71393constructorimpl2, rowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (m71393constructorimpl2.getInserting() || !Intrinsics.areEqual(m71393constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m71393constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m71393constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion6 = companion2;
            SpacerKt.Spacer(AbstractC17770Hy1.m68013a(rowScopeInstance, companion6, 0.2f, false, 2, null), composer2, 0);
            OneButtonKt.OneButton(function0, str, AbstractC17770Hy1.m68013a(rowScopeInstance, companion6, 0.6f, false, 2, null), false, composer, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, 8);
            SpacerKt.Spacer(AbstractC17770Hy1.m68013a(rowScopeInstance, companion2, 0.2f, false, 2, null), composer2, 0);
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
    public OneDialogKt$OneDialogMessage$1(Object obj, Function0<Unit> function0, String str, int i) {
        super(2);
        this.$text = obj;
        this.$onDismiss = function0;
        this.$confirmText = str;
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
            ComposerKt.traceEventStart(1123156591, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogMessage.<anonymous> (OneDialog.kt:250)");
        }
        float f = 8;
        RoundedCornerShape m69711RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(f));
        float m73658constructorimpl = C3641Dp.m73658constructorimpl(10);
        Color.Companion companion = Color.Companion;
        SurfaceKt.m70628SurfaceT9BRK9s(BackgroundKt.m69318backgroundbw27NRU(Modifier.Companion, companion.m71772getWhite0d7_KjU(), RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(f))), m69711RoundedCornerShape0680j_4, companion.m71772getWhite0d7_KjU(), 0L, 0.0f, m73658constructorimpl, null, ComposableLambdaKt.composableLambda(composer, 363473034, true, new C141791(this.$text, this.$onDismiss, this.$confirmText, this.$$dirty)), composer, 12779904, 88);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
