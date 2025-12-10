package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: NS1 */
/* loaded from: classes6.dex */
public class NS1 implements ThreadFactory {

    /* renamed from: a */
    public final String f4109a;

    /* renamed from: b */
    public final ThreadGroup f4110b;

    /* renamed from: c */
    public final AtomicLong f4111c;

    public NS1(String str, ThreadGroup threadGroup) {
        this.f4109a = str;
        this.f4110b = threadGroup;
        this.f4111c = new AtomicLong();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f4110b;
        return new Thread(threadGroup, runnable, this.f4109a + HelpFormatter.DEFAULT_OPT_PREFIX + this.f4111c.incrementAndGet());
    }

    public NS1(String str) {
        this(str, null);
    }
}
