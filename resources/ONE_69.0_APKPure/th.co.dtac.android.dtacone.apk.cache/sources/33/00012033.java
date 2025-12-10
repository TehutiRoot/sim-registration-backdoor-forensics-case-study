package th.p047co.dtac.android.dtacone.model.rectify;

import com.google.gson.annotations.SerializedName;
import th.p047co.dtac.android.dtacone.manager.security.SecurePin;

/* renamed from: th.co.dtac.android.dtacone.model.rectify.RectifyConfirmCollection */
/* loaded from: classes8.dex */
public class RectifyConfirmCollection {
    @SerializedName("amount")
    private int amount;
    @SerializedName("customerNumber")
    private String customerNumber;
    @SerializedName("pin")
    private SecurePin pin;
    @SerializedName("simR")
    private String simR;
    @SerializedName("transactionID")
    private String transactionID;
    @SerializedName("type")
    private String type;
    @SerializedName("ussdServiceCode")
    private String ussdServiceCode;

    public RectifyConfirmCollection() {
    }

    public int getAmount() {
        return this.amount;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public String getPin() {
        return this.pin.getPin();
    }

    public String getSimR() {
        return this.simR;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public String getType() {
        return this.type;
    }

    public String getUssdServiceCode() {
        return this.ussdServiceCode;
    }

    public RectifyConfirmCollection(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        this.type = str;
        this.amount = i;
        this.simR = str2;
        this.transactionID = str3;
        this.customerNumber = str4;
        this.ussdServiceCode = str5;
        this.pin = new SecurePin(str6);
    }
}