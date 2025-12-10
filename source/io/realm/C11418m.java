package io.realm;

import io.realm.RealmObjectSchema;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.Util;
import java.util.Date;
import java.util.Locale;

/* renamed from: io.realm.m */
/* loaded from: classes5.dex */
public class C11418m extends RealmObjectSchema {

    /* renamed from: io.realm.m$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11419a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66910a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f66910a = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66910a[RealmFieldType.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C11418m(BaseRealm baseRealm, RealmSchema realmSchema, Table table) {
        super(baseRealm, realmSchema, table, new RealmObjectSchema.C11280a(table));
    }

    /* renamed from: o */
    public static boolean m29380o(FieldAttribute[] fieldAttributeArr, FieldAttribute fieldAttribute) {
        if (fieldAttributeArr != null && fieldAttributeArr.length != 0) {
            for (FieldAttribute fieldAttribute2 : fieldAttributeArr) {
                if (fieldAttribute2 == fieldAttribute) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addField(String str, Class cls, FieldAttribute... fieldAttributeArr) {
        boolean z = false;
        RealmObjectSchema.C11281b c11281b = (RealmObjectSchema.C11281b) RealmObjectSchema.f66624e.get(cls);
        if (c11281b == null) {
            if (!RealmObjectSchema.f66627h.containsKey(cls)) {
                if (RealmModel.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Use 'addRealmObjectField()' instead to add fields that link to other RealmObjects: %s(%s)", str, cls));
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Realm doesn't support this field type: %s(%s)", str, cls));
            }
            throw new IllegalArgumentException("Use addRealmObjectField() instead to add fields that link to other RealmObjects: " + str);
        }
        if (m29380o(fieldAttributeArr, FieldAttribute.PRIMARY_KEY)) {
            m29386i();
            m29382m(str, cls);
        }
        m29381n(str);
        boolean z2 = c11281b.f66635c;
        if (!m29380o(fieldAttributeArr, FieldAttribute.REQUIRED)) {
            z = z2;
        }
        long addColumn = this.f66630c.addColumn(c11281b.f66633a, str, z);
        try {
            m29387h(str, fieldAttributeArr);
            return this;
        } catch (Exception e) {
            this.f66630c.removeColumn(addColumn);
            throw e;
        }
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addIndex(String str) {
        RealmObjectSchema.m29622b(str);
        m29623a(str);
        long m29620d = m29620d(str);
        if (!this.f66630c.hasSearchIndex(m29620d)) {
            this.f66630c.addSearchIndex(m29620d);
            return this;
        }
        throw new IllegalStateException(str + " already has an index.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addPrimaryKey(String str) {
        m29386i();
        RealmObjectSchema.m29622b(str);
        m29623a(str);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.f66629b.sharedRealm, getClassName());
        if (primaryKeyForObject == null) {
            long m29620d = m29620d(str);
            RealmFieldType fieldType = getFieldType(str);
            m29383l(str, fieldType);
            if (fieldType != RealmFieldType.STRING && !this.f66630c.hasSearchIndex(m29620d)) {
                this.f66630c.addSearchIndex(m29620d);
            }
            OsObjectStore.setPrimaryKeyForObject(this.f66629b.sharedRealm, getClassName(), str);
            return this;
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "Field '%s' has been already defined as primary key.", primaryKeyForObject));
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmDictionaryField(String str, Class cls) {
        RealmObjectSchema.m29622b(str);
        m29384k(str);
        RealmObjectSchema.C11281b c11281b = (RealmObjectSchema.C11281b) RealmObjectSchema.f66625f.get(cls);
        if (c11281b == null) {
            if (!cls.equals(RealmObjectSchema.class) && !RealmModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format(Locale.US, "RealmDictionary does not support dictionaries with this type: %s(%s)", str, cls));
            }
            throw new IllegalArgumentException("Use 'addRealmDictionaryField(String name, RealmObjectSchema schema)' instead to add dictionaries that link to other RealmObjects: " + str);
        }
        this.f66630c.addColumn(c11281b.f66634b, str, c11281b.f66635c);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmListField(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.m29622b(str);
        m29384k(str);
        this.f66630c.addColumnLink(RealmFieldType.LIST, str, this.f66629b.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmObjectField(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.m29622b(str);
        m29384k(str);
        this.f66630c.addColumnLink(RealmFieldType.OBJECT, str, this.f66629b.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmSetField(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.m29622b(str);
        m29384k(str);
        this.f66630c.addColumnSetLink(RealmFieldType.LINK_SET, str, this.f66629b.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    /* renamed from: e */
    public String mo29388e(String str) {
        String className = this.f66630c.getLinkTarget(m29620d(str)).getClassName();
        if (!Util.isEmptyString(className)) {
            return className;
        }
        throw new IllegalArgumentException(String.format("Property '%s' not found.", str));
    }

    /* renamed from: h */
    public final void m29387h(String str, FieldAttribute[] fieldAttributeArr) {
        if (fieldAttributeArr != null) {
            boolean z = false;
            try {
                if (fieldAttributeArr.length > 0) {
                    if (m29380o(fieldAttributeArr, FieldAttribute.INDEXED)) {
                        addIndex(str);
                        z = true;
                    }
                    if (m29380o(fieldAttributeArr, FieldAttribute.PRIMARY_KEY)) {
                        addPrimaryKey(str);
                    }
                }
            } catch (Exception e) {
                long m29620d = m29620d(str);
                if (z) {
                    this.f66630c.removeSearchIndex(m29620d);
                }
                throw ((RuntimeException) e);
            }
        }
    }

    /* renamed from: i */
    public final void m29386i() {
        if (!this.f66629b.configuration.isSyncConfiguration()) {
            return;
        }
        throw new UnsupportedOperationException("'addPrimaryKey' is not supported by synced Realms.");
    }

    /* renamed from: j */
    public final void m29385j(String str) {
        if (str != null && !str.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Null or empty class names are not allowed");
    }

    /* renamed from: k */
    public final void m29384k(String str) {
        if (this.f66630c.getColumnKey(str) == -1) {
            return;
        }
        throw new IllegalArgumentException("Field already exists in '" + getClassName() + "': " + str);
    }

    /* renamed from: l */
    public final void m29383l(String str, RealmFieldType realmFieldType) {
        int i = C11419a.f66910a[realmFieldType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            throw new IllegalArgumentException("Date fields cannot be marked as primary keys: " + str);
        }
        throw new IllegalArgumentException("Boolean fields cannot be marked as primary keys: " + str);
    }

    /* renamed from: m */
    public final void m29382m(String str, Class cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            m29383l(str, RealmFieldType.BOOLEAN);
        }
        if (cls == Date.class) {
            m29383l(str, RealmFieldType.DATE);
        }
    }

    /* renamed from: n */
    public final void m29381n(String str) {
        RealmObjectSchema.m29622b(str);
        m29384k(str);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema removeField(String str) {
        this.f66629b.m29761d();
        RealmObjectSchema.m29622b(str);
        if (hasField(str)) {
            long m29620d = m29620d(str);
            String className = getClassName();
            if (str.equals(OsObjectStore.getPrimaryKeyForObject(this.f66629b.sharedRealm, className))) {
                OsObjectStore.setPrimaryKeyForObject(this.f66629b.sharedRealm, className, str);
            }
            this.f66630c.removeColumn(m29620d);
            return this;
        }
        throw new IllegalStateException(str + " does not exist.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema removeIndex(String str) {
        this.f66629b.m29761d();
        RealmObjectSchema.m29622b(str);
        m29623a(str);
        long m29620d = m29620d(str);
        if (this.f66630c.hasSearchIndex(m29620d)) {
            this.f66630c.removeSearchIndex(m29620d);
            return this;
        }
        throw new IllegalStateException("Field is not indexed: " + str);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema removePrimaryKey() {
        this.f66629b.m29761d();
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.f66629b.sharedRealm, getClassName());
        if (primaryKeyForObject != null) {
            long columnKey = this.f66630c.getColumnKey(primaryKeyForObject);
            if (this.f66630c.hasSearchIndex(columnKey)) {
                this.f66630c.removeSearchIndex(columnKey);
            }
            OsObjectStore.setPrimaryKeyForObject(this.f66629b.sharedRealm, getClassName(), null);
            return this;
        }
        throw new IllegalStateException(getClassName() + " doesn't have a primary key.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema renameField(String str, String str2) {
        this.f66629b.m29761d();
        RealmObjectSchema.m29622b(str);
        m29623a(str);
        RealmObjectSchema.m29622b(str2);
        m29384k(str2);
        this.f66630c.renameColumn(m29620d(str), str2);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema setClassName(String str) {
        this.f66629b.m29761d();
        m29385j(str);
        String tableNameForClass = Table.getTableNameForClass(str);
        int length = str.length();
        int i = Table.CLASS_NAME_MAX_LENGTH;
        if (length <= i) {
            if (!this.f66629b.sharedRealm.hasTable(tableNameForClass)) {
                String name = this.f66630c.getName();
                String className = this.f66630c.getClassName();
                String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.f66629b.sharedRealm, className);
                if (primaryKeyForObject != null) {
                    OsObjectStore.setPrimaryKeyForObject(this.f66629b.sharedRealm, className, null);
                }
                this.f66629b.sharedRealm.renameTable(name, tableNameForClass);
                if (primaryKeyForObject != null) {
                    try {
                        OsObjectStore.setPrimaryKeyForObject(this.f66629b.sharedRealm, str, primaryKeyForObject);
                    } catch (Exception e) {
                        this.f66629b.sharedRealm.renameTable(this.f66630c.getName(), name);
                        throw e;
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Class already exists: " + str);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: '%2$s' (%3$d)", Integer.valueOf(i), str, Integer.valueOf(str.length())));
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema setNullable(String str, boolean z) {
        setRequired(str, !z);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema setRequired(String str, boolean z) {
        long columnKey = this.f66630c.getColumnKey(str);
        boolean isRequired = isRequired(str);
        RealmFieldType columnType = this.f66630c.getColumnType(columnKey);
        if (columnType != RealmFieldType.OBJECT) {
            if (columnType != RealmFieldType.LIST) {
                if (z && isRequired) {
                    throw new IllegalStateException("Field is already required: " + str);
                } else if (!z && !isRequired) {
                    throw new IllegalStateException("Field is already nullable: " + str);
                } else {
                    if (z) {
                        try {
                            this.f66630c.convertColumnToNotNullable(columnKey);
                        } catch (RuntimeException e) {
                            if (e.getMessage().contains("has null value(s) in property")) {
                                throw new IllegalStateException(e.getMessage());
                            }
                            throw e;
                        }
                    } else {
                        this.f66630c.convertColumnToNullable(columnKey);
                    }
                    return this;
                }
            }
            throw new IllegalArgumentException("Cannot modify the required state for RealmList references: " + str);
        }
        throw new IllegalArgumentException("Cannot modify the required state for RealmObject references: " + str);
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema transform(RealmObjectSchema.Function function) {
        if (function != null) {
            OsResults createSnapshot = OsResults.createFromQuery(this.f66629b.sharedRealm, this.f66630c.where()).createSnapshot();
            long size = createSnapshot.size();
            if (size <= 2147483647L) {
                int size2 = (int) createSnapshot.size();
                for (int i = 0; i < size2; i++) {
                    DynamicRealmObject dynamicRealmObject = new DynamicRealmObject(this.f66629b, new CheckedRow(createSnapshot.getUncheckedRow(i)));
                    if (dynamicRealmObject.isValid()) {
                        function.apply(dynamicRealmObject);
                    }
                }
            } else {
                throw new UnsupportedOperationException("Too many results to iterate: " + size);
            }
        }
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmListField(String str, Class cls) {
        RealmObjectSchema.m29622b(str);
        m29384k(str);
        RealmObjectSchema.C11281b c11281b = (RealmObjectSchema.C11281b) RealmObjectSchema.f66624e.get(cls);
        if (c11281b == null) {
            if (!cls.equals(RealmObjectSchema.class) && !RealmModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format(Locale.US, "RealmList does not support lists with this type: %s(%s)", str, cls));
            }
            throw new IllegalArgumentException("Use 'addRealmListField(String name, RealmObjectSchema schema)' instead to add lists that link to other RealmObjects: " + str);
        }
        this.f66630c.addColumn(c11281b.f66634b, str, c11281b.f66635c);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmSetField(String str, Class cls) {
        RealmObjectSchema.m29622b(str);
        m29384k(str);
        RealmObjectSchema.C11281b c11281b = (RealmObjectSchema.C11281b) RealmObjectSchema.f66626g.get(cls);
        if (c11281b == null) {
            if (!cls.equals(RealmObjectSchema.class) && !RealmModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format(Locale.US, "RealmSet does not support sets with this type: %s(%s)", str, cls));
            }
            throw new IllegalArgumentException("Use 'addRealmSetField(String name, RealmObjectSchema schema)' instead to add sets that link to other RealmObjects: " + str);
        }
        this.f66630c.addColumn(c11281b.f66634b, str, c11281b.f66635c);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema addRealmDictionaryField(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.m29622b(str);
        m29384k(str);
        this.f66630c.addColumnDictionaryLink(RealmFieldType.STRING_TO_LINK_MAP, str, this.f66629b.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }
}
