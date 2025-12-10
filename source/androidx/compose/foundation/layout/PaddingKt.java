package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a!\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, m28850d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n154#2:472\n154#2:473\n154#2:474\n154#2:475\n154#2:476\n154#2:477\n154#2:478\n154#2:479\n154#2:480\n154#2:481\n154#2:482\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n50#1:468\n51#1:469\n52#1:470\n53#1:471\n83#1:472\n84#1:473\n156#1:474\n157#1:475\n158#1:476\n159#1:477\n275#1:478\n285#1:479\n286#1:480\n287#1:481\n288#1:482\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    @NotNull
    /* renamed from: PaddingValues-0680j_4 */
    public static final PaddingValues m69522PaddingValues0680j_4(float f) {
        return new PaddingValuesImpl(f, f, f, f, null);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-YgX7TsA */
    public static final PaddingValues m69523PaddingValuesYgX7TsA(float f, float f2) {
        return new PaddingValuesImpl(f, f2, f, f2, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default */
    public static /* synthetic */ PaddingValues m69524PaddingValuesYgX7TsA$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.m73658constructorimpl(0);
        }
        return m69523PaddingValuesYgX7TsA(f, f2);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-a9UjIt4 */
    public static final PaddingValues m69525PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new PaddingValuesImpl(f, f2, f3, f4, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m69526PaddingValuesa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = C3641Dp.m73658constructorimpl(0);
        }
        return m69525PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    @Stable
    @NotNull
    /* renamed from: absolutePadding-qDBjuR0 */
    public static final Modifier m69527absolutePaddingqDBjuR0(@NotNull Modifier absolutePadding, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new PaddingElement(f, f2, f3, f4, false, new PaddingKt$absolutePadding$1(f, f2, f3, f4), null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default */
    public static /* synthetic */ Modifier m69528absolutePaddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = C3641Dp.m73658constructorimpl(0);
        }
        return m69527absolutePaddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    @Stable
    public static final float calculateEndPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo69158calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo69157calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo69157calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo69158calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    @NotNull
    public static final Modifier padding(@NotNull Modifier modifier, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesElement(paddingValues, new PaddingKt$padding$4(paddingValues)));
    }

    @Stable
    @NotNull
    /* renamed from: padding-3ABfNKs */
    public static final Modifier m69529padding3ABfNKs(@NotNull Modifier padding, float f) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingElement(f, f, f, f, true, new PaddingKt$padding$3(f), null));
    }

    @Stable
    @NotNull
    /* renamed from: padding-VpY3zN4 */
    public static final Modifier m69530paddingVpY3zN4(@NotNull Modifier padding, float f, float f2) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingElement(f, f2, f, f2, true, new PaddingKt$padding$2(f, f2), null));
    }

    /* renamed from: padding-VpY3zN4$default */
    public static /* synthetic */ Modifier m69531paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.m73658constructorimpl(0);
        }
        return m69530paddingVpY3zN4(modifier, f, f2);
    }

    @Stable
    @NotNull
    /* renamed from: padding-qDBjuR0 */
    public static final Modifier m69532paddingqDBjuR0(@NotNull Modifier padding, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingElement(f, f2, f3, f4, true, new PaddingKt$padding$1(f, f2, f3, f4), null));
    }

    /* renamed from: padding-qDBjuR0$default */
    public static /* synthetic */ Modifier m69533paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = C3641Dp.m73658constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = C3641Dp.m73658constructorimpl(0);
        }
        return m69532paddingqDBjuR0(modifier, f, f2, f3, f4);
    }
}
