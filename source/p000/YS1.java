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

/* renamed from: YS1 */
/* loaded from: classes3.dex */
public class YS1 {

    /* renamed from: f */
    public static final C11660kX f7763f = new C11660kX();

    /* renamed from: a */
    public final C11660kX f7764a;

    /* renamed from: b */
    public final XS1 f7765b;

    /* renamed from: c */
    public final ArrayPool f7766c;

    /* renamed from: d */
    public final ContentResolver f7767d;

    /* renamed from: e */
    public final List f7768e;

    public YS1(List list, XS1 xs1, ArrayPool arrayPool, ContentResolver contentResolver) {
        this(list, f7763f, xs1, arrayPool, contentResolver);
    }

    /* renamed from: a */
    public int m65353a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f7767d.openInputStream(uri);
                int orientation = ImageHeaderParserUtils.getOrientation(this.f7768e, inputStream, this.f7766c);
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
    public final java.lang.String m65352b(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            XS1 r1 = r4.f7765b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.mo50487a(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
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
        throw new UnsupportedOperationException("Method not decompiled: p000.YS1.m65352b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean m65351c(File file) {
        if (this.f7764a.m28925a(file) && 0 < this.f7764a.m28923c(file)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public InputStream m65350d(Uri uri) {
        String m65352b = m65352b(uri);
        if (TextUtils.isEmpty(m65352b)) {
            return null;
        }
        File m28924b = this.f7764a.m28924b(m65352b);
        if (!m65351c(m28924b)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(m28924b);
        try {
            return this.f7767d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    public YS1(List list, C11660kX c11660kX, XS1 xs1, ArrayPool arrayPool, ContentResolver contentResolver) {
        this.f7764a = c11660kX;
        this.f7765b = xs1;
        this.f7766c = arrayPool;
        this.f7767d = contentResolver;
        this.f7768e = list;
    }
}
