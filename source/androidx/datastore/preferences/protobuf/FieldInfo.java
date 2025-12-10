package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* loaded from: classes2.dex */
public final class FieldInfo implements Comparable {

    /* renamed from: a */
    public final java.lang.reflect.Field f34764a;

    /* renamed from: b */
    public final FieldType f34765b;

    /* renamed from: c */
    public final Class f34766c;

    /* renamed from: d */
    public final int f34767d;

    /* renamed from: e */
    public final java.lang.reflect.Field f34768e;

    /* renamed from: f */
    public final int f34769f;

    /* renamed from: g */
    public final boolean f34770g;

    /* renamed from: h */
    public final boolean f34771h;

    /* renamed from: i */
    public final java.lang.reflect.Field f34772i;

    /* renamed from: j */
    public final Class f34773j;

    /* renamed from: k */
    public final Object f34774k;

    /* renamed from: l */
    public final Internal.EnumVerifier f34775l;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public java.lang.reflect.Field f34776a;

        /* renamed from: b */
        public FieldType f34777b;

        /* renamed from: c */
        public int f34778c;

        /* renamed from: d */
        public java.lang.reflect.Field f34779d;

        /* renamed from: e */
        public int f34780e;

        /* renamed from: f */
        public boolean f34781f;

        /* renamed from: g */
        public boolean f34782g;

        /* renamed from: h */
        public Class f34783h;

        /* renamed from: i */
        public Object f34784i;

        /* renamed from: j */
        public Internal.EnumVerifier f34785j;

        /* renamed from: k */
        public java.lang.reflect.Field f34786k;

        public FieldInfo build() {
            Object obj = this.f34784i;
            if (obj != null) {
                return FieldInfo.m55841e(this.f34776a, this.f34778c, obj, this.f34785j);
            }
            java.lang.reflect.Field field = this.f34779d;
            if (field != null) {
                if (this.f34781f) {
                    return FieldInfo.m55837i(this.f34776a, this.f34778c, this.f34777b, field, this.f34780e, this.f34782g, this.f34785j);
                }
                return FieldInfo.m55838h(this.f34776a, this.f34778c, this.f34777b, field, this.f34780e, this.f34782g, this.f34785j);
            }
            Internal.EnumVerifier enumVerifier = this.f34785j;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.f34786k;
                if (field2 == null) {
                    return FieldInfo.m55842d(this.f34776a, this.f34778c, this.f34777b, enumVerifier);
                }
                return FieldInfo.m55839g(this.f34776a, this.f34778c, this.f34777b, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.f34786k;
            if (field3 == null) {
                return FieldInfo.m55843c(this.f34776a, this.f34778c, this.f34777b, this.f34782g);
            }
            return FieldInfo.m55840f(this.f34776a, this.f34778c, this.f34777b, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.f34786k = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z) {
            this.f34782g = z;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.f34785j = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            this.f34776a = field;
            return this;
        }

        public Builder withFieldNumber(int i) {
            this.f34778c = i;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.f34784i = obj;
            return this;
        }

        public Builder withOneof(AbstractC18429Sf1 abstractC18429Sf1, Class<?> cls) {
            if (this.f34776a == null && this.f34779d == null) {
                this.f34783h = cls;
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        public Builder withPresence(java.lang.reflect.Field field, int i) {
            this.f34779d = (java.lang.reflect.Field) Internal.m55729b(field, "presenceField");
            this.f34780e = i;
            return this;
        }

        public Builder withRequired(boolean z) {
            this.f34781f = z;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.f34777b = fieldType;
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.FieldInfo$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4366a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34787a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f34787a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34787a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34787a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34787a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FieldInfo(java.lang.reflect.Field field, int i, FieldType fieldType, Class cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, AbstractC18429Sf1 abstractC18429Sf1, Class cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f34764a = field;
        this.f34765b = fieldType;
        this.f34766c = cls;
        this.f34767d = i;
        this.f34768e = field2;
        this.f34769f = i2;
        this.f34770g = z;
        this.f34771h = z2;
        this.f34773j = cls2;
        this.f34774k = obj;
        this.f34775l = enumVerifier;
        this.f34772i = field3;
    }

    /* renamed from: a */
    public static void m55845a(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i);
    }

    /* renamed from: c */
    public static FieldInfo m55843c(java.lang.reflect.Field field, int i, FieldType fieldType, boolean z) {
        m55845a(i);
        Internal.m55729b(field, "field");
        Internal.m55729b(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: d */
    public static FieldInfo m55842d(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        m55845a(i);
        Internal.m55729b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    /* renamed from: e */
    public static FieldInfo m55841e(java.lang.reflect.Field field, int i, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.m55729b(obj, "mapDefaultEntry");
        m55845a(i);
        Internal.m55729b(field, "field");
        return new FieldInfo(field, i, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    /* renamed from: f */
    public static FieldInfo m55840f(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2) {
        m55845a(i);
        Internal.m55729b(field, "field");
        Internal.m55729b(fieldType, "fieldType");
        if (fieldType != FieldType.MESSAGE_LIST && fieldType != FieldType.GROUP_LIST) {
            return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    /* renamed from: g */
    public static FieldInfo m55839g(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        m55845a(i);
        Internal.m55729b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    /* renamed from: h */
    public static FieldInfo m55838h(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        m55845a(i);
        Internal.m55729b(field, "field");
        Internal.m55729b(fieldType, "fieldType");
        Internal.m55729b(field2, "presenceField");
        if (field2 != null && !m55825u(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new FieldInfo(field, i, fieldType, null, field2, i2, false, z, null, null, null, enumVerifier, null);
    }

    /* renamed from: i */
    public static FieldInfo m55837i(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        m55845a(i);
        Internal.m55729b(field, "field");
        Internal.m55729b(fieldType, "fieldType");
        Internal.m55729b(field2, "presenceField");
        if (field2 != null && !m55825u(i2)) {
            throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
        }
        return new FieldInfo(field, i, fieldType, null, field2, i2, true, z, null, null, null, enumVerifier, null);
    }

    /* renamed from: u */
    public static boolean m55825u(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(FieldInfo fieldInfo) {
        return this.f34767d - fieldInfo.f34767d;
    }

    /* renamed from: j */
    public java.lang.reflect.Field m55836j() {
        return this.f34772i;
    }

    /* renamed from: k */
    public Internal.EnumVerifier m55835k() {
        return this.f34775l;
    }

    /* renamed from: l */
    public java.lang.reflect.Field m55834l() {
        return this.f34764a;
    }

    /* renamed from: m */
    public int m55833m() {
        return this.f34767d;
    }

    /* renamed from: n */
    public Object m55832n() {
        return this.f34774k;
    }

    /* renamed from: o */
    public Class m55831o() {
        int i = C4366a.f34787a[this.f34765b.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return null;
            }
            return this.f34766c;
        }
        java.lang.reflect.Field field = this.f34764a;
        if (field != null) {
            return field.getType();
        }
        return this.f34773j;
    }

    /* renamed from: p */
    public AbstractC18429Sf1 m55830p() {
        return null;
    }

    /* renamed from: q */
    public java.lang.reflect.Field m55829q() {
        return this.f34768e;
    }

    /* renamed from: r */
    public int m55828r() {
        return this.f34769f;
    }

    /* renamed from: s */
    public FieldType m55827s() {
        return this.f34765b;
    }

    /* renamed from: t */
    public boolean m55826t() {
        return this.f34771h;
    }

    /* renamed from: v */
    public boolean m55824v() {
        return this.f34770g;
    }
}
