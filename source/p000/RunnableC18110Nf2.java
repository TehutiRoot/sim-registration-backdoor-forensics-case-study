package p000;

import android.content.BroadcastReceiver;
import com.google.android.gms.analytics.CampaignTrackingReceiver;

/* renamed from: Nf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC18110Nf2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f4161a;

    public RunnableC18110Nf2(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.f4161a = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.f4161a;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
