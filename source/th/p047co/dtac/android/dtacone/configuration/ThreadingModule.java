package th.p047co.dtac.android.dtacone.configuration;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import p046rx.Scheduler;
import p046rx.android.schedulers.AndroidSchedulers;
import p046rx.schedulers.Schedulers;

@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.ThreadingModule */
/* loaded from: classes7.dex */
public class ThreadingModule {
    public static final String COMPUTATION_THREAD = "comp";
    public static final String IO_THREAD = "io";
    public static final String MAIN_THREAD = "main";

    @Provides
    @Singleton
    @Named(COMPUTATION_THREAD)
    public Scheduler provideCompScheduler() {
        return Schedulers.computation();
    }

    @Provides
    @Singleton
    @Named(IO_THREAD)
    public Scheduler provideIoScheduler() {
        return Schedulers.m22755io();
    }

    @Provides
    @Singleton
    @Named(MAIN_THREAD)
    public Scheduler provideMainThreadScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
