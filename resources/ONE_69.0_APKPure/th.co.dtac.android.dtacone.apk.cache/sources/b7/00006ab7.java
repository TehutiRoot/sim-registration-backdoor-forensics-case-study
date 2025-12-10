package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.AbstractC4048c;
import androidx.core.provider.FontsContractCompat;

/* renamed from: androidx.core.provider.a */
/* loaded from: classes2.dex */
public class C4043a {

    /* renamed from: a */
    public final FontsContractCompat.FontRequestCallback f34089a;

    /* renamed from: b */
    public final Handler f34090b;

    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC4044a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ FontsContractCompat.FontRequestCallback f34091a;

        /* renamed from: b */
        public final /* synthetic */ Typeface f34092b;

        public RunnableC4044a(FontsContractCompat.FontRequestCallback fontRequestCallback, Typeface typeface) {
            this.f34091a = fontRequestCallback;
            this.f34092b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34091a.onTypefaceRetrieved(this.f34092b);
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    /* loaded from: classes2.dex */
    public class RunnableC4045b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ FontsContractCompat.FontRequestCallback f34094a;

        /* renamed from: b */
        public final /* synthetic */ int f34095b;

        public RunnableC4045b(FontsContractCompat.FontRequestCallback fontRequestCallback, int i) {
            this.f34094a = fontRequestCallback;
            this.f34095b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34094a.onTypefaceRequestFailed(this.f34095b);
        }
    }

    public C4043a(FontsContractCompat.FontRequestCallback fontRequestCallback, Handler handler) {
        this.f34089a = fontRequestCallback;
        this.f34090b = handler;
    }

    /* renamed from: a */
    public final void m57083a(int i) {
        this.f34090b.post(new RunnableC4045b(this.f34089a, i));
    }

    /* renamed from: b */
    public void m57082b(AbstractC4048c.C4053e c4053e) {
        if (c4053e.m57061a()) {
            m57081c(c4053e.f34112a);
        } else {
            m57083a(c4053e.f34113b);
        }
    }

    /* renamed from: c */
    public final void m57081c(Typeface typeface) {
        this.f34090b.post(new RunnableC4044a(this.f34089a, typeface));
    }

    public C4043a(FontsContractCompat.FontRequestCallback fontRequestCallback) {
        this.f34089a = fontRequestCallback;
        this.f34090b = AbstractC12457oh.m26087a();
    }
}