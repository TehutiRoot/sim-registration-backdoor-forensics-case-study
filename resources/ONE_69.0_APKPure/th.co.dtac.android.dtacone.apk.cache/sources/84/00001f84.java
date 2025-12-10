package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.quirk.ProfileResolutionQuirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ResolutionValidatedEncoderProfilesProvider implements EncoderProfilesProvider {

    /* renamed from: a */
    public final EncoderProfilesProvider f11254a;

    /* renamed from: b */
    public final EncoderProfilesResolutionValidator f11255b;

    public ResolutionValidatedEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull Quirks quirks) {
        this.f11254a = encoderProfilesProvider;
        this.f11255b = new EncoderProfilesResolutionValidator(quirks.getAll(ProfileResolutionQuirk.class));
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i) {
        if (!this.f11254a.hasProfile(i)) {
            return null;
        }
        EncoderProfilesProxy all = this.f11254a.getAll(i);
        if (this.f11255b.hasQuirk()) {
            return this.f11255b.filterInvalidVideoResolution(all);
        }
        return all;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i) {
        if (!this.f11254a.hasProfile(i)) {
            return false;
        }
        if (this.f11255b.hasQuirk()) {
            return this.f11255b.hasValidVideoResolution(this.f11254a.getAll(i));
        }
        return true;
    }
}