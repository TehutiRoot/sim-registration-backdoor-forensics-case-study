package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.label.FirebaseVisionCloudImageLabelerOptions;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabeler;
import java.util.LinkedList;
import java.util.List;

/* renamed from: se2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22200se2 implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ FirebaseVisionImageLabeler f79941a;

    public C22200se2(FirebaseVisionImageLabeler firebaseVisionImageLabeler) {
        this.f79941a = firebaseVisionImageLabeler;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions;
        LinkedList linkedList = new LinkedList();
        for (FirebaseVisionImageLabel firebaseVisionImageLabel : (List) task.getResult()) {
            float confidence = firebaseVisionImageLabel.getConfidence();
            firebaseVisionCloudImageLabelerOptions = this.f79941a.f56007d;
            if (Float.compare(confidence, firebaseVisionCloudImageLabelerOptions.getConfidenceThreshold()) >= 0) {
                linkedList.add(firebaseVisionImageLabel);
            }
        }
        return linkedList;
    }
}