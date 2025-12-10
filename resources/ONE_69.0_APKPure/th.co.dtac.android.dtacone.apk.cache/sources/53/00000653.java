package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: Gg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC17694Gg2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f2043a;

    /* renamed from: b */
    public final /* synthetic */ String f2044b;

    /* renamed from: c */
    public final /* synthetic */ Boolean f2045c;

    public CallableC17694Gg2(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f2043a = sharedPreferences;
        this.f2044b = str;
        this.f2045c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f2043a.getBoolean(this.f2044b, this.f2045c.booleanValue()));
    }
}