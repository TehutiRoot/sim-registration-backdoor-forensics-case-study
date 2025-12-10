package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29143d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001aa\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m29142d2 = {"PagerPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "ScrollingPagerIndicator", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "activeColor", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "inactiveColor", "maximumVisible", "", "dotSize", "Landroidx/compose/ui/unit/Dp;", "miniDotSize", "space", "ScrollingPagerIndicator-P3dhf8A", "(Landroidx/compose/foundation/pager/PagerState;JLandroidx/compose/ui/Modifier;JIFFFLandroidx/compose/runtime/Composer;II)V", "ScrollingPagerIndicatorPreview1", "ScrollingPagerIndicatorPreview2", "calculateCurrentOffsetForPage", "", "page", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nPagerIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerIndicator.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/PagerIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,218:1\n154#2:219\n154#2:271\n154#2:370\n154#2:419\n154#2:461\n77#3,2:220\n79#3:250\n83#3:333\n78#4,11:222\n78#4,11:288\n91#4:327\n91#4:332\n78#4,11:341\n91#4:374\n78#4,11:383\n91#4:423\n78#4,11:432\n91#4:465\n456#5,8:233\n464#5,3:247\n456#5,8:299\n464#5,3:313\n36#5:317\n467#5,3:324\n467#5,3:329\n456#5,8:352\n464#5,3:366\n467#5,3:371\n456#5,8:394\n464#5,3:408\n36#5:412\n467#5,3:420\n456#5,8:443\n464#5,3:457\n467#5,3:462\n4144#6,6:241\n4144#6,6:307\n4144#6,6:360\n4144#6,6:402\n4144#6,6:451\n58#7:251\n88#7:252\n58#7:253\n88#7:254\n58#7:255\n88#7:256\n58#7:257\n88#7:258\n58#7:259\n88#7:260\n51#7:261\n88#7:262\n51#7:263\n88#7:264\n51#7:265\n88#7:266\n51#7:267\n51#7:268\n88#7:269\n64#7:270\n51#7,8:272\n75#7:280\n71#8,7:281\n78#8:316\n82#8:328\n71#8,7:334\n78#8:369\n82#8:375\n71#8,7:376\n78#8:411\n82#8:424\n71#8,7:425\n78#8:460\n82#8:466\n1097#9,6:318\n1097#9,6:413\n*S KotlinDebug\n*F\n+ 1 PagerIndicator.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/PagerIndicatorKt\n*L\n38#1:219\n118#1:271\n168#1:370\n189#1:419\n214#1:461\n42#1:220,2\n42#1:250\n42#1:333\n42#1:222,11\n120#1:288,11\n120#1:327\n42#1:332\n158#1:341,11\n158#1:374\n179#1:383,11\n179#1:423\n200#1:432,11\n200#1:465\n42#1:233,8\n42#1:247,3\n120#1:299,8\n120#1:313,3\n124#1:317\n120#1:324,3\n42#1:329,3\n158#1:352,8\n158#1:366,3\n158#1:371,3\n179#1:394,8\n179#1:408,3\n181#1:412\n179#1:420,3\n200#1:443,8\n200#1:457,3\n200#1:462,3\n42#1:241,6\n120#1:307,6\n158#1:360,6\n179#1:402,6\n200#1:451,6\n73#1:251\n80#1:252\n80#1:253\n82#1:254\n82#1:255\n83#1:256\n83#1:257\n87#1:258\n87#1:259\n92#1:260\n92#1:261\n98#1:262\n98#1:263\n100#1:264\n100#1:265\n104#1:266\n104#1:267\n114#1:268\n117#1:269\n117#1:270\n119#1:272,8\n119#1:280\n120#1:281,7\n120#1:316\n120#1:328\n158#1:334,7\n158#1:369\n158#1:375\n179#1:376,7\n179#1:411\n179#1:424\n200#1:425,7\n200#1:460\n200#1:466\n124#1:318,6\n181#1:413,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.PagerIndicatorKt */
/* loaded from: classes7.dex */
public final class PagerIndicatorKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void PagerPreview(@Nullable Composer composer, int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(847318829);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(847318829, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.PagerPreview (PagerIndicator.kt:197)");
            }
            PagerState rememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, PagerIndicatorKt$PagerPreview$pagerState$1.INSTANCE, startRestartGroup, 390, 2);
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            PagerKt.m69860HorizontalPagerxYaah8o(rememberPagerState, null, null, null, 0, 0.0f, companion2.getTop(), null, false, false, null, null, ComposableSingletons$PagerIndicatorKt.INSTANCE.m75129getLambda1$app_prodRelease(), startRestartGroup, 1572864, 384, 4030);
            Color.Companion companion4 = Color.Companion;
            m75133ScrollingPagerIndicatorP3dhf8A(rememberPagerState, companion4.m71952getMagenta0d7_KjU(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion4.m71949getGray0d7_KjU(), 0, C3623Dp.m73842constructorimpl(16), C3623Dp.m73842constructorimpl(10), C3623Dp.m73842constructorimpl(8), composer2, 14355888, 16);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PagerIndicatorKt$PagerPreview$2(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: ScrollingPagerIndicator-P3dhf8A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m75133ScrollingPagerIndicatorP3dhf8A(@org.jetbrains.annotations.NotNull androidx.compose.foundation.pager.PagerState r30, long r31, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r33, long r34, int r36, float r37, float r38, float r39, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.PagerIndicatorKt.m75133ScrollingPagerIndicatorP3dhf8A(androidx.compose.foundation.pager.PagerState, long, androidx.compose.ui.Modifier, long, int, float, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void ScrollingPagerIndicatorPreview1(@Nullable Composer composer, int i) {
        Composer composer2;
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1349545674);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1349545674, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.ScrollingPagerIndicatorPreview1 (PagerIndicator.kt:156)");
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            int i3 = 0;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(2065894324);
            int i4 = 0;
            while (i4 < 10) {
                PagerState rememberPagerState = PagerStateKt.rememberPagerState(i4, 0.0f, C14169xb0bb60aa.INSTANCE, startRestartGroup, 384, 2);
                if (i4 % 2 == 0) {
                    startRestartGroup.startReplaceableGroup(1231349512);
                    i2 = R.color.blueDark1;
                } else {
                    startRestartGroup.startReplaceableGroup(1231349550);
                    i2 = R.color.red4;
                }
                long colorResource = ColorResources_androidKt.colorResource(i2, startRestartGroup, i3);
                startRestartGroup.endReplaceableGroup();
                m75133ScrollingPagerIndicatorP3dhf8A(rememberPagerState, colorResource, PaddingKt.m69717paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C3623Dp.m73842constructorimpl(16), 7, null), 0L, 0, 0.0f, 0.0f, 0.0f, startRestartGroup, 384, 248);
                i4++;
                startRestartGroup = startRestartGroup;
                i3 = 0;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PagerIndicatorKt$ScrollingPagerIndicatorPreview1$2(i));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void ScrollingPagerIndicatorPreview2(@Nullable Composer composer, int i) {
        Composer composer2;
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(504799863);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(504799863, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.ScrollingPagerIndicatorPreview2 (PagerIndicator.kt:176)");
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            int i3 = 0;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(2065895039);
            int i4 = 0;
            while (i4 < 4) {
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed((Object) 4);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C14170x5707b916(4);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                PagerState rememberPagerState = PagerStateKt.rememberPagerState(i4, 0.0f, (Function0) rememberedValue, startRestartGroup, 0, 2);
                if (i4 % 2 == 0) {
                    startRestartGroup.startReplaceableGroup(1262370009);
                    i2 = R.color.blueDark1;
                } else {
                    startRestartGroup.startReplaceableGroup(1262370047);
                    i2 = R.color.red4;
                }
                long colorResource = ColorResources_androidKt.colorResource(i2, startRestartGroup, i3);
                startRestartGroup.endReplaceableGroup();
                m75133ScrollingPagerIndicatorP3dhf8A(rememberPagerState, colorResource, PaddingKt.m69717paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C3623Dp.m73842constructorimpl(16), 7, null), 0L, 0, 0.0f, 0.0f, 0.0f, startRestartGroup, 384, 248);
                i4++;
                startRestartGroup = startRestartGroup;
                i3 = 0;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PagerIndicatorKt$ScrollingPagerIndicatorPreview2$2(i));
        }
    }

    public static final float calculateCurrentOffsetForPage(@NotNull PagerState pagerState, int i) {
        Intrinsics.checkNotNullParameter(pagerState, "<this>");
        return (pagerState.getCurrentPage() - i) + pagerState.getCurrentPageOffsetFraction();
    }
}