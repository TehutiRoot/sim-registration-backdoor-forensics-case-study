package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class FieldInfo implements Comparable {

    /* renamed from: a */
    public final java.lang.reflect.Field f57316a;

    /* renamed from: b */
    public final FieldType f57317b;

    /* renamed from: c */
    public final Class f57318c;

    /* renamed from: d */
    public final int f57319d;

    /* renamed from: e */
    public final java.lang.reflect.Field f57320e;

    /* renamed from: f */
    public final int f57321f;

    /* renamed from: g */
    public final boolean f57322g;

    /* renamed from: h */
    public final boolean f57323h;

    /* renamed from: i */
    public final java.lang.reflect.Field f57324i;

    /* renamed from: j */
    public final Class f57325j;

    /* renamed from: k */
    public final Object f57326k;

    /* renamed from: l */
    public final Internal.EnumVerifier f57327l;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public java.lang.reflect.Field f57328a;

        /* renamed from: b */
        public FieldType f57329b;

        /* renamed from: c */
        public int f57330c;

        /* renamed from: d */
        public java.lang.reflect.Field f57331d;

        /* renamed from: e */
        public int f57332e;

        /* renamed from: f */
        public boolean f57333f;

        /* renamed from: g */
        public boolean f57334g;

        /* renamed from: h */
        public Class f57335h;

        /* renamed from: i */
        public Object f57336i;

        /* renamed from: j */
        public Internal.EnumVerifier f57337j;

        /* renamed from: k */
        public java.lang.reflect.Field f57338k;

        public FieldInfo build() {
            Object obj = this.f57336i;
            if (obj != null) {
                return FieldInfo.m35903e(this.f57328a, this.f57330c, obj, this.f57337j);
            }
            java.lang.reflect.Field field = this.f57331d;
            if (field != null) {
                if (this.f57333f) {
                    return FieldInfo.m35899i(this.f57328a, this.f57330c, this.f57329b, field, this.f57332e, this.f57334g, this.f57337j);
                }
                return FieldInfo.m35900h(this.f57328a, this.f57330c, this.f57329b, field, this.f57332e, this.f57334g, this.f57337j);
            }
            Internal.EnumVerifier enumVerifier = this.f57337j;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.f57338k;
                if (field2 == null) {
                    return FieldInfo.m35904d(this.f57328a, this.f57330c, this.f57329b, enumVerifier);
                }
                return FieldInfo.m35901g(this.f57328a, this.f57330c, this.f57329b, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.f57338k;
            if (field3 == null) {
                return FieldInfo.m35905c(this.f57328a, this.f57330c, this.f57329b, this.f57334g);
            }
            return FieldInfo.m35902f(this.f57328a, this.f57330c, this.f57329b, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.f57338k = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z) {
            this.f57334g = z;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.f57337j = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            this.f57328a = field;
            return this;
        }

        public Builder withFieldNumber(int i) {
            this.f57330c = i;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.f57336i = obj;
            return this;
        }

        public Builder withOneof(AbstractC18213Og1 abstractC18213Og1, Class<?> cls) {
            if (this.f57328a == null && this.f57331d == null) {
                this.f57335h = cls;
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        public Builder withPresence(java.lang.reflect.Field field, int i) {
            this.f57331d = (java.lang.reflect.Field) Internal.m35777b(field, "presenceField");
            this.f57332e = i;
            return this;
        }

        public Builder withRequired(boolean z) {
            this.f57333f = z;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.f57329b = fieldType;
            return this;
        }
    }

    /* renamed from: com.google.protobuf.FieldInfo$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8866a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57339a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f57339a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57339a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57339a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57339a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FieldInfo(java.lang.reflect.Field field, int i, FieldType fieldType, Class cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, AbstractC18213Og1 abstractC18213Og1, Class cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f57316a = field;
        this.f57317b = fieldType;
        this.f57318c = cls;
        this.f57319d = i;
        this.f57320e = field2;
        this.f57321f = i2;
        this.f57322g = z;
        this.f57323h = z2;
        this.f57325j = cls2;
        this.f57326k = obj;
        this.f57327l = enumVerifier;
        this.f57324i = field3;
    }

    /* renamed from: a */
    public static void m35907a(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i);
    }

    /* renamed from: c */
    public static FieldInfo m35905c(java.lang.reflect.Field field, int i, FieldType fieldType, boolean z) {
        m35907a(i);
        Internal.m35777b(field, "field");
        Internal.m35777b(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: d */
    public static FieldInfo m35904d(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        m35907a(i);
        Internal.m35777b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    /* renamed from: e */
    public static FieldInfo m35903e(java.lang.reflect.Field field, int i, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.m35777b(obj, "mapDefaultEntry");
        m35907a(i);
        Internal.m35777b(field, "field");
        return new FieldInfo(field, i, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    /* renamed from: f */
    public static FieldInfo m35902f(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2) {
        m35907a(i);
        Internal.m35777b(field, "field");
        Internal.m35777b(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: g */
    public static FieldInfo m35901g(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        m35907a(i);
        Internal.m35777b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    /* renamed from: h */
    public static FieldInfo m35900h(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        m35907a(i);
        Internal.m35777b(field, "field");
        Internal.m35777b(fieldType, "fieldType");
        Internal.m35777b(field2, "presenceField");
        if (field2 != null && !m35887u(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new FieldInfo(field, i, fieldType, null, field2, i2, false, z, null, null, null, enumVerifier, null);
    }

    /* renamed from: i */
    public static FieldInfo m35899i(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        m35907a(i);
        Internal.m35777b(field, "field");
        Internal.m35777b(fieldType, "fieldType");
        Internal.m35777b(field2, "presenceField");
        if (field2 != null && !m35887u(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new FieldInfo(field, i, fieldType, null, field2, i2, true, z, null, null, null, enumVerifier, null);
    }

    /* renamed from: u */
    public static boolean m35887u(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(FieldInfo fieldInfo) {
        return this.f57319d - fieldInfo.f57319d;
    }

    /* renamed from: j */
    public java.lang.reflect.Field m35898j() {
        return this.f57324i;
    }

    /* renamed from: k */
    public Internal.EnumVerifier m35897k() {
        return this.f57327l;
    }

    /* renamed from: l */
    public java.lang.reflect.Field m35896l() {
        return this.f57316a;
    }

    /* renamed from: m */
    public int m35895m() {
        return this.f57319d;
    }

    /* renamed from: n */
    public Object m35894n() {
        return this.f57326k;
    }

    /* renamed from: o */
    public Class m35893o() {
        int i = C8866a.f57339a[this.f57317b.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return null;
            }
            return this.f57318c;
        }
        java.lang.reflect.Field field = this.f57316a;
        if (field != null) {
            return field.getType();
        }
        return this.f57325j;
    }

    /* renamed from: p */
    public AbstractC18213Og1 m35892p() {
        return null;
    }

    /* renamed from: q */
    public java.lang.reflect.Field m35891q() {
        return this.f57320e;
    }

    /* renamed from: r */
    public int m35890r() {
        return this.f57321f;
    }

    /* renamed from: s */
    public FieldType m35889s() {
        return this.f57317b;
    }

    /* renamed from: t */
    public boolean m35888t() {
        return this.f57323h;
    }

    /* renamed from: v */
    public boolean m35886v() {
        return this.f57322g;
    }
}