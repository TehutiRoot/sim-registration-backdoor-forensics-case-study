package io.realm.coroutines;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.internal.coroutines.InternalFlowFactory;
import io.realm.p021rx.CollectionChange;
import io.realm.p021rx.ObjectChange;
import javax.annotation.Nonnull;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public class RealmFlowFactory implements FlowFactory {

    /* renamed from: a */
    public final InternalFlowFactory f66720a;

    public RealmFlowFactory(Boolean bool) {
        this.f66720a = new InternalFlowFactory(bool.booleanValue());
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> Flow<CollectionChange<RealmResults<T>>> changesetFrom(@Nonnull Realm realm, @Nonnull RealmResults<T> realmResults) {
        return this.f66720a.changesetFrom(realm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public Flow<Realm> from(@Nonnull Realm realm) {
        return this.f66720a.from(realm);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> Flow<CollectionChange<RealmResults<T>>> changesetFrom(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmResults<T> realmResults) {
        return this.f66720a.changesetFrom(dynamicRealm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public Flow<DynamicRealm> from(@Nonnull DynamicRealm dynamicRealm) {
        return this.f66720a.from(dynamicRealm);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> Flow<CollectionChange<RealmList<T>>> changesetFrom(@Nonnull Realm realm, @Nonnull RealmList<T> realmList) {
        return this.f66720a.changesetFrom(realm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> Flow<RealmResults<T>> from(@Nonnull Realm realm, @Nonnull RealmResults<T> realmResults) {
        return this.f66720a.from(realm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> Flow<CollectionChange<RealmList<T>>> changesetFrom(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmList<T> realmList) {
        return this.f66720a.changesetFrom(dynamicRealm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> Flow<RealmResults<T>> from(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmResults<T> realmResults) {
        return this.f66720a.from(dynamicRealm, realmResults);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends RealmModel> Flow<ObjectChange<T>> changesetFrom(@Nonnull Realm realm, @Nonnull T t) {
        return this.f66720a.changesetFrom(realm, (Realm) t);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> Flow<RealmList<T>> from(@Nonnull Realm realm, @Nonnull RealmList<T> realmList) {
        return this.f66720a.from(realm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public Flow<ObjectChange<DynamicRealmObject>> changesetFrom(@Nonnull DynamicRealm dynamicRealm, @Nonnull DynamicRealmObject dynamicRealmObject) {
        return this.f66720a.changesetFrom(dynamicRealm, dynamicRealmObject);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T> Flow<RealmList<T>> from(@Nonnull DynamicRealm dynamicRealm, @Nonnull RealmList<T> realmList) {
        return this.f66720a.from(dynamicRealm, realmList);
    }

    @Override // io.realm.coroutines.FlowFactory
    public <T extends RealmModel> Flow<T> from(@Nonnull Realm realm, @Nonnull T t) {
        return this.f66720a.from(realm, (Realm) t);
    }

    @Override // io.realm.coroutines.FlowFactory
    public Flow<DynamicRealmObject> from(@Nonnull DynamicRealm dynamicRealm, @Nonnull DynamicRealmObject dynamicRealmObject) {
        return this.f66720a.from(dynamicRealm, dynamicRealmObject);
    }
}