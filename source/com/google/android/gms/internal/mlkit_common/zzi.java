package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import androidx.core.content.ContextCompat;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzi {

    /* renamed from: a */
    public static final String[] f46410a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};

    /* renamed from: b */
    public static final String[] f46411b;

    /* renamed from: c */
    public static final String[] f46412c;
    public static final /* synthetic */ int zza = 0;

    static {
        String str;
        String str2;
        String str3 = Build.HARDWARE;
        String str4 = "";
        if (!str3.equals("goldfish") && !str3.equals("ranchu")) {
            str = "";
        } else {
            str = "androidx.test.services.storage.runfiles";
        }
        f46411b = new String[]{"media", str};
        int i = Build.VERSION.SDK_INT;
        if (i > 25) {
            str2 = "";
        } else {
            str2 = "com.google.android.inputmethod.latin.inputcontent";
        }
        if (i <= 25) {
            str4 = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        f46412c = new String[]{str2, str4, "com.google.android.apps.docs.storage.legacy"};
    }

    /* renamed from: a */
    public static Uri m47135a(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            return Uri.parse(uri.toString());
        }
        return uri;
    }

    /* renamed from: b */
    public static Object m47134b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    /* renamed from: c */
    public static String m47133c(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return canonicalPath.concat(RemoteSettings.FORWARD_SLASH_STRING);
        }
        return canonicalPath;
    }

    /* renamed from: d */
    public static void m47132d(ParcelFileDescriptor parcelFileDescriptor, String str) {
        try {
            StructStat fstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat lstat = Os.lstat(str);
                if (!OsConstants.S_ISLNK(lstat.st_mode)) {
                    if (fstat.st_dev == lstat.st_dev && fstat.st_ino == lstat.st_ino) {
                        return;
                    }
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: e */
    public static void m47131e(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* renamed from: f */
    public static void m47130f(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* renamed from: g */
    public static void m47129g(final Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, zzh zzhVar) {
        boolean z;
        File dataDir;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        m47132d(parcelFileDescriptor, canonicalPath);
        if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
            boolean unused = zzhVar.f46408b;
            File dataDir2 = ContextCompat.getDataDir(context);
            boolean z2 = true;
            if (dataDir2 == null ? !canonicalPath.startsWith(m47133c(Environment.getDataDirectory())) : !canonicalPath.startsWith(m47133c(dataDir2))) {
                Context createDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(context);
                if (createDeviceProtectedStorageContext == null || (dataDir = ContextCompat.getDataDir(createDeviceProtectedStorageContext)) == null || !canonicalPath.startsWith(m47133c(dataDir))) {
                    File[] m47127i = m47127i(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String[] strArr = zzi.f46410a;
                            return ContextCompat.getExternalFilesDirs(context, null);
                        }
                    });
                    int length = m47127i.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            File file = m47127i[i];
                            if (file != null && canonicalPath.startsWith(m47133c(file))) {
                                break;
                            }
                            i++;
                        } else {
                            File[] m47127i2 = m47127i(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzc
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    String[] strArr = zzi.f46410a;
                                    return ContextCompat.getExternalCacheDirs(context);
                                }
                            });
                            int length2 = m47127i2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    File file2 = m47127i2[i2];
                                    if (file2 != null && canonicalPath.startsWith(m47133c(file2))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            z = zzhVar.f46407a;
            if (z2 == z) {
                return;
            }
        }
        throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
    }

    /* renamed from: h */
    public static boolean m47128h(Context context, Uri uri, int i, zzh zzhVar) {
        boolean z;
        boolean z2;
        boolean z3;
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                z3 = zzhVar.f46407a;
                if (z3) {
                    return false;
                }
                return true;
            }
        }
        if (zzh.m47136c(zzhVar, context, new zzj(uri, resolveContentProvider, authority)) - 1 == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            z2 = zzhVar.f46407a;
            return z2;
        }
        z = zzhVar.f46407a;
        if (z) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && resolveContentProvider.exported) {
            String[] strArr = f46411b;
            int length = strArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                if (strArr[i2].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = f46412c;
            int length2 = strArr2.length;
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr2[i3].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = f46410a;
            for (int i4 = 0; i4 < 6; i4++) {
                String str = strArr3[i4];
                if (str.charAt(str.length() - 1) == '.') {
                    if (resolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (resolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: i */
    public static File[] m47127i(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            if (Build.VERSION.SDK_INT < 22) {
                return new File[0];
            }
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) throws FileNotFoundException {
        zzh zzhVar = zzh.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri m47135a = m47135a(uri);
        String scheme = m47135a.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(m47135a, PDPageLabelRange.STYLE_ROMAN_LOWER);
        }
        if ("content".equals(scheme)) {
            if (m47128h(context, m47135a, 1, zzhVar)) {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(m47135a, PDPageLabelRange.STYLE_ROMAN_LOWER);
                m47134b(openAssetFileDescriptor);
                return openAssetFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(m47135a, PDPageLabelRange.STYLE_ROMAN_LOWER);
            m47134b(openAssetFileDescriptor2);
            try {
                m47129g(context, openAssetFileDescriptor2.getParcelFileDescriptor(), m47135a, zzhVar);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e) {
                m47131e(openAssetFileDescriptor2, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                m47131e(openAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    public static InputStream zzb(Context context, Uri uri, zzh zzhVar) throws FileNotFoundException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri m47135a = m47135a(uri);
        String scheme = m47135a.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(m47135a);
        }
        if ("content".equals(scheme)) {
            if (m47128h(context, m47135a, 1, zzhVar)) {
                InputStream openInputStream = contentResolver.openInputStream(m47135a);
                m47134b(openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(m47135a.getPath()).getCanonicalFile()), PDPageLabelRange.STYLE_ROMAN_LOWER);
                try {
                    m47129g(context, openFileDescriptor, m47135a, zzhVar);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e) {
                    m47130f(openFileDescriptor, e);
                    throw e;
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e2);
                    m47130f(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }
}
