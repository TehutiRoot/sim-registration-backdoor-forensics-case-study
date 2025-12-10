package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: Xp2 */
/* loaded from: classes3.dex */
public final class Xp2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f7589a;

    /* renamed from: b */
    public final /* synthetic */ String f7590b;

    /* renamed from: c */
    public final /* synthetic */ Long f7591c;

    public Xp2(SharedPreferences sharedPreferences, String str, Long l) {
        this.f7589a = sharedPreferences;
        this.f7590b = str;
        this.f7591c = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f7589a.getLong(this.f7590b, this.f7591c.longValue()));
    }
}
