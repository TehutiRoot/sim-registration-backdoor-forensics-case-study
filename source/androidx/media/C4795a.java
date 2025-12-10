package androidx.media;

import android.content.Context;
import androidx.media.MediaSessionManager;

/* renamed from: androidx.media.a */
/* loaded from: classes2.dex */
public class C4795a extends AbstractC4798c {
    public C4795a(Context context) {
        super(context);
        this.f36148a = context;
    }

    @Override // androidx.media.AbstractC4798c, androidx.media.MediaSessionManager.InterfaceC4784a
    /* renamed from: a */
    public boolean mo53948a(MediaSessionManager.InterfaceC4785b interfaceC4785b) {
        if (!m53956e(interfaceC4785b) && !super.mo53948a(interfaceC4785b)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m53956e(MediaSessionManager.InterfaceC4785b interfaceC4785b) {
        if (m53947b().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", interfaceC4785b.mo53943b(), interfaceC4785b.mo53944a()) == 0) {
            return true;
        }
        return false;
    }
}
