package p000;

import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.zzj;
import java.util.Locale;

/* renamed from: vf2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC22654vf2 implements Runnable {

    /* renamed from: a */
    public final CallbackInput f107740a;

    /* renamed from: b */
    public final String f107741b;

    /* renamed from: c */
    public final C21272nd2 f107742c;

    /* renamed from: d */
    public final /* synthetic */ AbstractServiceC21800qh2 f107743d;

    public RunnableC22654vf2(AbstractServiceC21800qh2 abstractServiceC21800qh2, CallbackInput callbackInput, Messenger messenger, String str, int i) {
        this.f107743d = abstractServiceC21800qh2;
        this.f107740a = callbackInput;
        this.f107741b = str;
        this.f107742c = new C21272nd2(messenger, i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("BaseCallbackTaskService", 4)) {
            String.format(Locale.US, "Running Callback Task w/ tag %s", this.f107741b);
        }
        try {
            this.f107743d.onRunTask(this.f107741b, this.f107740a, this.f107742c);
        } catch (Throwable th2) {
            C21272nd2 c21272nd2 = this.f107742c;
            zzj zza = CallbackOutput.zza();
            int i = this.f107740a.f48848a;
            CallbackOutput callbackOutput = zza.f48861a;
            callbackOutput.f48851a = i;
            callbackOutput.f48852b = 5;
            String message = th2.getMessage();
            CallbackOutput callbackOutput2 = zza.f48861a;
            callbackOutput2.f48854d = message;
            c21272nd2.complete(callbackOutput2);
            throw th2;
        }
    }
}
