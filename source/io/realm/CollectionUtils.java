package io.realm;

import io.realm.RealmAny;
import io.realm.internal.OsObjectStore;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class CollectionUtils {
    public static final String DICTIONARY_TYPE = "dictionary";
    public static final String LIST_TYPE = "list";
    public static final String SET_TYPE = "set";

    /* renamed from: a */
    public static boolean m29751a(BaseRealm baseRealm, RealmModel realmModel, String str, String str2) {
        if (realmModel instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmModel;
            if (realmObjectProxy instanceof DynamicRealmObject) {
                if (realmObjectProxy.realmGet$proxyState().getRealm$realm() == baseRealm) {
                    String type = ((DynamicRealmObject) realmModel).getType();
                    if (str.equals(RealmAny.class.getCanonicalName()) || str.equals(type)) {
                        return false;
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "The object has a different type from %s's. Type of the %s is '%s', type of object is '%s'.", str2, str2, str, type));
                } else if (baseRealm.f66472b == realmObjectProxy.realmGet$proxyState().getRealm$realm().f66472b) {
                    throw new IllegalArgumentException("Cannot pass DynamicRealmObject between Realm instances.");
                } else {
                    throw new IllegalStateException("Cannot pass an object to a Realm instance created in another thread.");
                }
            } else if (realmObjectProxy.realmGet$proxyState().getRow$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(baseRealm.getPath())) {
                if (baseRealm == realmObjectProxy.realmGet$proxyState().getRealm$realm()) {
                    return false;
                }
                throw new IllegalArgumentException("Cannot pass an object from another Realm instance.");
            }
        }
        return true;
    }

    /* renamed from: b */
    public static RealmAny m29750b(BaseRealm baseRealm, RealmAny realmAny) {
        if (realmAny.getType() == RealmAny.Type.OBJECT) {
            Class<?> valueClass = realmAny.getValueClass();
            RealmModel asRealmModel = realmAny.asRealmModel(valueClass);
            if (asRealmModel instanceof RealmObjectProxy) {
                RealmObjectProxy realmObjectProxy = (RealmObjectProxy) asRealmModel;
                if (realmObjectProxy instanceof DynamicRealmObject) {
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() == baseRealm) {
                        return realmAny;
                    }
                    if (baseRealm.f66472b == realmObjectProxy.realmGet$proxyState().getRealm$realm().f66472b) {
                        throw new IllegalArgumentException("Cannot copy DynamicRealmObject between Realm instances.");
                    }
                    throw new IllegalStateException("Cannot copy an object to a Realm instance created in another thread.");
                } else if (!baseRealm.getSchema().m29582f(valueClass).isEmbedded()) {
                    if (realmObjectProxy.realmGet$proxyState().getRow$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(baseRealm.getPath())) {
                        if (baseRealm == realmObjectProxy.realmGet$proxyState().getRealm$realm()) {
                            return realmAny;
                        }
                        throw new IllegalArgumentException("Cannot copy an object from another Realm instance.");
                    }
                } else {
                    throw new IllegalArgumentException("Embedded objects are not supported by RealmAny.");
                }
            }
            return RealmAny.valueOf(copyToRealm(baseRealm, asRealmModel));
        }
        return realmAny;
    }

    /* renamed from: c */
    public static boolean m29749c(Class cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    public static void checkForAddRemoveListener(BaseRealm baseRealm, @Nullable Object obj, boolean z) {
        if (z && obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        baseRealm.checkIfValid();
        baseRealm.sharedRealm.capabilities.checkCanDeliverNotification("Listeners cannot be used on current thread.");
    }

    public static <E extends RealmModel> E copyToRealm(BaseRealm baseRealm, E e) {
        Realm realm = (Realm) baseRealm;
        if (OsObjectStore.getPrimaryKeyForObject(realm.m29754n(), realm.getConfiguration().getSchemaMediator().getSimpleClassName(e.getClass())) != null) {
            return (E) realm.copyToRealmOrUpdate((Realm) e, new ImportFlag[0]);
        }
        return (E) realm.copyToRealm((Realm) e, new ImportFlag[0]);
    }

    /* renamed from: d */
    public static boolean m29748d(BaseRealm baseRealm, RealmModel realmModel) {
        if (baseRealm instanceof Realm) {
            return baseRealm.getSchema().m29582f(realmModel.getClass()).isEmbedded();
        }
        return baseRealm.getSchema().m29581g(((DynamicRealmObject) realmModel).getType()).isEmbedded();
    }

    /* renamed from: e */
    public static void m29747e(Realm realm, RealmModel realmModel, long j) {
        RealmProxyMediator schemaMediator = realm.getConfiguration().getSchemaMediator();
        Class<? extends RealmModel> originalModelClass = Util.getOriginalModelClass(realmModel.getClass());
        schemaMediator.updateEmbeddedObject(realm, realmModel, schemaMediator.newInstance(originalModelClass, realm, realm.m29725C(originalModelClass).getUncheckedRow(j), realm.getSchema().m29584d(originalModelClass), true, Collections.EMPTY_LIST), new HashMap(), Collections.EMPTY_SET);
    }
}
