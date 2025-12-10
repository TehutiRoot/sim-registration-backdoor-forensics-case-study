package p000;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zag;

/* renamed from: U92 */
/* loaded from: classes3.dex */
public final class U92 extends zag {

    /* renamed from: a */
    public final /* synthetic */ Intent f6556a;

    /* renamed from: b */
    public final /* synthetic */ LifecycleFragment f6557b;

    public U92(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.f6556a = intent;
        this.f6557b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f6556a;
        if (intent != null) {
            this.f6557b.startActivityForResult(intent, 2);
        }
    }
}