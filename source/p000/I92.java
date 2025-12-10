package p000;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;

/* renamed from: I92 */
/* loaded from: classes4.dex */
public final class I92 implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ OnTokenCanceledListener f2425a;

    public I92(C17720Hd2 c17720Hd2, OnTokenCanceledListener onTokenCanceledListener) {
        this.f2425a = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Void r1 = (Void) obj;
        this.f2425a.onCanceled();
    }
}
