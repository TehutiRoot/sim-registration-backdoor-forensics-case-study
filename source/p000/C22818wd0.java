package p000;

import coil.size.Size;
import coil.util.HardwareBitmapService;

/* renamed from: wd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22818wd0 implements HardwareBitmapService {

    /* renamed from: a */
    public final boolean f108069a;

    public C22818wd0(boolean z) {
        this.f108069a = z;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareMainThread(Size size) {
        return this.f108069a;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareWorkerThread() {
        return this.f108069a;
    }
}
