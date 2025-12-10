package androidx.camera.video;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class PendingRecording {

    /* renamed from: a */
    public final Context f11624a;

    /* renamed from: b */
    public final Recorder f11625b;

    /* renamed from: c */
    public final OutputOptions f11626c;

    /* renamed from: d */
    public Consumer f11627d;

    /* renamed from: e */
    public Executor f11628e;

    /* renamed from: f */
    public boolean f11629f = false;

    /* renamed from: g */
    public boolean f11630g = false;

    public PendingRecording(Context context, Recorder recorder, OutputOptions outputOptions) {
        this.f11624a = ContextUtil.getApplicationContext(context);
        this.f11625b = recorder;
        this.f11626c = outputOptions;
    }

    /* renamed from: a */
    public Context m62525a() {
        return this.f11624a;
    }

    @NonNull
    @ExperimentalPersistentRecording
    public PendingRecording asPersistentRecording() {
        this.f11630g = true;
        return this;
    }

    /* renamed from: b */
    public Consumer m62524b() {
        return this.f11627d;
    }

    /* renamed from: c */
    public Executor m62523c() {
        return this.f11628e;
    }

    /* renamed from: d */
    public OutputOptions m62522d() {
        return this.f11626c;
    }

    /* renamed from: e */
    public Recorder m62521e() {
        return this.f11625b;
    }

    /* renamed from: f */
    public boolean m62520f() {
        return this.f11629f;
    }

    /* renamed from: g */
    public boolean m62519g() {
        return this.f11630g;
    }

    @NonNull
    @CheckResult
    public Recording start(@NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        Preconditions.checkNotNull(executor, "Listener Executor can't be null.");
        Preconditions.checkNotNull(consumer, "Event listener can't be null");
        this.f11628e = executor;
        this.f11627d = consumer;
        return this.f11625b.m62509A0(this);
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public PendingRecording withAudioEnabled() {
        if (PermissionChecker.checkSelfPermission(this.f11624a, "android.permission.RECORD_AUDIO") != -1) {
            Preconditions.checkState(this.f11625b.m62508B(), "The Recorder this recording is associated to doesn't support audio.");
            this.f11629f = true;
            return this;
        }
        throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
    }
}
