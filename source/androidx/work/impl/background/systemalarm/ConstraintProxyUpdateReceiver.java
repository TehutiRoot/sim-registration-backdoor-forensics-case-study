package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.PackageManagerHelper;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f38429a = Logger.tagWithPrefix("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    /* loaded from: classes.dex */
    public class RunnableC5233a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Intent f38430a;

        /* renamed from: b */
        public final /* synthetic */ Context f38431b;

        /* renamed from: c */
        public final /* synthetic */ BroadcastReceiver.PendingResult f38432c;

        public RunnableC5233a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f38430a = intent;
            this.f38431b = context;
            this.f38432c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f38430a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f38430a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f38430a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f38430a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                Logger.get().debug(ConstraintProxyUpdateReceiver.f38429a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                PackageManagerHelper.setComponentEnabled(this.f38431b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                PackageManagerHelper.setComponentEnabled(this.f38431b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                PackageManagerHelper.setComponentEnabled(this.f38431b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                PackageManagerHelper.setComponentEnabled(this.f38431b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f38432c.finish();
            }
        }
    }

    @NonNull
    public static Intent newConstraintProxyUpdateIntent(@NonNull Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            Logger logger = Logger.get();
            String str2 = f38429a;
            logger.debug(str2, "Ignoring unknown action " + str);
            return;
        }
        WorkManagerImpl.getInstance(context).getWorkTaskExecutor().executeOnTaskThread(new RunnableC5233a(intent, context, goAsync()));
    }
}
