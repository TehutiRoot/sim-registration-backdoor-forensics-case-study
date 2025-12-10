package androidx.camera.extensions.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class ExtensionVersion {

    /* renamed from: a */
    public static volatile ExtensionVersion f11512a;

    /* renamed from: androidx.camera.extensions.internal.ExtensionVersion$a */
    /* loaded from: classes.dex */
    public static class C2571a extends ExtensionVersion {
        @Override // androidx.camera.extensions.internal.ExtensionVersion
        /* renamed from: b */
        public Version mo62607b() {
            return null;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        /* renamed from: c */
        public boolean mo62606c() {
            return false;
        }
    }

    /* renamed from: androidx.camera.extensions.internal.ExtensionVersion$b */
    /* loaded from: classes.dex */
    public static class C2572b extends ExtensionVersion {

        /* renamed from: c */
        public static ExtensionVersionImpl f11513c;

        /* renamed from: b */
        public Version f11514b;

        public C2572b() {
            if (f11513c == null) {
                f11513c = new ExtensionVersionImpl();
            }
            Version parse = Version.parse(f11513c.checkApiVersion(ClientVersion.getCurrentVersion().toVersionString()));
            if (parse != null && ClientVersion.getCurrentVersion().getVersion().getMajor() == parse.getMajor()) {
                this.f11514b = parse;
            }
            Logger.m63230d("ExtenderVersion", "Selected vendor runtime: " + this.f11514b);
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        /* renamed from: b */
        public Version mo62607b() {
            return this.f11514b;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        /* renamed from: c */
        public boolean mo62606c() {
            try {
                return f11513c.isAdvancedExtenderImplemented();
            } catch (NoSuchMethodError unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static ExtensionVersion m62608a() {
        if (f11512a != null) {
            return f11512a;
        }
        synchronized (ExtensionVersion.class) {
            if (f11512a == null) {
                try {
                    f11512a = new C2572b();
                } catch (NoClassDefFoundError unused) {
                    Logger.m63230d("ExtenderVersion", "No versioning extender found. Falling back to default.");
                    f11512a = new C2571a();
                }
            }
        }
        return f11512a;
    }

    @Nullable
    public static Version getRuntimeVersion() {
        return m62608a().mo62607b();
    }

    @VisibleForTesting
    public static void injectInstance(@Nullable ExtensionVersion extensionVersion) {
        f11512a = extensionVersion;
    }

    public static boolean isAdvancedExtenderSupported() {
        return m62608a().mo62606c();
    }

    public static boolean isExtensionVersionSupported() {
        if (m62608a().mo62607b() != null) {
            return true;
        }
        return false;
    }

    public static boolean isMaximumCompatibleVersion(@NonNull Version version) {
        if (getRuntimeVersion().compareTo(version.getMajor(), version.mo25957c()) <= 0) {
            return true;
        }
        return false;
    }

    public static boolean isMinimumCompatibleVersion(@NonNull Version version) {
        if (getRuntimeVersion().compareTo(version.getMajor(), version.mo25957c()) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public abstract Version mo62607b();

    /* renamed from: c */
    public abstract boolean mo62606c();
}
