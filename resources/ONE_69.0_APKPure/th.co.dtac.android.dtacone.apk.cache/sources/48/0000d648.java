package io.realm.p021rx;

import android.os.Looper;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposables;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.ObjectChangeSet;
import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: io.realm.rx.RealmObservableFactory */
/* loaded from: classes5.dex */
public class RealmObservableFactory implements RxObservableFactory {

    /* renamed from: e */
    public static final BackpressureStrategy f66989e = BackpressureStrategy.LATEST;

    /* renamed from: a */
    public final boolean f66990a;

    /* renamed from: b */
    public ThreadLocal f66991b = new C11445i();

    /* renamed from: c */
    public ThreadLocal f66992c = new C11446j();

    /* renamed from: d */
    public ThreadLocal f66993d = new C11447k();

    /* renamed from: io.realm.rx.RealmObservableFactory$a */
    /* loaded from: classes5.dex */
    public class C11421a implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmList f66994a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66995b;

        /* renamed from: io.realm.rx.RealmObservableFactory$a$a */
        /* loaded from: classes5.dex */
        public class C11422a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f66997a;

            public C11422a(FlowableEmitter flowableEmitter) {
                this.f66997a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmList realmList) {
                if (!realmList.isValid()) {
                    this.f66997a.onComplete();
                } else if (!this.f66997a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f66997a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmList = realmList.freeze();
                    }
                    flowableEmitter.onNext(realmList);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$a$b */
        /* loaded from: classes5.dex */
        public class RunnableC11423b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f66999a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67000b;

            public RunnableC11423b(Realm realm, RealmChangeListener realmChangeListener) {
                this.f66999a = realm;
                this.f67000b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f66999a.isClosed()) {
                    C11421a.this.f66994a.removeChangeListener(this.f67000b);
                    this.f66999a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66992c.get()).m29676b(C11421a.this.f66994a);
            }
        }

        public C11421a(RealmList realmList, RealmConfiguration realmConfiguration) {
            this.f66994a = realmList;
            this.f66995b = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmList realmList;
            if (!this.f66994a.isValid()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f66995b);
            ((C11466r) RealmObservableFactory.this.f66992c.get()).m29677a(this.f66994a);
            C11422a c11422a = new C11422a(flowableEmitter);
            this.f66994a.addChangeListener(c11422a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11423b(realm, c11422a)));
            if (RealmObservableFactory.this.f66990a) {
                realmList = this.f66994a.freeze();
            } else {
                realmList = this.f66994a;
            }
            flowableEmitter.onNext(realmList);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$b */
    /* loaded from: classes5.dex */
    public class C11424b implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmList f67002a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67003b;

        /* renamed from: io.realm.rx.RealmObservableFactory$b$a */
        /* loaded from: classes5.dex */
        public class C11425a implements OrderedRealmCollectionChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f67005a;

            public C11425a(ObservableEmitter observableEmitter) {
                this.f67005a = observableEmitter;
            }

            @Override // io.realm.OrderedRealmCollectionChangeListener
            /* renamed from: a */
            public void onChange(RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!realmList.isValid()) {
                    this.f67005a.onComplete();
                } else if (!this.f67005a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f67005a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmList = realmList.freeze();
                    }
                    observableEmitter.onNext(new CollectionChange(realmList, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$b$b */
        /* loaded from: classes5.dex */
        public class RunnableC11426b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f67007a;

            /* renamed from: b */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f67008b;

            public RunnableC11426b(Realm realm, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
                this.f67007a = realm;
                this.f67008b = orderedRealmCollectionChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67007a.isClosed()) {
                    C11424b.this.f67002a.removeChangeListener(this.f67008b);
                    this.f67007a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66992c.get()).m29676b(C11424b.this.f67002a);
            }
        }

        public C11424b(RealmList realmList, RealmConfiguration realmConfiguration) {
            this.f67002a = realmList;
            this.f67003b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmList realmList;
            if (!this.f67002a.isValid()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f67003b);
            ((C11466r) RealmObservableFactory.this.f66992c.get()).m29677a(this.f67002a);
            C11425a c11425a = new C11425a(observableEmitter);
            this.f67002a.addChangeListener(c11425a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11426b(realm, c11425a)));
            if (RealmObservableFactory.this.f66990a) {
                realmList = this.f67002a.freeze();
            } else {
                realmList = this.f67002a;
            }
            observableEmitter.onNext(new CollectionChange(realmList, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$c */
    /* loaded from: classes5.dex */
    public class C11427c implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmList f67010a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67011b;

        /* renamed from: io.realm.rx.RealmObservableFactory$c$a */
        /* loaded from: classes5.dex */
        public class C11428a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67013a;

            public C11428a(FlowableEmitter flowableEmitter) {
                this.f67013a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmList realmList) {
                if (!realmList.isValid()) {
                    this.f67013a.onComplete();
                } else if (!this.f67013a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67013a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmList = realmList.freeze();
                    }
                    flowableEmitter.onNext(realmList);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$c$b */
        /* loaded from: classes5.dex */
        public class RunnableC11429b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67015a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67016b;

            public RunnableC11429b(DynamicRealm dynamicRealm, RealmChangeListener realmChangeListener) {
                this.f67015a = dynamicRealm;
                this.f67016b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67015a.isClosed()) {
                    C11427c.this.f67010a.removeChangeListener(this.f67016b);
                    this.f67015a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66992c.get()).m29676b(C11427c.this.f67010a);
            }
        }

        public C11427c(RealmList realmList, RealmConfiguration realmConfiguration) {
            this.f67010a = realmList;
            this.f67011b = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmList realmList;
            if (!this.f67010a.isValid()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67011b);
            ((C11466r) RealmObservableFactory.this.f66992c.get()).m29677a(this.f67010a);
            C11428a c11428a = new C11428a(flowableEmitter);
            this.f67010a.addChangeListener(c11428a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11429b(dynamicRealm, c11428a)));
            if (RealmObservableFactory.this.f66990a) {
                realmList = this.f67010a.freeze();
            } else {
                realmList = this.f67010a;
            }
            flowableEmitter.onNext(realmList);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$d */
    /* loaded from: classes5.dex */
    public class C11430d implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmList f67018a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67019b;

        /* renamed from: io.realm.rx.RealmObservableFactory$d$a */
        /* loaded from: classes5.dex */
        public class C11431a implements OrderedRealmCollectionChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f67021a;

            public C11431a(ObservableEmitter observableEmitter) {
                this.f67021a = observableEmitter;
            }

            @Override // io.realm.OrderedRealmCollectionChangeListener
            /* renamed from: a */
            public void onChange(RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!realmList.isValid()) {
                    this.f67021a.onComplete();
                } else if (!this.f67021a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f67021a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmList = realmList.freeze();
                    }
                    observableEmitter.onNext(new CollectionChange(realmList, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$d$b */
        /* loaded from: classes5.dex */
        public class RunnableC11432b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67023a;

            /* renamed from: b */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f67024b;

            public RunnableC11432b(DynamicRealm dynamicRealm, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
                this.f67023a = dynamicRealm;
                this.f67024b = orderedRealmCollectionChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67023a.isClosed()) {
                    C11430d.this.f67018a.removeChangeListener(this.f67024b);
                    this.f67023a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66992c.get()).m29676b(C11430d.this.f67018a);
            }
        }

        public C11430d(RealmList realmList, RealmConfiguration realmConfiguration) {
            this.f67018a = realmList;
            this.f67019b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmList realmList;
            if (!this.f67018a.isValid()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67019b);
            ((C11466r) RealmObservableFactory.this.f66992c.get()).m29677a(this.f67018a);
            C11431a c11431a = new C11431a(observableEmitter);
            this.f67018a.addChangeListener(c11431a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11432b(dynamicRealm, c11431a)));
            if (RealmObservableFactory.this.f66990a) {
                realmList = this.f67018a.freeze();
            } else {
                realmList = this.f67018a;
            }
            observableEmitter.onNext(new CollectionChange(realmList, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$e */
    /* loaded from: classes5.dex */
    public class C11433e implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Realm f67026a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67027b;

        /* renamed from: c */
        public final /* synthetic */ RealmModel f67028c;

        /* renamed from: io.realm.rx.RealmObservableFactory$e$a */
        /* loaded from: classes5.dex */
        public class C11434a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67030a;

            public C11434a(FlowableEmitter flowableEmitter) {
                this.f67030a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmModel realmModel) {
                if (!this.f67030a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67030a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmModel = RealmObject.freeze(realmModel);
                    }
                    flowableEmitter.onNext(realmModel);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$e$b */
        /* loaded from: classes5.dex */
        public class RunnableC11435b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f67032a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67033b;

            public RunnableC11435b(Realm realm, RealmChangeListener realmChangeListener) {
                this.f67032a = realm;
                this.f67033b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67032a.isClosed()) {
                    RealmObject.removeChangeListener(C11433e.this.f67028c, this.f67033b);
                    this.f67032a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66993d.get()).m29676b(C11433e.this.f67028c);
            }
        }

        public C11433e(Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel) {
            this.f67026a = realm;
            this.f67027b = realmConfiguration;
            this.f67028c = realmModel;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmModel realmModel;
            if (this.f67026a.isClosed()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f67027b);
            ((C11466r) RealmObservableFactory.this.f66993d.get()).m29677a(this.f67028c);
            C11434a c11434a = new C11434a(flowableEmitter);
            RealmObject.addChangeListener(this.f67028c, c11434a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11435b(realm, c11434a)));
            if (RealmObservableFactory.this.f66990a) {
                realmModel = RealmObject.freeze(this.f67028c);
            } else {
                realmModel = this.f67028c;
            }
            flowableEmitter.onNext(realmModel);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$f */
    /* loaded from: classes5.dex */
    public class C11436f implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmModel f67035a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67036b;

        /* renamed from: io.realm.rx.RealmObservableFactory$f$a */
        /* loaded from: classes5.dex */
        public class C11437a implements RealmObjectChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f67038a;

            public C11437a(ObservableEmitter observableEmitter) {
                this.f67038a = observableEmitter;
            }

            @Override // io.realm.RealmObjectChangeListener
            public void onChange(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
                if (!this.f67038a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f67038a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmModel = RealmObject.freeze(realmModel);
                    }
                    observableEmitter.onNext(new ObjectChange(realmModel, objectChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$f$b */
        /* loaded from: classes5.dex */
        public class RunnableC11438b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f67040a;

            /* renamed from: b */
            public final /* synthetic */ RealmObjectChangeListener f67041b;

            public RunnableC11438b(Realm realm, RealmObjectChangeListener realmObjectChangeListener) {
                this.f67040a = realm;
                this.f67041b = realmObjectChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67040a.isClosed()) {
                    RealmObject.removeChangeListener(C11436f.this.f67035a, this.f67041b);
                    this.f67040a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66993d.get()).m29676b(C11436f.this.f67035a);
            }
        }

        public C11436f(RealmModel realmModel, RealmConfiguration realmConfiguration) {
            this.f67035a = realmModel;
            this.f67036b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmModel realmModel;
            if (!RealmObject.isValid(this.f67035a)) {
                return;
            }
            Realm realm = Realm.getInstance(this.f67036b);
            ((C11466r) RealmObservableFactory.this.f66993d.get()).m29677a(this.f67035a);
            C11437a c11437a = new C11437a(observableEmitter);
            RealmObject.addChangeListener(this.f67035a, c11437a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11438b(realm, c11437a)));
            if (RealmObservableFactory.this.f66990a) {
                realmModel = RealmObject.freeze(this.f67035a);
            } else {
                realmModel = this.f67035a;
            }
            observableEmitter.onNext(new ObjectChange(realmModel, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$g */
    /* loaded from: classes5.dex */
    public class C11439g implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ DynamicRealm f67043a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67044b;

        /* renamed from: c */
        public final /* synthetic */ DynamicRealmObject f67045c;

        /* renamed from: io.realm.rx.RealmObservableFactory$g$a */
        /* loaded from: classes5.dex */
        public class C11440a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67047a;

            public C11440a(FlowableEmitter flowableEmitter) {
                this.f67047a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(DynamicRealmObject dynamicRealmObject) {
                if (!this.f67047a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67047a;
                    if (RealmObservableFactory.this.f66990a) {
                        dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(dynamicRealmObject);
                    }
                    flowableEmitter.onNext(dynamicRealmObject);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$g$b */
        /* loaded from: classes5.dex */
        public class RunnableC11441b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67049a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67050b;

            public RunnableC11441b(DynamicRealm dynamicRealm, RealmChangeListener realmChangeListener) {
                this.f67049a = dynamicRealm;
                this.f67050b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67049a.isClosed()) {
                    RealmObject.removeChangeListener(C11439g.this.f67045c, this.f67050b);
                    this.f67049a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66993d.get()).m29676b(C11439g.this.f67045c);
            }
        }

        public C11439g(DynamicRealm dynamicRealm, RealmConfiguration realmConfiguration, DynamicRealmObject dynamicRealmObject) {
            this.f67043a = dynamicRealm;
            this.f67044b = realmConfiguration;
            this.f67045c = dynamicRealmObject;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            DynamicRealmObject dynamicRealmObject;
            if (this.f67043a.isClosed()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67044b);
            ((C11466r) RealmObservableFactory.this.f66993d.get()).m29677a(this.f67045c);
            C11440a c11440a = new C11440a(flowableEmitter);
            RealmObject.addChangeListener(this.f67045c, c11440a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11441b(dynamicRealm, c11440a)));
            if (RealmObservableFactory.this.f66990a) {
                dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(this.f67045c);
            } else {
                dynamicRealmObject = this.f67045c;
            }
            flowableEmitter.onNext(dynamicRealmObject);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$h */
    /* loaded from: classes5.dex */
    public class C11442h implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ DynamicRealmObject f67052a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67053b;

        /* renamed from: io.realm.rx.RealmObservableFactory$h$a */
        /* loaded from: classes5.dex */
        public class C11443a implements RealmObjectChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f67055a;

            public C11443a(ObservableEmitter observableEmitter) {
                this.f67055a = observableEmitter;
            }

            @Override // io.realm.RealmObjectChangeListener
            /* renamed from: a */
            public void onChange(DynamicRealmObject dynamicRealmObject, ObjectChangeSet objectChangeSet) {
                if (!this.f67055a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f67055a;
                    if (RealmObservableFactory.this.f66990a) {
                        dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(dynamicRealmObject);
                    }
                    observableEmitter.onNext(new ObjectChange(dynamicRealmObject, objectChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$h$b */
        /* loaded from: classes5.dex */
        public class RunnableC11444b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67057a;

            /* renamed from: b */
            public final /* synthetic */ RealmObjectChangeListener f67058b;

            public RunnableC11444b(DynamicRealm dynamicRealm, RealmObjectChangeListener realmObjectChangeListener) {
                this.f67057a = dynamicRealm;
                this.f67058b = realmObjectChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67057a.isClosed()) {
                    RealmObject.removeChangeListener(C11442h.this.f67052a, this.f67058b);
                    this.f67057a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66993d.get()).m29676b(C11442h.this.f67052a);
            }
        }

        public C11442h(DynamicRealmObject dynamicRealmObject, RealmConfiguration realmConfiguration) {
            this.f67052a = dynamicRealmObject;
            this.f67053b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            DynamicRealmObject dynamicRealmObject;
            if (!RealmObject.isValid(this.f67052a)) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67053b);
            ((C11466r) RealmObservableFactory.this.f66993d.get()).m29677a(this.f67052a);
            C11443a c11443a = new C11443a(observableEmitter);
            this.f67052a.addChangeListener(c11443a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11444b(dynamicRealm, c11443a)));
            if (RealmObservableFactory.this.f66990a) {
                dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(this.f67052a);
            } else {
                dynamicRealmObject = this.f67052a;
            }
            observableEmitter.onNext(new ObjectChange(dynamicRealmObject, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$i */
    /* loaded from: classes5.dex */
    public class C11445i extends ThreadLocal {
        public C11445i() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public C11466r initialValue() {
            return new C11466r(null);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$j */
    /* loaded from: classes5.dex */
    public class C11446j extends ThreadLocal {
        public C11446j() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public C11466r initialValue() {
            return new C11466r(null);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$k */
    /* loaded from: classes5.dex */
    public class C11447k extends ThreadLocal {
        public C11447k() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public C11466r initialValue() {
            return new C11466r(null);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$l */
    /* loaded from: classes5.dex */
    public class C11448l implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmConfiguration f67063a;

        /* renamed from: io.realm.rx.RealmObservableFactory$l$a */
        /* loaded from: classes5.dex */
        public class C11449a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67065a;

            public C11449a(FlowableEmitter flowableEmitter) {
                this.f67065a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(Realm realm) {
                if (!this.f67065a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67065a;
                    if (RealmObservableFactory.this.f66990a) {
                        realm = realm.freeze();
                    }
                    flowableEmitter.onNext(realm);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$l$b */
        /* loaded from: classes5.dex */
        public class RunnableC11450b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f67067a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67068b;

            public RunnableC11450b(Realm realm, RealmChangeListener realmChangeListener) {
                this.f67067a = realm;
                this.f67068b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67067a.isClosed()) {
                    this.f67067a.removeChangeListener(this.f67068b);
                    this.f67067a.close();
                }
            }
        }

        public C11448l(RealmConfiguration realmConfiguration) {
            this.f67063a = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            Realm realm = Realm.getInstance(this.f67063a);
            C11449a c11449a = new C11449a(flowableEmitter);
            realm.addChangeListener(c11449a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11450b(realm, c11449a)));
            if (RealmObservableFactory.this.f66990a) {
                realm = realm.freeze();
            }
            flowableEmitter.onNext(realm);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$m */
    /* loaded from: classes5.dex */
    public class C11451m implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmConfiguration f67070a;

        /* renamed from: io.realm.rx.RealmObservableFactory$m$a */
        /* loaded from: classes5.dex */
        public class C11452a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67072a;

            public C11452a(FlowableEmitter flowableEmitter) {
                this.f67072a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(DynamicRealm dynamicRealm) {
                if (!this.f67072a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67072a;
                    if (RealmObservableFactory.this.f66990a) {
                        dynamicRealm = dynamicRealm.freeze();
                    }
                    flowableEmitter.onNext(dynamicRealm);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$m$b */
        /* loaded from: classes5.dex */
        public class RunnableC11453b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67074a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67075b;

            public RunnableC11453b(DynamicRealm dynamicRealm, RealmChangeListener realmChangeListener) {
                this.f67074a = dynamicRealm;
                this.f67075b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67074a.isClosed()) {
                    this.f67074a.removeChangeListener(this.f67075b);
                    this.f67074a.close();
                }
            }
        }

        public C11451m(RealmConfiguration realmConfiguration) {
            this.f67070a = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67070a);
            C11452a c11452a = new C11452a(flowableEmitter);
            dynamicRealm.addChangeListener(c11452a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11453b(dynamicRealm, c11452a)));
            if (RealmObservableFactory.this.f66990a) {
                dynamicRealm = dynamicRealm.freeze();
            }
            flowableEmitter.onNext(dynamicRealm);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$n */
    /* loaded from: classes5.dex */
    public class C11454n implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmResults f67077a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67078b;

        /* renamed from: io.realm.rx.RealmObservableFactory$n$a */
        /* loaded from: classes5.dex */
        public class C11455a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67080a;

            public C11455a(FlowableEmitter flowableEmitter) {
                this.f67080a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmResults realmResults) {
                if (!this.f67080a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67080a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmResults = realmResults.freeze();
                    }
                    flowableEmitter.onNext(realmResults);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$n$b */
        /* loaded from: classes5.dex */
        public class RunnableC11456b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f67082a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67083b;

            public RunnableC11456b(Realm realm, RealmChangeListener realmChangeListener) {
                this.f67082a = realm;
                this.f67083b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67082a.isClosed()) {
                    C11454n.this.f67077a.removeChangeListener(this.f67083b);
                    this.f67082a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66991b.get()).m29676b(C11454n.this.f67077a);
            }
        }

        public C11454n(RealmResults realmResults, RealmConfiguration realmConfiguration) {
            this.f67077a = realmResults;
            this.f67078b = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmResults realmResults;
            if (!this.f67077a.isValid()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f67078b);
            ((C11466r) RealmObservableFactory.this.f66991b.get()).m29677a(this.f67077a);
            C11455a c11455a = new C11455a(flowableEmitter);
            this.f67077a.addChangeListener(c11455a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11456b(realm, c11455a)));
            if (RealmObservableFactory.this.f66990a) {
                realmResults = this.f67077a.freeze();
            } else {
                realmResults = this.f67077a;
            }
            flowableEmitter.onNext(realmResults);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$o */
    /* loaded from: classes5.dex */
    public class C11457o implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmResults f67085a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67086b;

        /* renamed from: io.realm.rx.RealmObservableFactory$o$a */
        /* loaded from: classes5.dex */
        public class C11458a implements OrderedRealmCollectionChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f67088a;

            public C11458a(ObservableEmitter observableEmitter) {
                this.f67088a = observableEmitter;
            }

            @Override // io.realm.OrderedRealmCollectionChangeListener
            /* renamed from: a */
            public void onChange(RealmResults realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                RealmResults realmResults2;
                if (!this.f67088a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f67088a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmResults2 = C11457o.this.f67085a.freeze();
                    } else {
                        realmResults2 = C11457o.this.f67085a;
                    }
                    observableEmitter.onNext(new CollectionChange(realmResults2, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$o$b */
        /* loaded from: classes5.dex */
        public class RunnableC11459b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f67090a;

            /* renamed from: b */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f67091b;

            public RunnableC11459b(Realm realm, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
                this.f67090a = realm;
                this.f67091b = orderedRealmCollectionChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67090a.isClosed()) {
                    C11457o.this.f67085a.removeChangeListener(this.f67091b);
                    this.f67090a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66991b.get()).m29676b(C11457o.this.f67085a);
            }
        }

        public C11457o(RealmResults realmResults, RealmConfiguration realmConfiguration) {
            this.f67085a = realmResults;
            this.f67086b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmResults realmResults;
            if (!this.f67085a.isValid()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f67086b);
            ((C11466r) RealmObservableFactory.this.f66991b.get()).m29677a(this.f67085a);
            C11458a c11458a = new C11458a(observableEmitter);
            this.f67085a.addChangeListener(c11458a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11459b(realm, c11458a)));
            if (RealmObservableFactory.this.f66990a) {
                realmResults = this.f67085a.freeze();
            } else {
                realmResults = this.f67085a;
            }
            observableEmitter.onNext(new CollectionChange(realmResults, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$p */
    /* loaded from: classes5.dex */
    public class C11460p implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmResults f67093a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67094b;

        /* renamed from: io.realm.rx.RealmObservableFactory$p$a */
        /* loaded from: classes5.dex */
        public class C11461a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67096a;

            public C11461a(FlowableEmitter flowableEmitter) {
                this.f67096a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmResults realmResults) {
                if (!this.f67096a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67096a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmResults = realmResults.freeze();
                    }
                    flowableEmitter.onNext(realmResults);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$p$b */
        /* loaded from: classes5.dex */
        public class RunnableC11462b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67098a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67099b;

            public RunnableC11462b(DynamicRealm dynamicRealm, RealmChangeListener realmChangeListener) {
                this.f67098a = dynamicRealm;
                this.f67099b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67098a.isClosed()) {
                    C11460p.this.f67093a.removeChangeListener(this.f67099b);
                    this.f67098a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66991b.get()).m29676b(C11460p.this.f67093a);
            }
        }

        public C11460p(RealmResults realmResults, RealmConfiguration realmConfiguration) {
            this.f67093a = realmResults;
            this.f67094b = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmResults realmResults;
            if (!this.f67093a.isValid()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67094b);
            ((C11466r) RealmObservableFactory.this.f66991b.get()).m29677a(this.f67093a);
            C11461a c11461a = new C11461a(flowableEmitter);
            this.f67093a.addChangeListener(c11461a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11462b(dynamicRealm, c11461a)));
            if (RealmObservableFactory.this.f66990a) {
                realmResults = this.f67093a.freeze();
            } else {
                realmResults = this.f67093a;
            }
            flowableEmitter.onNext(realmResults);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$q */
    /* loaded from: classes5.dex */
    public class C11463q implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmResults f67101a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67102b;

        /* renamed from: io.realm.rx.RealmObservableFactory$q$a */
        /* loaded from: classes5.dex */
        public class C11464a implements OrderedRealmCollectionChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f67104a;

            public C11464a(ObservableEmitter observableEmitter) {
                this.f67104a = observableEmitter;
            }

            @Override // io.realm.OrderedRealmCollectionChangeListener
            /* renamed from: a */
            public void onChange(RealmResults realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!this.f67104a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f67104a;
                    if (RealmObservableFactory.this.f66990a) {
                        realmResults = realmResults.freeze();
                    }
                    observableEmitter.onNext(new CollectionChange(realmResults, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$q$b */
        /* loaded from: classes5.dex */
        public class RunnableC11465b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67106a;

            /* renamed from: b */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f67107b;

            public RunnableC11465b(DynamicRealm dynamicRealm, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
                this.f67106a = dynamicRealm;
                this.f67107b = orderedRealmCollectionChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67106a.isClosed()) {
                    C11463q.this.f67101a.removeChangeListener(this.f67107b);
                    this.f67106a.close();
                }
                ((C11466r) RealmObservableFactory.this.f66991b.get()).m29676b(C11463q.this.f67101a);
            }
        }

        public C11463q(RealmResults realmResults, RealmConfiguration realmConfiguration) {
            this.f67101a = realmResults;
            this.f67102b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmResults realmResults;
            if (!this.f67101a.isValid()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67102b);
            ((C11466r) RealmObservableFactory.this.f66991b.get()).m29677a(this.f67101a);
            C11464a c11464a = new C11464a(observableEmitter);
            this.f67101a.addChangeListener(c11464a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11465b(dynamicRealm, c11464a)));
            if (RealmObservableFactory.this.f66990a) {
                realmResults = this.f67101a.freeze();
            } else {
                realmResults = this.f67101a;
            }
            observableEmitter.onNext(new CollectionChange(realmResults, null));
        }
    }

    public RealmObservableFactory(boolean z) {
        this.f66990a = z;
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Observable<CollectionChange<RealmResults<E>>> changesetsFrom(Realm realm, RealmResults<E> realmResults) {
        if (realm.isFrozen()) {
            return Observable.just(new CollectionChange(realmResults, null));
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Observable.create(new C11457o(realmResults, configuration)).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    /* renamed from: e */
    public final Scheduler m29694e() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return AndroidSchedulers.from(myLooper);
        }
        throw new IllegalStateException("No looper found");
    }

    public boolean equals(Object obj) {
        return obj instanceof RealmObservableFactory;
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public Flowable<Realm> from(Realm realm) {
        if (realm.isFrozen()) {
            return Flowable.just(realm);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Flowable.create(new C11448l(configuration), f66989e).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    public int hashCode() {
        return 37;
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$r */
    /* loaded from: classes5.dex */
    public static class C11466r {

        /* renamed from: a */
        public final Map f67109a;

        public C11466r() {
            this.f67109a = new IdentityHashMap();
        }

        /* renamed from: a */
        public void m29677a(Object obj) {
            Integer num = (Integer) this.f67109a.get(obj);
            if (num == null) {
                this.f67109a.put(obj, 1);
            } else {
                this.f67109a.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }

        /* renamed from: b */
        public void m29676b(Object obj) {
            Integer num = (Integer) this.f67109a.get(obj);
            if (num != null) {
                if (num.intValue() > 1) {
                    this.f67109a.put(obj, Integer.valueOf(num.intValue() - 1));
                    return;
                } else if (num.intValue() == 1) {
                    this.f67109a.remove(obj);
                    return;
                } else {
                    throw new IllegalStateException("Invalid reference count: " + num);
                }
            }
            throw new IllegalStateException("Object does not have any references: " + obj);
        }

        public /* synthetic */ C11466r(C11445i c11445i) {
            this();
        }
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Observable<CollectionChange<RealmResults<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmResults<E> realmResults) {
        if (dynamicRealm.isFrozen()) {
            return Observable.just(new CollectionChange(realmResults, null));
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Observable.create(new C11463q(realmResults, configuration)).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public Flowable<DynamicRealm> from(DynamicRealm dynamicRealm) {
        if (dynamicRealm.isFrozen()) {
            return Flowable.just(dynamicRealm);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Flowable.create(new C11451m(configuration), f66989e).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Observable<CollectionChange<RealmList<E>>> changesetsFrom(Realm realm, RealmList<E> realmList) {
        if (realm.isFrozen()) {
            return Observable.just(new CollectionChange(realmList, null));
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Observable.create(new C11424b(realmList, configuration)).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Flowable<RealmResults<E>> from(Realm realm, RealmResults<E> realmResults) {
        if (realm.isFrozen()) {
            return Flowable.just(realmResults);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Flowable.create(new C11454n(realmResults, configuration), f66989e).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Observable<CollectionChange<RealmList<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmList<E> realmList) {
        if (dynamicRealm.isFrozen()) {
            return Observable.just(new CollectionChange(realmList, null));
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Observable.create(new C11430d(realmList, configuration)).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Flowable<RealmResults<E>> from(DynamicRealm dynamicRealm, RealmResults<E> realmResults) {
        if (dynamicRealm.isFrozen()) {
            return Flowable.just(realmResults);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Flowable.create(new C11460p(realmResults, configuration), f66989e).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E extends RealmModel> Observable<ObjectChange<E>> changesetsFrom(Realm realm, E e) {
        if (realm.isFrozen()) {
            return Observable.just(new ObjectChange(e, null));
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Observable.create(new C11436f(e, configuration)).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Flowable<RealmList<E>> from(Realm realm, RealmList<E> realmList) {
        if (realm.isFrozen()) {
            return Flowable.just(realmList);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Flowable.create(new C11421a(realmList, configuration), f66989e).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public Observable<ObjectChange<DynamicRealmObject>> changesetsFrom(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealm.isFrozen()) {
            return Observable.just(new ObjectChange(dynamicRealmObject, null));
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Observable.create(new C11442h(dynamicRealmObject, configuration)).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Flowable<RealmList<E>> from(DynamicRealm dynamicRealm, RealmList<E> realmList) {
        if (dynamicRealm.isFrozen()) {
            return Flowable.just(realmList);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Flowable.create(new C11427c(realmList, configuration), f66989e).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E extends RealmModel> Flowable<E> from(Realm realm, E e) {
        if (realm.isFrozen()) {
            return Flowable.just(e);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Flowable.create(new C11433e(realm, configuration, e), f66989e).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public Flowable<DynamicRealmObject> from(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealm.isFrozen()) {
            return Flowable.just(dynamicRealmObject);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29694e = m29694e();
        return Flowable.create(new C11439g(dynamicRealm, configuration, dynamicRealmObject), f66989e).subscribeOn(m29694e).unsubscribeOn(m29694e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Single<RealmQuery<E>> from(Realm realm, RealmQuery<E> realmQuery) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Single<RealmQuery<E>> from(DynamicRealm dynamicRealm, RealmQuery<E> realmQuery) {
        throw new RuntimeException("RealmQuery not supported yet.");
    }
}