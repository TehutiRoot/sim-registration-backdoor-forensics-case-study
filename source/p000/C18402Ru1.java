package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.InstanceIdResult;

/* renamed from: Ru1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C18402Ru1 implements Continuation {

    /* renamed from: a */
    public static final Continuation f5459a = new C18402Ru1();

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String token;
        token = ((InstanceIdResult) task.getResult()).getToken();
        return token;
    }
}
