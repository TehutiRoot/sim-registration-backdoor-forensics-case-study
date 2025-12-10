package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: Jf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC17854Jf2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f2874a;

    /* renamed from: b */
    public final /* synthetic */ String f2875b;

    /* renamed from: c */
    public final /* synthetic */ Boolean f2876c;

    public CallableC17854Jf2(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f2874a = sharedPreferences;
        this.f2875b = str;
        this.f2876c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f2874a.getBoolean(this.f2875b, this.f2876c.booleanValue()));
    }
}
