package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: classes2.dex */
public final class FieldInfo implements Comparable {

    /* renamed from: a */
    public final java.lang.reflect.Field f34852a;

    /* renamed from: b */
    public final FieldType f34853b;

    /* renamed from: c */
    public final Class f34854c;

    /* renamed from: d */
    public final int f34855d;

    /* renamed from: e */
    public final java.lang.reflect.Field f34856e;

    /* renamed from: f */
    public final int f34857f;

    /* renamed from: g */
    public final boolean f34858g;

    /* renamed from: h */
    public final boolean f34859h;

    /* renamed from: i */
    public final java.lang.reflect.Field f34860i;

    /* renamed from: j */
    public final Class f34861j;

    /* renamed from: k */
    public final Object f34862k;

    /* renamed from: l */
    public final Internal.EnumVerifier f34863l;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public java.lang.reflect.Field f34864a;

        /* renamed from: b */
        public FieldType f34865b;

        /* renamed from: c */
        public int f34866c;

        /* renamed from: d */
        public java.lang.reflect.Field f34867d;

        /* renamed from: e */
        public int f34868e;

        /* renamed from: f */
        public boolean f34869f;

        /* renamed from: g */
        public boolean f34870g;

        /* renamed from: h */
        public Class f34871h;

        /* renamed from: i */
        public Object f34872i;

        /* renamed from: j */
        public Internal.EnumVerifier f34873j;

        /* renamed from: k */
        public java.lang.reflect.Field f34874k;

        public FieldInfo build() {
            Object obj = this.f34872i;
            if (obj != null) {
                return FieldInfo.m55791e(this.f34864a, this.f34866c, obj, this.f34873j);
            }
            java.lang.reflect.Field field = this.f34867d;
            if (field != null) {
                if (this.f34869f) {
                    return FieldInfo.m55787i(this.f34864a, this.f34866c, this.f34865b, field, this.f34868e, this.f34870g, this.f34873j);
                }
                return FieldInfo.m55788h(this.f34864a, this.f34866c, this.f34865b, field, this.f34868e, this.f34870g, this.f34873j);
            }
            Internal.EnumVerifier enumVerifier = this.f34873j;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.f34874k;
                if (field2 == null) {
                    return FieldInfo.m55792d(this.f34864a, this.f34866c, this.f34865b, enumVerifier);
                }
                return FieldInfo.m55789g(this.f34864a, this.f34866c, this.f34865b, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.f34874k;
            if (field3 == null) {
                return FieldInfo.m55793c(this.f34864a, this.f34866c, this.f34865b, this.f34870g);
            }
            return FieldInfo.m55790f(this.f34864a, this.f34866c, this.f34865b, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.f34874k = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z) {
            this.f34870g = z;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.f34873j = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            this.f34864a = field;
            return this;
        }

        public Builder withFieldNumber(int i) {
            this.f34866c = i;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.f34872i = obj;
            return this;
        }

        public Builder withOneof(AbstractC18278Pg1 abstractC18278Pg1, Class<?> cls) {
            if (this.f34864a == null && this.f34867d == null) {
                this.f34871h = cls;
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        public Builder withPresence(java.lang.reflect.Field field, int i) {
            this.f34867d = (java.lang.reflect.Field) Internal.m55679b(field, "presenceField");
            this.f34868e = i;
            return this;
        }

        public Builder withRequired(boolean z) {
            this.f34869f = z;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.f34865b = fieldType;
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.FieldInfo$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4348a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34875a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f34875a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34875a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34875a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34875a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FieldInfo(java.lang.reflect.Field field, int i, FieldType fieldType, Class cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, AbstractC18278Pg1 abstractC18278Pg1, Class cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f34852a = field;
        this.f34853b = fieldType;
        this.f34854c = cls;
        this.f34855d = i;
        this.f34856e = field2;
        this.f34857f = i2;
        this.f34858g = z;
        this.f34859h = z2;
        this.f34861j = cls2;
        this.f34862k = obj;
        this.f34863l = enumVerifier;
        this.f34860i = field3;
    }

    /* renamed from: a */
    public static void m55795a(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i);
    }

    /* renamed from: c */
    public static FieldInfo m55793c(java.lang.reflect.Field field, int i, FieldType fieldType, boolean z) {
        m55795a(i);
        Internal.m55679b(field, "field");
        Internal.m55679b(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: d */
    public static FieldInfo m55792d(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        m55795a(i);
        Internal.m55679b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    /* renamed from: e */
    public static FieldInfo m55791e(java.lang.reflect.Field field, int i, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.m55679b(obj, "mapDefaultEntry");
        m55795a(i);
        Internal.m55679b(field, "field");
        return new FieldInfo(field, i, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    /* renamed from: f */
    public static FieldInfo m55790f(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2) {
        m55795a(i);
        Internal.m55679b(field, "field");
        Internal.m55679b(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: g */
    public static FieldInfo m55789g(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        m55795a(i);
        Internal.m55679b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    /* renamed from: h */
    public static FieldInfo m55788h(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        m55795a(i);
        Internal.m55679b(field, "field");
        Internal.m55679b(fieldType, "fieldType");
        Internal.m55679b(field2, "presenceField");
        if (field2 != null && !m55775u(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new FieldInfo(field, i, fieldType, null, field2, i2, false, z, null, null, null, enumVerifier, null);
    }

    /* renamed from: i */
    public static FieldInfo m55787i(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        m55795a(i);
        Internal.m55679b(field, "field");
        Internal.m55679b(fieldType, "fieldType");
        Internal.m55679b(field2, "presenceField");
        if (field2 != null && !m55775u(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new FieldInfo(field, i, fieldType, null, field2, i2, true, z, null, null, null, enumVerifier, null);
    }

    /* renamed from: u */
    public static boolean m55775u(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(FieldInfo fieldInfo) {
        return this.f34855d - fieldInfo.f34855d;
    }

    /* renamed from: j */
    public java.lang.reflect.Field m55786j() {
        return this.f34860i;
    }

    /* renamed from: k */
    public Internal.EnumVerifier m55785k() {
        return this.f34863l;
    }

    /* renamed from: l */
    public java.lang.reflect.Field m55784l() {
        return this.f34852a;
    }

    /* renamed from: m */
    public int m55783m() {
        return this.f34855d;
    }

    /* renamed from: n */
    public Object m55782n() {
        return this.f34862k;
    }

    /* renamed from: o */
    public Class m55781o() {
        int i = C4348a.f34875a[this.f34853b.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return null;
            }
            return this.f34854c;
        }
        java.lang.reflect.Field field = this.f34852a;
        if (field != null) {
            return field.getType();
        }
        return this.f34861j;
    }

    /* renamed from: p */
    public AbstractC18278Pg1 m55780p() {
        return null;
    }

    /* renamed from: q */
    public java.lang.reflect.Field m55779q() {
        return this.f34856e;
    }

    /* renamed from: r */
    public int m55778r() {
        return this.f34857f;
    }

    /* renamed from: s */
    public FieldType m55777s() {
        return this.f34853b;
    }

    /* renamed from: t */
    public boolean m55776t() {
        return this.f34859h;
    }

    /* renamed from: v */
    public boolean m55774v() {
        return this.f34858g;
    }
}