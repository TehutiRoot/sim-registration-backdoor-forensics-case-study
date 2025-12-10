package p000;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* renamed from: U72 */
/* loaded from: classes.dex */
public final /* synthetic */ class U72 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SafeCloseImageReaderProxy f6547a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f6547a.safeClose();
    }
}