package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class Edge<T> implements Consumer<T> {

    /* renamed from: a */
    public Consumer f11390a;

    @Override // androidx.core.util.Consumer
    public void accept(@NonNull T t) {
        Intrinsics.checkNotNull(this.f11390a, "Listener is not set.");
        this.f11390a.accept(t);
    }

    public void setListener(@NonNull Consumer<T> consumer) {
        this.f11390a = consumer;
    }
}
