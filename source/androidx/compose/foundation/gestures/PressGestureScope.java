package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m28850d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m69419roundToPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j) {
            return AbstractC18450Sm1.m66296a(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m69420roundToPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return AbstractC18450Sm1.m66295b(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m69421toDpGaN1DYA(@NotNull PressGestureScope pressGestureScope, long j) {
            return AbstractC18450Sm1.m66294c(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m69422toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, float f) {
            return AbstractC18450Sm1.m66293d(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m69424toDpSizekrfVVM(@NotNull PressGestureScope pressGestureScope, long j) {
            return AbstractC18450Sm1.m66291f(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m69425toPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j) {
            return AbstractC18450Sm1.m66290g(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m69426toPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return AbstractC18450Sm1.m66289h(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return AbstractC18450Sm1.m66288i(pressGestureScope, receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m69427toSizeXkaWNTQ(@NotNull PressGestureScope pressGestureScope, long j) {
            return AbstractC18450Sm1.m66287j(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m69428toSp0xMU5do(@NotNull PressGestureScope pressGestureScope, float f) {
            return AbstractC18450Sm1.m66286k(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m69429toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, float f) {
            return AbstractC18450Sm1.m66285l(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m69423toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, int i) {
            return AbstractC18450Sm1.m66292e(pressGestureScope, i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m69430toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, int i) {
            return AbstractC18450Sm1.m66284m(pressGestureScope, i);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation);
}
