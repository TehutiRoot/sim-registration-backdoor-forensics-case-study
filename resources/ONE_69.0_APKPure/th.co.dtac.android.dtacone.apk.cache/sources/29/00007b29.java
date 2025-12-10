package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.AbstractRunnableC6516a;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzfq;

/* renamed from: ci2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19444ci2 extends AbstractRunnableC6516a {

    /* renamed from: e */
    public final /* synthetic */ String f40192e;

    /* renamed from: f */
    public final /* synthetic */ String f40193f;

    /* renamed from: g */
    public final /* synthetic */ Context f40194g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f40195h;

    /* renamed from: i */
    public final /* synthetic */ zzee f40196i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19444ci2(zzee zzeeVar, String str, String str2, Context context, Bundle bundle) {
        super(zzeeVar, true);
        this.f40196i = zzeeVar;
        this.f40192e = str;
        this.f40193f = str2;
        this.f40194g = context;
        this.f40195h = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC6516a
    /* renamed from: a */
    public final void mo73a() {
        boolean m47333f;
        String str;
        String str2;
        String str3;
        zzcc zzccVar;
        boolean z;
        zzcc zzccVar2;
        String str4;
        String str5;
        try {
            zzee zzeeVar = this.f40196i;
            m47333f = zzee.m47333f(this.f40192e, this.f40193f);
            if (m47333f) {
                String str6 = this.f40193f;
                String str7 = this.f40192e;
                str5 = this.f40196i.f46270a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.f40194g);
            zzee zzeeVar2 = this.f40196i;
            zzeeVar2.f46276g = zzeeVar2.zzf(this.f40194g, true);
            zzccVar = this.f40196i.f46276g;
            if (zzccVar == null) {
                str4 = this.f40196i.f46270a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.f40194g, ModuleDescriptor.MODULE_ID);
            int remoteVersion = DynamiteModule.getRemoteVersion(this.f40194g, ModuleDescriptor.MODULE_ID);
            int max = Math.max(localVersion, remoteVersion);
            if (remoteVersion < localVersion) {
                z = true;
            } else {
                z = false;
            }
            zzcl zzclVar = new zzcl(73000L, max, z, str, str2, str3, this.f40195h, zzfq.zza(this.f40194g));
            zzccVar2 = this.f40196i.f46276g;
            ((zzcc) Preconditions.checkNotNull(zzccVar2)).initialize(ObjectWrapper.wrap(this.f40194g), zzclVar, this.f46208a);
        } catch (Exception e) {
            this.f40196i.m47336c(e, true, false);
        }
    }
}