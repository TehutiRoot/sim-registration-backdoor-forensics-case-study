package co.omise.android.config;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28850d2 = {"Lco/omise/android/config/ButtonType;", "", "value", "Lcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization$ButtonType;", "(Ljava/lang/String;ILcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization$ButtonType;)V", "getValue", "()Lcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization$ButtonType;", "SUBMIT", "CONTINUE", "NEXT", "CANCEL", "RESEND", "OPEN_OOB_APP", "ADD_CH", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public enum ButtonType {
    SUBMIT(UiCustomization.ButtonType.SUBMIT),
    CONTINUE(UiCustomization.ButtonType.CONTINUE),
    NEXT(UiCustomization.ButtonType.NEXT),
    CANCEL(UiCustomization.ButtonType.CANCEL),
    RESEND(UiCustomization.ButtonType.RESEND),
    OPEN_OOB_APP(UiCustomization.ButtonType.OPEN_OOB_APP),
    ADD_CH(UiCustomization.ButtonType.ADD_CH);
    
    @NotNull
    private final UiCustomization.ButtonType value;

    ButtonType(UiCustomization.ButtonType buttonType) {
        this.value = buttonType;
    }

    @NotNull
    public final UiCustomization.ButtonType getValue() {
        return this.value;
    }
}
