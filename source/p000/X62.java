package p000;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* renamed from: X62 */
/* loaded from: classes.dex */
public final /* synthetic */ class X62 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SafeCloseImageReaderProxy f7387a;

    @Override // java.lang.Runnable
    public final void run() {
        this.f7387a.safeClose();
    }
}
