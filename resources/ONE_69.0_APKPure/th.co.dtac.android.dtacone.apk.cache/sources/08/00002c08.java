package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ boolean $isFabDocked;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,375:1\n151#2,3:376\n33#2,4:379\n154#2,2:383\n38#2:385\n156#2:386\n171#2,13:387\n151#2,3:400\n33#2,4:403\n154#2,2:407\n38#2:409\n156#2:410\n171#2,13:411\n151#2,3:424\n33#2,4:427\n154#2,2:431\n38#2:433\n156#2:434\n171#2,13:435\n171#2,13:448\n151#2,3:461\n33#2,4:464\n154#2,2:468\n38#2:470\n156#2:471\n171#2,13:472\n151#2,3:485\n33#2,4:488\n154#2,2:492\n38#2:494\n156#2:495\n33#2,6:496\n33#2,6:502\n33#2,6:508\n33#2,6:514\n33#2,6:520\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt$ScaffoldLayout$1$1$1\n*L\n244#1:376,3\n244#1:379,4\n244#1:383,2\n244#1:385\n244#1:386\n248#1:387,13\n250#1:400,3\n250#1:403,4\n250#1:407,2\n250#1:409\n250#1:410\n254#1:411,13\n257#1:424,3\n257#1:427,4\n257#1:431,2\n257#1:433\n257#1:434\n262#1:435,13\n263#1:448,13\n294#1:461,3\n294#1:464,4\n294#1:468,2\n294#1:470\n294#1:471\n296#1:472,13\n323#1:485,3\n323#1:488,4\n323#1:492,2\n323#1:494\n323#1:495\n327#1:496,6\n330#1:502,6\n333#1:508,6\n337#1:514,6\n341#1:520,6\n*E\n"})
    /* renamed from: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1 */
    /* loaded from: classes.dex */
    public static final class C31371 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
        final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
        final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
        final /* synthetic */ int $fabPosition;
        final /* synthetic */ boolean $isFabDocked;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ long $looseConstraints;
        final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31371(SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, int i2, boolean z, int i3, long j, Function2<? super Composer, ? super Integer, Unit> function24, int i4, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
            super(1);
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$topBar = function2;
            this.$snackbar = function22;
            this.$fab = function23;
            this.$fabPosition = i;
            this.$layoutWidth = i2;
            this.$isFabDocked = z;
            this.$layoutHeight = i3;
            this.$looseConstraints = j;
            this.$bottomBar = function24;
            this.$$dirty = i4;
            this.$content = function3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02a8 A[LOOP:4: B:119:0x02a6->B:120:0x02a8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x02db A[LOOP:5: B:122:0x02d9->B:123:0x02db, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x030b A[LOOP:6: B:125:0x0309->B:126:0x030b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0328 A[LOOP:7: B:128:0x0326->B:129:0x0328, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0346 A[LOOP:8: B:131:0x0344->B:132:0x0346, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0364  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01e6 A[LOOP:3: B:85:0x01e4->B:86:0x01e6, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0201  */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.layout.Placeable.PlacementScope r30) {
            /*
                Method dump skipped, instructions count: 906
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.C31371.invoke2(androidx.compose.ui.layout.Placeable$PlacementScope):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayout$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function2<? super Composer, ? super Integer, Unit> function24, int i2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$topBar = function2;
        this.$snackbar = function22;
        this.$fab = function23;
        this.$fabPosition = i;
        this.$isFabDocked = z;
        this.$bottomBar = function24;
        this.$$dirty = i2;
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m70265invoke0kLqBqw(subcomposeMeasureScope, constraints.m73816unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m70265invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m73810getMaxWidthimpl = Constraints.m73810getMaxWidthimpl(j);
        int m73809getMaxHeightimpl = Constraints.m73809getMaxHeightimpl(j);
        return MeasureScope.CC.m59482q(SubcomposeLayout, m73810getMaxWidthimpl, m73809getMaxHeightimpl, null, new C31371(SubcomposeLayout, this.$topBar, this.$snackbar, this.$fab, this.$fabPosition, m73810getMaxWidthimpl, this.$isFabDocked, m73809getMaxHeightimpl, Constraints.m73802copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null), this.$bottomBar, this.$$dirty, this.$content), 4, null);
    }
}