package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItem$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,447:1\n75#2,5:448\n80#2:479\n84#2:484\n75#3:453\n76#3,11:455\n89#3:483\n76#4:454\n460#5,13:466\n473#5,3:480\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItem$1\n*L\n166#1:448,5\n166#1:479\n166#1:484\n166#1:453\n166#1:455,11\n166#1:483\n166#1:454\n166#1:466,13\n166#1:480,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ListItemKt$ListItem$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ Alignment.Vertical $boxAlignment;
    final /* synthetic */ Arrangement.Vertical $columnArrangement;
    final /* synthetic */ PaddingValues $contentPaddingValues;
    final /* synthetic */ Function2<Composer, Integer, Unit> $decoratedHeadlineContent;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $decoratedLeadingContent;
    final /* synthetic */ Function2<Composer, Integer, Unit> $decoratedOverlineContent;
    final /* synthetic */ Function2<Composer, Integer, Unit> $decoratedSupportingContent;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $decoratedTrailingContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, PaddingValues paddingValues, Alignment.Vertical vertical, Arrangement.Vertical vertical2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23) {
        super(3);
        this.$decoratedLeadingContent = function3;
        this.$contentPaddingValues = paddingValues;
        this.$boxAlignment = vertical;
        this.$columnArrangement = vertical2;
        this.$decoratedTrailingContent = function32;
        this.$decoratedOverlineContent = function2;
        this.$decoratedHeadlineContent = function22;
        this.$decoratedSupportingContent = function23;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull RowScope ListItem, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(ListItem, "$this$ListItem");
        if ((i & 14) == 0) {
            i |= composer.changed(ListItem) ? 4 : 2;
        }
        if ((i & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1813277157, i, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:161)");
        }
        composer.startReplaceableGroup(1316674963);
        Function3<RowScope, Composer, Integer, Unit> function3 = this.$decoratedLeadingContent;
        if (function3 != null) {
            function3.invoke(ListItem, composer, Integer.valueOf(i & 14));
        }
        composer.endReplaceableGroup();
        Modifier align = ListItem.align(PaddingKt.padding(AbstractC17770Hy1.m68013a(ListItem, Modifier.Companion, 1.0f, false, 2, null), this.$contentPaddingValues), this.$boxAlignment);
        Arrangement.Vertical vertical = this.$columnArrangement;
        Function2<Composer, Integer, Unit> function2 = this.$decoratedOverlineContent;
        Function2<Composer, Integer, Unit> function22 = this.$decoratedHeadlineContent;
        Function2<Composer, Integer, Unit> function23 = this.$decoratedSupportingContent;
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(align);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m71393constructorimpl = Updater.m71393constructorimpl(composer);
        Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, density, companion.getSetDensity());
        Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(984343928);
        if (function2 != null) {
            function2.invoke(composer, 0);
        }
        composer.endReplaceableGroup();
        function22.invoke(composer, 6);
        composer.startReplaceableGroup(1316675435);
        if (function23 != null) {
            function23.invoke(composer, 0);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Function3<RowScope, Composer, Integer, Unit> function32 = this.$decoratedTrailingContent;
        if (function32 != null) {
            function32.invoke(ListItem, composer, Integer.valueOf(i & 14));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
