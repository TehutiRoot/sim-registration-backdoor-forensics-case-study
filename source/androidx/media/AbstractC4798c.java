package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

/* renamed from: androidx.media.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4798c implements MediaSessionManager.InterfaceC4784a {

    /* renamed from: c */
    public static final boolean f36147c = MediaSessionManager.f36129b;

    /* renamed from: a */
    public Context f36148a;

    /* renamed from: b */
    public ContentResolver f36149b;

    /* renamed from: androidx.media.c$a */
    /* loaded from: classes2.dex */
    public static class C4799a implements MediaSessionManager.InterfaceC4785b {

        /* renamed from: a */
        public String f36150a;

        /* renamed from: b */
        public int f36151b;

        /* renamed from: c */
        public int f36152c;

        public C4799a(String str, int i, int i2) {
            this.f36150a = str;
            this.f36151b = i;
            this.f36152c = i2;
        }

        @Override // androidx.media.MediaSessionManager.InterfaceC4785b
        /* renamed from: a */
        public int mo53944a() {
            return this.f36152c;
        }

        @Override // androidx.media.MediaSessionManager.InterfaceC4785b
        /* renamed from: b */
        public int mo53943b() {
            return this.f36151b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4799a)) {
                return false;
            }
            C4799a c4799a = (C4799a) obj;
            if (TextUtils.equals(this.f36150a, c4799a.f36150a) && this.f36151b == c4799a.f36151b && this.f36152c == c4799a.f36152c) {
                return true;
            }
            return false;
        }

        @Override // androidx.media.MediaSessionManager.InterfaceC4785b
        public String getPackageName() {
            return this.f36150a;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.f36150a, Integer.valueOf(this.f36151b), Integer.valueOf(this.f36152c));
        }
    }

    public AbstractC4798c(Context context) {
        this.f36148a = context;
        this.f36149b = context.getContentResolver();
    }

    @Override // androidx.media.MediaSessionManager.InterfaceC4784a
    /* renamed from: a */
    public boolean mo53948a(MediaSessionManager.InterfaceC4785b interfaceC4785b) {
        try {
            if (this.f36148a.getPackageManager().getApplicationInfo(interfaceC4785b.getPackageName(), 0).uid != interfaceC4785b.mo53944a()) {
                if (f36147c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Package name ");
                    sb.append(interfaceC4785b.getPackageName());
                    sb.append(" doesn't match with the uid ");
                    sb.append(interfaceC4785b.mo53944a());
                }
                return false;
            } else if (!m53945d(interfaceC4785b, "android.permission.STATUS_BAR_SERVICE") && !m53945d(interfaceC4785b, "android.permission.MEDIA_CONTENT_CONTROL") && interfaceC4785b.mo53944a() != 1000 && !m53946c(interfaceC4785b)) {
                return false;
            } else {
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (f36147c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Package ");
                sb2.append(interfaceC4785b.getPackageName());
                sb2.append(" doesn't exist");
            }
            return false;
        }
    }

    /* renamed from: b */
    public Context m53947b() {
        return this.f36148a;
    }

    /* renamed from: c */
    public boolean m53946c(MediaSessionManager.InterfaceC4785b interfaceC4785b) {
        String string = Settings.Secure.getString(this.f36149b, "enabled_notification_listeners");
        if (string != null) {
            for (String str : string.split(":")) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(interfaceC4785b.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m53945d(MediaSessionManager.InterfaceC4785b interfaceC4785b, String str) {
        if (interfaceC4785b.mo53943b() < 0) {
            if (this.f36148a.getPackageManager().checkPermission(str, interfaceC4785b.getPackageName()) != 0) {
                return false;
            }
            return true;
        } else if (this.f36148a.checkPermission(str, interfaceC4785b.mo53943b(), interfaceC4785b.mo53944a()) != 0) {
            return false;
        } else {
            return true;
        }
    }
}
