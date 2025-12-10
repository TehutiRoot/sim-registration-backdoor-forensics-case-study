package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LookaheadScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LookaheadDelegate;
import androidx.compose.p003ui.node.NodeCoordinator;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJK\u0010\u0011\u001a\u00020\t*\u00020\t26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0006R\u0018\u0010\u000e\u001a\u00020\u0003*\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/ui/layout/LookaheadScopeImpl;", "Landroidx/compose/ui/layout/LookaheadScope;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "scopeCoordinates", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Lkotlin/ParameterName;", "name", "lookaheadScopeCoordinates", "layoutCoordinates", "", "onPlaced", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function0;", "getScopeCoordinates", "()Lkotlin/jvm/functions/Function0;", "setScopeCoordinates", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.LookaheadScopeImpl */
/* loaded from: classes2.dex */
public final class LookaheadScopeImpl implements LookaheadScope {

    /* renamed from: a */
    public Function0 f30128a;

    public LookaheadScopeImpl() {
        this(null, 1, null);
    }

    @Override // androidx.compose.p003ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates getLookaheadScopeCoordinates(@NotNull Placeable.PlacementScope placementScope) {
        Intrinsics.checkNotNullParameter(placementScope, "<this>");
        Function0 function0 = this.f30128a;
        Intrinsics.checkNotNull(function0);
        return (LayoutCoordinates) function0.invoke();
    }

    @Nullable
    public final Function0<LayoutCoordinates> getScopeCoordinates() {
        return this.f30128a;
    }

    @Override // androidx.compose.p003ui.layout.LookaheadScope
    public /* synthetic */ Modifier intermediateLayout(Modifier modifier, Function4 function4) {
        return LookaheadScope.CC.m59550a(this, modifier, function4);
    }

    @Override // androidx.compose.p003ui.layout.LookaheadScope
    /* renamed from: localLookaheadPositionOf-dBAh8RU */
    public /* synthetic */ long mo72814localLookaheadPositionOfdBAh8RU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return LookaheadScope.CC.m59549b(this, layoutCoordinates, layoutCoordinates2);
    }

    @Override // androidx.compose.p003ui.layout.LookaheadScope
    @Deprecated(message = "onPlaced in LookaheadLayoutScope has been deprecated. It's replaced with reading LookaheadLayoutCoordinates directly during placement inIntermediateMeasureScope")
    @NotNull
    public Modifier onPlaced(@NotNull Modifier modifier, @NotNull Function2<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, Unit> onPlaced) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPlaced, "onPlaced");
        return OnPlacedModifierKt.onPlaced(modifier, new LookaheadScopeImpl$onPlaced$1(onPlaced, this));
    }

    public final void setScopeCoordinates(@Nullable Function0<? extends LayoutCoordinates> function0) {
        this.f30128a = function0;
    }

    @Override // androidx.compose.p003ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl;
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinates;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        if (layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl) {
            lookaheadLayoutCoordinatesImpl = (LookaheadLayoutCoordinatesImpl) layoutCoordinates;
        } else {
            lookaheadLayoutCoordinatesImpl = null;
        }
        if (lookaheadLayoutCoordinatesImpl == null) {
            NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
            LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
            if (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) {
                return nodeCoordinator;
            }
            return lookaheadLayoutCoordinates;
        }
        return lookaheadLayoutCoordinatesImpl;
    }

    public LookaheadScopeImpl(@Nullable Function0<? extends LayoutCoordinates> function0) {
        this.f30128a = function0;
    }

    public /* synthetic */ LookaheadScopeImpl(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }
}
