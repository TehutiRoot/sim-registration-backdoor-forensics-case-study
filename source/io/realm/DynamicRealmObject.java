package io.realm;

import ch.qos.logback.classic.spi.CallerData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.android.JsonUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class DynamicRealmObject extends RealmObject implements RealmObjectProxy {

    /* renamed from: a */
    public final ProxyState f66507a;

    /* loaded from: classes5.dex */
    public enum CollectionType {
        LIST,
        DICTIONARY,
        SET
    }

    /* renamed from: io.realm.DynamicRealmObject$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11235a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66508a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f66509b;

        static {
            int[] iArr = new int[CollectionType.values().length];
            f66509b = iArr;
            try {
                iArr[CollectionType.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66509b[CollectionType.DICTIONARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66509b[CollectionType.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RealmFieldType.values().length];
            f66508a = iArr2;
            try {
                iArr2[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66508a[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66508a[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66508a[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66508a[RealmFieldType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66508a[RealmFieldType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66508a[RealmFieldType.DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66508a[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66508a[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f66508a[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f66508a[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f66508a[RealmFieldType.OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f66508a[RealmFieldType.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f66508a[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f66508a[RealmFieldType.INTEGER_SET.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f66508a[RealmFieldType.BOOLEAN_SET.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f66508a[RealmFieldType.STRING_SET.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f66508a[RealmFieldType.BINARY_SET.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f66508a[RealmFieldType.DATE_SET.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f66508a[RealmFieldType.FLOAT_SET.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f66508a[RealmFieldType.DOUBLE_SET.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f66508a[RealmFieldType.DECIMAL128_SET.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f66508a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f66508a[RealmFieldType.UUID_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f66508a[RealmFieldType.LINK_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f66508a[RealmFieldType.MIXED_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f66508a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f66508a[RealmFieldType.INTEGER_LIST.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f66508a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f66508a[RealmFieldType.STRING_LIST.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f66508a[RealmFieldType.BINARY_LIST.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f66508a[RealmFieldType.DATE_LIST.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f66508a[RealmFieldType.FLOAT_LIST.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f66508a[RealmFieldType.DOUBLE_LIST.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f66508a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 46;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f66508a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 47;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f66508a[RealmFieldType.UUID_LIST.ordinal()] = 48;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f66508a[RealmFieldType.MIXED_LIST.ordinal()] = 49;
            } catch (NoSuchFieldError unused52) {
            }
        }
    }

    public DynamicRealmObject(RealmModel realmModel) {
        ProxyState proxyState = new ProxyState(this);
        this.f66507a = proxyState;
        if (realmModel != null) {
            if (!(realmModel instanceof DynamicRealmObject)) {
                if (RealmObject.isManaged(realmModel)) {
                    if (RealmObject.isValid(realmModel)) {
                        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmModel;
                        Row row$realm = realmObjectProxy.realmGet$proxyState().getRow$realm();
                        proxyState.setRealm$realm(realmObjectProxy.realmGet$proxyState().getRealm$realm());
                        proxyState.setRow$realm(((UncheckedRow) row$realm).convertToChecked());
                        proxyState.setConstructionFinished();
                        return;
                    }
                    throw new IllegalArgumentException("A valid object managed by Realm must be provided. This object was deleted.");
                }
                throw new IllegalArgumentException("An object managed by Realm must be provided. This is an unmanaged object.");
            }
            throw new IllegalArgumentException("The object is already a DynamicRealmObject: " + realmModel);
        }
        throw new IllegalArgumentException("A non-null object must be provided.");
    }

    /* renamed from: j */
    private void m29735j(String str, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class) {
            setBoolean(str, ((Boolean) obj).booleanValue());
        } else if (cls == Short.class) {
            setShort(str, ((Short) obj).shortValue());
        } else if (cls == Integer.class) {
            setInt(str, ((Integer) obj).intValue());
        } else if (cls == Long.class) {
            setLong(str, ((Long) obj).longValue());
        } else if (cls == Byte.class) {
            setByte(str, ((Byte) obj).byteValue());
        } else if (cls == Float.class) {
            setFloat(str, ((Float) obj).floatValue());
        } else if (cls == Double.class) {
            setDouble(str, ((Double) obj).doubleValue());
        } else if (cls == String.class) {
            setString(str, (String) obj);
        } else if (obj instanceof Date) {
            setDate(str, (Date) obj);
        } else if (obj instanceof byte[]) {
            setBlob(str, (byte[]) obj);
        } else if (cls == DynamicRealmObject.class) {
            setObject(str, (DynamicRealmObject) obj);
        } else if (cls == RealmList.class) {
            setList(str, (RealmList) obj);
        } else if (cls == Decimal128.class) {
            setDecimal128(str, (Decimal128) obj);
        } else if (cls == ObjectId.class) {
            setObjectId(str, (ObjectId) obj);
        } else if (cls == UUID.class) {
            setUUID(str, (UUID) obj);
        } else if (cls == RealmAny.class) {
            setRealmAny(str, (RealmAny) obj);
        } else {
            throw new IllegalArgumentException("Value is of an type not supported: " + obj.getClass());
        }
    }

    /* renamed from: a */
    public final void m29744a(String str, long j, RealmFieldType realmFieldType) {
        Object obj;
        RealmFieldType columnType = this.f66507a.getRow$realm().getColumnType(j);
        if (columnType != realmFieldType) {
            RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
            String str2 = OperatorName.ENDPATH;
            if (realmFieldType != realmFieldType2 && realmFieldType != RealmFieldType.OBJECT) {
                obj = "";
            } else {
                obj = OperatorName.ENDPATH;
            }
            if (columnType != realmFieldType2 && columnType != RealmFieldType.OBJECT) {
                str2 = "";
            }
            throw new IllegalArgumentException(String.format(Locale.US, "'%s' is not a%s '%s', but a%s '%s'.", str, obj, realmFieldType, str2, columnType));
        }
    }

    /* renamed from: b */
    public final void m29743b(String str) {
        RealmObjectSchema m29581g = this.f66507a.getRealm$realm().getSchema().m29581g(getType());
        if (m29581g.hasPrimaryKey() && m29581g.getPrimaryKey().equals(str)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Primary key field '%s' cannot be changed after object was created.", str));
        }
    }

    /* renamed from: c */
    public final AbstractC17619Fn0 m29742c(BaseRealm baseRealm, OsList osList, RealmFieldType realmFieldType, Class cls) {
        if (realmFieldType == RealmFieldType.STRING_LIST) {
            return new UM1(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.INTEGER_LIST) {
            return new C17681Gm0(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.BOOLEAN_LIST) {
            return new C5380bc(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.BINARY_LIST) {
            return new C10393hb(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DOUBLE_LIST) {
            return new C1378TJ(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.FLOAT_LIST) {
            return new R20(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DATE_LIST) {
            return new C0999OD(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DECIMAL128_LIST) {
            return new C5430cE(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.OBJECT_ID_LIST) {
            return new PJ0(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.UUID_LIST) {
            return new TW1(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.MIXED_LIST) {
            return new C21488os1(baseRealm, osList, cls);
        }
        throw new IllegalArgumentException("Unexpected list type: " + realmFieldType.name());
    }

    /* renamed from: d */
    public final RealmAny m29741d(long j) {
        return new RealmAny(RealmAnyOperator.m29704b(this.f66507a.getRealm$realm(), this.f66507a.getRow$realm().getNativeRealmAny(j)));
    }

    /* renamed from: e */
    public final int m29740e(Class cls) {
        if (!cls.equals(Integer.class) && !cls.equals(Long.class) && !cls.equals(Short.class) && !cls.equals(Byte.class)) {
            if (cls.equals(Boolean.class)) {
                return 1;
            }
            if (cls.equals(String.class)) {
                return 2;
            }
            if (cls.equals(byte[].class)) {
                return 4;
            }
            if (cls.equals(Date.class)) {
                return 8;
            }
            if (cls.equals(Float.class)) {
                return 9;
            }
            if (cls.equals(Double.class)) {
                return 10;
            }
            if (cls.equals(Decimal128.class)) {
                return 11;
            }
            if (cls.equals(ObjectId.class)) {
                return 15;
            }
            if (cls.equals(UUID.class)) {
                return 17;
            }
            if (cls.equals(RealmAny.class)) {
                return 6;
            }
            throw new IllegalArgumentException("Unsupported element type. Only primitive types supported. Yours was: " + cls);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        this.f66507a.getRealm$realm().checkIfValid();
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) obj;
        String path = this.f66507a.getRealm$realm().getPath();
        String path2 = dynamicRealmObject.f66507a.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.f66507a.getRow$realm().getTable().getName();
        String name2 = dynamicRealmObject.f66507a.getRow$realm().getTable().getName();
        if (name == null ? name2 != null : !name.equals(name2)) {
            return false;
        }
        if (this.f66507a.getRow$realm().getObjectKey() == dynamicRealmObject.f66507a.getRow$realm().getObjectKey()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final RealmFieldType m29739f(CollectionType collectionType, Class cls) {
        int i;
        int m29740e = m29740e(cls);
        int i2 = C11235a.f66509b[collectionType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = m29740e + 128;
                } else {
                    throw new IllegalArgumentException("Type not supported: " + collectionType);
                }
            } else {
                i = m29740e + 512;
            }
        } else {
            i = m29740e + 256;
        }
        return RealmFieldType.fromNativeValue(i);
    }

    /* renamed from: g */
    public final void m29738g(String str, RealmDictionary realmDictionary) {
        String className;
        boolean z;
        OsMap modelMap = this.f66507a.getRow$realm().getModelMap(this.f66507a.getRow$realm().getColumnKey(str));
        Table targetTable = modelMap.getTargetTable();
        String className2 = targetTable.getClassName();
        if (!realmDictionary.isManaged()) {
            z = false;
        } else {
            if (realmDictionary.m29639b() != null) {
                className = realmDictionary.m29639b();
            } else {
                className = this.f66507a.getRealm$realm().getSchema().m29580h(realmDictionary.m29640a()).getClassName();
            }
            if (className2.equals(className)) {
                z = true;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "The elements in the dictionary are not the proper type. Was %s expected %s.", className, className2));
            }
        }
        RealmDictionary realmDictionary2 = new RealmDictionary();
        Iterator it = realmDictionary.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) entry.getValue();
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() == this.f66507a.getRealm$realm()) {
                if (!z && !targetTable.hasSameSchema(realmObjectProxy.realmGet$proxyState().getRow$realm().getTable())) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Element with key %s is not the proper type. Was '%s' expected '%s'.", entry.getKey(), realmObjectProxy.realmGet$proxyState().getRow$realm().getTable().getClassName(), className2));
                }
                realmDictionary2.put((String) entry.getKey(), Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
            } else {
                throw new IllegalArgumentException("Each element in 'dictionary' must belong to the same Realm instance.");
            }
        }
        modelMap.clear();
        Iterator it2 = realmDictionary2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            modelMap.putRow(entry2.getKey(), ((Long) entry2.getValue()).longValue());
        }
    }

    public <E> E get(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        if (this.f66507a.getRow$realm().isNull(columnKey)) {
            return null;
        }
        RealmFieldType columnType = this.f66507a.getRow$realm().getColumnType(columnKey);
        switch (C11235a.f66508a[columnType.ordinal()]) {
            case 1:
                return (E) Boolean.valueOf(this.f66507a.getRow$realm().getBoolean(columnKey));
            case 2:
                return (E) Long.valueOf(this.f66507a.getRow$realm().getLong(columnKey));
            case 3:
                return (E) Float.valueOf(this.f66507a.getRow$realm().getFloat(columnKey));
            case 4:
                return (E) Double.valueOf(this.f66507a.getRow$realm().getDouble(columnKey));
            case 5:
                return (E) this.f66507a.getRow$realm().getString(columnKey);
            case 6:
                return (E) this.f66507a.getRow$realm().getBinaryByteArray(columnKey);
            case 7:
                return (E) this.f66507a.getRow$realm().getDate(columnKey);
            case 8:
                return (E) this.f66507a.getRow$realm().getDecimal128(columnKey);
            case 9:
                return (E) this.f66507a.getRow$realm().getObjectId(columnKey);
            case 10:
                return (E) m29741d(columnKey);
            case 11:
                return (E) this.f66507a.getRow$realm().getUUID(columnKey);
            case 12:
                return (E) getObject(str);
            case 13:
                return (E) getList(str);
            case 14:
                return (E) getDictionary(str, Integer.class);
            case 15:
                return (E) getDictionary(str, Boolean.class);
            case 16:
                return (E) getDictionary(str, String.class);
            case 17:
                return (E) getDictionary(str, byte[].class);
            case 18:
                return (E) getDictionary(str, Date.class);
            case 19:
                return (E) getDictionary(str, Float.class);
            case 20:
                return (E) getDictionary(str, Double.class);
            case 21:
                return (E) getDictionary(str, Decimal128.class);
            case 22:
                return (E) getDictionary(str, ObjectId.class);
            case 23:
                return (E) getDictionary(str, UUID.class);
            case 24:
                return (E) getDictionary(str, RealmAny.class);
            case 25:
                return (E) getDictionary(str);
            case 26:
                return (E) getRealmSet(str, Integer.class);
            case 27:
                return (E) getRealmSet(str, Boolean.class);
            case 28:
                return (E) getRealmSet(str, String.class);
            case 29:
                return (E) getRealmSet(str, byte[].class);
            case 30:
                return (E) getRealmSet(str, Date.class);
            case 31:
                return (E) getRealmSet(str, Float.class);
            case 32:
                return (E) getRealmSet(str, Double.class);
            case 33:
                return (E) getRealmSet(str, Decimal128.class);
            case 34:
                return (E) getRealmSet(str, ObjectId.class);
            case 35:
                return (E) getRealmSet(str, UUID.class);
            case 36:
                return (E) getRealmSet(str);
            case 37:
                return (E) getRealmSet(str, RealmAny.class);
            default:
                throw new IllegalStateException("Field type not supported: " + columnType);
        }
    }

    public byte[] getBlob(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        try {
            return this.f66507a.getRow$realm().getBinaryByteArray(columnKey);
        } catch (IllegalArgumentException e) {
            m29744a(str, columnKey, RealmFieldType.BINARY);
            throw e;
        }
    }

    public boolean getBoolean(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        try {
            return this.f66507a.getRow$realm().getBoolean(columnKey);
        } catch (IllegalArgumentException e) {
            m29744a(str, columnKey, RealmFieldType.BOOLEAN);
            throw e;
        }
    }

    public byte getByte(String str) {
        return (byte) getLong(str);
    }

    public Date getDate(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        m29744a(str, columnKey, RealmFieldType.DATE);
        if (this.f66507a.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.f66507a.getRow$realm().getDate(columnKey);
    }

    public Decimal128 getDecimal128(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        m29744a(str, columnKey, RealmFieldType.DECIMAL128);
        if (this.f66507a.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.f66507a.getRow$realm().getDecimal128(columnKey);
    }

    public RealmDictionary<DynamicRealmObject> getDictionary(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        try {
            OsMap modelMap = this.f66507a.getRow$realm().getModelMap(columnKey);
            return new RealmDictionary<>(this.f66507a.getRealm$realm(), modelMap, modelMap.getTargetTable().getClassName());
        } catch (IllegalArgumentException e) {
            m29744a(str, columnKey, RealmFieldType.STRING_TO_LINK_MAP);
            throw e;
        }
    }

    public double getDouble(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        try {
            return this.f66507a.getRow$realm().getDouble(columnKey);
        } catch (IllegalArgumentException e) {
            m29744a(str, columnKey, RealmFieldType.DOUBLE);
            throw e;
        }
    }

    public DynamicRealm getDynamicRealm() {
        BaseRealm realm$realm = realmGet$proxyState().getRealm$realm();
        realm$realm.checkIfValid();
        if (isValid()) {
            return (DynamicRealm) realm$realm;
        }
        throw new IllegalStateException("the object is already deleted.");
    }

    public String[] getFieldNames() {
        this.f66507a.getRealm$realm().checkIfValid();
        return this.f66507a.getRow$realm().getColumnNames();
    }

    public RealmFieldType getFieldType(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        return this.f66507a.getRow$realm().getColumnType(this.f66507a.getRow$realm().getColumnKey(str));
    }

    public float getFloat(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        try {
            return this.f66507a.getRow$realm().getFloat(columnKey);
        } catch (IllegalArgumentException e) {
            m29744a(str, columnKey, RealmFieldType.FLOAT);
            throw e;
        }
    }

    public int getInt(String str) {
        return (int) getLong(str);
    }

    public RealmList<DynamicRealmObject> getList(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        try {
            OsList modelList = this.f66507a.getRow$realm().getModelList(columnKey);
            return new RealmList<>(modelList.getTargetTable().getClassName(), modelList, this.f66507a.getRealm$realm());
        } catch (IllegalArgumentException e) {
            m29744a(str, columnKey, RealmFieldType.LIST);
            throw e;
        }
    }

    public long getLong(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        try {
            return this.f66507a.getRow$realm().getLong(columnKey);
        } catch (IllegalArgumentException e) {
            m29744a(str, columnKey, RealmFieldType.INTEGER);
            throw e;
        }
    }

    @Nullable
    public DynamicRealmObject getObject(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        m29744a(str, columnKey, RealmFieldType.OBJECT);
        if (this.f66507a.getRow$realm().isNullLink(columnKey)) {
            return null;
        }
        return new DynamicRealmObject(this.f66507a.getRealm$realm(), this.f66507a.getRow$realm().getTable().getLinkTarget(columnKey).getCheckedRow(this.f66507a.getRow$realm().getLink(columnKey)));
    }

    public ObjectId getObjectId(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        m29744a(str, columnKey, RealmFieldType.OBJECT_ID);
        if (this.f66507a.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.f66507a.getRow$realm().getObjectId(columnKey);
    }

    public RealmAny getRealmAny(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        m29744a(str, columnKey, RealmFieldType.MIXED);
        return m29741d(columnKey);
    }

    public RealmSet<DynamicRealmObject> getRealmSet(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        try {
            OsSet modelSet = this.f66507a.getRow$realm().getModelSet(columnKey);
            return new RealmSet<>(this.f66507a.getRealm$realm(), modelSet, modelSet.getTargetTable().getClassName());
        } catch (IllegalArgumentException e) {
            m29744a(str, columnKey, RealmFieldType.LINK_SET);
            throw e;
        }
    }

    public short getShort(String str) {
        return (short) getLong(str);
    }

    public String getString(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        try {
            return this.f66507a.getRow$realm().getString(columnKey);
        } catch (IllegalArgumentException e) {
            m29744a(str, columnKey, RealmFieldType.STRING);
            throw e;
        }
    }

    public String getType() {
        this.f66507a.getRealm$realm().checkIfValid();
        return this.f66507a.getRow$realm().getTable().getClassName();
    }

    public UUID getUUID(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        m29744a(str, columnKey, RealmFieldType.UUID);
        if (this.f66507a.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.f66507a.getRow$realm().getUUID(columnKey);
    }

    /* renamed from: h */
    public final void m29737h(String str, RealmList realmList) {
        boolean z;
        OsList modelList = this.f66507a.getRow$realm().getModelList(this.f66507a.getRow$realm().getColumnKey(str));
        Table targetTable = modelList.getTargetTable();
        String className = targetTable.getClassName();
        String str2 = realmList.className;
        if (str2 == null && realmList.clazz == null) {
            z = false;
        } else {
            if (str2 == null) {
                str2 = this.f66507a.getRealm$realm().getSchema().m29580h(realmList.clazz).getClassName();
            }
            if (className.equals(str2)) {
                z = true;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "The elements in the list are not the proper type. Was %s expected %s.", str2, className));
            }
        }
        int size = realmList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmList.get(i);
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() == this.f66507a.getRealm$realm()) {
                if (!z && !targetTable.hasSameSchema(realmObjectProxy.realmGet$proxyState().getRow$realm().getTable())) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Element at index %d is not the proper type. Was '%s' expected '%s'.", Integer.valueOf(i), realmObjectProxy.realmGet$proxyState().getRow$realm().getTable().getClassName(), className));
                }
                jArr[i] = realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            } else {
                throw new IllegalArgumentException("Each element in 'list' must belong to the same Realm instance.");
            }
        }
        modelList.removeAll();
        for (int i2 = 0; i2 < size; i2++) {
            modelList.addRow(jArr[i2]);
        }
    }

    public boolean hasField(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        if (str != null && !str.isEmpty()) {
            return this.f66507a.getRow$realm().hasColumn(str);
        }
        return false;
    }

    public int hashCode() {
        int i;
        this.f66507a.getRealm$realm().checkIfValid();
        String path = this.f66507a.getRealm$realm().getPath();
        String name = this.f66507a.getRow$realm().getTable().getName();
        long objectKey = this.f66507a.getRow$realm().getObjectKey();
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

    /* renamed from: i */
    public final void m29736i(String str, RealmSet realmSet) {
        String className;
        boolean z;
        OsSet modelSet = this.f66507a.getRow$realm().getModelSet(this.f66507a.getRow$realm().getColumnKey(str));
        Table targetTable = modelSet.getTargetTable();
        String className2 = targetTable.getClassName();
        if (!realmSet.isManaged()) {
            z = false;
        } else {
            if (realmSet.getValueClassName() != null) {
                className = realmSet.getValueClassName();
            } else {
                className = this.f66507a.getRealm$realm().getSchema().m29580h(realmSet.getValueClass()).getClassName();
            }
            if (className2.equals(className)) {
                z = true;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "The elements in the set are not the proper type. Was %s expected %s.", className, className2));
            }
        }
        RealmSet realmSet2 = new RealmSet();
        Iterator it = realmSet.iterator();
        while (it.hasNext()) {
            DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) it.next();
            if (dynamicRealmObject.realmGet$proxyState().getRealm$realm() == this.f66507a.getRealm$realm()) {
                if (!z && !targetTable.hasSameSchema(dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable())) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Set contains an element with not the proper type. Was '%s' expected '%s'.", dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable().getClassName(), className2));
                }
                realmSet2.add(Long.valueOf(dynamicRealmObject.realmGet$proxyState().getRow$realm().getObjectKey()));
            } else {
                throw new IllegalArgumentException("Each element in 'set' must belong to the same Realm instance.");
            }
        }
        modelSet.clear();
        Iterator it2 = realmSet2.iterator();
        while (it2.hasNext()) {
            modelSet.addRow(((Long) it2.next()).longValue());
        }
    }

    public boolean isNull(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        switch (C11235a.f66508a[this.f66507a.getRow$realm().getColumnType(columnKey).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return this.f66507a.getRow$realm().isNull(columnKey);
            case 12:
                return this.f66507a.getRow$realm().isNullLink(columnKey);
            default:
                return false;
        }
    }

    /* renamed from: k */
    public final void m29734k(String str, RealmDictionary realmDictionary, RealmFieldType realmFieldType) {
        Class cls;
        OsMap valueMap = this.f66507a.getRow$realm().getValueMap(this.f66507a.getRow$realm().getColumnKey(str), realmFieldType);
        switch (C11235a.f66508a[realmFieldType.ordinal()]) {
            case 14:
                cls = Long.class;
                break;
            case 15:
                cls = Boolean.class;
                break;
            case 16:
                cls = String.class;
                break;
            case 17:
                cls = byte[].class;
                break;
            case 18:
                cls = Date.class;
                break;
            case 19:
                cls = Float.class;
                break;
            case 20:
                cls = Double.class;
                break;
            case 21:
                cls = Decimal128.class;
                break;
            case 22:
                cls = ObjectId.class;
                break;
            case 23:
                cls = UUID.class;
                break;
            case 24:
                cls = RealmAny.class;
                break;
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
        }
        RealmDictionary realmDictionary2 = new RealmDictionary(this.f66507a.getRealm$realm(), valueMap, cls);
        RealmDictionary realmDictionary3 = new RealmDictionary();
        Iterator it = realmDictionary.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            realmDictionary3.put((String) entry.getKey(), entry.getValue());
        }
        valueMap.clear();
        Iterator it2 = realmDictionary3.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            realmDictionary2.put((String) entry2.getKey(), entry2.getValue());
        }
    }

    /* renamed from: l */
    public final void m29733l(String str, RealmList realmList, RealmFieldType realmFieldType) {
        Class cls;
        OsList valueList = this.f66507a.getRow$realm().getValueList(this.f66507a.getRow$realm().getColumnKey(str), realmFieldType);
        switch (C11235a.f66508a[realmFieldType.ordinal()]) {
            case 39:
                cls = Long.class;
                break;
            case 40:
                cls = Boolean.class;
                break;
            case 41:
                cls = String.class;
                break;
            case 42:
                cls = byte[].class;
                break;
            case 43:
                cls = Date.class;
                break;
            case 44:
                cls = Float.class;
                break;
            case 45:
                cls = Double.class;
                break;
            case 46:
                cls = Decimal128.class;
                break;
            case 47:
                cls = ObjectId.class;
                break;
            case 48:
                cls = UUID.class;
                break;
            case 49:
                cls = RealmAny.class;
                break;
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
        }
        AbstractC17619Fn0 m29742c = m29742c(this.f66507a.getRealm$realm(), valueList, realmFieldType, cls);
        if (realmList.isManaged() && valueList.size() == realmList.size()) {
            int size = realmList.size();
            Iterator it = realmList.iterator();
            for (int i = 0; i < size; i++) {
                m29742c.m68351t(i, it.next());
            }
            return;
        }
        valueList.removeAll();
        Iterator it2 = realmList.iterator();
        while (it2.hasNext()) {
            m29742c.m68364a(it2.next());
        }
    }

    public RealmResults<DynamicRealmObject> linkingObjects(String str, String str2) {
        RealmFieldType realmFieldType;
        DynamicRealm dynamicRealm = (DynamicRealm) this.f66507a.getRealm$realm();
        dynamicRealm.checkIfValid();
        this.f66507a.getRow$realm().checkIfAttached();
        RealmObjectSchema realmObjectSchema = dynamicRealm.getSchema().get(str);
        if (realmObjectSchema != null) {
            if (str2 != null) {
                if (!str2.contains(".")) {
                    RealmFieldType fieldType = realmObjectSchema.getFieldType(str2);
                    RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
                    if (fieldType != realmFieldType2 && fieldType != (realmFieldType = RealmFieldType.LIST)) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected field type: %1$s. Field type should be either %2$s.%3$s or %2$s.%4$s.", fieldType.name(), RealmFieldType.class.getSimpleName(), realmFieldType2.name(), realmFieldType.name()));
                    }
                    return RealmResults.m29590m(dynamicRealm, (UncheckedRow) this.f66507a.getRow$realm(), realmObjectSchema.m29619f(), str2);
                }
                throw new IllegalArgumentException("Queries across relationships are not supported");
            }
            throw new IllegalArgumentException("Non-null 'srcFieldName' required.");
        }
        throw new IllegalArgumentException("Class not found: " + str);
    }

    /* renamed from: m */
    public final void m29732m(String str, RealmSet realmSet, RealmFieldType realmFieldType) {
        Class cls;
        OsSet valueSet = this.f66507a.getRow$realm().getValueSet(this.f66507a.getRow$realm().getColumnKey(str), realmFieldType);
        switch (C11235a.f66508a[realmFieldType.ordinal()]) {
            case 26:
                cls = Number.class;
                break;
            case 27:
                cls = Boolean.class;
                break;
            case 28:
                cls = String.class;
                break;
            case 29:
                cls = byte[].class;
                break;
            case 30:
                cls = Date.class;
                break;
            case 31:
                cls = Float.class;
                break;
            case 32:
                cls = Double.class;
                break;
            case 33:
                cls = Decimal128.class;
                break;
            case 34:
                cls = ObjectId.class;
                break;
            case 35:
                cls = UUID.class;
                break;
            case 36:
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
            case 37:
                cls = RealmAny.class;
                break;
        }
        RealmSet realmSet2 = new RealmSet(this.f66507a.getRealm$realm(), valueSet, cls);
        RealmSet realmSet3 = new RealmSet();
        realmSet3.addAll(realmSet);
        valueSet.clear();
        realmSet2.addAll(realmSet3);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState realmGet$proxyState() {
        return this.f66507a;
    }

    public void set(String str, Object obj) {
        String str2;
        this.f66507a.getRealm$realm().checkIfValid();
        boolean z = obj instanceof String;
        if (z) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        RealmFieldType columnType = this.f66507a.getRow$realm().getColumnType(this.f66507a.getRow$realm().getColumnKey(str));
        if (z && columnType != RealmFieldType.STRING) {
            switch (C11235a.f66508a[columnType.ordinal()]) {
                case 1:
                    obj = Boolean.valueOf(Boolean.parseBoolean(str2));
                    break;
                case 2:
                    obj = Long.valueOf(Long.parseLong(str2));
                    break;
                case 3:
                    obj = Float.valueOf(Float.parseFloat(str2));
                    break;
                case 4:
                    obj = Double.valueOf(Double.parseDouble(str2));
                    break;
                case 5:
                case 6:
                default:
                    throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", str, obj));
                case 7:
                    obj = JsonUtils.stringToDate(str2);
                    break;
                case 8:
                    obj = Decimal128.parse(str2);
                    break;
                case 9:
                    obj = new ObjectId(str2);
                    break;
                case 10:
                    obj = RealmAny.valueOf(str2);
                    break;
                case 11:
                    obj = UUID.fromString(str2);
                    break;
            }
        }
        if (obj == null) {
            setNull(str);
        } else {
            m29735j(str, obj);
        }
    }

    public void setBlob(String str, @Nullable byte[] bArr) {
        this.f66507a.getRealm$realm().checkIfValid();
        this.f66507a.getRow$realm().setBinaryByteArray(this.f66507a.getRow$realm().getColumnKey(str), bArr);
    }

    public void setBoolean(String str, boolean z) {
        this.f66507a.getRealm$realm().checkIfValid();
        this.f66507a.getRow$realm().setBoolean(this.f66507a.getRow$realm().getColumnKey(str), z);
    }

    public void setByte(String str, byte b) {
        this.f66507a.getRealm$realm().checkIfValid();
        m29743b(str);
        this.f66507a.getRow$realm().setLong(this.f66507a.getRow$realm().getColumnKey(str), b);
    }

    public void setDate(String str, @Nullable Date date) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        if (date == null) {
            this.f66507a.getRow$realm().setNull(columnKey);
        } else {
            this.f66507a.getRow$realm().setDate(columnKey, date);
        }
    }

    public void setDecimal128(String str, @Nullable Decimal128 decimal128) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        if (decimal128 == null) {
            this.f66507a.getRow$realm().setNull(columnKey);
        } else {
            this.f66507a.getRow$realm().setDecimal128(columnKey, decimal128);
        }
    }

    public <E> void setDictionary(String str, RealmDictionary<E> realmDictionary) {
        this.f66507a.getRealm$realm().checkIfValid();
        if (realmDictionary != null) {
            RealmFieldType columnType = this.f66507a.getRow$realm().getColumnType(this.f66507a.getRow$realm().getColumnKey(str));
            switch (C11235a.f66508a[columnType.ordinal()]) {
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    m29734k(str, realmDictionary, columnType);
                    return;
                case 25:
                    m29738g(str, realmDictionary);
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Field '%s' is not a dictionary but a %s", str, columnType));
            }
        }
        throw new IllegalArgumentException("Non-null 'dictionary' required");
    }

    public void setDouble(String str, double d) {
        this.f66507a.getRealm$realm().checkIfValid();
        this.f66507a.getRow$realm().setDouble(this.f66507a.getRow$realm().getColumnKey(str), d);
    }

    public void setFloat(String str, float f) {
        this.f66507a.getRealm$realm().checkIfValid();
        this.f66507a.getRow$realm().setFloat(this.f66507a.getRow$realm().getColumnKey(str), f);
    }

    public void setInt(String str, int i) {
        this.f66507a.getRealm$realm().checkIfValid();
        m29743b(str);
        this.f66507a.getRow$realm().setLong(this.f66507a.getRow$realm().getColumnKey(str), i);
    }

    public <E> void setList(String str, RealmList<E> realmList) {
        this.f66507a.getRealm$realm().checkIfValid();
        if (realmList != null) {
            RealmFieldType columnType = this.f66507a.getRow$realm().getColumnType(this.f66507a.getRow$realm().getColumnKey(str));
            int i = C11235a.f66508a[columnType.ordinal()];
            if (i != 13) {
                switch (i) {
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        m29733l(str, realmList, columnType);
                        return;
                    default:
                        throw new IllegalArgumentException(String.format("Field '%s' is not a list but a %s", str, columnType));
                }
            }
            if (!realmList.isEmpty()) {
                E first = realmList.first();
                if (!(first instanceof DynamicRealmObject) && RealmModel.class.isAssignableFrom(first.getClass())) {
                    throw new IllegalArgumentException("RealmList must contain `DynamicRealmObject's, not Java model classes.");
                }
            }
            m29737h(str, realmList);
            return;
        }
        throw new IllegalArgumentException("Non-null 'list' required");
    }

    public void setLong(String str, long j) {
        this.f66507a.getRealm$realm().checkIfValid();
        m29743b(str);
        this.f66507a.getRow$realm().setLong(this.f66507a.getRow$realm().getColumnKey(str), j);
    }

    public void setNull(String str) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        if (this.f66507a.getRow$realm().getColumnType(columnKey) == RealmFieldType.OBJECT) {
            this.f66507a.getRow$realm().nullifyLink(columnKey);
            return;
        }
        m29743b(str);
        this.f66507a.getRow$realm().setNull(columnKey);
    }

    public void setObject(String str, @Nullable DynamicRealmObject dynamicRealmObject) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        if (dynamicRealmObject == null) {
            this.f66507a.getRow$realm().nullifyLink(columnKey);
        } else if (dynamicRealmObject.f66507a.getRealm$realm() != null && dynamicRealmObject.f66507a.getRow$realm() != null) {
            if (this.f66507a.getRealm$realm() == dynamicRealmObject.f66507a.getRealm$realm()) {
                Table linkTarget = this.f66507a.getRow$realm().getTable().getLinkTarget(columnKey);
                Table table = dynamicRealmObject.f66507a.getRow$realm().getTable();
                if (linkTarget.hasSameSchema(table)) {
                    this.f66507a.getRow$realm().setLink(columnKey, dynamicRealmObject.f66507a.getRow$realm().getObjectKey());
                    return;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Type of object is wrong. Was %s, expected %s", table.getName(), linkTarget.getName()));
            }
            throw new IllegalArgumentException("Cannot add an object from another Realm instance.");
        } else {
            throw new IllegalArgumentException("Cannot link to objects that are not part of the Realm.");
        }
    }

    public void setObjectId(String str, @Nullable ObjectId objectId) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        if (objectId == null) {
            this.f66507a.getRow$realm().setNull(columnKey);
        } else {
            this.f66507a.getRow$realm().setObjectId(columnKey, objectId);
        }
    }

    public void setRealmAny(String str, @Nullable RealmAny realmAny) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        if (realmAny == null) {
            this.f66507a.getRow$realm().setNull(columnKey);
        } else {
            this.f66507a.getRow$realm().setRealmAny(columnKey, realmAny.m29707b());
        }
    }

    public <E> void setRealmSet(String str, RealmSet<E> realmSet) {
        this.f66507a.getRealm$realm().checkIfValid();
        if (realmSet != null) {
            RealmFieldType columnType = this.f66507a.getRow$realm().getColumnType(this.f66507a.getRow$realm().getColumnKey(str));
            switch (C11235a.f66508a[columnType.ordinal()]) {
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 37:
                    m29732m(str, realmSet, columnType);
                    return;
                case 36:
                    m29736i(str, realmSet);
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Field '%s' is not a set but a %s", str, columnType));
            }
        }
        throw new IllegalArgumentException("Non-null 'set' required");
    }

    public void setShort(String str, short s) {
        this.f66507a.getRealm$realm().checkIfValid();
        m29743b(str);
        this.f66507a.getRow$realm().setLong(this.f66507a.getRow$realm().getColumnKey(str), s);
    }

    public void setString(String str, @Nullable String str2) {
        this.f66507a.getRealm$realm().checkIfValid();
        m29743b(str);
        this.f66507a.getRow$realm().setString(this.f66507a.getRow$realm().getColumnKey(str), str2);
    }

    public void setUUID(String str, @Nullable UUID uuid) {
        this.f66507a.getRealm$realm().checkIfValid();
        long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
        if (uuid == null) {
            this.f66507a.getRow$realm().setNull(columnKey);
        } else {
            this.f66507a.getRow$realm().setUUID(columnKey, uuid);
        }
    }

    public String toString() {
        String[] fieldNames;
        this.f66507a.getRealm$realm().checkIfValid();
        if (!this.f66507a.getRow$realm().isValid()) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder(this.f66507a.getRow$realm().getTable().getClassName() + " = dynamic[");
        for (String str : getFieldNames()) {
            long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
            RealmFieldType columnType = this.f66507a.getRow$realm().getColumnType(columnKey);
            sb.append("{");
            sb.append(str);
            sb.append(":");
            int i = C11235a.f66508a[columnType.ordinal()];
            String str2 = AbstractJsonLexerKt.NULL;
            switch (i) {
                case 1:
                    Boolean bool = str2;
                    if (!this.f66507a.getRow$realm().isNull(columnKey)) {
                        bool = Boolean.valueOf(this.f66507a.getRow$realm().getBoolean(columnKey));
                    }
                    sb.append(bool);
                    break;
                case 2:
                    Long l = str2;
                    if (!this.f66507a.getRow$realm().isNull(columnKey)) {
                        l = Long.valueOf(this.f66507a.getRow$realm().getLong(columnKey));
                    }
                    sb.append(l);
                    break;
                case 3:
                    Float f = str2;
                    if (!this.f66507a.getRow$realm().isNull(columnKey)) {
                        f = Float.valueOf(this.f66507a.getRow$realm().getFloat(columnKey));
                    }
                    sb.append(f);
                    break;
                case 4:
                    Double d = str2;
                    if (!this.f66507a.getRow$realm().isNull(columnKey)) {
                        d = Double.valueOf(this.f66507a.getRow$realm().getDouble(columnKey));
                    }
                    sb.append(d);
                    break;
                case 5:
                    sb.append(this.f66507a.getRow$realm().getString(columnKey));
                    break;
                case 6:
                    sb.append(Arrays.toString(this.f66507a.getRow$realm().getBinaryByteArray(columnKey)));
                    break;
                case 7:
                    Date date = str2;
                    if (!this.f66507a.getRow$realm().isNull(columnKey)) {
                        date = this.f66507a.getRow$realm().getDate(columnKey);
                    }
                    sb.append(date);
                    break;
                case 8:
                    Decimal128 decimal128 = str2;
                    if (!this.f66507a.getRow$realm().isNull(columnKey)) {
                        decimal128 = this.f66507a.getRow$realm().getDecimal128(columnKey);
                    }
                    sb.append(decimal128);
                    break;
                case 9:
                    ObjectId objectId = str2;
                    if (!this.f66507a.getRow$realm().isNull(columnKey)) {
                        objectId = this.f66507a.getRow$realm().getObjectId(columnKey);
                    }
                    sb.append(objectId);
                    break;
                case 10:
                    String str3 = str2;
                    if (!this.f66507a.getRow$realm().isNull(columnKey)) {
                        str3 = m29741d(columnKey);
                    }
                    sb.append(str3);
                    break;
                case 11:
                    UUID uuid = str2;
                    if (!this.f66507a.getRow$realm().isNull(columnKey)) {
                        uuid = this.f66507a.getRow$realm().getUUID(columnKey);
                    }
                    sb.append(uuid);
                    break;
                case 12:
                    String str4 = str2;
                    if (!this.f66507a.getRow$realm().isNullLink(columnKey)) {
                        str4 = this.f66507a.getRow$realm().getTable().getLinkTarget(columnKey).getClassName();
                    }
                    sb.append(str4);
                    break;
                case 13:
                    sb.append(String.format(Locale.US, "RealmList<%s>[%s]", this.f66507a.getRow$realm().getTable().getLinkTarget(columnKey).getClassName(), Long.valueOf(this.f66507a.getRow$realm().getModelList(columnKey).size())));
                    break;
                case 14:
                    sb.append(String.format(Locale.US, "RealmDictionary<Long>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 15:
                    sb.append(String.format(Locale.US, "RealmDictionary<Boolean>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 16:
                    sb.append(String.format(Locale.US, "RealmDictionary<String>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 17:
                    sb.append(String.format(Locale.US, "RealmDictionary<byte[]>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 18:
                    sb.append(String.format(Locale.US, "RealmDictionary<Date>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 19:
                    sb.append(String.format(Locale.US, "RealmDictionary<Float>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 20:
                    sb.append(String.format(Locale.US, "RealmDictionary<Double>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 21:
                    sb.append(String.format(Locale.US, "RealmDictionary<Decimal128>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 22:
                    sb.append(String.format(Locale.US, "RealmDictionary<ObjectId>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 23:
                    sb.append(String.format(Locale.US, "RealmDictionary<UUID>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 24:
                    sb.append(String.format(Locale.US, "RealmDictionary<RealmAny>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 25:
                    sb.append(String.format(Locale.US, "RealmDictionary<%s>[%s]", this.f66507a.getRow$realm().getTable().getLinkTarget(columnKey).getClassName(), Long.valueOf(this.f66507a.getRow$realm().getModelMap(columnKey).size())));
                    break;
                case 26:
                    sb.append(String.format(Locale.US, "RealmSet<Long>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 27:
                    sb.append(String.format(Locale.US, "RealmSet<Boolean>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 28:
                    sb.append(String.format(Locale.US, "RealmSet<String>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 29:
                    sb.append(String.format(Locale.US, "RealmSet<byte[]>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 30:
                    sb.append(String.format(Locale.US, "RealmSet<Date>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 31:
                    sb.append(String.format(Locale.US, "RealmSet<Float>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 32:
                    sb.append(String.format(Locale.US, "RealmSet<Double>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 33:
                    sb.append(String.format(Locale.US, "RealmSet<Decimal128>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 34:
                    sb.append(String.format(Locale.US, "RealmSet<ObjectId>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 35:
                    sb.append(String.format(Locale.US, "RealmSet<UUID>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 36:
                    sb.append(String.format(Locale.US, "RealmSet<%s>[%s]", this.f66507a.getRow$realm().getTable().getLinkTarget(columnKey).getClassName(), Long.valueOf(this.f66507a.getRow$realm().getModelSet(columnKey).size())));
                    break;
                case 37:
                    sb.append(String.format(Locale.US, "RealmSet<RealmAny>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 38:
                default:
                    sb.append(CallerData.f39639NA);
                    break;
                case 39:
                    sb.append(String.format(Locale.US, "RealmList<Long>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 40:
                    sb.append(String.format(Locale.US, "RealmList<Boolean>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 41:
                    sb.append(String.format(Locale.US, "RealmList<String>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 42:
                    sb.append(String.format(Locale.US, "RealmList<byte[]>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 43:
                    sb.append(String.format(Locale.US, "RealmList<Date>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 44:
                    sb.append(String.format(Locale.US, "RealmList<Float>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 45:
                    sb.append(String.format(Locale.US, "RealmList<Double>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 46:
                    sb.append(String.format(Locale.US, "RealmList<Decimal128>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 47:
                    sb.append(String.format(Locale.US, "RealmList<ObjectId>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 48:
                    sb.append(String.format(Locale.US, "RealmList<UUID>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 49:
                    sb.append(String.format(Locale.US, "RealmList<RealmAny>[%s]", Long.valueOf(this.f66507a.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
            }
            sb.append("},");
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        sb.append("]");
        return sb.toString();
    }

    public <E> RealmDictionary<E> getDictionary(String str, Class<E> cls) {
        this.f66507a.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
            RealmFieldType m29739f = m29739f(CollectionType.DICTIONARY, cls);
            try {
                return new RealmDictionary<>(this.f66507a.getRealm$realm(), this.f66507a.getRow$realm().getValueMap(columnKey, m29739f), cls);
            } catch (IllegalArgumentException e) {
                m29744a(str, columnKey, m29739f);
                throw e;
            }
        }
        throw new IllegalArgumentException("Non-null 'primitiveType' required.");
    }

    public <E> RealmList<E> getList(String str, Class<E> cls) {
        this.f66507a.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
            RealmFieldType m29739f = m29739f(CollectionType.LIST, cls);
            try {
                return new RealmList<>(cls, this.f66507a.getRow$realm().getValueList(columnKey, m29739f), this.f66507a.getRealm$realm());
            } catch (IllegalArgumentException e) {
                m29744a(str, columnKey, m29739f);
                throw e;
            }
        }
        throw new IllegalArgumentException("Non-null 'primitiveType' required.");
    }

    public <E> RealmSet<E> getRealmSet(String str, Class<E> cls) {
        this.f66507a.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnKey = this.f66507a.getRow$realm().getColumnKey(str);
            RealmFieldType m29739f = m29739f(CollectionType.SET, cls);
            try {
                return new RealmSet<>(this.f66507a.getRealm$realm(), this.f66507a.getRow$realm().getValueSet(columnKey, m29739f), cls);
            } catch (IllegalArgumentException e) {
                m29744a(str, columnKey, m29739f);
                throw e;
            }
        }
        throw new IllegalArgumentException("Non-null 'primitiveType' required.");
    }

    public DynamicRealmObject(BaseRealm baseRealm, Row row) {
        ProxyState proxyState = new ProxyState(this);
        this.f66507a = proxyState;
        proxyState.setRealm$realm(baseRealm);
        proxyState.setRow$realm(row);
        proxyState.setConstructionFinished();
    }
}
