package ch.qos.logback.classic.p008db.names;

import java.util.Locale;

/* renamed from: ch.qos.logback.classic.db.names.SimpleDBNameResolver */
/* loaded from: classes.dex */
public class SimpleDBNameResolver implements DBNameResolver {

    /* renamed from: a */
    public String f39532a = "";

    /* renamed from: b */
    public String f39533b = "";

    /* renamed from: c */
    public String f39534c = "";

    /* renamed from: d */
    public String f39535d = "";

    @Override // ch.qos.logback.classic.p008db.names.DBNameResolver
    public <N extends Enum<?>> String getColumnName(N n) {
        return this.f39534c + n.name().toLowerCase(Locale.US) + this.f39535d;
    }

    @Override // ch.qos.logback.classic.p008db.names.DBNameResolver
    public <N extends Enum<?>> String getTableName(N n) {
        return this.f39532a + n.name().toLowerCase(Locale.US) + this.f39533b;
    }

    public void setColumnNamePrefix(String str) {
        if (str == null) {
            str = "";
        }
        this.f39534c = str;
    }

    public void setColumnNameSuffix(String str) {
        if (str == null) {
            str = "";
        }
        this.f39535d = str;
    }

    public void setTableNamePrefix(String str) {
        if (str == null) {
            str = "";
        }
        this.f39532a = str;
    }

    public void setTableNameSuffix(String str) {
        if (str == null) {
            str = "";
        }
        this.f39533b = str;
    }
}