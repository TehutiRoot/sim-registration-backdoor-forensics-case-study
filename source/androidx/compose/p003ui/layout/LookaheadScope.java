package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalComposeUiApi
@Metadata(m28851d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Jg\u0010\u0007\u001a\u00020\b*\u00020\b2V\u0010\t\u001aR\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\n¢\u0006\u0002\b\u0015H\u0017ø\u0001\u0000J$\u0010\u0016\u001a\u00020\u0017*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\u001b\u001a\u00020\b*\u00020\b26\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f0\u001cH'J\f\u0010 \u001a\u00020\u0003*\u00020\u0003H&R\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/layout/LookaheadScope;", "", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "intermediateLayout", "Landroidx/compose/ui/Modifier;", "measure", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/ParameterName;", "name", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "coordinates", "localLookaheadPositionOf-dBAh8RU", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)J", "onPlaced", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "layoutCoordinates", "", "toLookaheadCoordinates", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.layout.LookaheadScope */
/* loaded from: classes2.dex */
public interface LookaheadScope {

    /* renamed from: androidx.compose.ui.layout.LookaheadScope$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        /* renamed from: a */
        public static Modifier m59550a(LookaheadScope lookaheadScope, Modifier modifier, Function4 measure) {
            Intrinsics.checkNotNullParameter(modifier, "<this>");
            Intrinsics.checkNotNullParameter(measure, "measure");
            return LookaheadScopeKt.intermediateLayout(modifier, new LookaheadScope$intermediateLayout$1(measure));
        }

        /* renamed from: b */
        public static long m59549b(LookaheadScope lookaheadScope, LayoutCoordinates localLookaheadPositionOf, LayoutCoordinates coordinates) {
            Intrinsics.checkNotNullParameter(localLookaheadPositionOf, "$this$localLookaheadPositionOf");
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            return lookaheadScope.toLookaheadCoordinates(localLookaheadPositionOf).mo72817localPositionOfR5De75A(lookaheadScope.toLookaheadCoordinates(coordinates), Offset.Companion.m71518getZeroF1C5BW0());
        }
    }

    @NotNull
    LayoutCoordinates getLookaheadScopeCoordinates(@NotNull Placeable.PlacementScope placementScope);

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "intermediateLayout { measurable, constraints ->measure.invoke(this, measurable, constraints, lookaheadSize)}", imports = {}))
    @NotNull
    Modifier intermediateLayout(@NotNull Modifier modifier, @NotNull Function4<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> function4);

    /* renamed from: localLookaheadPositionOf-dBAh8RU */
    long mo72814localLookaheadPositionOfdBAh8RU(@NotNull LayoutCoordinates layoutCoordinates, @NotNull LayoutCoordinates layoutCoordinates2);

    @Deprecated(message = "onPlaced in LookaheadLayoutScope has been deprecated. It's replaced with reading LookaheadLayoutCoordinates directly during placement in IntermediateMeasureScope. See example below.")
    @NotNull
    Modifier onPlaced(@NotNull Modifier modifier, @NotNull Function2<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, Unit> function2);

    @NotNull
    LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates);
}
