package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Observable;
import com.google.common.util.concurrent.ListenableFuture;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface BufferProvider<T> extends Observable<State> {

    /* loaded from: classes.dex */
    public enum State {
        ACTIVE,
        INACTIVE
    }

    @NonNull
    ListenableFuture<T> acquireBuffer();
}