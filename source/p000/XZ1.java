package p000;

import androidx.camera.core.UseCase;
import androidx.camera.core.internal.UseCaseEventConfig;

/* renamed from: XZ1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class XZ1 {
    /* renamed from: a */
    public static UseCase.EventCallback m65481a(UseCaseEventConfig useCaseEventConfig) {
        return (UseCase.EventCallback) useCaseEventConfig.retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK);
    }

    /* renamed from: b */
    public static UseCase.EventCallback m65480b(UseCaseEventConfig useCaseEventConfig, UseCase.EventCallback eventCallback) {
        return (UseCase.EventCallback) useCaseEventConfig.retrieveOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
    }
}
