package androidx.compose.material3;

import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class SwipeableState$snapTo$2 implements FlowCollector {

    /* renamed from: a */
    public final /* synthetic */ Object f26327a;

    /* renamed from: b */
    public final /* synthetic */ SwipeableState f26328b;

    public SwipeableState$snapTo$2(Object obj, SwipeableState swipeableState) {
        this.f26327a = obj;
        this.f26328b = swipeableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.util.Map r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.material3.SwipeableState$snapTo$2$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.SwipeableState$snapTo$2$emit$1 r0 = (androidx.compose.material3.SwipeableState$snapTo$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SwipeableState$snapTo$2$emit$1 r0 = new androidx.compose.material3.SwipeableState$snapTo$2$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.material3.SwipeableState$snapTo$2 r5 = (androidx.compose.material3.SwipeableState$snapTo$2) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r4.f26327a
            java.lang.Float r5 = androidx.compose.material3.SwipeableKt.access$getOffset(r5, r6)
            if (r5 == 0) goto L5c
            androidx.compose.material3.SwipeableState r6 = r4.f26328b
            float r5 = r5.floatValue()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = androidx.compose.material3.SwipeableState.access$snapInternalToOffset(r6, r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            r5 = r4
        L52:
            androidx.compose.material3.SwipeableState r6 = r5.f26328b
            java.lang.Object r5 = r5.f26327a
            androidx.compose.material3.SwipeableState.access$setCurrentValue(r6, r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L5c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The target value must have an associated anchor."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState$snapTo$2.emit(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}