package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.Queues;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: kJ */
/* loaded from: classes4.dex */
public abstract class AbstractC11638kJ {

    /* renamed from: kJ$b */
    /* loaded from: classes4.dex */
    public static final class C11640b extends AbstractC11638kJ {

        /* renamed from: a */
        public final ConcurrentLinkedQueue f67878a;

        /* renamed from: kJ$b$a */
        /* loaded from: classes4.dex */
        public static final class C11641a {

            /* renamed from: a */
            public final Object f67879a;

            /* renamed from: b */
            public final C22098sO1 f67880b;

            public C11641a(Object obj, C22098sO1 c22098sO1) {
                this.f67879a = obj;
                this.f67880b = c22098sO1;
            }
        }

        public C11640b() {
            this.f67878a = Queues.newConcurrentLinkedQueue();
        }

        @Override // p000.AbstractC11638kJ
        /* renamed from: a */
        public void mo28961a(Object obj, Iterator it) {
            Preconditions.checkNotNull(obj);
            while (it.hasNext()) {
                this.f67878a.add(new C11641a(obj, (C22098sO1) it.next()));
            }
            while (true) {
                C11641a c11641a = (C11641a) this.f67878a.poll();
                if (c11641a != null) {
                    c11641a.f67880b.m22621d(c11641a.f67879a);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: kJ$c */
    /* loaded from: classes4.dex */
    public static final class C11642c extends AbstractC11638kJ {

        /* renamed from: a */
        public final ThreadLocal f67881a;

        /* renamed from: b */
        public final ThreadLocal f67882b;

        /* renamed from: kJ$c$a */
        /* loaded from: classes4.dex */
        public class C11643a extends ThreadLocal {
            public C11643a() {
            }

            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public Queue initialValue() {
                return Queues.newArrayDeque();
            }
        }

        /* renamed from: kJ$c$b */
        /* loaded from: classes4.dex */
        public class C11644b extends ThreadLocal {
            public C11644b() {
            }

            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* renamed from: kJ$c$c */
        /* loaded from: classes4.dex */
        public static final class C11645c {

            /* renamed from: a */
            public final Object f67885a;

            /* renamed from: b */
            public final Iterator f67886b;

            public C11645c(Object obj, Iterator it) {
                this.f67885a = obj;
                this.f67886b = it;
            }
        }

        public C11642c() {
            this.f67881a = new C11643a();
            this.f67882b = new C11644b();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0039 A[Catch: all -> 0x0055, LOOP:1: B:7:0x0039->B:9:0x0043, LOOP_START, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x0031, B:7:0x0039, B:9:0x0043), top: B:17:0x0031 }] */
        @Override // p000.AbstractC11638kJ
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo28961a(java.lang.Object r4, java.util.Iterator r5) {
            /*
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r4)
                com.google.common.base.Preconditions.checkNotNull(r5)
                java.lang.ThreadLocal r0 = r3.f67881a
                java.lang.Object r0 = r0.get()
                java.util.Queue r0 = (java.util.Queue) r0
                java.util.Objects.requireNonNull(r0)
                java.util.Queue r0 = (java.util.Queue) r0
                kJ$c$c r1 = new kJ$c$c
                r2 = 0
                r1.<init>(r4, r5)
                r0.offer(r1)
                java.lang.ThreadLocal r4 = r3.f67882b
                java.lang.Object r4 = r4.get()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L6d
                java.lang.ThreadLocal r4 = r3.f67882b
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                r4.set(r5)
            L31:
                java.lang.Object r4 = r0.poll()     // Catch: java.lang.Throwable -> L55
                kJ$c$c r4 = (p000.AbstractC11638kJ.C11642c.C11645c) r4     // Catch: java.lang.Throwable -> L55
                if (r4 == 0) goto L57
            L39:
                java.util.Iterator r5 = p000.AbstractC11638kJ.C11642c.C11645c.m28958a(r4)     // Catch: java.lang.Throwable -> L55
                boolean r5 = r5.hasNext()     // Catch: java.lang.Throwable -> L55
                if (r5 == 0) goto L31
                java.util.Iterator r5 = p000.AbstractC11638kJ.C11642c.C11645c.m28958a(r4)     // Catch: java.lang.Throwable -> L55
                java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L55
                sO1 r5 = (p000.C22098sO1) r5     // Catch: java.lang.Throwable -> L55
                java.lang.Object r1 = p000.AbstractC11638kJ.C11642c.C11645c.m28957b(r4)     // Catch: java.lang.Throwable -> L55
                r5.m22621d(r1)     // Catch: java.lang.Throwable -> L55
                goto L39
            L55:
                r4 = move-exception
                goto L62
            L57:
                java.lang.ThreadLocal r4 = r3.f67882b
                r4.remove()
                java.lang.ThreadLocal r4 = r3.f67881a
                r4.remove()
                goto L6d
            L62:
                java.lang.ThreadLocal r5 = r3.f67882b
                r5.remove()
                java.lang.ThreadLocal r5 = r3.f67881a
                r5.remove()
                throw r4
            L6d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11638kJ.C11642c.mo28961a(java.lang.Object, java.util.Iterator):void");
        }
    }

    /* renamed from: b */
    public static AbstractC11638kJ m28965b() {
        return new C11640b();
    }

    /* renamed from: c */
    public static AbstractC11638kJ m28964c() {
        return new C11642c();
    }

    /* renamed from: a */
    public abstract void mo28961a(Object obj, Iterator it);
}
