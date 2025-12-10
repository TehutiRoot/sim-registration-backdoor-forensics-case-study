package androidx.media;

import android.content.Context;
import androidx.media.MediaSessionManager;

/* renamed from: androidx.media.a */
/* loaded from: classes2.dex */
public class C4777a extends AbstractC4780c {
    public C4777a(Context context) {
        super(context);
        this.f36236a = context;
    }

    @Override // androidx.media.AbstractC4780c, androidx.media.MediaSessionManager.InterfaceC4766a
    /* renamed from: a */
    public boolean mo53899a(MediaSessionManager.InterfaceC4767b interfaceC4767b) {
        if (!m53907e(interfaceC4767b) && !super.mo53899a(interfaceC4767b)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m53907e(MediaSessionManager.InterfaceC4767b interfaceC4767b) {
        if (m53898b().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", interfaceC4767b.mo53894b(), interfaceC4767b.mo53895a()) == 0) {
            return true;
        }
        return false;
    }
}