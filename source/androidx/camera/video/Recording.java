package androidx.camera.video;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.core.util.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class Recording implements AutoCloseable {

    /* renamed from: a */
    public final AtomicBoolean f11741a;

    /* renamed from: b */
    public final Recorder f11742b;

    /* renamed from: c */
    public final long f11743c;

    /* renamed from: d */
    public final OutputOptions f11744d;

    /* renamed from: e */
    public final boolean f11745e;

    /* renamed from: f */
    public final CloseGuardHelper f11746f;

    public Recording(Recorder recorder, long j, OutputOptions outputOptions, boolean z, boolean z2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f11741a = atomicBoolean;
        CloseGuardHelper create = CloseGuardHelper.create();
        this.f11746f = create;
        this.f11742b = recorder;
        this.f11743c = j;
        this.f11744d = outputOptions;
        this.f11745e = z;
        if (z2) {
            atomicBoolean.set(true);
        } else {
            create.open("stop");
        }
    }

    /* renamed from: b */
    public static Recording m62368b(PendingRecording pendingRecording, long j) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.m62521e(), j, pendingRecording.m62522d(), pendingRecording.m62519g(), true);
    }

    /* renamed from: d */
    public static Recording m62367d(PendingRecording pendingRecording, long j) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.m62521e(), j, pendingRecording.m62522d(), pendingRecording.m62519g(), false);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m62364j(0, null);
    }

    public void finalize() throws Throwable {
        try {
            this.f11746f.warnIfOpen();
            m62364j(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public OutputOptions m62366g() {
        return this.f11744d;
    }

    /* renamed from: i */
    public long m62365i() {
        return this.f11743c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isClosed() {
        return this.f11741a.get();
    }

    @ExperimentalPersistentRecording
    public boolean isPersistent() {
        return this.f11745e;
    }

    /* renamed from: j */
    public final void m62364j(int i, Throwable th2) {
        this.f11746f.close();
        if (this.f11741a.getAndSet(true)) {
            return;
        }
        this.f11742b.m62503D0(this, i, th2);
    }

    public void mute(boolean z) {
        if (!this.f11741a.get()) {
            this.f11742b.m62476V(this, z);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    public void pause() {
        if (!this.f11741a.get()) {
            this.f11742b.m62458g0(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    public void resume() {
        if (!this.f11741a.get()) {
            this.f11742b.m62442o0(this);
            return;
        }
        throw new IllegalStateException("The recording has been stopped.");
    }

    public void stop() {
        close();
    }
}
