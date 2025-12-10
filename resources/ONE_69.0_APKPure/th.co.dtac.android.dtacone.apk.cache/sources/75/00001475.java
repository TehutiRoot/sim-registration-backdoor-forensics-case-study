package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: VT1 */
/* loaded from: classes3.dex */
public class VT1 {

    /* renamed from: f */
    public static final C12447oX f6915f = new C12447oX();

    /* renamed from: a */
    public final C12447oX f6916a;

    /* renamed from: b */
    public final UT1 f6917b;

    /* renamed from: c */
    public final ArrayPool f6918c;

    /* renamed from: d */
    public final ContentResolver f6919d;

    /* renamed from: e */
    public final List f6920e;

    public VT1(List list, UT1 ut1, ArrayPool arrayPool, ContentResolver contentResolver) {
        this(list, f6915f, ut1, arrayPool, contentResolver);
    }

    /* renamed from: a */
    public int m65982a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f6919d.openInputStream(uri);
                int orientation = ImageHeaderParserUtils.getOrientation(this.f6920e, inputStream, this.f6918c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return orientation;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to open uri: ");
                    sb.append(uri);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return -1;
                    } catch (IOException unused3) {
                        return -1;
                    }
                }
                return -1;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m65981b(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            UT1 r1 = r4.f6917b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.mo50484a(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            if (r1 == 0) goto L1b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1b
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            r1.close()
            return r5
        L18:
            r5 = move-exception
            r0 = r1
            goto L40
        L1b:
            if (r1 == 0) goto L20
            r1.close()
        L20:
            return r0
        L21:
            r5 = move-exception
            goto L40
        L23:
            r1 = r0
        L24:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r2.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L18
            r2.append(r5)     // Catch: java.lang.Throwable -> L18
        L3a:
            if (r1 == 0) goto L3f
            r1.close()
        L3f:
            return r0
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.VT1.m65981b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean m65980c(File file) {
        if (this.f6916a.m26114a(file) && 0 < this.f6916a.m26112c(file)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public InputStream m65979d(Uri uri) {
        String m65981b = m65981b(uri);
        if (TextUtils.isEmpty(m65981b)) {
            return null;
        }
        File m26113b = this.f6916a.m26113b(m65981b);
        if (!m65980c(m26113b)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(m26113b);
        try {
            return this.f6919d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    public VT1(List list, C12447oX c12447oX, UT1 ut1, ArrayPool arrayPool, ContentResolver contentResolver) {
        this.f6916a = c12447oX;
        this.f6917b = ut1;
        this.f6918c = arrayPool;
        this.f6919d = contentResolver;
        this.f6920e = list;
    }
}