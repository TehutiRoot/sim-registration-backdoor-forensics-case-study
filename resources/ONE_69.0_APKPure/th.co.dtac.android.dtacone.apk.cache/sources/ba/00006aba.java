package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.DoNotInline;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.AbstractC4046b;
import androidx.core.provider.FontsContractCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.provider.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4046b {

    /* renamed from: a */
    public static final Comparator f34097a = new Comparator() { // from class: e40
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4046b.m57080a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* renamed from: androidx.core.provider.b$a */
    /* loaded from: classes2.dex */
    public static class C4047a {
        @DoNotInline
        /* renamed from: a */
        public static Cursor m57072a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m57080a(byte[] bArr, byte[] bArr2) {
        return m57074g(bArr, bArr2);
    }

    /* renamed from: b */
    public static List m57079b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m57078c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static List m57077d(FontRequest fontRequest, Resources resources) {
        if (fontRequest.getCertificates() != null) {
            return fontRequest.getCertificates();
        }
        return FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    /* renamed from: e */
    public static FontsContractCompat.FontFamilyResult m57076e(Context context, FontRequest fontRequest, CancellationSignal cancellationSignal) {
        ProviderInfo m57075f = m57075f(context.getPackageManager(), fontRequest, context.getResources());
        if (m57075f == null) {
            return FontsContractCompat.FontFamilyResult.m57088a(1, null);
        }
        return FontsContractCompat.FontFamilyResult.m57088a(0, m57073h(context, fontRequest, m57075f.authority, cancellationSignal));
    }

    /* renamed from: f */
    public static ProviderInfo m57075f(PackageManager packageManager, FontRequest fontRequest, Resources resources) {
        String providerAuthority = fontRequest.getProviderAuthority();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
                List m57079b = m57079b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(m57079b, f34097a);
                List m57077d = m57077d(fontRequest, resources);
                for (int i = 0; i < m57077d.size(); i++) {
                    ArrayList arrayList = new ArrayList((Collection) m57077d.get(i));
                    Collections.sort(arrayList, f34097a);
                    if (m57078c(m57079b, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + fontRequest.getProviderPackage());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
    }

    /* renamed from: g */
    public static /* synthetic */ int m57074g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static FontsContractCompat.FontInfo[] m57073h(Context context, FontRequest fontRequest, String str, CancellationSignal cancellationSignal) {
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = C4047a.m57072a(context.getContentResolver(), build, new String[]{"_id", FontsContractCompat.Columns.FILE_ID, FontsContractCompat.Columns.TTC_INDEX, FontsContractCompat.Columns.VARIATION_SETTINGS, FontsContractCompat.Columns.WEIGHT, FontsContractCompat.Columns.ITALIC, FontsContractCompat.Columns.RESULT_CODE}, "query = ?", new String[]{fontRequest.getQuery()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(FontsContractCompat.Columns.RESULT_CODE);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex(FontsContractCompat.Columns.FILE_ID);
                int columnIndex4 = cursor.getColumnIndex(FontsContractCompat.Columns.TTC_INDEX);
                int columnIndex5 = cursor.getColumnIndex(FontsContractCompat.Columns.WEIGHT);
                int columnIndex6 = cursor.getColumnIndex(FontsContractCompat.Columns.ITALIC);
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = 0;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor.getInt(columnIndex4);
                    } else {
                        i2 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i3 = cursor.getInt(columnIndex5);
                    } else {
                        i3 = 400;
                    }
                    if (columnIndex6 != -1) {
                        z = true;
                        if (cursor.getInt(columnIndex6) == 1) {
                            arrayList2.add(FontsContractCompat.FontInfo.m57087a(withAppendedId, i2, i3, z, i));
                        }
                    }
                    z = false;
                    arrayList2.add(FontsContractCompat.FontInfo.m57087a(withAppendedId, i2, i3, z, i));
                }
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            return (FontsContractCompat.FontInfo[]) arrayList.toArray(new FontsContractCompat.FontInfo[0]);
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }
}