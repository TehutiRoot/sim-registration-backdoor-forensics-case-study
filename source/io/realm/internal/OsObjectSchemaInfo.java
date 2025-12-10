package io.realm.internal;

import io.realm.RealmFieldType;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class OsObjectSchemaInfo implements NativeObject {

    /* renamed from: b */
    public static final long f66707b = nativeGetFinalizerPtr();

    /* renamed from: a */
    public long f66708a;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddProperties(long j, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str, String str2, boolean z);

    private static native String nativeGetClassName(long j);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetPrimaryKeyProperty(long j);

    private static native long nativeGetProperty(long j, String str);

    private static native boolean nativeIsEmbedded(long j);

    public String getClassName() {
        return nativeGetClassName(this.f66708a);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66707b;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66708a;
    }

    @Nullable
    public Property getPrimaryKeyProperty() {
        if (nativeGetPrimaryKeyProperty(this.f66708a) == 0) {
            return null;
        }
        return new Property(nativeGetPrimaryKeyProperty(this.f66708a));
    }

    public Property getProperty(String str) {
        return new Property(nativeGetProperty(this.f66708a, str));
    }

    public boolean isEmbedded() {
        return nativeIsEmbedded(this.f66708a);
    }

    public OsObjectSchemaInfo(String str, String str2, boolean z) {
        this(nativeCreateRealmObjectSchema(str, str2, z));
    }

    public OsObjectSchemaInfo(long j) {
        this.f66708a = j;
        NativeContext.dummyContext.addReference(this);
    }

    /* loaded from: classes5.dex */
    public static class Builder {

        /* renamed from: a */
        public final String f66709a;

        /* renamed from: b */
        public final String f66710b;

        /* renamed from: c */
        public final long[] f66711c;

        /* renamed from: d */
        public final boolean f66712d;

        /* renamed from: e */
        public int f66713e;

        /* renamed from: f */
        public final long[] f66714f;

        /* renamed from: g */
        public int f66715g;

        public Builder(String str, boolean z, int i, int i2) {
            this.f66713e = 0;
            this.f66715g = 0;
            this.f66710b = "";
            this.f66709a = str;
            this.f66712d = z;
            this.f66711c = new long[i];
            this.f66714f = new long[i2];
        }

        public Builder addComputedLinkProperty(String str, String str2, String str3) {
            long nativeCreateComputedLinkProperty = Property.nativeCreateComputedLinkProperty(str, str2, str3);
            long[] jArr = this.f66714f;
            int i = this.f66715g;
            jArr[i] = nativeCreateComputedLinkProperty;
            this.f66715g = i + 1;
            return this;
        }

        public Builder addPersistedLinkProperty(String str, String str2, RealmFieldType realmFieldType, String str3) {
            long nativeCreatePersistedLinkProperty = Property.nativeCreatePersistedLinkProperty(str2, str, Property.m29528a(realmFieldType, false), str3);
            long[] jArr = this.f66711c;
            int i = this.f66713e;
            jArr[i] = nativeCreatePersistedLinkProperty;
            this.f66713e = i + 1;
            return this;
        }

        public Builder addPersistedMapProperty(String str, String str2, RealmFieldType realmFieldType, boolean z) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.m29528a(realmFieldType, z), false, false);
            long[] jArr = this.f66711c;
            int i = this.f66713e;
            jArr[i] = nativeCreatePersistedProperty;
            this.f66713e = i + 1;
            return this;
        }

        public Builder addPersistedProperty(String str, String str2, RealmFieldType realmFieldType, boolean z, boolean z2, boolean z3) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.m29528a(realmFieldType, z3), z, z2);
            long[] jArr = this.f66711c;
            int i = this.f66713e;
            jArr[i] = nativeCreatePersistedProperty;
            this.f66713e = i + 1;
            return this;
        }

        public Builder addPersistedSetProperty(String str, String str2, RealmFieldType realmFieldType, boolean z) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.m29528a(realmFieldType, z), false, false);
            long[] jArr = this.f66711c;
            int i = this.f66713e;
            jArr[i] = nativeCreatePersistedProperty;
            this.f66713e = i + 1;
            return this;
        }

        public Builder addPersistedValueListProperty(String str, String str2, RealmFieldType realmFieldType, boolean z) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.m29528a(realmFieldType, z), false, false);
            long[] jArr = this.f66711c;
            int i = this.f66713e;
            jArr[i] = nativeCreatePersistedProperty;
            this.f66713e = i + 1;
            return this;
        }

        public OsObjectSchemaInfo build() {
            if (this.f66713e != -1 && this.f66715g != -1) {
                OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.f66710b, this.f66709a, this.f66712d);
                OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.f66708a, this.f66711c, this.f66714f);
                this.f66713e = -1;
                this.f66715g = -1;
                return osObjectSchemaInfo;
            }
            throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
        }

        public Builder(String str, String str2, boolean z, int i, int i2) {
            this.f66713e = 0;
            this.f66715g = 0;
            this.f66710b = str;
            this.f66709a = str2;
            this.f66712d = z;
            this.f66711c = new long[i];
            this.f66714f = new long[i2];
        }
    }
}
