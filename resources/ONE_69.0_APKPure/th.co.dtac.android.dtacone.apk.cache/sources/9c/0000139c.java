package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.internal.clearcut.zzae;
import com.google.android.gms.internal.clearcut.zzan;
import com.google.android.gms.internal.clearcut.zzao;
import java.io.IOException;

/* renamed from: Uc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18592Uc2 extends zzae {

    /* renamed from: m */
    public final Object f6666m;

    /* renamed from: n */
    public String f6667n;

    /* renamed from: o */
    public Object f6668o;

    /* renamed from: p */
    public final /* synthetic */ zzan f6669p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18592Uc2(zzao zzaoVar, String str, Object obj, zzan zzanVar) {
        super(zzaoVar, str, obj, null);
        this.f6669p = zzanVar;
        this.f6666m = new Object();
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    public final Object zza(SharedPreferences sharedPreferences) {
        try {
            return zzb(sharedPreferences.getString(this.f45531b, ""));
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.f45531b);
            if (valueOf.length() != 0) {
                "Invalid byte[] value in SharedPreferences for ".concat(valueOf);
                return null;
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    public final Object zzb(String str) {
        Object obj;
        try {
            synchronized (this.f6666m) {
                if (!str.equals(this.f6667n)) {
                    Object zzb = this.f6669p.zzb(Base64.decode(str, 3));
                    this.f6667n = str;
                    this.f6668o = zzb;
                }
                obj = this.f6668o;
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f45531b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            return null;
        }
    }
}