package p000;

import android.app.Dialog;
import com.google.android.gms.common.api.internal.RunnableC6349h;
import com.google.android.gms.common.api.internal.zabw;

/* renamed from: n92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21196n92 extends zabw {

    /* renamed from: a */
    public final /* synthetic */ Dialog f72141a;

    /* renamed from: b */
    public final /* synthetic */ RunnableC6349h f72142b;

    public C21196n92(RunnableC6349h runnableC6349h, Dialog dialog) {
        this.f72142b = runnableC6349h;
        this.f72141a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        this.f72142b.f44835b.m48457b();
        if (this.f72141a.isShowing()) {
            this.f72141a.dismiss();
        }
    }
}
