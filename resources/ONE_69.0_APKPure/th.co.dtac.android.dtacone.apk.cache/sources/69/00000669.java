package p000;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* renamed from: Gl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17708Gl1 {
    /* renamed from: a */
    public static Bundle m68210a(Object obj) {
        Bundle extras;
        extras = ((PlaybackState) obj).getExtras();
        return extras;
    }

    /* renamed from: b */
    public static Object m68209b(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i, j, f, j4);
        builder.setBufferedPosition(j2);
        builder.setActions(j3);
        builder.setErrorMessage(charSequence);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j5);
        builder.setExtras(bundle);
        return builder.build();
    }
}