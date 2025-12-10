package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.XmlRes;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: c */
    public static final String[] f33738c = {"_display_name", "_size"};

    /* renamed from: d */
    public static final File f33739d = new File(RemoteSettings.FORWARD_SLASH_STRING);

    /* renamed from: e */
    public static final HashMap f33740e = new HashMap();

    /* renamed from: a */
    public InterfaceC3956b f33741a;

    /* renamed from: b */
    public int f33742b;

    /* renamed from: androidx.core.content.FileProvider$a */
    /* loaded from: classes2.dex */
    public static class C3955a {
        @DoNotInline
        /* renamed from: a */
        public static File[] m57531a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3956b {
        /* renamed from: a */
        Uri mo57530a(File file);

        /* renamed from: b */
        File mo57529b(Uri uri);
    }

    /* renamed from: androidx.core.content.FileProvider$c */
    /* loaded from: classes2.dex */
    public static class C3957c implements InterfaceC3956b {

        /* renamed from: a */
        public final String f33743a;

        /* renamed from: b */
        public final HashMap f33744b = new HashMap();

        public C3957c(String str) {
            this.f33743a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC3956b
        /* renamed from: a */
        public Uri mo57530a(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f33744b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        substring = canonicalPath.substring(path2.length());
                    } else {
                        substring = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f33743a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, RemoteSettings.FORWARD_SLASH_STRING)).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC3956b
        /* renamed from: b */
        public File mo57529b(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f33744b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }

        /* renamed from: c */
        public void m57528c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f33744b.put(str, file.getCanonicalFile());
                    return;
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                }
            }
            throw new IllegalArgumentException("Name must not be empty");
        }
    }

    public FileProvider() {
        this.f33742b = 0;
    }

    /* renamed from: a */
    public static File m57538a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: b */
    public static Object[] m57537b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: c */
    public static String[] m57536c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: d */
    public static XmlResourceParser m57535d(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
    }

    /* renamed from: e */
    public static InterfaceC3956b m57534e(Context context, String str, int i) {
        InterfaceC3956b interfaceC3956b;
        HashMap hashMap = f33740e;
        synchronized (hashMap) {
            try {
                interfaceC3956b = (InterfaceC3956b) hashMap.get(str);
                if (interfaceC3956b == null) {
                    try {
                        try {
                            interfaceC3956b = m57532g(context, str, i);
                            hashMap.put(str, interfaceC3956b);
                        } catch (XmlPullParserException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC3956b;
    }

    /* renamed from: f */
    public static int m57533f(String str) {
        if (PDPageLabelRange.STYLE_ROMAN_LOWER.equals(str)) {
            return 268435456;
        }
        if (!OperatorName.SET_LINE_WIDTH.equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if ("rw".equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            throw new IllegalArgumentException("Invalid mode: " + str);
        }
        return 738197504;
    }

    /* renamed from: g */
    public static InterfaceC3956b m57532g(Context context, String str, int i) {
        C3957c c3957c = new C3957c(str);
        XmlResourceParser m57535d = m57535d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = m57535d.next();
            if (next != 1) {
                if (next == 2) {
                    String name = m57535d.getName();
                    File file = null;
                    String attributeValue = m57535d.getAttributeValue(null, "name");
                    String attributeValue2 = m57535d.getAttributeValue(null, ClientCookie.PATH_ATTR);
                    if ("root-path".equals(name)) {
                        file = f33739d;
                    } else if ("files-path".equals(name)) {
                        file = context.getFilesDir();
                    } else if ("cache-path".equals(name)) {
                        file = context.getCacheDir();
                    } else if ("external-path".equals(name)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if ("external-files-path".equals(name)) {
                        File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, null);
                        if (externalFilesDirs.length > 0) {
                            file = externalFilesDirs[0];
                        }
                    } else if ("external-cache-path".equals(name)) {
                        File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(context);
                        if (externalCacheDirs.length > 0) {
                            file = externalCacheDirs[0];
                        }
                    } else if ("external-media-path".equals(name)) {
                        File[] m57531a = C3955a.m57531a(context);
                        if (m57531a.length > 0) {
                            file = m57531a[0];
                        }
                    }
                    if (file != null) {
                        c3957c.m57528c(attributeValue, m57538a(file, attributeValue2));
                    }
                }
            } else {
                return c3957c;
            }
        }
    }

    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file) {
        return m57534e(context, str, 0).mo57530a(file);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                HashMap hashMap = f33740e;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                this.f33741a = m57534e(context, str, this.f33742b);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return this.f33741a.mo57529b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        File mo57529b = this.f33741a.mo57529b(uri);
        int lastIndexOf = mo57529b.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo57529b.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f33741a.mo57529b(uri), m57533f(str));
    }

    @Override // android.content.ContentProvider
    @NonNull
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        int i;
        String str3;
        File mo57529b = this.f33741a.mo57529b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f33738c;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = mo57529b.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(mo57529b.length());
            }
            i2 = i;
        }
        String[] m57536c = m57536c(strArr3, i2);
        Object[] m57537b = m57537b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(m57536c, 1);
        matrixCursor.addRow(m57537b);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider(@XmlRes int i) {
        this.f33742b = i;
    }

    @NonNull
    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file, @NonNull String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter("displayName", str2).build();
    }
}
