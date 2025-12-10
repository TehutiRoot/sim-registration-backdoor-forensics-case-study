package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

/* renamed from: OI2 */
/* loaded from: classes3.dex */
public final class OI2 implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        Preconditions.checkNotNull(activityTransition);
        Preconditions.checkNotNull(activityTransition2);
        int activityType = activityTransition.getActivityType();
        int activityType2 = activityTransition2.getActivityType();
        if (activityType != activityType2) {
            if (activityType < activityType2) {
                return -1;
            }
            return 1;
        }
        int transitionType = activityTransition.getTransitionType();
        int transitionType2 = activityTransition2.getTransitionType();
        if (transitionType == transitionType2) {
            return 0;
        }
        if (transitionType < transitionType2) {
            return -1;
        }
        return 1;
    }
}
