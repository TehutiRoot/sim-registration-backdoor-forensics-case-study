package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.node.LookaheadCapablePlaceable;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.layout.MeasureScope */
/* loaded from: classes2.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* renamed from: androidx.compose.ui.layout.MeasureScope$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        /* renamed from: a */
        public static MeasureResult m59548a(final MeasureScope measureScope, final int i, final int i2, final Map alignmentLines, final Function1 placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return new MeasureResult(i, i2, alignmentLines, measureScope, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1

                /* renamed from: a */
                public final int f30129a;

                /* renamed from: b */
                public final int f30130b;

                /* renamed from: c */
                public final Map f30131c;

                /* renamed from: d */
                public final /* synthetic */ int f30132d;

                /* renamed from: e */
                public final /* synthetic */ MeasureScope f30133e;

                /* renamed from: f */
                public final /* synthetic */ Function1 f30134f;

                {
                    this.f30132d = i;
                    this.f30133e = measureScope;
                    this.f30134f = placementBlock;
                    this.f30129a = i;
                    this.f30130b = i2;
                    this.f30131c = alignmentLines;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                @NotNull
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.f30131c;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                public int getHeight() {
                    return this.f30130b;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                public int getWidth() {
                    return this.f30129a;
                }

                @Override // androidx.compose.p003ui.layout.MeasureResult
                public void placeChildren() {
                    LookaheadCapablePlaceable lookaheadCapablePlaceable;
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                    int i3 = this.f30132d;
                    LayoutDirection layoutDirection = this.f30133e.getLayoutDirection();
                    MeasureScope measureScope2 = this.f30133e;
                    if (measureScope2 instanceof LookaheadCapablePlaceable) {
                        lookaheadCapablePlaceable = (LookaheadCapablePlaceable) measureScope2;
                    } else {
                        lookaheadCapablePlaceable = null;
                    }
                    Function1 function1 = this.f30134f;
                    LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f30153c;
                    int parentWidth = companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f30154d;
                    Placeable.PlacementScope.f30152b = i3;
                    Placeable.PlacementScope.f30151a = layoutDirection;
                    boolean m59522a = companion.m59522a(lookaheadCapablePlaceable);
                    function1.invoke(companion);
                    if (lookaheadCapablePlaceable != null) {
                        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(m59522a);
                    }
                    Placeable.PlacementScope.f30152b = parentWidth;
                    Placeable.PlacementScope.f30151a = parentLayoutDirection;
                    Placeable.PlacementScope.f30153c = layoutCoordinates;
                    Placeable.PlacementScope.f30154d = layoutNodeLayoutDelegate;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: q */
        public static /* synthetic */ MeasureResult m59532q(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    map = AbstractC11687a.emptyMap();
                }
                return measureScope.layout(i, i2, map, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.layout.MeasureScope$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @ExperimentalComposeUiApi
        @Deprecated
        public static boolean isLookingAhead(@NotNull MeasureScope measureScope) {
            return AbstractC18748Xf0.m65457a(measureScope);
        }

        @Deprecated
        @NotNull
        public static MeasureResult layout(@NotNull MeasureScope measureScope, int i, int i2, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return CC.m59548a(measureScope, i, i2, alignmentLines, placementBlock);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m72830roundToPxR2X_6o(@NotNull MeasureScope measureScope, long j) {
            return AbstractC11522jG.m29253a(measureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m72831roundToPx0680j_4(@NotNull MeasureScope measureScope, float f) {
            return AbstractC11522jG.m29252b(measureScope, f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m72832toDpGaN1DYA(@NotNull MeasureScope measureScope, long j) {
            return AbstractC11522jG.m29251c(measureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m72833toDpu2uoSUM(@NotNull MeasureScope measureScope, float f) {
            return AbstractC11522jG.m29250d(measureScope, f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m72835toDpSizekrfVVM(@NotNull MeasureScope measureScope, long j) {
            return AbstractC11522jG.m29248f(measureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m72836toPxR2X_6o(@NotNull MeasureScope measureScope, long j) {
            return AbstractC11522jG.m29247g(measureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m72837toPx0680j_4(@NotNull MeasureScope measureScope, float f) {
            return AbstractC11522jG.m29246h(measureScope, f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull MeasureScope measureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return AbstractC11522jG.m29245i(measureScope, receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m72838toSizeXkaWNTQ(@NotNull MeasureScope measureScope, long j) {
            return AbstractC11522jG.m29244j(measureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m72839toSp0xMU5do(@NotNull MeasureScope measureScope, float f) {
            return AbstractC11522jG.m29243k(measureScope, f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m72840toSpkPz2Gy4(@NotNull MeasureScope measureScope, float f) {
            return AbstractC11522jG.m29242l(measureScope, f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m72834toDpu2uoSUM(@NotNull MeasureScope measureScope, int i) {
            return AbstractC11522jG.m29249e(measureScope, i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m72841toSpkPz2Gy4(@NotNull MeasureScope measureScope, int i) {
            return AbstractC11522jG.m29241m(measureScope, i);
        }
    }

    @NotNull
    MeasureResult layout(int i, int i2, @NotNull Map<AlignmentLine, Integer> map, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1);
}
