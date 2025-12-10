package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* loaded from: classes5.dex */
public final class UnsupportedDurationField extends DurationField implements Serializable {
    private static HashMap<DurationFieldType, UnsupportedDurationField> cCache = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    private UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    public static synchronized UnsupportedDurationField getInstance(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        synchronized (UnsupportedDurationField.class) {
            try {
                HashMap<DurationFieldType, UnsupportedDurationField> hashMap = cCache;
                if (hashMap == null) {
                    cCache = new HashMap<>(7);
                    unsupportedDurationField = null;
                } else {
                    unsupportedDurationField = hashMap.get(durationFieldType);
                }
                if (unsupportedDurationField == null) {
                    unsupportedDurationField = new UnsupportedDurationField(durationFieldType);
                    cCache.put(durationFieldType, unsupportedDurationField);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unsupportedDurationField;
    }

    private Object readResolve() {
        return getInstance(this.iType);
    }

    private UnsupportedOperationException unsupported() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // org.joda.time.DurationField
    public long add(long j, int i) {
        throw unsupported();
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.getName() == null) {
            if (getName() == null) {
                return true;
            }
            return false;
        }
        return unsupportedDurationField.getName().equals(getName());
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j, long j2) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j, long j2) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public final DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return 0L;
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j) {
        throw unsupported();
    }

    public int hashCode() {
        return getName().hashCode();
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public boolean isSupported() {
        return false;
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        return "UnsupportedDurationField[" + getName() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // org.joda.time.DurationField
    public long add(long j, long j2) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j, long j2) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j, long j2) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i, long j) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j, long j2) {
        throw unsupported();
    }
}
