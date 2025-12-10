package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.processing.TargetUtils;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class UseCaseGroup {

    /* renamed from: a */
    public final ViewPort f10933a;

    /* renamed from: b */
    public final List f10934b;

    /* renamed from: c */
    public final List f10935c;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: d */
        public static final List f10936d = Arrays.asList(1, 2, 4, 3, 7);

        /* renamed from: a */
        public ViewPort f10937a;

        /* renamed from: b */
        public final List f10938b = new ArrayList();

        /* renamed from: c */
        public final List f10939c = new ArrayList();

        /* renamed from: a */
        public final void m63160a() {
            int i = 0;
            for (CameraEffect cameraEffect : this.f10939c) {
                int targets = cameraEffect.getTargets();
                TargetUtils.checkSupportedTargets(f10936d, targets);
                int i2 = i & targets;
                if (i2 <= 0) {
                    i |= targets;
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", TargetUtils.getHumanReadableName(i2)));
                }
            }
        }

        @NonNull
        public Builder addEffect(@NonNull CameraEffect cameraEffect) {
            this.f10939c.add(cameraEffect);
            return this;
        }

        @NonNull
        public Builder addUseCase(@NonNull UseCase useCase) {
            this.f10938b.add(useCase);
            return this;
        }

        @NonNull
        public UseCaseGroup build() {
            Preconditions.checkArgument(!this.f10938b.isEmpty(), "UseCase must not be empty.");
            m63160a();
            return new UseCaseGroup(this.f10937a, this.f10938b, this.f10939c);
        }

        @NonNull
        public Builder setViewPort(@NonNull ViewPort viewPort) {
            this.f10937a = viewPort;
            return this;
        }
    }

    public UseCaseGroup(ViewPort viewPort, List list, List list2) {
        this.f10933a = viewPort;
        this.f10934b = list;
        this.f10935c = list2;
    }

    @NonNull
    public List<CameraEffect> getEffects() {
        return this.f10935c;
    }

    @NonNull
    public List<UseCase> getUseCases() {
        return this.f10934b;
    }

    @Nullable
    public ViewPort getViewPort() {
        return this.f10933a;
    }
}
