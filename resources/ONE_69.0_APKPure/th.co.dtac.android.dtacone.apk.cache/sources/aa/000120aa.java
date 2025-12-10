package th.p047co.dtac.android.dtacone.model.stv;

import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.manager.security.SecurePin;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

/* renamed from: th.co.dtac.android.dtacone.model.stv.StvSubmitCollection */
/* loaded from: classes8.dex */
public class StvSubmitCollection {
    @SerializedName("commissionValue")
    private float commissionValue;
    @SerializedName("confirmMultiTrans")
    private String confirmMultiTrans;
    @SerializedName("offer")
    private StvOffer offer;
    @SerializedName("packageCode")
    private String packageCode;
    @SerializedName("pin")
    private SecurePin pin;
    @SerializedName("subscriberGroup")
    private String subscriberGroup;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    private String subscriberNumber;
    @SerializedName("ussdServiceCode")
    private String ussdServiceCode;

    public StvSubmitCollection(String str, String str2, String str3, String str4, StvOffer stvOffer, float f, String str5, String str6) {
        this.packageCode = str;
        this.ussdServiceCode = str2;
        this.subscriberNumber = str3;
        this.pin = new SecurePin(str4);
        this.offer = stvOffer;
        this.commissionValue = f;
        this.confirmMultiTrans = str5;
        this.subscriberGroup = str6;
    }

    public float getCommissionValue() {
        return this.commissionValue;
    }

    public String getConfirmMultiTrans() {
        return this.confirmMultiTrans;
    }

    public StvOffer getOffer() {
        return this.offer;
    }

    public String getPackageCode() {
        return this.packageCode;
    }

    public String getPin() {
        return this.pin.getPin();
    }

    public SecurePin getSecurePin() {
        return this.pin;
    }

    public String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public String getUssdServiceCode() {
        return this.ussdServiceCode;
    }

    public void setConfirmMultiTrans(String str) {
        this.confirmMultiTrans = str;
    }
}