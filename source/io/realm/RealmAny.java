package io.realm;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class RealmAny {

    /* renamed from: a */
    public final RealmAnyOperator f66538a;

    /* loaded from: classes5.dex */
    public enum Type {
        INTEGER(RealmFieldType.INTEGER, Long.class),
        BOOLEAN(RealmFieldType.BOOLEAN, Boolean.class),
        STRING(RealmFieldType.STRING, String.class),
        BINARY(RealmFieldType.BINARY, Byte[].class),
        DATE(RealmFieldType.DATE, Date.class),
        FLOAT(RealmFieldType.FLOAT, Float.class),
        DOUBLE(RealmFieldType.DOUBLE, Double.class),
        DECIMAL128(RealmFieldType.DECIMAL128, Decimal128.class),
        OBJECT_ID(RealmFieldType.OBJECT_ID, ObjectId.class),
        OBJECT(RealmFieldType.TYPED_LINK, RealmModel.class),
        UUID(RealmFieldType.UUID, UUID.class),
        NULL(null, null);
        
        private static final Type[] realmFieldToRealmAnyTypeMap = new Type[19];
        private final Class<?> clazz;
        private final RealmFieldType realmFieldType;

        static {
            Type[] values;
            for (Type type : values()) {
                if (type != NULL) {
                    realmFieldToRealmAnyTypeMap[type.realmFieldType.getNativeValue()] = type;
                }
            }
            realmFieldToRealmAnyTypeMap[RealmFieldType.OBJECT.getNativeValue()] = OBJECT;
        }

        Type(@Nullable RealmFieldType realmFieldType, @Nullable Class cls) {
            this.realmFieldType = realmFieldType;
            this.clazz = cls;
        }

        public static Type fromNativeValue(int i) {
            if (i == -1) {
                return NULL;
            }
            return realmFieldToRealmAnyTypeMap[i];
        }

        public Class<?> getTypedClass() {
            return this.clazz;
        }
    }

    public RealmAny(RealmAnyOperator realmAnyOperator) {
        this.f66538a = realmAnyOperator;
    }

    /* renamed from: c */
    public static RealmAny m29706c(Object obj) {
        if (obj == null) {
            return nullValue();
        }
        if (obj instanceof Boolean) {
            return valueOf((Boolean) obj);
        }
        if (obj instanceof Byte) {
            return valueOf((Byte) obj);
        }
        if (obj instanceof Short) {
            return valueOf((Short) obj);
        }
        if (obj instanceof Integer) {
            return valueOf((Integer) obj);
        }
        if (obj instanceof Long) {
            return valueOf((Long) obj);
        }
        if (obj instanceof Float) {
            return valueOf((Float) obj);
        }
        if (obj instanceof Double) {
            return valueOf((Double) obj);
        }
        if (obj instanceof Decimal128) {
            return valueOf((Decimal128) obj);
        }
        if (obj instanceof String) {
            return valueOf((String) obj);
        }
        if (obj instanceof byte[]) {
            return valueOf((byte[]) obj);
        }
        if (obj instanceof Date) {
            return valueOf((Date) obj);
        }
        if (obj instanceof ObjectId) {
            return valueOf((ObjectId) obj);
        }
        if (obj instanceof UUID) {
            return valueOf((UUID) obj);
        }
        if (obj instanceof RealmAny) {
            return (RealmAny) obj;
        }
        if (RealmModel.class.isAssignableFrom(obj.getClass())) {
            RealmModel realmModel = (RealmModel) obj;
            if (RealmObject.isValid(realmModel) && RealmObject.isManaged(realmModel)) {
                return valueOf(realmModel);
            }
            throw new IllegalArgumentException("RealmObject is not a valid managed object.");
        }
        throw new IllegalArgumentException("Type not supported on RealmAny: " + obj.getClass().getSimpleName());
    }

    public static RealmAny nullValue() {
        return new RealmAny(new C11421o());
    }

    public static RealmAny valueOf(@Nullable Byte b) {
        return new RealmAny(b == null ? new C11421o() : new C11413j(b));
    }

    /* renamed from: a */
    public void m29708a(BaseRealm baseRealm) {
        this.f66538a.checkValidObject(baseRealm);
    }

    public byte[] asBinary() {
        return (byte[]) this.f66538a.mo29322g(byte[].class);
    }

    public Boolean asBoolean() {
        return (Boolean) this.f66538a.mo29322g(Boolean.class);
    }

    public Byte asByte() {
        Number number = (Number) this.f66538a.mo29322g(Number.class);
        if (number == null) {
            return null;
        }
        return Byte.valueOf(number.byteValue());
    }

    public Date asDate() {
        return (Date) this.f66538a.mo29322g(Date.class);
    }

    public Decimal128 asDecimal128() {
        return (Decimal128) this.f66538a.mo29322g(Decimal128.class);
    }

    public Double asDouble() {
        return (Double) this.f66538a.mo29322g(Double.class);
    }

    public Float asFloat() {
        return (Float) this.f66538a.mo29322g(Float.class);
    }

    public Integer asInteger() {
        Number number = (Number) this.f66538a.mo29322g(Number.class);
        if (number == null) {
            return null;
        }
        return Integer.valueOf(number.intValue());
    }

    public Long asLong() {
        Number number = (Number) this.f66538a.mo29322g(Number.class);
        if (number == null) {
            return null;
        }
        return Long.valueOf(number.longValue());
    }

    public ObjectId asObjectId() {
        return (ObjectId) this.f66538a.mo29322g(ObjectId.class);
    }

    public <T extends RealmModel> T asRealmModel(Class<T> cls) {
        return (T) this.f66538a.mo29322g(cls);
    }

    public Short asShort() {
        Number number = (Number) this.f66538a.mo29322g(Number.class);
        if (number == null) {
            return null;
        }
        return Short.valueOf(number.shortValue());
    }

    public String asString() {
        return (String) this.f66538a.mo29322g(String.class);
    }

    public UUID asUUID() {
        return (UUID) this.f66538a.mo29322g(UUID.class);
    }

    /* renamed from: b */
    public final long m29707b() {
        return this.f66538a.m29703c();
    }

    public final boolean coercedEquals(@Nullable RealmAny realmAny) {
        if (realmAny == null) {
            return false;
        }
        return this.f66538a.m29705a(realmAny.f66538a);
    }

    @SuppressFBWarnings({"NP_METHOD_PARAMETER_TIGHTENS_ANNOTATION"})
    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealmAny)) {
            return false;
        }
        return this.f66538a.equals(((RealmAny) obj).f66538a);
    }

    public Type getType() {
        return this.f66538a.m29701e();
    }

    @Nullable
    public Class<?> getValueClass() {
        return this.f66538a.mo29323f();
    }

    public final int hashCode() {
        return this.f66538a.hashCode();
    }

    public boolean isNull() {
        if (getType() == Type.NULL) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f66538a.toString();
    }

    public static RealmAny valueOf(@Nullable Short sh) {
        return new RealmAny(sh == null ? new C11421o() : new C11413j(sh));
    }

    public static RealmAny valueOf(@Nullable Integer num) {
        return new RealmAny(num == null ? new C11421o() : new C11413j(num));
    }

    public static RealmAny valueOf(@Nullable Long l) {
        return new RealmAny(l == null ? new C11421o() : new C11413j(l));
    }

    public static RealmAny valueOf(@Nullable Boolean bool) {
        return new RealmAny(bool == null ? new C11421o() : new C11289b(bool));
    }

    public static RealmAny valueOf(@Nullable Float f) {
        return new RealmAny(f == null ? new C11421o() : new C11294g(f));
    }

    public static RealmAny valueOf(@Nullable Double d) {
        return new RealmAny(d == null ? new C11421o() : new C11293f(d));
    }

    public static RealmAny valueOf(@Nullable String str) {
        return new RealmAny(str == null ? new C11421o() : new C11489x(str));
    }

    public static RealmAny valueOf(@Nullable byte[] bArr) {
        return new RealmAny(bArr == null ? new C11421o() : new C11288a(bArr));
    }

    public static RealmAny valueOf(@Nullable Date date) {
        return new RealmAny(date == null ? new C11421o() : new C11291d(date));
    }

    public static RealmAny valueOf(@Nullable ObjectId objectId) {
        return new RealmAny(objectId == null ? new C11421o() : new C11422p(objectId));
    }

    public static RealmAny valueOf(@Nullable Decimal128 decimal128) {
        return new RealmAny(decimal128 == null ? new C11421o() : new C11292e(decimal128));
    }

    public static RealmAny valueOf(@Nullable UUID uuid) {
        return new RealmAny(uuid == null ? new C11421o() : new C11490y(uuid));
    }

    public static RealmAny valueOf(@Nullable RealmModel realmModel) {
        return new RealmAny(realmModel == null ? new C11421o() : new C11486u(realmModel));
    }
}
