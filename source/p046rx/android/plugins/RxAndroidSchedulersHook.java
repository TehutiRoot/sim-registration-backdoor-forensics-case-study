package p046rx.android.plugins;

import p046rx.Scheduler;
import p046rx.functions.Action0;

/* renamed from: rx.android.plugins.RxAndroidSchedulersHook */
/* loaded from: classes5.dex */
public class RxAndroidSchedulersHook {

    /* renamed from: a */
    public static final RxAndroidSchedulersHook f77703a = new RxAndroidSchedulersHook();

    public static RxAndroidSchedulersHook getDefaultInstance() {
        return f77703a;
    }

    public Scheduler getMainThreadScheduler() {
        return null;
    }

    public Action0 onSchedule(Action0 action0) {
        return action0;
    }
}
