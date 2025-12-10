package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface VideoCapabilities {
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final VideoCapabilities EMPTY = new C2621a();

    /* renamed from: androidx.camera.video.VideoCapabilities$a */
    /* loaded from: classes.dex */
    public class C2621a implements VideoCapabilities {
        @Override // androidx.camera.video.VideoCapabilities
        public /* synthetic */ VideoValidatedEncoderProfilesProxy findHighestSupportedEncoderProfilesFor(Size size, DynamicRange dynamicRange) {
            return I12.m68010a(this, size, dynamicRange);
        }

        @Override // androidx.camera.video.VideoCapabilities
        public /* synthetic */ Quality findHighestSupportedQualityFor(Size size, DynamicRange dynamicRange) {
            return I12.m68009b(this, size, dynamicRange);
        }

        @Override // androidx.camera.video.VideoCapabilities
        public /* synthetic */ VideoValidatedEncoderProfilesProxy getProfiles(Quality quality, DynamicRange dynamicRange) {
            return I12.m68008c(this, quality, dynamicRange);
        }

        @Override // androidx.camera.video.VideoCapabilities
        public Set getSupportedDynamicRanges() {
            return new HashSet();
        }

        @Override // androidx.camera.video.VideoCapabilities
        public List getSupportedQualities(DynamicRange dynamicRange) {
            return new ArrayList();
        }

        @Override // androidx.camera.video.VideoCapabilities
        public boolean isQualitySupported(Quality quality, DynamicRange dynamicRange) {
            return false;
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    VideoValidatedEncoderProfilesProxy findHighestSupportedEncoderProfilesFor(@NonNull Size size, @NonNull DynamicRange dynamicRange);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    Quality findHighestSupportedQualityFor(@NonNull Size size, @NonNull DynamicRange dynamicRange);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    VideoValidatedEncoderProfilesProxy getProfiles(@NonNull Quality quality, @NonNull DynamicRange dynamicRange);

    @NonNull
    Set<DynamicRange> getSupportedDynamicRanges();

    @NonNull
    List<Quality> getSupportedQualities(@NonNull DynamicRange dynamicRange);

    boolean isQualitySupported(@NonNull Quality quality, @NonNull DynamicRange dynamicRange);
}
