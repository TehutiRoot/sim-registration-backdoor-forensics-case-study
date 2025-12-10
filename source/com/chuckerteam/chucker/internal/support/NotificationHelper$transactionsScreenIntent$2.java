package com.chuckerteam.chucker.internal.support;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.chuckerteam.chucker.api.Chucker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class NotificationHelper$transactionsScreenIntent$2 extends Lambda implements Function0<PendingIntent> {
    final /* synthetic */ NotificationHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationHelper$transactionsScreenIntent$2(NotificationHelper notificationHelper) {
        super(0);
        this.this$0 = notificationHelper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PendingIntent invoke() {
        int m49919e;
        Context context = this.this$0.getContext();
        Intent launchIntent = Chucker.getLaunchIntent(this.this$0.getContext());
        m49919e = this.this$0.m49919e();
        return PendingIntent.getActivity(context, 1138, launchIntent, m49919e | 134217728);
    }
}
