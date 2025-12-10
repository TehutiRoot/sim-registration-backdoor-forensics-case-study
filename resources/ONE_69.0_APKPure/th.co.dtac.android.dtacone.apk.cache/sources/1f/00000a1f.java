package p000;

import android.content.BroadcastReceiver;
import com.google.android.gms.analytics.CampaignTrackingReceiver;

/* renamed from: Kg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC17954Kg2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f3374a;

    public RunnableC17954Kg2(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.f3374a = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.f3374a;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}