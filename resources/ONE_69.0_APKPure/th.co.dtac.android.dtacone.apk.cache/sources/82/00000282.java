package p000;

import coil.size.Size;
import coil.util.HardwareBitmapService;

/* renamed from: Cd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17423Cd0 implements HardwareBitmapService {

    /* renamed from: a */
    public final boolean f787a;

    public C17423Cd0(boolean z) {
        this.f787a = z;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareMainThread(Size size) {
        return this.f787a;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareWorkerThread() {
        return this.f787a;
    }
}