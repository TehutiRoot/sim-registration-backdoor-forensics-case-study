package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: B92 */
/* loaded from: classes3.dex */
public final class B92 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f330a;

    /* renamed from: b */
    public final /* synthetic */ int f331b;

    /* renamed from: c */
    public final /* synthetic */ ActivityResultLauncher f332c;

    /* renamed from: d */
    public final /* synthetic */ GoogleApiAvailability f333d;

    public B92(GoogleApiAvailability googleApiAvailability, Activity activity, int i, ActivityResultLauncher activityResultLauncher) {
        this.f333d = googleApiAvailability;
        this.f330a = activity;
        this.f331b = i;
        this.f332c = activityResultLauncher;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.f333d.getErrorResolutionPendingIntent(this.f330a, this.f331b, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.f332c.launch(new IntentSenderRequest.Builder(errorResolutionPendingIntent.getIntentSender()).build());
    }
}