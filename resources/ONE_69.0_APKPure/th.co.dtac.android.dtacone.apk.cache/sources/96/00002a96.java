package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,748:1\n1549#2:749\n1620#2,3:750\n1549#2:753\n1620#2,3:754\n1549#2:770\n1620#2,3:771\n1549#2:774\n1620#2,3:775\n1549#2:804\n1620#2,3:805\n171#3,13:757\n171#3,13:778\n171#3,13:791\n171#3,13:808\n171#3,13:821\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1\n*L\n620#1:749\n620#1:750,3\n625#1:753\n625#1:754,3\n632#1:770\n632#1:771,3\n635#1:774\n635#1:775,3\n649#1:804\n649#1:805,3\n627#1:757,13\n637#1:778,13\n638#1:791,13\n650#1:808,13\n651#1:821,13\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $body;
    final /* synthetic */ Function3<Integer, Composer, Integer, Unit> $bottomSheet;
    final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Function0<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,748:1\n33#2,6:749\n33#2,6:755\n33#2,6:761\n33#2,6:767\n33#2,6:773\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1\n*L\n659#1:749,6\n660#1:755,6\n661#1:761,6\n662#1:767,6\n663#1:773,6\n*E\n"})
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1 */
    /* loaded from: classes.dex */
    public static final class C30671 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ List<Placeable> $bodyPlaceables;
        final /* synthetic */ int $fabOffsetX;
        final /* synthetic */ int $fabOffsetY;
        final /* synthetic */ List<Placeable> $fabPlaceable;
        final /* synthetic */ int $sheetOffsetY;
        final /* synthetic */ List<Placeable> $sheetPlaceables;
        final /* synthetic */ int $snackbarOffsetX;
        final /* synthetic */ int $snackbarOffsetY;
        final /* synthetic */ List<Placeable> $snackbarPlaceables;
        final /* synthetic */ int $topBarHeight;
        final /* synthetic */ List<Placeable> $topBarPlaceables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30671(List<? extends Placeable> list, List<? extends Placeable> list2, List<? extends Placeable> list3, List<? extends Placeable> list4, List<? extends Placeable> list5, int i, int i2, int i3, int i4, int i5, int i6) {
            super(1);
            this.$bodyPlaceables = list;
            this.$topBarPlaceables = list2;
            this.$sheetPlaceables = list3;
            this.$fabPlaceable = list4;
            this.$snackbarPlaceables = list5;
            this.$topBarHeight = i;
            this.$sheetOffsetY = i2;
            this.$fabOffsetX = i3;
            this.$fabOffsetY = i4;
            this.$snackbarOffsetX = i5;
            this.$snackbarOffsetY = i6;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Placeable> list = this.$bodyPlaceables;
            int i = this.$topBarHeight;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Placeable.PlacementScope.placeRelative$default(layout, list.get(i2), 0, i, 0.0f, 4, null);
            }
            List<Placeable> list2 = this.$topBarPlaceables;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Placeable.PlacementScope.placeRelative$default(layout, list2.get(i3), 0, 0, 0.0f, 4, null);
                }
            }
            List<Placeable> list3 = this.$sheetPlaceables;
            int i4 = this.$sheetOffsetY;
            int size3 = list3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                Placeable.PlacementScope.placeRelative$default(layout, list3.get(i5), 0, i4, 0.0f, 4, null);
            }
            List<Placeable> list4 = this.$fabPlaceable;
            if (list4 != null) {
                int i6 = this.$fabOffsetX;
                int i7 = this.$fabOffsetY;
                int size4 = list4.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    Placeable.PlacementScope.placeRelative$default(layout, list4.get(i8), i6, i7, 0.0f, 4, null);
                }
            }
            List<Placeable> list5 = this.$snackbarPlaceables;
            int i9 = this.$snackbarOffsetX;
            int i10 = this.$snackbarOffsetY;
            int size5 = list5.size();
            for (int i11 = 0; i11 < size5; i11++) {
                Placeable.PlacementScope.placeRelative$default(layout, list5.get(i11), i9, i10, 0.0f, 4, null);
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomSheetValue.values().length];
            try {
                iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomSheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(Function0<Float> function0, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i, float f, Function2<? super Composer, ? super Integer, Unit> function23, BottomSheetState bottomSheetState, Function3<? super Integer, ? super Composer, ? super Integer, Unit> function3, int i2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32) {
        super(2);
        this.$sheetOffset = function0;
        this.$topBar = function2;
        this.$floatingActionButton = function22;
        this.$floatingActionButtonPosition = i;
        this.$sheetPeekHeight = f;
        this.$snackbarHost = function23;
        this.$sheetState = bottomSheetState;
        this.$bottomSheet = function3;
        this.$$dirty = i2;
        this.$body = function32;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m70120invoke0kLqBqw(subcomposeMeasureScope, constraints.m73816unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b A[LOOP:2: B:32:0x0115->B:34:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023e A[LOOP:4: B:88:0x0238->B:90:0x023e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0254  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.p003ui.layout.MeasureResult m70120invoke0kLqBqw(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.layout.SubcomposeMeasureScope r24, long r25) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.m70120invoke0kLqBqw(androidx.compose.ui.layout.SubcomposeMeasureScope, long):androidx.compose.ui.layout.MeasureResult");
    }
}