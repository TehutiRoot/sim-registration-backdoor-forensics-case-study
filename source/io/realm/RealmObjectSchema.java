package io.realm;

import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public abstract class RealmObjectSchema {

    /* renamed from: e */
    public static final Map f66624e;

    /* renamed from: f */
    public static final Map f66625f;

    /* renamed from: g */
    public static final Map f66626g;

    /* renamed from: h */
    public static final Map f66627h;

    /* renamed from: a */
    public final RealmSchema f66628a;

    /* renamed from: b */
    public final BaseRealm f66629b;

    /* renamed from: c */
    public final Table f66630c;

    /* renamed from: d */
    public final ColumnInfo f66631d;

    /* loaded from: classes5.dex */
    public interface Function {
        void apply(DynamicRealmObject dynamicRealmObject);
    }

    /* renamed from: io.realm.RealmObjectSchema$a */
    /* loaded from: classes5.dex */
    public static final class C11280a extends ColumnInfo {

        /* renamed from: e */
        public final Table f66632e;

        public C11280a(Table table) {
            super((ColumnInfo) null, false);
            this.f66632e = table;
        }

        @Override // io.realm.internal.ColumnInfo
        public ColumnInfo copy(boolean z) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }

        @Override // io.realm.internal.ColumnInfo
        public void copyFrom(ColumnInfo columnInfo) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }

        @Override // io.realm.internal.ColumnInfo
        public ColumnInfo.ColumnDetails getColumnDetails(String str) {
            throw new UnsupportedOperationException("DynamicColumnIndices do not support 'getColumnDetails'");
        }

        @Override // io.realm.internal.ColumnInfo
        public long getColumnKey(String str) {
            return this.f66632e.getColumnKey(str);
        }

        @Override // io.realm.internal.ColumnInfo
        public void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }
    }

    /* renamed from: io.realm.RealmObjectSchema$b */
    /* loaded from: classes5.dex */
    public static final class C11281b {

        /* renamed from: a */
        public final RealmFieldType f66633a;

        /* renamed from: b */
        public final RealmFieldType f66634b;

        /* renamed from: c */
        public final boolean f66635c;

        public C11281b(RealmFieldType realmFieldType, RealmFieldType realmFieldType2, boolean z) {
            this.f66633a = realmFieldType;
            this.f66634b = realmFieldType2;
            this.f66635c = z;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        hashMap.put(String.class, new C11281b(realmFieldType, RealmFieldType.STRING_LIST, true));
        Class cls = Short.TYPE;
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER_LIST;
        hashMap.put(cls, new C11281b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Short.class, new C11281b(realmFieldType2, realmFieldType3, true));
        Class cls2 = Integer.TYPE;
        hashMap.put(cls2, new C11281b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Integer.class, new C11281b(realmFieldType2, realmFieldType3, true));
        Class cls3 = Long.TYPE;
        hashMap.put(cls3, new C11281b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Long.class, new C11281b(realmFieldType2, realmFieldType3, true));
        Class cls4 = Float.TYPE;
        RealmFieldType realmFieldType4 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType5 = RealmFieldType.FLOAT_LIST;
        hashMap.put(cls4, new C11281b(realmFieldType4, realmFieldType5, false));
        hashMap.put(Float.class, new C11281b(realmFieldType4, realmFieldType5, true));
        Class cls5 = Double.TYPE;
        RealmFieldType realmFieldType6 = RealmFieldType.DOUBLE;
        RealmFieldType realmFieldType7 = RealmFieldType.DOUBLE_LIST;
        hashMap.put(cls5, new C11281b(realmFieldType6, realmFieldType7, false));
        hashMap.put(Double.class, new C11281b(realmFieldType6, realmFieldType7, true));
        Class cls6 = Boolean.TYPE;
        RealmFieldType realmFieldType8 = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType9 = RealmFieldType.BOOLEAN_LIST;
        hashMap.put(cls6, new C11281b(realmFieldType8, realmFieldType9, false));
        hashMap.put(Boolean.class, new C11281b(realmFieldType8, realmFieldType9, true));
        Class cls7 = Byte.TYPE;
        hashMap.put(cls7, new C11281b(realmFieldType2, realmFieldType3, false));
        hashMap.put(Byte.class, new C11281b(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType10 = RealmFieldType.BINARY;
        hashMap.put(byte[].class, new C11281b(realmFieldType10, RealmFieldType.BINARY_LIST, true));
        RealmFieldType realmFieldType11 = RealmFieldType.DATE;
        hashMap.put(Date.class, new C11281b(realmFieldType11, RealmFieldType.DATE_LIST, true));
        RealmFieldType realmFieldType12 = RealmFieldType.OBJECT_ID;
        hashMap.put(ObjectId.class, new C11281b(realmFieldType12, RealmFieldType.OBJECT_ID_LIST, true));
        RealmFieldType realmFieldType13 = RealmFieldType.DECIMAL128;
        hashMap.put(Decimal128.class, new C11281b(realmFieldType13, RealmFieldType.DECIMAL128_LIST, true));
        RealmFieldType realmFieldType14 = RealmFieldType.UUID;
        hashMap.put(UUID.class, new C11281b(realmFieldType14, RealmFieldType.UUID_LIST, true));
        RealmFieldType realmFieldType15 = RealmFieldType.MIXED;
        hashMap.put(RealmAny.class, new C11281b(realmFieldType15, RealmFieldType.MIXED_LIST, true));
        f66624e = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(String.class, new C11281b(realmFieldType, RealmFieldType.STRING_TO_STRING_MAP, true));
        RealmFieldType realmFieldType16 = RealmFieldType.STRING_TO_INTEGER_MAP;
        hashMap2.put(cls, new C11281b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Short.class, new C11281b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(cls2, new C11281b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Integer.class, new C11281b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(cls3, new C11281b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Long.class, new C11281b(realmFieldType2, realmFieldType16, true));
        RealmFieldType realmFieldType17 = RealmFieldType.STRING_TO_FLOAT_MAP;
        hashMap2.put(cls4, new C11281b(realmFieldType4, realmFieldType17, false));
        hashMap2.put(Float.class, new C11281b(realmFieldType4, realmFieldType17, true));
        RealmFieldType realmFieldType18 = RealmFieldType.STRING_TO_DOUBLE_MAP;
        hashMap2.put(cls5, new C11281b(realmFieldType6, realmFieldType18, false));
        hashMap2.put(Double.class, new C11281b(realmFieldType6, realmFieldType18, true));
        RealmFieldType realmFieldType19 = RealmFieldType.STRING_TO_BOOLEAN_MAP;
        hashMap2.put(cls6, new C11281b(realmFieldType8, realmFieldType19, false));
        hashMap2.put(Boolean.class, new C11281b(realmFieldType8, realmFieldType19, true));
        hashMap2.put(cls7, new C11281b(realmFieldType2, realmFieldType16, false));
        hashMap2.put(Byte.class, new C11281b(realmFieldType2, realmFieldType16, true));
        hashMap2.put(byte[].class, new C11281b(realmFieldType10, RealmFieldType.STRING_TO_BINARY_MAP, true));
        hashMap2.put(Date.class, new C11281b(realmFieldType11, RealmFieldType.STRING_TO_DATE_MAP, true));
        hashMap2.put(ObjectId.class, new C11281b(realmFieldType12, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true));
        hashMap2.put(Decimal128.class, new C11281b(realmFieldType13, RealmFieldType.STRING_TO_DECIMAL128_MAP, true));
        hashMap2.put(UUID.class, new C11281b(realmFieldType14, RealmFieldType.STRING_TO_UUID_MAP, true));
        hashMap2.put(RealmAny.class, new C11281b(realmFieldType15, RealmFieldType.STRING_TO_MIXED_MAP, true));
        f66625f = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(String.class, new C11281b(realmFieldType, RealmFieldType.STRING_SET, true));
        RealmFieldType realmFieldType20 = RealmFieldType.INTEGER_SET;
        hashMap3.put(cls, new C11281b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Short.class, new C11281b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(cls2, new C11281b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Integer.class, new C11281b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(cls3, new C11281b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Long.class, new C11281b(realmFieldType2, realmFieldType20, true));
        RealmFieldType realmFieldType21 = RealmFieldType.FLOAT_SET;
        hashMap3.put(cls4, new C11281b(realmFieldType4, realmFieldType21, false));
        hashMap3.put(Float.class, new C11281b(realmFieldType4, realmFieldType21, true));
        RealmFieldType realmFieldType22 = RealmFieldType.DOUBLE_SET;
        hashMap3.put(cls5, new C11281b(realmFieldType6, realmFieldType22, false));
        hashMap3.put(Double.class, new C11281b(realmFieldType6, realmFieldType22, true));
        RealmFieldType realmFieldType23 = RealmFieldType.BOOLEAN_SET;
        hashMap3.put(cls6, new C11281b(realmFieldType8, realmFieldType23, false));
        hashMap3.put(Boolean.class, new C11281b(realmFieldType8, realmFieldType23, true));
        hashMap3.put(cls7, new C11281b(realmFieldType2, realmFieldType20, false));
        hashMap3.put(Byte.class, new C11281b(realmFieldType2, realmFieldType20, true));
        hashMap3.put(byte[].class, new C11281b(realmFieldType10, RealmFieldType.BINARY_SET, true));
        hashMap3.put(Date.class, new C11281b(realmFieldType11, RealmFieldType.DATE_SET, true));
        hashMap3.put(ObjectId.class, new C11281b(realmFieldType12, RealmFieldType.OBJECT_ID_SET, true));
        hashMap3.put(Decimal128.class, new C11281b(realmFieldType13, RealmFieldType.DECIMAL128_SET, true));
        hashMap3.put(UUID.class, new C11281b(realmFieldType14, RealmFieldType.UUID_SET, true));
        hashMap3.put(RealmAny.class, new C11281b(realmFieldType15, RealmFieldType.MIXED_SET, true));
        f66626g = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(RealmObject.class, new C11281b(RealmFieldType.OBJECT, null, false));
        hashMap4.put(RealmList.class, new C11281b(RealmFieldType.LIST, null, false));
        hashMap4.put(RealmDictionary.class, new C11281b(RealmFieldType.STRING_TO_LINK_MAP, null, false));
        hashMap4.put(RealmSet.class, new C11281b(RealmFieldType.LINK_SET, null, false));
        f66627h = Collections.unmodifiableMap(hashMap4);
    }

    public RealmObjectSchema(BaseRealm baseRealm, RealmSchema realmSchema, Table table, ColumnInfo columnInfo) {
        this.f66628a = realmSchema;
        this.f66629b = baseRealm;
        this.f66630c = table;
        this.f66631d = columnInfo;
    }

    /* renamed from: b */
    public static void m29622b(String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.contains(".")) {
                if (str.length() <= 63) {
                    return;
                }
                throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
            }
            throw new IllegalArgumentException("Field name can not contain '.'");
        }
        throw new IllegalArgumentException("Field name can not be null or empty");
    }

    /* renamed from: a */
    public void m29623a(String str) {
        if (this.f66630c.getColumnKey(str) != -1) {
            return;
        }
        throw new IllegalArgumentException("Field name doesn't exist on object '" + getClassName() + "': " + str);
    }

    public abstract RealmObjectSchema addField(String str, Class<?> cls, FieldAttribute... fieldAttributeArr);

    public abstract RealmObjectSchema addIndex(String str);

    public abstract RealmObjectSchema addPrimaryKey(String str);

    public abstract RealmObjectSchema addRealmDictionaryField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmDictionaryField(String str, Class<?> cls);

    public abstract RealmObjectSchema addRealmListField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmListField(String str, Class<?> cls);

    public abstract RealmObjectSchema addRealmObjectField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmSetField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmSetField(String str, Class<?> cls);

    /* renamed from: c */
    public long m29621c(String str) {
        long columnKey = this.f66631d.getColumnKey(str);
        if (columnKey >= 0) {
            return columnKey;
        }
        throw new IllegalArgumentException("Field does not exist: " + str);
    }

    /* renamed from: d */
    public long m29620d(String str) {
        long columnKey = this.f66630c.getColumnKey(str);
        if (columnKey != -1) {
            return columnKey;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field name '%s' does not exist on schema for '%s'", str, getClassName()));
    }

    /* renamed from: e */
    public abstract String mo29388e(String str);

    /* renamed from: f */
    public Table m29619f() {
        return this.f66630c;
    }

    /* renamed from: g */
    public boolean m29618g(RealmFieldType realmFieldType) {
        if (realmFieldType != RealmFieldType.OBJECT && realmFieldType != RealmFieldType.LIST) {
            return false;
        }
        return true;
    }

    public String getClassName() {
        return this.f66630c.getClassName();
    }

    public Set<String> getFieldNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet((int) this.f66630c.getColumnCount());
        for (String str : this.f66630c.getColumnNames()) {
            linkedHashSet.add(str);
        }
        return linkedHashSet;
    }

    public RealmFieldType getFieldType(String str) {
        return this.f66630c.getColumnType(m29620d(str));
    }

    public String getPrimaryKey() {
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.f66629b.sharedRealm, getClassName());
        if (primaryKeyForObject != null) {
            return primaryKeyForObject;
        }
        throw new IllegalStateException(getClassName() + " doesn't have a primary key.");
    }

    public boolean hasField(String str) {
        if (this.f66630c.getColumnKey(str) != -1) {
            return true;
        }
        return false;
    }

    public boolean hasIndex(String str) {
        m29622b(str);
        m29623a(str);
        Table table = this.f66630c;
        return table.hasSearchIndex(table.getColumnKey(str));
    }

    public boolean hasPrimaryKey() {
        if (OsObjectStore.getPrimaryKeyForObject(this.f66629b.sharedRealm, getClassName()) != null) {
            return true;
        }
        return false;
    }

    public boolean isEmbedded() {
        return this.f66630c.isEmbedded();
    }

    public boolean isNullable(String str) {
        return this.f66630c.isColumnNullable(m29620d(str));
    }

    public boolean isPrimaryKey(String str) {
        m29623a(str);
        return str.equals(OsObjectStore.getPrimaryKeyForObject(this.f66629b.sharedRealm, getClassName()));
    }

    public boolean isRequired(String str) {
        return !this.f66630c.isColumnNullable(m29620d(str));
    }

    public abstract RealmObjectSchema removeField(String str);

    public abstract RealmObjectSchema removeIndex(String str);

    public abstract RealmObjectSchema removePrimaryKey();

    public abstract RealmObjectSchema renameField(String str, String str2);

    public abstract RealmObjectSchema setClassName(String str);

    public void setEmbedded(boolean z) {
        setEmbedded(z, false);
    }

    public abstract RealmObjectSchema setNullable(String str, boolean z);

    public abstract RealmObjectSchema setRequired(String str, boolean z);

    public abstract RealmObjectSchema transform(Function function);

    public void setEmbedded(boolean z, boolean z2) {
        if (!hasPrimaryKey()) {
            if (!this.f66630c.setEmbedded(z, z2) && z) {
                throw new IllegalStateException("The class could not be marked as embedded as some objects of this type break some of the Embedded Objects invariants. In order to convert all objects to be embedded, they must have one and exactly one parent objectpointing to them.");
            }
            return;
        }
        throw new IllegalStateException("Embedded classes cannot have primary keys. This class has a primary key defined so cannot be marked as embedded: " + getClassName());
    }
}
