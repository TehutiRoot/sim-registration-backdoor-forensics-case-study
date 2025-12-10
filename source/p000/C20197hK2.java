package p000;

import com.google.android.gms.common.zzu;
import java.util.concurrent.Callable;

/* renamed from: hK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20197hK2 extends UK2 {

    /* renamed from: f */
    public final Callable f62476f;

    public /* synthetic */ C20197hK2(Callable callable, zzu zzuVar) {
        super();
        this.f62476f = callable;
    }

    @Override // p000.UK2
    /* renamed from: a */
    public final String mo30885a() {
        try {
            return (String) this.f62476f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
