package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: KT1 */
/* loaded from: classes6.dex */
public class KT1 implements ThreadFactory {

    /* renamed from: a */
    public final String f3327a;

    /* renamed from: b */
    public final ThreadGroup f3328b;

    /* renamed from: c */
    public final AtomicLong f3329c;

    public KT1(String str, ThreadGroup threadGroup) {
        this.f3327a = str;
        this.f3328b = threadGroup;
        this.f3329c = new AtomicLong();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f3328b;
        return new Thread(threadGroup, runnable, this.f3327a + HelpFormatter.DEFAULT_OPT_PREFIX + this.f3329c.incrementAndGet());
    }

    public KT1(String str) {
        this(str, null);
    }
}