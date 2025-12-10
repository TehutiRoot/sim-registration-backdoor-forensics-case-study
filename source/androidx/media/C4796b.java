package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

/* renamed from: androidx.media.b */
/* loaded from: classes2.dex */
public class C4796b extends C4795a {

    /* renamed from: d */
    public android.media.session.MediaSessionManager f36145d;

    public C4796b(Context context) {
        super(context);
        this.f36145d = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.C4795a, androidx.media.AbstractC4798c, androidx.media.MediaSessionManager.InterfaceC4784a
    /* renamed from: a */
    public boolean mo53948a(MediaSessionManager.InterfaceC4785b interfaceC4785b) {
        boolean isTrustedForMediaControl;
        if (interfaceC4785b instanceof C4797a) {
            isTrustedForMediaControl = this.f36145d.isTrustedForMediaControl(((C4797a) interfaceC4785b).f36146a);
            return isTrustedForMediaControl;
        }
        return false;
    }

    /* renamed from: androidx.media.b$a */
    /* loaded from: classes2.dex */
    public static final class C4797a implements MediaSessionManager.InterfaceC4785b {

        /* renamed from: a */
        public final MediaSessionManager.RemoteUserInfo f36146a;

        public C4797a(String str, int i, int i2) {
            this.f36146a = AbstractC18459Sr0.m66281a(str, i, i2);
        }

        @Override // androidx.media.MediaSessionManager.InterfaceC4785b
        /* renamed from: a */
        public int mo53944a() {
            int uid;
            uid = this.f36146a.getUid();
            return uid;
        }

        @Override // androidx.media.MediaSessionManager.InterfaceC4785b
        /* renamed from: b */
        public int mo53943b() {
            int pid;
            pid = this.f36146a.getPid();
            return pid;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4797a) {
                equals = this.f36146a.equals(((C4797a) obj).f36146a);
                return equals;
            }
            return false;
        }

        @Override // androidx.media.MediaSessionManager.InterfaceC4785b
        public String getPackageName() {
            String packageName;
            packageName = this.f36146a.getPackageName();
            return packageName;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.f36146a);
        }

        public C4797a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f36146a = remoteUserInfo;
        }
    }
}
