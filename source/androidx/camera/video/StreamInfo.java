package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@AutoValue
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public abstract class StreamInfo {

    /* renamed from: a */
    public static final StreamInfo f11747a = m62362a(0, StreamState.INACTIVE);

    /* renamed from: b */
    public static final Set f11748b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* renamed from: c */
    public static final Observable f11749c = ConstantObservable.withValue(m62362a(0, StreamState.ACTIVE));

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public enum StreamState {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: a */
    public static StreamInfo m62362a(int i, StreamState streamState) {
        return new C2645i(i, streamState, null);
    }

    /* renamed from: b */
    public static StreamInfo m62361b(int i, StreamState streamState, SurfaceRequest.TransformationInfo transformationInfo) {
        return new C2645i(i, streamState, transformationInfo);
    }

    public abstract int getId();

    @Nullable
    public abstract SurfaceRequest.TransformationInfo getInProgressTransformationInfo();

    @NonNull
    public abstract StreamState getStreamState();
}
