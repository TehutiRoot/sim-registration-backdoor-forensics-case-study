package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.InstanceIdResult;

/* renamed from: Ov1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C18250Ov1 implements Continuation {

    /* renamed from: a */
    public static final Continuation f4617a = new C18250Ov1();

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String token;
        token = ((InstanceIdResult) task.getResult()).getToken();
        return token;
    }
}