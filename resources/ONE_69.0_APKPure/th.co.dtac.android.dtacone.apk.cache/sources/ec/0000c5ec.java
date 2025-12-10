package p000;

import android.content.Context;

/* renamed from: ef0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19779ef0 {

    /* renamed from: a */
    public String f61623a;

    /* renamed from: b */
    public static String m31658b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* renamed from: a */
    public synchronized String m31659a(Context context) {
        String str;
        try {
            if (this.f61623a == null) {
                this.f61623a = m31658b(context);
            }
            if ("".equals(this.f61623a)) {
                str = null;
            } else {
                str = this.f61623a;
            }
        } finally {
        }
        return str;
    }
}