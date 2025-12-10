package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.util.List;

/* loaded from: classes.dex */
public final class TrustedWebActivityIntent {

    /* renamed from: a */
    public final Intent f10223a;

    /* renamed from: b */
    public final List f10224b;

    public TrustedWebActivityIntent(Intent intent, List list) {
        this.f10223a = intent;
        this.f10224b = list;
    }

    /* renamed from: a */
    public final void m64005a(Context context) {
        for (Uri uri : this.f10224b) {
            context.grantUriPermission(this.f10223a.getPackage(), uri, 1);
        }
    }

    @NonNull
    public Intent getIntent() {
        return this.f10223a;
    }

    public void launchTrustedWebActivity(@NonNull Context context) {
        m64005a(context);
        ContextCompat.startActivity(context, this.f10223a, null);
    }
}
