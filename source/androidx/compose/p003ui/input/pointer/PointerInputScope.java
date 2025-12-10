package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001dH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u0010X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "<anonymous parameter 0>", "", "interceptOutOfBoundsChildEvents", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.PointerInputScope */
/* loaded from: classes2.dex */
public interface PointerInputScope extends Density {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.PointerInputScope$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
        public static long m72736getExtendedTouchPaddingNHjbRc(@NotNull PointerInputScope pointerInputScope) {
            long m66755a;
            m66755a = AbstractC18252Pk1.m66755a(pointerInputScope);
            return m66755a;
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope) {
            boolean m66754b;
            m66754b = AbstractC18252Pk1.m66754b(pointerInputScope);
            return m66754b;
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m72737roundToPxR2X_6o(@NotNull PointerInputScope pointerInputScope, long j) {
            int m29253a;
            m29253a = AbstractC11522jG.m29253a(pointerInputScope, j);
            return m29253a;
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m72738roundToPx0680j_4(@NotNull PointerInputScope pointerInputScope, float f) {
            int m29252b;
            m29252b = AbstractC11522jG.m29252b(pointerInputScope, f);
            return m29252b;
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope, boolean z) {
            AbstractC18252Pk1.m66753c(pointerInputScope, z);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m72739toDpGaN1DYA(@NotNull PointerInputScope pointerInputScope, long j) {
            float m29251c;
            m29251c = AbstractC11522jG.m29251c(pointerInputScope, j);
            return m29251c;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m72740toDpu2uoSUM(@NotNull PointerInputScope pointerInputScope, float f) {
            float m29250d;
            m29250d = AbstractC11522jG.m29250d(pointerInputScope, f);
            return m29250d;
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m72742toDpSizekrfVVM(@NotNull PointerInputScope pointerInputScope, long j) {
            long m29248f;
            m29248f = AbstractC11522jG.m29248f(pointerInputScope, j);
            return m29248f;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m72743toPxR2X_6o(@NotNull PointerInputScope pointerInputScope, long j) {
            float m29247g;
            m29247g = AbstractC11522jG.m29247g(pointerInputScope, j);
            return m29247g;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m72744toPx0680j_4(@NotNull PointerInputScope pointerInputScope, float f) {
            float m29246h;
            m29246h = AbstractC11522jG.m29246h(pointerInputScope, f);
            return m29246h;
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PointerInputScope pointerInputScope, @NotNull DpRect receiver) {
            Rect m29245i;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            m29245i = AbstractC11522jG.m29245i(pointerInputScope, receiver);
            return m29245i;
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m72745toSizeXkaWNTQ(@NotNull PointerInputScope pointerInputScope, long j) {
            long m29244j;
            m29244j = AbstractC11522jG.m29244j(pointerInputScope, j);
            return m29244j;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m72746toSp0xMU5do(@NotNull PointerInputScope pointerInputScope, float f) {
            long m29243k;
            m29243k = AbstractC11522jG.m29243k(pointerInputScope, f);
            return m29243k;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m72747toSpkPz2Gy4(@NotNull PointerInputScope pointerInputScope, float f) {
            long m29242l;
            m29242l = AbstractC11522jG.m29242l(pointerInputScope, f);
            return m29242l;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m72741toDpu2uoSUM(@NotNull PointerInputScope pointerInputScope, int i) {
            float m29249e;
            m29249e = AbstractC11522jG.m29249e(pointerInputScope, i);
            return m29249e;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m72748toSpkPz2Gy4(@NotNull PointerInputScope pointerInputScope, int i) {
            long m29241m;
            m29241m = AbstractC11522jG.m29241m(pointerInputScope, i);
            return m29241m;
        }
    }

    @Nullable
    <R> Object awaitPointerEventScope(@NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation);

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    long mo72734getExtendedTouchPaddingNHjbRc();

    boolean getInterceptOutOfBoundsChildEvents();

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long mo72735getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    void setInterceptOutOfBoundsChildEvents(boolean z);
}
