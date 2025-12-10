package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.internal.clearcut.zzae;
import com.google.android.gms.internal.clearcut.zzan;
import com.google.android.gms.internal.clearcut.zzao;
import java.io.IOException;

/* renamed from: Xb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18738Xb2 extends zzae {

    /* renamed from: m */
    public final Object f7520m;

    /* renamed from: n */
    public String f7521n;

    /* renamed from: o */
    public Object f7522o;

    /* renamed from: p */
    public final /* synthetic */ zzan f7523p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18738Xb2(zzao zzaoVar, String str, Object obj, zzan zzanVar) {
        super(zzaoVar, str, obj, null);
        this.f7523p = zzanVar;
        this.f7520m = new Object();
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    public final Object zza(SharedPreferences sharedPreferences) {
        try {
            return zzb(sharedPreferences.getString(this.f45519b, ""));
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.f45519b);
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
            synchronized (this.f7520m) {
                if (!str.equals(this.f7521n)) {
                    Object zzb = this.f7523p.zzb(Base64.decode(str, 3));
                    this.f7521n = str;
                    this.f7522o = zzb;
                }
                obj = this.f7522o;
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f45519b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            return null;
        }
    }
}
