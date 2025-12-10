package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneRegisterTrueOnlineCvgDataItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineSelectNumberScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineSelectNumberScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/existingTmhTvs/OneRegisterTrueOnlineSelectNumberScreenKt$NumberCard$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,350:1\n71#2,7:351\n78#2:386\n82#2:443\n78#3,11:358\n78#3,11:405\n91#3:437\n91#3:442\n456#4,8:369\n464#4,3:383\n50#4:390\n49#4:391\n456#4,8:416\n464#4,3:430\n467#4,3:434\n467#4,3:439\n4144#5,6:377\n4144#5,6:424\n1864#6,2:387\n1866#6:398\n164#7:389\n154#7:399\n1097#8,6:392\n67#9,5:400\n72#9:433\n76#9:438\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineSelectNumberScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/existingTmhTvs/OneRegisterTrueOnlineSelectNumberScreenKt$NumberCard$3\n*L\n149#1:351,7\n149#1:386\n149#1:443\n149#1:358,11\n167#1:405,11\n167#1:437\n149#1:442\n149#1:369,8\n149#1:383,3\n164#1:390\n164#1:391\n167#1:416,8\n167#1:430,3\n167#1:434,3\n149#1:439,3\n149#1:377,6\n167#1:424,6\n152#1:387,2\n152#1:398\n155#1:389\n172#1:399\n164#1:392,6\n167#1:400,5\n167#1:433\n167#1:438\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs.OneRegisterTrueOnlineSelectNumberScreenKt$NumberCard$3 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineSelectNumberScreenKt$NumberCard$3 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<OneRegisterTrueOnlineCvgDataItem> $dataList;
    final /* synthetic */ String $emptyMessage;
    final /* synthetic */ Function1<String, String> $formatter;
    final /* synthetic */ Function1<String, Unit> $onSelected;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneRegisterTrueOnlineSelectNumberScreenKt$NumberCard$3(String str, int i, List<OneRegisterTrueOnlineCvgDataItem> list, Function1<? super String, String> function1, Function1<? super String, Unit> function12, String str2) {
        super(3);
        this.$title = str;
        this.$$dirty = i;
        this.$dataList = list;
        this.$formatter = function1;
        this.$onSelected = function12;
        this.$emptyMessage = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r56v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        OneRegisterTrueOnlineCvgDataItem oneRegisterTrueOnlineCvgDataItem;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(783474327, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs.NumberCard.<anonymous> (OneRegisterTrueOnlineSelectNumberScreen.kt:147)");
        }
        String str = this.$title;
        int i2 = this.$$dirty;
        List<OneRegisterTrueOnlineCvgDataItem> list = this.$dataList;
        Function1<String, String> function1 = this.$formatter;
        Function1<String, Unit> function12 = this.$onSelected;
        String str2 = this.$emptyMessage;
        composer.startReplaceableGroup(-483455358);
        Modifier.Companion companion = Modifier.Companion;
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
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
        OneRegisterTrueOnlineSelectNumberScreenKt.NumberCardHeader(str, composer, i2 & 14);
        Object obj = null;
        float f = 0.0f;
        if (!list.isEmpty()) {
            composer.startReplaceableGroup(365351048);
            int i3 = 0;
            for (Object obj2 : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                OneRegisterTrueOnlineCvgDataItem oneRegisterTrueOnlineCvgDataItem2 = (OneRegisterTrueOnlineCvgDataItem) obj2;
                composer.startReplaceableGroup(365351129);
                if (i3 > 0) {
                    float m73842constructorimpl = C3623Dp.m73842constructorimpl((float) 0.5d);
                    long colorResource = ColorResources_androidKt.colorResource(R.color.opacityWhite25PercentOne, composer, 0);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, f, 1, obj);
                    oneRegisterTrueOnlineCvgDataItem = oneRegisterTrueOnlineCvgDataItem2;
                    DividerKt.m70554Divider9IZ8Weo(fillMaxWidth$default, m73842constructorimpl, colorResource, composer, 54, 0);
                } else {
                    oneRegisterTrueOnlineCvgDataItem = oneRegisterTrueOnlineCvgDataItem2;
                }
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(511388516);
                boolean changed = composer.changed(function12) | composer.changed(oneRegisterTrueOnlineCvgDataItem);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new OneRegisterTrueOnlineSelectNumberScreenKt$NumberCard$3$1$1$1$1(function12, oneRegisterTrueOnlineCvgDataItem);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                OneRegisterTrueOnlineSelectNumberScreenKt.m9565d(columnScopeInstance, oneRegisterTrueOnlineCvgDataItem, function1, rememberedValue, composer, 6 | ((i2 >> 3) & 896));
                i3 = i4;
                f = 0.0f;
                obj = null;
            }
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(365351767);
            Alignment center = companion2.getCenter();
            Modifier m69715paddingVpY3zN4$default = PaddingKt.m69715paddingVpY3zN4$default(BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.white, composer, 0), null, 2, null), 0.0f, C3623Dp.m73842constructorimpl(24), 1, null);
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69715paddingVpY3zN4$default);
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
            long colorResource2 = ColorResources_androidKt.colorResource(R.color.grayishBrown, composer, 0);
            FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
            TextKt.m70882Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(colorResource2, TextUnitKt.getSp(14), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(21), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, (i2 >> 6) & 14, 0, 65022);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}