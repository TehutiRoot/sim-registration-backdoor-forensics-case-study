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
    public static final String f38538l = Logger.tagWithPrefix("SystemAlarmDispatcher");

    /* renamed from: a */
    public final Context f38539a;

    /* renamed from: b */
    public final TaskExecutor f38540b;

    /* renamed from: c */
    public final WorkTimer f38541c;

    /* renamed from: d */
    public final Processor f38542d;

    /* renamed from: e */
    public final WorkManagerImpl f38543e;

    /* renamed from: f */
    public final CommandHandler f38544f;

    /* renamed from: g */
    public final List f38545g;

    /* renamed from: h */
    public Intent f38546h;

    /* renamed from: i */
    public InterfaceC5218c f38547i;

    /* renamed from: j */
    public StartStopTokens f38548j;

    /* renamed from: k */
    public final WorkLauncher f38549k;

    /* renamed from: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$a */
    /* loaded from: classes.dex */
    public class RunnableC5216a implements Runnable {
        public RunnableC5216a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor mainThreadExecutor;
            RunnableC5219d runnableC5219d;
            synchronized (SystemAlarmDispatcher.this.f38545g) {
                SystemAlarmDispatcher systemAlarmDispatcher = SystemAlarmDispatcher.this;
                systemAlarmDispatcher.f38546h = (Intent) systemAlarmDispatcher.f38545g.get(0);
            }
            Intent intent = SystemAlarmDispatcher.this.f38546h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = SystemAlarmDispatcher.this.f38546h.getIntExtra("KEY_START_ID", 0);
                Logger logger = Logger.get();
                String str = SystemAlarmDispatcher.f38538l;
                logger.debug(str, "Processing command " + SystemAlarmDispatcher.this.f38546h + ", " + intExtra);
                Context context = SystemAlarmDispatcher.this.f38539a;
                PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(context, action + " (" + intExtra + ")");
                try {
                    Logger logger2 = Logger.get();
                    logger2.debug(str, "Acquiring operation wake lock (" + action + ") " + newWakeLock);
                    newWakeLock.acquire();
                    SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                    systemAlarmDispatcher2.f38544f.m52220p(systemAlarmDispatcher2.f38546h, intExtra, systemAlarmDispatcher2);
                    Logger logger3 = Logger.get();
                    logger3.debug(str, "Releasing operation wake lock (" + action + ") " + newWakeLock);
                    newWakeLock.release();
                    mainThreadExecutor = SystemAlarmDispatcher.this.f38540b.getMainThreadExecutor();
                    runnableC5219d = new RunnableC5219d(SystemAlarmDispatcher.this);
                } catch (Throwable th2) {
                    try {
                        Logger logger4 = Logger.get();
                        String str2 = SystemAlarmDispatcher.f38538l;
                        logger4.error(str2, "Unexpected error in onHandleIntent", th2);
                        Logger logger5 = Logger.get();
                        logger5.debug(str2, "Releasing operation wake lock (" + action + ") " + newWakeLock);
                        newWakeLock.release();
                        mainThreadExecutor = SystemAlarmDispatcher.this.f38540b.getMainThreadExecutor();
                        runnableC5219d = new RunnableC5219d(SystemAlarmDispatcher.this);
                    } catch (Throwable th3) {
                        Logger logger6 = Logger.get();
                        String str3 = SystemAlarmDispatcher.f38538l;
                        logger6.debug(str3, "Releasing operation wake lock (" + action + ") " + newWakeLock);
                        newWakeLock.release();
                        SystemAlarmDispatcher.this.f38540b.getMainThreadExecutor().execute(new RunnableC5219d(SystemAlarmDispatcher.this));
                        throw th3;
                    }
                }
                mainThreadExecutor.execute(runnableC5219d);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$b */
    /* loaded from: classes.dex */
    public static class RunnableC5217b implements Runnable {

        /* renamed from: a */
        public final SystemAlarmDispatcher f38551a;

        /* renamed from: b */
        public final Intent f38552b;

        /* renamed from: c */
        public final int f38553c;

        public RunnableC5217b(SystemAlarmDispatcher systemAlarmDispatcher, Intent intent, int i) {
            this.f38551a = systemAlarmDispatcher;
            this.f38552b = intent;
            this.f38553c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38551a.add(this.f38552b, this.f38553c);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$c */
    /* loaded from: classes.dex */
    public interface InterfaceC5218c {
        void onAllCommandsCompleted();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$d */
    /* loaded from: classes.dex */
    public static class RunnableC5219d implements Runnable {

        /* renamed from: a */
        public final SystemAlarmDispatcher f38554a;

        public RunnableC5219d(SystemAlarmDispatcher systemAlarmDispatcher) {
            this.f38554a = systemAlarmDispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38554a.m52208b();
        }
    }

    public SystemAlarmDispatcher(Context context) {
        this(context, null, null, null);
    }

    /* renamed from: a */
    public final void m52209a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    @MainThread
    public boolean add(@NonNull Intent intent, int i) {
        Logger logger = Logger.get();
        String str = f38538l;
        logger.debug(str, "Adding command " + intent + " (" + i + ")");
        m52209a();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.get().warning(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m52202h("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f38545g) {
                try {
                    boolean z = !this.f38545g.isEmpty();
                    this.f38545g.add(intent);
                    if (!z) {
                        m52200j();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public void m52208b() {
        Logger logger = Logger.get();
        String str = f38538l;
        logger.debug(str, "Checking if commands are complete.");
        m52209a();
        synchronized (this.f38545g) {
            try {
                if (this.f38546h != null) {
                    Logger logger2 = Logger.get();
                    logger2.debug(str, "Removing command " + this.f38546h);
                    if (((Intent) this.f38545g.remove(0)).equals(this.f38546h)) {
                        this.f38546h = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                SerialExecutor serialTaskExecutor = this.f38540b.getSerialTaskExecutor();
                if (!this.f38544f.m52221o() && this.f38545g.isEmpty() && !serialTaskExecutor.hasPendingTasks()) {
                    Logger.get().debug(str, "No more commands & intents.");
                    InterfaceC5218c interfaceC5218c = this.f38547i;
                    if (interfaceC5218c != null) {
                        interfaceC5218c.onAllCommandsCompleted();
                    }
                } else if (!this.f38545g.isEmpty()) {
                    m52200j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public Processor m52207c() {
        return this.f38542d;
    }

    /* renamed from: d */
    public TaskExecutor m52206d() {
        return this.f38540b;
    }

    /* renamed from: e */
    public WorkManagerImpl m52205e() {
        return this.f38543e;
    }

    /* renamed from: f */
    public WorkTimer m52204f() {
        return this.f38541c;
    }

    /* renamed from: g */
    public WorkLauncher m52203g() {
        return this.f38549k;
    }

    /* renamed from: h */
    public final boolean m52202h(String str) {
        m52209a();
        synchronized (this.f38545g) {
            try {
                for (Intent intent : this.f38545g) {
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
    public void m52201i() {
        Logger.get().debug(f38538l, "Destroying SystemAlarmDispatcher");
        this.f38542d.removeExecutionListener(this);
        this.f38547i = null;
    }

    /* renamed from: j */
    public final void m52200j() {
        m52209a();
        PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.f38539a, "ProcessCommand");
        try {
            newWakeLock.acquire();
            this.f38543e.getWorkTaskExecutor().executeOnTaskThread(new RunnableC5216a());
        } finally {
            newWakeLock.release();
        }
    }

    /* renamed from: k */
    public void m52199k(InterfaceC5218c interfaceC5218c) {
        if (this.f38547i != null) {
            Logger.get().error(f38538l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f38547i = interfaceC5218c;
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        this.f38540b.getMainThreadExecutor().execute(new RunnableC5217b(this, CommandHandler.m52233c(this.f38539a, workGenerationalId, z), 0));
    }

    public SystemAlarmDispatcher(Context context, Processor processor, WorkManagerImpl workManagerImpl, WorkLauncher workLauncher) {
        Context applicationContext = context.getApplicationContext();
        this.f38539a = applicationContext;
        this.f38548j = new StartStopTokens();
        workManagerImpl = workManagerImpl == null ? WorkManagerImpl.getInstance(context) : workManagerImpl;
        this.f38543e = workManagerImpl;
        this.f38544f = new CommandHandler(applicationContext, workManagerImpl.getConfiguration().getClock(), this.f38548j);
        this.f38541c = new WorkTimer(workManagerImpl.getConfiguration().getRunnableScheduler());
        processor = processor == null ? workManagerImpl.getProcessor() : processor;
        this.f38542d = processor;
        TaskExecutor workTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.f38540b = workTaskExecutor;
        this.f38549k = workLauncher == null ? new WorkLauncherImpl(processor, workTaskExecutor) : workLauncher;
        processor.addExecutionListener(this);
        this.f38545g = new ArrayList();
        this.f38546h = null;
    }
}