package p000;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import androidx.core.p005os.EnvironmentCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzq;

/* renamed from: aK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19034aK2 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C21115mK2 f8411a;

    public /* synthetic */ C19034aK2(C21115mK2 c21115mK2, zzq zzqVar) {
        this.f8411a = c21115mK2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            synchronized (C21115mK2.m26671e(this.f8411a)) {
                try {
                    zzo zzoVar = (zzo) message.obj;
                    ServiceConnectionC22669vJ2 serviceConnectionC22669vJ2 = (ServiceConnectionC22669vJ2) C21115mK2.m26671e(this.f8411a).get(zzoVar);
                    if (serviceConnectionC22669vJ2 != null && serviceConnectionC22669vJ2.m930a() == 3) {
                        String valueOf = String.valueOf(zzoVar);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        new Exception();
                        ComponentName m929b = serviceConnectionC22669vJ2.m929b();
                        if (m929b == null) {
                            m929b = zzoVar.zza();
                        }
                        if (m929b == null) {
                            String zzc = zzoVar.zzc();
                            Preconditions.checkNotNull(zzc);
                            m929b = new ComponentName(zzc, EnvironmentCompat.MEDIA_UNKNOWN);
                        }
                        serviceConnectionC22669vJ2.onServiceDisconnected(m929b);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (C21115mK2.m26671e(this.f8411a)) {
            try {
                zzo zzoVar2 = (zzo) message.obj;
                ServiceConnectionC22669vJ2 serviceConnectionC22669vJ22 = (ServiceConnectionC22669vJ2) C21115mK2.m26671e(this.f8411a).get(zzoVar2);
                if (serviceConnectionC22669vJ22 != null && serviceConnectionC22669vJ22.m922i()) {
                    if (serviceConnectionC22669vJ22.m921j()) {
                        serviceConnectionC22669vJ22.m924g("GmsClientSupervisor");
                    }
                    C21115mK2.m26671e(this.f8411a).remove(zzoVar2);
                }
            } finally {
            }
        }
        return true;
    }
}