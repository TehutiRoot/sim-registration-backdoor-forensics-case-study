package th.p047co.dtac.android.dtacone.view.appOne.eSign.model;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/DocumentType;", "", "docType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDocType", "()Ljava/lang/String;", "TELCO", Constant.ConsentDomain.PDPA, Constant.ConsentDomain.TMN, "E_SIGN", "BLACKLIST", OneMnpActivity.OCR_TAG, "FACE_RECOGNITION", "LIVE_NESS", "ADD_PHOTO", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.DocumentType */
/* loaded from: classes10.dex */
public enum DocumentType {
    TELCO("telco"),
    PDPA("pdpa"),
    TMN("tmn"),
    E_SIGN("esign"),
    BLACKLIST("3oper"),
    OCR(OptionalModuleUtils.OCR),
    FACE_RECOGNITION("faceRecognition"),
    LIVE_NESS("liveness"),
    ADD_PHOTO("additionalPhoto");
    
    @NotNull
    private final String docType;

    DocumentType(String str) {
        this.docType = str;
    }

    @NotNull
    public final String getDocType() {
        return this.docType;
    }
}