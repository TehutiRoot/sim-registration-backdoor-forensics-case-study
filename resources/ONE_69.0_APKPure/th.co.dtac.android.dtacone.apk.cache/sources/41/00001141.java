package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: S92 */
/* loaded from: classes3.dex */
public final class S92 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Context f5749a;

    /* renamed from: b */
    public final /* synthetic */ Intent f5750b;

    public S92(Context context, Intent intent) {
        this.f5749a = context;
        this.f5750b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f5749a.startActivity(this.f5750b);
        } catch (ActivityNotFoundException unused) {
        }
    }
}