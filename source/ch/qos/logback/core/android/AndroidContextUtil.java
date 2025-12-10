package ch.qos.logback.core.android;

import android.annotation.TargetApi;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/* loaded from: classes.dex */
public class AndroidContextUtil {

    /* renamed from: a */
    public ContextWrapper f39734a;

    public AndroidContextUtil() {
        this(m51537b());
    }

    /* renamed from: b */
    public static ContextWrapper m51537b() {
        try {
            Class<?> cls = Class.forName("android.app.AppGlobals");
            return (ContextWrapper) cls.getDeclaredMethod("getInitialApplication", null).invoke(cls, null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String m51538a(File file) {
        return file != null ? file.getAbsolutePath() : "";
    }

    public String getCacheDirectoryPath() {
        ContextWrapper contextWrapper = this.f39734a;
        return contextWrapper != null ? m51538a(contextWrapper.getCacheDir()) : "";
    }

    public String getDatabaseDirectoryPath() {
        ContextWrapper contextWrapper = this.f39734a;
        return (contextWrapper == null || contextWrapper.getDatabasePath("x") == null) ? "" : this.f39734a.getDatabasePath("x").getParent();
    }

    public String getDatabasePath(String str) {
        ContextWrapper contextWrapper = this.f39734a;
        return contextWrapper != null ? m51538a(contextWrapper.getDatabasePath(str)) : "";
    }

    public String getExternalCacheDirectoryPath() {
        ContextWrapper contextWrapper = this.f39734a;
        return contextWrapper != null ? m51538a(contextWrapper.getExternalCacheDir()) : "";
    }

    public String getExternalFilesDirectoryPath() {
        ContextWrapper contextWrapper = this.f39734a;
        return contextWrapper != null ? m51538a(contextWrapper.getExternalFilesDir(null)) : "";
    }

    public String getExternalStorageDirectoryPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public String getFilesDirectoryPath() {
        ContextWrapper contextWrapper = this.f39734a;
        return contextWrapper != null ? m51538a(contextWrapper.getFilesDir()) : "";
    }

    public String getMountedExternalStorageDirectoryPath() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            return m51538a(Environment.getExternalStorageDirectory());
        }
        return null;
    }

    @TargetApi(21)
    public String getNoBackupFilesDirectoryPath() {
        ContextWrapper contextWrapper = this.f39734a;
        return contextWrapper != null ? m51538a(contextWrapper.getNoBackupFilesDir()) : "";
    }

    public String getPackageName() {
        ContextWrapper contextWrapper = this.f39734a;
        return contextWrapper != null ? contextWrapper.getPackageName() : "";
    }

    public String getVersionCode() {
        ContextWrapper contextWrapper = this.f39734a;
        if (contextWrapper != null) {
            try {
                PackageInfo packageInfo = contextWrapper.getPackageManager().getPackageInfo(getPackageName(), 0);
                return "" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getVersionName() {
        /*
            r4 = this;
            android.content.ContextWrapper r0 = r4.f39734a
            java.lang.String r1 = ""
            if (r0 == 0) goto L17
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            java.lang.String r2 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            java.lang.String r0 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
            goto L18
        L16:
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L1b
            r1 = r0
        L1b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.android.AndroidContextUtil.getVersionName():java.lang.String");
    }

    public void setupProperties(LoggerContext loggerContext) {
        Properties properties = new Properties();
        properties.setProperty(CoreConstants.DATA_DIR_KEY, getFilesDirectoryPath());
        String mountedExternalStorageDirectoryPath = getMountedExternalStorageDirectoryPath();
        if (mountedExternalStorageDirectoryPath != null) {
            properties.setProperty(CoreConstants.EXT_DIR_KEY, mountedExternalStorageDirectoryPath);
        }
        properties.setProperty(CoreConstants.PACKAGE_NAME_KEY, getPackageName());
        properties.setProperty(CoreConstants.VERSION_CODE_KEY, getVersionCode());
        properties.setProperty(CoreConstants.VERSION_NAME_KEY, getVersionName());
        loggerContext.putProperties(properties);
    }

    public AndroidContextUtil(ContextWrapper contextWrapper) {
        this.f39734a = contextWrapper;
    }
}
