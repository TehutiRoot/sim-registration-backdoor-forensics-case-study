package androidx.compose.material3.internal;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1 extends Lambda implements Function0<UUID> {
    public static final ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1 INSTANCE = new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1();

    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
