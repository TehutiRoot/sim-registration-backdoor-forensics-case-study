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
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import th.p047co.dtac.android.dtacone.model.database.CacheModel;

/* loaded from: classes5.dex */
public class th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy extends CacheModel implements RealmObjectProxy, InterfaceC11483x3f412e85 {

    /* renamed from: c */
    public static final OsObjectSchemaInfo f67047c = m29329a();

    /* renamed from: a */
    public C11482a f67048a;

    /* renamed from: b */
    public ProxyState f67049b;

    /* loaded from: classes5.dex */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CacheModel";
    }

    /* renamed from: io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy$a */
    /* loaded from: classes5.dex */
    public static final class C11482a extends ColumnInfo {

        /* renamed from: e */
        public long f67050e;

        /* renamed from: f */
        public long f67051f;

        /* renamed from: g */
        public long f67052g;

        public C11482a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.f67050e = addColumnDetails(Action.KEY_ATTRIBUTE, Action.KEY_ATTRIBUTE, objectSchemaInfo);
            this.f67051f = addColumnDetails("value", "value", objectSchemaInfo);
            this.f67052g = addColumnDetails("updatedDate", "updatedDate", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new C11482a(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            C11482a c11482a = (C11482a) columnInfo;
            C11482a c11482a2 = (C11482a) columnInfo2;
            c11482a2.f67050e = c11482a.f67050e;
            c11482a2.f67051f = c11482a.f67051f;
            c11482a2.f67052g = c11482a.f67052g;
        }

        public C11482a(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }
    }

    public th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy() {
        this.f67049b.setConstructionFinished();
    }

    /* renamed from: a */
    private static OsObjectSchemaInfo m29329a() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", ClassNameHelper.INTERNAL_CLASS_NAME, false, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        builder.addPersistedProperty("", Action.KEY_ATTRIBUTE, realmFieldType, true, false, false);
        builder.addPersistedProperty("", "value", realmFieldType, false, false, true);
        builder.addPersistedProperty("", "updatedDate", RealmFieldType.DATE, false, false, true);
        return builder.build();
    }

    /* renamed from: b */
    public static th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy m29328b(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().m29584d(CacheModel.class), false, Collections.emptyList());
        th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy th_co_dtac_android_dtacone_model_database_cachemodelrealmproxy = new th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy();
        realmObjectContext.clear();
        return th_co_dtac_android_dtacone_model_database_cachemodelrealmproxy;
    }

    /* renamed from: c */
    public static CacheModel m29327c(Realm realm, C11482a c11482a, CacheModel cacheModel, CacheModel cacheModel2, Map map, Set set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.m29725C(CacheModel.class), set);
        osObjectBuilder.addString(c11482a.f67050e, cacheModel2.realmGet$key());
        osObjectBuilder.addString(c11482a.f67051f, cacheModel2.realmGet$value());
        osObjectBuilder.addDate(c11482a.f67052g, cacheModel2.realmGet$updatedDate());
        osObjectBuilder.updateExistingTopLevelObject();
        return cacheModel;
    }

    public static CacheModel copy(Realm realm, C11482a c11482a, CacheModel cacheModel, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cacheModel);
        if (realmObjectProxy != null) {
            return (CacheModel) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.m29725C(CacheModel.class), set);
        osObjectBuilder.addString(c11482a.f67050e, cacheModel.realmGet$key());
        osObjectBuilder.addString(c11482a.f67051f, cacheModel.realmGet$value());
        osObjectBuilder.addDate(c11482a.f67052g, cacheModel.realmGet$updatedDate());
        th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy m29328b = m29328b(realm, osObjectBuilder.createNewObject());
        map.put(cacheModel, m29328b);
        return m29328b;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static th.p047co.dtac.android.dtacone.model.database.CacheModel copyOrUpdate(io.realm.Realm r8, io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.C11482a r9, th.p047co.dtac.android.dtacone.model.database.CacheModel r10, boolean r11, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r12, java.util.Set<io.realm.ImportFlag> r13) {
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
            th.co.dtac.android.dtacone.model.database.CacheModel r1 = (th.p047co.dtac.android.dtacone.model.database.CacheModel) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<th.co.dtac.android.dtacone.model.database.CacheModel> r2 = th.p047co.dtac.android.dtacone.model.database.CacheModel.class
            io.realm.internal.Table r2 = r8.m29725C(r2)
            long r3 = r9.f67050e
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
            io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy r1 = new io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy     // Catch: java.lang.Throwable -> L90
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
            th.co.dtac.android.dtacone.model.database.CacheModel r8 = m29327c(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            th.co.dtac.android.dtacone.model.database.CacheModel r8 = copy(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy$a, th.co.dtac.android.dtacone.model.database.CacheModel, boolean, java.util.Map, java.util.Set):th.co.dtac.android.dtacone.model.database.CacheModel");
    }

    public static C11482a createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new C11482a(osSchemaInfo);
    }

    public static CacheModel createDetachedCopy(CacheModel cacheModel, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CacheModel cacheModel2;
        if (i <= i2 && cacheModel != null) {
            RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(cacheModel);
            if (cacheData == null) {
                cacheModel2 = new CacheModel();
                map.put(cacheModel, new RealmObjectProxy.CacheData<>(i, cacheModel2));
            } else if (i >= cacheData.minDepth) {
                return (CacheModel) cacheData.object;
            } else {
                cacheData.minDepth = i;
                cacheModel2 = (CacheModel) cacheData.object;
            }
            Realm realm = (Realm) ((RealmObjectProxy) cacheModel).realmGet$proxyState().getRealm$realm();
            cacheModel2.realmSet$key(cacheModel.realmGet$key());
            cacheModel2.realmSet$value(cacheModel.realmGet$value());
            cacheModel2.realmSet$updatedDate(cacheModel.realmGet$updatedDate());
            return cacheModel2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static th.p047co.dtac.android.dtacone.model.database.CacheModel createOrUpdateUsingJsonObject(io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "key"
            java.lang.Class<th.co.dtac.android.dtacone.model.database.CacheModel> r2 = th.p047co.dtac.android.dtacone.model.database.CacheModel.class
            r3 = 0
            if (r15 == 0) goto L60
            io.realm.internal.Table r15 = r13.m29725C(r2)
            io.realm.RealmSchema r4 = r13.getSchema()
            io.realm.internal.ColumnInfo r4 = r4.m29584d(r2)
            io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy$a r4 = (io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.C11482a) r4
            long r4 = r4.f67050e
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
            io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy r15 = new io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy     // Catch: java.lang.Throwable -> L5b
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
            io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy r15 = (io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy) r15
            goto L8c
        L78:
            java.lang.String r15 = r14.getString(r1)
            io.realm.RealmModel r13 = r13.m29709z(r2, r15, r4, r0)
            r15 = r13
            io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy r15 = (io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy) r15
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
            java.lang.String r13 = "updatedDate"
            boolean r0 = r14.has(r13)
            if (r0 == 0) goto Ld5
            boolean r0 = r14.isNull(r13)
            if (r0 == 0) goto Lb7
            r15.realmSet$updatedDate(r3)
            goto Ld5
        Lb7:
            java.lang.Object r0 = r14.get(r13)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Lc9
            java.lang.String r0 = (java.lang.String) r0
            java.util.Date r13 = io.realm.internal.android.JsonUtils.stringToDate(r0)
            r15.realmSet$updatedDate(r13)
            goto Ld5
        Lc9:
            java.util.Date r0 = new java.util.Date
            long r13 = r14.getLong(r13)
            r0.<init>(r13)
            r15.realmSet$updatedDate(r0)
        Ld5:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):th.co.dtac.android.dtacone.model.database.CacheModel");
    }

    @TargetApi(11)
    public static CacheModel createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CacheModel cacheModel = new CacheModel();
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(Action.KEY_ATTRIBUTE)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    cacheModel.realmSet$key(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    cacheModel.realmSet$key(null);
                }
                z = true;
            } else if (nextName.equals("value")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    cacheModel.realmSet$value(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    cacheModel.realmSet$value(null);
                }
            } else if (nextName.equals("updatedDate")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    cacheModel.realmSet$updatedDate(null);
                } else if (jsonReader.peek() == JsonToken.NUMBER) {
                    long nextLong = jsonReader.nextLong();
                    if (nextLong > -1) {
                        cacheModel.realmSet$updatedDate(new Date(nextLong));
                    }
                } else {
                    cacheModel.realmSet$updatedDate(JsonUtils.stringToDate(jsonReader.nextString()));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (CacheModel) realm.copyToRealmOrUpdate((Realm) cacheModel, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return f67047c;
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    public static long insert(Realm realm, CacheModel cacheModel, Map<RealmModel, Long> map) {
        long nativeFindFirstString;
        if ((cacheModel instanceof RealmObjectProxy) && !RealmObject.isFrozen(cacheModel)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cacheModel;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table m29725C = realm.m29725C(CacheModel.class);
        long nativePtr = m29725C.getNativePtr();
        C11482a c11482a = (C11482a) realm.getSchema().m29584d(CacheModel.class);
        long j = c11482a.f67050e;
        String realmGet$key = cacheModel.realmGet$key();
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
        map.put(cacheModel, Long.valueOf(j2));
        String realmGet$value = cacheModel.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, c11482a.f67051f, j2, realmGet$value, false);
        }
        Date realmGet$updatedDate = cacheModel.realmGet$updatedDate();
        if (realmGet$updatedDate != null) {
            Table.nativeSetTimestamp(nativePtr, c11482a.f67052g, j2, realmGet$updatedDate.getTime(), false);
        }
        return j2;
    }

    public static long insertOrUpdate(Realm realm, CacheModel cacheModel, Map<RealmModel, Long> map) {
        long nativeFindFirstString;
        if ((cacheModel instanceof RealmObjectProxy) && !RealmObject.isFrozen(cacheModel)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cacheModel;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table m29725C = realm.m29725C(CacheModel.class);
        long nativePtr = m29725C.getNativePtr();
        C11482a c11482a = (C11482a) realm.getSchema().m29584d(CacheModel.class);
        long j = c11482a.f67050e;
        String realmGet$key = cacheModel.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(m29725C, j, realmGet$key);
        }
        long j2 = nativeFindFirstString;
        map.put(cacheModel, Long.valueOf(j2));
        String realmGet$value = cacheModel.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, c11482a.f67051f, j2, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, c11482a.f67051f, j2, false);
        }
        Date realmGet$updatedDate = cacheModel.realmGet$updatedDate();
        if (realmGet$updatedDate != null) {
            Table.nativeSetTimestamp(nativePtr, c11482a.f67052g, j2, realmGet$updatedDate.getTime(), false);
        } else {
            Table.nativeSetNull(nativePtr, c11482a.f67052g, j2, false);
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
        th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy th_co_dtac_android_dtacone_model_database_cachemodelrealmproxy = (th_co_dtac_android_dtacone_model_database_CacheModelRealmProxy) obj;
        BaseRealm realm$realm = this.f67049b.getRealm$realm();
        BaseRealm realm$realm2 = th_co_dtac_android_dtacone_model_database_cachemodelrealmproxy.f67049b.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String name = this.f67049b.getRow$realm().getTable().getName();
        String name2 = th_co_dtac_android_dtacone_model_database_cachemodelrealmproxy.f67049b.getRow$realm().getTable().getName();
        if (name == null ? name2 != null : !name.equals(name2)) {
            return false;
        }
        if (this.f67049b.getRow$realm().getObjectKey() == th_co_dtac_android_dtacone_model_database_cachemodelrealmproxy.f67049b.getRow$realm().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String path = this.f67049b.getRealm$realm().getPath();
        String name = this.f67049b.getRow$realm().getTable().getName();
        long objectKey = this.f67049b.getRow$realm().getObjectKey();
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
        if (this.f67049b != null) {
            return;
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        this.f67048a = (C11482a) realmObjectContext.getColumnInfo();
        ProxyState proxyState = new ProxyState(this);
        this.f67049b = proxyState;
        proxyState.setRealm$realm(realmObjectContext.m29753a());
        this.f67049b.setRow$realm(realmObjectContext.getRow());
        this.f67049b.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
        this.f67049b.setExcludeFields$realm(realmObjectContext.getExcludeFields());
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.CacheModel, io.realm.InterfaceC11483x3f412e85
    public String realmGet$key() {
        this.f67049b.getRealm$realm().checkIfValid();
        return this.f67049b.getRow$realm().getString(this.f67048a.f67050e);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.f67049b;
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.CacheModel, io.realm.InterfaceC11483x3f412e85
    public Date realmGet$updatedDate() {
        this.f67049b.getRealm$realm().checkIfValid();
        return this.f67049b.getRow$realm().getDate(this.f67048a.f67052g);
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.CacheModel, io.realm.InterfaceC11483x3f412e85
    public String realmGet$value() {
        this.f67049b.getRealm$realm().checkIfValid();
        return this.f67049b.getRow$realm().getString(this.f67048a.f67051f);
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.CacheModel, io.realm.InterfaceC11483x3f412e85
    public void realmSet$key(String str) {
        if (this.f67049b.isUnderConstruction()) {
            return;
        }
        this.f67049b.getRealm$realm().checkIfValid();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.CacheModel, io.realm.InterfaceC11483x3f412e85
    public void realmSet$updatedDate(Date date) {
        if (this.f67049b.isUnderConstruction()) {
            if (!this.f67049b.getAcceptDefaultValue$realm()) {
                return;
            }
            Row row$realm = this.f67049b.getRow$realm();
            if (date != null) {
                row$realm.getTable().setDate(this.f67048a.f67052g, row$realm.getObjectKey(), date, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'updatedDate' to null.");
        }
        this.f67049b.getRealm$realm().checkIfValid();
        if (date != null) {
            this.f67049b.getRow$realm().setDate(this.f67048a.f67052g, date);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'updatedDate' to null.");
    }

    @Override // th.p047co.dtac.android.dtacone.model.database.CacheModel, io.realm.InterfaceC11483x3f412e85
    public void realmSet$value(String str) {
        if (this.f67049b.isUnderConstruction()) {
            if (!this.f67049b.getAcceptDefaultValue$realm()) {
                return;
            }
            Row row$realm = this.f67049b.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.f67048a.f67051f, row$realm.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
        }
        this.f67049b.getRealm$realm().checkIfValid();
        if (str != null) {
            this.f67049b.getRow$realm().setString(this.f67048a.f67051f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
    }

    public String toString() {
        String str;
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CacheModel = proxy[");
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
        sb.append(",");
        sb.append("{updatedDate:");
        sb.append(realmGet$updatedDate());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long nativeFindFirstString;
        long j;
        long j2;
        Table m29725C = realm.m29725C(CacheModel.class);
        long nativePtr = m29725C.getNativePtr();
        C11482a c11482a = (C11482a) realm.getSchema().m29584d(CacheModel.class);
        long j3 = c11482a.f67050e;
        while (it.hasNext()) {
            CacheModel cacheModel = (CacheModel) it.next();
            if (!map.containsKey(cacheModel)) {
                if ((cacheModel instanceof RealmObjectProxy) && !RealmObject.isFrozen(cacheModel)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cacheModel;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(cacheModel, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                String realmGet$key = cacheModel.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j3, realmGet$key);
                }
                if (nativeFindFirstString == -1) {
                    j = OsObject.createRowWithPrimaryKey(m29725C, j3, realmGet$key);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$key);
                    j = nativeFindFirstString;
                }
                map.put(cacheModel, Long.valueOf(j));
                String realmGet$value = cacheModel.realmGet$value();
                if (realmGet$value != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, c11482a.f67051f, j, realmGet$value, false);
                } else {
                    j2 = j3;
                }
                Date realmGet$updatedDate = cacheModel.realmGet$updatedDate();
                if (realmGet$updatedDate != null) {
                    Table.nativeSetTimestamp(nativePtr, c11482a.f67052g, j, realmGet$updatedDate.getTime(), false);
                }
                j3 = j2;
            }
        }
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long nativeFindFirstString;
        long j;
        Table m29725C = realm.m29725C(CacheModel.class);
        long nativePtr = m29725C.getNativePtr();
        C11482a c11482a = (C11482a) realm.getSchema().m29584d(CacheModel.class);
        long j2 = c11482a.f67050e;
        while (it.hasNext()) {
            CacheModel cacheModel = (CacheModel) it.next();
            if (!map.containsKey(cacheModel)) {
                if ((cacheModel instanceof RealmObjectProxy) && !RealmObject.isFrozen(cacheModel)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cacheModel;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(cacheModel, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                String realmGet$key = cacheModel.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j2, realmGet$key);
                }
                long createRowWithPrimaryKey = nativeFindFirstString == -1 ? OsObject.createRowWithPrimaryKey(m29725C, j2, realmGet$key) : nativeFindFirstString;
                map.put(cacheModel, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$value = cacheModel.realmGet$value();
                if (realmGet$value != null) {
                    j = j2;
                    Table.nativeSetString(nativePtr, c11482a.f67051f, createRowWithPrimaryKey, realmGet$value, false);
                } else {
                    j = j2;
                    Table.nativeSetNull(nativePtr, c11482a.f67051f, createRowWithPrimaryKey, false);
                }
                Date realmGet$updatedDate = cacheModel.realmGet$updatedDate();
                if (realmGet$updatedDate != null) {
                    Table.nativeSetTimestamp(nativePtr, c11482a.f67052g, createRowWithPrimaryKey, realmGet$updatedDate.getTime(), false);
                } else {
                    Table.nativeSetNull(nativePtr, c11482a.f67052g, createRowWithPrimaryKey, false);
                }
                j2 = j;
            }
        }
    }
}
