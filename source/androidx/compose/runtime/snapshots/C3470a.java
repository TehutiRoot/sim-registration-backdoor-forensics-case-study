package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* renamed from: androidx.compose.runtime.snapshots.a */
/* loaded from: classes2.dex */
public final class C3470a implements SnapshotContextElement, ThreadContextElement {

    /* renamed from: a */
    public final Snapshot f28808a;

    public C3470a(Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f28808a = snapshot;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: a */
    public void restoreThreadContext(CoroutineContext context, Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28808a.unsafeLeave(snapshot);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: b */
    public Snapshot updateThreadContext(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f28808a.unsafeEnter();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return SnapshotContextElement.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return SnapshotContextElement.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return SnapshotContextElement.DefaultImpls.plus(this, coroutineContext);
    }
}
