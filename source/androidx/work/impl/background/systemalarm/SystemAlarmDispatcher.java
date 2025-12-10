package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemAlarmDispatcher implements ExecutionListener {

    /* renamed from: l */
    public static final String f38450l = Logger.tagWithPrefix("SystemAlarmDispatcher");

    /* renamed from: a */
    public final Context f38451a;

    /* renamed from: b */
    public final TaskExecutor f38452b;

    /* renamed from: c */
    public final WorkTimer f38453c;

    /* renamed from: d */
    public final Processor f38454d;

    /* renamed from: e */
    public final WorkManagerImpl f38455e;

    /* renamed from: f */
    public final CommandHandler f38456f;

    /* renamed from: g */
    public final List f38457g;

    /* renamed from: h */
    public Intent f38458h;

    /* renamed from: i */
    public InterfaceC5236c f38459i;

    /* renamed from: j */
    public StartStopTokens f38460j;

    /* renamed from: k */
    public final WorkLauncher f38461k;

    /* renamed from: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$a */
    /* loaded from: classes.dex */
    public class RunnableC5234a implements Runnable {
        public RunnableC5234a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor mainThreadExecutor;
            RunnableC5237d runnableC5237d;
            synchronized (SystemAlarmDispatcher.this.f38457g) {
                SystemAlarmDispatcher systemAlarmDispatcher = SystemAlarmDispatcher.this;
                systemAlarmDispatcher.f38458h = (Intent) systemAlarmDispatcher.f38457g.get(0);
            }
            Intent intent = SystemAlarmDispatcher.this.f38458h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = SystemAlarmDispatcher.this.f38458h.getIntExtra("KEY_START_ID", 0);
                Logger logger = Logger.get();
                String str = SystemAlarmDispatcher.f38450l;
                logger.debug(str, "Processing command " + SystemAlarmDispatcher.this.f38458h + ", " + intExtra);
                Context context = SystemAlarmDispatcher.this.f38451a;
                PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(context, action + " (" + intExtra + ")");
                try {
                    Logger logger2 = Logger.get();
                    logger2.debug(str, "Acquiring operation wake lock (" + action + ") " + newWakeLock);
                    newWakeLock.acquire();
                    SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                    systemAlarmDispatcher2.f38456f.m52268p(systemAlarmDispatcher2.f38458h, intExtra, systemAlarmDispatcher2);
                    Logger logger3 = Logger.get();
                    logger3.debug(str, "Releasing operation wake lock (" + action + ") " + newWakeLock);
                    newWakeLock.release();
                    mainThreadExecutor = SystemAlarmDispatcher.this.f38452b.getMainThreadExecutor();
                    runnableC5237d = new RunnableC5237d(SystemAlarmDispatcher.this);
                } catch (Throwable th2) {
                    try {
                        Logger logger4 = Logger.get();
                        String str2 = SystemAlarmDispatcher.f38450l;
                        logger4.error(str2, "Unexpected error in onHandleIntent", th2);
                        Logger logger5 = Logger.get();
                        logger5.debug(str2, "Releasing operation wake lock (" + action + ") " + newWakeLock);
                        newWakeLock.release();
                        mainThreadExecutor = SystemAlarmDispatcher.this.f38452b.getMainThreadExecutor();
                        runnableC5237d = new RunnableC5237d(SystemAlarmDispatcher.this);
                    } catch (Throwable th3) {
                        Logger logger6 = Logger.get();
                        String str3 = SystemAlarmDispatcher.f38450l;
                        logger6.debug(str3, "Releasing operation wake lock (" + action + ") " + newWakeLock);
                        newWakeLock.release();
                        SystemAlarmDispatcher.this.f38452b.getMainThreadExecutor().execute(new RunnableC5237d(SystemAlarmDispatcher.this));
                        throw th3;
                    }
                }
                mainThreadExecutor.execute(runnableC5237d);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$b */
    /* loaded from: classes.dex */
    public static class RunnableC5235b implements Runnable {

        /* renamed from: a */
        public final SystemAlarmDispatcher f38463a;

        /* renamed from: b */
        public final Intent f38464b;

        /* renamed from: c */
        public final int f38465c;

        public RunnableC5235b(SystemAlarmDispatcher systemAlarmDispatcher, Intent intent, int i) {
            this.f38463a = systemAlarmDispatcher;
            this.f38464b = intent;
            this.f38465c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38463a.add(this.f38464b, this.f38465c);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$c */
    /* loaded from: classes.dex */
    public interface InterfaceC5236c {
        void onAllCommandsCompleted();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$d */
    /* loaded from: classes.dex */
    public static class RunnableC5237d implements Runnable {

        /* renamed from: a */
        public final SystemAlarmDispatcher f38466a;

        public RunnableC5237d(SystemAlarmDispatcher systemAlarmDispatcher) {
            this.f38466a = systemAlarmDispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38466a.m52256b();
        }
    }

    public SystemAlarmDispatcher(Context context) {
        this(context, null, null, null);
    }

    /* renamed from: a */
    public final void m52257a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    @MainThread
    public boolean add(@NonNull Intent intent, int i) {
        Logger logger = Logger.get();
        String str = f38450l;
        logger.debug(str, "Adding command " + intent + " (" + i + ")");
        m52257a();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.get().warning(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m52250h("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f38457g) {
                try {
                    boolean z = !this.f38457g.isEmpty();
                    this.f38457g.add(intent);
                    if (!z) {
                        m52248j();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public void m52256b() {
        Logger logger = Logger.get();
        String str = f38450l;
        logger.debug(str, "Checking if commands are complete.");
        m52257a();
        synchronized (this.f38457g) {
            try {
                if (this.f38458h != null) {
                    Logger logger2 = Logger.get();
                    logger2.debug(str, "Removing command " + this.f38458h);
                    if (((Intent) this.f38457g.remove(0)).equals(this.f38458h)) {
                        this.f38458h = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                SerialExecutor serialTaskExecutor = this.f38452b.getSerialTaskExecutor();
                if (!this.f38456f.m52269o() && this.f38457g.isEmpty() && !serialTaskExecutor.hasPendingTasks()) {
                    Logger.get().debug(str, "No more commands & intents.");
                    InterfaceC5236c interfaceC5236c = this.f38459i;
                    if (interfaceC5236c != null) {
                        interfaceC5236c.onAllCommandsCompleted();
                    }
                } else if (!this.f38457g.isEmpty()) {
                    m52248j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public Processor m52255c() {
        return this.f38454d;
    }

    /* renamed from: d */
    public TaskExecutor m52254d() {
        return this.f38452b;
    }

    /* renamed from: e */
    public WorkManagerImpl m52253e() {
        return this.f38455e;
    }

    /* renamed from: f */
    public WorkTimer m52252f() {
        return this.f38453c;
    }

    /* renamed from: g */
    public WorkLauncher m52251g() {
        return this.f38461k;
    }

    /* renamed from: h */
    public final boolean m52250h(String str) {
        m52257a();
        synchronized (this.f38457g) {
            try {
                for (Intent intent : this.f38457g) {
                    if (str.equals(intent.getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public void m52249i() {
        Logger.get().debug(f38450l, "Destroying SystemAlarmDispatcher");
        this.f38454d.removeExecutionListener(this);
        this.f38459i = null;
    }

    /* renamed from: j */
    public final void m52248j() {
        m52257a();
        PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.f38451a, "ProcessCommand");
        try {
            newWakeLock.acquire();
            this.f38455e.getWorkTaskExecutor().executeOnTaskThread(new RunnableC5234a());
        } finally {
            newWakeLock.release();
        }
    }

    /* renamed from: k */
    public void m52247k(InterfaceC5236c interfaceC5236c) {
        if (this.f38459i != null) {
            Logger.get().error(f38450l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f38459i = interfaceC5236c;
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        this.f38452b.getMainThreadExecutor().execute(new RunnableC5235b(this, CommandHandler.m52281c(this.f38451a, workGenerationalId, z), 0));
    }

    public SystemAlarmDispatcher(Context context, Processor processor, WorkManagerImpl workManagerImpl, WorkLauncher workLauncher) {
        Context applicationContext = context.getApplicationContext();
        this.f38451a = applicationContext;
        this.f38460j = new StartStopTokens();
        workManagerImpl = workManagerImpl == null ? WorkManagerImpl.getInstance(context) : workManagerImpl;
        this.f38455e = workManagerImpl;
        this.f38456f = new CommandHandler(applicationContext, workManagerImpl.getConfiguration().getClock(), this.f38460j);
        this.f38453c = new WorkTimer(workManagerImpl.getConfiguration().getRunnableScheduler());
        processor = processor == null ? workManagerImpl.getProcessor() : processor;
        this.f38454d = processor;
        TaskExecutor workTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.f38452b = workTaskExecutor;
        this.f38461k = workLauncher == null ? new WorkLauncherImpl(processor, workTaskExecutor) : workLauncher;
        processor.addExecutionListener(this);
        this.f38457g = new ArrayList();
        this.f38458h = null;
    }
}
