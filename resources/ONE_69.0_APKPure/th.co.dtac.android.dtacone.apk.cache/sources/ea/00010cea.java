package p000;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: s10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22094s10 {

    /* renamed from: a */
    public static final Executor f79755a = ExecutorC21921r10.f77379a;

    /* renamed from: a */
    public static Executor m22911a() {
        return f79755a;
    }

    /* renamed from: b */
    public static ExecutorService m22910b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    }
}