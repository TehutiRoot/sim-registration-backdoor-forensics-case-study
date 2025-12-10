package th.p047co.dtac.android.dtacone.manager.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import p046rx.Completable;
import p046rx.Observable;
import p046rx.Scheduler;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@Singleton
/* renamed from: th.co.dtac.android.dtacone.manager.service.RxThreadService */
/* loaded from: classes7.dex */
public class RxThreadService {

    /* renamed from: a */
    public Scheduler f85014a;

    /* renamed from: b */
    public Scheduler f85015b;

    /* renamed from: c */
    public Scheduler f85016c;

    @Inject
    public RxThreadService(@Named("main") Scheduler scheduler, @Named("io") Scheduler scheduler2, @Named("comp") Scheduler scheduler3) {
        this.f85014a = scheduler;
        this.f85015b = scheduler2;
        this.f85016c = scheduler3;
    }

    public <T> Observable.Transformer<T, T> applyAsync() {
        return new Observable.Transformer() { // from class: fC1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19176f;
                m19176f = RxThreadService.this.m19176f((Observable) obj);
                return m19176f;
            }
        };
    }

    public <T> Observable.Transformer<T, T> applyBackground() {
        return new Observable.Transformer() { // from class: bC1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19175g;
                m19175g = RxThreadService.this.m19175g((Observable) obj);
                return m19175g;
            }
        };
    }

    public Completable.Transformer applyCompletableAsync() {
        return new Completable.Transformer() { // from class: cC1
            @Override // p046rx.functions.Func1
            public final Completable call(Completable completable) {
                Completable m19174h;
                m19174h = RxThreadService.this.m19174h(completable);
                return m19174h;
            }
        };
    }

    public <T> Observable.Transformer<T, T> applyComputation() {
        return new Observable.Transformer() { // from class: dC1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19173i;
                m19173i = RxThreadService.this.m19173i((Observable) obj);
                return m19173i;
            }
        };
    }

    public <T> Observable.Transformer<T, T> applyMain() {
        return new Observable.Transformer() { // from class: eC1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable m19172j;
                m19172j = RxThreadService.this.m19172j((Observable) obj);
                return m19172j;
            }
        };
    }

    /* renamed from: f */
    public final /* synthetic */ Observable m19176f(Observable observable) {
        return observable.subscribeOn(this.f85015b).observeOn(this.f85014a);
    }

    /* renamed from: g */
    public final /* synthetic */ Observable m19175g(Observable observable) {
        return observable.subscribeOn(this.f85015b);
    }

    /* renamed from: h */
    public final /* synthetic */ Completable m19174h(Completable completable) {
        return completable.subscribeOn(this.f85015b).observeOn(this.f85014a);
    }

    /* renamed from: i */
    public final /* synthetic */ Observable m19173i(Observable observable) {
        return observable.subscribeOn(this.f85016c);
    }

    /* renamed from: j */
    public final /* synthetic */ Observable m19172j(Observable observable) {
        return observable.observeOn(this.f85014a);
    }
}
