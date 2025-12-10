package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface ShaderProvider {
    public static final ShaderProvider DEFAULT = new C2557a();

    /* renamed from: androidx.camera.core.processing.ShaderProvider$a */
    /* loaded from: classes.dex */
    public class C2557a implements ShaderProvider {
        @Override // androidx.camera.core.processing.ShaderProvider
        public /* synthetic */ String createFragmentShader(String str, String str2) {
            return KG1.m67629a(this, str, str2);
        }
    }

    @Nullable
    String createFragmentShader(@NonNull String str, @NonNull String str2);
}
