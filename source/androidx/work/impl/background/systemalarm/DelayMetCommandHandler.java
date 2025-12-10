package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DelayMetCommandHandler implements OnConstraintsStateChangedListener, WorkTimer.TimeLimitExceededListener {

    /* renamed from: o */
    public static final String f38434o = Logger.tagWithPrefix("DelayMetCommandHandler");

    /* renamed from: a */
    public final Context f38435a;

    /* renamed from: b */
    public final int f38436b;

    /* renamed from: c */
    public final WorkGenerationalId f38437c;

    /* renamed from: d */
    public final SystemAlarmDispatcher f38438d;

    /* renamed from: e */
    public final WorkConstraintsTracker f38439e;

    /* renamed from: f */
    public final Object f38440f;

    /* renamed from: g */
    public int f38441g;

    /* renamed from: h */
    public final Executor f38442h;

    /* renamed from: i */
    public final Executor f38443i;

    /* renamed from: j */
    public PowerManager.WakeLock f38444j;

    /* renamed from: k */
    public boolean f38445k;

    /* renamed from: l */
    public final StartStopToken f38446l;

    /* renamed from: m */
    public final CoroutineDispatcher f38447m;

    /* renamed from: n */
    public volatile Job f38448n;

    public DelayMetCommandHandler(Context context, int i, SystemAlarmDispatcher systemAlarmDispatcher, StartStopToken startStopToken) {
        this.f38435a = context;
        this.f38436b = i;
        this.f38438d = systemAlarmDispatcher;
        this.f38437c = startStopToken.getId();
        this.f38446l = startStopToken;
        Trackers trackers = systemAlarmDispatcher.m52253e().getTrackers();
        this.f38442h = systemAlarmDispatcher.m52254d().getSerialTaskExecutor();
        this.f38443i = systemAlarmDispatcher.m52254d().getMainThreadExecutor();
        this.f38447m = systemAlarmDispatcher.m52254d().getTaskCoroutineDispatcher();
        this.f38439e = new WorkConstraintsTracker(trackers);
        this.f38445k = false;
        this.f38441g = 0;
        this.f38440f = new Object();
    }

    /* renamed from: c */
    public final void m52262c() {
        synchronized (this.f38440f) {
            try {
                if (this.f38448n != null) {
                    this.f38448n.cancel((CancellationException) null);
                }
                this.f38438d.m52252f().stopTimer(this.f38437c);
                PowerManager.WakeLock wakeLock = this.f38444j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    Logger logger = Logger.get();
                    String str = f38434o;
                    logger.debug(str, "Releasing wakelock " + this.f38444j + "for WorkSpec " + this.f38437c);
                    this.f38444j.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m52261d() {
        String workSpecId = this.f38437c.getWorkSpecId();
        Context context = this.f38435a;
        this.f38444j = WakeLocks.newWakeLock(context, workSpecId + " (" + this.f38436b + ")");
        Logger logger = Logger.get();
        String str = f38434o;
        logger.debug(str, "Acquiring wakelock " + this.f38444j + "for WorkSpec " + workSpecId);
        this.f38444j.acquire();
        WorkSpec workSpec = this.f38438d.m52253e().getWorkDatabase().workSpecDao().getWorkSpec(workSpecId);
        if (workSpec == null) {
            this.f38442h.execute(new RunnableC0087BF(this));
            return;
        }
        boolean hasConstraints = workSpec.hasConstraints();
        this.f38445k = hasConstraints;
        if (!hasConstraints) {
            Logger logger2 = Logger.get();
            logger2.debug(str, "No constraints for " + workSpecId);
            this.f38442h.execute(new RunnableC0165CF(this));
            return;
        }
        this.f38448n = WorkConstraintsTrackerKt.listen(this.f38439e, workSpec, this.f38447m, this);
    }

    /* renamed from: e */
    public void m52260e(boolean z) {
        Logger logger = Logger.get();
        String str = f38434o;
        logger.debug(str, "onExecuted " + this.f38437c + ", " + z);
        m52262c();
        if (z) {
            this.f38443i.execute(new SystemAlarmDispatcher.RunnableC5235b(this.f38438d, CommandHandler.m52279e(this.f38435a, this.f38437c), this.f38436b));
        }
        if (this.f38445k) {
            this.f38443i.execute(new SystemAlarmDispatcher.RunnableC5235b(this.f38438d, CommandHandler.m52283a(this.f38435a), this.f38436b));
        }
    }

    /* renamed from: f */
    public final void m52259f() {
        if (this.f38441g == 0) {
            this.f38441g = 1;
            Logger logger = Logger.get();
            String str = f38434o;
            logger.debug(str, "onAllConstraintsMet for " + this.f38437c);
            if (this.f38438d.m52255c().startWork(this.f38446l)) {
                this.f38438d.m52252f().startTimer(this.f38437c, 600000L, this);
                return;
            } else {
                m52262c();
                return;
            }
        }
        Logger logger2 = Logger.get();
        String str2 = f38434o;
        logger2.debug(str2, "Already started work for " + this.f38437c);
    }

    /* renamed from: g */
    public final void m52258g() {
        String workSpecId = this.f38437c.getWorkSpecId();
        if (this.f38441g < 2) {
            this.f38441g = 2;
            Logger logger = Logger.get();
            String str = f38434o;
            logger.debug(str, "Stopping work for WorkSpec " + workSpecId);
            this.f38443i.execute(new SystemAlarmDispatcher.RunnableC5235b(this.f38438d, CommandHandler.m52278f(this.f38435a, this.f38437c), this.f38436b));
            if (this.f38438d.m52255c().isEnqueued(this.f38437c.getWorkSpecId())) {
                Logger logger2 = Logger.get();
                logger2.debug(str, "WorkSpec " + workSpecId + " needs to be rescheduled");
                this.f38443i.execute(new SystemAlarmDispatcher.RunnableC5235b(this.f38438d, CommandHandler.m52279e(this.f38435a, this.f38437c), this.f38436b));
                return;
            }
            Logger logger3 = Logger.get();
            logger3.debug(str, "Processor does not have WorkSpec " + workSpecId + ". No need to reschedule");
            return;
        }
        Logger logger4 = Logger.get();
        String str2 = f38434o;
        logger4.debug(str2, "Already stopped work for " + workSpecId);
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec, @NonNull ConstraintsState constraintsState) {
        if (constraintsState instanceof ConstraintsState.ConstraintsMet) {
            this.f38442h.execute(new RunnableC0165CF(this));
        } else {
            this.f38442h.execute(new RunnableC0087BF(this));
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public void onTimeLimitExceeded(@NonNull WorkGenerationalId workGenerationalId) {
        Logger logger = Logger.get();
        String str = f38434o;
        logger.debug(str, "Exceeded time limits on execution for " + workGenerationalId);
        this.f38442h.execute(new RunnableC0087BF(this));
    }
}
