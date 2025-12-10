package io.realm.internal;

import io.realm.RealmModel;
import io.realm.exceptions.RealmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nonnull;

/* loaded from: classes5.dex */
public final class ColumnIndices {

    /* renamed from: a */
    public final Map f66660a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Map f66661b = new HashMap();

    /* renamed from: c */
    public final RealmProxyMediator f66662c;

    /* renamed from: d */
    public final OsSchemaInfo f66663d;

    public ColumnIndices(RealmProxyMediator realmProxyMediator, OsSchemaInfo osSchemaInfo) {
        this.f66662c = realmProxyMediator;
        this.f66663d = osSchemaInfo;
    }

    @Nonnull
    public ColumnInfo getColumnInfo(Class<? extends RealmModel> cls) {
        ColumnInfo columnInfo = (ColumnInfo) this.f66660a.get(cls);
        if (columnInfo == null) {
            ColumnInfo createColumnInfo = this.f66662c.createColumnInfo(cls, this.f66663d);
            this.f66660a.put(cls, createColumnInfo);
            return createColumnInfo;
        }
        return columnInfo;
    }

    public void refresh() {
        for (Map.Entry entry : this.f66660a.entrySet()) {
            ((ColumnInfo) entry.getValue()).copyFrom(this.f66662c.createColumnInfo((Class) entry.getKey(), this.f66663d));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnIndices[");
        boolean z = false;
        for (Map.Entry entry : this.f66660a.entrySet()) {
            if (z) {
                sb.append(",");
            }
            sb.append(((Class) entry.getKey()).getSimpleName());
            sb.append("->");
            sb.append(entry.getValue());
            z = true;
        }
        sb.append("]");
        return sb.toString();
    }

    @Nonnull
    public ColumnInfo getColumnInfo(String str) {
        ColumnInfo columnInfo = (ColumnInfo) this.f66661b.get(str);
        if (columnInfo == null) {
            Iterator<Class<? extends RealmModel>> it = this.f66662c.getModelClasses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<? extends RealmModel> next = it.next();
                if (this.f66662c.getSimpleClassName(next).equals(str)) {
                    columnInfo = getColumnInfo(next);
                    this.f66661b.put(str, columnInfo);
                    break;
                }
            }
        }
        if (columnInfo != null) {
            return columnInfo;
        }
        throw new RealmException(String.format(Locale.US, "'%s' doesn't exist in current schema.", str));
    }
}
