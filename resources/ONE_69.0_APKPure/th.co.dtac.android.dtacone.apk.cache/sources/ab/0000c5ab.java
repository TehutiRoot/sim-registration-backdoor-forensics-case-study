package p000;

import com.google.android.gms.common.zzu;
import java.util.concurrent.Callable;

/* renamed from: eL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19734eL2 extends RL2 {

    /* renamed from: f */
    public final Callable f61553f;

    public /* synthetic */ C19734eL2(Callable callable, zzu zzuVar) {
        super();
        this.f61553f = callable;
    }

    @Override // p000.RL2
    /* renamed from: a */
    public final String mo31711a() {
        try {
            return (String) this.f61553f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}