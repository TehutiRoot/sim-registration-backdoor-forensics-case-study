package th.p047co.dtac.android.dtacone.manager;

import android.content.Context;

/* renamed from: th.co.dtac.android.dtacone.manager.Contextor */
/* loaded from: classes7.dex */
public class Contextor {

    /* renamed from: b */
    public static Contextor f84888b;

    /* renamed from: a */
    public Context f84889a;

    public static Contextor getInstance() {
        if (f84888b == null) {
            f84888b = new Contextor();
        }
        return f84888b;
    }

    public Context getContext() {
        return this.f84889a;
    }

    public void init(Context context) {
        this.f84889a = context;
    }
}