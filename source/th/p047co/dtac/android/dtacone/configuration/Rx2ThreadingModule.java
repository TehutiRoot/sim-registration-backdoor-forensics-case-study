package th.p047co.dtac.android.dtacone.configuration;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Named;
import javax.inject.Singleton;

@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.Rx2ThreadingModule */
/* loaded from: classes7.dex */
public class Rx2ThreadingModule {
    public static final String Rx2_COMPUTATION_THREAD = "Rx2comp";
    public static final String Rx2_IO_THREAD = "Rx2io";
    public static final String Rx2_MAIN_THREAD = "Rx2main";

    @Provides
    @Singleton
    @Named(Rx2_COMPUTATION_THREAD)
    public Scheduler provideCompScheduler() {
        return Schedulers.computation();
    }

    @Provides
    @Singleton
    @Named(Rx2_IO_THREAD)
    public Scheduler provideIoScheduler() {
        return Schedulers.m29798io();
    }

    @Provides
    @Singleton
    @Named(Rx2_MAIN_THREAD)
    public Scheduler provideMainThreadScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
