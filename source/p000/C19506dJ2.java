package p000;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import androidx.core.p005os.EnvironmentCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzq;
import java.util.HashMap;

/* renamed from: dJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19506dJ2 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C21570pJ2 f61135a;

    public /* synthetic */ C19506dJ2(C21570pJ2 c21570pJ2, zzq zzqVar) {
        this.f61135a = c21570pJ2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.f61135a.f76558f;
            synchronized (hashMap) {
                try {
                    zzo zzoVar = (zzo) message.obj;
                    hashMap2 = this.f61135a.f76558f;
                    ServiceConnectionC23115yI2 serviceConnectionC23115yI2 = (ServiceConnectionC23115yI2) hashMap2.get(zzoVar);
                    if (serviceConnectionC23115yI2 != null && serviceConnectionC23115yI2.m312i()) {
                        if (serviceConnectionC23115yI2.m311j()) {
                            serviceConnectionC23115yI2.m314g("GmsClientSupervisor");
                        }
                        hashMap3 = this.f61135a.f76558f;
                        hashMap3.remove(zzoVar);
                    }
                } finally {
                }
            }
            return true;
        } else if (i == 1) {
            hashMap4 = this.f61135a.f76558f;
            synchronized (hashMap4) {
                try {
                    zzo zzoVar2 = (zzo) message.obj;
                    hashMap5 = this.f61135a.f76558f;
                    ServiceConnectionC23115yI2 serviceConnectionC23115yI22 = (ServiceConnectionC23115yI2) hashMap5.get(zzoVar2);
                    if (serviceConnectionC23115yI22 != null && serviceConnectionC23115yI22.m320a() == 3) {
                        String valueOf = String.valueOf(zzoVar2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        new Exception();
                        ComponentName m319b = serviceConnectionC23115yI22.m319b();
                        if (m319b == null) {
                            m319b = zzoVar2.zza();
                        }
                        if (m319b == null) {
                            String zzc = zzoVar2.zzc();
                            Preconditions.checkNotNull(zzc);
                            m319b = new ComponentName(zzc, EnvironmentCompat.MEDIA_UNKNOWN);
                        }
                        serviceConnectionC23115yI22.onServiceDisconnected(m319b);
                    }
                } finally {
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
