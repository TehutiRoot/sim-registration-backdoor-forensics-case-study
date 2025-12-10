package p000;

import android.util.Base64;
import com.google.android.gms.internal.vision.zzbi;
import com.google.android.gms.internal.vision.zzbo;
import com.google.android.gms.internal.vision.zzbp;
import java.io.IOException;

/* renamed from: vf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22722vf2 extends zzbi {

    /* renamed from: l */
    public final /* synthetic */ zzbp f108171l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22722vf2(zzbo zzboVar, String str, Object obj, boolean z, zzbp zzbpVar) {
        super(zzboVar, str, obj, true, null);
        this.f108171l = zzbpVar;
    }

    @Override // com.google.android.gms.internal.vision.zzbi
    /* renamed from: b */
    public final Object mo881b(Object obj) {
        if (obj instanceof String) {
            try {
                return this.f108171l.zza(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 27 + valueOf.length());
        sb.append("Invalid byte[] value for ");
        sb.append(zzb);
        sb.append(": ");
        sb.append(valueOf);
        return null;
    }
}