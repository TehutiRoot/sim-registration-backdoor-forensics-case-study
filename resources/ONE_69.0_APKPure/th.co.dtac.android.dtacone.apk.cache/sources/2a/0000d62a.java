package io.realm.kotlin;

import io.realm.BaseRealm;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.internal.RealmObjectProxy;
import io.realm.p021rx.ObjectChange;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0004\u0018\u0001H\u0003¢\u0006\u0002\u0010\u0005\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0004\u0018\u0001H\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, m29142d2 = {"toChangesetFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/rx/ObjectChange;", "T", "Lio/realm/RealmModel;", "(Lio/realm/RealmModel;)Lkotlinx/coroutines/flow/Flow;", "toFlow", "realm-kotlin-extensions_baseRelease"}, m29141k = 2, m29140mv = {1, 6, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class RealmObjectExtensionsKt {
    @NotNull
    public static final <T extends RealmModel> Flow<ObjectChange<T>> toChangesetFlow(@Nullable T t) {
        Flow<ObjectChange<DynamicRealmObject>> flow;
        if (t != null) {
            if (t instanceof RealmObjectProxy) {
                BaseRealm realm$realm = ((RealmObjectProxy) t).realmGet$proxyState().getRealm$realm();
                if (realm$realm instanceof Realm) {
                    Realm realm = (Realm) realm$realm;
                    flow = realm.getConfiguration().getFlowFactory().changesetFrom(realm, (Realm) t);
                } else if (realm$realm instanceof DynamicRealm) {
                    DynamicRealm dynamicRealm = (DynamicRealm) realm$realm;
                    flow = dynamicRealm.getConfiguration().getFlowFactory().changesetFrom(dynamicRealm, (DynamicRealmObject) t);
                    if (flow == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<T of io.realm.kotlin.RealmObjectExtensionsKt.toChangesetFlow$lambda-3$lambda-2>?>");
                    }
                } else {
                    throw new UnsupportedOperationException(realm$realm.getClass() + " is not supported as a candidate for 'toFlow'. Only subclasses of RealmModel/RealmObject can be used.");
                }
            } else {
                return FlowKt.flowOf(new ObjectChange(t, null));
            }
        } else {
            flow = null;
        }
        if (flow == null) {
            return FlowKt.flowOf((Object) null);
        }
        return flow;
    }

    @NotNull
    public static final <T extends RealmModel> Flow<T> toFlow(@Nullable T t) {
        Flow<DynamicRealmObject> flow;
        if (t != null) {
            if (t instanceof RealmObjectProxy) {
                BaseRealm realm$realm = ((RealmObjectProxy) t).realmGet$proxyState().getRealm$realm();
                if (realm$realm instanceof Realm) {
                    Realm realm = (Realm) realm$realm;
                    flow = realm.getConfiguration().getFlowFactory().from(realm, (Realm) t);
                } else if (realm$realm instanceof DynamicRealm) {
                    DynamicRealm dynamicRealm = (DynamicRealm) realm$realm;
                    flow = dynamicRealm.getConfiguration().getFlowFactory().from(dynamicRealm, (DynamicRealmObject) t);
                    if (flow == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of io.realm.kotlin.RealmObjectExtensionsKt.toFlow$lambda-1$lambda-0?>");
                    }
                } else {
                    throw new UnsupportedOperationException(realm$realm.getClass() + " is not supported as a candidate for 'toFlow'. Only subclasses of RealmModel/RealmObject can be used.");
                }
            } else {
                return FlowKt.flowOf(t);
            }
        } else {
            flow = null;
        }
        if (flow == null) {
            return FlowKt.flowOf((Object) null);
        }
        return flow;
    }
}