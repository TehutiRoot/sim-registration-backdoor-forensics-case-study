package p000;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.internal.zag;

/* renamed from: N92 */
/* loaded from: classes3.dex */
public final class N92 extends zag {

    /* renamed from: a */
    public final /* synthetic */ Intent f4076a;

    /* renamed from: b */
    public final /* synthetic */ Activity f4077b;

    /* renamed from: c */
    public final /* synthetic */ int f4078c;

    public N92(Intent intent, Activity activity, int i) {
        this.f4076a = intent;
        this.f4077b = activity;
        this.f4078c = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f4076a;
        if (intent != null) {
            this.f4077b.startActivityForResult(intent, this.f4078c);
        }
    }
}