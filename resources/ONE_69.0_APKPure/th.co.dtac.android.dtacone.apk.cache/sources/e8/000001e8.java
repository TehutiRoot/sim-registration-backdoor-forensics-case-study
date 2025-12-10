package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.load.engine.Resource;

/* renamed from: By1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17411By1 {

    /* renamed from: a */
    public boolean f598a;

    /* renamed from: b */
    public final Handler f599b = new Handler(Looper.getMainLooper(), new C0147a());

    /* renamed from: By1$a */
    /* loaded from: classes3.dex */
    public static final class C0147a implements Handler.Callback {
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
    public synchronized void m69028a(Resource resource, boolean z) {
        try {
            if (!this.f598a && !z) {
                this.f598a = true;
                resource.recycle();
                this.f598a = false;
            }
            this.f599b.obtainMessage(1, resource).sendToTarget();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}