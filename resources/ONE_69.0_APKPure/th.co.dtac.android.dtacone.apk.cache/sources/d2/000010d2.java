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

/* renamed from: Ri0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18413Ri0 implements LifecycleObserver, Camera {

    /* renamed from: b */
    public final LifecycleOwner f5610b;

    /* renamed from: c */
    public final CameraUseCaseAdapter f5611c;

    /* renamed from: a */
    public final Object f5609a = new Object();

    /* renamed from: d */
    public volatile boolean f5612d = false;

    /* renamed from: e */
    public boolean f5613e = false;

    /* renamed from: f */
    public boolean f5614f = false;

    public C18413Ri0(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f5610b = lifecycleOwner;
        this.f5611c = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    /* renamed from: a */
    public void m66605a(Collection collection) {
        synchronized (this.f5609a) {
            this.f5611c.addUseCases(collection);
        }
    }

    /* renamed from: b */
    public CameraUseCaseAdapter m66604b() {
        return this.f5611c;
    }

    /* renamed from: c */
    public LifecycleOwner m66603c() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f5609a) {
            lifecycleOwner = this.f5610b;
        }
        return lifecycleOwner;
    }

    /* renamed from: d */
    public List m66602d() {
        List unmodifiableList;
        synchronized (this.f5609a) {
            unmodifiableList = Collections.unmodifiableList(this.f5611c.getUseCases());
        }
        return unmodifiableList;
    }

    /* renamed from: e */
    public boolean m66601e(UseCase useCase) {
        boolean contains;
        synchronized (this.f5609a) {
            contains = this.f5611c.getUseCases().contains(useCase);
        }
        return contains;
    }

    /* renamed from: f */
    public void m66600f() {
        synchronized (this.f5609a) {
            try {
                if (this.f5613e) {
                    return;
                }
                onStop(this.f5610b);
                this.f5613e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public void m66599g(Collection collection) {
        synchronized (this.f5609a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f5611c.getUseCases());
            this.f5611c.removeUseCases(arrayList);
        }
    }

    @Override // androidx.camera.core.Camera
    public CameraControl getCameraControl() {
        return this.f5611c.getCameraControl();
    }

    @Override // androidx.camera.core.Camera
    public CameraInfo getCameraInfo() {
        return this.f5611c.getCameraInfo();
    }

    @Override // androidx.camera.core.Camera
    public LinkedHashSet getCameraInternals() {
        return this.f5611c.getCameraInternals();
    }

    @Override // androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        return this.f5611c.getExtendedConfig();
    }

    /* renamed from: h */
    public void m66598h() {
        synchronized (this.f5609a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f5611c;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    /* renamed from: i */
    public void m66597i() {
        synchronized (this.f5609a) {
            try {
                if (!this.f5613e) {
                    return;
                }
                this.f5613e = false;
                if (this.f5610b.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    onStart(this.f5610b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return this.f5611c.isUseCasesCombinationSupported(useCaseArr);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.f5609a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f5611c;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f5611c.setActiveResumingMode(false);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f5611c.setActiveResumingMode(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.f5609a) {
            try {
                if (!this.f5613e && !this.f5614f) {
                    this.f5611c.attachUseCases();
                    this.f5612d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.f5609a) {
            try {
                if (!this.f5613e && !this.f5614f) {
                    this.f5611c.detachUseCases();
                    this.f5612d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public void setExtendedConfig(CameraConfig cameraConfig) {
        this.f5611c.setExtendedConfig(cameraConfig);
    }
}