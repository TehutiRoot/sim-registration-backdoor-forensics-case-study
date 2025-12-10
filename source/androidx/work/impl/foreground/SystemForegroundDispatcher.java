package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemForegroundDispatcher implements OnConstraintsStateChangedListener, ExecutionListener {

    /* renamed from: k */
    public static final String f38533k = Logger.tagWithPrefix("SystemFgDispatcher");

    /* renamed from: a */
    public Context f38534a;

    /* renamed from: b */
    public WorkManagerImpl f38535b;

    /* renamed from: c */
    public final TaskExecutor f38536c;

    /* renamed from: d */
    public final Object f38537d = new Object();

    /* renamed from: e */
    public WorkGenerationalId f38538e;

    /* renamed from: f */
    public final Map f38539f;

    /* renamed from: g */
    public final Map f38540g;

    /* renamed from: h */
    public final Map f38541h;

    /* renamed from: i */
    public final WorkConstraintsTracker f38542i;

    /* renamed from: j */
    public InterfaceC5247b f38543j;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundDispatcher$a */
    /* loaded from: classes.dex */
    public class RunnableC5246a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f38544a;

        public RunnableC5246a(String str) {
            this.f38544a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkSpec runningWorkSpec = SystemForegroundDispatcher.this.f38535b.getProcessor().getRunningWorkSpec(this.f38544a);
            if (runningWorkSpec != null && runningWorkSpec.hasConstraints()) {
                synchronized (SystemForegroundDispatcher.this.f38537d) {
                    SystemForegroundDispatcher.this.f38540g.put(WorkSpecKt.generationalId(runningWorkSpec), runningWorkSpec);
                    SystemForegroundDispatcher systemForegroundDispatcher = SystemForegroundDispatcher.this;
                    SystemForegroundDispatcher.this.f38541h.put(WorkSpecKt.generationalId(runningWorkSpec), WorkConstraintsTrackerKt.listen(systemForegroundDispatcher.f38542i, runningWorkSpec, systemForegroundDispatcher.f38536c.getTaskCoroutineDispatcher(), SystemForegroundDispatcher.this));
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundDispatcher$b */
    /* loaded from: classes.dex */
    public interface InterfaceC5247b {
        void cancelNotification(int i);

        void notify(int i, Notification notification);

        void startForeground(int i, int i2, Notification notification);

        void stop();
    }

    public SystemForegroundDispatcher(Context context) {
        this.f38534a = context;
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
        this.f38535b = workManagerImpl;
        this.f38536c = workManagerImpl.getWorkTaskExecutor();
        this.f38538e = null;
        this.f38539f = new LinkedHashMap();
        this.f38541h = new HashMap();
        this.f38540g = new HashMap();
        this.f38542i = new WorkConstraintsTracker(this.f38535b.getTrackers());
        this.f38535b.getProcessor().addExecutionListener(this);
    }

    @NonNull
    public static Intent createCancelWorkIntent(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + str));
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent createNotifyIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, @NonNull ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.getNotification());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    @NonNull
    public static Intent createStartForegroundIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, @NonNull ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.getNotification());
        return intent;
    }

    @NonNull
    public static Intent createStopForegroundIntent(@NonNull Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: c */
    public final void m52227c(Intent intent) {
        Logger logger = Logger.get();
        String str = f38533k;
        logger.info(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f38535b.cancelWorkById(UUID.fromString(stringExtra));
        }
    }

    /* renamed from: d */
    public final void m52226d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        Logger logger = Logger.get();
        String str = f38533k;
        logger.debug(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f38543j != null) {
            this.f38539f.put(workGenerationalId, new ForegroundInfo(intExtra, notification, intExtra2));
            if (this.f38538e == null) {
                this.f38538e = workGenerationalId;
                this.f38543j.startForeground(intExtra, intExtra2, notification);
                return;
            }
            this.f38543j.notify(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry entry : this.f38539f.entrySet()) {
                    i |= ((ForegroundInfo) entry.getValue()).getForegroundServiceType();
                }
                ForegroundInfo foregroundInfo = (ForegroundInfo) this.f38539f.get(this.f38538e);
                if (foregroundInfo != null) {
                    this.f38543j.startForeground(foregroundInfo.getNotificationId(), i, foregroundInfo.getNotification());
                }
            }
        }
    }

    /* renamed from: e */
    public final void m52225e(Intent intent) {
        Logger logger = Logger.get();
        String str = f38533k;
        logger.info(str, "Started foreground service " + intent);
        this.f38536c.executeOnTaskThread(new RunnableC5246a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    /* renamed from: f */
    public void m52224f(Intent intent) {
        Logger.get().info(f38533k, "Stopping foreground service");
        InterfaceC5247b interfaceC5247b = this.f38543j;
        if (interfaceC5247b != null) {
            interfaceC5247b.stop();
        }
    }

    /* renamed from: g */
    public void m52223g() {
        this.f38543j = null;
        synchronized (this.f38537d) {
            try {
                for (Job job : this.f38541h.values()) {
                    job.cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f38535b.getProcessor().removeExecutionListener(this);
    }

    /* renamed from: h */
    public void m52222h(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m52225e(intent);
            m52226d(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m52226d(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m52227c(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            m52224f(intent);
        }
    }

    /* renamed from: i */
    public void m52221i(InterfaceC5247b interfaceC5247b) {
        if (this.f38543j != null) {
            Logger.get().error(f38533k, "A callback already exists.");
        } else {
            this.f38543j = interfaceC5247b;
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec, @NonNull ConstraintsState constraintsState) {
        if (constraintsState instanceof ConstraintsState.ConstraintsNotMet) {
            String str = workSpec.f38608id;
            Logger logger = Logger.get();
            String str2 = f38533k;
            logger.debug(str2, "Constraints unmet for WorkSpec " + str);
            this.f38535b.stopForegroundWork(WorkSpecKt.generationalId(workSpec));
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    @MainThread
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        Job job;
        Map.Entry entry;
        synchronized (this.f38537d) {
            try {
                if (((WorkSpec) this.f38540g.remove(workGenerationalId)) != null) {
                    job = (Job) this.f38541h.remove(workGenerationalId);
                } else {
                    job = null;
                }
                if (job != null) {
                    job.cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) this.f38539f.remove(workGenerationalId);
        if (workGenerationalId.equals(this.f38538e)) {
            if (this.f38539f.size() > 0) {
                Iterator it = this.f38539f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                }
                this.f38538e = (WorkGenerationalId) entry.getKey();
                if (this.f38543j != null) {
                    ForegroundInfo foregroundInfo2 = (ForegroundInfo) entry.getValue();
                    this.f38543j.startForeground(foregroundInfo2.getNotificationId(), foregroundInfo2.getForegroundServiceType(), foregroundInfo2.getNotification());
                    this.f38543j.cancelNotification(foregroundInfo2.getNotificationId());
                }
            } else {
                this.f38538e = null;
            }
        }
        InterfaceC5247b interfaceC5247b = this.f38543j;
        if (foregroundInfo != null && interfaceC5247b != null) {
            Logger.get().debug(f38533k, "Removing Notification (id: " + foregroundInfo.getNotificationId() + ", workSpecId: " + workGenerationalId + ", notificationType: " + foregroundInfo.getForegroundServiceType());
            interfaceC5247b.cancelNotification(foregroundInfo.getNotificationId());
        }
    }
}
