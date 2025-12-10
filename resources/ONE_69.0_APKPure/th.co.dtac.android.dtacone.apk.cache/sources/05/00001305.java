package p000;

import androidx.camera.core.UseCase;
import androidx.camera.core.internal.UseCaseEventConfig;

/* renamed from: U02 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class U02 {
    /* renamed from: a */
    public static UseCase.EventCallback m66287a(UseCaseEventConfig useCaseEventConfig) {
        return (UseCase.EventCallback) useCaseEventConfig.retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK);
    }

    /* renamed from: b */
    public static UseCase.EventCallback m66286b(UseCaseEventConfig useCaseEventConfig, UseCase.EventCallback eventCallback) {
        return (UseCase.EventCallback) useCaseEventConfig.retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
    }
}