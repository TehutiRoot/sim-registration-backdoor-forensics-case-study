package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: kz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC20822kz2 extends zzz {

    /* renamed from: a */
    public final int f71504a;

    public AbstractBinderC20822kz2(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f71504a = Arrays.hashCode(bArr);
    }

    /* renamed from: a */
    public static byte[] m26575a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public abstract byte[] mo26574b();

    public final boolean equals(Object obj) {
        IObjectWrapper zzd;
        if (obj != null && (obj instanceof zzaa)) {
            try {
                zzaa zzaaVar = (zzaa) obj;
                if (zzaaVar.zzc() != this.f71504a || (zzd = zzaaVar.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(mo26574b(), (byte[]) ObjectWrapper.unwrap(zzd));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f71504a;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.f71504a;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(mo26574b());
    }
}
