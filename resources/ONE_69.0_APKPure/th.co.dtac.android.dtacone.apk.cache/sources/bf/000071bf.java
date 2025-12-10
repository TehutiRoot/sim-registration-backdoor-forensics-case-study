package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

/* renamed from: androidx.media.b */
/* loaded from: classes2.dex */
public class C4778b extends C4777a {

    /* renamed from: d */
    public android.media.session.MediaSessionManager f36233d;

    public C4778b(Context context) {
        super(context);
        this.f36233d = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.C4777a, androidx.media.AbstractC4780c, androidx.media.MediaSessionManager.InterfaceC4766a
    /* renamed from: a */
    public boolean mo53899a(MediaSessionManager.InterfaceC4767b interfaceC4767b) {
        boolean isTrustedForMediaControl;
        if (interfaceC4767b instanceof C4779a) {
            isTrustedForMediaControl = this.f36233d.isTrustedForMediaControl(((C4779a) interfaceC4767b).f36234a);
            return isTrustedForMediaControl;
        }
        return false;
    }

    /* renamed from: androidx.media.b$a */
    /* loaded from: classes2.dex */
    public static final class C4779a implements MediaSessionManager.InterfaceC4767b {

        /* renamed from: a */
        public final MediaSessionManager.RemoteUserInfo f36234a;

        public C4779a(String str, int i, int i2) {
            this.f36234a = AbstractC18890Yr0.m65348a(str, i, i2);
        }

        @Override // androidx.media.MediaSessionManager.InterfaceC4767b
        /* renamed from: a */
        public int mo53895a() {
            int uid;
            uid = this.f36234a.getUid();
            return uid;
        }

        @Override // androidx.media.MediaSessionManager.InterfaceC4767b
        /* renamed from: b */
        public int mo53894b() {
            int pid;
            pid = this.f36234a.getPid();
            return pid;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4779a) {
                equals = this.f36234a.equals(((C4779a) obj).f36234a);
                return equals;
            }
            return false;
        }

        @Override // androidx.media.MediaSessionManager.InterfaceC4767b
        public String getPackageName() {
            String packageName;
            packageName = this.f36234a.getPackageName();
            return packageName;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.f36234a);
        }

        public C4779a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f36234a = remoteUserInfo;
        }
    }
}