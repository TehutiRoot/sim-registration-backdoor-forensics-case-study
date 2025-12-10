package p000;

import android.os.Build;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: Li0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17989Li0 implements LifecycleObserver, Camera {

    /* renamed from: b */
    public final LifecycleOwner f3532b;

    /* renamed from: c */
    public final CameraUseCaseAdapter f3533c;

    /* renamed from: a */
    public final Object f3531a = new Object();

    /* renamed from: d */
    public volatile boolean f3534d = false;

    /* renamed from: e */
    public boolean f3535e = false;

    /* renamed from: f */
    public boolean f3536f = false;

    public C17989Li0(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f3532b = lifecycleOwner;
        this.f3533c = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    /* renamed from: a */
    public void m67500a(Collection collection) {
        synchronized (this.f3531a) {
            this.f3533c.addUseCases(collection);
        }
    }

    /* renamed from: b */
    public CameraUseCaseAdapter m67499b() {
        return this.f3533c;
    }

    /* renamed from: c */
    public LifecycleOwner m67498c() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f3531a) {
            lifecycleOwner = this.f3532b;
        }
        return lifecycleOwner;
    }

    /* renamed from: d */
    public List m67497d() {
        List unmodifiableList;
        synchronized (this.f3531a) {
            unmodifiableList = Collections.unmodifiableList(this.f3533c.getUseCases());
        }
        return unmodifiableList;
    }

    /* renamed from: e */
    public boolean m67496e(UseCase useCase) {
        boolean contains;
        synchronized (this.f3531a) {
            contains = this.f3533c.getUseCases().contains(useCase);
        }
        return contains;
    }

    /* renamed from: f */
    public void m67495f() {
        synchronized (this.f3531a) {
            try {
                if (this.f3535e) {
                    return;
                }
                onStop(this.f3532b);
                this.f3535e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public void m67494g(Collection collection) {
        synchronized (this.f3531a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f3533c.getUseCases());
            this.f3533c.removeUseCases(arrayList);
        }
    }

    @Override // androidx.camera.core.Camera
    public CameraControl getCameraControl() {
        return this.f3533c.getCameraControl();
    }

    @Override // androidx.camera.core.Camera
    public CameraInfo getCameraInfo() {
        return this.f3533c.getCameraInfo();
    }

    @Override // androidx.camera.core.Camera
    public LinkedHashSet getCameraInternals() {
        return this.f3533c.getCameraInternals();
    }

    @Override // androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        return this.f3533c.getExtendedConfig();
    }

    /* renamed from: h */
    public void m67493h() {
        synchronized (this.f3531a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f3533c;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    /* renamed from: i */
    public void m67492i() {
        synchronized (this.f3531a) {
            try {
                if (!this.f3535e) {
                    return;
                }
                this.f3535e = false;
                if (this.f3532b.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    onStart(this.f3532b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return this.f3533c.isUseCasesCombinationSupported(useCaseArr);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3531a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f3533c;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3533c.setActiveResumingMode(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3533c.setActiveResumingMode(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3531a) {
            try {
                if (!this.f3535e && !this.f3536f) {
                    this.f3533c.attachUseCases();
                    this.f3534d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.f3531a) {
            try {
                if (!this.f3535e && !this.f3536f) {
                    this.f3533c.detachUseCases();
                    this.f3534d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public void setExtendedConfig(CameraConfig cameraConfig) {
        this.f3533c.setExtendedConfig(cameraConfig);
    }
}
