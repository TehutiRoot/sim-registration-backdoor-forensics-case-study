package io.realm;

import android.util.JsonReader;
import io.realm.BaseRealm;
import io.realm.annotations.RealmModule;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy;
import io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.model.database.CacheModel;
import th.p047co.dtac.android.dtacone.model.database.SettingModel;

@RealmModule
/* loaded from: classes5.dex */
class DefaultRealmModuleMediator extends RealmProxyMediator {

    /* renamed from: a */
    public static final Set f66554a;

    static {
        HashSet hashSet = new HashSet(2);
        hashSet.add(SettingModel.class);
        hashSet.add(CacheModel.class);
        f66554a = Collections.unmodifiableSet(hashSet);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public RealmModel copyOrUpdate(Realm realm, RealmModel realmModel, boolean z, Map map, Set set) {
        Class<?> cls;
        if (realmModel instanceof RealmObjectProxy) {
            cls = realmModel.getClass().getSuperclass();
        } else {
            cls = realmModel.getClass();
        }
        if (cls.equals(SettingModel.class)) {
            return (RealmModel) cls.cast(th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.copyOrUpdate(realm, (th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.C11471a) realm.getSchema().m29924d(SettingModel.class), (SettingModel) realmModel, z, map, set));
        }
        if (cls.equals(CacheModel.class)) {
            return (RealmModel) cls.cast(th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.copyOrUpdate(realm, (th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.C11469a) realm.getSchema().m29924d(CacheModel.class), (CacheModel) realmModel, z, map, set));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public ColumnInfo createColumnInfo(Class cls, OsSchemaInfo osSchemaInfo) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(SettingModel.class)) {
            return th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(CacheModel.class)) {
            return th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.createColumnInfo(osSchemaInfo);
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public RealmModel createDetachedCopy(RealmModel realmModel, int i, Map map) {
        Class<? super Object> superclass = realmModel.getClass().getSuperclass();
        if (superclass.equals(SettingModel.class)) {
            return (RealmModel) superclass.cast(th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.createDetachedCopy((SettingModel) realmModel, 0, i, map));
        }
        if (superclass.equals(CacheModel.class)) {
            return (RealmModel) superclass.cast(th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.createDetachedCopy((CacheModel) realmModel, 0, i, map));
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public RealmModel createOrUpdateUsingJsonObject(Class cls, Realm realm, JSONObject jSONObject, boolean z) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(SettingModel.class)) {
            return (RealmModel) cls.cast(th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
        }
        if (cls.equals(CacheModel.class)) {
            return (RealmModel) cls.cast(th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public RealmModel createUsingJsonStream(Class cls, Realm realm, JsonReader jsonReader) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(SettingModel.class)) {
            return (RealmModel) cls.cast(th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(CacheModel.class)) {
            return (RealmModel) cls.cast(th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Class getClazzImpl(String str) {
        RealmProxyMediator.checkClassName(str);
        if (str.equals(th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return SettingModel.class;
        }
        if (str.equals(th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME)) {
            return CacheModel.class;
        }
        throw RealmProxyMediator.getMissingProxyClassException(str);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Map getExpectedObjectSchemaInfoMap() {
        HashMap hashMap = new HashMap(2);
        hashMap.put(SettingModel.class, th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CacheModel.class, th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.getExpectedObjectSchemaInfo());
        return hashMap;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Set getModelClasses() {
        return f66554a;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public String getSimpleClassNameImpl(Class cls) {
        RealmProxyMediator.checkClass(cls);
        if (cls.equals(SettingModel.class)) {
            return th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        if (cls.equals(CacheModel.class)) {
            return th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean hasPrimaryKeyImpl(Class cls) {
        if (!SettingModel.class.isAssignableFrom(cls) && !CacheModel.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insert(Realm realm, RealmModel realmModel, Map map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(SettingModel.class)) {
            return th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.insert(realm, (SettingModel) realmModel, map);
        }
        if (superclass.equals(CacheModel.class)) {
            return th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.insert(realm, (CacheModel) realmModel, map);
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insertOrUpdate(Realm realm, RealmModel realmModel, Map map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(SettingModel.class)) {
            return th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.insertOrUpdate(realm, (SettingModel) realmModel, map);
        }
        if (superclass.equals(CacheModel.class)) {
            return th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.insertOrUpdate(realm, (CacheModel) realmModel, map);
        }
        throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean isEmbedded(Class cls) {
        if (cls.equals(SettingModel.class) || cls.equals(CacheModel.class)) {
            return false;
        }
        throw RealmProxyMediator.getMissingProxyClassException(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public RealmModel newInstance(Class cls, Object obj, Row row, ColumnInfo columnInfo, boolean z, List list) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        try {
            realmObjectContext.set((BaseRealm) obj, row, columnInfo, z, list);
            RealmProxyMediator.checkClass(cls);
            if (cls.equals(SettingModel.class)) {
                return (RealmModel) cls.cast(new th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy());
            }
            if (cls.equals(CacheModel.class)) {
                return (RealmModel) cls.cast(new th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy());
            }
            throw RealmProxyMediator.getMissingProxyClassException(cls);
        } finally {
            realmObjectContext.clear();
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean transformerApplied() {
        return true;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void updateEmbeddedObject(Realm realm, RealmModel realmModel, RealmModel realmModel2, Map map, Set set) {
        Class<? super Object> superclass = realmModel2.getClass().getSuperclass();
        if (!superclass.equals(SettingModel.class)) {
            if (superclass.equals(CacheModel.class)) {
                throw RealmProxyMediator.getNotEmbeddedClassException("th.co.dtac.android.dtacone.model.database.CacheModel");
            }
            throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
        }
        throw RealmProxyMediator.getNotEmbeddedClassException("th.co.dtac.android.dtacone.model.database.SettingModel");
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insert(Realm realm, Collection collection) {
        Iterator it = collection.iterator();
        HashMap hashMap = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel realmModel = (RealmModel) it.next();
            Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
            if (superclass.equals(SettingModel.class)) {
                th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.insert(realm, (SettingModel) realmModel, hashMap);
            } else if (superclass.equals(CacheModel.class)) {
                th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.insert(realm, (CacheModel) realmModel, hashMap);
            } else {
                throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
            if (it.hasNext()) {
                if (superclass.equals(SettingModel.class)) {
                    th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.insert(realm, it, hashMap);
                } else if (superclass.equals(CacheModel.class)) {
                    th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.insert(realm, it, hashMap);
                } else {
                    throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                }
            }
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insertOrUpdate(Realm realm, Collection collection) {
        Iterator it = collection.iterator();
        HashMap hashMap = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel realmModel = (RealmModel) it.next();
            Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
            if (superclass.equals(SettingModel.class)) {
                th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.insertOrUpdate(realm, (SettingModel) realmModel, hashMap);
            } else if (superclass.equals(CacheModel.class)) {
                th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.insertOrUpdate(realm, (CacheModel) realmModel, hashMap);
            } else {
                throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
            }
            if (it.hasNext()) {
                if (superclass.equals(SettingModel.class)) {
                    th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.insertOrUpdate(realm, it, hashMap);
                } else if (superclass.equals(CacheModel.class)) {
                    th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.insertOrUpdate(realm, it, hashMap);
                } else {
                    throw RealmProxyMediator.getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                }
            }
        }
    }
}