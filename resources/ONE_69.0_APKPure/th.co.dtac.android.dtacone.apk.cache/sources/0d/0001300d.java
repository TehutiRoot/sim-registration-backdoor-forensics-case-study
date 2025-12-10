package th.p047co.dtac.android.dtacone.view.appOne.eSign.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/ImageDocumentType;", "", "icon", "", MessageBundle.TITLE_ENTRY, "fileName", "", "(Ljava/lang/String;IIILjava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getIcon", "()I", "getTitle", "ID_CARD", "FACE", "ID_CARD_ATTORNEY", "FACE_ATTORNEY", "DOCUMENT", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.ImageDocumentType */
/* loaded from: classes10.dex */
public enum ImageDocumentType {
    ID_CARD(R.drawable.ic_id_card_40, R.string.one_unify_id_card_menu, BitmapUtil.IMAGE_ID_CARD),
    FACE(R.drawable.ic_face_40, R.string.one_unify_face_menu, BitmapUtil.IMAGE_COMPARE),
    ID_CARD_ATTORNEY(R.drawable.ic_id_card_40, R.string.one_unify_id_card_attorney_menu, BitmapUtil.IMAGE_ATTORNEY_ID_CARD),
    FACE_ATTORNEY(R.drawable.ic_face_40, R.string.one_unify_face_attorney_menu, BitmapUtil.IMAGE_COMPARE),
    DOCUMENT(R.drawable.ic_doc_40, R.string.one_unify_doc_menu, null, 4, null);
    
    @NotNull
    private final String fileName;
    private final int icon;
    private final int title;

    ImageDocumentType(@DrawableRes int i, @StringRes int i2, String str) {
        this.icon = i;
        this.title = i2;
        this.fileName = str;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getTitle() {
        return this.title;
    }

    /* synthetic */ ImageDocumentType(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? "" : str);
    }
}