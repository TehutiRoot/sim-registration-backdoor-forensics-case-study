package p000;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import com.google.android.gms.internal.wallet.zzg;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.OnCompleteListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: qh2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractServiceC21800qh2 extends Service {

    /* renamed from: a */
    public Messenger f77040a = new Messenger(new P92(this, Looper.getMainLooper()));

    /* renamed from: b */
    public ExecutorService f77041b;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f77040a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f77040a = new Messenger(new P92(this, Looper.getMainLooper()));
        zzg.zza();
        this.f77041b = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    public abstract void onRunTask(String str, CallbackInput callbackInput, OnCompleteListener onCompleteListener);
}
