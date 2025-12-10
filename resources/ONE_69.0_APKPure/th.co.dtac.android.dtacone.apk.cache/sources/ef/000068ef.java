package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes2.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: h */
    public static final Object f33546h = new Object();

    /* renamed from: i */
    public static final HashMap f33547i = new HashMap();

    /* renamed from: a */
    public InterfaceC3823b f33548a;

    /* renamed from: b */
    public AbstractC3830h f33549b;

    /* renamed from: c */
    public AsyncTaskC3822a f33550c;

    /* renamed from: d */
    public boolean f33551d = false;

    /* renamed from: e */
    public boolean f33552e = false;

    /* renamed from: f */
    public boolean f33553f = false;

    /* renamed from: g */
    public final ArrayList f33554g;

    /* renamed from: androidx.core.app.JobIntentService$a */
    /* loaded from: classes2.dex */
    public final class AsyncTaskC3822a extends AsyncTask {
        public AsyncTaskC3822a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                InterfaceC3826e m57871a = JobIntentService.this.m57871a();
                if (m57871a != null) {
                    JobIntentService.this.onHandleWork(m57871a.getIntent());
                    m57871a.complete();
                } else {
                    return null;
                }
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onCancelled(Void r1) {
            JobIntentService.this.m57867e();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Void r1) {
            JobIntentService.this.m57867e();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3823b {
        /* renamed from: a */
        IBinder mo57863a();

        /* renamed from: b */
        InterfaceC3826e mo57862b();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    /* loaded from: classes2.dex */
    public static final class C3824c extends AbstractC3830h {

        /* renamed from: d */
        public final Context f33556d;

        /* renamed from: e */
        public final PowerManager.WakeLock f33557e;

        /* renamed from: f */
        public final PowerManager.WakeLock f33558f;

        /* renamed from: g */
        public boolean f33559g;

        /* renamed from: h */
        public boolean f33560h;

        public C3824c(Context context, ComponentName componentName) {
            super(componentName);
            this.f33556d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f33557e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f33558f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3830h
        /* renamed from: a */
        public void mo57861a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f33571a);
            if (this.f33556d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f33559g) {
                            this.f33559g = true;
                            if (!this.f33560h) {
                                this.f33557e.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3830h
        /* renamed from: c */
        public void mo57859c() {
            synchronized (this) {
                try {
                    if (this.f33560h) {
                        if (this.f33559g) {
                            this.f33557e.acquire(60000L);
                        }
                        this.f33560h = false;
                        this.f33558f.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3830h
        /* renamed from: d */
        public void mo57858d() {
            synchronized (this) {
                try {
                    if (!this.f33560h) {
                        this.f33560h = true;
                        this.f33558f.acquire(600000L);
                        this.f33557e.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3830h
        /* renamed from: e */
        public void mo57857e() {
            synchronized (this) {
                this.f33559g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    /* loaded from: classes2.dex */
    public final class C3825d implements InterfaceC3826e {

        /* renamed from: a */
        public final Intent f33561a;

        /* renamed from: b */
        public final int f33562b;

        public C3825d(Intent intent, int i) {
            this.f33561a = intent;
            this.f33562b = i;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC3826e
        public void complete() {
            JobIntentService.this.stopSelf(this.f33562b);
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC3826e
        public Intent getIntent() {
            return this.f33561a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC3826e {
        void complete();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class jobJobServiceEngineC3827f extends JobServiceEngine implements InterfaceC3823b {

        /* renamed from: a */
        public final JobIntentService f33564a;

        /* renamed from: b */
        public final Object f33565b;

        /* renamed from: c */
        public JobParameters f33566c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        /* loaded from: classes2.dex */
        public final class C3828a implements InterfaceC3826e {

            /* renamed from: a */
            public final JobWorkItem f33567a;

            public C3828a(JobWorkItem jobWorkItem) {
                this.f33567a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC3826e
            public void complete() {
                synchronized (jobJobServiceEngineC3827f.this.f33565b) {
                    try {
                        JobParameters jobParameters = jobJobServiceEngineC3827f.this.f33566c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f33567a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC3826e
            public Intent getIntent() {
                Intent intent;
                intent = this.f33567a.getIntent();
                return intent;
            }
        }

        public jobJobServiceEngineC3827f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f33565b = new Object();
            this.f33564a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC3823b
        /* renamed from: a */
        public IBinder mo57863a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC3823b
        /* renamed from: b */
        public InterfaceC3826e mo57862b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f33565b) {
                try {
                    JobParameters jobParameters = this.f33566c;
                    if (jobParameters != null) {
                        dequeueWork = jobParameters.dequeueWork();
                        if (dequeueWork != null) {
                            intent = dequeueWork.getIntent();
                            intent.setExtrasClassLoader(this.f33564a.getClassLoader());
                            return new C3828a(dequeueWork);
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f33566c = jobParameters;
            this.f33564a.m57869c(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean m57870b = this.f33564a.m57870b();
            synchronized (this.f33565b) {
                this.f33566c = null;
            }
            return m57870b;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    /* loaded from: classes2.dex */
    public static final class C3829g extends AbstractC3830h {

        /* renamed from: d */
        public final JobInfo f33569d;

        /* renamed from: e */
        public final JobScheduler f33570e;

        public C3829g(Context context, ComponentName componentName, int i) {
            super(componentName);
            m57860b(i);
            this.f33569d = new JobInfo.Builder(i, this.f33571a).setOverrideDeadline(0L).build();
            this.f33570e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3830h
        /* renamed from: a */
        public void mo57861a(Intent intent) {
            this.f33570e.enqueue(this.f33569d, AbstractC18732Wg0.m65687a(intent));
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC3830h {

        /* renamed from: a */
        public final ComponentName f33571a;

        /* renamed from: b */
        public boolean f33572b;

        /* renamed from: c */
        public int f33573c;

        public AbstractC3830h(ComponentName componentName) {
            this.f33571a = componentName;
        }

        /* renamed from: a */
        public abstract void mo57861a(Intent intent);

        /* renamed from: b */
        public void m57860b(int i) {
            if (!this.f33572b) {
                this.f33572b = true;
                this.f33573c = i;
            } else if (this.f33573c == i) {
            } else {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f33573c);
            }
        }

        /* renamed from: c */
        public void mo57859c() {
        }

        /* renamed from: d */
        public void mo57858d() {
        }

        /* renamed from: e */
        public void mo57857e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33554g = null;
        } else {
            this.f33554g = new ArrayList();
        }
    }

    /* renamed from: d */
    public static AbstractC3830h m57868d(Context context, ComponentName componentName, boolean z, int i) {
        AbstractC3830h c3824c;
        HashMap hashMap = f33547i;
        AbstractC3830h abstractC3830h = (AbstractC3830h) hashMap.get(componentName);
        if (abstractC3830h == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z) {
                    c3824c = new C3829g(context, componentName, i);
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                c3824c = new C3824c(context, componentName);
            }
            abstractC3830h = c3824c;
            hashMap.put(componentName, abstractC3830h);
        }
        return abstractC3830h;
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Class<?> cls, int i, @NonNull Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    /* renamed from: a */
    public InterfaceC3826e m57871a() {
        InterfaceC3823b interfaceC3823b = this.f33548a;
        if (interfaceC3823b != null) {
            return interfaceC3823b.mo57862b();
        }
        synchronized (this.f33554g) {
            try {
                if (this.f33554g.size() > 0) {
                    return (InterfaceC3826e) this.f33554g.remove(0);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public boolean m57870b() {
        AsyncTaskC3822a asyncTaskC3822a = this.f33550c;
        if (asyncTaskC3822a != null) {
            asyncTaskC3822a.cancel(this.f33551d);
        }
        this.f33552e = true;
        return onStopCurrentWork();
    }

    /* renamed from: c */
    public void m57869c(boolean z) {
        if (this.f33550c == null) {
            this.f33550c = new AsyncTaskC3822a();
            AbstractC3830h abstractC3830h = this.f33549b;
            if (abstractC3830h != null && z) {
                abstractC3830h.mo57858d();
            }
            this.f33550c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: e */
    public void m57867e() {
        ArrayList arrayList = this.f33554g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f33550c = null;
                    ArrayList arrayList2 = this.f33554g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        m57869c(false);
                    } else if (!this.f33553f) {
                        this.f33549b.mo57859c();
                    }
                } finally {
                }
            }
        }
    }

    public boolean isStopped() {
        return this.f33552e;
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        InterfaceC3823b interfaceC3823b = this.f33548a;
        if (interfaceC3823b != null) {
            return interfaceC3823b.mo57863a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33548a = new jobJobServiceEngineC3827f(this);
            this.f33549b = null;
            return;
        }
        this.f33548a = null;
        this.f33549b = m57868d(this, new ComponentName(this, getClass()), false, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f33554g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f33553f = true;
                this.f33549b.mo57859c();
            }
        }
    }

    public abstract void onHandleWork(@NonNull Intent intent);

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (this.f33554g != null) {
            this.f33549b.mo57857e();
            synchronized (this.f33554g) {
                ArrayList arrayList = this.f33554g;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new C3825d(intent, i2));
                m57869c(true);
            }
            return 3;
        }
        return 2;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void setInterruptIfStopped(boolean z) {
        this.f33551d = z;
    }

    public static void enqueueWork(@NonNull Context context, @NonNull ComponentName componentName, int i, @NonNull Intent intent) {
        if (intent != null) {
            synchronized (f33546h) {
                AbstractC3830h m57868d = m57868d(context, componentName, true, i);
                m57868d.m57860b(i);
                m57868d.mo57861a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}