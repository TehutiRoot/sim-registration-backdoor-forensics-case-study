package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ScrollingLogic {

    /* renamed from: a */
    public final Orientation f13011a;

    /* renamed from: b */
    public final boolean f13012b;

    /* renamed from: c */
    public final State f13013c;

    /* renamed from: d */
    public final ScrollableState f13014d;

    /* renamed from: e */
    public final FlingBehavior f13015e;

    /* renamed from: f */
    public final OverscrollEffect f13016f;

    /* renamed from: g */
    public final MutableState f13017g;

    public ScrollingLogic(Orientation orientation, boolean z, State nestedScrollDispatcher, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.f13011a = orientation;
        this.f13012b = z;
        this.f13013c = nestedScrollDispatcher;
        this.f13014d = scrollableState;
        this.f13015e = flingBehavior;
        this.f13016f = overscrollEffect;
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f13017g = m31891g;
    }

    /* renamed from: a */
    public final long m61478a(ScrollScope dispatchScroll, long j, int i) {
        Intrinsics.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        long m61466m = m61466m(j);
        ScrollingLogic$dispatchScroll$performScroll$1 scrollingLogic$dispatchScroll$performScroll$1 = new ScrollingLogic$dispatchScroll$performScroll$1(this, i, dispatchScroll);
        if (this.f13016f != null && m61473f()) {
            return this.f13016f.mo69314applyToScrollRhakbz0(m61466m, i, scrollingLogic$dispatchScroll$performScroll$1);
        }
        return scrollingLogic$dispatchScroll$performScroll$1.invoke(Offset.m71491boximpl(m61466m)).m71512unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m61477b(long r12, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L14
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r4.result
            java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r12 = r4.L$0
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref.LongRef) r12
            kotlin.ResultKt.throwOnFailure(r14)
            goto L5c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.throwOnFailure(r14)
            kotlin.jvm.internal.Ref$LongRef r14 = new kotlin.jvm.internal.Ref$LongRef
            r14.<init>()
            r14.element = r12
            androidx.compose.foundation.gestures.ScrollableState r1 = r11.f13014d
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r3 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r3
            r6 = r11
            r7 = r14
            r8 = r12
            r5.<init>(r6, r7, r8, r10)
            r4.L$0 = r14
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = p000.JE1.m67770e(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5b
            return r0
        L5b:
            r12 = r14
        L5c:
            long r12 = r12.element
            androidx.compose.ui.unit.Velocity r12 = androidx.compose.p003ui.unit.Velocity.m73874boximpl(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m61477b(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: c */
    public final FlingBehavior m61476c() {
        return this.f13015e;
    }

    /* renamed from: d */
    public final State m61475d() {
        return this.f13013c;
    }

    /* renamed from: e */
    public final ScrollableState m61474e() {
        return this.f13014d;
    }

    /* renamed from: f */
    public final boolean m61473f() {
        if (!this.f13014d.getCanScrollForward() && !this.f13014d.getCanScrollBackward()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m61472g(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r6 = (androidx.compose.foundation.gestures.ScrollingLogic) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L71
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            r5.m61470i(r4)
            long r6 = r5.m61465n(r6)
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r8 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r2 = 0
            r8.<init>(r5, r2)
            androidx.compose.foundation.OverscrollEffect r2 = r5.f13016f
            if (r2 == 0) goto L62
            boolean r2 = r5.m61473f()
            if (r2 == 0) goto L62
            androidx.compose.foundation.OverscrollEffect r2 = r5.f13016f
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r2.mo69313applyToFlingBMRW4eQ(r6, r8, r0)
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r5
            goto L71
        L62:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.p003ui.unit.Velocity.m73874boximpl(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r8.invoke(r6, r0)
            if (r6 != r1) goto L60
            return r1
        L71:
            r7 = 0
            r6.m61470i(r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m61472g(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: h */
    public final long m61471h(long j) {
        if (this.f13014d.isScrollInProgress()) {
            return Offset.Companion.m71518getZeroF1C5BW0();
        }
        return m61462q(m61469j(this.f13014d.dispatchRawDelta(m61469j(m61463p(j)))));
    }

    /* renamed from: i */
    public final void m61470i(boolean z) {
        this.f13017g.setValue(Boolean.valueOf(z));
    }

    /* renamed from: j */
    public final float m61469j(float f) {
        if (this.f13012b) {
            return f * (-1);
        }
        return f;
    }

    /* renamed from: k */
    public final long m61468k(long j) {
        if (this.f13012b) {
            return Offset.m71509timestuRUvjQ(j, -1.0f);
        }
        return j;
    }

    /* renamed from: l */
    public final boolean m61467l() {
        boolean z;
        if (!this.f13014d.isScrollInProgress() && !((Boolean) this.f13017g.getValue()).booleanValue()) {
            OverscrollEffect overscrollEffect = this.f13016f;
            if (overscrollEffect != null) {
                z = overscrollEffect.isInProgress();
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final long m61466m(long j) {
        if (this.f13011a == Orientation.Horizontal) {
            return Offset.m71496copydBAh8RU$default(j, 0.0f, 0.0f, 1, null);
        }
        return Offset.m71496copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: n */
    public final long m61465n(long j) {
        if (this.f13011a == Orientation.Horizontal) {
            return Velocity.m73879copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null);
        }
        return Velocity.m73879copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: o */
    public final float m61464o(long j) {
        if (this.f13011a == Orientation.Horizontal) {
            return Velocity.m73883getXimpl(j);
        }
        return Velocity.m73884getYimpl(j);
    }

    /* renamed from: p */
    public final float m61463p(long j) {
        if (this.f13011a == Orientation.Horizontal) {
            return Offset.m71502getXimpl(j);
        }
        return Offset.m71503getYimpl(j);
    }

    /* renamed from: q */
    public final long m61462q(float f) {
        if (f == 0.0f) {
            return Offset.Companion.m71518getZeroF1C5BW0();
        }
        if (this.f13011a == Orientation.Horizontal) {
            return OffsetKt.Offset(f, 0.0f);
        }
        return OffsetKt.Offset(0.0f, f);
    }

    /* renamed from: r */
    public final long m61461r(long j, float f) {
        if (this.f13011a == Orientation.Horizontal) {
            return Velocity.m73879copyOhffZ5M$default(j, f, 0.0f, 2, null);
        }
        return Velocity.m73879copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }
}
