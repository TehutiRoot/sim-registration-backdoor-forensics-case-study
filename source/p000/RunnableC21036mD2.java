package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzaw;
import kotlinx.coroutines.DebugKt;

/* renamed from: mD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC21036mD2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f71842a;

    /* renamed from: b */
    public final /* synthetic */ String f71843b = "_err";

    /* renamed from: c */
    public final /* synthetic */ Bundle f71844c;

    /* renamed from: d */
    public final /* synthetic */ C21724qD2 f71845d;

    public RunnableC21036mD2(C21724qD2 c21724qD2, String str, String str2, Bundle bundle) {
        this.f71845d = c21724qD2;
        this.f71842a = str;
        this.f71844c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f71845d.f76904a.m46181f((zzaw) Preconditions.checkNotNull(this.f71845d.f76904a.zzv().m46111S(this.f71842a, this.f71843b, this.f71844c, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, this.f71845d.f76904a.zzav().currentTimeMillis(), false, true)), this.f71842a);
    }
}
