package androidx.compose.material.pullrefresh;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection implements NestedScrollConnection {

    /* renamed from: a */
    public final Function1 f25443a;

    /* renamed from: b */
    public final Function2 f25444b;

    /* renamed from: c */
    public final boolean f25445c;

    public PullRefreshNestedScrollConnection(Function1 onPull, Function2 onRelease, boolean z) {
        Intrinsics.checkNotNullParameter(onPull, "onPull");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        this.f25443a = onPull;
        this.f25444b = onRelease;
        this.f25445c = z;
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo69445onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return VG0.m65885a(this, j, j2, continuation);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo69446onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.f25445c) {
            return Offset.Companion.m71518getZeroF1C5BW0();
        }
        if (NestedScrollSource.m72623equalsimpl0(i, NestedScrollSource.Companion.m72628getDragWNlRxjI()) && Offset.m71503getYimpl(j2) > 0.0f) {
            return OffsetKt.Offset(0.0f, ((Number) this.f25443a.invoke(Float.valueOf(Offset.m71503getYimpl(j2)))).floatValue());
        }
        return Offset.Companion.m71518getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo69447onPreFlingQWom1Mo(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r5 = r0.F$0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.functions.Function2 r7 = r4.f25444b
            float r5 = androidx.compose.p003ui.unit.Velocity.m73884getYimpl(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.p003ui.unit.VelocityKt.Velocity(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p003ui.unit.Velocity.m73874boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.mo69447onPreFlingQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo69448onPreScrollOzD1aCk(long j, int i) {
        if (!this.f25445c) {
            return Offset.Companion.m71518getZeroF1C5BW0();
        }
        if (NestedScrollSource.m72623equalsimpl0(i, NestedScrollSource.Companion.m72628getDragWNlRxjI()) && Offset.m71503getYimpl(j) < 0.0f) {
            return OffsetKt.Offset(0.0f, ((Number) this.f25443a.invoke(Float.valueOf(Offset.m71503getYimpl(j)))).floatValue());
        }
        return Offset.Companion.m71518getZeroF1C5BW0();
    }
}
