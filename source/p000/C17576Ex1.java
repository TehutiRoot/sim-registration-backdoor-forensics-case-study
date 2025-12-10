package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.load.engine.Resource;

/* renamed from: Ex1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17576Ex1 {

    /* renamed from: a */
    public boolean f1459a;

    /* renamed from: b */
    public final Handler f1460b = new Handler(Looper.getMainLooper(), new C0355a());

    /* renamed from: Ex1$a */
    /* loaded from: classes3.dex */
    public static final class C0355a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((Resource) message.obj).recycle();
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public synchronized void m68439a(Resource resource, boolean z) {
        try {
            if (!this.f1459a && !z) {
                this.f1459a = true;
                resource.recycle();
                this.f1459a = false;
            }
            this.f1460b.obtainMessage(1, resource).sendToTarget();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
