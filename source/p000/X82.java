package p000;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zag;

/* renamed from: X82 */
/* loaded from: classes3.dex */
public final class X82 extends zag {

    /* renamed from: a */
    public final /* synthetic */ Intent f7397a;

    /* renamed from: b */
    public final /* synthetic */ LifecycleFragment f7398b;

    public X82(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.f7397a = intent;
        this.f7398b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f7397a;
        if (intent != null) {
            this.f7398b.startActivityForResult(intent, 2);
        }
    }
}
