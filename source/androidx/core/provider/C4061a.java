package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.AbstractC4066c;
import androidx.core.provider.FontsContractCompat;

/* renamed from: androidx.core.provider.a */
/* loaded from: classes2.dex */
public class C4061a {

    /* renamed from: a */
    public final FontsContractCompat.FontRequestCallback f34001a;

    /* renamed from: b */
    public final Handler f34002b;

    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC4062a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ FontsContractCompat.FontRequestCallback f34003a;

        /* renamed from: b */
        public final /* synthetic */ Typeface f34004b;

        public RunnableC4062a(FontsContractCompat.FontRequestCallback fontRequestCallback, Typeface typeface) {
            this.f34003a = fontRequestCallback;
            this.f34004b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34003a.onTypefaceRetrieved(this.f34004b);
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    /* loaded from: classes2.dex */
    public class RunnableC4063b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ FontsContractCompat.FontRequestCallback f34006a;

        /* renamed from: b */
        public final /* synthetic */ int f34007b;

        public RunnableC4063b(FontsContractCompat.FontRequestCallback fontRequestCallback, int i) {
            this.f34006a = fontRequestCallback;
            this.f34007b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34006a.onTypefaceRequestFailed(this.f34007b);
        }
    }

    public C4061a(FontsContractCompat.FontRequestCallback fontRequestCallback, Handler handler) {
        this.f34001a = fontRequestCallback;
        this.f34002b = handler;
    }

    /* renamed from: a */
    public final void m57133a(int i) {
        this.f34002b.post(new RunnableC4063b(this.f34001a, i));
    }

    /* renamed from: b */
    public void m57132b(AbstractC4066c.C4071e c4071e) {
        if (c4071e.m57111a()) {
            m57131c(c4071e.f34024a);
        } else {
            m57133a(c4071e.f34025b);
        }
    }

    /* renamed from: c */
    public final void m57131c(Typeface typeface) {
        this.f34002b.post(new RunnableC4062a(this.f34001a, typeface));
    }

    public C4061a(FontsContractCompat.FontRequestCallback fontRequestCallback) {
        this.f34001a = fontRequestCallback;
        this.f34002b = AbstractC12457oh.m25886a();
    }
}
