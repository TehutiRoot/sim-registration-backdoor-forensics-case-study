package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: E82 */
/* loaded from: classes3.dex */
public final class E82 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f1219a;

    /* renamed from: b */
    public final /* synthetic */ int f1220b;

    /* renamed from: c */
    public final /* synthetic */ ActivityResultLauncher f1221c;

    /* renamed from: d */
    public final /* synthetic */ GoogleApiAvailability f1222d;

    public E82(GoogleApiAvailability googleApiAvailability, Activity activity, int i, ActivityResultLauncher activityResultLauncher) {
        this.f1222d = googleApiAvailability;
        this.f1219a = activity;
        this.f1220b = i;
        this.f1221c = activityResultLauncher;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.f1222d.getErrorResolutionPendingIntent(this.f1219a, this.f1220b, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.f1221c.launch(new IntentSenderRequest.Builder(errorResolutionPendingIntent.getIntentSender()).build());
    }
}
