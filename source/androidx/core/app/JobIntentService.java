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
    public static final Object f33458h = new Object();

    /* renamed from: i */
    public static final HashMap f33459i = new HashMap();

    /* renamed from: a */
    public InterfaceC3841b f33460a;

    /* renamed from: b */
    public AbstractC3848h f33461b;

    /* renamed from: c */
    public AsyncTaskC3840a f33462c;

    /* renamed from: d */
    public boolean f33463d = false;

    /* renamed from: e */
    public boolean f33464e = false;

    /* renamed from: f */
    public boolean f33465f = false;

    /* renamed from: g */
    public final ArrayList f33466g;

    /* renamed from: androidx.core.app.JobIntentService$a */
    /* loaded from: classes2.dex */
    public final class AsyncTaskC3840a extends AsyncTask {
        public AsyncTaskC3840a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                InterfaceC3844e m57921a = JobIntentService.this.m57921a();
                if (m57921a != null) {
                    JobIntentService.this.onHandleWork(m57921a.getIntent());
                    m57921a.complete();
                } else {
                    return null;
                }
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onCancelled(Void r1) {
            JobIntentService.this.m57917e();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Void r1) {
            JobIntentService.this.m57917e();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3841b {
        /* renamed from: a */
        IBinder mo57913a();

        /* renamed from: b */
        InterfaceC3844e mo57912b();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    /* loaded from: classes2.dex */
    public static final class C3842c extends AbstractC3848h {

        /* renamed from: d */
        public final Context f33468d;

        /* renamed from: e */
        public final PowerManager.WakeLock f33469e;

        /* renamed from: f */
        public final PowerManager.WakeLock f33470f;

        /* renamed from: g */
        public boolean f33471g;

        /* renamed from: h */
        public boolean f33472h;

        public C3842c(Context context, ComponentName componentName) {
            super(componentName);
            this.f33468d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f33469e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f33470f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3848h
        /* renamed from: a */
        public void mo57911a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f33483a);
            if (this.f33468d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f33471g) {
                            this.f33471g = true;
                            if (!this.f33472h) {
                                this.f33469e.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3848h
        /* renamed from: c */
        public void mo57909c() {
            synchronized (this) {
                try {
                    if (this.f33472h) {
                        if (this.f33471g) {
                            this.f33469e.acquire(60000L);
                        }
                        this.f33472h = false;
                        this.f33470f.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3848h
        /* renamed from: d */
        public void mo57908d() {
            synchronized (this) {
                try {
                    if (!this.f33472h) {
                        this.f33472h = true;
                        this.f33470f.acquire(600000L);
                        this.f33469e.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3848h
        /* renamed from: e */
        public void mo57907e() {
            synchronized (this) {
                this.f33471g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    /* loaded from: classes2.dex */
    public final class C3843d implements InterfaceC3844e {

        /* renamed from: a */
        public final Intent f33473a;

        /* renamed from: b */
        public final int f33474b;

        public C3843d(Intent intent, int i) {
            this.f33473a = intent;
            this.f33474b = i;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC3844e
        public void complete() {
            JobIntentService.this.stopSelf(this.f33474b);
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC3844e
        public Intent getIntent() {
            return this.f33473a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC3844e {
        void complete();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class jobJobServiceEngineC3845f extends JobServiceEngine implements InterfaceC3841b {

        /* renamed from: a */
        public final JobIntentService f33476a;

        /* renamed from: b */
        public final Object f33477b;

        /* renamed from: c */
        public JobParameters f33478c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        /* loaded from: classes2.dex */
        public final class C3846a implements InterfaceC3844e {

            /* renamed from: a */
            public final JobWorkItem f33479a;

            public C3846a(JobWorkItem jobWorkItem) {
                this.f33479a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC3844e
            public void complete() {
                synchronized (jobJobServiceEngineC3845f.this.f33477b) {
                    try {
                        JobParameters jobParameters = jobJobServiceEngineC3845f.this.f33478c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f33479a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC3844e
            public Intent getIntent() {
                Intent intent;
                intent = this.f33479a.getIntent();
                return intent;
            }
        }

        public jobJobServiceEngineC3845f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f33477b = new Object();
            this.f33476a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC3841b
        /* renamed from: a */
        public IBinder mo57913a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC3841b
        /* renamed from: b */
        public InterfaceC3844e mo57912b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f33477b) {
                try {
                    JobParameters jobParameters = this.f33478c;
                    if (jobParameters != null) {
                        dequeueWork = jobParameters.dequeueWork();
                        if (dequeueWork != null) {
                            intent = dequeueWork.getIntent();
                            intent.setExtrasClassLoader(this.f33476a.getClassLoader());
                            return new C3846a(dequeueWork);
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
            this.f33478c = jobParameters;
            this.f33476a.m57919c(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean m57920b = this.f33476a.m57920b();
            synchronized (this.f33477b) {
                this.f33478c = null;
            }
            return m57920b;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    /* loaded from: classes2.dex */
    public static final class C3847g extends AbstractC3848h {

        /* renamed from: d */
        public final JobInfo f33481d;

        /* renamed from: e */
        public final JobScheduler f33482e;

        public C3847g(Context context, ComponentName componentName, int i) {
            super(componentName);
            m57910b(i);
            this.f33481d = new JobInfo.Builder(i, this.f33483a).setOverrideDeadline(0L).build();
            this.f33482e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.AbstractC3848h
        /* renamed from: a */
        public void mo57911a(Intent intent) {
            this.f33482e.enqueue(this.f33481d, AbstractC18303Qg0.m66542a(intent));
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC3848h {

        /* renamed from: a */
        public final ComponentName f33483a;

        /* renamed from: b */
        public boolean f33484b;

        /* renamed from: c */
        public int f33485c;

        public AbstractC3848h(ComponentName componentName) {
            this.f33483a = componentName;
        }

        /* renamed from: a */
        public abstract void mo57911a(Intent intent);

        /* renamed from: b */
        public void m57910b(int i) {
            if (!this.f33484b) {
                this.f33484b = true;
                this.f33485c = i;
            } else if (this.f33485c == i) {
            } else {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f33485c);
            }
        }

        /* renamed from: c */
        public void mo57909c() {
        }

        /* renamed from: d */
        public void mo57908d() {
        }

        /* renamed from: e */
        public void mo57907e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33466g = null;
        } else {
            this.f33466g = new ArrayList();
        }
    }

    /* renamed from: d */
    public static AbstractC3848h m57918d(Context context, ComponentName componentName, boolean z, int i) {
        AbstractC3848h c3842c;
        HashMap hashMap = f33459i;
        AbstractC3848h abstractC3848h = (AbstractC3848h) hashMap.get(componentName);
        if (abstractC3848h == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z) {
                    c3842c = new C3847g(context, componentName, i);
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                c3842c = new C3842c(context, componentName);
            }
            abstractC3848h = c3842c;
            hashMap.put(componentName, abstractC3848h);
        }
        return abstractC3848h;
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Class<?> cls, int i, @NonNull Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    /* renamed from: a */
    public InterfaceC3844e m57921a() {
        InterfaceC3841b interfaceC3841b = this.f33460a;
        if (interfaceC3841b != null) {
            return interfaceC3841b.mo57912b();
        }
        synchronized (this.f33466g) {
            try {
                if (this.f33466g.size() > 0) {
                    return (InterfaceC3844e) this.f33466g.remove(0);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public boolean m57920b() {
        AsyncTaskC3840a asyncTaskC3840a = this.f33462c;
        if (asyncTaskC3840a != null) {
            asyncTaskC3840a.cancel(this.f33463d);
        }
        this.f33464e = true;
        return onStopCurrentWork();
    }

    /* renamed from: c */
    public void m57919c(boolean z) {
        if (this.f33462c == null) {
            this.f33462c = new AsyncTaskC3840a();
            AbstractC3848h abstractC3848h = this.f33461b;
            if (abstractC3848h != null && z) {
                abstractC3848h.mo57908d();
            }
            this.f33462c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: e */
    public void m57917e() {
        ArrayList arrayList = this.f33466g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f33462c = null;
                    ArrayList arrayList2 = this.f33466g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        m57919c(false);
                    } else if (!this.f33465f) {
                        this.f33461b.mo57909c();
                    }
                } finally {
                }
            }
        }
    }

    public boolean isStopped() {
        return this.f33464e;
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        InterfaceC3841b interfaceC3841b = this.f33460a;
        if (interfaceC3841b != null) {
            return interfaceC3841b.mo57913a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33460a = new jobJobServiceEngineC3845f(this);
            this.f33461b = null;
            return;
        }
        this.f33460a = null;
        this.f33461b = m57918d(this, new ComponentName(this, getClass()), false, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f33466g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f33465f = true;
                this.f33461b.mo57909c();
            }
        }
    }

    public abstract void onHandleWork(@NonNull Intent intent);

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (this.f33466g != null) {
            this.f33461b.mo57907e();
            synchronized (this.f33466g) {
                ArrayList arrayList = this.f33466g;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new C3843d(intent, i2));
                m57919c(true);
            }
            return 3;
        }
        return 2;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void setInterruptIfStopped(boolean z) {
        this.f33463d = z;
    }

    public static void enqueueWork(@NonNull Context context, @NonNull ComponentName componentName, int i, @NonNull Intent intent) {
        if (intent != null) {
            synchronized (f33458h) {
                AbstractC3848h m57918d = m57918d(context, componentName, true, i);
                m57918d.m57910b(i);
                m57918d.mo57911a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}
