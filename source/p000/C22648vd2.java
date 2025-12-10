package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.label.FirebaseVisionCloudImageLabelerOptions;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabeler;
import java.util.LinkedList;
import java.util.List;

/* renamed from: vd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22648vd2 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ FirebaseVisionImageLabeler f107731a;

    public C22648vd2(FirebaseVisionImageLabeler firebaseVisionImageLabeler) {
        this.f107731a = firebaseVisionImageLabeler;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions;
        LinkedList linkedList = new LinkedList();
        for (FirebaseVisionImageLabel firebaseVisionImageLabel : (List) task.getResult()) {
            float confidence = firebaseVisionImageLabel.getConfidence();
            firebaseVisionCloudImageLabelerOptions = this.f107731a.f55995d;
            if (Float.compare(confidence, firebaseVisionCloudImageLabelerOptions.getConfidenceThreshold()) >= 0) {
                linkedList.add(firebaseVisionImageLabel);
            }
        }
        return linkedList;
    }
}
