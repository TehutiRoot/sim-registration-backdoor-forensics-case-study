package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: EB2 */
/* loaded from: classes3.dex */
public final class EB2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f1230a;

    public EB2(Context context) {
        this.f1230a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f1230a.getSharedPreferences("google_sdk_flags", 0);
    }
}
