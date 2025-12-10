package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonToken;
import ch.qos.logback.core.joran.action.Action;
import io.realm.BaseRealm;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import th.p047co.dtac.android.dtacone.model.database.SettingModel;

/* loaded from: classes5.dex */
public class th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy extends SettingModel implements RealmObjectProxy, InterfaceC11485x95ab4ed3 {

    /* renamed from: c */
    public static final OsObjectSchemaInfo f67053c = m29326a();

    /* renamed from: a */
    public C11484a f67054a;

    /* renamed from: b */
    public ProxyState f67055b;

    /* loaded from: classes5.dex */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SettingModel";
    }

    /* renamed from: io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy$a */
    /* loaded from: classes5.dex */
    public static final class C11484a extends ColumnInfo {

        /* renamed from: e */
        public long f67056e;

        /* renamed from: f */
        public long f67057f;

        public C11484a(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.f67056e = addColumnDetails(Action.KEY_ATTRIBUTE, Action.KEY_ATTRIBUTE, objectSchemaInfo);
            this.f67057f = addColumnDetails("value", "value", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new C11484a(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            C11484a c11484a = (C11484a) columnInfo;
            C11484a c11484a2 = (C11484a) columnInfo2;
            c11484a2.f67056e = c11484a.f67056e;
            c11484a2.f67057f = c11484a.f67057f;
        }

        public C11484a(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }
    }

    public th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy() {
        this.f67055b.setConstructionFinished();
    }

    /* renamed from: a */
    public static OsObjectSchemaInfo m29326a() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", ClassNameHelper.INTERNAL_CLASS_NAME, false, 2, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        builder.addPersistedProperty("", Action.KEY_ATTRIBUTE, realmFieldType, true, false, false);
        builder.addPersistedProperty("", "value", realmFieldType, false, false, true);
        return builder.build();
    }

    /* renamed from: b */
    public static th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy m29325b(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().m29584d(SettingModel.class), false, Collections.emptyList());
        th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy th_co_dtac_android_dtacone_model_database_settingmodelrealmproxy = new th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy();
        realmObjectContext.clear();
        return th_co_dtac_android_dtacone_model_database_settingmodelrealmproxy;
    }

    /* renamed from: c */
    public static SettingModel m29324c(Realm realm, C11484a c11484a, SettingModel settingModel, SettingModel settingModel2, Map map, Set set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.m29725C(SettingModel.class), set);
        osObjectBuilder.addString(c11484a.f67056e, settingModel2.realmGet$key());
        osObjectBuilder.addString(c11484a.f67057f, settingModel2.realmGet$value());
        osObjectBuilder.updateExistingTopLevelObject();
        return settingModel;
    }

    public static SettingModel copy(Realm realm, C11484a c11484a, SettingModel settingModel, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(settingModel);
        if (realmObjectProxy != null) {
            return (SettingModel) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.m29725C(SettingModel.class), set);
        osObjectBuilder.addString(c11484a.f67056e, settingModel.realmGet$key());
        osObjectBuilder.addString(c11484a.f67057f, settingModel.realmGet$value());
        th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy m29325b = m29325b(realm, osObjectBuilder.createNewObject());
        map.put(settingModel, m29325b);
        return m29325b;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static th.p047co.dtac.android.dtacone.model.database.SettingModel copyOrUpdate(io.realm.Realm r8, io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.C11484a r9, th.p047co.dtac.android.dtacone.model.database.SettingModel r10, boolean r11, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r12, java.util.Set<io.realm.ImportFlag> r13) {
        /*
            boolean r0 = r10 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.RealmObject.isFrozen(r10)
            if (r0 != 0) goto L3e
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L3e
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.f66472b
            long r3 = r8.f66472b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r10
        L36:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L3e:
            io.realm.BaseRealm$g r0 = io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L51
            th.co.dtac.android.dtacone.model.database.SettingModel r1 = (th.p047co.dtac.android.dtacone.model.database.SettingModel) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<th.co.dtac.android.dtacone.model.database.SettingModel> r2 = th.p047co.dtac.android.dtacone.model.database.SettingModel.class
            io.realm.internal.Table r2 = r8.m29725C(r2)
            long r3 = r9.f67056e
            java.lang.String r5 = r10.realmGet$key()
            if (r5 != 0) goto L67
            long r3 = r2.findFirstNull(r3)
            goto L6b
        L67:
            long r3 = r2.findFirstString(r3, r5)
        L6b:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L74
            r0 = 0
        L72:
            r3 = r1
            goto L95
        L74:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch: java.lang.Throwable -> L90
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L90
            r5 = 0
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L90
            io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy r1 = new io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L90
            r0.clear()
        L8e:
            r0 = r11
            goto L72
        L90:
            r8 = move-exception
            r0.clear()
            throw r8
        L95:
            if (r0 == 0) goto La1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            th.co.dtac.android.dtacone.model.database.SettingModel r8 = m29324c(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            th.co.dtac.android.dtacone.model.database.SettingModel r8 = copy(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy$a, th.co.dtac.android.dtacone.model.database.SettingModel, boolean, java.util.Map, java.util.Set):th.co.dtac.android.dtacone.model.database.SettingModel");
    }

    public static C11484a createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new C11484a(osSchemaInfo);
    }

    public static SettingModel createDetachedCopy(SettingModel settingModel, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SettingModel settingModel2;
        if (i <= i2 && settingModel != null) {
            RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(settingModel);
            if (cacheData == null) {
                settingModel2 = new SettingModel();
                map.put(settingModel, new RealmObjectProxy.CacheData<>(i, settingModel2));
            } else if (i >= cacheData.minDepth) {
                return (SettingModel) cacheData.object;
            } else {
                cacheData.minDepth = i;
                settingModel2 = (SettingModel) cacheData.object;
            }
            Realm realm = (Realm) ((RealmObjectProxy) settingModel).realmGet$proxyState().getRealm$realm();
            settingModel2.realmSet$key(settingModel.realmGet$key());
            settingModel2.realmSet$value(settingModel.realmGet$value());
            return settingModel2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static th.p047co.dtac.android.dtacone.model.database.SettingModel createOrUpdateUsingJsonObject(io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "key"
            java.lang.Class<th.co.dtac.android.dtacone.model.database.SettingModel> r2 = th.p047co.dtac.android.dtacone.model.database.SettingModel.class
            r3 = 0
            if (r15 == 0) goto L60
            io.realm.internal.Table r15 = r13.m29725C(r2)
            io.realm.RealmSchema r4 = r13.getSchema()
            io.realm.internal.ColumnInfo r4 = r4.m29584d(r2)
            io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy$a r4 = (io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.C11484a) r4
            long r4 = r4.f67056e
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L26
            long r4 = r15.findFirstNull(r4)
            goto L2e
        L26:
            java.lang.String r6 = r14.getString(r1)
            long r4 = r15.findFirstString(r4, r6)
        L2e:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L60
            io.realm.BaseRealm$g r6 = io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r15.getUncheckedRow(r4)     // Catch: java.lang.Throwable -> L5b
            io.realm.RealmSchema r15 = r13.getSchema()     // Catch: java.lang.Throwable -> L5b
            io.realm.internal.ColumnInfo r10 = r15.m29584d(r2)     // Catch: java.lang.Throwable -> L5b
            java.util.List r12 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L5b
            r11 = 0
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L5b
            io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy r15 = new io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy     // Catch: java.lang.Throwable -> L5b
            r15.<init>()     // Catch: java.lang.Throwable -> L5b
            r6.clear()
            goto L61
        L5b:
            r13 = move-exception
            r6.clear()
            throw r13
        L60:
            r15 = r3
        L61:
            if (r15 != 0) goto L8c
            boolean r15 = r14.has(r1)
            if (r15 == 0) goto L84
            boolean r15 = r14.isNull(r1)
            r4 = 1
            if (r15 == 0) goto L78
            io.realm.RealmModel r13 = r13.m29709z(r2, r3, r4, r0)
            r15 = r13
            io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy r15 = (io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy) r15
            goto L8c
        L78:
            java.lang.String r15 = r14.getString(r1)
            io.realm.RealmModel r13 = r13.m29709z(r2, r15, r4, r0)
            r15 = r13
            io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy r15 = (io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy) r15
            goto L8c
        L84:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'key'."
            r13.<init>(r14)
            throw r13
        L8c:
            java.lang.String r13 = "value"
            boolean r0 = r14.has(r13)
            if (r0 == 0) goto La5
            boolean r0 = r14.isNull(r13)
            if (r0 == 0) goto L9e
            r15.realmSet$value(r3)
            goto La5
        L9e:
            java.lang.String r13 = r14.getString(r13)
            r15.realmSet$value(r13)
        La5:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):th.co.dtac.android.dtacone.model.database.SettingModel");
    }

    @TargetApi(11)
    public static SettingModel createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SettingModel settingModel = new SettingModel();
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(Action.KEY_ATTRIBUTE)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    settingModel.realmSet$key(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    settingModel.realmSet$key(null);
                }
                z = true;
            } else if (nextName.equals("value")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    settingModel.realmSet$value(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    settingModel.realmSet$value(null);
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (SettingModel) realm.copyToRealmOrUpdate((Realm) settingModel, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return f67053c;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    public static long insert(Realm realm, SettingModel settingModel, Map<RealmModel, Long> map) {
        long nativeFindFirstString;
        if ((settingModel instanceof RealmObjectProxy) && !RealmObject.isFrozen(settingModel)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) settingModel;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table m29725C = realm.m29725C(SettingModel.class);
        long nativePtr = m29725C.getNativePtr();
        C11484a c11484a = (C11484a) realm.getSchema().m29584d(SettingModel.class);
        long j = c11484a.f67056e;
        String realmGet$key = settingModel.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(m29725C, j, realmGet$key);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$key);
        }
        long j2 = nativeFindFirstString;
        map.put(settingModel, Long.valueOf(j2));
        String realmGet$value = settingModel.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, c11484a.f67057f, j2, realmGet$value, false);
        }
        return j2;
    }

    public static long insertOrUpdate(Realm realm, SettingModel settingModel, Map<RealmModel, Long> map) {
        long nativeFindFirstString;
        if ((settingModel instanceof RealmObjectProxy) && !RealmObject.isFrozen(settingModel)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) settingModel;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table m29725C = realm.m29725C(SettingModel.class);
        long nativePtr = m29725C.getNativePtr();
        C11484a c11484a = (C11484a) realm.getSchema().m29584d(SettingModel.class);
        long j = c11484a.f67056e;
        String realmGet$key = settingModel.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(m29725C, j, realmGet$key);
        }
        long j2 = nativeFindFirstString;
        map.put(settingModel, Long.valueOf(j2));
        String realmGet$value = settingModel.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, c11484a.f67057f, j2, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, c11484a.f67057f, j2, false);
        }
        return j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy th_co_dtac_android_dtacone_model_database_settingmodelrealmproxy = (th_co_dtac_android_dtacone_model_database_SettingModelRealmProxy) obj;
        BaseRealm realm$realm = this.f67055b.getRealm$realm();
        BaseRealm realm$realm2 = th_co_dtac_android_dtacone_model_database_settingmodelrealmproxy.f67055b.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String name = this.f67055b.getRow$realm().getTable().getName();
        String name2 = th_co_dtac_android_dtacone_model_database_settingmodelrealmproxy.f67055b.getRow$realm().getTable().getName();
        if (name == null ? name2 != null : !name.equals(name2)) {
            return false;
        }
        if (this.f67055b.getRow$realm().getObjectKey() == th_co_dtac_android_dtacone_model_database_settingmodelrealmproxy.f67055b.getRow$realm().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String path = this.f67055b.getRealm$realm().getPath();
        String name = this.f67055b.getRow$realm().getTable().getName();
        long objectKey = this.f67055b.getRow$realm().getObjectKey();
        int i2 = 0;
        if (path != null) {
            i = path.hashCode();
        } else {
            i = 0;
        }
        int i3 = (527 + i) * 31;
        if (name != null) {
            i2 = name.hashCode();
        }
        return ((i3 + i2) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
        if (this.f67055b != null) {
            return;
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        this.f67054a = (C11484a) realmObjectContext.getColumnInfo();
        ProxyState proxyState = new ProxyState(this);
        this.f67055b = proxyState;
        proxyState.setRealm$realm(realmObjectContext.m29753a());
        this.f67055b.setRow$realm(realmObjectContext.getRow());
        this.f67055b.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.f67055b.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.SettingModel, io.realm.InterfaceC11485x95ab4ed3
    public String realmGet$key() {
        this.f67055b.getRealm$realm().checkIfValid();
        return this.f67055b.getRow$realm().getString(this.f67054a.f67056e);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.f67055b;
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.SettingModel, io.realm.InterfaceC11485x95ab4ed3
    public String realmGet$value() {
        this.f67055b.getRealm$realm().checkIfValid();
        return this.f67055b.getRow$realm().getString(this.f67054a.f67057f);
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.SettingModel, io.realm.InterfaceC11485x95ab4ed3
    public void realmSet$key(String str) {
        if (this.f67055b.isUnderConstruction()) {
            return;
        }
        this.f67055b.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.SettingModel, io.realm.InterfaceC11485x95ab4ed3
    public void realmSet$value(String str) {
        if (this.f67055b.isUnderConstruction()) {
            if (!this.f67055b.getAcceptDefaultValue$realm()) {
                return;
            }
            Row row$realm = this.f67055b.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.f67054a.f67057f, row$realm.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
        }
        this.f67055b.getRealm$realm().checkIfValid();
        if (str != null) {
            this.f67055b.getRow$realm().setString(this.f67054a.f67057f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
    }

    public String toString() {
        String str;
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("SettingModel = proxy[");
        sb.append("{key:");
        if (realmGet$key() != null) {
            str = realmGet$key();
        } else {
            str = AbstractJsonLexerKt.NULL;
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        sb.append(realmGet$value());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long nativeFindFirstString;
        long j;
        Table m29725C = realm.m29725C(SettingModel.class);
        long nativePtr = m29725C.getNativePtr();
        C11484a c11484a = (C11484a) realm.getSchema().m29584d(SettingModel.class);
        long j2 = c11484a.f67056e;
        while (it.hasNext()) {
            SettingModel settingModel = (SettingModel) it.next();
            if (!map.containsKey(settingModel)) {
                if ((settingModel instanceof RealmObjectProxy) && !RealmObject.isFrozen(settingModel)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) settingModel;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(settingModel, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                String realmGet$key = settingModel.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j2, realmGet$key);
                }
                if (nativeFindFirstString == -1) {
                    j = OsObject.createRowWithPrimaryKey(m29725C, j2, realmGet$key);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$key);
                    j = nativeFindFirstString;
                }
                map.put(settingModel, Long.valueOf(j));
                String realmGet$value = settingModel.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, c11484a.f67057f, j, realmGet$value, false);
                }
            }
        }
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long nativeFindFirstString;
        Table m29725C = realm.m29725C(SettingModel.class);
        long nativePtr = m29725C.getNativePtr();
        C11484a c11484a = (C11484a) realm.getSchema().m29584d(SettingModel.class);
        long j = c11484a.f67056e;
        while (it.hasNext()) {
            SettingModel settingModel = (SettingModel) it.next();
            if (!map.containsKey(settingModel)) {
                if ((settingModel instanceof RealmObjectProxy) && !RealmObject.isFrozen(settingModel)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) settingModel;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(settingModel, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                String realmGet$key = settingModel.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$key);
                }
                long createRowWithPrimaryKey = nativeFindFirstString == -1 ? OsObject.createRowWithPrimaryKey(m29725C, j, realmGet$key) : nativeFindFirstString;
                map.put(settingModel, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$value = settingModel.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, c11484a.f67057f, createRowWithPrimaryKey, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, c11484a.f67057f, createRowWithPrimaryKey, false);
                }
            }
        }
    }
}
