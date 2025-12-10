package androidx.compose.material3;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m28851d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m28850d2 = {"androidx/compose/material3/ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {

    /* renamed from: a */
    public final /* synthetic */ ExitUntilCollapsedScrollBehavior f25778a;

    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior) {
        this.f25778a = exitUntilCollapsedScrollBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    @org.jetbrains.annotations.Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo69445onPostFlingRZ2iAVY(long r10, long r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.p003ui.unit.Velocity> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.material3.C3289x78ae0263
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.C3289x78ae0263) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r7 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            long r10 = r0.J$0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L80
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            long r12 = r0.J$0
            java.lang.Object r10 = r0.L$0
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 r10 = (androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1) r10
            kotlin.ResultKt.throwOnFailure(r14)
            goto L55
        L40:
            kotlin.ResultKt.throwOnFailure(r14)
            r0.L$0 = r9
            r0.J$0 = r12
            r0.label = r2
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r0
            java.lang.Object r14 = p000.VG0.m65885a(r1, r2, r4, r6)
            if (r14 != r7) goto L54
            return r7
        L54:
            r10 = r9
        L55:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.p003ui.unit.Velocity) r14
            long r1 = r14.m73892unboximpl()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r11 = r10.f25778a
            androidx.compose.material3.TopAppBarState r11 = r11.getState()
            float r12 = androidx.compose.p003ui.unit.Velocity.m73884getYimpl(r12)
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r13 = r10.f25778a
            androidx.compose.animation.core.DecayAnimationSpec r13 = r13.getFlingAnimationSpec()
            androidx.compose.material3.ExitUntilCollapsedScrollBehavior r10 = r10.f25778a
            androidx.compose.animation.core.AnimationSpec r10 = r10.getSnapAnimationSpec()
            r14 = 0
            r0.L$0 = r14
            r0.J$0 = r1
            r0.label = r8
            java.lang.Object r14 = androidx.compose.material3.AppBarKt.access$settleAppBar(r11, r12, r13, r10, r0)
            if (r14 != r7) goto L7f
            return r7
        L7f:
            r10 = r1
        L80:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.p003ui.unit.Velocity) r14
            long r12 = r14.m73892unboximpl()
            long r10 = androidx.compose.p003ui.unit.Velocity.m73887plusAH228Gc(r10, r12)
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.p003ui.unit.Velocity.m73874boximpl(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1.mo69445onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo69446onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!((Boolean) this.f25778a.m60650a().invoke()).booleanValue()) {
            return Offset.Companion.m71518getZeroF1C5BW0();
        }
        TopAppBarState state = this.f25778a.getState();
        state.setContentOffset(state.getContentOffset() + Offset.m71503getYimpl(j));
        if (Offset.m71503getYimpl(j2) >= 0.0f && Offset.m71503getYimpl(j) >= 0.0f) {
            if (Offset.m71503getYimpl(j) == 0.0f && Offset.m71503getYimpl(j2) > 0.0f) {
                this.f25778a.getState().setContentOffset(0.0f);
            }
            if (Offset.m71503getYimpl(j2) > 0.0f) {
                float heightOffset = this.f25778a.getState().getHeightOffset();
                this.f25778a.getState().setHeightOffset(this.f25778a.getState().getHeightOffset() + Offset.m71503getYimpl(j2));
                return OffsetKt.Offset(0.0f, this.f25778a.getState().getHeightOffset() - heightOffset);
            }
            return Offset.Companion.m71518getZeroF1C5BW0();
        }
        float heightOffset2 = this.f25778a.getState().getHeightOffset();
        this.f25778a.getState().setHeightOffset(this.f25778a.getState().getHeightOffset() + Offset.m71503getYimpl(j));
        return OffsetKt.Offset(0.0f, this.f25778a.getState().getHeightOffset() - heightOffset2);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo69447onPreFlingQWom1Mo(long j, Continuation continuation) {
        return VG0.m65883c(this, j, continuation);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo69448onPreScrollOzD1aCk(long j, int i) {
        if (((Boolean) this.f25778a.m60650a().invoke()).booleanValue() && Offset.m71503getYimpl(j) <= 0.0f) {
            float heightOffset = this.f25778a.getState().getHeightOffset();
            this.f25778a.getState().setHeightOffset(this.f25778a.getState().getHeightOffset() + Offset.m71503getYimpl(j));
            if (heightOffset == this.f25778a.getState().getHeightOffset()) {
                return Offset.Companion.m71518getZeroF1C5BW0();
            }
            return Offset.m71496copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
        }
        return Offset.Companion.m71518getZeroF1C5BW0();
    }
}
