package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.AbstractRunnableC6527a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzfq;

/* renamed from: fh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19908fh2 extends AbstractRunnableC6527a {

    /* renamed from: e */
    public final /* synthetic */ String f61890e;

    /* renamed from: f */
    public final /* synthetic */ String f61891f;

    /* renamed from: g */
    public final /* synthetic */ Context f61892g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f61893h;

    /* renamed from: i */
    public final /* synthetic */ zzee f61894i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19908fh2(zzee zzeeVar, String str, String str2, Context context, Bundle bundle) {
        super(zzeeVar, true);
        this.f61894i = zzeeVar;
        this.f61890e = str;
        this.f61891f = str2;
        this.f61892g = context;
        this.f61893h = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6527a
    /* renamed from: a */
    public final void mo188a() {
        boolean m47324f;
        String str;
        String str2;
        String str3;
        zzcc zzccVar;
        boolean z;
        zzcc zzccVar2;
        String str4;
        String str5;
        try {
            zzee zzeeVar = this.f61894i;
            m47324f = zzee.m47324f(this.f61890e, this.f61891f);
            if (m47324f) {
                String str6 = this.f61891f;
                String str7 = this.f61890e;
                str5 = this.f61894i.f46258a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.f61892g);
            zzee zzeeVar2 = this.f61894i;
            zzeeVar2.f46264g = zzeeVar2.zzf(this.f61892g, true);
            zzccVar = this.f61894i.f46264g;
            if (zzccVar == null) {
                str4 = this.f61894i.f46258a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.f61892g, ModuleDescriptor.MODULE_ID);
            int remoteVersion = DynamiteModule.getRemoteVersion(this.f61892g, ModuleDescriptor.MODULE_ID);
            int max = Math.max(localVersion, remoteVersion);
            if (remoteVersion < localVersion) {
                z = true;
            } else {
                z = false;
            }
            zzcl zzclVar = new zzcl(73000L, max, z, str, str2, str3, this.f61893h, zzfq.zza(this.f61892g));
            zzccVar2 = this.f61894i.f46264g;
            ((zzcc) Preconditions.checkNotNull(zzccVar2)).initialize(ObjectWrapper.wrap(this.f61892g), zzclVar, this.f46196a);
        } catch (Exception e) {
            this.f61894i.m47327c(e, true, false);
        }
    }
}
