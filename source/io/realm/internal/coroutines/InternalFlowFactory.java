package io.realm.internal.coroutines;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.coroutines.FlowFactory;
import io.realm.p021rx.CollectionChange;
import io.realm.p021rx.ObjectChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ7\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\t\u0010\u0011J=\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u00120\b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J7\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\t\u0010\u0014J=\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u00120\b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\t\u0010\u0017J=\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00120\b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J7\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\t\u0010\u0019J=\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00120\b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0019J/\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u000e*\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u001cJ5\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\b\"\b\b\u0000\u0010\u000e*\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u001cJ%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\t\u0010 J+\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0013\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m28850d2 = {"Lio/realm/internal/coroutines/InternalFlowFactory;", "Lio/realm/coroutines/FlowFactory;", "", "returnFrozenObjects", "<init>", "(Z)V", "Lio/realm/Realm;", "realm", "Lkotlinx/coroutines/flow/Flow;", "from", "(Lio/realm/Realm;)Lkotlinx/coroutines/flow/Flow;", "Lio/realm/DynamicRealm;", "dynamicRealm", "(Lio/realm/DynamicRealm;)Lkotlinx/coroutines/flow/Flow;", "T", "Lio/realm/RealmResults;", CustomerEnquiryActivity.RESULT, "(Lio/realm/Realm;Lio/realm/RealmResults;)Lkotlinx/coroutines/flow/Flow;", "Lio/realm/rx/CollectionChange;", "changesetFrom", "(Lio/realm/DynamicRealm;Lio/realm/RealmResults;)Lkotlinx/coroutines/flow/Flow;", "Lio/realm/RealmList;", "realmList", "(Lio/realm/Realm;Lio/realm/RealmList;)Lkotlinx/coroutines/flow/Flow;", CollectionUtils.LIST_TYPE, "(Lio/realm/DynamicRealm;Lio/realm/RealmList;)Lkotlinx/coroutines/flow/Flow;", "Lio/realm/RealmModel;", "realmObject", "(Lio/realm/Realm;Lio/realm/RealmModel;)Lkotlinx/coroutines/flow/Flow;", "Lio/realm/rx/ObjectChange;", "Lio/realm/DynamicRealmObject;", "dynamicRealmObject", "(Lio/realm/DynamicRealm;Lio/realm/DynamicRealmObject;)Lkotlinx/coroutines/flow/Flow;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "realm-android-library_baseRelease"}, m28849k = 1, m28848mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class InternalFlowFactory implements FlowFactory {

    /* renamed from: a */
    public final boolean f66814a;

    public InternalFlowFactory() {
        this(false, 1, null);
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T> Flow<CollectionChange<RealmResults<T>>> changesetFrom(@NotNull Realm realm, @NotNull RealmResults<T> results) {
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(results, "results");
        if (realm.isFrozen()) {
            return FlowKt.flowOf(new CollectionChange(results, null));
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$changesetFrom$1(results, realm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public Flow<Realm> from(@NotNull Realm realm) {
        Intrinsics.checkNotNullParameter(realm, "realm");
        if (realm.isFrozen()) {
            return FlowKt.flowOf(realm);
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$from$1(realm, this, null));
    }

    public InternalFlowFactory(boolean z) {
        this.f66814a = z;
    }

    public /* synthetic */ InternalFlowFactory(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public Flow<DynamicRealm> from(@NotNull DynamicRealm dynamicRealm) {
        Intrinsics.checkNotNullParameter(dynamicRealm, "dynamicRealm");
        if (dynamicRealm.isFrozen()) {
            return FlowKt.flowOf(dynamicRealm);
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$from$2(dynamicRealm, this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T> Flow<CollectionChange<RealmResults<T>>> changesetFrom(@NotNull DynamicRealm dynamicRealm, @NotNull RealmResults<T> results) {
        Intrinsics.checkNotNullParameter(dynamicRealm, "dynamicRealm");
        Intrinsics.checkNotNullParameter(results, "results");
        if (dynamicRealm.isFrozen()) {
            return FlowKt.flowOf(new CollectionChange(results, null));
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$changesetFrom$2(results, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T> Flow<RealmResults<T>> from(@NotNull Realm realm, @NotNull RealmResults<T> results) {
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(results, "results");
        if (realm.isFrozen()) {
            return FlowKt.flowOf(results);
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$from$3(results, realm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T> Flow<CollectionChange<RealmList<T>>> changesetFrom(@NotNull Realm realm, @NotNull RealmList<T> list) {
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(list, "list");
        if (realm.isFrozen()) {
            return FlowKt.flowOf(new CollectionChange(list, null));
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$changesetFrom$3(list, realm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T> Flow<RealmResults<T>> from(@NotNull DynamicRealm dynamicRealm, @NotNull RealmResults<T> results) {
        Intrinsics.checkNotNullParameter(dynamicRealm, "dynamicRealm");
        Intrinsics.checkNotNullParameter(results, "results");
        if (dynamicRealm.isFrozen()) {
            return FlowKt.flowOf(results);
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$from$4(results, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T> Flow<CollectionChange<RealmList<T>>> changesetFrom(@NotNull DynamicRealm dynamicRealm, @NotNull RealmList<T> list) {
        Intrinsics.checkNotNullParameter(dynamicRealm, "dynamicRealm");
        Intrinsics.checkNotNullParameter(list, "list");
        if (dynamicRealm.isFrozen()) {
            return FlowKt.flowOf(new CollectionChange(list, null));
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$changesetFrom$4(list, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T> Flow<RealmList<T>> from(@NotNull Realm realm, @NotNull RealmList<T> realmList) {
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(realmList, "realmList");
        if (realm.isFrozen()) {
            return FlowKt.flowOf(realmList);
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$from$5(realmList, realm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T extends RealmModel> Flow<ObjectChange<T>> changesetFrom(@NotNull Realm realm, @NotNull T realmObject) {
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(realmObject, "realmObject");
        if (realm.isFrozen()) {
            return FlowKt.flowOf(new ObjectChange(realmObject, null));
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$changesetFrom$5(realm, realm.getConfiguration(), realmObject, this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T> Flow<RealmList<T>> from(@NotNull DynamicRealm dynamicRealm, @NotNull RealmList<T> realmList) {
        Intrinsics.checkNotNullParameter(dynamicRealm, "dynamicRealm");
        Intrinsics.checkNotNullParameter(realmList, "realmList");
        if (dynamicRealm.isFrozen()) {
            return FlowKt.flowOf(realmList);
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$from$6(realmList, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public Flow<ObjectChange<DynamicRealmObject>> changesetFrom(@NotNull DynamicRealm dynamicRealm, @NotNull DynamicRealmObject dynamicRealmObject) {
        Intrinsics.checkNotNullParameter(dynamicRealm, "dynamicRealm");
        Intrinsics.checkNotNullParameter(dynamicRealmObject, "dynamicRealmObject");
        if (dynamicRealm.isFrozen()) {
            return FlowKt.flowOf(new ObjectChange(dynamicRealmObject, null));
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$changesetFrom$6(dynamicRealmObject, dynamicRealm.getConfiguration(), this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public <T extends RealmModel> Flow<T> from(@NotNull Realm realm, @NotNull T realmObject) {
        Intrinsics.checkNotNullParameter(realm, "realm");
        Intrinsics.checkNotNullParameter(realmObject, "realmObject");
        if (realm.isFrozen()) {
            return FlowKt.flowOf(realmObject);
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$from$7(realm, realm.getConfiguration(), realmObject, this, null));
    }

    @Override // io.realm.coroutines.FlowFactory
    @NotNull
    public Flow<DynamicRealmObject> from(@NotNull DynamicRealm dynamicRealm, @NotNull DynamicRealmObject dynamicRealmObject) {
        Intrinsics.checkNotNullParameter(dynamicRealm, "dynamicRealm");
        Intrinsics.checkNotNullParameter(dynamicRealmObject, "dynamicRealmObject");
        if (dynamicRealm.isFrozen()) {
            return FlowKt.flowOf(dynamicRealmObject);
        }
        return FlowKt.callbackFlow(new InternalFlowFactory$from$8(dynamicRealm, dynamicRealm.getConfiguration(), dynamicRealmObject, this, null));
    }
}
