package p000;

import io.realm.BaseRealm;
import io.realm.C11283i;
import io.realm.FieldAttribute;
import io.realm.RealmModel;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.internal.ColumnIndices;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Table;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: Ld0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18008Ld0 extends RealmSchema {
    public C18008Ld0(BaseRealm baseRealm, ColumnIndices columnIndices) {
        super(baseRealm, columnIndices);
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema create(String str) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema createWithPrimaryKeyField(String str, String str2, Class cls, FieldAttribute... fieldAttributeArr) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema get(String str) {
        m29925c(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        if (!this.f66714f.m30094n().hasTable(tableNameForClass)) {
            return null;
        }
        return new C11283i(this.f66714f, this, this.f66714f.m30094n().getTable(tableNameForClass), getColumnInfo(str));
    }

    @Override // io.realm.RealmSchema
    public Set getAll() {
        RealmProxyMediator schemaMediator = this.f66714f.getConfiguration().getSchemaMediator();
        Set<Class<? extends RealmModel>> modelClasses = schemaMediator.getModelClasses();
        LinkedHashSet linkedHashSet = new LinkedHashSet(modelClasses.size());
        for (Class<? extends RealmModel> cls : modelClasses) {
            linkedHashSet.add(get(schemaMediator.getSimpleClassName(cls)));
        }
        return linkedHashSet;
    }

    @Override // io.realm.RealmSchema
    public void remove(String str) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema rename(String str, String str2) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
}