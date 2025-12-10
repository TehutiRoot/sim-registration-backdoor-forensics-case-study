package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: Uq2 */
/* loaded from: classes3.dex */
public final class Uq2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f6733a;

    /* renamed from: b */
    public final /* synthetic */ String f6734b;

    /* renamed from: c */
    public final /* synthetic */ Long f6735c;

    public Uq2(SharedPreferences sharedPreferences, String str, Long l) {
        this.f6733a = sharedPreferences;
        this.f6734b = str;
        this.f6735c = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f6733a.getLong(this.f6734b, this.f6735c.longValue()));
    }
}