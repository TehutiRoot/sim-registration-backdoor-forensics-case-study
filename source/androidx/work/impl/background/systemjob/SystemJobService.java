package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements ExecutionListener {

    /* renamed from: e */
    public static final String f38484e = Logger.tagWithPrefix("SystemJobService");

    /* renamed from: a */
    public WorkManagerImpl f38485a;

    /* renamed from: b */
    public final Map f38486b = new HashMap();

    /* renamed from: c */
    public final StartStopTokens f38487c = new StartStopTokens();

    /* renamed from: d */
    public WorkLauncher f38488d;

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$a */
    /* loaded from: classes.dex */
    public static class C5239a {
        @DoNotInline
        /* renamed from: a */
        public static String[] m52237a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        @DoNotInline
        /* renamed from: b */
        public static Uri[] m52236b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$b */
    /* loaded from: classes.dex */
    public static class C5240b {
        @DoNotInline
        /* renamed from: a */
        public static Network m52235a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$c */
    /* loaded from: classes.dex */
    public static class C5241c {
        @DoNotInline
        /* renamed from: a */
        public static int m52234a(JobParameters jobParameters) {
            return SystemJobService.m52239a(jobParameters.getStopReason());
        }
    }

    /* renamed from: a */
    public static int m52239a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i;
            default:
                return WorkInfo.STOP_REASON_UNKNOWN;
        }
    }

    /* renamed from: b */
    public static WorkGenerationalId m52238b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
            this.f38485a = workManagerImpl;
            Processor processor = workManagerImpl.getProcessor();
            this.f38488d = new WorkLauncherImpl(processor, this.f38485a.getWorkTaskExecutor());
            processor.addExecutionListener(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                Logger.get().warning(f38484e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.f38485a;
        if (workManagerImpl != null) {
            workManagerImpl.getProcessor().removeExecutionListener(this);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        JobParameters jobParameters;
        Logger logger = Logger.get();
        String str = f38484e;
        logger.debug(str, workGenerationalId.getWorkSpecId() + " executed on JobScheduler");
        synchronized (this.f38486b) {
            jobParameters = (JobParameters) this.f38486b.remove(workGenerationalId);
        }
        this.f38487c.remove(workGenerationalId);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        WorkerParameters.RuntimeExtras runtimeExtras;
        if (this.f38485a == null) {
            Logger.get().debug(f38484e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        WorkGenerationalId m52238b = m52238b(jobParameters);
        if (m52238b == null) {
            Logger.get().error(f38484e, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f38486b) {
            try {
                if (this.f38486b.containsKey(m52238b)) {
                    Logger logger = Logger.get();
                    String str = f38484e;
                    logger.debug(str, "Job is already being executed by SystemJobService: " + m52238b);
                    return false;
                }
                Logger logger2 = Logger.get();
                String str2 = f38484e;
                logger2.debug(str2, "onStartJob for " + m52238b);
                this.f38486b.put(m52238b, jobParameters);
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    runtimeExtras = new WorkerParameters.RuntimeExtras();
                    if (C5239a.m52236b(jobParameters) != null) {
                        runtimeExtras.triggeredContentUris = Arrays.asList(C5239a.m52236b(jobParameters));
                    }
                    if (C5239a.m52237a(jobParameters) != null) {
                        runtimeExtras.triggeredContentAuthorities = Arrays.asList(C5239a.m52237a(jobParameters));
                    }
                    if (i >= 28) {
                        runtimeExtras.network = C5240b.m52235a(jobParameters);
                    }
                } else {
                    runtimeExtras = null;
                }
                this.f38488d.startWork(this.f38487c.tokenFor(m52238b), runtimeExtras);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        int i;
        if (this.f38485a == null) {
            Logger.get().debug(f38484e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        WorkGenerationalId m52238b = m52238b(jobParameters);
        if (m52238b == null) {
            Logger.get().error(f38484e, "WorkSpec id not found!");
            return false;
        }
        Logger logger = Logger.get();
        String str = f38484e;
        logger.debug(str, "onStopJob for " + m52238b);
        synchronized (this.f38486b) {
            this.f38486b.remove(m52238b);
        }
        StartStopToken remove = this.f38487c.remove(m52238b);
        if (remove != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i = C5241c.m52234a(jobParameters);
            } else {
                i = WorkInfo.STOP_REASON_UNKNOWN;
            }
            this.f38488d.stopWorkWithReason(remove, i);
        }
        return !this.f38485a.getProcessor().isCancelled(m52238b.getWorkSpecId());
    }
}
