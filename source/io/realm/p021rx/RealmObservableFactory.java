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
    public static final BackpressureStrategy f66926e = BackpressureStrategy.LATEST;

    /* renamed from: a */
    public final boolean f66927a;

    /* renamed from: b */
    public ThreadLocal f66928b = new C11458i();

    /* renamed from: c */
    public ThreadLocal f66929c = new C11459j();

    /* renamed from: d */
    public ThreadLocal f66930d = new C11460k();

    /* renamed from: io.realm.rx.RealmObservableFactory$a */
    /* loaded from: classes5.dex */
    public class C11434a implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmList f66931a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66932b;

        /* renamed from: io.realm.rx.RealmObservableFactory$a$a */
        /* loaded from: classes5.dex */
        public class C11435a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f66934a;

            public C11435a(FlowableEmitter flowableEmitter) {
                this.f66934a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmList realmList) {
                if (!realmList.isValid()) {
                    this.f66934a.onComplete();
                } else if (!this.f66934a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f66934a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmList = realmList.freeze();
                    }
                    flowableEmitter.onNext(realmList);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$a$b */
        /* loaded from: classes5.dex */
        public class RunnableC11436b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f66936a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f66937b;

            public RunnableC11436b(Realm realm, RealmChangeListener realmChangeListener) {
                this.f66936a = realm;
                this.f66937b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f66936a.isClosed()) {
                    C11434a.this.f66931a.removeChangeListener(this.f66937b);
                    this.f66936a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66929c.get()).m29336b(C11434a.this.f66931a);
            }
        }

        public C11434a(RealmList realmList, RealmConfiguration realmConfiguration) {
            this.f66931a = realmList;
            this.f66932b = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmList realmList;
            if (!this.f66931a.isValid()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f66932b);
            ((C11479r) RealmObservableFactory.this.f66929c.get()).m29337a(this.f66931a);
            C11435a c11435a = new C11435a(flowableEmitter);
            this.f66931a.addChangeListener(c11435a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11436b(realm, c11435a)));
            if (RealmObservableFactory.this.f66927a) {
                realmList = this.f66931a.freeze();
            } else {
                realmList = this.f66931a;
            }
            flowableEmitter.onNext(realmList);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$b */
    /* loaded from: classes5.dex */
    public class C11437b implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmList f66939a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66940b;

        /* renamed from: io.realm.rx.RealmObservableFactory$b$a */
        /* loaded from: classes5.dex */
        public class C11438a implements OrderedRealmCollectionChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f66942a;

            public C11438a(ObservableEmitter observableEmitter) {
                this.f66942a = observableEmitter;
            }

            @Override // io.realm.OrderedRealmCollectionChangeListener
            /* renamed from: a */
            public void onChange(RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!realmList.isValid()) {
                    this.f66942a.onComplete();
                } else if (!this.f66942a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f66942a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmList = realmList.freeze();
                    }
                    observableEmitter.onNext(new CollectionChange(realmList, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$b$b */
        /* loaded from: classes5.dex */
        public class RunnableC11439b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f66944a;

            /* renamed from: b */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f66945b;

            public RunnableC11439b(Realm realm, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
                this.f66944a = realm;
                this.f66945b = orderedRealmCollectionChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f66944a.isClosed()) {
                    C11437b.this.f66939a.removeChangeListener(this.f66945b);
                    this.f66944a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66929c.get()).m29336b(C11437b.this.f66939a);
            }
        }

        public C11437b(RealmList realmList, RealmConfiguration realmConfiguration) {
            this.f66939a = realmList;
            this.f66940b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmList realmList;
            if (!this.f66939a.isValid()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f66940b);
            ((C11479r) RealmObservableFactory.this.f66929c.get()).m29337a(this.f66939a);
            C11438a c11438a = new C11438a(observableEmitter);
            this.f66939a.addChangeListener(c11438a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11439b(realm, c11438a)));
            if (RealmObservableFactory.this.f66927a) {
                realmList = this.f66939a.freeze();
            } else {
                realmList = this.f66939a;
            }
            observableEmitter.onNext(new CollectionChange(realmList, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$c */
    /* loaded from: classes5.dex */
    public class C11440c implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmList f66947a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66948b;

        /* renamed from: io.realm.rx.RealmObservableFactory$c$a */
        /* loaded from: classes5.dex */
        public class C11441a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f66950a;

            public C11441a(FlowableEmitter flowableEmitter) {
                this.f66950a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmList realmList) {
                if (!realmList.isValid()) {
                    this.f66950a.onComplete();
                } else if (!this.f66950a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f66950a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmList = realmList.freeze();
                    }
                    flowableEmitter.onNext(realmList);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$c$b */
        /* loaded from: classes5.dex */
        public class RunnableC11442b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f66952a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f66953b;

            public RunnableC11442b(DynamicRealm dynamicRealm, RealmChangeListener realmChangeListener) {
                this.f66952a = dynamicRealm;
                this.f66953b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f66952a.isClosed()) {
                    C11440c.this.f66947a.removeChangeListener(this.f66953b);
                    this.f66952a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66929c.get()).m29336b(C11440c.this.f66947a);
            }
        }

        public C11440c(RealmList realmList, RealmConfiguration realmConfiguration) {
            this.f66947a = realmList;
            this.f66948b = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmList realmList;
            if (!this.f66947a.isValid()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f66948b);
            ((C11479r) RealmObservableFactory.this.f66929c.get()).m29337a(this.f66947a);
            C11441a c11441a = new C11441a(flowableEmitter);
            this.f66947a.addChangeListener(c11441a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11442b(dynamicRealm, c11441a)));
            if (RealmObservableFactory.this.f66927a) {
                realmList = this.f66947a.freeze();
            } else {
                realmList = this.f66947a;
            }
            flowableEmitter.onNext(realmList);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$d */
    /* loaded from: classes5.dex */
    public class C11443d implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmList f66955a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66956b;

        /* renamed from: io.realm.rx.RealmObservableFactory$d$a */
        /* loaded from: classes5.dex */
        public class C11444a implements OrderedRealmCollectionChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f66958a;

            public C11444a(ObservableEmitter observableEmitter) {
                this.f66958a = observableEmitter;
            }

            @Override // io.realm.OrderedRealmCollectionChangeListener
            /* renamed from: a */
            public void onChange(RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!realmList.isValid()) {
                    this.f66958a.onComplete();
                } else if (!this.f66958a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f66958a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmList = realmList.freeze();
                    }
                    observableEmitter.onNext(new CollectionChange(realmList, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$d$b */
        /* loaded from: classes5.dex */
        public class RunnableC11445b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f66960a;

            /* renamed from: b */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f66961b;

            public RunnableC11445b(DynamicRealm dynamicRealm, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
                this.f66960a = dynamicRealm;
                this.f66961b = orderedRealmCollectionChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f66960a.isClosed()) {
                    C11443d.this.f66955a.removeChangeListener(this.f66961b);
                    this.f66960a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66929c.get()).m29336b(C11443d.this.f66955a);
            }
        }

        public C11443d(RealmList realmList, RealmConfiguration realmConfiguration) {
            this.f66955a = realmList;
            this.f66956b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmList realmList;
            if (!this.f66955a.isValid()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f66956b);
            ((C11479r) RealmObservableFactory.this.f66929c.get()).m29337a(this.f66955a);
            C11444a c11444a = new C11444a(observableEmitter);
            this.f66955a.addChangeListener(c11444a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11445b(dynamicRealm, c11444a)));
            if (RealmObservableFactory.this.f66927a) {
                realmList = this.f66955a.freeze();
            } else {
                realmList = this.f66955a;
            }
            observableEmitter.onNext(new CollectionChange(realmList, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$e */
    /* loaded from: classes5.dex */
    public class C11446e implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Realm f66963a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66964b;

        /* renamed from: c */
        public final /* synthetic */ RealmModel f66965c;

        /* renamed from: io.realm.rx.RealmObservableFactory$e$a */
        /* loaded from: classes5.dex */
        public class C11447a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f66967a;

            public C11447a(FlowableEmitter flowableEmitter) {
                this.f66967a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmModel realmModel) {
                if (!this.f66967a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f66967a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmModel = RealmObject.freeze(realmModel);
                    }
                    flowableEmitter.onNext(realmModel);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$e$b */
        /* loaded from: classes5.dex */
        public class RunnableC11448b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f66969a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f66970b;

            public RunnableC11448b(Realm realm, RealmChangeListener realmChangeListener) {
                this.f66969a = realm;
                this.f66970b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f66969a.isClosed()) {
                    RealmObject.removeChangeListener(C11446e.this.f66965c, this.f66970b);
                    this.f66969a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66930d.get()).m29336b(C11446e.this.f66965c);
            }
        }

        public C11446e(Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel) {
            this.f66963a = realm;
            this.f66964b = realmConfiguration;
            this.f66965c = realmModel;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmModel realmModel;
            if (this.f66963a.isClosed()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f66964b);
            ((C11479r) RealmObservableFactory.this.f66930d.get()).m29337a(this.f66965c);
            C11447a c11447a = new C11447a(flowableEmitter);
            RealmObject.addChangeListener(this.f66965c, c11447a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11448b(realm, c11447a)));
            if (RealmObservableFactory.this.f66927a) {
                realmModel = RealmObject.freeze(this.f66965c);
            } else {
                realmModel = this.f66965c;
            }
            flowableEmitter.onNext(realmModel);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$f */
    /* loaded from: classes5.dex */
    public class C11449f implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmModel f66972a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66973b;

        /* renamed from: io.realm.rx.RealmObservableFactory$f$a */
        /* loaded from: classes5.dex */
        public class C11450a implements RealmObjectChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f66975a;

            public C11450a(ObservableEmitter observableEmitter) {
                this.f66975a = observableEmitter;
            }

            @Override // io.realm.RealmObjectChangeListener
            public void onChange(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
                if (!this.f66975a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f66975a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmModel = RealmObject.freeze(realmModel);
                    }
                    observableEmitter.onNext(new ObjectChange(realmModel, objectChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$f$b */
        /* loaded from: classes5.dex */
        public class RunnableC11451b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f66977a;

            /* renamed from: b */
            public final /* synthetic */ RealmObjectChangeListener f66978b;

            public RunnableC11451b(Realm realm, RealmObjectChangeListener realmObjectChangeListener) {
                this.f66977a = realm;
                this.f66978b = realmObjectChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f66977a.isClosed()) {
                    RealmObject.removeChangeListener(C11449f.this.f66972a, this.f66978b);
                    this.f66977a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66930d.get()).m29336b(C11449f.this.f66972a);
            }
        }

        public C11449f(RealmModel realmModel, RealmConfiguration realmConfiguration) {
            this.f66972a = realmModel;
            this.f66973b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmModel realmModel;
            if (!RealmObject.isValid(this.f66972a)) {
                return;
            }
            Realm realm = Realm.getInstance(this.f66973b);
            ((C11479r) RealmObservableFactory.this.f66930d.get()).m29337a(this.f66972a);
            C11450a c11450a = new C11450a(observableEmitter);
            RealmObject.addChangeListener(this.f66972a, c11450a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11451b(realm, c11450a)));
            if (RealmObservableFactory.this.f66927a) {
                realmModel = RealmObject.freeze(this.f66972a);
            } else {
                realmModel = this.f66972a;
            }
            observableEmitter.onNext(new ObjectChange(realmModel, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$g */
    /* loaded from: classes5.dex */
    public class C11452g implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ DynamicRealm f66980a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66981b;

        /* renamed from: c */
        public final /* synthetic */ DynamicRealmObject f66982c;

        /* renamed from: io.realm.rx.RealmObservableFactory$g$a */
        /* loaded from: classes5.dex */
        public class C11453a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f66984a;

            public C11453a(FlowableEmitter flowableEmitter) {
                this.f66984a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(DynamicRealmObject dynamicRealmObject) {
                if (!this.f66984a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f66984a;
                    if (RealmObservableFactory.this.f66927a) {
                        dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(dynamicRealmObject);
                    }
                    flowableEmitter.onNext(dynamicRealmObject);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$g$b */
        /* loaded from: classes5.dex */
        public class RunnableC11454b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f66986a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f66987b;

            public RunnableC11454b(DynamicRealm dynamicRealm, RealmChangeListener realmChangeListener) {
                this.f66986a = dynamicRealm;
                this.f66987b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f66986a.isClosed()) {
                    RealmObject.removeChangeListener(C11452g.this.f66982c, this.f66987b);
                    this.f66986a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66930d.get()).m29336b(C11452g.this.f66982c);
            }
        }

        public C11452g(DynamicRealm dynamicRealm, RealmConfiguration realmConfiguration, DynamicRealmObject dynamicRealmObject) {
            this.f66980a = dynamicRealm;
            this.f66981b = realmConfiguration;
            this.f66982c = dynamicRealmObject;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            DynamicRealmObject dynamicRealmObject;
            if (this.f66980a.isClosed()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f66981b);
            ((C11479r) RealmObservableFactory.this.f66930d.get()).m29337a(this.f66982c);
            C11453a c11453a = new C11453a(flowableEmitter);
            RealmObject.addChangeListener(this.f66982c, c11453a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11454b(dynamicRealm, c11453a)));
            if (RealmObservableFactory.this.f66927a) {
                dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(this.f66982c);
            } else {
                dynamicRealmObject = this.f66982c;
            }
            flowableEmitter.onNext(dynamicRealmObject);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$h */
    /* loaded from: classes5.dex */
    public class C11455h implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ DynamicRealmObject f66989a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f66990b;

        /* renamed from: io.realm.rx.RealmObservableFactory$h$a */
        /* loaded from: classes5.dex */
        public class C11456a implements RealmObjectChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f66992a;

            public C11456a(ObservableEmitter observableEmitter) {
                this.f66992a = observableEmitter;
            }

            @Override // io.realm.RealmObjectChangeListener
            /* renamed from: a */
            public void onChange(DynamicRealmObject dynamicRealmObject, ObjectChangeSet objectChangeSet) {
                if (!this.f66992a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f66992a;
                    if (RealmObservableFactory.this.f66927a) {
                        dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(dynamicRealmObject);
                    }
                    observableEmitter.onNext(new ObjectChange(dynamicRealmObject, objectChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$h$b */
        /* loaded from: classes5.dex */
        public class RunnableC11457b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f66994a;

            /* renamed from: b */
            public final /* synthetic */ RealmObjectChangeListener f66995b;

            public RunnableC11457b(DynamicRealm dynamicRealm, RealmObjectChangeListener realmObjectChangeListener) {
                this.f66994a = dynamicRealm;
                this.f66995b = realmObjectChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f66994a.isClosed()) {
                    RealmObject.removeChangeListener(C11455h.this.f66989a, this.f66995b);
                    this.f66994a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66930d.get()).m29336b(C11455h.this.f66989a);
            }
        }

        public C11455h(DynamicRealmObject dynamicRealmObject, RealmConfiguration realmConfiguration) {
            this.f66989a = dynamicRealmObject;
            this.f66990b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            DynamicRealmObject dynamicRealmObject;
            if (!RealmObject.isValid(this.f66989a)) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f66990b);
            ((C11479r) RealmObservableFactory.this.f66930d.get()).m29337a(this.f66989a);
            C11456a c11456a = new C11456a(observableEmitter);
            this.f66989a.addChangeListener(c11456a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11457b(dynamicRealm, c11456a)));
            if (RealmObservableFactory.this.f66927a) {
                dynamicRealmObject = (DynamicRealmObject) RealmObject.freeze(this.f66989a);
            } else {
                dynamicRealmObject = this.f66989a;
            }
            observableEmitter.onNext(new ObjectChange(dynamicRealmObject, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$i */
    /* loaded from: classes5.dex */
    public class C11458i extends ThreadLocal {
        public C11458i() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public C11479r initialValue() {
            return new C11479r(null);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$j */
    /* loaded from: classes5.dex */
    public class C11459j extends ThreadLocal {
        public C11459j() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public C11479r initialValue() {
            return new C11479r(null);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$k */
    /* loaded from: classes5.dex */
    public class C11460k extends ThreadLocal {
        public C11460k() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public C11479r initialValue() {
            return new C11479r(null);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$l */
    /* loaded from: classes5.dex */
    public class C11461l implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmConfiguration f67000a;

        /* renamed from: io.realm.rx.RealmObservableFactory$l$a */
        /* loaded from: classes5.dex */
        public class C11462a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67002a;

            public C11462a(FlowableEmitter flowableEmitter) {
                this.f67002a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(Realm realm) {
                if (!this.f67002a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67002a;
                    if (RealmObservableFactory.this.f66927a) {
                        realm = realm.freeze();
                    }
                    flowableEmitter.onNext(realm);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$l$b */
        /* loaded from: classes5.dex */
        public class RunnableC11463b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f67004a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67005b;

            public RunnableC11463b(Realm realm, RealmChangeListener realmChangeListener) {
                this.f67004a = realm;
                this.f67005b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67004a.isClosed()) {
                    this.f67004a.removeChangeListener(this.f67005b);
                    this.f67004a.close();
                }
            }
        }

        public C11461l(RealmConfiguration realmConfiguration) {
            this.f67000a = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            Realm realm = Realm.getInstance(this.f67000a);
            C11462a c11462a = new C11462a(flowableEmitter);
            realm.addChangeListener(c11462a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11463b(realm, c11462a)));
            if (RealmObservableFactory.this.f66927a) {
                realm = realm.freeze();
            }
            flowableEmitter.onNext(realm);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$m */
    /* loaded from: classes5.dex */
    public class C11464m implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmConfiguration f67007a;

        /* renamed from: io.realm.rx.RealmObservableFactory$m$a */
        /* loaded from: classes5.dex */
        public class C11465a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67009a;

            public C11465a(FlowableEmitter flowableEmitter) {
                this.f67009a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(DynamicRealm dynamicRealm) {
                if (!this.f67009a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67009a;
                    if (RealmObservableFactory.this.f66927a) {
                        dynamicRealm = dynamicRealm.freeze();
                    }
                    flowableEmitter.onNext(dynamicRealm);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$m$b */
        /* loaded from: classes5.dex */
        public class RunnableC11466b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67011a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67012b;

            public RunnableC11466b(DynamicRealm dynamicRealm, RealmChangeListener realmChangeListener) {
                this.f67011a = dynamicRealm;
                this.f67012b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67011a.isClosed()) {
                    this.f67011a.removeChangeListener(this.f67012b);
                    this.f67011a.close();
                }
            }
        }

        public C11464m(RealmConfiguration realmConfiguration) {
            this.f67007a = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67007a);
            C11465a c11465a = new C11465a(flowableEmitter);
            dynamicRealm.addChangeListener(c11465a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11466b(dynamicRealm, c11465a)));
            if (RealmObservableFactory.this.f66927a) {
                dynamicRealm = dynamicRealm.freeze();
            }
            flowableEmitter.onNext(dynamicRealm);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$n */
    /* loaded from: classes5.dex */
    public class C11467n implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmResults f67014a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67015b;

        /* renamed from: io.realm.rx.RealmObservableFactory$n$a */
        /* loaded from: classes5.dex */
        public class C11468a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67017a;

            public C11468a(FlowableEmitter flowableEmitter) {
                this.f67017a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmResults realmResults) {
                if (!this.f67017a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67017a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmResults = realmResults.freeze();
                    }
                    flowableEmitter.onNext(realmResults);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$n$b */
        /* loaded from: classes5.dex */
        public class RunnableC11469b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f67019a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67020b;

            public RunnableC11469b(Realm realm, RealmChangeListener realmChangeListener) {
                this.f67019a = realm;
                this.f67020b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67019a.isClosed()) {
                    C11467n.this.f67014a.removeChangeListener(this.f67020b);
                    this.f67019a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66928b.get()).m29336b(C11467n.this.f67014a);
            }
        }

        public C11467n(RealmResults realmResults, RealmConfiguration realmConfiguration) {
            this.f67014a = realmResults;
            this.f67015b = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmResults realmResults;
            if (!this.f67014a.isValid()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f67015b);
            ((C11479r) RealmObservableFactory.this.f66928b.get()).m29337a(this.f67014a);
            C11468a c11468a = new C11468a(flowableEmitter);
            this.f67014a.addChangeListener(c11468a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11469b(realm, c11468a)));
            if (RealmObservableFactory.this.f66927a) {
                realmResults = this.f67014a.freeze();
            } else {
                realmResults = this.f67014a;
            }
            flowableEmitter.onNext(realmResults);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$o */
    /* loaded from: classes5.dex */
    public class C11470o implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmResults f67022a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67023b;

        /* renamed from: io.realm.rx.RealmObservableFactory$o$a */
        /* loaded from: classes5.dex */
        public class C11471a implements OrderedRealmCollectionChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f67025a;

            public C11471a(ObservableEmitter observableEmitter) {
                this.f67025a = observableEmitter;
            }

            @Override // io.realm.OrderedRealmCollectionChangeListener
            /* renamed from: a */
            public void onChange(RealmResults realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                RealmResults realmResults2;
                if (!this.f67025a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f67025a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmResults2 = C11470o.this.f67022a.freeze();
                    } else {
                        realmResults2 = C11470o.this.f67022a;
                    }
                    observableEmitter.onNext(new CollectionChange(realmResults2, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$o$b */
        /* loaded from: classes5.dex */
        public class RunnableC11472b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Realm f67027a;

            /* renamed from: b */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f67028b;

            public RunnableC11472b(Realm realm, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
                this.f67027a = realm;
                this.f67028b = orderedRealmCollectionChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67027a.isClosed()) {
                    C11470o.this.f67022a.removeChangeListener(this.f67028b);
                    this.f67027a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66928b.get()).m29336b(C11470o.this.f67022a);
            }
        }

        public C11470o(RealmResults realmResults, RealmConfiguration realmConfiguration) {
            this.f67022a = realmResults;
            this.f67023b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmResults realmResults;
            if (!this.f67022a.isValid()) {
                return;
            }
            Realm realm = Realm.getInstance(this.f67023b);
            ((C11479r) RealmObservableFactory.this.f66928b.get()).m29337a(this.f67022a);
            C11471a c11471a = new C11471a(observableEmitter);
            this.f67022a.addChangeListener(c11471a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11472b(realm, c11471a)));
            if (RealmObservableFactory.this.f66927a) {
                realmResults = this.f67022a.freeze();
            } else {
                realmResults = this.f67022a;
            }
            observableEmitter.onNext(new CollectionChange(realmResults, null));
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$p */
    /* loaded from: classes5.dex */
    public class C11473p implements FlowableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmResults f67030a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67031b;

        /* renamed from: io.realm.rx.RealmObservableFactory$p$a */
        /* loaded from: classes5.dex */
        public class C11474a implements RealmChangeListener {

            /* renamed from: a */
            public final /* synthetic */ FlowableEmitter f67033a;

            public C11474a(FlowableEmitter flowableEmitter) {
                this.f67033a = flowableEmitter;
            }

            @Override // io.realm.RealmChangeListener
            /* renamed from: a */
            public void onChange(RealmResults realmResults) {
                if (!this.f67033a.isCancelled()) {
                    FlowableEmitter flowableEmitter = this.f67033a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmResults = realmResults.freeze();
                    }
                    flowableEmitter.onNext(realmResults);
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$p$b */
        /* loaded from: classes5.dex */
        public class RunnableC11475b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67035a;

            /* renamed from: b */
            public final /* synthetic */ RealmChangeListener f67036b;

            public RunnableC11475b(DynamicRealm dynamicRealm, RealmChangeListener realmChangeListener) {
                this.f67035a = dynamicRealm;
                this.f67036b = realmChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67035a.isClosed()) {
                    C11473p.this.f67030a.removeChangeListener(this.f67036b);
                    this.f67035a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66928b.get()).m29336b(C11473p.this.f67030a);
            }
        }

        public C11473p(RealmResults realmResults, RealmConfiguration realmConfiguration) {
            this.f67030a = realmResults;
            this.f67031b = realmConfiguration;
        }

        @Override // io.reactivex.FlowableOnSubscribe
        public void subscribe(FlowableEmitter flowableEmitter) {
            RealmResults realmResults;
            if (!this.f67030a.isValid()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67031b);
            ((C11479r) RealmObservableFactory.this.f66928b.get()).m29337a(this.f67030a);
            C11474a c11474a = new C11474a(flowableEmitter);
            this.f67030a.addChangeListener(c11474a);
            flowableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11475b(dynamicRealm, c11474a)));
            if (RealmObservableFactory.this.f66927a) {
                realmResults = this.f67030a.freeze();
            } else {
                realmResults = this.f67030a;
            }
            flowableEmitter.onNext(realmResults);
        }
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$q */
    /* loaded from: classes5.dex */
    public class C11476q implements ObservableOnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ RealmResults f67038a;

        /* renamed from: b */
        public final /* synthetic */ RealmConfiguration f67039b;

        /* renamed from: io.realm.rx.RealmObservableFactory$q$a */
        /* loaded from: classes5.dex */
        public class C11477a implements OrderedRealmCollectionChangeListener {

            /* renamed from: a */
            public final /* synthetic */ ObservableEmitter f67041a;

            public C11477a(ObservableEmitter observableEmitter) {
                this.f67041a = observableEmitter;
            }

            @Override // io.realm.OrderedRealmCollectionChangeListener
            /* renamed from: a */
            public void onChange(RealmResults realmResults, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                if (!this.f67041a.isDisposed()) {
                    ObservableEmitter observableEmitter = this.f67041a;
                    if (RealmObservableFactory.this.f66927a) {
                        realmResults = realmResults.freeze();
                    }
                    observableEmitter.onNext(new CollectionChange(realmResults, orderedCollectionChangeSet));
                }
            }
        }

        /* renamed from: io.realm.rx.RealmObservableFactory$q$b */
        /* loaded from: classes5.dex */
        public class RunnableC11478b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DynamicRealm f67043a;

            /* renamed from: b */
            public final /* synthetic */ OrderedRealmCollectionChangeListener f67044b;

            public RunnableC11478b(DynamicRealm dynamicRealm, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
                this.f67043a = dynamicRealm;
                this.f67044b = orderedRealmCollectionChangeListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.f67043a.isClosed()) {
                    C11476q.this.f67038a.removeChangeListener(this.f67044b);
                    this.f67043a.close();
                }
                ((C11479r) RealmObservableFactory.this.f66928b.get()).m29336b(C11476q.this.f67038a);
            }
        }

        public C11476q(RealmResults realmResults, RealmConfiguration realmConfiguration) {
            this.f67038a = realmResults;
            this.f67039b = realmConfiguration;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter observableEmitter) {
            RealmResults realmResults;
            if (!this.f67038a.isValid()) {
                return;
            }
            DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.f67039b);
            ((C11479r) RealmObservableFactory.this.f66928b.get()).m29337a(this.f67038a);
            C11477a c11477a = new C11477a(observableEmitter);
            this.f67038a.addChangeListener(c11477a);
            observableEmitter.setDisposable(Disposables.fromRunnable(new RunnableC11478b(dynamicRealm, c11477a)));
            if (RealmObservableFactory.this.f66927a) {
                realmResults = this.f67038a.freeze();
            } else {
                realmResults = this.f67038a;
            }
            observableEmitter.onNext(new CollectionChange(realmResults, null));
        }
    }

    public RealmObservableFactory(boolean z) {
        this.f66927a = z;
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Observable<CollectionChange<RealmResults<E>>> changesetsFrom(Realm realm, RealmResults<E> realmResults) {
        if (realm.isFrozen()) {
            return Observable.just(new CollectionChange(realmResults, null));
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Observable.create(new C11470o(realmResults, configuration)).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    /* renamed from: e */
    public final Scheduler m29354e() {
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
        Scheduler m29354e = m29354e();
        return Flowable.create(new C11461l(configuration), f66926e).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    public int hashCode() {
        return 37;
    }

    /* renamed from: io.realm.rx.RealmObservableFactory$r */
    /* loaded from: classes5.dex */
    public static class C11479r {

        /* renamed from: a */
        public final Map f67046a;

        public C11479r() {
            this.f67046a = new IdentityHashMap();
        }

        /* renamed from: a */
        public void m29337a(Object obj) {
            Integer num = (Integer) this.f67046a.get(obj);
            if (num == null) {
                this.f67046a.put(obj, 1);
            } else {
                this.f67046a.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }

        /* renamed from: b */
        public void m29336b(Object obj) {
            Integer num = (Integer) this.f67046a.get(obj);
            if (num != null) {
                if (num.intValue() > 1) {
                    this.f67046a.put(obj, Integer.valueOf(num.intValue() - 1));
                    return;
                } else if (num.intValue() == 1) {
                    this.f67046a.remove(obj);
                    return;
                } else {
                    throw new IllegalStateException("Invalid reference count: " + num);
                }
            }
            throw new IllegalStateException("Object does not have any references: " + obj);
        }

        public /* synthetic */ C11479r(C11458i c11458i) {
            this();
        }
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Observable<CollectionChange<RealmResults<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmResults<E> realmResults) {
        if (dynamicRealm.isFrozen()) {
            return Observable.just(new CollectionChange(realmResults, null));
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Observable.create(new C11476q(realmResults, configuration)).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public Flowable<DynamicRealm> from(DynamicRealm dynamicRealm) {
        if (dynamicRealm.isFrozen()) {
            return Flowable.just(dynamicRealm);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Flowable.create(new C11464m(configuration), f66926e).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Observable<CollectionChange<RealmList<E>>> changesetsFrom(Realm realm, RealmList<E> realmList) {
        if (realm.isFrozen()) {
            return Observable.just(new CollectionChange(realmList, null));
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Observable.create(new C11437b(realmList, configuration)).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Flowable<RealmResults<E>> from(Realm realm, RealmResults<E> realmResults) {
        if (realm.isFrozen()) {
            return Flowable.just(realmResults);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Flowable.create(new C11467n(realmResults, configuration), f66926e).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Observable<CollectionChange<RealmList<E>>> changesetsFrom(DynamicRealm dynamicRealm, RealmList<E> realmList) {
        if (dynamicRealm.isFrozen()) {
            return Observable.just(new CollectionChange(realmList, null));
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Observable.create(new C11443d(realmList, configuration)).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Flowable<RealmResults<E>> from(DynamicRealm dynamicRealm, RealmResults<E> realmResults) {
        if (dynamicRealm.isFrozen()) {
            return Flowable.just(realmResults);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Flowable.create(new C11473p(realmResults, configuration), f66926e).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E extends RealmModel> Observable<ObjectChange<E>> changesetsFrom(Realm realm, E e) {
        if (realm.isFrozen()) {
            return Observable.just(new ObjectChange(e, null));
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Observable.create(new C11449f(e, configuration)).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Flowable<RealmList<E>> from(Realm realm, RealmList<E> realmList) {
        if (realm.isFrozen()) {
            return Flowable.just(realmList);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Flowable.create(new C11434a(realmList, configuration), f66926e).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public Observable<ObjectChange<DynamicRealmObject>> changesetsFrom(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealm.isFrozen()) {
            return Observable.just(new ObjectChange(dynamicRealmObject, null));
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Observable.create(new C11455h(dynamicRealmObject, configuration)).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E> Flowable<RealmList<E>> from(DynamicRealm dynamicRealm, RealmList<E> realmList) {
        if (dynamicRealm.isFrozen()) {
            return Flowable.just(realmList);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Flowable.create(new C11440c(realmList, configuration), f66926e).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public <E extends RealmModel> Flowable<E> from(Realm realm, E e) {
        if (realm.isFrozen()) {
            return Flowable.just(e);
        }
        RealmConfiguration configuration = realm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Flowable.create(new C11446e(realm, configuration, e), f66926e).subscribeOn(m29354e).unsubscribeOn(m29354e);
    }

    @Override // io.realm.p021rx.RxObservableFactory
    public Flowable<DynamicRealmObject> from(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealm.isFrozen()) {
            return Flowable.just(dynamicRealmObject);
        }
        RealmConfiguration configuration = dynamicRealm.getConfiguration();
        Scheduler m29354e = m29354e();
        return Flowable.create(new C11452g(dynamicRealm, configuration, dynamicRealmObject), f66926e).subscribeOn(m29354e).unsubscribeOn(m29354e);
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
