package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.util.List;

/* loaded from: classes2.dex */
public final class DocumentsContractCompat {

    /* loaded from: classes2.dex */
    public static final class DocumentCompat {
        public static final int FLAG_VIRTUAL_DOCUMENT = 512;
    }

    /* renamed from: androidx.core.provider.DocumentsContractCompat$a */
    /* loaded from: classes2.dex */
    public static class C4054a {
        @DoNotInline
        /* renamed from: a */
        public static Uri m57153a(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m57152b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @DoNotInline
        /* renamed from: c */
        public static String m57151c(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m57150d(Context context, @Nullable Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    /* renamed from: androidx.core.provider.DocumentsContractCompat$b */
    /* loaded from: classes2.dex */
    public static class C4055b {
        @DoNotInline
        /* renamed from: a */
        public static Uri m57149a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @DoNotInline
        /* renamed from: b */
        public static Uri m57148b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @DoNotInline
        /* renamed from: c */
        public static Uri m57147c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @DoNotInline
        /* renamed from: d */
        public static Uri m57146d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @DoNotInline
        /* renamed from: e */
        public static Uri m57145e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @DoNotInline
        /* renamed from: f */
        public static String m57144f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @DoNotInline
        /* renamed from: g */
        public static Uri m57143g(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* renamed from: androidx.core.provider.DocumentsContractCompat$c */
    /* loaded from: classes2.dex */
    public static class C4056c {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57142a(@NonNull Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m57141b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    @Nullable
    public static Uri buildChildDocumentsUri(@NonNull String str, @Nullable String str2) {
        return C4055b.m57149a(str, str2);
    }

    @Nullable
    public static Uri buildChildDocumentsUriUsingTree(@NonNull Uri uri, @NonNull String str) {
        return C4055b.m57148b(uri, str);
    }

    @Nullable
    public static Uri buildDocumentUri(@NonNull String str, @NonNull String str2) {
        return C4054a.m57153a(str, str2);
    }

    @Nullable
    public static Uri buildDocumentUriUsingTree(@NonNull Uri uri, @NonNull String str) {
        return C4055b.m57147c(uri, str);
    }

    @Nullable
    public static Uri buildTreeDocumentUri(@NonNull String str, @NonNull String str2) {
        return C4055b.m57146d(str, str2);
    }

    @Nullable
    public static Uri createDocument(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str, @NonNull String str2) throws FileNotFoundException {
        return C4055b.m57145e(contentResolver, uri, str, str2);
    }

    @Nullable
    public static String getDocumentId(@NonNull Uri uri) {
        return C4054a.m57151c(uri);
    }

    @Nullable
    public static String getTreeDocumentId(@NonNull Uri uri) {
        return C4055b.m57144f(uri);
    }

    public static boolean isDocumentUri(@NonNull Context context, @Nullable Uri uri) {
        return C4054a.m57150d(context, uri);
    }

    public static boolean isTreeUri(@NonNull Uri uri) {
        if (Build.VERSION.SDK_INT < 24) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() < 2 || !"tree".equals(pathSegments.get(0))) {
                return false;
            }
            return true;
        }
        return C4056c.m57142a(uri);
    }

    public static boolean removeDocument(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull Uri uri2) throws FileNotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4056c.m57141b(contentResolver, uri, uri2);
        }
        return C4054a.m57152b(contentResolver, uri);
    }

    @Nullable
    public static Uri renameDocument(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        return C4055b.m57143g(contentResolver, uri, str);
    }
}
