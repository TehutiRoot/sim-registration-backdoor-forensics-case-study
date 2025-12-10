package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC8559f;

/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes4.dex */
public class BinderC8557e extends Binder {

    /* renamed from: a */
    public final InterfaceC8558a f55686a;

    /* renamed from: com.google.firebase.messaging.e$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8558a {
        /* renamed from: a */
        Task mo38419a(Intent intent);
    }

    public BinderC8557e(InterfaceC8558a interfaceC8558a) {
        this.f55686a = interfaceC8558a;
    }

    /* renamed from: c */
    public void m38420c(final ServiceConnectionC8559f.C8560a c8560a) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable(Constants.TAG, 3);
            this.f55686a.mo38419a(c8560a.f55693a).addOnCompleteListener(new ExecutorC21992ro1(), new OnCompleteListener() { // from class: Z52
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ServiceConnectionC8559f.C8560a.this.m38411d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
