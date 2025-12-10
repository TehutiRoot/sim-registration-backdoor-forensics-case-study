package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: iw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC20469iw2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f67115a;

    /* renamed from: b */
    public final /* synthetic */ String f67116b;

    /* renamed from: c */
    public final /* synthetic */ String f67117c;

    public CallableC20469iw2(SharedPreferences sharedPreferences, String str, String str2) {
        this.f67115a = sharedPreferences;
        this.f67116b = str;
        this.f67117c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f67115a.getString(this.f67116b, this.f67117c);
    }
}
