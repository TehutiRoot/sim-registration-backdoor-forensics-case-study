package co.omise.android.config;

import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003JC\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006)"}, m28850d2 = {"Lco/omise/android/config/ThemeConfig;", "", "labelCustomization", "Lco/omise/android/config/LabelCustomization;", "toolbarCustomization", "Lco/omise/android/config/ToolbarCustomization;", "textBoxCustomization", "Lco/omise/android/config/TextBoxCustomization;", "buttonCustomizations", "", "Lco/omise/android/config/ButtonType;", "Lco/omise/android/config/ButtonCustomization;", "(Lco/omise/android/config/LabelCustomization;Lco/omise/android/config/ToolbarCustomization;Lco/omise/android/config/TextBoxCustomization;Ljava/util/Map;)V", "getButtonCustomizations", "()Ljava/util/Map;", "setButtonCustomizations", "(Ljava/util/Map;)V", "getLabelCustomization", "()Lco/omise/android/config/LabelCustomization;", "setLabelCustomization", "(Lco/omise/android/config/LabelCustomization;)V", "getTextBoxCustomization", "()Lco/omise/android/config/TextBoxCustomization;", "setTextBoxCustomization", "(Lco/omise/android/config/TextBoxCustomization;)V", "getToolbarCustomization", "()Lco/omise/android/config/ToolbarCustomization;", "setToolbarCustomization", "(Lco/omise/android/config/ToolbarCustomization;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public final class ThemeConfig {
    @NotNull
    private Map<ButtonType, ButtonCustomization> buttonCustomizations;
    @Nullable
    private LabelCustomization labelCustomization;
    @Nullable
    private TextBoxCustomization textBoxCustomization;
    @Nullable
    private ToolbarCustomization toolbarCustomization;

    public ThemeConfig() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeConfig copy$default(ThemeConfig themeConfig, LabelCustomization labelCustomization, ToolbarCustomization toolbarCustomization, TextBoxCustomization textBoxCustomization, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            labelCustomization = themeConfig.labelCustomization;
        }
        if ((i & 2) != 0) {
            toolbarCustomization = themeConfig.toolbarCustomization;
        }
        if ((i & 4) != 0) {
            textBoxCustomization = themeConfig.textBoxCustomization;
        }
        if ((i & 8) != 0) {
            map = themeConfig.buttonCustomizations;
        }
        return themeConfig.copy(labelCustomization, toolbarCustomization, textBoxCustomization, map);
    }

    @Nullable
    public final LabelCustomization component1() {
        return this.labelCustomization;
    }

    @Nullable
    public final ToolbarCustomization component2() {
        return this.toolbarCustomization;
    }

    @Nullable
    public final TextBoxCustomization component3() {
        return this.textBoxCustomization;
    }

    @NotNull
    public final Map<ButtonType, ButtonCustomization> component4() {
        return this.buttonCustomizations;
    }

    @NotNull
    public final ThemeConfig copy(@Nullable LabelCustomization labelCustomization, @Nullable ToolbarCustomization toolbarCustomization, @Nullable TextBoxCustomization textBoxCustomization, @NotNull Map<ButtonType, ButtonCustomization> buttonCustomizations) {
        Intrinsics.checkNotNullParameter(buttonCustomizations, "buttonCustomizations");
        return new ThemeConfig(labelCustomization, toolbarCustomization, textBoxCustomization, buttonCustomizations);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThemeConfig) {
            ThemeConfig themeConfig = (ThemeConfig) obj;
            return Intrinsics.areEqual(this.labelCustomization, themeConfig.labelCustomization) && Intrinsics.areEqual(this.toolbarCustomization, themeConfig.toolbarCustomization) && Intrinsics.areEqual(this.textBoxCustomization, themeConfig.textBoxCustomization) && Intrinsics.areEqual(this.buttonCustomizations, themeConfig.buttonCustomizations);
        }
        return false;
    }

    @NotNull
    public final Map<ButtonType, ButtonCustomization> getButtonCustomizations() {
        return this.buttonCustomizations;
    }

    @Nullable
    public final LabelCustomization getLabelCustomization() {
        return this.labelCustomization;
    }

    @Nullable
    public final TextBoxCustomization getTextBoxCustomization() {
        return this.textBoxCustomization;
    }

    @Nullable
    public final ToolbarCustomization getToolbarCustomization() {
        return this.toolbarCustomization;
    }

    public int hashCode() {
        LabelCustomization labelCustomization = this.labelCustomization;
        int hashCode = (labelCustomization == null ? 0 : labelCustomization.hashCode()) * 31;
        ToolbarCustomization toolbarCustomization = this.toolbarCustomization;
        int hashCode2 = (hashCode + (toolbarCustomization == null ? 0 : toolbarCustomization.hashCode())) * 31;
        TextBoxCustomization textBoxCustomization = this.textBoxCustomization;
        return ((hashCode2 + (textBoxCustomization != null ? textBoxCustomization.hashCode() : 0)) * 31) + this.buttonCustomizations.hashCode();
    }

    public final void setButtonCustomizations(@NotNull Map<ButtonType, ButtonCustomization> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.buttonCustomizations = map;
    }

    public final void setLabelCustomization(@Nullable LabelCustomization labelCustomization) {
        this.labelCustomization = labelCustomization;
    }

    public final void setTextBoxCustomization(@Nullable TextBoxCustomization textBoxCustomization) {
        this.textBoxCustomization = textBoxCustomization;
    }

    public final void setToolbarCustomization(@Nullable ToolbarCustomization toolbarCustomization) {
        this.toolbarCustomization = toolbarCustomization;
    }

    @NotNull
    public String toString() {
        return "ThemeConfig(labelCustomization=" + this.labelCustomization + ", toolbarCustomization=" + this.toolbarCustomization + ", textBoxCustomization=" + this.textBoxCustomization + ", buttonCustomizations=" + this.buttonCustomizations + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ThemeConfig(@Nullable LabelCustomization labelCustomization, @Nullable ToolbarCustomization toolbarCustomization, @Nullable TextBoxCustomization textBoxCustomization, @NotNull Map<ButtonType, ButtonCustomization> buttonCustomizations) {
        Intrinsics.checkNotNullParameter(buttonCustomizations, "buttonCustomizations");
        this.labelCustomization = labelCustomization;
        this.toolbarCustomization = toolbarCustomization;
        this.textBoxCustomization = textBoxCustomization;
        this.buttonCustomizations = buttonCustomizations;
    }

    public /* synthetic */ ThemeConfig(LabelCustomization labelCustomization, ToolbarCustomization toolbarCustomization, TextBoxCustomization textBoxCustomization, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : labelCustomization, (i & 2) != 0 ? null : toolbarCustomization, (i & 4) != 0 ? null : textBoxCustomization, (i & 8) != 0 ? new LinkedHashMap() : map);
    }
}
