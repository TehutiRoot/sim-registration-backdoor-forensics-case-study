package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: gl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC20145gl2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f62267a;

    /* renamed from: b */
    public final /* synthetic */ String f62268b;

    /* renamed from: c */
    public final /* synthetic */ Integer f62269c;

    public CallableC20145gl2(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f62267a = sharedPreferences;
        this.f62268b = str;
        this.f62269c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f62267a.getInt(this.f62268b, this.f62269c.intValue()));
    }
}