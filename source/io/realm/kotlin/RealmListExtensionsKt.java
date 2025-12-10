package io.realm.kotlin;

import io.realm.BaseRealm;
import io.realm.DynamicRealm;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.p021rx.CollectionChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003\u001a\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0003¨\u0006\u0006"}, m28850d2 = {"toChangesetFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/rx/CollectionChange;", "Lio/realm/RealmList;", "T", "toFlow", "realm-kotlin-extensions_baseRelease"}, m28849k = 2, m28848mv = {1, 6, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class RealmListExtensionsKt {
    @NotNull
    public static final <T> Flow<CollectionChange<RealmList<T>>> toChangesetFlow(@NotNull RealmList<T> realmList) {
        Intrinsics.checkNotNullParameter(realmList, "<this>");
        BaseRealm baseRealm = realmList.baseRealm;
        if (baseRealm instanceof Realm) {
            Realm realm = (Realm) baseRealm;
            Flow<CollectionChange<RealmList<T>>> changesetFrom = realm.getConfiguration().getFlowFactory().changesetFrom(realm, realmList);
            Intrinsics.checkNotNullExpressionValue(changesetFrom, "realmInstance.configurat…From(realmInstance, this)");
            return changesetFrom;
        } else if (baseRealm instanceof DynamicRealm) {
            DynamicRealm dynamicRealm = (DynamicRealm) baseRealm;
            Flow<CollectionChange<RealmList<T>>> changesetFrom2 = dynamicRealm.getConfiguration().getFlowFactory().changesetFrom(dynamicRealm, realmList);
            Intrinsics.checkNotNullExpressionValue(changesetFrom2, "realmInstance.configurat…From(realmInstance, this)");
            return changesetFrom2;
        } else {
            throw new IllegalStateException("Wrong type of Realm.");
        }
    }

    @NotNull
    public static final <T> Flow<RealmList<T>> toFlow(@NotNull RealmList<T> realmList) {
        Intrinsics.checkNotNullParameter(realmList, "<this>");
        BaseRealm baseRealm = realmList.baseRealm;
        if (baseRealm instanceof Realm) {
            Realm realm = (Realm) baseRealm;
            Flow<RealmList<T>> from = realm.getConfiguration().getFlowFactory().from(realm, realmList);
            Intrinsics.checkNotNullExpressionValue(from, "realmInstance.configurat…from(realmInstance, this)");
            return from;
        } else if (baseRealm instanceof DynamicRealm) {
            DynamicRealm dynamicRealm = (DynamicRealm) baseRealm;
            Flow<RealmList<T>> from2 = dynamicRealm.getConfiguration().getFlowFactory().from(dynamicRealm, realmList);
            Intrinsics.checkNotNullExpressionValue(from2, "realmInstance.configurat…from(realmInstance, this)");
            return from2;
        } else {
            throw new IllegalStateException("Wrong type of Realm.");
        }
    }
}
