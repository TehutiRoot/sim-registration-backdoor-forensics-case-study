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
    public static final String f38301l = Logger.tagWithPrefix("Processor");

    /* renamed from: b */
    public Context f38303b;

    /* renamed from: c */
    public Configuration f38304c;

    /* renamed from: d */
    public TaskExecutor f38305d;

    /* renamed from: e */
    public WorkDatabase f38306e;

    /* renamed from: g */
    public Map f38308g = new HashMap();

    /* renamed from: f */
    public Map f38307f = new HashMap();

    /* renamed from: i */
    public Set f38310i = new HashSet();

    /* renamed from: j */
    public final List f38311j = new ArrayList();

    /* renamed from: a */
    public PowerManager.WakeLock f38302a = null;

    /* renamed from: k */
    public final Object f38312k = new Object();

    /* renamed from: h */
    public Map f38309h = new HashMap();

    public Processor(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull WorkDatabase workDatabase) {
        this.f38303b = context;
        this.f38304c = configuration;
        this.f38305d = taskExecutor;
        this.f38306e = workDatabase;
    }

    /* renamed from: a */
    public static /* synthetic */ WorkSpec m52352a(Processor processor, ArrayList arrayList, String str) {
        return processor.m52345h(arrayList, str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m52351b(Processor processor, WorkGenerationalId workGenerationalId, boolean z) {
        processor.m52346g(workGenerationalId, z);
    }

    /* renamed from: f */
    public static boolean m52347f(String str, WorkerWrapper workerWrapper, int i) {
        if (workerWrapper != null) {
            workerWrapper.interrupt(i);
            Logger logger = Logger.get();
            String str2 = f38301l;
            logger.debug(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        Logger logger2 = Logger.get();
        String str3 = f38301l;
        logger2.debug(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public void addExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.f38312k) {
            this.f38311j.add(executionListener);
        }
    }

    /* renamed from: d */
    public final WorkerWrapper m52349d(String str) {
        boolean z;
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f38307f.remove(str);
        if (workerWrapper != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            workerWrapper = (WorkerWrapper) this.f38308g.remove(str);
        }
        this.f38309h.remove(str);
        if (z) {
            m52341l();
        }
        return workerWrapper;
    }

    /* renamed from: e */
    public final WorkerWrapper m52348e(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f38307f.get(str);
        if (workerWrapper == null) {
            return (WorkerWrapper) this.f38308g.get(str);
        }
        return workerWrapper;
    }

    /* renamed from: g */
    public final /* synthetic */ void m52346g(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.f38312k) {
            try {
                for (ExecutionListener executionListener : this.f38311j) {
                    executionListener.onExecuted(workGenerationalId, z);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public WorkSpec getRunningWorkSpec(@NonNull String str) {
        synchronized (this.f38312k) {
            try {
                WorkerWrapper m52348e = m52348e(str);
                if (m52348e != null) {
                    return m52348e.getWorkSpec();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public final /* synthetic */ WorkSpec m52345h(ArrayList arrayList, String str) {
        arrayList.addAll(this.f38306e.workTagDao().getTagsForWorkSpecId(str));
        return this.f38306e.workSpecDao().getWorkSpec(str);
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.f38312k) {
            try {
                if (this.f38308g.isEmpty() && this.f38307f.isEmpty()) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: i */
    public final /* synthetic */ void m52344i(ListenableFuture listenableFuture, WorkerWrapper workerWrapper) {
        boolean z;
        try {
            z = ((Boolean) listenableFuture.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        m52343j(workerWrapper, z);
    }

    public boolean isCancelled(@NonNull String str) {
        boolean contains;
        synchronized (this.f38312k) {
            contains = this.f38310i.contains(str);
        }
        return contains;
    }

    public boolean isEnqueued(@NonNull String str) {
        boolean z;
        synchronized (this.f38312k) {
            if (m52348e(str) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final void m52343j(WorkerWrapper workerWrapper, boolean z) {
        synchronized (this.f38312k) {
            try {
                WorkGenerationalId workGenerationalId = workerWrapper.getWorkGenerationalId();
                String workSpecId = workGenerationalId.getWorkSpecId();
                if (m52348e(workSpecId) == workerWrapper) {
                    m52349d(workSpecId);
                }
                Logger logger = Logger.get();
                String str = f38301l;
                logger.debug(str, getClass().getSimpleName() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + workSpecId + " executed; reschedule = " + z);
                for (ExecutionListener executionListener : this.f38311j) {
                    executionListener.onExecuted(workGenerationalId, z);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final void m52342k(final WorkGenerationalId workGenerationalId, final boolean z) {
        this.f38305d.getMainThreadExecutor().execute(new Runnable() { // from class: po1
            {
                Processor.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Processor.m52351b(Processor.this, workGenerationalId, z);
            }
        });
    }

    /* renamed from: l */
    public final void m52341l() {
        synchronized (this.f38312k) {
            try {
                if (!(!this.f38307f.isEmpty())) {
                    this.f38303b.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.f38303b));
                    PowerManager.WakeLock wakeLock = this.f38302a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f38302a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeExecutionListener(@NonNull ExecutionListener executionListener) {
        synchronized (this.f38312k) {
            this.f38311j.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(@NonNull String str, @NonNull ForegroundInfo foregroundInfo) {
        synchronized (this.f38312k) {
            try {
                Logger logger = Logger.get();
                String str2 = f38301l;
                logger.info(str2, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapper = (WorkerWrapper) this.f38308g.remove(str);
                if (workerWrapper != null) {
                    if (this.f38302a == null) {
                        PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.f38303b, "ProcessorForegroundLck");
                        this.f38302a = newWakeLock;
                        newWakeLock.acquire();
                    }
                    this.f38307f.put(str, workerWrapper);
                    ContextCompat.startForegroundService(this.f38303b, SystemForegroundDispatcher.createStartForegroundIntent(this.f38303b, workerWrapper.getWorkGenerationalId(), foregroundInfo));
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
        WorkerWrapper m52349d;
        synchronized (this.f38312k) {
            Logger logger = Logger.get();
            String str2 = f38301l;
            logger.debug(str2, "Processor cancelling " + str);
            this.f38310i.add(str);
            m52349d = m52349d(str);
        }
        return m52347f(str, m52349d, i);
    }

    public boolean stopForegroundWork(@NonNull StartStopToken startStopToken, int i) {
        WorkerWrapper m52349d;
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.f38312k) {
            m52349d = m52349d(workSpecId);
        }
        return m52347f(workSpecId, m52349d, i);
    }

    public boolean stopWork(@NonNull StartStopToken startStopToken, int i) {
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.f38312k) {
            try {
                if (this.f38307f.get(workSpecId) != null) {
                    Logger logger = Logger.get();
                    String str = f38301l;
                    logger.debug(str, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                    return false;
                }
                Set set = (Set) this.f38309h.get(workSpecId);
                if (set != null && set.contains(startStopToken)) {
                    return m52347f(workSpecId, m52349d(workSpecId), i);
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
        WorkSpec workSpec = (WorkSpec) this.f38306e.runInTransaction(new Callable() { // from class: no1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Processor.m52352a(Processor.this, arrayList, workSpecId);
            }
        });
        if (workSpec == null) {
            Logger logger = Logger.get();
            String str = f38301l;
            logger.warning(str, "Didn't find WorkSpec for id " + id2);
            m52342k(id2, false);
            return false;
        }
        synchronized (this.f38312k) {
            try {
                if (isEnqueued(workSpecId)) {
                    Set set = (Set) this.f38309h.get(workSpecId);
                    if (((StartStopToken) set.iterator().next()).getId().getGeneration() == id2.getGeneration()) {
                        set.add(startStopToken);
                        Logger logger2 = Logger.get();
                        String str2 = f38301l;
                        logger2.debug(str2, "Work " + id2 + " is already enqueued for processing");
                    } else {
                        m52342k(id2, false);
                    }
                    return false;
                } else if (workSpec.getGeneration() != id2.getGeneration()) {
                    m52342k(id2, false);
                    return false;
                } else {
                    final WorkerWrapper build = new WorkerWrapper.Builder(this.f38303b, this.f38304c, this.f38305d, this, this.f38306e, workSpec, arrayList).withRuntimeExtras(runtimeExtras).build();
                    final ListenableFuture<Boolean> future = build.getFuture();
                    future.addListener(new Runnable() { // from class: oo1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Processor.this.m52344i(future, build);
                        }
                    }, this.f38305d.getMainThreadExecutor());
                    this.f38308g.put(workSpecId, build);
                    HashSet hashSet = new HashSet();
                    hashSet.add(startStopToken);
                    this.f38309h.put(workSpecId, hashSet);
                    this.f38305d.getSerialTaskExecutor().execute(build);
                    Logger logger3 = Logger.get();
                    String str3 = f38301l;
                    logger3.debug(str3, getClass().getSimpleName() + ": processing " + id2);
                    return true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
