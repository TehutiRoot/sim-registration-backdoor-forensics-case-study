package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: V82 */
/* loaded from: classes3.dex */
public final class V82 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f6566a;

    /* renamed from: b */
    public final /* synthetic */ Intent f6567b;

    public V82(Context context, Intent intent) {
        this.f6566a = context;
        this.f6567b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f6566a.startActivity(this.f6567b);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
