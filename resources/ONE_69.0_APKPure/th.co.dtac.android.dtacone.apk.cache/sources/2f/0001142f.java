package th.p047co.dtac.android.dtacone.data.cache.realm_rx2;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.realm.CollectionUtils;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0004\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\f0\u000eJ@\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00100\u0004\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00100\u000eJ@\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00120\u0004\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00120\u000e¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RealmObservable;", "", "()V", NotificationCompat.CATEGORY_CALL, "Lio/reactivex/Observable;", "", "configuration", "Lio/realm/RealmConfiguration;", "function", "Lio/reactivex/functions/Consumer;", "Lio/realm/Realm;", "create", "T", "Lio/realm/RealmObject;", "Lio/reactivex/functions/Function;", CollectionUtils.LIST_TYPE, "Lio/realm/RealmList;", CustomerEnquiryActivity.RESULT, "Lio/realm/RealmResults;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.cache.realm_rx2.RealmObservable */
/* loaded from: classes7.dex */
public final class RealmObservable {
    public static final int $stable = 0;
    @NotNull
    public static final RealmObservable INSTANCE = new RealmObservable();

    @NotNull
    public final Observable<Boolean> call(@NotNull final RealmConfiguration configuration, @NotNull final Consumer<Realm> function) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(function, "function");
        Observable<Boolean> create = Observable.create(new OnSubscribeRealm<Boolean>(configuration) { // from class: th.co.dtac.android.dtacone.data.cache.realm_rx2.RealmObservable$call$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // th.p047co.dtac.android.dtacone.data.cache.realm_rx2.OnSubscribeRealm
            @NotNull
            public Boolean get(@Nullable Realm realm) {
                function.accept(realm);
                return Boolean.TRUE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "configuration: RealmConf…\n            }\n        })");
        return create;
    }

    @NotNull
    public final <T extends RealmObject> Observable<T> create(@NotNull final RealmConfiguration configuration, @NotNull final Function<Realm, T> function) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(function, "function");
        Observable<T> create = Observable.create(new OnSubscribeRealm<T>(configuration) { // from class: th.co.dtac.android.dtacone.data.cache.realm_rx2.RealmObservable$create$1
            /* JADX WARN: Incorrect return type in method signature: (Lio/realm/Realm;)TT; */
            @Override // th.p047co.dtac.android.dtacone.data.cache.realm_rx2.OnSubscribeRealm
            public RealmObject get(@Nullable Realm realm) {
                Function function2 = function;
                Intrinsics.checkNotNull(realm);
                return (RealmObject) function2.apply(realm);
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "configuration: RealmConf…            }\n\n        })");
        return create;
    }

    @NotNull
    public final <T extends RealmObject> Observable<RealmList<T>> list(@NotNull final RealmConfiguration configuration, @NotNull final Function<Realm, RealmList<T>> function) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(function, "function");
        Observable<RealmList<T>> create = Observable.create(new OnSubscribeRealm<RealmList<T>>(configuration) { // from class: th.co.dtac.android.dtacone.data.cache.realm_rx2.RealmObservable$list$1
            @Override // th.p047co.dtac.android.dtacone.data.cache.realm_rx2.OnSubscribeRealm
            @NotNull
            public RealmList<T> get(@Nullable Realm realm) {
                Function function2 = function;
                Intrinsics.checkNotNull(realm);
                Object apply = function2.apply(realm);
                Intrinsics.checkNotNullExpressionValue(apply, "function.apply(realm!!)");
                return (RealmList) apply;
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "configuration: RealmConf…\n            }\n        })");
        return create;
    }

    @NotNull
    public final <T extends RealmObject> Observable<RealmResults<T>> results(@NotNull final RealmConfiguration configuration, @NotNull final Function<Realm, RealmResults<T>> function) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(function, "function");
        Observable<RealmResults<T>> create = Observable.create(new OnSubscribeRealm<RealmResults<T>>(configuration) { // from class: th.co.dtac.android.dtacone.data.cache.realm_rx2.RealmObservable$results$1
            @Override // th.p047co.dtac.android.dtacone.data.cache.realm_rx2.OnSubscribeRealm
            @NotNull
            public RealmResults<T> get(@Nullable Realm realm) {
                Function function2 = function;
                Intrinsics.checkNotNull(realm);
                Object apply = function2.apply(realm);
                Intrinsics.checkNotNullExpressionValue(apply, "function.apply(realm!!)");
                return (RealmResults) apply;
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "configuration: RealmConf…\n            }\n        })");
        return create;
    }
}