package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.apache.commons.cli.HelpFormatter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class Processor implements ForegroundProcessor {

    /* renamed from: l */
    public static final String f38389l = Logger.tagWithPrefix("Processor");

    /* renamed from: b */
    public Context f38391b;

    /* renamed from: c */
    public Configuration f38392c;

    /* renamed from: d */
    public TaskExecutor f38393d;

    /* renamed from: e */
    public WorkDatabase f38394e;

    /* renamed from: g */
    public Map f38396g = new HashMap();

    /* renamed from: f */
    public Map f38395f = new HashMap();

    /* renamed from: i */
    public Set f38398i = new HashSet();

    /* renamed from: j */
    public final List f38399j = new ArrayList();

    /* renamed from: a */
    public PowerManager.WakeLock f38390a = null;

    /* renamed from: k */
    public final Object f38400k = new Object();

    /* renamed from: h */
    public Map f38397h = new HashMap();

    public Processor(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull WorkDatabase workDatabase) {
        this.f38391b = context;
        this.f38392c = configuration;
        this.f38393d = taskExecutor;
        this.f38394e = workDatabase;
    }

    /* renamed from: b */
    public static /* synthetic */ void m52303b(Processor processor, WorkGenerationalId workGenerationalId, boolean z) {
        processor.m52298g(workGenerationalId, z);
    }

    /* renamed from: f */
    public static boolean m52299f(String str, WorkerWrapper workerWrapper, int i) {
        if (workerWrapper != null) {
            workerWrapper.interrupt(i);
            Logger logger = Logger.get();
            String str2 = f38389l;
            logger.debug(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        Logger logger2 = Logger.get();
        String str3 = f38389l;
        logger2.debug(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public void addExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.f38400k) {
            this.f38399j.add(executionListener);
        }
    }

    /* renamed from: d */
    public final WorkerWrapper m52301d(String str) {
        boolean z;
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f38395f.remove(str);
        if (workerWrapper != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            workerWrapper = (WorkerWrapper) this.f38396g.remove(str);
        }
        this.f38397h.remove(str);
        if (z) {
            m52293l();
        }
        return workerWrapper;
    }

    /* renamed from: e */
    public final WorkerWrapper m52300e(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f38395f.get(str);
        if (workerWrapper == null) {
            return (WorkerWrapper) this.f38396g.get(str);
        }
        return workerWrapper;
    }

    /* renamed from: g */
    public final /* synthetic */ void m52298g(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.f38400k) {
            try {
                for (ExecutionListener executionListener : this.f38399j) {
                    executionListener.onExecuted(workGenerationalId, z);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public WorkSpec getRunningWorkSpec(@NonNull String str) {
        synchronized (this.f38400k) {
            try {
                WorkerWrapper m52300e = m52300e(str);
                if (m52300e != null) {
                    return m52300e.getWorkSpec();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public final /* synthetic */ WorkSpec m52297h(ArrayList arrayList, String str) {
        arrayList.addAll(this.f38394e.workTagDao().getTagsForWorkSpecId(str));
        return this.f38394e.workSpecDao().getWorkSpec(str);
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.f38400k) {
            try {
                if (this.f38396g.isEmpty() && this.f38395f.isEmpty()) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: i */
    public final /* synthetic */ void m52296i(ListenableFuture listenableFuture, WorkerWrapper workerWrapper) {
        boolean z;
        try {
            z = ((Boolean) listenableFuture.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        m52295j(workerWrapper, z);
    }

    public boolean isCancelled(@NonNull String str) {
        boolean contains;
        synchronized (this.f38400k) {
            contains = this.f38398i.contains(str);
        }
        return contains;
    }

    public boolean isEnqueued(@NonNull String str) {
        boolean z;
        synchronized (this.f38400k) {
            if (m52300e(str) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final void m52295j(WorkerWrapper workerWrapper, boolean z) {
        synchronized (this.f38400k) {
            try {
                WorkGenerationalId workGenerationalId = workerWrapper.getWorkGenerationalId();
                String workSpecId = workGenerationalId.getWorkSpecId();
                if (m52300e(workSpecId) == workerWrapper) {
                    m52301d(workSpecId);
                }
                Logger logger = Logger.get();
                String str = f38389l;
                logger.debug(str, getClass().getSimpleName() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + workSpecId + " executed; reschedule = " + z);
                for (ExecutionListener executionListener : this.f38399j) {
                    executionListener.onExecuted(workGenerationalId, z);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final void m52294k(final WorkGenerationalId workGenerationalId, final boolean z) {
        this.f38393d.getMainThreadExecutor().execute(new Runnable() { // from class: mp1
            @Override // java.lang.Runnable
            public final void run() {
                Processor.m52303b(Processor.this, workGenerationalId, z);
            }
        });
    }

    /* renamed from: l */
    public final void m52293l() {
        synchronized (this.f38400k) {
            try {
                if (!(!this.f38395f.isEmpty())) {
                    this.f38391b.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.f38391b));
                    PowerManager.WakeLock wakeLock = this.f38390a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f38390a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.f38400k) {
            this.f38399j.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(@NonNull String str, @NonNull ForegroundInfo foregroundInfo) {
        synchronized (this.f38400k) {
            try {
                Logger logger = Logger.get();
                String str2 = f38389l;
                logger.info(str2, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapper = (WorkerWrapper) this.f38396g.remove(str);
                if (workerWrapper != null) {
                    if (this.f38390a == null) {
                        PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.f38391b, "ProcessorForegroundLck");
                        this.f38390a = newWakeLock;
                        newWakeLock.acquire();
                    }
                    this.f38395f.put(str, workerWrapper);
                    ContextCompat.startForegroundService(this.f38391b, SystemForegroundDispatcher.createStartForegroundIntent(this.f38391b, workerWrapper.getWorkGenerationalId(), foregroundInfo));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean startWork(@NonNull StartStopToken startStopToken) {
        return startWork(startStopToken, null);
    }

    public boolean stopAndCancelWork(@NonNull String str, int i) {
        WorkerWrapper m52301d;
        synchronized (this.f38400k) {
            Logger logger = Logger.get();
            String str2 = f38389l;
            logger.debug(str2, "Processor cancelling " + str);
            this.f38398i.add(str);
            m52301d = m52301d(str);
        }
        return m52299f(str, m52301d, i);
    }

    public boolean stopForegroundWork(@NonNull StartStopToken startStopToken, int i) {
        WorkerWrapper m52301d;
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.f38400k) {
            m52301d = m52301d(workSpecId);
        }
        return m52299f(workSpecId, m52301d, i);
    }

    public boolean stopWork(@NonNull StartStopToken startStopToken, int i) {
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.f38400k) {
            try {
                if (this.f38395f.get(workSpecId) != null) {
                    Logger logger = Logger.get();
                    String str = f38389l;
                    logger.debug(str, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                    return false;
                }
                Set set = (Set) this.f38397h.get(workSpecId);
                if (set != null && set.contains(startStopToken)) {
                    return m52299f(workSpecId, m52301d(workSpecId), i);
                }
                return false;
            } finally {
            }
        }
    }

    public boolean startWork(@NonNull StartStopToken startStopToken, @Nullable WorkerParameters.RuntimeExtras runtimeExtras) {
        WorkGenerationalId id2 = startStopToken.getId();
        final String workSpecId = id2.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.f38394e.runInTransaction(new Callable() { // from class: kp1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkSpec m52297h;
                m52297h = Processor.this.m52297h(arrayList, workSpecId);
                return m52297h;
            }
        });
        if (workSpec == null) {
            Logger logger = Logger.get();
            String str = f38389l;
            logger.warning(str, "Didn't find WorkSpec for id " + id2);
            m52294k(id2, false);
            return false;
        }
        synchronized (this.f38400k) {
            try {
                if (isEnqueued(workSpecId)) {
                    Set set = (Set) this.f38397h.get(workSpecId);
                    if (((StartStopToken) set.iterator().next()).getId().getGeneration() == id2.getGeneration()) {
                        set.add(startStopToken);
                        Logger logger2 = Logger.get();
                        String str2 = f38389l;
                        logger2.debug(str2, "Work " + id2 + " is already enqueued for processing");
                    } else {
                        m52294k(id2, false);
                    }
                    return false;
                } else if (workSpec.getGeneration() != id2.getGeneration()) {
                    m52294k(id2, false);
                    return false;
                } else {
                    final WorkerWrapper build = new WorkerWrapper.Builder(this.f38391b, this.f38392c, this.f38393d, this, this.f38394e, workSpec, arrayList).withRuntimeExtras(runtimeExtras).build();
                    final ListenableFuture<Boolean> future = build.getFuture();
                    future.addListener(new Runnable() { // from class: lp1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Processor.this.m52296i(future, build);
                        }
                    }, this.f38393d.getMainThreadExecutor());
                    this.f38396g.put(workSpecId, build);
                    HashSet hashSet = new HashSet();
                    hashSet.add(startStopToken);
                    this.f38397h.put(workSpecId, hashSet);
                    this.f38393d.getSerialTaskExecutor().execute(build);
                    Logger logger3 = Logger.get();
                    String str3 = f38389l;
                    logger3.debug(str3, getClass().getSimpleName() + ": processing " + id2);
                    return true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}