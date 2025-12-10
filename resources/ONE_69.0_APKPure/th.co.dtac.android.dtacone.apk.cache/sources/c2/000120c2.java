package th.p047co.dtac.android.dtacone.model.topup;

import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.manager.security.SecurePin;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

/* renamed from: th.co.dtac.android.dtacone.model.topup.TopUpCollection */
/* loaded from: classes8.dex */
public class TopUpCollection {
    @SerializedName("amount")
    private double amount;
    @SerializedName("offer")
    private Offer offer;
    @SerializedName("pin")
    private SecurePin pin;
    @SerializedName("requesterApplication")
    private String requesterApplication;
    @SerializedName("requesterChannel")
    private String requesterChannel;
    @SerializedName("requesterId")
    private String requesterId;
    @SerializedName("requesterZone")
    private String requesterZone;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    private String subscriberNumber;
    @SerializedName("togglePrepaidEnable")
    private String togglePrepaidEnable;
    @SerializedName("userCode")
    private String userCode;

    /* renamed from: th.co.dtac.android.dtacone.model.topup.TopUpCollection$Offer */
    /* loaded from: classes8.dex */
    public static class Offer {
        @SerializedName("campaignID")
        private String campaignID;
        @SerializedName("flowId")
        private String flowId;
        @SerializedName("offerPOID")
        private String offerPOID;
        @SerializedName("offerType")
        private String offerType;
        @SerializedName("requesterLocation")
        private String requesterLocation;
        @SerializedName("transactionId")
        private String transactionId;

        public Offer(String str, String str2, String str3, String str4, String str5, String str6) {
            this.offerType = str;
            this.transactionId = str2;
            this.flowId = str3;
            this.campaignID = str4;
            this.offerPOID = str5;
            this.requesterLocation = str6;
        }

        public String getOfferType() {
            return this.offerType;
        }
    }

    public TopUpCollection(String str, double d, String str2, Offer offer, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.subscriberNumber = str;
        this.amount = d;
        this.pin = new SecurePin(str2);
        this.offer = offer;
        this.requesterApplication = str3;
        this.requesterZone = str4;
        this.requesterChannel = str5;
        this.requesterId = str6;
        this.togglePrepaidEnable = str7;
        this.userCode = str8;
    }

    public double getAmount() {
        return this.amount;
    }

    public Offer getOffer() {
        return this.offer;
    }

    public String getPin() {
        return this.pin.getPin();
    }

    public String getRequesterApplication() {
        return this.requesterApplication;
    }

    public String getRequesterChannel() {
        return this.requesterChannel;
    }

    public String getRequesterId() {
        return this.requesterId;
    }

    public String getRequesterZone() {
        return this.requesterZone;
    }

    public String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public String getTogglePrepaidEnable() {
        return this.togglePrepaidEnable;
    }

    public String getUserCode() {
        return this.userCode;
    }
}