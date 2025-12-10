package p000;

import android.content.Context;

/* renamed from: Ye0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18809Ye0 {

    /* renamed from: a */
    public String f7808a;

    /* renamed from: b */
    public static String m65329b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* renamed from: a */
    public synchronized String m65330a(Context context) {
        String str;
        try {
            if (this.f7808a == null) {
                this.f7808a = m65329b(context);
            }
            if ("".equals(this.f7808a)) {
                str = null;
            } else {
                str = this.f7808a;
            }
        } finally {
        }
        return str;
    }
}
