package io.realm;

import io.realm.RealmObjectSchema;
import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: io.realm.n */
/* loaded from: classes5.dex */
public class C11420n extends RealmSchema {
    public C11420n(BaseRealm baseRealm) {
        super(baseRealm, null);
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema create(String str) {
        m29585c(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        int length = str.length();
        int i = Table.CLASS_NAME_MAX_LENGTH;
        if (length <= i) {
            BaseRealm baseRealm = this.f66651f;
            return new C11418m(baseRealm, this, baseRealm.m29754n().createTable(tableNameForClass));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", Integer.valueOf(i), Integer.valueOf(str.length())));
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema createWithPrimaryKeyField(String str, String str2, Class cls, FieldAttribute... fieldAttributeArr) {
        RealmFieldType realmFieldType;
        boolean z = false;
        m29585c(str, "Null or empty class names are not allowed");
        RealmObjectSchema.m29622b(str2);
        String m29379o = m29379o(str);
        RealmObjectSchema.C11281b c11281b = (RealmObjectSchema.C11281b) RealmObjectSchema.f66624e.get(cls);
        if (c11281b != null && ((realmFieldType = c11281b.f66633a) == RealmFieldType.STRING || realmFieldType == RealmFieldType.INTEGER || realmFieldType == RealmFieldType.OBJECT_ID)) {
            boolean z2 = c11281b.f66635c;
            if (!C11418m.m29380o(fieldAttributeArr, FieldAttribute.REQUIRED)) {
                z = z2;
            }
            BaseRealm baseRealm = this.f66651f;
            return new C11418m(baseRealm, this, baseRealm.m29754n().createTableWithPrimaryKey(m29379o, str2, c11281b.f66633a, z));
        }
        throw new IllegalArgumentException(String.format("Realm doesn't support primary key field type '%s'.", cls));
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema get(String str) {
        m29585c(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        if (!this.f66651f.m29754n().hasTable(tableNameForClass)) {
            return null;
        }
        return new C11418m(this.f66651f, this, this.f66651f.m29754n().getTable(tableNameForClass));
    }

    @Override // io.realm.RealmSchema
    public Set getAll() {
        String[] tablesNames = this.f66651f.m29754n().getTablesNames();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tablesNames.length);
        for (String str : tablesNames) {
            RealmObjectSchema realmObjectSchema = get(Table.getClassNameForTable(str));
            if (realmObjectSchema != null) {
                linkedHashSet.add(realmObjectSchema);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: o */
    public final String m29379o(String str) {
        int length = str.length();
        int i = Table.CLASS_NAME_MAX_LENGTH;
        if (length <= i) {
            return Table.getTableNameForClass(str);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", Integer.valueOf(i), Integer.valueOf(str.length())));
    }

    @Override // io.realm.RealmSchema
    public void remove(String str) {
        this.f66651f.m29761d();
        m29585c(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        if (OsObjectStore.deleteTableForObject(this.f66651f.m29754n(), str)) {
            m29574n(tableNameForClass);
            return;
        }
        throw new IllegalArgumentException("Cannot remove class because it is not in this Realm: " + str);
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema rename(String str, String str2) {
        this.f66651f.m29761d();
        m29585c(str, "Class names cannot be empty or null");
        m29585c(str2, "Class names cannot be empty or null");
        String tableNameForClass = Table.getTableNameForClass(str);
        String tableNameForClass2 = Table.getTableNameForClass(str2);
        m29586b(str, "Cannot rename class because it doesn't exist in this Realm: " + str);
        if (!this.f66651f.m29754n().hasTable(tableNameForClass2)) {
            this.f66651f.m29754n().renameTable(tableNameForClass, tableNameForClass2);
            Table table = this.f66651f.m29754n().getTable(tableNameForClass2);
            RealmObjectSchema m29574n = m29574n(tableNameForClass);
            if (m29574n == null || !m29574n.m29619f().isValid() || !m29574n.getClassName().equals(str2)) {
                m29574n = new C11418m(this.f66651f, this, table);
            }
            m29576l(tableNameForClass2, m29574n);
            return m29574n;
        }
        throw new IllegalArgumentException(str + " cannot be renamed because the new class already exists: " + str2);
    }
}
