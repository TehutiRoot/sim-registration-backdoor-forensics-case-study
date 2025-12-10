package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.AbstractC4798c;
import androidx.media.C4796b;

/* loaded from: classes2.dex */
public final class MediaSessionManager {

    /* renamed from: b */
    public static final boolean f36129b = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: c */
    public static final Object f36130c = new Object();

    /* renamed from: d */
    public static volatile MediaSessionManager f36131d;

    /* renamed from: a */
    public InterfaceC4784a f36132a;

    /* renamed from: androidx.media.MediaSessionManager$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4784a {
        /* renamed from: a */
        boolean mo53948a(InterfaceC4785b interfaceC4785b);
    }

    /* renamed from: androidx.media.MediaSessionManager$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4785b {
        /* renamed from: a */
        int mo53944a();

        /* renamed from: b */
        int mo53943b();

        String getPackageName();
    }

    public MediaSessionManager(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f36132a = new C4796b(context);
        } else {
            this.f36132a = new C4795a(context);
        }
    }

    @NonNull
    public static MediaSessionManager getSessionManager(@NonNull Context context) {
        MediaSessionManager mediaSessionManager = f36131d;
        if (mediaSessionManager == null) {
            synchronized (f36130c) {
                try {
                    mediaSessionManager = f36131d;
                    if (mediaSessionManager == null) {
                        f36131d = new MediaSessionManager(context.getApplicationContext());
                        mediaSessionManager = f36131d;
                    }
                } finally {
                }
            }
        }
        return mediaSessionManager;
    }

    public boolean isTrustedForMediaControl(@NonNull RemoteUserInfo remoteUserInfo) {
        if (remoteUserInfo != null) {
            return this.f36132a.mo53948a(remoteUserInfo.f36133a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* loaded from: classes2.dex */
    public static final class RemoteUserInfo {
        public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";

        /* renamed from: a */
        public InterfaceC4785b f36133a;

        public RemoteUserInfo(@NonNull String str, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f36133a = new C4796b.C4797a(str, i, i2);
            } else {
                this.f36133a = new AbstractC4798c.C4799a(str, i, i2);
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfo)) {
                return false;
            }
            return this.f36133a.equals(((RemoteUserInfo) obj).f36133a);
        }

        @NonNull
        public String getPackageName() {
            return this.f36133a.getPackageName();
        }

        public int getPid() {
            return this.f36133a.mo53943b();
        }

        public int getUid() {
            return this.f36133a.mo53944a();
        }

        public int hashCode() {
            return this.f36133a.hashCode();
        }

        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteUserInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f36133a = new C4796b.C4797a(remoteUserInfo);
        }
    }
}
