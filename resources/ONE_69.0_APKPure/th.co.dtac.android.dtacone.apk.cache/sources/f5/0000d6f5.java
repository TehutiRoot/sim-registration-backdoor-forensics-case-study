package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzaw;
import kotlinx.coroutines.DebugKt;

/* renamed from: jE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC20578jE2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f67265a;

    /* renamed from: b */
    public final /* synthetic */ String f67266b = "_err";

    /* renamed from: c */
    public final /* synthetic */ Bundle f67267c;

    /* renamed from: d */
    public final /* synthetic */ C21270nE2 f67268d;

    public RunnableC20578jE2(C21270nE2 c21270nE2, String str, String str2, Bundle bundle) {
        this.f67268d = c21270nE2;
        this.f67265a = str;
        this.f67267c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67268d.f72300a.m46166f((zzaw) Preconditions.checkNotNull(this.f67268d.f72300a.zzv().m46096S(this.f67265a, this.f67266b, this.f67267c, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, this.f67268d.f72300a.zzav().currentTimeMillis(), false, true)), this.f67265a);
    }
}