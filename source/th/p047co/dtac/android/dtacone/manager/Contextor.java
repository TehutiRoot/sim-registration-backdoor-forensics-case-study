package th.p047co.dtac.android.dtacone.manager;

import android.content.Context;

/* renamed from: th.co.dtac.android.dtacone.manager.Contextor */
/* loaded from: classes7.dex */
public class Contextor {

    /* renamed from: b */
    public static Contextor f84778b;

    /* renamed from: a */
    public Context f84779a;

    public static Contextor getInstance() {
        if (f84778b == null) {
            f84778b = new Contextor();
        }
        return f84778b;
    }

    public Context getContext() {
        return this.f84779a;
    }

    public void init(Context context) {
        this.f84779a = context;
    }
}
