package p000;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.zag;

/* renamed from: W82 */
/* loaded from: classes3.dex */
public final class W82 extends zag {

    /* renamed from: a */
    public final /* synthetic */ Intent f7140a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f7141b;

    /* renamed from: c */
    public final /* synthetic */ int f7142c;

    public W82(Intent intent, Fragment fragment, int i) {
        this.f7140a = intent;
        this.f7141b = fragment;
        this.f7142c = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.f7140a;
        if (intent != null) {
            this.f7141b.startActivityForResult(intent, this.f7142c);
        }
    }
}
