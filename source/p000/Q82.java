package p000;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.internal.zag;

/* renamed from: Q82 */
/* loaded from: classes3.dex */
public final class Q82 extends zag {

    /* renamed from: a */
    public final /* synthetic */ Intent f4969a;

    /* renamed from: b */
    public final /* synthetic */ Activity f4970b;

    /* renamed from: c */
    public final /* synthetic */ int f4971c;

    public Q82(Intent intent, Activity activity, int i) {
        this.f4969a = intent;
        this.f4970b = activity;
        this.f4971c = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f4969a;
        if (intent != null) {
            this.f4970b.startActivityForResult(intent, this.f4971c);
        }
    }
}
