package p000;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC21342o10 {

    /* renamed from: a */
    public static final Executor f72542a = ExecutorC21170n10.f72111a;

    /* renamed from: a */
    public static Executor m25977a() {
        return f72542a;
    }

    /* renamed from: b */
    public static ExecutorService m25976b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    }
}
