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
    public final Intent f10311a;

    /* renamed from: b */
    public final List f10312b;

    public TrustedWebActivityIntent(Intent intent, List list) {
        this.f10311a = intent;
        this.f10312b = list;
    }

    /* renamed from: a */
    public final void m63956a(Context context) {
        for (Uri uri : this.f10312b) {
            context.grantUriPermission(this.f10311a.getPackage(), uri, 1);
        }
    }

    @NonNull
    public Intent getIntent() {
        return this.f10311a;
    }

    public void launchTrustedWebActivity(@NonNull Context context) {
        m63956a(context);
        ContextCompat.startActivity(context, this.f10311a, null);
    }
}