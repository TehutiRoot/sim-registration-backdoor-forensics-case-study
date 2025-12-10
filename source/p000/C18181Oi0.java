package p000;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.util.Util;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Oi0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18181Oi0 implements Lifecycle, LifecycleObserver {

    /* renamed from: a */
    public final Set f4469a = new HashSet();

    /* renamed from: b */
    public final androidx.lifecycle.Lifecycle f4470b;

    public C18181Oi0(androidx.lifecycle.Lifecycle lifecycle) {
        this.f4470b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void addListener(LifecycleListener lifecycleListener) {
        this.f4469a.add(lifecycleListener);
        if (this.f4470b.getCurrentState() == Lifecycle.State.DESTROYED) {
            lifecycleListener.onDestroy();
        } else if (this.f4470b.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            lifecycleListener.onStart();
        } else {
            lifecycleListener.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        for (LifecycleListener lifecycleListener : Util.getSnapshot(this.f4469a)) {
            lifecycleListener.onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        for (LifecycleListener lifecycleListener : Util.getSnapshot(this.f4469a)) {
            lifecycleListener.onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        for (LifecycleListener lifecycleListener : Util.getSnapshot(this.f4469a)) {
            lifecycleListener.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.Lifecycle
    public void removeListener(LifecycleListener lifecycleListener) {
        this.f4469a.remove(lifecycleListener);
    }
}
