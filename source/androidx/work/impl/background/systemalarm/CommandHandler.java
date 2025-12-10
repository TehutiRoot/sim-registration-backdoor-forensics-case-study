package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class CommandHandler implements ExecutionListener {

    /* renamed from: f */
    public static final String f38422f = Logger.tagWithPrefix("CommandHandler");

    /* renamed from: a */
    public final Context f38423a;

    /* renamed from: b */
    public final Map f38424b = new HashMap();

    /* renamed from: c */
    public final Object f38425c = new Object();

    /* renamed from: d */
    public final Clock f38426d;

    /* renamed from: e */
    public final StartStopTokens f38427e;

    public CommandHandler(Context context, Clock clock, StartStopTokens startStopTokens) {
        this.f38423a = context;
        this.f38426d = clock;
        this.f38427e = startStopTokens;
    }

    /* renamed from: a */
    public static Intent m52283a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    public static Intent m52282b(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return m52266r(intent, workGenerationalId);
    }

    /* renamed from: c */
    public static Intent m52281c(Context context, WorkGenerationalId workGenerationalId, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return m52266r(intent, workGenerationalId);
    }

    /* renamed from: d */
    public static Intent m52280d(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: e */
    public static Intent m52279e(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return m52266r(intent, workGenerationalId);
    }

    /* renamed from: f */
    public static Intent m52278f(Context context, WorkGenerationalId workGenerationalId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return m52266r(intent, workGenerationalId);
    }

    /* renamed from: g */
    public static Intent m52277g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: n */
    public static boolean m52270n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static WorkGenerationalId m52267q(Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* renamed from: r */
    public static Intent m52266r(Intent intent, WorkGenerationalId workGenerationalId) {
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_WORKSPEC_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    /* renamed from: h */
    public final void m52276h(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger logger = Logger.get();
        String str = f38422f;
        logger.debug(str, "Handling constraints changed " + intent);
        new C5238a(this.f38423a, this.f38426d, i, systemAlarmDispatcher).m52244a();
    }

    /* renamed from: i */
    public final void m52275i(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        synchronized (this.f38425c) {
            try {
                WorkGenerationalId m52267q = m52267q(intent);
                Logger logger = Logger.get();
                String str = f38422f;
                logger.debug(str, "Handing delay met for " + m52267q);
                if (!this.f38424b.containsKey(m52267q)) {
                    DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.f38423a, i, systemAlarmDispatcher, this.f38427e.tokenFor(m52267q));
                    this.f38424b.put(m52267q, delayMetCommandHandler);
                    delayMetCommandHandler.m52261d();
                } else {
                    Logger logger2 = Logger.get();
                    logger2.debug(str, "WorkSpec " + m52267q + " is is already being handled for ACTION_DELAY_MET");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public final void m52274j(Intent intent, int i) {
        WorkGenerationalId m52267q = m52267q(intent);
        boolean z = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        Logger logger = Logger.get();
        String str = f38422f;
        logger.debug(str, "Handling onExecutionCompleted " + intent + ", " + i);
        onExecuted(m52267q, z);
    }

    /* renamed from: k */
    public final void m52273k(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger logger = Logger.get();
        String str = f38422f;
        logger.debug(str, "Handling reschedule " + intent + ", " + i);
        systemAlarmDispatcher.m52253e().rescheduleEligibleWork();
    }

    /* renamed from: l */
    public final void m52272l(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        WorkGenerationalId m52267q = m52267q(intent);
        Logger logger = Logger.get();
        String str = f38422f;
        logger.debug(str, "Handling schedule work for " + m52267q);
        WorkDatabase workDatabase = systemAlarmDispatcher.m52253e().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(m52267q.getWorkSpecId());
            if (workSpec == null) {
                Logger logger2 = Logger.get();
                logger2.warning(str, "Skipping scheduling " + m52267q + " because it's no longer in the DB");
            } else if (workSpec.state.isFinished()) {
                Logger logger3 = Logger.get();
                logger3.warning(str, "Skipping scheduling " + m52267q + "because it is finished.");
            } else {
                long calculateNextRunTime = workSpec.calculateNextRunTime();
                if (!workSpec.hasConstraints()) {
                    Logger logger4 = Logger.get();
                    logger4.debug(str, "Setting up Alarms for " + m52267q + "at " + calculateNextRunTime);
                    AbstractC0223D2.m68701c(this.f38423a, workDatabase, m52267q, calculateNextRunTime);
                } else {
                    Logger logger5 = Logger.get();
                    logger5.debug(str, "Opportunistically setting an alarm for " + m52267q + "at " + calculateNextRunTime);
                    AbstractC0223D2.m68701c(this.f38423a, workDatabase, m52267q, calculateNextRunTime);
                    systemAlarmDispatcher.m52254d().getMainThreadExecutor().execute(new SystemAlarmDispatcher.RunnableC5235b(systemAlarmDispatcher, m52283a(this.f38423a), i));
                }
                workDatabase.setTransactionSuccessful();
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    /* renamed from: m */
    public final void m52271m(Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        List<StartStopToken> remove;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i = extras.getInt("KEY_WORKSPEC_GENERATION");
            remove = new ArrayList<>(1);
            StartStopToken remove2 = this.f38427e.remove(new WorkGenerationalId(string, i));
            if (remove2 != null) {
                remove.add(remove2);
            }
        } else {
            remove = this.f38427e.remove(string);
        }
        for (StartStopToken startStopToken : remove) {
            Logger logger = Logger.get();
            String str = f38422f;
            logger.debug(str, "Handing stopWork work for " + string);
            systemAlarmDispatcher.m52251g().stopWork(startStopToken);
            AbstractC0223D2.m68703a(this.f38423a, systemAlarmDispatcher.m52253e().getWorkDatabase(), startStopToken.getId());
            systemAlarmDispatcher.onExecuted(startStopToken.getId(), false);
        }
    }

    /* renamed from: o */
    public boolean m52269o() {
        boolean z;
        synchronized (this.f38425c) {
            z = !this.f38424b.isEmpty();
        }
        return z;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.f38425c) {
            try {
                DelayMetCommandHandler delayMetCommandHandler = (DelayMetCommandHandler) this.f38424b.remove(workGenerationalId);
                this.f38427e.remove(workGenerationalId);
                if (delayMetCommandHandler != null) {
                    delayMetCommandHandler.m52260e(z);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public void m52268p(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m52276h(intent, i, systemAlarmDispatcher);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m52273k(intent, i, systemAlarmDispatcher);
        } else if (!m52270n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            Logger logger = Logger.get();
            String str = f38422f;
            logger.error(str, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m52272l(intent, i, systemAlarmDispatcher);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            m52275i(intent, i, systemAlarmDispatcher);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m52271m(intent, systemAlarmDispatcher);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m52274j(intent, i);
        } else {
            Logger logger2 = Logger.get();
            String str2 = f38422f;
            logger2.warning(str2, "Ignoring intent " + intent);
        }
    }
}
