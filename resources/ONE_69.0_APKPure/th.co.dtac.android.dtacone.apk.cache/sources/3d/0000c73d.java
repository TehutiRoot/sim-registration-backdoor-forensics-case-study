package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: fx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC20008fx2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f62024a;

    /* renamed from: b */
    public final /* synthetic */ String f62025b;

    /* renamed from: c */
    public final /* synthetic */ String f62026c;

    public CallableC20008fx2(SharedPreferences sharedPreferences, String str, String str2) {
        this.f62024a = sharedPreferences;
        this.f62025b = str;
        this.f62026c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f62024a.getString(this.f62025b, this.f62026c);
    }
}