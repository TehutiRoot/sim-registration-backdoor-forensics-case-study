package coil.util;

import coil.size.Dimension;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class LimitedFileDescriptorHardwareBitmapService implements HardwareBitmapService {

    /* renamed from: b */
    public static final Companion f40868b = new Companion(null);

    /* renamed from: a */
    public final Logger f40869a;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lcoil/util/LimitedFileDescriptorHardwareBitmapService$Companion;", "", "()V", "MIN_SIZE_DIMENSION", "", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LimitedFileDescriptorHardwareBitmapService(Logger logger) {
        this.f40869a = logger;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareMainThread(Size size) {
        int i;
        Dimension width = size.getWidth();
        int i2 = Integer.MAX_VALUE;
        if (width instanceof Dimension.Pixels) {
            i = ((Dimension.Pixels) width).f40827px;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i > 100) {
            Dimension height = size.getHeight();
            if (height instanceof Dimension.Pixels) {
                i2 = ((Dimension.Pixels) height).f40827px;
            }
            if (i2 > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareWorkerThread() {
        return C10082dX.f61180a.m31861b(this.f40869a);
    }
}
