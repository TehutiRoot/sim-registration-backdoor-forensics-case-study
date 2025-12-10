package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class WorkerParameters {

    /* renamed from: a */
    public UUID f38286a;

    /* renamed from: b */
    public Data f38287b;

    /* renamed from: c */
    public Set f38288c;

    /* renamed from: d */
    public RuntimeExtras f38289d;

    /* renamed from: e */
    public int f38290e;

    /* renamed from: f */
    public Executor f38291f;

    /* renamed from: g */
    public TaskExecutor f38292g;

    /* renamed from: h */
    public WorkerFactory f38293h;

    /* renamed from: i */
    public ProgressUpdater f38294i;

    /* renamed from: j */
    public ForegroundUpdater f38295j;

    /* renamed from: k */
    public int f38296k;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static class RuntimeExtras {
        @Nullable
        @RequiresApi(28)
        public Network network;
        @NonNull
        public List<String> triggeredContentAuthorities = Collections.emptyList();
        @NonNull
        public List<Uri> triggeredContentUris = Collections.emptyList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull Data data, @NonNull Collection<String> collection, @NonNull RuntimeExtras runtimeExtras, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @NonNull Executor executor, @NonNull TaskExecutor taskExecutor, @NonNull WorkerFactory workerFactory, @NonNull ProgressUpdater progressUpdater, @NonNull ForegroundUpdater foregroundUpdater) {
        this.f38286a = uuid;
        this.f38287b = data;
        this.f38288c = new HashSet(collection);
        this.f38289d = runtimeExtras;
        this.f38290e = i;
        this.f38296k = i2;
        this.f38291f = executor;
        this.f38292g = taskExecutor;
        this.f38293h = workerFactory;
        this.f38294i = progressUpdater;
        this.f38295j = foregroundUpdater;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.f38291f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ForegroundUpdater getForegroundUpdater() {
        return this.f38295j;
    }

    @IntRange(from = 0)
    public int getGeneration() {
        return this.f38296k;
    }

    @NonNull
    public UUID getId() {
        return this.f38286a;
    }

    @NonNull
    public Data getInputData() {
        return this.f38287b;
    }

    @Nullable
    @RequiresApi(28)
    public Network getNetwork() {
        return this.f38289d.network;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ProgressUpdater getProgressUpdater() {
        return this.f38294i;
    }

    @IntRange(from = 0)
    public int getRunAttemptCount() {
        return this.f38290e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public RuntimeExtras getRuntimeExtras() {
        return this.f38289d;
    }

    @NonNull
    public Set<String> getTags() {
        return this.f38288c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public TaskExecutor getTaskExecutor() {
        return this.f38292g;
    }

    @NonNull
    @RequiresApi(24)
    public List<String> getTriggeredContentAuthorities() {
        return this.f38289d.triggeredContentAuthorities;
    }

    @NonNull
    @RequiresApi(24)
    public List<Uri> getTriggeredContentUris() {
        return this.f38289d.triggeredContentUris;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerFactory getWorkerFactory() {
        return this.f38293h;
    }
}
