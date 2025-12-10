package th.p047co.dtac.android.dtacone.data.cache.realm;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.functions.Func1;

/* renamed from: th.co.dtac.android.dtacone.data.cache.realm.RealmObservable */
/* loaded from: classes7.dex */
public final class RealmObservable {

    /* renamed from: th.co.dtac.android.dtacone.data.cache.realm.RealmObservable$a */
    /* loaded from: classes7.dex */
    public class C14194a extends OnSubscribeRealm {

        /* renamed from: e */
        public final /* synthetic */ Func1 f83529e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14194a(RealmConfiguration realmConfiguration, Func1 func1) {
            super(realmConfiguration);
            this.f83529e = func1;
        }

        @Override // th.p047co.dtac.android.dtacone.data.cache.realm.OnSubscribeRealm
        /* renamed from: g */
        public RealmObject get(Realm realm) {
            return (RealmObject) this.f83529e.call(realm);
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.data.cache.realm.RealmObservable$b */
    /* loaded from: classes7.dex */
    public class C14195b extends OnSubscribeRealm {

        /* renamed from: e */
        public final /* synthetic */ Func1 f83530e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14195b(RealmConfiguration realmConfiguration, Func1 func1) {
            super(realmConfiguration);
            this.f83530e = func1;
        }

        @Override // th.p047co.dtac.android.dtacone.data.cache.realm.OnSubscribeRealm
        /* renamed from: g */
        public RealmList get(Realm realm) {
            return (RealmList) this.f83530e.call(realm);
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.data.cache.realm.RealmObservable$c */
    /* loaded from: classes7.dex */
    public class C14196c extends OnSubscribeRealm {

        /* renamed from: e */
        public final /* synthetic */ Func1 f83531e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14196c(RealmConfiguration realmConfiguration, Func1 func1) {
            super(realmConfiguration);
            this.f83531e = func1;
        }

        @Override // th.p047co.dtac.android.dtacone.data.cache.realm.OnSubscribeRealm
        /* renamed from: g */
        public RealmResults get(Realm realm) {
            return (RealmResults) this.f83531e.call(realm);
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.data.cache.realm.RealmObservable$d */
    /* loaded from: classes7.dex */
    public class C14197d extends OnSubscribeRealm {

        /* renamed from: e */
        public final /* synthetic */ Action1 f83532e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14197d(RealmConfiguration realmConfiguration, Action1 action1) {
            super(realmConfiguration);
            this.f83532e = action1;
        }

        @Override // th.p047co.dtac.android.dtacone.data.cache.realm.OnSubscribeRealm
        /* renamed from: g */
        public Boolean get(Realm realm) {
            this.f83532e.call(realm);
            return Boolean.TRUE;
        }
    }

    public static Observable<Boolean> call(RealmConfiguration realmConfiguration, Action1<Realm> action1) {
        return Observable.create(new C14197d(realmConfiguration, action1));
    }

    public static <T extends RealmObject> Observable<RealmList<T>> list(RealmConfiguration realmConfiguration, Func1<Realm, RealmList<T>> func1) {
        return Observable.create(new C14195b(realmConfiguration, func1));
    }

    public static <T extends RealmObject> Observable<T> object(RealmConfiguration realmConfiguration, Func1<Realm, T> func1) {
        return Observable.create(new C14194a(realmConfiguration, func1));
    }

    public static <T extends RealmObject> Observable<RealmResults<T>> results(RealmConfiguration realmConfiguration, Func1<Realm, RealmResults<T>> func1) {
        return Observable.create(new C14196c(realmConfiguration, func1));
    }
}