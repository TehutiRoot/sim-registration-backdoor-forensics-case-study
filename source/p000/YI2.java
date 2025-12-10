package p000;

import com.google.android.gms.internal.firebase_ml.zzqd;
import java.util.concurrent.Callable;

/* renamed from: YI2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class YI2 implements Callable {

    /* renamed from: a */
    public static final Callable f7739a = new YI2();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String version;
        version = zzqd.zzoo().getVersion("firebase-ml-common");
        return version;
    }
}
