package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: BC2 */
/* loaded from: classes3.dex */
public final class BC2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f341a;

    public BC2(Context context) {
        this.f341a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f341a.getSharedPreferences("google_sdk_flags", 0);
    }
}