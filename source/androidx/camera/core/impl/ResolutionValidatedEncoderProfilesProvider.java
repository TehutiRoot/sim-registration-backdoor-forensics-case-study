package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.quirk.ProfileResolutionQuirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ResolutionValidatedEncoderProfilesProvider implements EncoderProfilesProvider {

    /* renamed from: a */
    public final EncoderProfilesProvider f11166a;

    /* renamed from: b */
    public final EncoderProfilesResolutionValidator f11167b;

    public ResolutionValidatedEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull Quirks quirks) {
        this.f11166a = encoderProfilesProvider;
        this.f11167b = new EncoderProfilesResolutionValidator(quirks.getAll(ProfileResolutionQuirk.class));
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i) {
        if (!this.f11166a.hasProfile(i)) {
            return null;
        }
        EncoderProfilesProxy all = this.f11166a.getAll(i);
        if (this.f11167b.hasQuirk()) {
            return this.f11167b.filterInvalidVideoResolution(all);
        }
        return all;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        if (!this.f11166a.hasProfile(i)) {
            return false;
        }
        if (this.f11167b.hasQuirk()) {
            return this.f11167b.hasValidVideoResolution(this.f11166a.getAll(i));
        }
        return true;
    }
}
