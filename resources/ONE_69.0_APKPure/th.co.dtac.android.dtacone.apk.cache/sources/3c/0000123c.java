package p000;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.zag;

/* renamed from: T92 */
/* loaded from: classes3.dex */
public final class T92 extends zag {

    /* renamed from: a */
    public final /* synthetic */ Intent f6275a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f6276b;

    /* renamed from: c */
    public final /* synthetic */ int f6277c;

    public T92(Intent intent, Fragment fragment, int i) {
        this.f6275a = intent;
        this.f6276b = fragment;
        this.f6277c = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f6275a;
        if (intent != null) {
            this.f6276b.startActivityForResult(intent, this.f6277c);
        }
    }
}