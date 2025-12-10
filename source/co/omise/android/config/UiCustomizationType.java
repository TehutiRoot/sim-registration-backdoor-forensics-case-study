package co.omise.android.config;

import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28850d2 = {"Lco/omise/android/config/UiCustomizationType;", "", "value", "Lcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization$UiCustomizationType;", "(Ljava/lang/String;ILcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization$UiCustomizationType;)V", "getValue", "()Lcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization$UiCustomizationType;", "DEFAULT", "DARK", "MONOCHROME", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public enum UiCustomizationType {
    DEFAULT(UiCustomization.UiCustomizationType.DEFAULT),
    DARK(UiCustomization.UiCustomizationType.DARK),
    MONOCHROME(UiCustomization.UiCustomizationType.MONOCHROME);
    
    @NotNull
    private final UiCustomization.UiCustomizationType value;

    UiCustomizationType(UiCustomization.UiCustomizationType uiCustomizationType) {
        this.value = uiCustomizationType;
    }

    @NotNull
    public final UiCustomization.UiCustomizationType getValue() {
        return this.value;
    }
}
