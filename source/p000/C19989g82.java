package p000;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: g82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19989g82 extends AbstractRunnableC20849l82 {

    /* renamed from: b */
    public final Map f62060b;

    /* renamed from: c */
    public final /* synthetic */ zaaw f62061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19989g82(zaaw zaawVar, Map map) {
        super(zaawVar, null);
        this.f62061c = zaawVar;
        this.f62060b = map;
    }

    @Override // p000.AbstractRunnableC20849l82
    /* renamed from: a */
    public final void mo26556a() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        boolean z;
        Context context2;
        zabi zabiVar;
        zae zaeVar;
        zae zaeVar2;
        zabi zabiVar2;
        Context context3;
        boolean z2;
        googleApiAvailabilityLight = this.f62061c.f44846d;
        zal zalVar = new zal(googleApiAvailabilityLight);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f62060b.keySet()) {
            if (client.requiresGooglePlayServices()) {
                z2 = ((C19473d82) this.f62060b.get(client)).f61077c;
                if (!z2) {
                    arrayList.add(client);
                }
            }
            arrayList2.add(client);
        }
        int i = 0;
        int i2 = -1;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i < size) {
                context3 = this.f62061c.f44845c;
                i2 = zalVar.zab(context3, (Api.Client) arrayList2.get(i));
                i++;
                if (i2 == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i < size2) {
                context = this.f62061c.f44845c;
                i2 = zalVar.zab(context, (Api.Client) arrayList.get(i));
                i++;
                if (i2 != 0) {
                    break;
                }
            }
        }
        if (i2 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i2, null);
            zaaw zaawVar = this.f62061c;
            zabiVar2 = zaawVar.f44843a;
            zabiVar2.m48504f(new C19645e82(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.f62061c;
        z = zaawVar2.f44855m;
        if (z) {
            zaeVar = zaawVar2.f44853k;
            if (zaeVar != null) {
                zaeVar2 = zaawVar2.f44853k;
                zaeVar2.zab();
            }
        }
        for (Api.Client client2 : this.f62060b.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) this.f62060b.get(client2);
            if (client2.requiresGooglePlayServices()) {
                context2 = this.f62061c.f44845c;
                if (zalVar.zab(context2, client2) != 0) {
                    zaaw zaawVar3 = this.f62061c;
                    zabiVar = zaawVar3.f44843a;
                    zabiVar.m48504f(new C19817f82(this, zaawVar3, connectionProgressReportCallbacks));
                }
            }
            client2.connect(connectionProgressReportCallbacks);
        }
    }
}
