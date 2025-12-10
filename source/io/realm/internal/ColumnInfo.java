package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class ColumnInfo {

    /* renamed from: a */
    public final Map f66664a;

    /* renamed from: b */
    public final Map f66665b;

    /* renamed from: c */
    public final Map f66666c;

    /* renamed from: d */
    public final boolean f66667d;

    /* loaded from: classes5.dex */
    public static final class ColumnDetails {
        public final long columnKey;
        public final RealmFieldType columnType;
        public final String linkedClassName;

        public String toString() {
            return "ColumnDetails[" + this.columnKey + ", " + this.columnType + ", " + this.linkedClassName + "]";
        }

        public ColumnDetails(long j, RealmFieldType realmFieldType, String str) {
            this.columnKey = j;
            this.columnType = realmFieldType;
            this.linkedClassName = str;
        }

        public ColumnDetails(Property property) {
            this(property.getColumnKey(), property.getType(), property.getLinkedObjectName());
        }
    }

    public ColumnInfo(int i) {
        this(i, true);
    }

    public final void addBacklinkDetails(OsSchemaInfo osSchemaInfo, String str, String str2, String str3) {
        this.f66664a.put(str, new ColumnDetails(osSchemaInfo.getObjectSchemaInfo(str2).getProperty(str3).getColumnKey(), RealmFieldType.LINKING_OBJECTS, str2));
    }

    public final long addColumnDetails(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property property = osObjectSchemaInfo.getProperty(str2);
        ColumnDetails columnDetails = new ColumnDetails(property);
        this.f66664a.put(str, columnDetails);
        this.f66665b.put(str2, columnDetails);
        this.f66666c.put(str, str2);
        return property.getColumnKey();
    }

    public abstract ColumnInfo copy(boolean z);

    public abstract void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2);

    public void copyFrom(ColumnInfo columnInfo) {
        if (this.f66667d) {
            if (columnInfo != null) {
                this.f66664a.clear();
                this.f66664a.putAll(columnInfo.f66664a);
                this.f66665b.clear();
                this.f66665b.putAll(columnInfo.f66665b);
                this.f66666c.clear();
                this.f66666c.putAll(columnInfo.f66666c);
                copy(columnInfo, this);
                return;
            }
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
        throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
    }

    @Nullable
    public ColumnDetails getColumnDetails(String str) {
        return (ColumnDetails) this.f66664a.get(str);
    }

    public long getColumnKey(String str) {
        ColumnDetails columnDetails = (ColumnDetails) this.f66664a.get(str);
        if (columnDetails == null) {
            return -1L;
        }
        return columnDetails.columnKey;
    }

    public Map<String, ColumnDetails> getColumnKeysMap() {
        return this.f66664a;
    }

    @Nullable
    public String getInternalFieldName(String str) {
        return (String) this.f66666c.get(str);
    }

    public final boolean isMutable() {
        return this.f66667d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnInfo[");
        sb.append("mutable=" + this.f66667d);
        sb.append(",");
        boolean z = false;
        if (this.f66664a != null) {
            sb.append("JavaFieldNames=[");
            boolean z2 = false;
            for (Map.Entry entry : this.f66664a.entrySet()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append((String) entry.getKey());
                sb.append("->");
                sb.append(entry.getValue());
                z2 = true;
            }
            sb.append("]");
        }
        if (this.f66665b != null) {
            sb.append(", InternalFieldNames=[");
            for (Map.Entry entry2 : this.f66665b.entrySet()) {
                if (z) {
                    sb.append(",");
                }
                sb.append((String) entry2.getKey());
                sb.append("->");
                sb.append(entry2.getValue());
                z = true;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    public ColumnInfo(@Nullable ColumnInfo columnInfo, boolean z) {
        this(columnInfo == null ? 0 : columnInfo.f66664a.size(), z);
        if (columnInfo != null) {
            this.f66664a.putAll(columnInfo.f66664a);
        }
    }

    public ColumnInfo(int i, boolean z) {
        this.f66664a = new HashMap(i);
        this.f66665b = new HashMap(i);
        this.f66666c = new HashMap(i);
        this.f66667d = z;
    }
}
