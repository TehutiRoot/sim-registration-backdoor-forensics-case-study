package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class FieldInfo implements Comparable {

    /* renamed from: a */
    public final java.lang.reflect.Field f57304a;

    /* renamed from: b */
    public final FieldType f57305b;

    /* renamed from: c */
    public final Class f57306c;

    /* renamed from: d */
    public final int f57307d;

    /* renamed from: e */
    public final java.lang.reflect.Field f57308e;

    /* renamed from: f */
    public final int f57309f;

    /* renamed from: g */
    public final boolean f57310g;

    /* renamed from: h */
    public final boolean f57311h;

    /* renamed from: i */
    public final java.lang.reflect.Field f57312i;

    /* renamed from: j */
    public final Class f57313j;

    /* renamed from: k */
    public final Object f57314k;

    /* renamed from: l */
    public final Internal.EnumVerifier f57315l;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public java.lang.reflect.Field f57316a;

        /* renamed from: b */
        public FieldType f57317b;

        /* renamed from: c */
        public int f57318c;

        /* renamed from: d */
        public java.lang.reflect.Field f57319d;

        /* renamed from: e */
        public int f57320e;

        /* renamed from: f */
        public boolean f57321f;

        /* renamed from: g */
        public boolean f57322g;

        /* renamed from: h */
        public Class f57323h;

        /* renamed from: i */
        public Object f57324i;

        /* renamed from: j */
        public Internal.EnumVerifier f57325j;

        /* renamed from: k */
        public java.lang.reflect.Field f57326k;

        public FieldInfo build() {
            Object obj = this.f57324i;
            if (obj != null) {
                return FieldInfo.m35911e(this.f57316a, this.f57318c, obj, this.f57325j);
            }
            java.lang.reflect.Field field = this.f57319d;
            if (field != null) {
                if (this.f57321f) {
                    return FieldInfo.m35907i(this.f57316a, this.f57318c, this.f57317b, field, this.f57320e, this.f57322g, this.f57325j);
                }
                return FieldInfo.m35908h(this.f57316a, this.f57318c, this.f57317b, field, this.f57320e, this.f57322g, this.f57325j);
            }
            Internal.EnumVerifier enumVerifier = this.f57325j;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.f57326k;
                if (field2 == null) {
                    return FieldInfo.m35912d(this.f57316a, this.f57318c, this.f57317b, enumVerifier);
                }
                return FieldInfo.m35909g(this.f57316a, this.f57318c, this.f57317b, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.f57326k;
            if (field3 == null) {
                return FieldInfo.m35913c(this.f57316a, this.f57318c, this.f57317b, this.f57322g);
            }
            return FieldInfo.m35910f(this.f57316a, this.f57318c, this.f57317b, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.f57326k = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z) {
            this.f57322g = z;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.f57325j = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            this.f57316a = field;
            return this;
        }

        public Builder withFieldNumber(int i) {
            this.f57318c = i;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.f57324i = obj;
            return this;
        }

        public Builder withOneof(AbstractC18365Rf1 abstractC18365Rf1, Class<?> cls) {
            if (this.f57316a == null && this.f57319d == null) {
                this.f57323h = cls;
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        public Builder withPresence(java.lang.reflect.Field field, int i) {
            this.f57319d = (java.lang.reflect.Field) Internal.m35785b(field, "presenceField");
            this.f57320e = i;
            return this;
        }

        public Builder withRequired(boolean z) {
            this.f57321f = z;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.f57317b = fieldType;
            return this;
        }
    }

    /* renamed from: com.google.protobuf.FieldInfo$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8877a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57327a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f57327a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57327a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57327a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57327a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FieldInfo(java.lang.reflect.Field field, int i, FieldType fieldType, Class cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, AbstractC18365Rf1 abstractC18365Rf1, Class cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f57304a = field;
        this.f57305b = fieldType;
        this.f57306c = cls;
        this.f57307d = i;
        this.f57308e = field2;
        this.f57309f = i2;
        this.f57310g = z;
        this.f57311h = z2;
        this.f57313j = cls2;
        this.f57314k = obj;
        this.f57315l = enumVerifier;
        this.f57312i = field3;
    }

    /* renamed from: a */
    public static void m35915a(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i);
    }

    /* renamed from: c */
    public static FieldInfo m35913c(java.lang.reflect.Field field, int i, FieldType fieldType, boolean z) {
        m35915a(i);
        Internal.m35785b(field, "field");
        Internal.m35785b(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: d */
    public static FieldInfo m35912d(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        m35915a(i);
        Internal.m35785b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    /* renamed from: e */
    public static FieldInfo m35911e(java.lang.reflect.Field field, int i, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.m35785b(obj, "mapDefaultEntry");
        m35915a(i);
        Internal.m35785b(field, "field");
        return new FieldInfo(field, i, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    /* renamed from: f */
    public static FieldInfo m35910f(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2) {
        m35915a(i);
        Internal.m35785b(field, "field");
        Internal.m35785b(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: g */
    public static FieldInfo m35909g(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        m35915a(i);
        Internal.m35785b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    /* renamed from: h */
    public static FieldInfo m35908h(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        m35915a(i);
        Internal.m35785b(field, "field");
        Internal.m35785b(fieldType, "fieldType");
        Internal.m35785b(field2, "presenceField");
        if (field2 != null && !m35895u(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new FieldInfo(field, i, fieldType, null, field2, i2, false, z, null, null, null, enumVerifier, null);
    }

    /* renamed from: i */
    public static FieldInfo m35907i(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        m35915a(i);
        Internal.m35785b(field, "field");
        Internal.m35785b(fieldType, "fieldType");
        Internal.m35785b(field2, "presenceField");
        if (field2 != null && !m35895u(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new FieldInfo(field, i, fieldType, null, field2, i2, true, z, null, null, null, enumVerifier, null);
    }

    /* renamed from: u */
    public static boolean m35895u(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(FieldInfo fieldInfo) {
        return this.f57307d - fieldInfo.f57307d;
    }

    /* renamed from: j */
    public java.lang.reflect.Field m35906j() {
        return this.f57312i;
    }

    /* renamed from: k */
    public Internal.EnumVerifier m35905k() {
        return this.f57315l;
    }

    /* renamed from: l */
    public java.lang.reflect.Field m35904l() {
        return this.f57304a;
    }

    /* renamed from: m */
    public int m35903m() {
        return this.f57307d;
    }

    /* renamed from: n */
    public Object m35902n() {
        return this.f57314k;
    }

    /* renamed from: o */
    public Class m35901o() {
        int i = C8877a.f57327a[this.f57305b.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return null;
            }
            return this.f57306c;
        }
        java.lang.reflect.Field field = this.f57304a;
        if (field != null) {
            return field.getType();
        }
        return this.f57313j;
    }

    /* renamed from: p */
    public AbstractC18365Rf1 m35900p() {
        return null;
    }

    /* renamed from: q */
    public java.lang.reflect.Field m35899q() {
        return this.f57308e;
    }

    /* renamed from: r */
    public int m35898r() {
        return this.f57309f;
    }

    /* renamed from: s */
    public FieldType m35897s() {
        return this.f57305b;
    }

    /* renamed from: t */
    public boolean m35896t() {
        return this.f57311h;
    }

    /* renamed from: v */
    public boolean m35894v() {
        return this.f57310g;
    }
}
