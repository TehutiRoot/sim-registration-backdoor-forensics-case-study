package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.RealmConfiguration;
import io.realm.internal.OsSharedRealm;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class OsRealmConfig implements NativeObject {
    public static final byte CLIENT_RESYNC_MODE_DISCARD_LOCAL = 1;
    public static final byte CLIENT_RESYNC_MODE_MANUAL = 0;
    public static final byte CLIENT_RESYNC_MODE_RECOVER = 2;
    public static final byte CLIENT_RESYNC_MODE_RECOVER_OR_DISCARD = 3;

    /* renamed from: j */
    public static final long f66716j = nativeGetFinalizerPtr();

    /* renamed from: a */
    public final Object f66717a;

    /* renamed from: b */
    public final Object f66718b;

    /* renamed from: c */
    public final RealmConfiguration f66719c;

    /* renamed from: d */
    public final URI f66720d;

    /* renamed from: e */
    public final long f66721e;

    /* renamed from: f */
    public final NativeContext f66722f;

    /* renamed from: g */
    public final CompactOnLaunchCallback f66723g;

    /* renamed from: h */
    public final OsSharedRealm.MigrationCallback f66724h;

    /* renamed from: i */
    public final OsSharedRealm.InitializationCallback f66725i;

    /* loaded from: classes5.dex */
    public static class Builder {

        /* renamed from: a */
        public RealmConfiguration f66726a;

        /* renamed from: b */
        public OsSchemaInfo f66727b = null;

        /* renamed from: c */
        public OsSharedRealm.MigrationCallback f66728c = null;

        /* renamed from: d */
        public OsSharedRealm.InitializationCallback f66729d = null;

        /* renamed from: e */
        public boolean f66730e = false;

        /* renamed from: f */
        public String f66731f = "";

        public Builder(RealmConfiguration realmConfiguration) {
            this.f66726a = realmConfiguration;
        }

        public Builder autoUpdateNotification(boolean z) {
            this.f66730e = z;
            return this;
        }

        public OsRealmConfig build() {
            return new OsRealmConfig(this.f66726a, this.f66731f, this.f66730e, this.f66727b, this.f66728c, this.f66729d, null);
        }

        public Builder fifoFallbackDir(File file) {
            this.f66731f = file.getAbsolutePath();
            return this;
        }

        public Builder initializationCallback(@Nullable OsSharedRealm.InitializationCallback initializationCallback) {
            this.f66729d = initializationCallback;
            return this;
        }

        public Builder migrationCallback(@Nullable OsSharedRealm.MigrationCallback migrationCallback) {
            this.f66728c = migrationCallback;
            return this;
        }

        public Builder schemaInfo(@Nullable OsSchemaInfo osSchemaInfo) {
            this.f66727b = osSchemaInfo;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum Durability {
        FULL(0),
        MEM_ONLY(1);
        
        final int value;

        Durability(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes5.dex */
    public enum SchemaMode {
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_SOFT_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE_DISCOVERED((byte) 5),
        SCHEMA_MODE_MANUAL((byte) 7);
        
        final byte value;

        SchemaMode(byte b) {
            this.value = b;
        }

        public byte getNativeValue() {
            return this.value;
        }
    }

    /* loaded from: classes5.dex */
    public enum SyncSessionStopPolicy {
        IMMEDIATELY((byte) 0),
        LIVE_INDEFINITELY((byte) 1),
        AFTER_CHANGES_UPLOADED((byte) 2);
        
        final byte value;

        SyncSessionStopPolicy(byte b) {
            this.value = b;
        }

        public byte getNativeValue() {
            return this.value;
        }
    }

    /* renamed from: io.realm.internal.OsRealmConfig$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11303a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66732a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f66732a = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public /* synthetic */ OsRealmConfig(RealmConfiguration realmConfiguration, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, C11303a c11303a) {
        this(realmConfiguration, str, z, osSchemaInfo, migrationCallback, initializationCallback);
    }

    private static native long nativeCreate(String str, String str2, boolean z, long j);

    private native String nativeCreateAndSetSyncConfig(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, byte b, String str7, String str8, String[] strArr, byte b2, Object obj, Object obj2, String str9, Object obj3);

    private static native void nativeEnableChangeNotification(long j, boolean z);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j, byte[] bArr);

    private static native void nativeSetInMemory(long j, boolean z);

    private native void nativeSetInitializationCallback(long j, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j, byte b, long j2, long j3, @Nullable OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j, byte b, String str, int i);

    private static native void nativeSetSyncConfigSslSettings(long j, boolean z, String str);

    /* renamed from: a */
    public NativeContext m29545a() {
        return this.f66722f;
    }

    /* renamed from: b */
    public final String m29544b(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress.getHostName() != null) {
            return inetSocketAddress.getHostName();
        }
        if (inetSocketAddress.getAddress() != null) {
            InetAddress address = inetSocketAddress.getAddress();
            if (address.getHostName() != null) {
                return address.getHostName();
            }
            return address.getHostAddress();
        }
        return null;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66716j;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66721e;
    }

    public RealmConfiguration getRealmConfiguration() {
        return this.f66719c;
    }

    public URI getResolvedRealmURI() {
        return this.f66720d;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OsRealmConfig(io.realm.RealmConfiguration r38, java.lang.String r39, boolean r40, io.realm.internal.OsSchemaInfo r41, io.realm.internal.OsSharedRealm.MigrationCallback r42, io.realm.internal.OsSharedRealm.InitializationCallback r43) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.OsRealmConfig.<init>(io.realm.RealmConfiguration, java.lang.String, boolean, io.realm.internal.OsSchemaInfo, io.realm.internal.OsSharedRealm$MigrationCallback, io.realm.internal.OsSharedRealm$InitializationCallback):void");
    }
}
