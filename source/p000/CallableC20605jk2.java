package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: jk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC20605jk2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f67352a;

    /* renamed from: b */
    public final /* synthetic */ String f67353b;

    /* renamed from: c */
    public final /* synthetic */ Integer f67354c;

    public CallableC20605jk2(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f67352a = sharedPreferences;
        this.f67353b = str;
        this.f67354c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f67352a.getInt(this.f67353b, this.f67354c.intValue()));
    }
}
