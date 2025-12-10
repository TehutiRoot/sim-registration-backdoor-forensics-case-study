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
    public final Context f11712a;

    /* renamed from: b */
    public final Recorder f11713b;

    /* renamed from: c */
    public final OutputOptions f11714c;

    /* renamed from: d */
    public Consumer f11715d;

    /* renamed from: e */
    public Executor f11716e;

    /* renamed from: f */
    public boolean f11717f = false;

    /* renamed from: g */
    public boolean f11718g = false;

    public PendingRecording(Context context, Recorder recorder, OutputOptions outputOptions) {
        this.f11712a = ContextUtil.getApplicationContext(context);
        this.f11713b = recorder;
        this.f11714c = outputOptions;
    }

    /* renamed from: a */
    public Context m62473a() {
        return this.f11712a;
    }

    @NonNull
    @ExperimentalPersistentRecording
    public PendingRecording asPersistentRecording() {
        this.f11718g = true;
        return this;
    }

    /* renamed from: b */
    public Consumer m62472b() {
        return this.f11715d;
    }

    /* renamed from: c */
    public Executor m62471c() {
        return this.f11716e;
    }

    /* renamed from: d */
    public OutputOptions m62470d() {
        return this.f11714c;
    }

    /* renamed from: e */
    public Recorder m62469e() {
        return this.f11713b;
    }

    /* renamed from: f */
    public boolean m62468f() {
        return this.f11717f;
    }

    /* renamed from: g */
    public boolean m62467g() {
        return this.f11718g;
    }

    @NonNull
    @CheckResult
    public Recording start(@NonNull Executor executor, @NonNull Consumer<VideoRecordEvent> consumer) {
        Preconditions.checkNotNull(executor, "Listener Executor can't be null.");
        Preconditions.checkNotNull(consumer, "Event listener can't be null");
        this.f11716e = executor;
        this.f11715d = consumer;
        return this.f11713b.m62457A0(this);
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public PendingRecording withAudioEnabled() {
        if (PermissionChecker.checkSelfPermission(this.f11712a, "android.permission.RECORD_AUDIO") != -1) {
            Preconditions.checkState(this.f11713b.m62456B(), "The Recorder this recording is associated to doesn't support audio.");
            this.f11717f = true;
            return this;
        }
        throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
    }
}