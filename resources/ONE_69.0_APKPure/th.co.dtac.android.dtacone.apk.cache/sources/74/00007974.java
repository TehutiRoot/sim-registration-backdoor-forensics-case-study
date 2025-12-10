package ch.qos.logback.classic.p008db.names;

import java.util.Locale;

/* renamed from: ch.qos.logback.classic.db.names.DefaultDBNameResolver */
/* loaded from: classes.dex */
public class DefaultDBNameResolver implements DBNameResolver {
    @Override // ch.qos.logback.classic.p008db.names.DBNameResolver
    public <N extends Enum<?>> String getColumnName(N n) {
        return n.toString().toLowerCase(Locale.US);
    }

    @Override // ch.qos.logback.classic.p008db.names.DBNameResolver
    public <N extends Enum<?>> String getTableName(N n) {
        return n.toString().toLowerCase(Locale.US);
    }
}