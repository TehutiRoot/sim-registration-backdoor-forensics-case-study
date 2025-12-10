package io.realm.kotlin;

import io.realm.BaseRealm;
import io.realm.DynamicRealm;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.p021rx.CollectionChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u0003\u001a&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u0003¨\u0006\u0007"}, m28850d2 = {"toChangesetFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/rx/CollectionChange;", "Lio/realm/RealmResults;", "T", "Lio/realm/RealmModel;", "toFlow", "realm-kotlin-extensions_baseRelease"}, m28849k = 2, m28848mv = {1, 6, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class RealmResultsExtensionsKt {
    @NotNull
    public static final <T extends RealmModel> Flow<CollectionChange<RealmResults<T>>> toChangesetFlow(@NotNull RealmResults<T> realmResults) {
        Intrinsics.checkNotNullParameter(realmResults, "<this>");
        BaseRealm baseRealm = realmResults.baseRealm;
        if (baseRealm instanceof Realm) {
            Realm realm = (Realm) baseRealm;
            Flow<CollectionChange<RealmResults<T>>> changesetFrom = realm.getConfiguration().getFlowFactory().changesetFrom(realm, realmResults);
            Intrinsics.checkNotNullExpressionValue(changesetFrom, "realmInstance.configurat…From(realmInstance, this)");
            return changesetFrom;
        } else if (baseRealm instanceof DynamicRealm) {
            DynamicRealm dynamicRealm = (DynamicRealm) baseRealm;
            Flow<CollectionChange<RealmResults<T>>> changesetFrom2 = dynamicRealm.getConfiguration().getFlowFactory().changesetFrom(dynamicRealm, realmResults);
            Intrinsics.checkNotNullExpressionValue(changesetFrom2, "realmInstance.configurat…From(realmInstance, this)");
            return changesetFrom2;
        } else {
            throw new IllegalStateException("Wrong type of Realm.");
        }
    }

    @NotNull
    public static final <T extends RealmModel> Flow<RealmResults<T>> toFlow(@NotNull RealmResults<T> realmResults) {
        Intrinsics.checkNotNullParameter(realmResults, "<this>");
        BaseRealm baseRealm = realmResults.baseRealm;
        if (baseRealm instanceof Realm) {
            Realm realm = (Realm) baseRealm;
            Flow<RealmResults<T>> from = realm.getConfiguration().getFlowFactory().from(realm, realmResults);
            Intrinsics.checkNotNullExpressionValue(from, "realmInstance.configurat…from(realmInstance, this)");
            return from;
        } else if (baseRealm instanceof DynamicRealm) {
            DynamicRealm dynamicRealm = (DynamicRealm) baseRealm;
            Flow<RealmResults<T>> from2 = dynamicRealm.getConfiguration().getFlowFactory().from(dynamicRealm, realmResults);
            Intrinsics.checkNotNullExpressionValue(from2, "realmInstance.configurat…from(realmInstance, this)");
            return from2;
        } else {
            throw new IllegalStateException("Wrong type of Realm.");
        }
    }
}
