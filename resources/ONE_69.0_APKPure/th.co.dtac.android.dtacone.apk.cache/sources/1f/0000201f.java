package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class Edge<T> implements Consumer<T> {

    /* renamed from: a */
    public Consumer f11478a;

    @Override // androidx.core.util.Consumer
    public void accept(@NonNull T t) {
        Intrinsics.checkNotNull(this.f11478a, "Listener is not set.");
        this.f11478a.accept(t);
    }

    public void setListener(@NonNull Consumer<T> consumer) {
        this.f11478a = consumer;
    }
}