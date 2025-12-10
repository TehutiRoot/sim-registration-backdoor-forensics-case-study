package io.realm;

import io.realm.internal.ColumnIndices;
import io.realm.internal.ColumnInfo;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class RealmSchema {

    /* renamed from: a */
    public final Map f66646a = new HashMap();

    /* renamed from: b */
    public final Map f66647b = new HashMap();

    /* renamed from: c */
    public final Map f66648c = new HashMap();

    /* renamed from: d */
    public final Map f66649d = new HashMap();

    /* renamed from: e */
    public OsKeyPathMapping f66650e = null;

    /* renamed from: f */
    public final BaseRealm f66651f;

    /* renamed from: g */
    public final ColumnIndices f66652g;

    public RealmSchema(BaseRealm baseRealm, ColumnIndices columnIndices) {
        this.f66651f = baseRealm;
        this.f66652g = columnIndices;
    }

    /* renamed from: a */
    public final void m29587a() {
        if (m29578j()) {
            return;
        }
        throw new IllegalStateException("Attempt to use column key before set.");
    }

    /* renamed from: b */
    public void m29586b(String str, String str2) {
        if (this.f66651f.m29754n().hasTable(Table.getTableNameForClass(str))) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    /* renamed from: c */
    public void m29585c(String str, String str2) {
        if (str != null && !str.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public boolean contains(String str) {
        return this.f66651f.m29754n().hasTable(Table.getTableNameForClass(str));
    }

    public abstract RealmObjectSchema create(String str);

    public void createKeyPathMapping() {
        this.f66650e = new OsKeyPathMapping(this.f66651f.sharedRealm.getNativePtr());
    }

    public abstract RealmObjectSchema createWithPrimaryKeyField(String str, String str2, Class<?> cls, FieldAttribute... fieldAttributeArr);

    /* renamed from: d */
    public final ColumnInfo m29584d(Class cls) {
        m29587a();
        return this.f66652g.getColumnInfo(cls);
    }

    /* renamed from: e */
    public final OsKeyPathMapping m29583e() {
        return this.f66650e;
    }

    /* renamed from: f */
    public RealmObjectSchema m29582f(Class cls) {
        C11296i c11296i = (RealmObjectSchema) this.f66648c.get(cls);
        if (c11296i != null) {
            return c11296i;
        }
        Class<? extends RealmModel> originalModelClass = Util.getOriginalModelClass(cls);
        if (m29577k(originalModelClass, cls)) {
            c11296i = (RealmObjectSchema) this.f66648c.get(originalModelClass);
        }
        if (c11296i == null) {
            C11296i c11296i2 = new C11296i(this.f66651f, this, m29580h(cls), m29584d(originalModelClass));
            this.f66648c.put(originalModelClass, c11296i2);
            c11296i = c11296i2;
        }
        if (m29577k(originalModelClass, cls)) {
            this.f66648c.put(cls, c11296i);
        }
        return c11296i;
    }

    /* renamed from: g */
    public RealmObjectSchema m29581g(String str) {
        String tableNameForClass = Table.getTableNameForClass(str);
        RealmObjectSchema realmObjectSchema = (RealmObjectSchema) this.f66649d.get(tableNameForClass);
        if (realmObjectSchema == null || !realmObjectSchema.m29619f().isValid() || !realmObjectSchema.getClassName().equals(str)) {
            if (this.f66651f.m29754n().hasTable(tableNameForClass)) {
                BaseRealm baseRealm = this.f66651f;
                C11296i c11296i = new C11296i(baseRealm, this, baseRealm.m29754n().getTable(tableNameForClass));
                this.f66649d.put(tableNameForClass, c11296i);
                return c11296i;
            }
            throw new IllegalArgumentException("The class " + str + " doesn't exist in this Realm.");
        }
        return realmObjectSchema;
    }

    @Nullable
    public abstract RealmObjectSchema get(String str);

    public abstract Set<RealmObjectSchema> getAll();

    public final ColumnInfo getColumnInfo(String str) {
        m29587a();
        return this.f66652g.getColumnInfo(str);
    }

    /* renamed from: h */
    public Table m29580h(Class cls) {
        Table table = (Table) this.f66647b.get(cls);
        if (table != null) {
            return table;
        }
        Class<? extends RealmModel> originalModelClass = Util.getOriginalModelClass(cls);
        if (m29577k(originalModelClass, cls)) {
            table = (Table) this.f66647b.get(originalModelClass);
        }
        if (table == null) {
            table = this.f66651f.m29754n().getTable(Table.getTableNameForClass(this.f66651f.getConfiguration().getSchemaMediator().getSimpleClassName(originalModelClass)));
            this.f66647b.put(originalModelClass, table);
        }
        if (m29577k(originalModelClass, cls)) {
            this.f66647b.put(cls, table);
        }
        return table;
    }

    /* renamed from: i */
    public Table m29579i(String str) {
        String tableNameForClass = Table.getTableNameForClass(str);
        Table table = (Table) this.f66646a.get(tableNameForClass);
        if (table != null) {
            return table;
        }
        Table table2 = this.f66651f.m29754n().getTable(tableNameForClass);
        this.f66646a.put(tableNameForClass, table2);
        return table2;
    }

    /* renamed from: j */
    public final boolean m29578j() {
        if (this.f66652g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m29577k(Class cls, Class cls2) {
        return cls.equals(cls2);
    }

    /* renamed from: l */
    public final void m29576l(String str, RealmObjectSchema realmObjectSchema) {
        this.f66649d.put(str, realmObjectSchema);
    }

    /* renamed from: m */
    public void m29575m() {
        ColumnIndices columnIndices = this.f66652g;
        if (columnIndices != null) {
            columnIndices.refresh();
        }
        this.f66646a.clear();
        this.f66647b.clear();
        this.f66648c.clear();
        this.f66649d.clear();
    }

    /* renamed from: n */
    public final RealmObjectSchema m29574n(String str) {
        return (RealmObjectSchema) this.f66649d.remove(str);
    }

    public abstract void remove(String str);

    public abstract RealmObjectSchema rename(String str, String str2);
}
