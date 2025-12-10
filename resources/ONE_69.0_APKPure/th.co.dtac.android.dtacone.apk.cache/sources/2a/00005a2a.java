package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1549#2:335\n1620#2,3:336\n1963#2,14:339\n1549#2:353\n1620#2,3:354\n1963#2,14:357\n1963#2,14:371\n1603#2,9:385\n1855#2:394\n1856#2:397\n1612#2:398\n1963#2,14:399\n1963#2,14:413\n1549#2:427\n1620#2,3:428\n1963#2,14:431\n1549#2:445\n1620#2,3:446\n1855#2,2:449\n1855#2,2:451\n1855#2,2:453\n1855#2,2:455\n1855#2,2:457\n1#3:395\n1#3:396\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayout$1$1$1\n*L\n129#1:335\n129#1:336,3\n133#1:339,14\n135#1:353\n135#1:354,3\n151#1:357,14\n152#1:371,14\n155#1:385,9\n155#1:394\n155#1:397\n155#1:398\n172#1:399,14\n173#1:413,14\n199#1:427\n199#1:428,3\n201#1:431,14\n240#1:445\n240#1:446,3\n244#1:449,2\n247#1:451,2\n250#1:453,2\n258#1:455,2\n263#1:457,2\n155#1:396\n*E\n"})
    /* renamed from: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1 */
    /* loaded from: classes2.dex */
    public static final class C33361 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
        final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
        final /* synthetic */ WindowInsets $contentWindowInsets;
        final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
        final /* synthetic */ int $fabPosition;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ long $looseConstraints;
        final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C33361(SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, int i2, WindowInsets windowInsets, long j, Function2<? super Composer, ? super Integer, Unit> function24, int i3, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, int i4) {
            super(1);
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$topBar = function2;
            this.$snackbar = function22;
            this.$fab = function23;
            this.$fabPosition = i;
            this.$layoutWidth = i2;
            this.$contentWindowInsets = windowInsets;
            this.$looseConstraints = j;
            this.$bottomBar = function24;
            this.$$dirty = i3;
            this.$content = function3;
            this.$layoutHeight = i4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
            Object next;
            Object next2;
            Object next3;
            FabPlacement fabPlacement;
            Object next4;
            Integer num;
            int i;
            int intValue;
            float f;
            int mo69616roundToPx0680j_4;
            float f2;
            Object next5;
            Object next6;
            int i2;
            float f3;
            float f4;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, this.$topBar);
            long j = this.$looseConstraints;
            ArrayList<Placeable> arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(subcompose, 10));
            for (Measurable measurable : subcompose) {
                arrayList.add(measurable.mo72995measureBRTryo0(j));
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int height = ((Placeable) next).getHeight();
                    do {
                        Object next7 = it.next();
                        int height2 = ((Placeable) next7).getHeight();
                        if (height < height2) {
                            next = next7;
                            height = height2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Placeable placeable = (Placeable) next;
            int height3 = placeable != null ? placeable.getHeight() : 0;
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, this.$snackbar);
            WindowInsets windowInsets = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
            long j2 = this.$looseConstraints;
            ArrayList<Placeable> arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(subcompose2, 10));
            for (Measurable measurable2 : subcompose2) {
                arrayList2.add(measurable2.mo72995measureBRTryo0(ConstraintsKt.m73826offsetNN6EwU(j2, (-windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope))));
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    int height4 = ((Placeable) next2).getHeight();
                    do {
                        Object next8 = it2.next();
                        int height5 = ((Placeable) next8).getHeight();
                        if (height4 < height5) {
                            next2 = next8;
                            height4 = height5;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next2 = null;
            }
            Placeable placeable2 = (Placeable) next2;
            int height6 = placeable2 != null ? placeable2.getHeight() : 0;
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next3 = it3.next();
                if (it3.hasNext()) {
                    int width = ((Placeable) next3).getWidth();
                    do {
                        Object next9 = it3.next();
                        int width2 = ((Placeable) next9).getWidth();
                        if (width < width2) {
                            next3 = next9;
                            width = width2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next3 = null;
            }
            Placeable placeable3 = (Placeable) next3;
            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
            WindowInsets windowInsets2 = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope2 = this.$this_SubcomposeLayout;
            long j3 = this.$looseConstraints;
            ArrayList arrayList3 = new ArrayList();
            for (Measurable measurable3 : this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, this.$fab)) {
                Placeable mo72995measureBRTryo0 = measurable3.mo72995measureBRTryo0(ConstraintsKt.m73826offsetNN6EwU(j3, (-windowInsets2.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope2)));
                mo72995measureBRTryo0 = (mo72995measureBRTryo0.getHeight() == 0 || mo72995measureBRTryo0.getWidth() == 0) ? null : null;
                if (mo72995measureBRTryo0 != null) {
                    arrayList3.add(mo72995measureBRTryo0);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                if (it4.hasNext()) {
                    next5 = it4.next();
                    if (it4.hasNext()) {
                        int width4 = ((Placeable) next5).getWidth();
                        do {
                            Object next10 = it4.next();
                            int width5 = ((Placeable) next10).getWidth();
                            if (width4 < width5) {
                                next5 = next10;
                                width4 = width5;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next5 = null;
                }
                Intrinsics.checkNotNull(next5);
                int width6 = ((Placeable) next5).getWidth();
                Iterator it5 = arrayList3.iterator();
                if (it5.hasNext()) {
                    next6 = it5.next();
                    if (it5.hasNext()) {
                        int height7 = ((Placeable) next6).getHeight();
                        do {
                            Object next11 = it5.next();
                            int height8 = ((Placeable) next11).getHeight();
                            if (height7 < height8) {
                                next6 = next11;
                                height7 = height8;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next6 = null;
                }
                Intrinsics.checkNotNull(next6);
                int height9 = ((Placeable) next6).getHeight();
                if (FabPosition.m70576equalsimpl0(this.$fabPosition, FabPosition.Companion.m70581getEndERTFSPs())) {
                    if (this.$this_SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr) {
                        int i3 = this.$layoutWidth;
                        SubcomposeMeasureScope subcomposeMeasureScope3 = this.$this_SubcomposeLayout;
                        f4 = ScaffoldKt.f26074b;
                        i2 = (i3 - subcomposeMeasureScope3.mo69616roundToPx0680j_4(f4)) - width6;
                    } else {
                        SubcomposeMeasureScope subcomposeMeasureScope4 = this.$this_SubcomposeLayout;
                        f3 = ScaffoldKt.f26074b;
                        i2 = subcomposeMeasureScope4.mo69616roundToPx0680j_4(f3);
                    }
                } else {
                    i2 = (this.$layoutWidth - width6) / 2;
                }
                fabPlacement = new FabPlacement(i2, width6, height9);
            } else {
                fabPlacement = null;
            }
            List<Measurable> subcompose3 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(-1455477816, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(fabPlacement, this.$bottomBar, this.$$dirty)));
            long j4 = this.$looseConstraints;
            ArrayList arrayList4 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(subcompose3, 10));
            for (Measurable measurable4 : subcompose3) {
                arrayList4.add(measurable4.mo72995measureBRTryo0(j4));
            }
            Iterator it6 = arrayList4.iterator();
            if (it6.hasNext()) {
                next4 = it6.next();
                if (it6.hasNext()) {
                    int height10 = ((Placeable) next4).getHeight();
                    do {
                        Object next12 = it6.next();
                        int height11 = ((Placeable) next12).getHeight();
                        if (height10 < height11) {
                            next4 = next12;
                            height10 = height11;
                        }
                    } while (it6.hasNext());
                }
            } else {
                next4 = null;
            }
            Placeable placeable4 = (Placeable) next4;
            Integer valueOf = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
            if (fabPlacement != null) {
                SubcomposeMeasureScope subcomposeMeasureScope5 = this.$this_SubcomposeLayout;
                WindowInsets windowInsets3 = this.$contentWindowInsets;
                if (valueOf == null) {
                    int height12 = fabPlacement.getHeight();
                    f2 = ScaffoldKt.f26074b;
                    mo69616roundToPx0680j_4 = height12 + subcomposeMeasureScope5.mo69616roundToPx0680j_4(f2) + windowInsets3.getBottom(subcomposeMeasureScope5);
                } else {
                    int intValue2 = valueOf.intValue() + fabPlacement.getHeight();
                    f = ScaffoldKt.f26074b;
                    mo69616roundToPx0680j_4 = intValue2 + subcomposeMeasureScope5.mo69616roundToPx0680j_4(f);
                }
                num = Integer.valueOf(mo69616roundToPx0680j_4);
            } else {
                num = null;
            }
            if (height6 != 0) {
                if (num != null) {
                    intValue = num.intValue();
                } else {
                    intValue = valueOf != null ? valueOf.intValue() : this.$contentWindowInsets.getBottom(this.$this_SubcomposeLayout);
                }
                i = height6 + intValue;
            } else {
                i = 0;
            }
            SubcomposeMeasureScope subcomposeMeasureScope6 = this.$this_SubcomposeLayout;
            List<Measurable> subcompose4 = subcomposeMeasureScope6.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(1643221465, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(this.$contentWindowInsets, subcomposeMeasureScope6, arrayList, height3, arrayList4, valueOf, this.$content, this.$$dirty)));
            long j5 = this.$looseConstraints;
            ArrayList<Placeable> arrayList5 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(subcompose4, 10));
            for (Measurable measurable5 : subcompose4) {
                arrayList5.add(measurable5.mo72995measureBRTryo0(j5));
            }
            for (Placeable placeable5 : arrayList5) {
                Placeable.PlacementScope.place$default(layout, placeable5, 0, 0, 0.0f, 4, null);
                arrayList3 = arrayList3;
                arrayList4 = arrayList4;
                arrayList = arrayList;
            }
            ArrayList<Placeable> arrayList6 = arrayList4;
            ArrayList<Placeable> arrayList7 = arrayList3;
            for (Placeable placeable6 : arrayList) {
                Placeable.PlacementScope.place$default(layout, placeable6, 0, 0, 0.0f, 4, null);
            }
            int i4 = this.$layoutWidth;
            WindowInsets windowInsets4 = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope7 = this.$this_SubcomposeLayout;
            int i5 = this.$layoutHeight;
            for (Placeable placeable7 : arrayList2) {
                Placeable.PlacementScope.place$default(layout, placeable7, windowInsets4.getLeft(subcomposeMeasureScope7, subcomposeMeasureScope7.getLayoutDirection()) + ((i4 - width3) / 2), i5 - i, 0.0f, 4, null);
            }
            int i6 = this.$layoutHeight;
            for (Placeable placeable8 : arrayList6) {
                Placeable.PlacementScope.place$default(layout, placeable8, 0, i6 - (valueOf != null ? valueOf.intValue() : 0), 0.0f, 4, null);
            }
            if (fabPlacement != null) {
                int i7 = this.$layoutHeight;
                for (Placeable placeable9 : arrayList7) {
                    int left = fabPlacement.getLeft();
                    Intrinsics.checkNotNull(num);
                    Placeable.PlacementScope.place$default(layout, placeable9, left, i7 - num.intValue(), 0.0f, 4, null);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayout$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, WindowInsets windowInsets, Function2<? super Composer, ? super Integer, Unit> function24, int i2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$topBar = function2;
        this.$snackbar = function22;
        this.$fab = function23;
        this.$fabPosition = i;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = function24;
        this.$$dirty = i2;
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m70703invoke0kLqBqw(subcomposeMeasureScope, constraints.m73816unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m70703invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m73810getMaxWidthimpl = Constraints.m73810getMaxWidthimpl(j);
        int m73809getMaxHeightimpl = Constraints.m73809getMaxHeightimpl(j);
        return MeasureScope.CC.m59482q(SubcomposeLayout, m73810getMaxWidthimpl, m73809getMaxHeightimpl, null, new C33361(SubcomposeLayout, this.$topBar, this.$snackbar, this.$fab, this.$fabPosition, m73810getMaxWidthimpl, this.$contentWindowInsets, Constraints.m73802copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null), this.$bottomBar, this.$$dirty, this.$content, m73809getMaxHeightimpl), 4, null);
    }
}