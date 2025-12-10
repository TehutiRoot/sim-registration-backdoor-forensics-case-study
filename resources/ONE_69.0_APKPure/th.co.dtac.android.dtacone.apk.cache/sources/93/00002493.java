package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {

    /* renamed from: a */
    public final /* synthetic */ Density f13087a;

    /* renamed from: b */
    public boolean f13088b;

    /* renamed from: c */
    public boolean f13089c;

    /* renamed from: d */
    public final Mutex f13090d;

    public PressGestureScopeImpl(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f13087a = density;
        this.f13090d = MutexKt.Mutex(false);
    }

    /* renamed from: a */
    public final void m61435a() {
        this.f13089c = true;
        Mutex.DefaultImpls.unlock$default(this.f13090d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitRelease(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.label = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public final void m61434b() {
        this.f13088b = true;
        Mutex.DefaultImpls.unlock$default(this.f13090d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m61433c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.sync.Mutex r5 = r4.f13090d
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.f13088b = r5
            r0.f13089c = r5
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.m61433c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.f13087a.getDensity();
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return this.f13087a.getFontScale();
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int mo69615roundToPxR2X_6o(long j) {
        return this.f13087a.mo69615roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int mo69616roundToPx0680j_4(float f) {
        return this.f13087a.mo69616roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float mo69617toDpGaN1DYA(long j) {
        return this.f13087a.mo69617toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float mo69618toDpu2uoSUM(float f) {
        return this.f13087a.mo69618toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long mo69620toDpSizekrfVVM(long j) {
        return this.f13087a.mo69620toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float mo69621toPxR2X_6o(long j) {
        return this.f13087a.mo69621toPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float mo69622toPx0680j_4(float f) {
        return this.f13087a.mo69622toPx0680j_4(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.f13087a.toRect(dpRect);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long mo69623toSizeXkaWNTQ(long j) {
        return this.f13087a.mo69623toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long mo69624toSp0xMU5do(float f) {
        return this.f13087a.mo69624toSp0xMU5do(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long mo69625toSpkPz2Gy4(float f) {
        return this.f13087a.mo69625toSpkPz2Gy4(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object tryAwaitRelease(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5.f13088b
            if (r6 != 0) goto L55
            boolean r6 = r5.f13089c
            if (r6 != 0) goto L55
            kotlinx.coroutines.sync.Mutex r6 = r5.f13090d
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            kotlinx.coroutines.sync.Mutex r6 = r0.f13090d
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.f13088b
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float mo69619toDpu2uoSUM(int i) {
        return this.f13087a.mo69619toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long mo69626toSpkPz2Gy4(int i) {
        return this.f13087a.mo69626toSpkPz2Gy4(i);
    }
}