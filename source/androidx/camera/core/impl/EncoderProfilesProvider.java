package androidx.camera.core.impl;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface EncoderProfilesProvider {
    public static final EncoderProfilesProvider EMPTY = new C2505a();

    /* renamed from: androidx.camera.core.impl.EncoderProfilesProvider$a */
    /* loaded from: classes.dex */
    public class C2505a implements EncoderProfilesProvider {
        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public EncoderProfilesProxy getAll(int i) {
            return null;
        }

        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public boolean hasProfile(int i) {
            return false;
        }
    }

    @Nullable
    EncoderProfilesProxy getAll(int i);

    boolean hasProfile(int i);
}
